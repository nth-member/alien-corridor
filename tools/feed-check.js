// Check the FEED window's engine side (docs/acss-feed.js) against the engine itself, for one edition.
//   node tools/feed-check.js primary|bank
//
// 1. Agents. Each module is loaded with the engine's clock at TNLDY Z (a past, the present and a future
//    Z), and every agent's sealed value recorded. The module is then loaded at another instant and each
//    agent read at Z again from its own forms (ACSSFeed.Session.agentAt): the two must print alike.
// 2. Functions. Every function is called once per arity with the reference arguments (tools/capture_jvm.py),
//    and the TNLDY it names is taken by acss-feed.js's rules. Where the call also writes a date, the
//    date's TNLDY must be that one: the TNLDY the window is tied to is the one the engine itself dates.
// Writes tools/reference/feed_<tree>.json and prints a summary.
const vm = require("vm"), fs = require("fs"), path = require("path");
const tree = process.argv[2];
const DOCS = path.join(__dirname, "..", "docs");
global.window = globalThis; global.self = globalThis;
global.document = { addEventListener() {}, querySelectorAll() { return []; }, readyState: "complete", currentScript: null, getElementsByTagName() { return []; } };
vm.runInThisContext(fs.readFileSync(path.join(DOCS, "acss-feed.js"), "utf8"));        // first: the settable clock
vm.runInThisContext(fs.readFileSync(path.join(DOCS, "scittle-0.8.33.js"), "utf8"));
vm.runInThisContext(fs.readFileSync(path.join(DOCS, "nsukka-yg-clock.js"), "utf8"));
vm.runInThisContext(fs.readFileSync(path.join(DOCS, "acss-engine.js"), "utf8"));
const F = ACSSFeed;

const CLOCK = JSON.parse(fs.readFileSync(path.join(DOCS, "data", `clock-${tree}.json`), "utf8"));
ACSS.fromLongOrigin = CLOCK.from_long_origin_ms;
const CONSTANT = Object.keys(CLOCK.live_clock_constants_ms)[0];
const LIST = JSON.parse(fs.readFileSync(path.join(DOCS, "data", `namespaces-${tree}.json`), "utf8"));
const NSSET = new Set(LIST.map(n => n.ns));
const SRC = Object.fromEntries(LIST.map(n => [n.ns, fs.readFileSync(path.join(DOCS, "engine", tree, n.path), "utf8")]));
const ARITIES = JSON.parse(fs.readFileSync(path.join(DOCS, "data", `arities-${tree}.json`), "utf8"));
const ARGS = ["24.5", "7", "3", "2", "1", "0.5"];
const H = s => String(s == null ? "" : s).replace(/ 0x[0-9a-f]+ /g, " 0x ");

const E = ACSS.Engine({ isEngineNs: ns => NSSET.has(ns), source: ns => (ns in SRC ? SRC[ns] : null) });
const session = ns => F.Session({ ns, engine: E, isEngineNs: ns => NSSET.has(ns), source: ns => (ns in SRC ? SRC[ns] : null),
                                  constant: CONSTANT, origin: CLOCK.from_long_origin_ms });
const C = Number(CONSTANT);
const ZS = { past: 14160.0, present: Math.round(F.zNow() * 1e6) / 1e6, future: 25000.123456 };

const report = { tree, agents: { checked: 0, same: 0, differ: [] }, functions: { calls: 0, from: {}, dated: 0, datedAgree: 0, disagree: [], none: [], date: [], clock: [] } };
const t0 = Date.now();

// 1. agents
for (const { ns } of LIST) {
  const names = [...F.sealForms(SRC[ns]).names];
  if (!names.length) continue;
  const S = session(ns);
  for (const [label, z] of Object.entries(ZS)) {
    const ld = F.atClock(z, C, () => E.load(ns));                     // a load with the clock at z
    if (!ld.ok) { report.agents.differ.push({ ns, label, why: "load failed: " + ld.error }); continue; }
    const sealed = Object.fromEntries(E.vars(ns).filter(v => v[1] === "agent").map(v => [v[0], v[2]]));
    F.atClock(z + 3.75, C, () => E.load(ns));                         // ... and at another instant
    for (const name of names) {
      if (!(name in sealed)) continue;
      report.agents.checked++;
      const r = S.agentAt(name, z);
      if (r.ok && H(r.value) === H(sealed[name])) report.agents.same++;
      else report.agents.differ.push({ ns, name, label, load: sealed[name], agentAt: r.value || r.error });
    }
  }
}
process.stderr.write(`agents: ${report.agents.same}/${report.agents.checked} the same (${Date.now() - t0} ms)\n`);

// 2. functions
for (const { ns } of LIST) {
  const fns = ARITIES[ns] || {};
  if (!Object.keys(fns).length) continue;
  const ld = E.load(ns);
  if (!ld.ok) continue;
  const S = session(ns);
  for (const [name, arities] of Object.entries(fns)) {
    for (const a of arities) {
      if (typeof a !== "number" || a > ARGS.length) continue;
      report.functions.calls++;
      const args = ARGS.slice(0, a), z = ZS.present;
      const params = S.params(name), rule = F.tnldyRule(name, params);
      const call = S.callAt(name, args, z);
      const moves = rule === "clock" ? true : S.movesWithClock(name, args, z);
      const t = S.tnldyOf(name, rule, call, moves, z);
      const key = t.from || "none";
      report.functions.from[key] = (report.functions.from[key] || 0) + 1;
      const item = { ns: ns.split(".").pop(), fn: name, args, z: t.z, ok: call.ok };
      if (key === "none") report.functions.none.push(item);
      if (key === "date") report.functions.date.push(item);
      if (key === "clock" && call.ok) report.functions.clock.push(item);
      if (call.dates.length && t.z != null && (key === "argument" || key === "value")) {
        report.functions.dated++;
        if (Math.abs(call.dates[0] - t.z) <= 2 / F.DAY) report.functions.datedAgree++;   // from-long truncates to the ms
        else report.functions.disagree.push({ ...item, date: call.dates[0] });
      }
    }
  }
}
const fr = report.functions;
process.stderr.write(`functions: ${fr.calls} calls · ${JSON.stringify(fr.from)} · dated ${fr.datedAgree}/${fr.dated} agree (${Date.now() - t0} ms)\n`);
fs.writeFileSync(path.join(__dirname, "reference", `feed_${tree}.json`), JSON.stringify(report, null, 1));
if (report.agents.differ.length || fr.disagree.length) process.exitCode = 1;
