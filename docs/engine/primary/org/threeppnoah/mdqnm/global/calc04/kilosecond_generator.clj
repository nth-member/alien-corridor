(ns org.threeppnoah.mdqnm.global.calc04.kilosecond-generator)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])
(require '[clj-time.local :as l])


(require '[clojure.string :as s])


(import '[java.util Date])





(comment "(cjtl-kilosecond-timestamp-token-generator-expects-sec-min-hour-yeardaynotvaluetosecond-and-yglongformieygadplus3880 sec min hour yeardaynotvaluetosecond yglongformieygadplus3880)") 
 

(def cjtl-kilosecond-timestamp-token-generator-expects-sec-min-hour-yeardaynotvaluetosecond-and-yglongformieygadplus3880 (fn [sec min hour yeardaynotvaluetosecond yglongformieygadplus3880] 
                                                               
 (/ (* (* (* (/ (* (- (+ (* (/ (+ (/ (+ (/ (+ (/ sec 60) min) 60) hour) 24) yeardaynotvaluetosecond) 17640) 48.3) yglongformieygadplus3880)
                      
                      (+ (/ (* 33.5 48.3) 49.0) 3880)) 17640) 48.3) 24) 60) 60) 1000)       ))

