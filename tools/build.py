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

Only source is copied: no crash logs, build output, archive or REPL history.
"""
import hashlib
import json
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
