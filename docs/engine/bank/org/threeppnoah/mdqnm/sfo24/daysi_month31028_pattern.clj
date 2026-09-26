(ns org.threeppnoah.mdqnm.sfo24.daysi-month31028-pattern)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)


(import '[java.util Date])

' "(31.028DY_MT)"
' "(-18(.00). . .<= Y <=. . .31(.028|.318). . .(DAYSi))"
' "(ZTP = -11316.98913)"


(def *tnldy-by-days-i-month31028-pattern* (fn [Yi] (+ (* (Math/pow (/ 28000 23) 1) (* Yi)) -11316.98913)))
(def *jd-tnldy-by-days-i-month31028-pattern* (fn [Yi] (do [   (+ (* (Math/pow (/ 28000 23) 1) (* Yi)) -11316.98913)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (Math/pow (/ 28000 23) 1) (* Yi)) -11316.98913)        )))) ])))



(def *days-i-month31028-pattern-by-tnldy* (fn [Z] (/ (- Z -11316.98913) (Math/pow (/ 28000 23) 1))))
(def *jd-days-i-month31028-pattern-by-tnldy* (fn [Z]  (do [ (/ (- Z -11316.98913) (Math/pow (/ 28000 23) 1)) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-days-i-month31028-patterncurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 -11316.98913) (Math/pow (/ 28000 23) 1)) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *days-i-month31028-pattern* (agent (* (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000)  -11316.98913) (Math/pow (/ 28000 23) -1))))
(send *days-i-month31028-pattern* + 0)




' "(AM_SIT)"
' "(. . .-65(.74). . .<= Y <=. . .27(.41). . .(176400D/48.3))"
' "(ZTP = -70611.45652)"


(def *tnldy-by-usa-sit-tenyg* (fn [Y] (+ (* (/ 176400 48.3) Y) -70611.45652)))
(def *jd-tnldy-by-usa-sit-tenyg* (fn [Y] (do [   (+ (* (/ 176400 48.3) Y) -70611.45652)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (/ 176400 48.3) Y) -70611.45652)        )))) ])))


(def *usa-sit-tenyg-by-tnldy* (fn [Z] (/ (* (- Z -70611.45652) 48.3) 176400)))
(def *jd-usa-sit-tenyg-by-tnldy* (fn [Z]  (do [ (/ (* (- Z -70611.45652) 48.3) 176400) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-usa-sit-tenygcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (* (- @z-tnldy-clock3 -70611.45652) 48.3) 176400) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *usa-sit-tenyg* (agent (/ (* (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) -70611.45652) 48.3) 176400)))
(send *usa-sit-tenyg* + 0)





' "(usaERICAN DEMOCRATIC REVOLUTION SITS ON THE <BRITISH> EMPIRE AT THE CONCLUSION OF THE SEVEN YEARS WAR)"
' "(. . .-18.00. . .<= Y <=. . .82.80. . .(70000D/69))"
' "(ZTP = -57542)"


(def *tnldy-by-usa-dem-rev-sit-on-brit-emp* (fn [Y] (+ (* (/ 70000 69) Y) -57542)))
(def *jd-tnldy-by-usa-dem-rev-sit-on-brit-emp* (fn [Y] (do [   (+ (* (/ 70000 69) Y) -57542)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (/ 70000 69) Y) -57542)        )))) ])))


(def *usa-dem-rev-sit-on-brit-emp-by-tnldy* (fn [Z] (/ (* (- Z -57542) 69) 70000)))
(def *jd-usa-dem-rev-sit-on-brit-emp-by-tnldy* (fn [Z]  (do [ (/ (* (- Z -57542) 69) 70000) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-usa-dem-rev-sit-on-brit-empcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (* (- @z-tnldy-clock3 -57542) 69) 70000) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *usa-dem-rev-sit-on-brit-emp* (agent (/ (* (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) -57542) 69) 70000)))
(send *usa-dem-rev-sit-on-brit-emp* + 0)

