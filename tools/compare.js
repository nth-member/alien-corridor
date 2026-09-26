// Run every module of one edition in SCI (via acss-engine.js) and compare with the JVM reference.
//   node tools/compare.js primary|bank
// Reads the JVM capture in tools/reference/ref_<tree>.json (tools/capture_jvm.py)
// and the engine sources as published in docs/engine/<tree>/; writes
// tools/reference/cmp_<tree>.json. Each module's clock is frozen at the instant
// the JVM loaded it, so sealed agents can be compared.
const vm = require("vm"), fs = require("fs"), path = require("path");
const tree = process.argv[2];
const DOCS = path.join(__dirname, "..", "docs");
const SRC = path.join(DOCS, "engine", tree) + "/";
const REF = JSON.parse(fs.readFileSync(__dirname + `/reference/ref_${tree}.json`, "utf8"));

// A clock we can freeze at the JVM's load instant.
const RealDate = Date; let FROZEN = null;
class FakeDate extends RealDate {
  constructor(...a) { if (a.length === 0 && FROZEN != null) super(FROZEN); else super(...a); }
  static now() { return FROZEN != null ? FROZEN : RealDate.now(); }
}
global.Date = FakeDate;
global.window = globalThis; global.self = globalThis;
global.document = { addEventListener() {}, querySelectorAll() { return []; }, readyState: "complete", currentScript: null, getElementsByTagName() { return []; } };
vm.runInThisContext(fs.readFileSync(path.join(DOCS, "scittle-0.8.33.js"), "utf8"));
vm.runInThisContext(fs.readFileSync(path.join(DOCS, "acss-engine.js"), "utf8"));

const nsFile = ns => SRC + ns.replace(/-/g, "_").replace(/\./g, "/") + ".clj";
const E = ACSS.Engine({ isEngineNs: ns => ns.startsWith("org.threeppnoah"),
  source: ns => { try { return fs.readFileSync(nsFile(ns), "utf8"); } catch { return null; } } });

// Normalise printed values to comparable token streams.
const DT = /#object\[org\.joda\.time\.DateTime 0x[0-9a-f]+ "([^"]+)"\]|#inst "([^"]+)"/g;
function tokens(s) {
  if (s == null) return [];
  s = s.replace(/#object\[(clojure\.lang\.Agent) 0x[0-9a-f]+ /g, "#object[$1 0x ");   // identity hashes differ on every run
  // Joda's ISO years (-0446, 40922) are not all Date.parse-able: widen them first.
  s = s.replace(DT, (_, a, b) => { const iso = a || b.replace(/-00:00$/, "Z"); const w = iso.replace(/^(-?)(\d+)-/, (m, sg, y) => (sg ? "-" : "+") + y.padStart(6, "0") + "-");
    return " DT(" + Date.parse(w) + ") "; });
  s = s.replace(/(?<![\d"-])(\d{4}-\d\d-\d\dT\d\d:\d\d:\d\d\.\d{3}(?:Z|[+-]\d\d:\d\d))/g, (_, iso) => " DT(" + Date.parse(iso) + ") ");
  s = s.replace(/(-?\d+)\/(\d+)(?![\d.])/g, (m, a, b) => String(Number(a) / Number(b)));   // JVM ratios
  return s.match(/DT\(-?\d+\)|-?\d+(?:\.\d+)?(?:[eE][+-]?\d+)?|"(?:[^"\\]|\\.)*"|[^\s\d"]+/g) || [];
}
function same(a, b, tol) {
  const x = tokens(a), y = tokens(b);
  if (x.length !== y.length) return false;
  for (let i = 0; i < x.length; i++) {
    const p = x[i], q = y[i];
    const dp = p.match(/^DT\((-?\d+)\)$/), dq = q.match(/^DT\((-?\d+)\)$/);
    if (dp && dq) { if (Math.abs(+dp[1] - +dq[1]) > tol.ms) return false; continue; }
    const np = Number(p), nq = Number(q);
    if (p !== "" && q !== "" && !isNaN(np) && !isNaN(nq)) {
      if (np === nq) continue;
      const d = Math.abs(np - nq), m = Math.max(Math.abs(np), Math.abs(nq));
      if (d <= tol.abs || d <= tol.rel * m) continue;
      return false;
    }
    if (p !== q) return false;
  }
  return true;
}
const EXACT = { ms: 0, abs: 0, rel: 1e-12 };
const CLOCK = { ms: 120000, abs: 1e-4, rel: 1e-8 };   // time-dependent: sealed instants differ by the ms the JVM spent

const report = { tree, modules: {} };
let n = 0;
for (const [ns, ref] of Object.entries(REF)) {
  n++;
  FROZEN = ref.t0;
  const ld = E.load(ns);
  FROZEN = null;
  const H = s => (s || "").replace(/ 0x[0-9a-f]+ /g, " 0x ");
  const r = { load: ld.ok ? "ok" : "FAIL: " + ld.error, outExact: H(ld.out) === H(ref.load.out),
              outValue: ld.ok && same(ref.load.out, ld.out, EXACT),
              outClock: ld.ok && same(ref.load.out, ld.out, CLOCK),
              outLinesJVM: (ref.load.out || "").split("\n").length, outLinesSCI: (ld.out || "").split("\n").length,
              vars: 0, varsMissing: [], agentsExact: 0, agentsClock: 0, agentsDiff: [],
              inv: 0, invExact: 0, invClock: 0, invBothFail: 0, invDiff: [] };
  if (!r.outExact && ld.ok) {
    const a = (ref.load.out || "").split("\n"), b = (ld.out || "").split("\n");
    const k = a.findIndex((l, i) => l !== b[i]);
    r.firstOutDiff = { line: k, jvm: (a[k] || "").slice(0, 200), sci: (b[k] || "").slice(0, 200) };
  }
  if (ld.ok) {
    let sv = [];
    try { sv = E.vars(ns); } catch (e) { r.varsError = String(e.message); }
    const sm = new Map(sv.map(([name, kind, pv]) => [name, { kind, pv }]));
    for (const v of ref.vars) {
      r.vars++;
      const s = sm.get(v.name);
      if (!s) { r.varsMissing.push(v.name); continue; }
      if (v.kind === "agent") {
        if (s.kind !== "agent") { r.agentsDiff.push({ name: v.name, why: "kind " + s.kind }); continue; }
        if (same(v.preview, s.pv, EXACT)) r.agentsExact++;
        else if (same(v.preview, s.pv, CLOCK)) r.agentsClock++;
        else r.agentsDiff.push({ name: v.name, jvm: (v.preview || "").slice(0, 120), sci: (s.pv || "").slice(0, 120) });
      }
    }
    for (const [key, iv] of Object.entries(ref.invokes)) {
      const name = key.slice(0, key.lastIndexOf("/"));
      r.inv++;
      const res = E.invoke(ns, name, iv.args);
      if (!iv.ok && !res.ok) { r.invBothFail++;
        const je = (iv.error || "").split(":")[0], se = (res.error || "").replace(/^Error: /, "").split(":")[0];
        if (je === se) r.invSameError = (r.invSameError || 0) + 1;
        else (r.invErrDiff = r.invErrDiff || []).push({ fn: key, jvm: (iv.error || "").slice(0, 120), sci: (res.error || "").slice(0, 120) });
        continue; }
      if (iv.ok && res.ok && same(iv.value, res.value, EXACT)) { r.invExact++; continue; }
      if (iv.ok && res.ok && same(iv.value, res.value, CLOCK)) { r.invClock++; continue; }
      r.invDiff.push({ fn: key, jvm: iv.ok ? (iv.value || "").slice(0, 160) : "ERR " + iv.error,
                       sci: res.ok ? (res.value || "").slice(0, 160) : "ERR " + res.error });
    }
  }
  report.modules[ns] = r;
  process.stderr.write(`${tree} ${n}/${Object.keys(REF).length} ${ns.split(".").pop().slice(0, 44).padEnd(44)} ${r.load === "ok" ? "ok  " : "FAIL"} out=${r.outExact ? "=" : "≠"} agents ${r.agentsExact}+${r.agentsClock}/${r.agentsExact + r.agentsClock + r.agentsDiff.length} inv ${r.invExact}+${r.invClock}+${r.invBothFail}/${r.inv}\n`);
}
fs.writeFileSync(__dirname + `/reference/cmp_${tree}.json`, JSON.stringify(report, null, 1));
