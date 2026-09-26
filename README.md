# Alien Corridor Support System — in the browser

The 3PP-NOAH84 / MDQNM engine and its GUI, running **entirely in the browser**: no JVM, no server,
nothing to install. Both editions are included: the primary `mdqnm` tree and the Shulammite bank tree
(`?tree=bank`).

The GUI is the Alien Corridor Support System's own, with three additions:
- the script tags that load the in-page engine;
- the tree switch, which is now a page parameter rather than a second port;
- a paragraph stating what runs.

It calls the same `/api/*` endpoints it called on the JVM server. `docs/acss-browser.js` answers them
inside the page, in the same shapes.

## How the engine runs

`docs/engine/<tree>/` holds the engine's `.clj` sources, byte for byte; `tools/build.py` verifies each
copy by checksum. [SCI](https://github.com/babashka/sci), a Clojure interpreter (via scittle 0.8.33,
vendored), evaluates them unchanged. `docs/acss-engine.js` supplies only what the JVM supplied:

| the engine uses | supplied as |
|---|---|
| `(import '[java.util Date])`, `(. (new Date) getTime)` | `Date` resolves to the browser's `Date`, and the import itself does nothing |
| `clj-time.coerce/from-long`, `clj-time.local/local-now` | a DateTime that prints as Joda's does (`#object[org.joda.time.DateTime 0x… "…"]`, with Joda's year format) |
| `agent`, `send` | an agent that prints as `clojure.lang.Agent` does and fails as it does. An action that throws leaves the agent `:failed`; a later send raises `Agent is failed, needs restart`; arithmetic on the agent itself raises `ClassCastException`. |
| `require … :reload` | loads the required namespace first, recursively, with its output, where the JVM would |
| compile-time warnings | the JVM's `not declared dynamic` warning for each `*earmuffed*` def, with the same words, file and line |

## Fidelity

Every module of both editions was compared with the JVM engine (Clojure 1.7.0 on Java 8), with each
module's clock frozen at the instant the JVM loaded it. The per-module results are on
[`fidelity.html`](docs/fidelity.html).

| | primary | bank |
|---|---|---|
| modules that load | 90 / 90 | 81 / 81 |
| load output | 87 identical; 3 differ only in number printing or clock time | 78 identical; 3 the same way |
| clock agents that match | 757 / 757 | 421 / 421 |
| function calls, same value | 2,881 / 3,421 | 1,547 / 1,745 |
| calls failing on both | 539 (537 with the same exception) | 196 (195) |
| calls differing | 1 | 2 |

**Declared differences:**
- Numbers print the JavaScript way: `16800` for `16800.0`, and there are no exact ratios.
- Integers are exact to 2⁵³, not 2⁶³.
- A bare `\n` character literal, which Clojure reads as the letter n, prints as the string `"n"`.
- Clocks read the visitor's device clock, and re-seal whenever the page is reloaded.
- Some error messages use SCI's wording.

Reproducing the comparison:

    ./run.sh both                                  # in the Alien Corridor Support System: the JVM reference
    python3 tools/capture_jvm.py primary 7777      # -> tools/reference/ref_primary.json
    python3 tools/capture_jvm.py bank 7778
    node tools/compare.js primary && node tools/compare.js bank
    python3 tools/build.py                         # sources, arities, fidelity -> docs/

`tools/reference/ref_*.json`, the raw JVM captures (13 MB), are gitignored; the comparison results are
kept.

## Not included

The engine's author REPL command histories. `docs/acss-browser.js` serves
`docs/data/history-<tree>.json` if one is added, and shows an empty history panel otherwise. Also left
out: crash logs, build output and the original archive.

## Licence

The engine is under the Eclipse Public License 1.0 (`LICENSE`, from the engine itself). scittle is
EPL-1.0.
