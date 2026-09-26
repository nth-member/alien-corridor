(ns org.threeppnoah.mdqnm.sfo34.ten-days-unto-the-alternative-havens)



(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)

(import '[java.util Date])


' "('THE ALTERNATIVE HAVENS TEN DAYS. . .10DT_TAH.2800D/23. . .(2800D/23))"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .82(.80). . .111(.60). . .)"
' "(ZTP = 11446.713043478261 <---> 11503.9(<--->11570/11584))"


(def *tnldy-by-ten-days-unto-the-alternative-havens10d-tah* (fn [Y] (+ (* (/ 2800 23) Y) 11503.9)))
(def *jd-tnldy-by-ten-days-unto-the-alternative-havens10d-tah* (fn [Y] (do [   (+ (* (/ 2800 23) Y) 11503.9)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* (/ 2800 23) Y) 11503.9)        )))) ])))


(def *ten-days-unto-the-alternative-havens10d-tah-by-tnldy* (fn [Z] (/ (* (- Z 11503.9) 23) 2800)))
(def *jd-ten-days-unto-the-alternative-havens10d-tah-by-tnldy* (fn [Z]  (do [  (/ (* (- Z 11503.9) 23) 2800) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-ten-days-unto-the-alternative-havens10d-tahcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (* (- @z-tnldy-clock3 11503.9) 23) 2800) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *ten-days-unto-the-alternative-havens10d-tah* (agent (/ (* (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 11503.9) 23) 2800)))
(send *ten-days-unto-the-alternative-havens10d-tah* + 0)