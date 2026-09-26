(ns org.threeppnoah.mdqnm.sfo06.the-shulammite-queen)



(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)

(import '[java.util Date])


' "(SHULAM THE QUEEN. . .SDQ.YJ. . .(360D))"
' "(. . .-21(.913043478260875|.72619048|.60). . .-19(.60). . .-18(.612). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .(360D))"
' "(ZTP = 8040)"


(def *tnldy-by-shulam-the-queen-yj* (fn [Y] (+ (* 360 Y) 8040.0)))
(def *jd-tnldy-by-shulam-the-queen-yj* (fn [Y] (do [    (+ (* 360 Y) 8040.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 360 Y) 8040.0)        )))) ])))

(def *shulam-the-queen-yj-by-tnldy* (fn [Z] (/ (- Z 8040.0) 360)))
(def *jd-shulam-the-queen-yj-by-tnldy* (fn [Z]  (do [ (/ (- Z 8040.0) 360) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-shulam-the-queen-yjcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 8040.0) 360) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *shulam-the-queen-yj* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 8040.0) 360)))
(send *shulam-the-queen-yj* + 0)






' "(SHULAM THE QUEEN. . .shulam-the-queen.100D. . .(100D))"
' "(. . .-21(.913043478260875|.72619048|.60). . .-19(.60). . .-18(.612). . .<= Y <=. . .82(.80). . .111(.60). . .144(.00). . .168(.00). . .(100D))"
' "(ZTP = 8040)"


(def *tnldy-by-shulam-the-queen100d* (fn [Y] (+ (* 100 Y) 8040.0)))
(def *jd-tnldy-by-shulam-the-queen100d* (fn [Y] (do [    (+ (* 100 Y) 8040.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 8040.0)        )))) ])))

(def *shulam-the-queen100d-by-tnldy* (fn [Z] (/ (- Z 8040.0) 100)))
(def *jd-shulam-the-queen100d-by-tnldy* (fn [Z]  (do [ (/ (- Z 8040.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-shulam-the-queen100dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 8040.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *shulam-the-queen100d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 8040.0) 100)))
(send *shulam-the-queen100d* + 0)






' "(SHULAM IS THE QUEEN. . .shulam-the-queen.1000D/7. . .(1000D/7))"
' "(. . .-21(.913043478260875|.72619048|.60). . .-19(.60). . .-18(.612). . .<= Y <=. . .82(.80). . .111(.60). . .)"
' "(ZTP = 10611 3/7)"


(def *tnldy-by-shulam-the-queen-sdq1000ddiv7* (fn [Y]  (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0))))
(def *jd-tnldy-by-shulam-the-queen-sdq1000ddiv7* (fn [Y] (do [    (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0))      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0))        ))))    "which is ca."    (/ -1 (* (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* (/ 1000 7) Y) (+ (/ 3 7) 10611.0)) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))



(def *shulam-the-queen-sdq1000ddiv7-by-tnldy* (fn [Z]  (/ (* (- Z (+ (/ 3 7) 10611.0)) 7) 1000)))
(def *jd-shulam-the-queen-sdq1000ddiv7-by-tnldy* (fn [Z]  (do [ (/ (* (- Z (+ (/ 3 7) 10611.0)) 7) 1000) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))   "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))
(def *jd-shulam-the-queen-sdq1000ddiv7current-by-z-tnldy-clock3* (fn []  (do [ (/ (* (- @z-tnldy-clock3 (+ (/ 3 7) 10611.0)) 7) 1000) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))     "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"       ])))
(def *shulam-the-queen-sdq1000ddiv7* (agent (/ (* (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) (+ (/ 3 7) 10611.0)) 7) 1000)))
(send *shulam-the-queen-sdq1000ddiv7* + 0)





' "(. . .SHULAM...SHE THAT IS OF ME...THE NEW NIGERIA...(100D). . .)"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .82(.80). . .111(.60). . .)"
' "(ZTP = 11280.0)"


(def *tnldy-by-shulam-she-that-is-of-me-the-new-nigeria100d* (fn [Y] (+ (* 100 Y) 11280.0)))
(def *jd-tnldy-by-shulam-she-that-is-of-me-the-new-nigeria100d* (fn [Y] (do [    (+ (* 100 Y) 11280.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 11280.0)  ))))  "which is ca."    (/ -1 (* (- (+ (* 100 Y) 11280.0) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* 100 Y) 11280.0) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* 100 Y) 11280.0) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* 100 Y) 11280.0) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* 100 Y) 11280.0) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* 100 Y) 11280.0) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* 100 Y) 11280.0) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* 100 Y) 11280.0) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* 100 Y) 11280.0) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* 100 Y) 11280.0) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* 100 Y) 11280.0) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* 100 Y) 11280.0) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* 100 Y) 11280.0) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* 100 Y) 11280.0) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* 100 Y) 11280.0) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* 100 Y) 11280.0) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 11280.0) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 11280.0) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* 100 Y) 11280.0) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"  ])))


(def *shulam-she-that-is-of-me-the-new-nigeria100d-by-tnldy* (fn [Z] (/ (- Z 11280.0)  100)))
(def *jd-shulam-she-that-is-of-me-the-new-nigeria100d-by-tnldy* (fn [Z]  (do [ (/  (- Z 11280.0)  100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z)))) "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))
(def *jd-shulam-she-that-is-of-me-the-new-nigeria100dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/  (- @z-tnldy-clock3 11280.0)  100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))  "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))
(def *shulam-she-that-is-of-me-the-new-nigeria100d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 11280.0)  100)))
(send *shulam-she-that-is-of-me-the-new-nigeria100d* + 0)

