#!/usr/bin/env python3
"""Capture the JVM engine's behaviour as the reference for the browser port.

For each tree (primary :7777, bank :7778), every module: load it (recording the
epoch-ms instant just before, so the port can seal its clocks to the same
instant), list its public vars, and invoke every fn once per arity with fixed
numeric arguments. Output: ref_<tree>.json
"""
import json, sys, time, urllib.request

ARGS = ["24.5", "7", "3", "2", "1", "0.5"]

def call(port, path, body=None):
    req = urllib.request.Request(f"http://127.0.0.1:{port}{path}",
                                 data=body.encode() if body else None,
                                 method="POST" if body else "GET")
    with urllib.request.urlopen(req, timeout=600) as r:
        return json.loads(r.read())

def edn_str(s):
    return '"' + s.replace("\\", "\\\\").replace('"', '\\"') + '"'

def capture(tree, port):
    names = [n["ns"] for n in call(port, "/api/namespaces")["namespaces"]]
    out = {}
    for i, ns in enumerate(names):
        t0 = int(time.time() * 1000)
        ld = call(port, "/api/load", "{:ns " + edn_str(ns) + "}")
        rec = {"t0": t0, "load": ld, "vars": [], "invokes": {}}
        if ld.get("ok"):
            vs = call(port, "/api/vars?ns=" + ns)
            rec["vars"] = vs.get("vars", [])
            for v in rec["vars"]:
                if v["kind"] != "fn":
                    continue
                for a in v.get("arities", []):
                    if not isinstance(a, int) or a > len(ARGS):
                        continue
                    args = ARGS[:a]
                    body = ("{:ns " + edn_str(ns) + " :name " + edn_str(v["name"]) +
                            " :args [" + " ".join(edn_str(x) for x in args) + "]}")
                    r = call(port, "/api/invoke", body)
                    rec["invokes"][f"{v['name']}/{a}"] = {"args": args, "ok": r.get("ok"),
                        "value": r.get("value"), "out": r.get("out"), "error": r.get("error")}
        out[ns] = rec
        print(f"  {tree} {i+1}/{len(names)} {ns.split('.')[-1][:50]:50} "
              f"{'ok' if ld.get('ok') else 'FAIL'} vars={len(rec['vars'])} invokes={len(rec['invokes'])}",
              file=sys.stderr, flush=True)
    return out

if __name__ == "__main__":
    tree, port = sys.argv[1], int(sys.argv[2])
    json.dump(capture(tree, port), open(f"ref_{tree}.json", "w"))
