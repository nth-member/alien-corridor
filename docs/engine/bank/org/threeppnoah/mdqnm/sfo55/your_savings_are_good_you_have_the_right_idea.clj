(ns org.threeppnoah.mdqnm.sfo55.your-savings-are-good-you-have-the-right-idea)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)


(import '[java.util Date])




' "(. . .YSAG_YHTRI.100D)"
' "(. . .-21(.72619048). . .-19(.60). . .-18(.612). . .-16(.40) <= Y<=. . .24(.897). . .(17640D/48.3))"
' "(ZTP = (17404.0)"


(def *tnldy-by-your-savings-are-good-you-have-the-right-idea-yg* (fn [W] (+ (* (/ 17640.0 48.3) W) 17404.0)))
(def *jd-tnldy-by-your-savings-are-good-you-have-the-right-idea-yg* (fn [W] (do [   (+ (* (/ 17640.0 48.3) W) 17404.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (/ 17640.0 48.3) W) 17404.0)        )))) ])))


(def *your-savings-are-good-you-have-the-right-idea-yg-by-tnldy* (fn [Z] (/ (- Z 17404.0) (/ 17640.0 48.3))))
(def *jd-your-savings-are-good-you-have-the-right-idea-yg-by-tnldy* (fn [Z]  (do [  (/ (- Z 17404.0) (/ 17640.0 48.3)) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-your-savings-are-good-you-have-the-right-idea-ygcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 17404.0) (/ 17640.0 48.3)) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *your-savings-are-good-you-have-the-right-idea-yg* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 17404.0) (/ 17640.0 48.3))))
(send *your-savings-are-good-you-have-the-right-idea-yg* + 0)





(def *exe-tpdp-cognitive-hertz-frequency* (agent  (/ 1 (* (- 25931.8 (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000)) 24 60 60))))
(send *exe-tpdp-cognitive-hertz-frequency* + 0)
