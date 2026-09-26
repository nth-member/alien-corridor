(ns org.threeppnoah.mdqnm.sfo32.greatwhitethrone-untothejudgement-untotherest-thejoyofourlord)



(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)


(import '[java.util Date])


' "UNTO THE GREAT WHITE THRONE JUDGEMENT - EVERY DAY UNTO THE REST (OF A NEW HEAVEN AND A NEW EARTH) AND THE JOY OF OUR LORD"
' "(. . .-10(.39). . .-6(.04532451). . .-3(.60|.32). . .<= Y1<=. . .6(.12|.17|.41|.65)
                                                               . . .7(.7017874396|.9046859903)
                                                               . . .9(.09)
                                                               . . .23(.22|.60|.71). . .24(.21|.29|.31|.41|.447|.897)
                                                               . . .25(.20|.56|.928). . .26(.81). . .27(.01|.31|.41)
                                                               . . .28(.80|.9723188406). . .29(.3104830918|.528)
                                                               . . .48(.9571256038). . .49(.70)
                                                               . . .50(.4795652174). . .51(.3148309178). . .52(.339468599)
                                                               . . .53(.5745032556). . .54(.00)
                                                               . . .61(.8080676329). . .62(.7549275362). . .63(.6003381642) (207DYSi/7))"
' "(ZTP = (972.247142857 DYSi)"


(def *days-i-by-great-white-throne-unto-the-judgement-unto-the-rest-the-joy-of-our-lord* (fn [Y1] (+ (* (/ 207 7) Y1) (+ (/ 21.625 87.5) 972.0))))
(def *great-white-throne-unto-the-judgement-unto-the-rest-the-joy-of-our-lord-by-days-i* (fn [X] (/ (* (- X (+ (/ 21.625 87.5) 972.0)) 7) 207)))   







(def *tnldy-by-great-white-throne-unto-the-judgement-unto-the-rest-the-joy-of-our-lord* (fn [Y1] (/ (* (-  (/ (* (- (+ (* (/ 207 7) Y1) (+ (/ 21.625 87.5) 972.0)) 665) 10) 3) (+ 5849 (* (/ 340 17640) 48.3))) 17640) 48.3)))
(def *jd-tnldy-by-great-white-throne-unto-the-judgement-unto-the-rest-the-joy-of-our-lord* (fn [Y1] (do [   (/ (* (-  (/ (* (- (+ (* (/ 207 7) Y1) (+ (/ 21.625 87.5) 972.0)) 665) 10) 3) (+ 5849 (* (/ 340 17640) 48.3))) 17640) 48.3)      (c/from-long (long (+  -4.75199E9 (* 86400000      (/ (* (-  (/ (* (- (+ (* (/ 207 7) Y1) (+ (/ 21.625 87.5) 972.0)) 665) 10) 3) (+ 5849 (* (/ 340 17640) 48.3))) 17640) 48.3)        )))) ])))


(def *great-white-throne-unto-the-judgement-unto-the-rest-the-joy-of-our-lord-by-tnldy* (fn [Z] (/ (* (- (+ (/ (* (+ (/ (* Z 48.3) 17640) (+ 5849 (* (/ 340 17640) 48.3))) 3) 10) 665) (+ (/ 21.625 87.5) 972.0)) 7) 207)))
(def *jd-great-white-throne-unto-the-judgement-unto-the-rest-the-joy-of-our-lord-by-tnldy* (fn [Z]  (do [  (/ (* (- (+ (/ (* (+ (/ (* Z 48.3) 17640) (+ 5849 (* (/ 340 17640) 48.3))) 3) 10) 665) (+ (/ 21.625 87.5) 972.0)) 7) 207) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-great-white-throne-unto-the-judgement-unto-the-rest-the-joy-of-our-lordcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (* (- (+ (/ (* (+ (/ (* @z-tnldy-clock3 48.3) 17640) (+ 5849 (* (/ 340 17640) 48.3))) 3) 10) 665) (+ (/ 21.625 87.5) 972.0)) 7) 207) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *great-white-throne-unto-the-judgement-unto-the-rest-the-joy-of-our-lord* (agent  (/ (* (- (+ (/ (* (+ (* (/ (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 17640) 48.3) (+ 5849 (* (/ 340 17640) 48.3))     ) 3) 10) 665)  (+ (/ 21.625 87.5) 972.0) ) 7) 207)))
(send *great-white-throne-unto-the-judgement-unto-the-rest-the-joy-of-our-lord* + 0)