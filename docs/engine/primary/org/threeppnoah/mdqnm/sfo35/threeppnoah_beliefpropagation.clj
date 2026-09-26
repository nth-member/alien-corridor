(ns org.threeppnoah.mdqnm.sfo35.threeppnoah-beliefpropagation)



(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)


(import '[java.util Date])


' "(3PP-NOAH BELIEF PROPAGATION. . .)"
' "(. . .-21(.72619048). . .-18(.612). . .<= W <=. . .40(.18). . .82(.80). . .111(.60). . .(100D|360D|(17640D/48.3)))"
' "(. . .-21(.72619048). . .-18(.612). . .<= X <=. . .40(.18). . .82(.80). . .111(.60). . .(7D))"
' "(. . .-21(.72619048). . .-18(.612). . .<= R <=. . .40(.18). . .82(.80). . .111(.60). . .(1D))"
' "(ZTP = 13687.5)"


(def *tnldy-by-threepp-noah-belief-propagation-expects-r-w-y* (fn [R W Y] (+  (+ (* 100 W) (* 7 Y) (* 1 R) 13687.5))))


(def *tnldy-by-threepp-noah-belief-propagation-proper* (fn [Yprp] (+ (* 108 Yprp) 13687.5)))
(def *jd-tnldy-by-threepp-noah-belief-propagation-proper* (fn [Yprp] (do [   (+ (* 108 Yprp) 13687.5)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 108 Yprp) 13687.5)        )))) ])))


(def *threepp-noah-belief-propagation-proper-by-tnldy* (fn [Z] (/ (- Z 13687.5) 108)))
(def *jd-threepp-noah-belief-propagation-proper-by-tnldy* (fn [Z]  (do [  (/ (- Z 13687.5) 108) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-threepp-noah-belief-propagation-propercurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 13687.5) 108) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *threepp-noah-belief-propagation-proper* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 13687.5) 108)))
(send *threepp-noah-belief-propagation-proper* + 0)


(def *tnldy-by-neutral-organization-for-alternative-havens-alternative-haven-initiative-rminus21pt60-yminus21pt60* (fn [W] (+ (* 100 W) 13514.7)))
(def *jd-ttnldy-by-neutral-organization-for-alternative-havens-alternative-haven-initiative-rminus21pt60-yminus21pt60* (fn [W] (do [   (+ (* 100 W) 13514.7)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 100 W) 13514.7)        )))) ])))


(def *neutral-organization-for-alternative-havens-alternative-haven-initiative-rminus21pt60-yminus21pt60-by-tnldy* (fn [Z] (/ (- Z 13514.7) 100)))
(def *jd-neutral-organization-for-alternative-havens-alternative-haven-initiative-rminus21pt60-yminus21pt60-by-tnldy* (fn [Z]  (do [  (/ (- Z 13514.7) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-neutral-organization-for-alternative-havens-alternative-haven-initiative-rminus21pt60-yminus21pt60current-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 13514.7) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *neutral-organization-for-alternative-havens-alternative-haven-initiative-rminus21pt60-yminus21pt60* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 13514.7) 100)))
(send *neutral-organization-for-alternative-havens-alternative-haven-initiative-rminus21pt60-yminus21pt60* + 0)


(def *tnldy-by-neutral-organization-for-alternative-havens-alternative-haven-initiative-r12-y0* (fn [W] (+ (* 100 W) 13699.5)))
(def *jd-tnldy-by-neutral-organization-for-alternative-havens-alternative-haven-initiative-r12-y0* (fn [W] (do [   (+ (* 100 W) 13699.5)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 100 W) 13699.5)        )))) ])))



(def *neutral-organization-for-alternative-havens-alternative-haven-initiative-r12-y0-by-tnldy* (fn [Z] (/ (- Z 13699.5) 100)))
(def *jd-neutral-organization-for-alternative-havens-alternative-haven-initiative-r12-y0-by-tnldy* (fn [Z]  (do [  (/ (- Z 13699.5) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-neutral-organization-for-alternative-havens-alternative-haven-initiative-r12-y0current-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 13699.5) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *neutral-organization-for-alternative-havens-alternative-haven-initiative-r12-y0* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 13699.5) 100)))
(send *neutral-organization-for-alternative-havens-alternative-haven-initiative-r12-y0* + 0)




(def *tnldy-by-neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y0* (fn [W] (+ (* 100 W) 13770.3)))
(def *jd-tnldy-by-neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y0* (fn [W] (do [   (+ (* 100 W) 13770.3)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 100 W) 13770.3)        )))) ])))



(def *neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y0-by-tnldy* (fn [Z] (/ (- Z 13770.3) 100)))
(def *jd-neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y0-by-tnldy* (fn [Z]  (do [  (/ (- Z 13770.3) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y0current-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 13770.3) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y0* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 13770.3) 100)))
(send *neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y0* + 0)




(def *tnldy-by-neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y70* (fn [W] (+ (* 100 W) 14260.3)))
(def *jd-tnldy-by-neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y70* (fn [W] (do [   (+ (* 100 W) 14260.3)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 100 W) 14260.3)        )))) ])))



(def *neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y70-by-tnldy* (fn [Z] (/ (- Z 14260.3) 100)))
(def *jd-neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y70-by-tnldy* (fn [Z]  (do [  (/ (- Z 14260.3) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y70current-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 14260.3) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y70* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 14260.3) 100)))
(send *neutral-organization-for-alternative-havens-alternative-haven-initiative-r82pt80-y70* + 0)