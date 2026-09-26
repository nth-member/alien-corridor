(ns org.threeppnoah.mdqnm.sfo56.unn-job-accepted)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)

(import '[java.util Date])




(def *tnldy-by-unn-job-accepted-yj* (fn [Y] (+ (* 360 Y) 11467)))
(def *jd-tnldy-by-unn-job-accepted-yj* (fn [Y] (do [    (+ (* 360 Y) 11467)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 360 Y) 11467)        )))) ])))




(def *unn-job-accepted-yj-by-tnldy* (fn [Z] (/ (- Z 11467) 360)))
(def *jd-unn-job-accepted-yj-by-tnldy* (fn [Z]  (do [ (/ (- Z 11467) 360) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-unn-job-accepted-yjcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 11467) 360) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *unn-job-accepted-yj* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 11467) 360)))
(send *unn-job-accepted-yj* + 0)



(comment (defn *a-time-time-and-half-a-time-being-seven-and-half-days* [do 
                                                               
         {:primordial-darkness-minuszeropointfive-to-zero "-0.375 unto -0.125"}


         {:day-zero-to-zeropointfive-evening "0.125 unto 0.375"}

         {:day-zeropointfive-to-one-morning "0.625 unto 0.875"}



         {:day-one-to-onepointfive-evening "1.125 unto 1.375"}

         {:day-onepointfive-to-two-morning "1.625 unto 1.875"}



         {:day-two-to-twopointfive-evening "2.125 unto 2.375"}

         {:day-twopointfive-to-three-morning "2.625 unto 2.875"}



         {:day-three-to-threepointfive-evening "3.125 unto 3.375"}

         {:day-threepointfive-to-four-morning "3.625 unto 3.875"}



         {:day-four-to-fourpointfive-evening "4.125 unto 4.375"}

         {:day-fourpointfive-to-five-morning "4.625 unto 4.875"}



         {:day-five-to-fivepointfive-evening "5.125 unto 5.375"}

         {:day-fivepointfive-to-six-morning "5.625 unto 5.875"}



         {:day-six-to-sixpointfive-evening "6.125 unto 6.375"}

         {:day-sixpointfive-to-seven-morning "6.625 unto 6.875"}]))



