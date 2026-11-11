#!/usr/bin/env node
/**
 * The FEED window in a real browser: headless Firefox over raw WebDriver (geckodriver), the site served
 * from docs/ on this computer, the feeds read live from JOMO SFO-WAM's snapshot, REVOTT STAMPS' archive and
 * GDELT's day sources. Each case opens feed.html as a FEED button would and checks what the window shows;
 * the last opens the Alien Corridor itself, loads a module and opens a feed from its buttons.
 *
 *   node tools/feed-browser.mjs [--shots DIR] [--base URL]
 *
 * --base runs the same cases against a published copy, e.g. https://nth-member.github.io/alien-corridor/
 */
import { spawn } from "node:child_process";
import http from "node:http";
import fs from "node:fs";
import path from "node:path";
import { fileURLToPath } from "node:url";

const DOCS = path.join(path.dirname(fileURLToPath(import.meta.url)), "..", "docs");
const arg = k => (process.argv.includes(k) ? process.argv[process.argv.indexOf(k) + 1] : null);
const SHOTS = arg("--shots"), WEB = 8766, WD = 4457, BASE = arg("--base") || `http://127.0.0.1:${WEB}/`;
let failures = 0;
const check = (name, ok, detail = "") => { console.log(`  ${ok ? "ok  " : "FAIL"}  ${name}${detail ? `  — ${detail}` : ""}`); if (!ok) failures++; };
const sleep = ms => new Promise(r => setTimeout(r, ms));

const TYPES = { ".html": "text/html", ".js": "text/javascript", ".json": "application/json", ".clj": "text/plain; charset=utf-8" };
const server = http.createServer((req, res) => {
  const p = path.join(DOCS, decodeURIComponent(new URL(req.url, BASE).pathname));
  if (!p.startsWith(DOCS) || !fs.existsSync(p) || fs.statSync(p).isDirectory()) { res.writeHead(404); return res.end(); }
  res.writeHead(200, { "content-type": TYPES[path.extname(p)] || "application/octet-stream" });
  fs.createReadStream(p).pipe(res);
}).listen(WEB);

const gd = spawn("geckodriver", ["--port", String(WD)], { stdio: "ignore" });
for (let i = 0; i < 50; i++) { try { await fetch(`http://127.0.0.1:${WD}/status`); break; } catch { await sleep(200); } }
async function call(method, p, body) {
  const res = await fetch(`http://127.0.0.1:${WD}${p}`, { method, headers: { "content-type": "application/json" }, body: body === undefined ? undefined : JSON.stringify(body) });
  const json = await res.json().catch(() => ({}));
  if (!res.ok) throw new Error(`${method} ${p} -> ${res.status} ${JSON.stringify(json).slice(0, 300)}`);
  return json.value;
}
const { sessionId } = await call("POST", "/session", { capabilities: { alwaysMatch: { browserName: "firefox",
  "moz:firefoxOptions": { args: ["-headless", "-width", "1000", "-height", "1400"] } } } });
const S = `/session/${sessionId}`;
const exec = (script, args = []) => call("POST", `${S}/execute/sync`, { script, args });
async function until(script, ms = 60000) {
  const end = Date.now() + ms;
  for (;;) { const v = await exec(script).catch(() => null); if (v) return v; if (Date.now() > end) return null; await sleep(400); }
}
async function shot(name) {
  if (!SHOTS) return;
  fs.mkdirSync(SHOTS, { recursive: true });
  fs.writeFileSync(path.join(SHOTS, name + ".png"), Buffer.from(await call("GET", `${S}/screenshot`), "base64"));
}
const feed = q => BASE + "feed.html?" + new URLSearchParams(q).toString();
const SFO23 = "org.threeppnoah.mdqnm.sfo23.the-core-completion-matrix-for-alien-corridor-creation";
const CCM1 = "core-completion-matrix1-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d";
const STATE = `const t = s => (document.querySelector(s) || {}).innerText || "";
  return { what: t("#what"), call: t("#call"), tz: t("#tz"), feed: t("#feed"), items: document.querySelectorAll("#feed .it").length,
           badge: t("#tz .badge"), z: t("#tz .zbig"), gdays: document.querySelectorAll("#feed details.gday").length };`;
const feedReady = `const f = document.querySelector("#feed"); return f && f.style.display !== "none" && /sources/.test(f.innerText) && !/LOADING/.test(f.innerText) && document.querySelector("#tz .zbig");`;

try {
  // 1. an agent: the engine's own clock, read every second at the present
  await call("POST", `${S}/url`, { url: feed({ tree: "primary", ns: "org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d", name: "z-tnldy-clock3", kind: "agent" }) });
  await until(feedReady, 90000);
  let st = await exec(STATE);
  const v1 = Number((st.call.match(/⇒\s*([-\d.]+)/) || [])[1]);
  await sleep(2500);
  const st2 = await exec(STATE), v2 = Number((st2.call.match(/⇒\s*([-\d.]+)/) || [])[1]);
  const zNow = await exec("return NsukkaYg.zOf(Date.now()).z;");
  check("agent: the clock agent is read at the present", Math.abs(v1 - zNow) < 0.001 && st.badge === "PRESENT", `value ${v1}, TNLDY now ${zNow.toFixed(6)}, ${st.badge}`);
  check("agent: its value moves in real time", v2 > v1, `${v1} → ${v2}`);
  check("agent: the feed shows items now", st2.items > 0, `${st2.items} items · ${st2.feed.split("\n")[0].slice(0, 110)}`);
  await shot("1-agent-present");
  // ... the agent's clock set by hand to the feeds' archive (2026-10-20 12:00 Nsukka)
  await exec(`document.querySelector("#tzIn").value = "2026-10-20 12:00"; document.querySelector("#tzGo").click();`);
  await until(`return /PAST/.test(document.querySelector("#tz").innerText) && document.querySelectorAll("#feed .it").length > 0 && !/LOADING/.test(document.querySelector("#feed").innerText);`, 60000);
  st = await exec(STATE);
  check("agent: its clock set to a past TNLDY reads the archive there", st.badge === "PAST" && st.items > 0 && /2026-10-20 12:00/.test(st.tz), `${st.z} · ${st.badge} · ${st.items} items`);
  await shot("2-agent-set-past");

  // 2. a function whose argument sends TNLDY into the feeds' archive: Z = 20800 (2026-10)
  await call("POST", `${S}/url`, { url: feed({ tree: "primary", ns: SFO23, name: "*" + CCM1 + "-by-tnldy*", kind: "fn", args: JSON.stringify(["20800"]) }) });
  await until(feedReady, 90000);
  st = await exec(STATE);
  check("fn by-tnldy: Z is its argument, in the past", st.z.startsWith("20800.000000") && st.badge === "PAST" && /first argument/.test(st.tz), `${st.z} · ${st.badge}`);
  check("fn by-tnldy: the archive's items at that TNLDY", st.items > 0 && /archive/.test(st.feed), `${st.items} items`);
  await exec(`document.querySelector('[data-view="sources"]').click();`); await sleep(500);
  st = await exec(STATE);
  check("fn by-tnldy: By source", /in the window/.test(st.feed), st.feed.split("\n").slice(4, 6).join(" | ").slice(0, 120));
  await shot("3-fn-archive-by-source");

  // 3. a function that returns a TNLDY from Y: 240·24.5 + 10800 = 16680 (2015), GDELT's day sources
  await call("POST", `${S}/url`, { url: feed({ tree: "primary", ns: SFO23, name: "*tnldy-by-" + CCM1 + "*", kind: "fn", args: JSON.stringify(["24.5"]) }) });
  await until(feedReady + ` && document.querySelectorAll("#feed details.gday").length`, 90000);
  await until(`return document.querySelectorAll("#feed details.gday .it").length > 0;`, 30000);
  st = await exec(STATE);
  check("fn tnldy-by: Z is the value it returns", st.z.startsWith("16680.000000") && /returns/.test(st.tz) && st.badge === "PAST", `${st.z} · ${st.badge}`);
  check("fn tnldy-by: before the feeds, GDELT's day sources", st.gdays > 0 && /GDELT/.test(st.feed) && st.items > 0, `${st.gdays} day(s), ${st.items} rows`);
  await shot("4-fn-gdelt");

  // 4. the future: Z = 21000, ahead
  await call("POST", `${S}/url`, { url: feed({ tree: "primary", ns: SFO23, name: "*" + CCM1 + "-by-tnldy*", kind: "fn", args: JSON.stringify(["21000"]) }) });
  await until(`return /FUTURE/.test((document.querySelector("#tz")||{}).innerText || "") && /Ahead/.test((document.querySelector("#feed")||{}).innerText || "");`, 90000);
  st = await exec(STATE);
  check("fn: a future TNLDY is ahead, counting down", st.badge === "FUTURE" && /\bin \d/.test(st.tz) && /opens in/.test(st.feed), st.tz.split("\n").slice(2, 4).join(" | "));
  await shot("5-fn-future");

  // 5. before the archive: Z = 14160 (2008)
  await call("POST", `${S}/url`, { url: feed({ tree: "primary", ns: SFO23, name: "*" + CCM1 + "-by-tnldy*", kind: "fn", args: JSON.stringify(["14160"]) }) });
  await until(`return /NULL, not zero/.test((document.querySelector("#feed")||{}).innerText || "");`, 90000);
  st = await exec(STATE);
  check("fn: before the archive is NULL, not zero", /Before the archive/.test(st.feed) && st.items === 0, st.feed.split("\n").find(l => /archive/.test(l)) || "");

  // 6. a call that names no TNLDY follows the present; a call that reads the clock is read every second
  await call("POST", `${S}/url`, { url: feed({ tree: "primary", ns: "org.threeppnoah.mdqnm.sfo36.napoleon-and-the-kings", name: "*Ykings*", kind: "fn", args: JSON.stringify(["24.5"]) }) });
  await until(feedReady, 90000);
  st = await exec(STATE);
  check("fn naming no TNLDY: the feed follows the present", /names no TNLDY/.test(st.tz) && st.badge === "PRESENT", st.tz.split("\n")[1].slice(0, 100));
  const CUR = "*jd-gods-great-army-microscale-lightcone-of-the-last-end-of-babylon-the-greatcurrent-by-z-tnldy-clock3*";
  await call("POST", `${S}/url`, { url: feed({ tree: "primary", ns: "org.threeppnoah.mdqnm.sfo00.revott-building-blocks-and-babylon-microscale-precision-chronicle-agents-etc", name: CUR, kind: "fn" }) });
  await until(feedReady, 90000);
  st = await exec(STATE);
  check("fn current-by-clock3: tied to the clock, read in real time", /engine's clock, which this call reads/.test(st.tz) && st.badge === "PRESENT" && /read at the clock every/.test(st.call), st.call.split("\n").pop().slice(0, 100));

  // 7. expressions in a link wait for RUN
  await call("POST", `${S}/url`, { url: feed({ tree: "primary", ns: SFO23, name: "*" + CCM1 + "-by-tnldy*", kind: "fn", args: JSON.stringify(["(+ 20000 800)"]) }) });
  await until(`return document.querySelector("#runBtn");`, 90000);
  st = await exec(STATE);
  check("a link's expression arguments wait for RUN", /Not yet/.test(st.tz) && /press RUN/i.test(st.call));
  await exec(`document.querySelector("#runBtn").click();`);
  await until(`return /20800\\.000000/.test(document.querySelector("#tz").innerText);`, 30000);
  check("... and RUN runs them", true);

  // 8. a name that is not in the module
  await call("POST", `${S}/url`, { url: feed({ tree: "primary", ns: SFO23, name: "no-such) (js/alert 1", kind: "fn", args: "[]" }) });
  await until(`return document.querySelector("#what .status.bad");`, 60000);
  st = await exec(STATE);
  check("a name that is not one of the module's is refused", /is not a function of/.test(st.what), st.what.slice(0, 80));

  // 9. the bank edition
  await call("POST", `${S}/url`, { url: feed({ tree: "bank", ns: "org.threeppnoah.mdqnm.sfo10.miscellaneous-streamlines", name: "*ztnldy*", kind: "fn" }) });
  await until(feedReady, 90000);
  st = await exec(STATE);
  const zb = await exec("return NsukkaYg.zOf(Date.now()).z;");
  check("bank: *ztnldy* reads the clock, set to the present", /engine's clock/.test(st.tz) && Math.abs(Number(st.z) - zb) < 0.01, `${st.z} vs ${zb.toFixed(6)}`);

  // 10. the Alien Corridor: FEED buttons, a function's waiting for its argument, a window opened
  await call("POST", `${S}/url`, { url: BASE + "index.html" });
  await until(`return document.querySelectorAll(".nsitem").length > 50;`, 60000);
  await exec(`document.querySelector('.nsitem[data-ns="${SFO23}"]').click();`);
  await until(`return document.querySelector("#loadBtn");`);
  await exec(`document.querySelector("#loadBtn").click();`);
  await until(`return document.querySelectorAll("[data-feed]").length > 5;`, 60000);
  const b = await exec(`const fn = [...document.querySelectorAll(".varcard")].find(c => c.querySelector("[data-arg]"));
    const agent = [...document.querySelectorAll(".varcard")].find(c => c.querySelector("[data-deref]") && c.querySelector("[data-feed]"));
    const before = fn.querySelector("[data-feed]").disabled;
    const inp = fn.querySelector("[data-arg]"); inp.value = "24.5"; inp.dispatchEvent(new Event("input", { bubbles: true }));
    return { before, after: fn.querySelector("[data-feed]").disabled, agents: !!agent, n: document.querySelectorAll("[data-feed]").length };`);
  check("the Alien Corridor: FEED on agents and functions", b.agents && b.n > 5, `${b.n} FEED buttons`);
  check("a function's FEED waits for its arguments", b.before === true && b.after === false);
  const ph = await exec(`return [...new Set([...document.querySelectorAll("[data-arg]")].map(x => x.placeholder))];`);
  check("each argument box names the parameter the source gives it", ph.includes("Z (clojure expr)") && ph.includes("Y (clojure expr)"), ph.join(" · "));
  const handles0 = await call("GET", `${S}/window/handles`);
  await exec(`[...document.querySelectorAll(".varcard")].find(c => c.querySelector("[data-deref]") && c.querySelector("[data-feed]")).querySelector("[data-feed]").click();`);
  await sleep(1500);
  const handles1 = await call("GET", `${S}/window/handles`);
  check("FEED opens a window of its own", handles1.length === handles0.length + 1, `${handles0.length} → ${handles1.length} windows`);
  const fresh = handles1.find(h => !handles0.includes(h));
  if (fresh) {
    await call("POST", `${S}/window`, { handle: fresh });
    await until(feedReady, 90000);
    st = await exec(STATE);
    check("... reading that agent at the present, with its feed", st.badge === "PRESENT" && st.items > 0, `${st.what.split("\n")[1].slice(0, 70)} · ${st.items} items`);
    await shot("6-opened-from-the-corridor");
    await call("POST", `${S}/window`, { handle: handles0[0] });
  }

  // 11. mdqnm-execution-of-selected-sfos [coll]: a collection, here of agents, read as one snapshot at the clock
  const JSP1 = "org.threeppnoah.mdqnm.jomosuperprocess1.mdqnm-timemachines-and-clocks";
  await exec(`document.querySelector('.nsitem[data-ns="${JSP1}"]').click();`);
  await until(`return document.querySelector("#loadBtn");`);
  await exec(`document.querySelector("#loadBtn").click();`);
  await until(`return /public vars exposed/.test((document.querySelector("#modStatus")||{}).innerText || "");`, 120000);
  const c = await exec(`const inp = document.querySelector("[data-arg]"), fb = document.querySelector("[data-feed]");
    const r = { ph: inp.placeholder, title: fb.title, locked: fb.disabled };
    inp.value = "[{:z-tnldy-clock3 z-tnldy-clock3} {:crf *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}]";
    inp.dispatchEvent(new Event("input", { bubbles: true })); r.unlocked = !fb.disabled; return r;`);
  check("selected-sfos: its box asks for coll, and FEED says so", c.ph === "coll (clojure expr)" && c.title === "supply coll first" && c.locked && c.unlocked, `${c.ph} · "${c.title}"`);
  const h0 = await call("GET", `${S}/window/handles`);
  await exec(`document.querySelector("[data-feed]").click();`);
  await sleep(1500);
  const h1 = await call("GET", `${S}/window/handles`), win = h1.find(h => !h0.includes(h));
  if (win) {
    await call("POST", `${S}/window`, { handle: win });
    await until(`return /#object\\[clojure\\.lang\\.Agent/.test((document.querySelector("#call")||{}).innerText || "") && document.querySelector("#tz .badge");`, 120000);
    st = await exec(STATE);
    check("... the expression typed in the Alien Corridor runs at once: a snapshot of the agents, tied to the engine's clock",
      /engine's clock, which this call reads/.test(st.tz) && st.badge === "PRESENT" && /read at the clock every/.test(st.call), st.call.split("\n").pop().slice(0, 110));
    await shot("7-selected-sfos");
    await call("DELETE", `${S}/window`);
    await call("POST", `${S}/window`, { handle: h0[0] });
  } else check("... its feed window opened", false);
  // ... and the call the module makes itself, at load: FEED · AUTHOR'S CALL
  const h2 = await call("GET", `${S}/window/handles`);
  const has = await exec(`const b = document.querySelector("[data-authorfeed]"); if (b) b.click(); return !!b;`);
  await sleep(1500);
  const win2 = (await call("GET", `${S}/window/handles`)).find(h => !h2.includes(h));
  check("selected-sfos: FEED · AUTHOR'S CALL is offered", has && !!win2);
  if (win2) {
    await call("POST", `${S}/window`, { handle: win2 });
    await until(`return ((document.querySelector("#call")||{}).innerText || "").split("clojure.lang.Agent").length > 400;`, 120000);
    st = await exec(STATE);
    const n = st.call.split("clojure.lang.Agent").length - 1;
    check("... the author's printed call (line 1563): every agent it names, sealed in one instant, read in real time",
      n > 400 && /line 1563 · printed at load/.test(st.call) && /all 757 agents/.test(st.call) && /read at the clock every/.test(st.call) && st.badge === "PRESENT",
      `${n} agents in the snapshot · ${st.call.split("\n").pop().slice(0, 80)}`);
    await shot("8-author-call");
  }
} catch (e) {
  check("the run completed", false, e.message);
} finally {
  await call("DELETE", S).catch(() => {});
  gd.kill(); server.close();
  console.log(failures ? `\n${failures} FAILED` : "\nall passed");
  process.exit(failures ? 1 : 0);
}
