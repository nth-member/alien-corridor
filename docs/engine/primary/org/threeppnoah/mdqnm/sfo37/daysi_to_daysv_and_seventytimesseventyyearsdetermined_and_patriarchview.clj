(ns org.threeppnoah.mdqnm.sfo37.daysi-to-daysv-and-seventytimesseventyyearsdetermined-and-patriarchview)


(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)

(import '[java.util Date])


' "(DAYSi TO DAYSv (AND DET.70YJ|DET.70YG|PTRCH.VW). . .)"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .24(.40417128|.40417607143). . .(DYSi|DYSii|DYSiii|DYSiv|DYSv))"
' "(ZTP = )"


(def *tnldy-by-seventy-times-seventy-years-determined70yj* (fn [Y] (+ (* 25200 Y) -1765696.522)))
(def *jd-tnldy-by-seventy-times-seventy-years-determined70yj* (fn [Y] (do [   (+ (* 25200 Y) -1765696.522)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 25200 Y) -1765696.522)        )))) ])))



(def *seventy-times-seventy-years-determined70yj-by-tnldy* (fn [Z] (/ (- Z -1765696.522) 25200)))
(def *jd-seventy-times-seventy-years-determined70yj-by-tnldy* (fn [Z]  (do [  (/ (- Z -1765696.522) 25200) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-seventy-times-seventy-years-determined70yjcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 -1765696.522) 25200) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *seventy-times-seventy-years-determined70yj* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) -1765696.522) 25200)))
(send *seventy-times-seventy-years-determined70yj* + 0)






(def *tnldy-by-seventy-times-seventy-years-determined70yg* (fn [Y] (+ (* (/ 1234800 48.3) Y) -1756336.5)))
(def *jd-tnldy-by-seventy-times-seventy-years-determined70yg* (fn [Y] (do [   (+ (* (/ 1234800 48.3) Y) -1756336.5)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* (/ 1234800 48.3) Y) -1756336.5)        )))) ])))



(def *seventy-times-seventy-years-determined70yg-by-tnldy* (fn [Z] (/ (* (- Z -1756336.5) 48.3) 1234800)))
(def *jd-seventy-times-seventy-years-determined70yg-by-tnldy* (fn [Z]  (do [  (/ (* (- Z -1756336.5) 48.3) 1234800) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-seventy-times-seventy-years-determined70ygcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (* (- @z-tnldy-clock3 -1756336.5) 48.3) 1234800) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *seventy-times-seventy-years-determined70yg* (agent (/ (* (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) -1756336.5) 48.3) 1234800)))
(send *seventy-times-seventy-years-determined70yg* + 0)








(def *tnldy-by-fortynine-times-onehundred-years-determined-in-patriarchview100yj* (fn [Y] (+ (* 36000 Y) -1762456.522)))
(def *jd-tnldy-by-fortynine-times-onehundred-years-determined-in-patriarchview100yj* (fn [Y] (do [   (+ (* 36000 Y) -1762456.522)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* 36000 Y) -1762456.522)        )))) ])))


(def *fortynine-times-onehundred-years-determined-in-patriarchview100yj-by-tnldy* (fn [Z] (/ (- Z -1762456.522) 36000)))
(def *jd-fortynine-times-onehundred-years-determined-in-patriarchview100yj-by-tnldy* (fn [Z]  (do [  (/ (- Z -1762456.522) 36000) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-fortynine-times-onehundred-years-determined-in-patriarchview100yjcurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (- @z-tnldy-clock3 -1762456.522) 36000) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *fortynine-times-onehundred-years-determined-in-patriarchview100yj* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) -1762456.522) 36000)))
(send *fortynine-times-onehundred-years-determined-in-patriarchview100yj* + 0)









' "(...EEEEVVVIII!!! NOTE: THAT JODA-TIME LAB THROWS OUT-OF-BOUNDS EXCEPTION FOR DAYS-V, DAYS-IV, AND DAYS-III...HENCE EXCLUSION)"


(def *tnldy-by-days-v* (fn [Yv] (+ (* (Math/pow (/ 28000 23) 5) (* 100 Yv)) (* -6.525518738 (Math/pow 10 18)))))

(def *days-v-by-tnldy* (fn [Z] (/ (/ (- Z (* -6.525518738 (Math/pow 10 18))) (Math/pow (/ 28000 23) 5)) 100)))
(def *days-v* (agent (* (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000)  (* -6.525518738 (Math/pow 10 18)))  100) (Math/pow (/ 28000 23) -5))))
(send *days-v* + 0)


(def *tnldy-by-days-iv* (fn [Yiv] (+ (* (Math/pow (/ 28000 23) 4) (* 100 Yiv)) (* -5.360247535 (Math/pow 10 15)))))

(def *days-iv-by-tnldy* (fn [Z] (/ (/ (- Z (* -5.360247535 (Math/pow 10 15))) (Math/pow (/ 28000 23) 4)) 100)))
(def *days-iv* (agent (* (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000)  (* -5.360247535 (Math/pow 10 15)))  100) (Math/pow (/ 28000 23) -4))))
(send *days-iv* + 0)


(def *tnldy-by-days-iii* (fn [Yiii] (+ (* (Math/pow (/ 28000 23) 3) (* 100 Yiii)) (* -4.40306045 (Math/pow 10 12)))))

(def *days-iii-by-tnldy* (fn [Z] (/ (/ (- Z (* -4.40306045 (Math/pow 10 12))) (Math/pow (/ 28000 23) 3)) 100)))
(def *days-iii* (agent (* (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000)  (* -4.40306045 (Math/pow 10 12)))  100) (Math/pow (/ 28000 23) -3))))
(send *days-iii* + 0)







(def *tnldy-by-days-ii* (fn [Yii] (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9)))))
(def *jd-tnldy-by-days-ii* (fn [Yii] (do [   (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9)))      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9)))        ))))        "which is ca."    (/ -1 (* (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 2) (* 100 Yii)) (* -3.616774795 (Math/pow 10 9))) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"         ])))



(def *days-ii-by-tnldy* (fn [Z] (/ (/ (- Z (* -3.616774795 (Math/pow 10 9))) (Math/pow (/ 28000 23) 2)) 100)))
(def *jd-days-ii-by-tnldy* (fn [Z]  (do [  (/ (/ (- Z (* -3.616774795 (Math/pow 10 9))) (Math/pow (/ 28000 23) 2)) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))      "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"        ])))
(def *jd-days-iicurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (/ (- @z-tnldy-clock3 (* -3.616774795 (Math/pow 10 9))) (Math/pow (/ 28000 23) 2)) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))     "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"        ])))
(def *days-ii* (agent (* (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000)  (* -3.616774795 (Math/pow 10 9)))  100) (Math/pow (/ 28000 23) -2))))
(send *days-ii* + 0)






(def *tnldy-by-days-i* (fn [Yi] (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6)))))
(def *jd-tnldy-by-days-i* (fn [Yi] (do [   (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6)))      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6)))        ))))   "which is ca."    (/ -1 (* (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* (Math/pow (/ 28000 23) 1) (* 100 Yi)) (* -2.946061739 (Math/pow 10 6))) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"     ])))


(def *days-i-by-tnldy* (fn [Z] (/ (/ (- Z (* -2.946061739 (Math/pow 10 6))) (Math/pow (/ 28000 23) 1)) 100)))
(def *jd-days-i-by-tnldy* (fn [Z]  (do [  (/ (/ (- Z (* -2.946061739 (Math/pow 10 6))) (Math/pow (/ 28000 23) 1)) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))   "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"      ])))
(def *jd-days-icurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (/ (- @z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (Math/pow (/ 28000 23) 1)) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))      "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"         ])))
(def *days-i* (agent (* (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000)  (* -2.946061739 (Math/pow 10 6)))  100) (Math/pow (/ 28000 23) -1))))
(send *days-i* + 0)








(def *tnldy-by-days-one* (fn [Yone] (+ (* (Math/pow (/ 28000 23) 0) (* 100 Yone)) (* 22.440 (Math/pow 10 3)))))
(def *jd-tnldy-by-days-one* (fn [Yone] (do [   (+ (* (Math/pow (/ 28000 23) 0) (* 100 Yone)) (* 22.440 (Math/pow 10 3)))      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* (Math/pow (/ 28000 23) 0) (* 100 Yone)) (* 22.440 (Math/pow 10 3)))        )))) ])))


(def *days-one-by-tnldy* (fn [Z] (/ (/ (- Z (* 22.440 (Math/pow 10 3))) (Math/pow (/ 28000 23) 0)) 100)))
(def *jd-days-one-by-tnldy* (fn [Z]  (do [  (/ (/ (- Z (* 22.440 (Math/pow 10 3))) (Math/pow (/ 28000 23) 0)) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z))))])))
(def *jd-days-onecurrent-by-z-tnldy-clock3* (fn []  (do [  (/ (/ (- @z-tnldy-clock3 (* 22.440 (Math/pow 10 3))) (Math/pow (/ 28000 23) 0)) 100) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))])))
(def *days-one* (agent (* (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000)  (* 22.440 (Math/pow 10 3)))  100) (Math/pow (/ 28000 23) -0))))
(send *days-one* + 0)



' "('...CLEANSING ALL THE LAND WITH ALL JUDGMENT...MARY...(17640D/144.9) AKA (2800D/23))"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .82(.80). . .111(.60). . .)"
' "(ZTP = 18242.434782608696)"


(def *tnldy-by-cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23* (fn [Y] (+ (* (/ 17640 144.9) Y) 18242.434782608696)))
(def *jd-tnldy-by-cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23* (fn [Y] (do [    (+ (* (/ 17640 144.9) Y) 18242.434782608696)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* (/ 17640 144.9) Y) 18242.434782608696)  ))))  "which is ca."    (/ -1 (* (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18242.434782608696) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"  ])))


(def *cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23-by-tnldy* (fn [Z] (/ (- Z 18242.434782608696)  (/ 17640 144.9))))
(def *jd-cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23-by-tnldy* (fn [Z]  (do [ (/  (- Z 18242.434782608696)  (/ 17640 144.9)) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z)))) "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))
(def *jd-cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23current-by-z-tnldy-clock3* (fn []  (do [ (/  (- @z-tnldy-clock3 18242.434782608696)  (/ 17640 144.9)) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))  "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))
(def *cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 18242.434782608696)  (/ 17640 144.9))))
(send *cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23* + 0)




' "('...CLEANSING ALL THE LAND WITH ALL JUDGMENT...JESUS...(17640D/144.9) AKA (2800D/23))"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .82(.80). . .111(.60). . .)"
' "(ZTP = 18286.087086956482)"


(def *tnldy-by-cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23* (fn [Y] (+ (* (/ 17640 144.9) Y) 18286.087086956482)))
(def *jd-tnldy-by-cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23* (fn [Y] (do [    (+ (* (/ 17640 144.9) Y) 18286.087086956482)      (c/from-long (long (+  -4.71067826004296721E9 (* 86400000      (+ (* (/ 17640 144.9) Y) 18286.087086956482)  ))))  "which is ca."    (/ -1 (* (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* (/ 17640 144.9) Y) 18286.087086956482) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"  ])))


(def *cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23-by-tnldy* (fn [Z] (/ (- Z 18286.087086956482)  (/ 17640 144.9))))
(def *jd-cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23-by-tnldy* (fn [Z]  (do [ (/  (- Z 18286.087086956482)  (/ 17640 144.9)) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 Z)))) "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))
(def *jd-cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23current-by-z-tnldy-clock3* (fn []  (do [ (/  (- @z-tnldy-clock3 18286.087086956482)  (/ 17640 144.9)) (c/from-long (long (+  -4.71067826004296721E9 (* 86400000 @z-tnldy-clock3))))  "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"    ])))
(def *cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23* (agent (/ (- (/ (+ 4703009116.6521022066013043478202  (. (new Date) getTime)) 86400000) 18286.087086956482)  (/ 17640 144.9))))
(send *cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23* + 0)
