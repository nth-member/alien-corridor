(ns org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])


(import '[java.util Date])





(def z-tnldy-clock3 (agent (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000)))
(send z-tnldy-clock3 + 0)



