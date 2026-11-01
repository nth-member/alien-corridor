#!/usr/bin/env python3
"""Assemble docs/ from the original engine and the JVM reference capture.

    python3 tools/build.py [ENGINE_DIR]

ENGINE_DIR defaults to the Alien Corridor Support System's verbatim copy of the
engine. Writes:

    docs/engine/primary/...clj     the primary edition's sources, byte for byte
    docs/engine/bank/...clj        the Shulammite bank edition's, byte for byte
    docs/data/namespaces-<tree>.json   ns, path, bytes -- what /api/namespaces lists
    docs/data/arities-<tree>.json      each fn's arities, as the JVM reports them by
                                       reflection (the browser cannot); from the capture
    docs/data/fidelity.json            the comparison with the JVM, per module
    docs/data/clock-<tree>.json        the edition's own clock constants, read from its sources: the
                                       origin its from-long dates are written on, and its live clocks

Only source is copied: no crash logs, build output, archive or REPL history.
"""
import hashlib
import json
import re
import shutil
import sys
from pathlib import Path

HERE = Path(__file__).resolve().parent
ROOT = HERE.parent
DOCS = ROOT / "docs"
ENGINE = Path(sys.argv[1] if len(sys.argv) > 1 else
              Path.home() / "pdp-causal-agent/claude_code_outputs/alien_corridor_support_system/engine")
TREES = {"primary": ENGINE / "mdqnm" / "src", "bank": ENGINE / "mdqnmshulammitebanksystem" / "mdqnm" / "src"}
REF = HERE / "reference"


# (c/from-long (long (+ ORIGIN (* 86400000 Z)))) -- every date the engine prints is written this way;
# (+ CONSTANT (. (new Date) getTime)) / 86400000 -- its live TNLDY clocks.
FROM_LONG = re.compile(r"\(c/from-long \(long \(\+\s+(-?[0-9.]+(?:E[0-9]+)?)\s")
LIVE = re.compile(r"\(\+\s+([0-9.]+)\s+\(\. \(new Date\) getTime\)\)")


def clock_constants(src: Path) -> dict:
    origins, live = {}, {}
    for f in src.rglob("*.clj"):
        text = f.read_text(errors="replace")
        for m in FROM_LONG.finditer(text):
            origins[m.group(1)] = origins.get(m.group(1), 0) + 1
        for m in LIVE.finditer(text):
            live[m.group(1)] = live.get(m.group(1), 0) + 1
    assert len(origins) == 1, f"one from-long origin expected, found {origins}"
    (origin, calls), = origins.items()
    return {"from_long_origin_ms": origin, "from_long_calls": calls, "live_clock_constants_ms": live}


def ns_of(rel: str) -> str:
    return rel[:-4].replace("/", ".").replace("_", "-")


def main():
    (DOCS / "data").mkdir(parents=True, exist_ok=True)
    fidelity = {}
    for tree, src in TREES.items():
        dst = DOCS / "engine" / tree
        if dst.exists():
            shutil.rmtree(dst)
        listing = []
        for f in sorted(src.rglob("*.clj")):
            rel = f.relative_to(src).as_posix()
            (dst / rel).parent.mkdir(parents=True, exist_ok=True)
            shutil.copyfile(f, dst / rel)
            assert hashlib.sha256((dst / rel).read_bytes()).digest() == hashlib.sha256(f.read_bytes()).digest()
            listing.append({"ns": ns_of(rel), "path": rel, "bytes": f.stat().st_size})
        listing.sort(key=lambda n: n["ns"])
        (DOCS / "data" / f"namespaces-{tree}.json").write_text(json.dumps(listing, separators=(",", ":")))
        (DOCS / "data" / f"clock-{tree}.json").write_text(json.dumps(clock_constants(dst), separators=(",", ":")))

        ref = json.loads((REF / f"ref_{tree}.json").read_text())
        arities = {ns: {v["name"]: v.get("arities", []) for v in r["vars"] if v["kind"] == "fn"}
                   for ns, r in ref.items()}
        (DOCS / "data" / f"arities-{tree}.json").write_text(json.dumps(arities, separators=(",", ":")))

        cmp = json.loads((REF / f"cmp_{tree}.json").read_text())["modules"]
        fidelity[tree] = {ns: {k: m[k] for k in ("load", "outExact", "outValue", "outClock",
                                                  "agentsExact", "agentsClock", "inv", "invExact",
                                                  "invClock", "invBothFail")}
                          | {"agentsDiff": len(m["agentsDiff"]), "invDiff": m["invDiff"],
                             "invSameError": m.get("invSameError", 0),
                             "invErrDiff": m.get("invErrDiff", [])}
                          for ns, m in cmp.items()}
        print(f"  {tree}: {len(listing)} sources copied byte for byte")
    (DOCS / "data" / "fidelity.json").write_text(json.dumps(fidelity, separators=(",", ":")))


if __name__ == "__main__":
    main()
