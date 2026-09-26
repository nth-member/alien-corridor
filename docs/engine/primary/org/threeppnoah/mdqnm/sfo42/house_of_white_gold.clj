(ns org.threeppnoah.mdqnm.sfo42.house-of-white-gold)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d) 

(import '[java.util Date])


' "(. . .HOUSE OF WHITE GOLD. . .)"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .(100D|360D|(17640D/48.3)))"
' "(ZTP = 11570)"


(def *tnldy-by-house-of-white-gold100d* (fn [Y] (+ (* 100 Y) 11570.0)))
(def *jd-tnldy-by-house-of-white-gold100d* (fn [Y] (do [   (+ (* 100 Y) 11570.0)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 100 Y) 11570.0)        )))) ])))



(def *house-of-white-gold100d-by-tnldy* (fn [Z] (/ (- Z 11570.0) 100)))
(def *jd-house-of-white-gold100d-by-tnldy* (fn [Z]  (do [  (/ (- Z 11570.0) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-house-of-white-gold100dcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 11570.0) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *house-of-white-gold100d* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 11570.0) 100)))
(send *house-of-white-gold100d* + 0)








(def *tnldy-by-house-of-white-gold-yj* (fn [Y] (+ (* 360 Y) 11570.0)))
(def *jd-tnldy-by-house-of-white-gold-yj* (fn [Y] (do [   (+ (* 360 Y) 11570.0)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 360 Y) 11570.0)        )))) ])))



(def *house-of-white-gold-yj-by-tnldy* (fn [Z] (/ (- Z 11570.0) 360)))
(def *jd-house-of-white-gold-yj-by-tnldy* (fn [Z]  (do [  (/ (- Z 11570.0) 360) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-house-of-white-gold-yjcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 11570.0) 360) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *house-of-white-gold-yj* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 11570.0) 360)))
(send *house-of-white-gold-yj* + 0)










(def *tnldy-by-house-of-white-gold-yg* (fn [Y] (+ (* (/ 17640 48.3) Y) 11570.0)))
(def *jd-tnldy-by-house-of-white-gold-yg* (fn [Y] (do [   (+ (* (/ 17640 48.3) Y) 11570.0)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* (/ 17640 48.3) Y) 11570.0)        )))) ])))



(def *house-of-white-gold-yg-by-tnldy* (fn [Z] (/ (* (- Z 11570.0) 48.3) 17640)))
(def *jd-house-of-white-gold-yg-by-tnldy* (fn [Z]  (do [  (/ (* (- Z 11570.0) 48.3) 17640) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-house-of-white-gold-ygcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (* (- @z-tnldy-clock3 11570.0) 48.3) 17640) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *house-of-white-gold-yg* (agent (/ (* (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 11570.0) 48.3) 17640)))
(send *house-of-white-gold-yg* + 0)




