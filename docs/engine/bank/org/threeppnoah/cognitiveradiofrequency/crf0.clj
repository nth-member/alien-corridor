(ns org.threeppnoah.cognitiveradiofrequency.crf0)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)

(import '[java.util Date])



' "(COGNITIVE RADIO FREQUENCY TUNER FOR THE HERTZ SIGNAL)"
' "(=< 1.0E-15  1.0E-14  1.0E-13  1.0E-12  1.0E-11  1.0E-10  1.0E-9  ...Crf (ie Y)... 6.65E-9  13.35E-9  18.29E-9  40.18E-9  82.80E-9  241.20E-9   1.0E-6   1.0E-5   1.0E-4    1.0E-3   1.0E-2   1.0E-1... 1 (all values in Hz))"




(def *tnldy-by-cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal* (fn [Y] (- 25931.8 (/ 1 (* Y 24 60 60)))))
(def *jd-tnldy-by-cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal* (fn [Y]  (do [ (- 25931.8 (/ 1 (* Y 24 60 60))) (c/from-long (long (+  -4.75199E9 (* 86400000 (- 25931.8 (/ 1 (* Y 24 60 60))))))) "which is ca."    (/ -1 (* (- (- 25931.8 (/ 1 (* Y 24 60 60))) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (- 25931.8 (/ 1 (* Y 24 60 60))) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))

(def *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal-by-tnldy* (fn [Z] (/ 1 (* (- 25931.8 Z) 24 60 60))))
(def *jd-cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal-by-tnldy* (fn [Z]  (do [ (/ 1 (* (- 25931.8 Z) 24 60 60)) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))    "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"     ])))
(def *jd-cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signalcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ 1 (* (- 25931.8 @z-tnldy-clock3) 24 60 60)) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))   "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"        ])))

(def *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal* (agent  (/ 1 (* (- 25931.8 (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000)) 24 60 60))))
(send *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal* + 0)






