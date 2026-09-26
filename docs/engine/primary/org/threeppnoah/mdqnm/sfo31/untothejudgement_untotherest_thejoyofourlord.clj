(ns org.threeppnoah.mdqnm.sfo31.untothejudgement-untotherest-thejoyofourlord)



(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)


(import '[java.util Date])


' "UNTO THE JUDGEMENT - EVERY DAY UNTO THE REST OF THE JOY OF OUR LORD"
' "(. . .-10(.39). . .-6(.04532451). . .-3(.60|.32). . .<= Y2<=. . .6(.12|.17|.41|.65)
                                                               . . .7(.7017874396|.9046859903)
                                                               . . .9(.09)
                                                               . . .23(.22|.60|.71). . .24(.21|.29|.31|.41|.447|.897)
                                                               . . .25(.20|.56|.928). . .26(.81). . .27(.01|.31|.41)
                                                               . . .28(.80|.9723188406). . .29(.3104830918|.528)
                                                               . . .48(.9571256038). . .49(.70)
                                                               . . .50(.4795652174). . .51(.3148309178). . .52(.339468599)
                                                               . . .53(.5745032556). . .54(.00)
                                                               . . .61(.8080676329). . .62(.7549275362). . .63(.6003381642) (2070D/7))"
' "(ZTP = (9722.47142857)"


(def *tnldy-by-unto-the-judgement-unto-the-rest-the-joy-of-our-lord* (fn [Y2] (+ (* (/ 2070 7) Y2) (+ (/ 1 2.12121212121212121212121212) 9722.0))))
(def *jd-tnldy-by-unto-the-judgement-unto-the-rest-the-joy-of-our-lord* (fn [Y2] (do [   (+ (* (/ 2070 7) Y2) (+ (/ 1 2.12121212121212121212121212) 9722.0))      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* (/ 2070 7) Y2) (+ (/ 1 2.12121212121212121212121212) 9722.0))        )))) ])))


(def *unto-the-judgement-unto-the-rest-the-joy-of-our-lord-by-tnldy* (fn [Z] (/ (* (- Z (+ (/ 1 2.12121212121212121212121212) 9722.0)) 7) 2070)))
(def *jd-unto-the-judgement-unto-the-rest-the-joy-of-our-lord-by-tnldy* (fn [Z]  (do [  (/ (* (- Z (+ (/ 1 2.12121212121212121212121212) 9722.0)) 7) 2070) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-unto-the-judgement-unto-the-rest-the-joy-of-our-lordcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (* (- @z-tnldy-clock3 (+ (/ 1 2.12121212121212121212121212) 9722.0)) 7) 2070) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *unto-the-judgement-unto-the-rest-the-joy-of-our-lord* (agent (/ (* (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000)  (+ (/ 1 2.12121212121212121212121212) 9722.0) ) 7) 2070)))
(send *unto-the-judgement-unto-the-rest-the-joy-of-our-lord* + 0)