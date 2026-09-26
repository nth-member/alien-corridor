(ns org.threeppnoah.mdqnm.sfo05.the-parable-of-the-two-jeroboams)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)


(import '[java.util Date])


' "(THE PARABLE OF JEROBOAM 2. . .)"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .(100D|(17640D/48.3)))"
' "(ZTP = 14540)"


(def *tnldy-by-the-second-jeroboam100d* (fn [Y] (+ (* 100 Y) 14540.0)))
(def *jd-tnldy-by-the-second-jeroboam100d* (fn [Y] (do [    (+ (* 100 Y) 14540.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 14540.0)        )))) ])))



(def *the-second-jeroboam100d-by-tnldy* (fn [Z] (/ (- Z 14540.0) 100)))
(def *jd-the-second-jeroboam100d-by-tnldy* (fn [Z]  (do [ (/ (- Z 14540.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-the-second-jeroboam100dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 14540.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *the-second-jeroboam100d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 14540.0) 100)))
(send *the-second-jeroboam100d* + 0)


(def *tnldy-by-the-second-jeroboam-yg* (fn [Y] (+ (* (/ 17640 48.3) Y) 14540.0)))
(def *jd-tnldy-by-the-second-jeroboam-yg* (fn [Y] (do [    (+ (* (/ 17640 48.3) Y) 14540.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (/ 17640 48.3) Y) 14540.0)        ))))                "which is ca."    (/ -1 (* (- (+ (* (/ 17640 48.3) Y) 14540.0) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* (/ 17640 48.3) Y) 14540.0) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"                         ])))

(def *the-second-jeroboam-yg-by-tnldy* (fn [Z] (/ (* (- Z 14540.0) 48.3) 17640)))
(def *jd-the-second-jeroboam-yg-by-tnldy* (fn [Z]  (do [ (/ (* (- Z 14540.0) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))       "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"            ])))
(def *jd-the-second-jeroboam-ygcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (* (- @z-tnldy-clock3 14540.0) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))         "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"            ])))
(def *the-second-jeroboam-yg* (agent (/ (* (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 14540.0) 48.3) 17640)))
(send *the-second-jeroboam-yg* + 0)



' "(THE PARABLE OF JEROBOAM 1. . .)"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .(100D|(17640D/48.3)))"
' "(ZTP = 8259)"


(def *tnldy-by-the-first-jeroboam100d* (fn [Y] (+ (* 100 Y) 8259.0)))
(def *jd-tnldy-by-the-first-jeroboam100d* (fn [Y] (do [    (+ (* 100 Y) 8259.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 8259.0)        )))) ])))


(def *the-first-jeroboam100d-by-tnldy* (fn [Z] (/ (- Z 8259.0) 100)))
(def *jd-the-first-jeroboam100d-by-tnldy* (fn [Z]  (do [ (/ (- Z 8259.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-the-first-jeroboam100dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 8259.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *the-first-jeroboam100d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 8259.0) 100)))
(send *the-first-jeroboam100d* + 0)


(def *tnldy-by-the-first-jeroboam-yg* (fn [Y] (+ (* (/ 17640 48.3) Y) 8259.0)))
(def *jd-tnldy-by-the-first-jeroboam-yg* (fn [Y] (do [    (+ (* (/ 17640 48.3) Y) 8259.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (/ 17640 48.3) Y) 8259.0)        ))))       "which is ca."    (/ -1 (* (- (+ (* (/ 17640 48.3) Y) 8259.0) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* (/ 17640 48.3) Y) 8259.0) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"           ])))



(def *the-first-jeroboam-yg-by-tnldy* (fn [Z] (/ (* (- Z 8259.0) 48.3) 17640)))
(def *jd-the-first-jeroboam-yg-by-tnldy* (fn [Z]  (do [ (/ (* (- Z 8259.0) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))     "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"          ])))
(def *jd-the-first-jeroboam-ygcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (* (- @z-tnldy-clock3 8259.0) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))       "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"            ])))
(def *the-first-jeroboam-yg* (agent (/ (* (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 8259.0) 48.3) 17640)))
(send *the-first-jeroboam-yg* + 0)
