(ns org.threeppnoah.mdqnm.sfo09.seeking-and-finding-the-comfort-in-charity-faith-and-hope)



(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)



(import '[java.util Date])


' "(SEEKING AND FINDING THE COMFORT IN CHARITY, FAITH, AND HOPE <THE COMING OF THE DAUGHTER PROPER>. . .SF_TC_CFH.300D. . .(300D))"
' "(. . .-21(.72619048). . .-19(.60). . .-18(.612). . .<= Y <=. . .18(.96). . .19(.48). . .20(.48). . .25(.48). . .26(.34). . .28(.00). . .36(.00). . .(300D))"
' "(ZTP = 18290 <---> 18360 / 18390)"


(def *tnldy-by-seeking-finding-the-comfort-in-charity-faith-and-hope300d* (fn [Y]  (+ (* 300 Y) 18290.0)))
(def *jd-tnldy-by-seeking-finding-the-comfort-in-charity-faith-and-hope300d* (fn [Y] (do [    (+ (* 300 Y) 18290.0)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 300 Y) 18290.0)        )))) ])))



(def *seeking-finding-the-comfort-in-charity-faith-and-hope300d-by-tnldy* (fn [Z]  (/ (- Z 18290.0) 300)))
(def *jd-seeking-finding-the-comfort-in-charity-faith-and-hope300d-by-tnldy* (fn [Z]  (do [ (/ (- Z 18290.0) 300) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-seeking-finding-the-comfort-in-charity-faith-and-hope300dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 18290.0) 300) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *seeking-finding-the-comfort-in-charity-faith-and-hope300d* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 18290.0) 300)))
(send *seeking-finding-the-comfort-in-charity-faith-and-hope300d* + 0)