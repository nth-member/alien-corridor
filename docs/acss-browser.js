/* The Alien Corridor Support System's API, answered inside the browser.

   The GUI (index.html) is the original one. It talks to /api/* with fetch, as it
   did to the JVM server. Here those requests never leave the page: this file
   answers them from acss-engine.js, which runs the engine's unmodified source in
   SCI. Every endpoint returns the fields the JVM server returned, in its shape.

     GET  /api/meta /api/namespaces /api/vars /api/source /api/history /api/clock
     POST /api/load /api/invoke /api/deref /api/eval

   ?tree=bank selects the Shulammite bank edition; the default is the primary.
*/
(function () {
  "use strict";
  const TREE = new URLSearchParams(location.search).get("tree") === "bank" ? "bank" : "primary";
  const BASE = "engine/" + TREE + "/";
  const netFetch = window.fetch.bind(window);
  const sc = window.scittle.core;
  const SRC = {};                 // ns -> source text
  const loaded = {};              // ns -> {ms, at}
  let NSLIST = [], NSSET = new Set(), ARITIES = {}, E = null, HISTORY = null;
  const session = [];

  const REQ = /\(require\s+'([A-Za-z0-9.\-]+)\s*:reload\)/g;
  const json = (o, status) => new Response(JSON.stringify(o), { status: status || 200, headers: { "Content-Type": "application/json" } });
  const trunc = (s, n) => (s != null && s.length > n ? s.slice(0, n) + " …[truncated]" : s);
  const edn = body => {           // the GUI sends small EDN maps: {:ns "…" :name "…" :args ["…"]} / {:code "…"}
    const str = k => { const m = body.match(new RegExp(":" + k + "\\s+(\"(?:[^\"\\\\]|\\\\.)*\")")); return m ? JSON.parse(m[1]) : null; };
    const am = body.match(/:args\s+\[([\s\S]*)\]\s*\}\s*$/);
    const args = am ? (am[1].match(/"(?:[^"\\]|\\.)*"/g) || []).map(s => JSON.parse(s)) : [];
    return { ns: str("ns"), name: str("name"), code: str("code"), args };
  };
  const yieldToPaint = () => new Promise(r => setTimeout(r, 30));

  const ready = (async () => {
    NSLIST = await (await netFetch("data/namespaces-" + TREE + ".json")).json();
    NSSET = new Set(NSLIST.map(n => n.ns));
    ARITIES = await (await netFetch("data/arities-" + TREE + ".json")).json();
    try { const h = await netFetch("data/history-" + TREE + ".json"); if (h.ok) HISTORY = await h.json(); } catch (e) { /* not published */ }
    E = window.ACSS.Engine({ isEngineNs: ns => NSSET.has(ns), source: ns => (ns in SRC ? SRC[ns] : null) });
    sc.eval_string("(ns acss.console)");
  })();

  async function source(ns) {
    if (!(ns in SRC)) {
      const n = NSLIST.find(x => x.ns === ns);
      if (!n) return null;
      SRC[ns] = await (await netFetch(BASE + n.path)).text();
    }
    return SRC[ns];
  }
  // A load is synchronous once every source it will require is at hand.
  async function closure(ns, seen = new Set()) {
    if (seen.has(ns)) return; seen.add(ns);
    const s = await source(ns); if (s == null) return;
    for (const m of s.matchAll(REQ)) if (NSSET.has(m[1])) await closure(m[1], seen);
  }
  const clean = r => { if (r && r.error) r.error = r.error.replace(/^Error: /, ""); return r; };

  const API = {
    async meta() {
      return { app: "Alien Corridor Support System", tree: TREE, port: "— (in your browser)",
               otherPort: null, twinUrl: "?tree=" + (TREE === "bank" ? "primary" : "bank"),
               srcRoot: BASE + " (unmodified, run by SCI in this page)", namespaceCount: NSLIST.length,
               loadedCount: Object.keys(loaded).length, clojureVersion: "SCI via scittle 0.8.33",
               javaVersion: "none — no JVM, no server" };
    },
    async namespaces() { return { namespaces: NSLIST.map(n => ({ ...n, loaded: !!loaded[n.ns] })) }; },
    async source(q) {
      const s = await source(q.get("ns"));
      return s == null ? { error: "no source file for " + q.get("ns") } : { ns: q.get("ns"), source: s };
    },
    async history() { return { author: HISTORY || [], session: session.slice() }; },
    async vars(q) {
      const ns = q.get("ns");
      if (!loaded[ns]) return { error: ns + " is not loaded yet" };
      const ar = ARITIES[ns] || {};
      return { ns, vars: E.vars(ns).map(([name, kind, pv]) => {
        const v = { name, kind };
        if (kind === "fn") v.arities = ar[name] || [];
        else v.preview = trunc(pv, 300);
        return v; }) };
    },
    async load(b) {
      const { ns } = edn(b);
      await closure(ns); await yieldToPaint();
      const r = clean(E.load(ns));
      if (r.ok) {
        const at = new Date().toString();
        loaded[ns] = { ms: r.ms, at };
        // a load reloads what it requires, as on the JVM: they are loaded too
        for (const m of (SRC[ns] || "").matchAll(REQ)) if (NSSET.has(m[1])) loaded[m[1]] = loaded[m[1]] || { ms: 0, at };
      }
      return { ok: r.ok, out: r.out, ms: r.ms, ns, ...(r.ok ? {} : { error: r.error }) };
    },
    async invoke(b) {
      const { ns, name, args } = edn(b);
      if (!loaded[ns]) return { ok: false, error: ns + " is not loaded" };
      await yieldToPaint();
      const t0 = Date.now(), r = clean(E.invoke(ns, name, args));
      return { ...r, value: trunc(r.value, 2000000), ms: Date.now() - t0 };
    },
    async deref(b) {
      const { ns, name } = edn(b);
      if (!loaded[ns]) return { ok: false, error: name + " not found in " + ns + " (is it loaded?)" };
      const t0 = Date.now(), r = clean(E.eval(ns, "(deref " + ns + "/" + name + ")"));
      return { ...r, value: trunc(r.value, 2000000), ms: Date.now() - t0 };
    },
    async eval(b) {
      const { code } = edn(b);
      session.push(code);
      // form by form in acss.console, as the JVM's reader loop does; the last value is returned
      const fs = window.ACSS.forms(code);
      let r = { ok: true, value: "nil", out: "" }, out = "";
      const t0 = Date.now();
      for (let i = 0; i < fs.length; i++) {
        r = clean(E.eval("acss.console", i === fs.length - 1 ? fs[i].text : "(do " + fs[i].text + " nil)"));
        out += r.out || "";
        if (!r.ok) break;
      }
      return { ...r, out, value: trunc(r.value, 2000000), ms: Date.now() - t0 };
    },
    async clock() {
      let v = null;
      try { if (loaded["org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d"])
              v = sc.eval_string("(deref org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d/z-tnldy-clock3)"); } catch (e) { v = null; }
      return { loaded: typeof v === "number", tnldy: typeof v === "number" ? v : null, now: Date.now() };
    },
  };

  window.fetch = async function (input, init) {
    const url = typeof input === "string" ? input : input.url;
    const m = url.match(/^\/api\/([a-z]+)(\?.*)?$/);
    if (!m || !API[m[1]]) return netFetch(input, init);
    await ready;
    try {
      const q = new URLSearchParams(m[2] || "");
      return json(await (init && init.method === "POST" ? API[m[1]](init.body || "") : API[m[1]](q)));
    } catch (e) {
      return json({ ok: false, error: String((e && e.message) || e).replace(/^Error: /, "") });
    }
  };
})();
