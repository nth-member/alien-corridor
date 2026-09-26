(ns org.threeppnoah.mdqnm.sfo36.napoleon-and-the-kings)



(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)

(import '[java.util Date])





' "(NAPOLEON. . .enters...(3500D))"
' "...there is a 'bandwidth' of (* 6.65 3500d) between KINGS.3500D (entering) and NAPOLEON.3500D (leaving)...or 23275days...or 4588.5yG/72...or 63.729166666666664yG"
' "(. . .-15(.07619048). . .<= Y <=. . .37(.528) - 38(.518). . .(3500D))"
' "(ZTP = -82936.95687)"


(def *Ynapoleon* (fn [Ykgs] (+ Ykgs 6.65)))


(def *tnldy-by-napoleon-entering3500d* (fn [Y] (+ (* 3500 Y) -82936.95687)))
(def *jd-tnldy-by-napoleon-entering3500d* (fn [Y] (do [   (+ (* 3500 Y) -82936.95687)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 3500 Y) -82936.95687)        ))))  "which is ca."    (/ -1 (* (- (+ (* 3500 Y) -82936.95687) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* 3500 Y) -82936.95687) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* 3500 Y) -82936.95687) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* 3500 Y) -82936.95687) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* 3500 Y) -82936.95687) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* 3500 Y) -82936.95687) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* 3500 Y) -82936.95687) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* 3500 Y) -82936.95687) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* 3500 Y) -82936.95687) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* 3500 Y) -82936.95687) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* 3500 Y) -82936.95687) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* 3500 Y) -82936.95687) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* 3500 Y) -82936.95687) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* 3500 Y) -82936.95687) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* 3500 Y) -82936.95687) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* 3500 Y) -82936.95687) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* 3500 Y) -82936.95687) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* 3500 Y) -82936.95687) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* 3500 Y) -82936.95687) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))

(def *napoleon-entering3500d-by-tnldy* (fn [Z] (/ (- Z -82936.95687) 3500)))
(def *jd-napoleon-entering3500d-by-tnldy* (fn [Z]  (do [  (/ (- Z -82936.95687) 3500) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))    "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"      ])))
(def *jd-napoleon-entering3500dcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 -82936.95687) 3500) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))  "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))
(def *napoleon-entering3500d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) -82936.95687) 3500)))
(send *napoleon-entering3500d* + 0)









' "(KINGS. . .leaves...(3500D))"
' "...there is a 'bandwidth' of (* 6.65 3500d) between KINGS.3500D (entering) and NAPOLEON.3500D (leaving)...or 23275days...or 4588.5yG/72...or 63.729166666666664yG"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .30(.83) - 31(.86). . .(3500D))"
' "(ZTP = -59661.95687)"


(def *Ykings* (fn [Ynp] (- Ynp 6.65)))


(def *tnldy-by-kings-leaving3500d* (fn [Y] (+ (* 3500 Y) -59661.95687)))
(def *jd-tnldy-by-kings-leaving3500d* (fn [Y] (do [   (+ (* 3500 Y) -59661.95687)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 3500 Y) -59661.95687)        ))))     "which is ca."    (/ -1 (* (- (+ (* 3500 Y) -59661.95687) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* 3500 Y) -59661.95687) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* 3500 Y) -59661.95687) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* 3500 Y) -59661.95687) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* 3500 Y) -59661.95687) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* 3500 Y) -59661.95687) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* 3500 Y) -59661.95687) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* 3500 Y) -59661.95687) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* 3500 Y) -59661.95687) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* 3500 Y) -59661.95687) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* 3500 Y) -59661.95687) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* 3500 Y) -59661.95687) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* 3500 Y) -59661.95687) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* 3500 Y) -59661.95687) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* 3500 Y) -59661.95687) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* 3500 Y) -59661.95687) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* 3500 Y) -59661.95687) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* 3500 Y) -59661.95687) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* 3500 Y) -59661.95687) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"   ])))

(def *kings-leaving3500d-by-tnldy* (fn [Z] (/ (- Z -59661.95687) 3500)))
(def *jd-kings-leaving3500d-by-tnldy* (fn [Z]  (do [  (/ (- Z -59661.95687) 3500) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))  "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"     ])))
(def *jd-kings-leaving3500dcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 -59661.95687) 3500) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))  "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"       ])))
(def *kings-leaving3500d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) -59661.95687) 3500)))
(send *kings-leaving3500d* + 0)



