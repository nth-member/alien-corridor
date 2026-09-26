(ns org.threeppnoah.mdqnm.sfo13.shulam-military-time)




(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)


(import '[java.util Date])

' "(SHULAM MILITARY TIME <DEATH-MODE> =>+ INNER GALAXY VISION DEVELOPMENT. . .)"

' "(INNER GALAXY VISION DEVELOPMENT. . .)"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .(100D|360D|(17640D/48.3)))"
' "(ZTP = 9125.434782608769)"


(def *tnldy-by-shulam-military-time-deathmode1-igvd100* (fn [Y] (+ (* 100 Y) 9125.434782608769)))
(def *jd-tnldy-by-shulam-military-time-deathmode1-igvd100* (fn [Y] (do [    (+ (* 100 Y) 9125.434782608769)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 9125.434782608769)        )))) ])))


(def *shulam-military-time-deathmode1-igvd100-by-tnldy* (fn [Z] (/ (- Z 9125.434782608769) 100)))
(def *jd-shulam-military-time-deathmode1-igvd100-by-tnldy* (fn [Z]  (do [ (/ (- Z 9125.434782608769) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-shulam-military-time-deathmode1-igvd100current-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 9125.434782608769) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *shulam-military-time-deathmode1-igvd100* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 9125.434782608769) 100)))
(send *shulam-military-time-deathmode1-igvd100* + 0)








(def *tnldy-by-shulam-military-time-deathmode1-igvd-yj* (fn [Y] (+ (* 360 Y) 9125.434782608769)))
(def *jd-tnldy-by-shulam-military-time-deathmode1-igvd-yj* (fn [Y] (do [    (+ (* 360 Y) 9125.434782608769)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 360 Y) 9125.434782608769)        )))) ])))



(def *shulam-military-time-deathmode1-igvd-yj-by-tnldy* (fn [Z] (/ (- Z 9125.434782608769) 360)))
(def *jd-shulam-military-time-deathmode1-igvd-yj-by-tnldy* (fn [Z]  (do [ (/ (- Z 9125.434782608769) 360) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-shulam-military-time-deathmode1-igvd-yjcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 9125.434782608769) 360) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *shulam-military-time-deathmode1-igvd-yj* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 9125.434782608769) 360)))
(send *shulam-military-time-deathmode1-igvd-yj* + 0)







(def *tnldy-by-shulam-military-time-deathmode1-igvd-yg* (fn [Y] (+ (* (/ 17640 48.3) Y) 9125.434782608769)))
(def *jd-tnldy-by-shulam-military-time-deathmode1-igvd-yg* (fn [Y] (do [    (+ (* (/ 17640 48.3) Y) 9125.434782608769)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (/ 17640 48.3) Y) 9125.434782608769)        )))) ])))



(def *shulam-military-time-deathmode1-igvd-yg-by-tnldy* (fn [Z] (/ (* (- Z 9125.434782608769) 48.3) 17640)))
(def *jd-shulam-military-time-deathmode1-igvd-yg-by-tnldy* (fn [Z]  (do [ (/ (* (- Z 9125.434782608769) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-shulam-military-time-deathmode1-igvd-ygcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (* (- @z-tnldy-clock3 9125.434782608769) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *shulam-military-time-deathmode1-igvd-yg* (agent (/ (* (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 9125.434782608769) 48.3) 17640)))
(send *shulam-military-time-deathmode1-igvd-yg* + 0)


' "(SHULAM MILITARY TIME <DEATH-MODE>.YG. . .(17640D/48.3))"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .(100D|(17640D/48.3)))"
' "(ZTP = 9130.4347826086956521739130434783)"


(def *tnldy-by-shulam-military-time-deathmode2-igvd-yg* (fn [Y] (+ (* (/ 17640 48.3) Y) 9130.4347826086956521739130434783)))
(def *jd-tnldy-by-shulam-military-time-deathmode2-igvd-yg* (fn [Y] (do [    (+ (* (/ 17640 48.3) Y) 9130.4347826086956521739130434783)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (/ 17640 48.3) Y) 9130.4347826086956521739130434783)        )))) ])))


(def *shulam-military-time-deathmode2-igvd-yg-by-tnldy* (fn [Z] (/ (* (- Z 9130.4347826086956521739130434783) 48.3) 17640)))
(def *jd-shulam-military-time-deathmode2-igvd-yg-by-tnldy* (fn [Z]  (do [ (/ (* (- Z 9130.4347826086956521739130434783) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-shulam-military-time-deathmode2-igvd-ygcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (* (- @z-tnldy-clock3 9130.4347826086956521739130434783) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *shulam-military-time-deathmode2-igvd-yg* (agent (/ (* (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 9130.4347826086956521739130434783) 48.3) 17640)))
(send *shulam-military-time-deathmode2-igvd-yg* + 0)


' "(UNTO THE OVERFLOW OF SHULAMMITE MILITARY .YG. . .(17640D/48.3))"
' "(. . .-21(.72619048). . .-18(.612). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .(100D|(17640D/48.3)))"
' "(ZTP = 16800)"


(def *tnldy-by-unto-the-overflow-of-the-shulammite-military-yg* (fn [Y] (+ (* (/ 17640 48.3) Y) 16800.0)))
(def *jd-tnldy-by-unto-the-overflow-of-the-shulammite-military-yg* (fn [Y] (do [    (+ (* (/ 17640 48.3) Y) 16800.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* (/ 17640 48.3) Y) 16800.0)        )))) ])))



(def *unto-the-overflow-of-the-shulammite-military-yg-by-tnldy* (fn [Z] (/ (* (- Z 16800.0) 48.3) 17640)))
(def *jd-unto-the-overflow-of-the-shulammite-military-yg-by-tnldy* (fn [Z]  (do [ (/ (* (- Z 16800.0) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))])))
(def *jd-unto-the-overflow-of-the-shulammite-military-ygcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (* (- @z-tnldy-clock3 16800.0) 48.3) 17640) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))])))
(def *unto-the-overflow-of-the-shulammite-military-yg* (agent (/ (* (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 16800.0) 48.3) 17640)))
(send *unto-the-overflow-of-the-shulammite-military-yg* + 0)





' "(...APPROACHING1 FULLY DEVELOPED PRIMARY FOLLICLE STAGE INNER GALAXY VISION DEVELOPMENT (100D)...)"
' "(. . .-18(.00). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .183(.60). . .212(.40)(100D))"
' "(ZTP = 7571.8)"


(def *tnldy-by-ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (+ (* 100 Y) 7571.8)))
(def *jd-tnldy-by-ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (do [    (+ (* 100 Y) 7571.8)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 7571.8)        ))))        "which is ca."    (/ -1 (* (- (+ (* 100 Y) 7571.8) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* 100 Y) 7571.8) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* 100 Y) 7571.8) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* 100 Y) 7571.8) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* 100 Y) 7571.8) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* 100 Y) 7571.8) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* 100 Y) 7571.8) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* 100 Y) 7571.8) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* 100 Y) 7571.8) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* 100 Y) 7571.8) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* 100 Y) 7571.8) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* 100 Y) 7571.8) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* 100 Y) 7571.8) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* 100 Y) 7571.8) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* 100 Y) 7571.8) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* 100 Y) 7571.8) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7571.8) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7571.8) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* 100 Y) 7571.8) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"          ])))


(def *ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z] (/ (- Z 7571.8) 100)))
(def *jd-ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z]  (do [ (/ (- Z 7571.8) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))       "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"         ])))
(def *jd-ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 7571.8) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))         "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"           ])))
(def *ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 7571.8) 100)))
(send *ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* + 0)





' "(...APPROACHING2 FULLY DEVELOPED PRIMARY FOLLICLE STAGE INNER GALAXY VISION DEVELOPMENT (100D)...)"
' "(. . .-18(.00). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .183(.60). . .212(.40)(100D))"
' "(ZTP = 7624.0)"


(def *tnldy-by-ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (+ (* 100 Y) 7624.0)))
(def *jd-tnldy-by-ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (do [    (+ (* 100 Y) 7624.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 7624.0)        ))))        "which is ca."    (/ -1 (* (- (+ (* 100 Y) 7624.0) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* 100 Y) 7624.0) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* 100 Y) 7624.0) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* 100 Y) 7624.0) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* 100 Y) 7624.0) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* 100 Y) 7624.0) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* 100 Y) 7624.0) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* 100 Y) 7624.0) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* 100 Y) 7624.0) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* 100 Y) 7624.0) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* 100 Y) 7624.0) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* 100 Y) 7624.0) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* 100 Y) 7624.0) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* 100 Y) 7624.0) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* 100 Y) 7624.0) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* 100 Y) 7624.0) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7624.0) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7624.0) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* 100 Y) 7624.0) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"          ])))


(def *ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z] (/ (- Z 7624.0) 100)))
(def *jd-ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z]  (do [ (/ (- Z 7624.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))       "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"         ])))
(def *jd-ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 7624.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))         "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"           ])))
(def *ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 7624.0) 100)))
(send *ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* + 0)





' "(...APPROACHING3 FULLY DEVELOPED PRIMARY FOLLICLE STAGE INNER GALAXY VISION DEVELOPMENT (100D)...)"
' "(. . .-18(.00). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .183(.60). . .212(.40)(100D))"
' "(ZTP = 7680.0)"


(def *tnldy-by-ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (+ (* 100 Y) 7680.0)))
(def *jd-tnldy-by-ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (do [    (+ (* 100 Y) 7680.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 7680.0)        ))))        "which is ca."    (/ -1 (* (- (+ (* 100 Y) 7680.0) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* 100 Y) 7680.0) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* 100 Y) 7680.0) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* 100 Y) 7680.0) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* 100 Y) 7680.0) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* 100 Y) 7680.0) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* 100 Y) 7680.0) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* 100 Y) 7680.0) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* 100 Y) 7680.0) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* 100 Y) 7680.0) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* 100 Y) 7680.0) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* 100 Y) 7680.0) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* 100 Y) 7680.0) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* 100 Y) 7680.0) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* 100 Y) 7680.0) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* 100 Y) 7680.0) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7680.0) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7680.0) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* 100 Y) 7680.0) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"          ])))


(def *ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z] (/ (- Z 7680.0) 100)))
(def *jd-ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z]  (do [ (/ (- Z 7680.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))       "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"         ])))
(def *jd-ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 7680.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))         "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"           ])))
(def *ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 7680.0) 100)))
(send *ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* + 0)






' "(...APPROACHING4 FULLY DEVELOPED PRIMARY FOLLICLE STAGE INNER GALAXY VISION DEVELOPMENT (100D)...)"
' "(. . .-18(.00). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .183(.60). . .212(.40)(100D))"
' "(ZTP = 7932.0)"


(def *tnldy-by-ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (+ (* 100 Y) 7932.0)))
(def *jd-tnldy-by-ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (do [    (+ (* 100 Y) 7932.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 7932.0)        ))))        "which is ca."    (/ -1 (* (- (+ (* 100 Y) 7932.0) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* 100 Y) 7932.0) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* 100 Y) 7932.0) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* 100 Y) 7932.0) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* 100 Y) 7932.0) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* 100 Y) 7932.0) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* 100 Y) 7932.0) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* 100 Y) 7932.0) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* 100 Y) 7932.0) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* 100 Y) 7932.0) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* 100 Y) 7932.0) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* 100 Y) 7932.0) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* 100 Y) 7932.0) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* 100 Y) 7932.0) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* 100 Y) 7932.0) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* 100 Y) 7932.0) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7932.0) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7932.0) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* 100 Y) 7932.0) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"          ])))


(def *ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z] (/ (- Z 7932.0) 100)))
(def *jd-ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z]  (do [ (/ (- Z 7932.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))       "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"         ])))
(def *jd-ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 7932.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))         "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"           ])))
(def *ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 7932.0) 100)))
(send *ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* + 0)







' "(...APPROACHING5 FULLY DEVELOPED PRIMARY FOLLICLE STAGE INNER GALAXY VISION DEVELOPMENT (100D)...)"
' "(. . .-18(.00). . .<= Y <=. . .40(.18). . .82(.80). . .111(.60). . .183(.60). . .212(.40)(100D))"
' "(ZTP = 7968.0)"


(def *tnldy-by-ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (+ (* 100 Y) 7968.0)))
(def *jd-tnldy-by-ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (fn [Y] (do [    (+ (* 100 Y) 7968.0)      (c/from-long (long (+  -4.75199E9 (* 86400000      (+ (* 100 Y) 7968.0)        ))))        "which is ca."    (/ -1 (* (- (+ (* 100 Y) 7968.0) 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"    "and"      (/ (- (+ (* 100 Y) 7968.0) (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and"  (/ (- (+ (* 100 Y) 7968.0) -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- (+ (* 100 Y) 7968.0) -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- (+ (* 100 Y) 7968.0) (/ 383250 48.3)) 360)  "on SVD.YJ" "and"  (/ (- (+ (* 100 Y) 7968.0) 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- (+ (* 100 Y) 7968.0) 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- (+ (* 100 Y) 7968.0) 12360.0) 100)  "on AGCH.100D"    "and" (/ (- (+ (* 100 Y) 7968.0) 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- (+ (* 100 Y) 7968.0) 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D" "and" (/ (- (+ (* 100 Y) 7968.0) 17651.8) 100)  "on EXE_TPDP.100D"  "and" (/ (- (+ (* 100 Y) 7968.0) 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"  "and" (/ (- (+ (* 100 Y) 7968.0) 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- (+ (* 100 Y) 7968.0) 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- (+ (* 100 Y) 7968.0) 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- (+ (* 100 Y) 7968.0) -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7968.0) -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- (+ (* 100 Y) 7968.0) 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- (+ (* 100 Y) 7968.0) 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"          ])))


(def *ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z] (/ (- Z 7968.0) 100)))
(def *jd-ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d-by-tnldy* (fn [Z]  (do [ (/ (- Z 7968.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 Z))))       "which is ca."          (/ -1 (* (- Z 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"             (/ (- Z (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- Z -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- Z -82936.95687) 3500)  "on NAPOLEON.3500D"   "and"  (/ (- Z (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- Z 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- Z 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- Z 12360.0) 100)  "on AGCH.100D"    "and" (/ (- Z 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- Z 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"    "and" (/ (- Z 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- Z 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- Z 18793.8) 100)  "on HEM-BOSS.100D"    "and" (/ (- Z 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- Z 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- Z -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- Z -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- Z 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- Z 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"         ])))
(def *jd-ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100dcurrent-by-z-tnldy-clock3* (fn []  (do [ (/ (- @z-tnldy-clock3 7968.0) 100) (c/from-long (long (+  -4.75199E9 (* 86400000 @z-tnldy-clock3))))         "which is ca."             (/ -1 (* (- z-tnldy-clock3 25931.8) (* 24 60 60)))  "on CRF_BEACON_SIGNAL.Hz"   "and"               (/ (- z-tnldy-clock3 (* -2.946061739 (Math/pow 10 6))) (/ 2800000 23)) "on  DAYS-i"   "and" (/ (- z-tnldy-clock3 -59661.95687) 3500)  "on KINGS.3500D"  "and"  (/ (- z-tnldy-clock3 -82936.95687) 3500)  "on NAPOLEON.3500D"  "and"  (/ (- z-tnldy-clock3 (/ 383250 48.3)) 360)  "on SVD.YJ"  "and"  (/ (- z-tnldy-clock3 16282.6) (/ 2800 23))  "on 10DT_ARM.2800D/23"   "and" (/ (- z-tnldy-clock3 12052.17) 100)  "on DNPS_ZTP12052.100D"  "and" (/ (- z-tnldy-clock3 12360.0) 100)  "on AGCH.100D"         "and" (/ (- z-tnldy-clock3 14160.0) 100)  "on REVOTT_ABSOLUTE_ZERO.100D"  "and" (/ (- z-tnldy-clock3 14160.0) 200)  "on REVOTTE_EIGEN_METRIC.200D"          "and" (/ (- z-tnldy-clock3 17651.8) 100)  "on EXE_TPDP.100D"   "and" (/ (- z-tnldy-clock3 18388.0) 100)  "on WITNESS_CFH_LEAVE.100D"   "and" (/ (- z-tnldy-clock3 18793.8) 100)  "on HEM-BOSS.100D"   "and" (/ (- z-tnldy-clock3 19451.8) 100)  "on TWG_TWF.100D"  "and" (/ (- z-tnldy-clock3 19544.0) 100)  "on THE_DESTROYER.100D"  "and" (/ (- z-tnldy-clock3 -10910.0) (/ 17640 48.3))  "on BUTTONWOOD_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 -10686.0) (/ 17640 48.3))  "on TONTINE-COFFEESHOP_ZTS_EON.yG"  "and" (/ (- z-tnldy-clock3 22440.0) 100)   "on END_IE_PURPOSE_BIRTH.100D"   "and"  (/ (- z-tnldy-clock3 22692.0) 100)   "on END_IE_PURPOSE_CIRCUMSPECTION.100D"           ])))
(def *ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* (agent (/ (- (/ (+ 4755602966.0  (. (new Date) getTime)) 86400000) 7968.0) 100)))
(send *ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d* + 0)











