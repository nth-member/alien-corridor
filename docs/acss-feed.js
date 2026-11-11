/* The FEED window's engine side: an agent or a function of the engine, read at any TNLDY.

   feed.html, the window a FEED button opens, runs its own copy of the engine (acss-engine.js, in SCI), so
   the agent or function it feeds can be evaluated with the engine's clock at any TNLDY -- past, present
   or future -- without touching the page that opened it. Loaded before scittle, this file gives the
   window a Date whose reading can be set for the length of one evaluation; at every other moment it is
   the device clock.

     the engine's clock   every agent is (agent (... (+ C (. (new Date) getTime)) ...)), C the edition's
                          live-clock constant (data/clock-<tree>.json). At TNLDY Z, (new Date) reads the
                          millisecond m at which (C + m) / 86 400 000 = Z: the engine's clock reads Z
     its wall clock       clj-time's now and local-now (Date.now) read Z's instant on the Nsukka/Yg clock

   An agent read at Z: its own top-level forms -- (def NAME (agent ...)) and each (send NAME ...) -- are
   evaluated again, in source order, with the clock at Z. Agents are the only things the engine seals
   when it loads, so this is the value a load at that instant would seal (tools/feed-check.js verifies it
   for every agent of both editions). A function read at Z: every agent sealed by its namespace and by the
   namespaces it requires is read at Z first, then the call is evaluated with the clock at Z.

   The TNLDY a call sends the feed to (tnldyOf), by the engine's own conventions:
     argument   the first parameter is Z (every *...-by-tnldy* function and its kin): that argument's value
     value      a *tnldy-by-...* function: the number it returns, or the first element of its vector
     clock      a call whose value moves with the clock (every agent, the *...current-by-z-tnldy-clock3*
                functions, ...): the clock, the present unless it is set elsewhere
     date       otherwise, the TNLDY of the first date the call writes (clj-time.coerce/from-long)
   A call that names none of these names no TNLDY; its feed follows the present.

   Loads as a plain script (window.ACSSFeed) or through require(). */
(function (root) {
  "use strict";
  const DAY = 86400000;
  const RealDate = root.Date;
  let engineAt = null, wallAt = null;
  class EngineDate extends RealDate {
    constructor(...a) { if (a.length === 0 && engineAt != null) super(engineAt); else super(...a); }
    static now() { return wallAt != null ? wallAt : RealDate.now(); }
  }
  root.Date = EngineDate;

  const Yg = () => root.NsukkaYg;
  const zNow = () => Yg().zOf(RealDate.now()).z;
  /* TNLDY z as a plain decimal, for exact arithmetic downstream (nsukka-yg-clock.js, stamp.js). */
  function zText(z) { const s = Number(z).toFixed(9).replace(/0+$/, "").replace(/\.$/, ""); return s === "-0" ? "0" : s; }
  /* The instants at which the Nsukka/Yg clock reads z: [] when z is passed over at a recalibration. */
  function instants(z) {
    if (!Number.isFinite(z) || Math.abs(z) > 9e7) return null;          // beyond the range of a Date
    try { return Yg().instantsOf(zText(z)); } catch (e) { return null; }
  }

  /* The engine's clock at z: the millisecond at which it reads z, and z's instant on the Nsukka/Yg clock. */
  function readings(z, C) {
    const at = instants(z), engine = Math.round(z * DAY - C);
    return { engine, wall: at && at.length ? at[0] : engine };
  }
  function atClock(z, C, f) {
    const r = readings(z, C), pe = engineAt, pw = wallAt;
    engineAt = r.engine; wallAt = r.wall;
    try { return f(); } finally { engineAt = pe; wallAt = pw; }
  }

  const reEsc = s => s.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
  const DEF_AGENT = /^\((?:def|defonce)\s+(\S+)\s+\(agent[\s(]/;
  const SEND = /^\(send(?:-off)?\s+(\S+)\s/;
  /* An agent's own top-level forms: its def and its sends, in source order. */
  function agentForms(src, name) {
    const def = new RegExp("^\\((?:def|defonce)\\s+" + reEsc(name) + "\\s+\\(agent[\\s(]");
    const snd = new RegExp("^\\(send(?:-off)?\\s+" + reEsc(name) + "\\s");
    return root.ACSS.forms(src).map(f => f.text).filter(t => def.test(t) || snd.test(t));
  }
  /* Every top-level form of a source that seals or sends to an agent, in source order. */
  function sealForms(src) {
    const names = new Set(), out = [];
    for (const f of root.ACSS.forms(src)) {
      const m = f.text.match(DEF_AGENT);
      if (m) { names.add(m[1]); out.push(f.text); continue; }
      const s = f.text.match(SEND);
      if (s) out.push(f.text);
    }
    return { names, forms: out };
  }
  /* A function's parameters, as its source declares them: (def NAME (fn [..] ..)) or (defn NAME [..] ..). */
  function paramsOf(src, name) {
    const re = new RegExp("^\\((?:def|defn)\\s+" + reEsc(name) + "\\s+(?:\\(fn\\s*)?\\[([^\\]]*)\\]");
    for (const f of root.ACSS.forms(src)) { const m = f.text.match(re); if (m) return m[1].trim().split(/\s+/).filter(Boolean); }
    return null;
  }

  /* The author's own top-level calls of a function in its module's source, (NAME args ...) and
     (println (NAME args ...)), each as { line, printed, args: [the argument texts] }. */
  function callsOf(src, name) {
    const re = new RegExp("^\\((?:(println|print|prn|pr)\\s+\\()?\\s*" + reEsc(name) + "[\\s)]"), out = [];
    for (const f of root.ACSS.forms(src)) {
      const m = f.text.match(re);
      if (!m) continue;
      const inner = f.text.slice(f.text.indexOf(name) + name.length).replace(m[1] ? /\)\s*\)\s*$/ : /\)\s*$/, "");
      out.push({ line: f.line, printed: !!m[1], args: root.ACSS.forms(inner).map(x => x.text) });
    }
    return out;
  }

  /* Which TNLDY a function names, by its name and parameters alone: "argument", "value", "clock" or null
     (decided by the call: the clock if its value moves with it, else the first date it writes). */
  function tnldyRule(name, params) {
    const n = name.replace(/^\*|\*$/g, "");
    if (params && params.length && /^(z|.*tnldy)$/i.test(params[0])) return "argument";
    if (!params && /by-(z-)?tnldy|expects-tnldy|tnldy-value-as-input/.test(n)) return "argument";
    if (/^(jd-)?(z-|t)?tnldy-by-/.test(n)) return "value";
    if (/current/.test(n)) return "clock";
    return null;
  }
  /* The number a printed value begins with: 16680, or the first element of [16680 #object[...] ...]. */
  function firstNumber(s) {
    if (s == null) return null;
    let t = String(s).trim();
    if (t[0] === "[" || t[0] === "(") t = t.slice(1).trim();
    const m = t.match(/^-?\d+(?:\.\d+)?(?:[eE][+-]?\d+)?(?=[\s,\])]|$)/);
    return m ? Number(m[0]) : null;
  }
  const sameValue = (a, b) => a && b && a.ok === b.ok &&
    String(a.value || a.error || "").replace(/ 0x[0-9a-f]+ /g, " 0x ") === String(b.value || b.error || "").replace(/ 0x[0-9a-f]+ /g, " 0x ") &&
    String(a.out || "").replace(/ 0x[0-9a-f]+ /g, " 0x ") === String(b.out || "").replace(/ 0x[0-9a-f]+ /g, " 0x ");

  /* One engine, one namespace: o = { ns, source(ns) -> text (every source of the closure at hand),
     isEngineNs(ns), constant: the edition's live-clock constant (ms), origin: its from-long origin (ms),
     engine: an ACSS.Engine to share (optional) }. */
  function Session(o) {
    const sc = o.scittle || root.scittle.core;
    const E = o.engine || root.ACSS.Engine({ isEngineNs: o.isEngineNs, source: o.source });
    const C = Number(o.constant), ORIGIN = Number(o.origin);
    let dates = null;
    api.noteDate = ms => { if (dates) dates.push(Number(ms)); };
    sc.eval_string('(ns clj-time.coerce)\n(defn from-long [ms] (js/ACSSFeed.noteDate ms) (clojure.core/acss-date-time ms "tnldy"))\n(in-ns \'user)');

    // the namespaces a load of o.ns loads, in the order it loads them (required ones first)
    const REQ = /^\(require\s+'([A-Za-z0-9.\-]+)\s*:reload\)$/;
    const order = [];
    (function visit(ns, stack) {
      if (order.includes(ns) || stack.includes(ns)) return;
      const src = o.source(ns); if (src == null) return;
      for (const f of root.ACSS.forms(src)) { const m = f.text.match(REQ); if (m && o.isEngineNs(m[1])) visit(m[1], stack.concat(ns)); }
      order.push(ns);
    })(o.ns, []);
    const seals = order.map(ns => [ns, sealForms(o.source(ns)).forms]).filter(([, f]) => f.length);
    const nAgents = order.reduce((n, ns) => n + sealForms(o.source(ns)).names.size, 0);

    function evalForms(ns, forms) {
      try { sc.eval_string("(in-ns '" + ns + ")\n" + forms.join("\n") + "\nnil"); }
      catch (e) { for (const t of forms) { try { sc.eval_string("(in-ns '" + ns + ")\n" + t); } catch (e2) { /* as a load would: the next form still runs */ } } }
    }
    const engineReads = z => (C + readings(z, C).engine) / DAY;

    return {
      ns: o.ns, order, nAgents, engineReads, E,
      load() { return E.load(o.ns); },
      vars() { return E.vars(o.ns); },
      params(name) { return paramsOf(o.source(o.ns), name); },
      /* Every agent of the closure sealed at z. */
      seal(z) { atClock(z, C, () => { for (const [ns, forms] of seals) evalForms(ns, forms); }); },
      /* An agent read at z: { ok, value, engine } (engine = what the engine's clock reads at z). */
      agentAt(name, z) {
        const forms = agentForms(o.source(o.ns), name);
        atClock(z, C, () => evalForms(o.ns, forms));
        return { ...E.eval(o.ns, "(deref " + o.ns + "/" + name + ")"), engine: engineReads(z) };
      },
      /* A call read at z: { ok, value | error, out, args: [printed argument values], dates: [Z of each date written] }. */
      callAt(name, args, z) {
        this.seal(z);
        dates = [];
        try {
          const r = atClock(z, C, () => E.invoke(o.ns, name, args));
          const argv = atClock(z, C, () => args.map(a => E.eval(o.ns, a)));
          return { ...r, args: argv, dates: dates.map(ms => (ms - ORIGIN) / DAY), engine: engineReads(z) };
        } finally { dates = null; }
      },
      /* Does the call's value move with the clock? Read at the present and 1.2345 days on. */
      movesWithClock(name, args, z) { return !sameValue(this.callAt(name, args, z), this.callAt(name, args, z + 1.2345)); },
      /* The TNLDY a call names: { z, from } (from: "argument" | "value" | "clock" | "date" | null). */
      tnldyOf(name, rule, call, moves, zClock) {
        if (rule === "argument") { const z = call.args && call.args[0] && call.args[0].ok ? firstNumber(call.args[0].value) : null; return { z, from: "argument" }; }
        if (rule === "value") return { z: call.ok ? firstNumber(call.value) : null, from: "value" };
        if (rule === "clock" || moves) return { z: zClock, from: "clock" };
        if (call.dates && call.dates.length) return { z: call.dates[0], from: "date" };
        return { z: null, from: null };
      },
    };
  }

  /* Where a window [a, b] (epoch ms) stands against the present. */
  function regime(a, b, now) { return a > now ? "future" : b < now ? "past" : "present"; }

  const api = { RealDate, DAY, zNow, zText, instants, readings, atClock, agentForms, sealForms, paramsOf, callsOf, tnldyRule,
                firstNumber, sameValue, Session, regime, noteDate() {} };
  root.ACSSFeed = api;
  if (typeof module === "object" && module && module.exports) module.exports = api;
})(typeof globalThis !== "undefined" ? globalThis : this);
