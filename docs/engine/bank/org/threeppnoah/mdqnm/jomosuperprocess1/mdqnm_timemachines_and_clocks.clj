(ns org.threeppnoah.mdqnm.jomosuperprocess1.mdqnm-timemachines-and-clocks)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])
(require '[clj-time.local :as l])

(require 'org.threeppnoah.global.calc01.current-sfo-clockvalues :reload)
(refer 'org.threeppnoah.global.calc01.current-sfo-clockvalues)

(require 'org.threeppnoah.global.calc02.sfo-bbvalues-per-ztnldy :reload)
(refer 'org.threeppnoah.global.calc02.sfo-bbvalues-per-ztnldy)

(require 'org.threeppnoah.global.calc03.x-sfo-bbs-sparse :reload)
(refer 'org.threeppnoah.global.calc03.x-sfo-bbs-sparse)

(require 'org.threeppnoah.global.calc04.per-sfo-bb-instance-range-computus-optimized-for-hemboss-years :reload)
(refer 'org.threeppnoah.global.calc04.per-sfo-bb-instance-range-computus-optimized-for-hemboss-years)

(require 'org.threeppnoah.cognitiveradiofrequency.crf0 :reload)
(refer 'org.threeppnoah.cognitiveradiofrequency.crf0)

(require 'org.threeppnoah.mdqnm.global.calc04.kilosecond-generator :reload)
(refer 'org.threeppnoah.mdqnm.global.calc04.kilosecond-generator)

(require 'org.threeppnoah.mdqnm.calc07.iso-one-zero-six-four-six-level-one-part-one-binary :reload)
(refer 'org.threeppnoah.mdqnm.calc07.iso-one-zero-six-four-six-level-one-part-one-binary)

(require 'org.threeppnoah.mdqnm.calc08.iso-one-zero-six-four-six-level-one-part-two-binary :reload)
(refer 'org.threeppnoah.mdqnm.calc08.iso-one-zero-six-four-six-level-one-part-two-binary)

(require 'org.threeppnoah.mdqnm.calc17.iso-one-zero-six-four-six-level-one-part-one :reload)
(refer 'org.threeppnoah.mdqnm.calc17.iso-one-zero-six-four-six-level-one-part-one)

(require 'org.threeppnoah.mdqnm.calc18.iso-one-zero-six-four-six-level-one-part-two :reload)
(refer 'org.threeppnoah.mdqnm.calc18.iso-one-zero-six-four-six-level-one-part-two)

(require 'org.threeppnoah.mdqnm.calc19.iso-one-zero-six-four-six-level-two-part-one :reload)
(refer 'org.threeppnoah.mdqnm.calc19.iso-one-zero-six-four-six-level-two-part-one)

(require 'org.threeppnoah.mdqnm.calc20.iso-one-zero-six-four-six-level-two-part-two :reload)
(refer 'org.threeppnoah.mdqnm.calc20.iso-one-zero-six-four-six-level-two-part-two)

(require 'org.threeppnoah.mdqnm.calc22.data-alphabet-my-seven-octet-codes :reload)
(refer 'org.threeppnoah.mdqnm.calc22.data-alphabet-my-seven-octet-codes)

(require 'org.threeppnoah.mdqnm.calc23.noah-idiomatic-data-alphabet-one :reload)
(refer 'org.threeppnoah.mdqnm.calc23.noah-idiomatic-data-alphabet-one)

(require 'org.threeppnoah.mdqnm.calc24.noah-idiomatic-data-alphabet-two :reload)
(refer 'org.threeppnoah.mdqnm.calc24.noah-idiomatic-data-alphabet-two)

(require 'org.threeppnoah.mdqnm.calc25.gpbs-idiomatic-data-alphabet-one :reload)
(refer 'org.threeppnoah.mdqnm.calc25.gpbs-idiomatic-data-alphabet-one)

(require 'org.threeppnoah.mdqnm.calc26.gpbs-idiomatic-data-alphabet-two :reload)
(refer 'org.threeppnoah.mdqnm.calc26.gpbs-idiomatic-data-alphabet-two)

(require 'org.threeppnoah.mdqnm.calc27.tt-taop-sevendth :reload)
(refer 'org.threeppnoah.mdqnm.calc27.tt-taop-sevendth)

(require 'org.threeppnoah.mdqnm.calc28.tt-taop-htmlcolor-by-span :reload)
(refer 'org.threeppnoah.mdqnm.calc28.tt-taop-htmlcolor-by-span)

(require 'org.threeppnoah.mdqnm.calc29.tt-taop-htmlcolor-by-text :reload)
(refer 'org.threeppnoah.mdqnm.calc29.tt-taop-htmlcolor-by-text)

(require 'org.threeppnoah.mdqnm.computer.global.calc04.for-original-ascii-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc04.for-original-ascii-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform)

(require 'org.threeppnoah.mdqnm.computer.global.calc05.unsupervised-hollerith-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc05.unsupervised-hollerith-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform)

(require 'org.threeppnoah.mdqnm.computer.global.calc06.supervised-hollerith-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc06.supervised-hollerith-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform)

(require 'org.threeppnoah.mdqnm.sfo00.revott-building-blocks-and-babylon-microscale-precision-chronicle-agents-etc :reload)
(refer 'org.threeppnoah.mdqnm.sfo00.revott-building-blocks-and-babylon-microscale-precision-chronicle-agents-etc)

(require 'org.threeppnoah.mdqnm.sfo01.phd-qual-rand-seven-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo01.phd-qual-rand-seven-d)

(require 'org.threeppnoah.mdqnm.sfo02.project-hybridization-development-parametric :reload)
(refer 'org.threeppnoah.mdqnm.sfo02.project-hybridization-development-parametric)

(require 'org.threeppnoah.mdqnm.sfo03.ephesians221-building :reload)
(refer 'org.threeppnoah.mdqnm.sfo03.ephesians221-building)

(require 'org.threeppnoah.mdqnm.sfo04.roundabout-aimee :reload)
(refer 'org.threeppnoah.mdqnm.sfo04.roundabout-aimee)

(require 'org.threeppnoah.mdqnm.sfo05.the-parable-of-the-two-jeroboams :reload)
(refer 'org.threeppnoah.mdqnm.sfo05.the-parable-of-the-two-jeroboams)

(require 'org.threeppnoah.mdqnm.sfo06.the-shulammite-queen :reload)
(refer 'org.threeppnoah.mdqnm.sfo06.the-shulammite-queen)

(require 'org.threeppnoah.mdqnm.sfo07.countdowns-to-the-vision-and-the-wrath-mercy :reload)
(refer 'org.threeppnoah.mdqnm.sfo07.countdowns-to-the-vision-and-the-wrath-mercy)

(require 'org.threeppnoah.mdqnm.sfo08.the-end-ie-purpose-of-all-things-is-at-hand :reload)
(refer 'org.threeppnoah.mdqnm.sfo08.the-end-ie-purpose-of-all-things-is-at-hand)

(require 'org.threeppnoah.mdqnm.sfo09.seeking-and-finding-the-comfort-in-charity-faith-and-hope :reload)
(refer 'org.threeppnoah.mdqnm.sfo09.seeking-and-finding-the-comfort-in-charity-faith-and-hope)

(require 'org.threeppnoah.mdqnm.sfo10.miscellaneous-streamlines :reload)
(refer 'org.threeppnoah.mdqnm.sfo10.miscellaneous-streamlines)

(require 'org.threeppnoah.mdqnm.sfo11.hem-boss :reload)
(refer 'org.threeppnoah.mdqnm.sfo11.hem-boss)

(require 'org.threeppnoah.mdqnm.sfo12.ten-days-tribulation-unto-armageddon :reload)
(refer 'org.threeppnoah.mdqnm.sfo12.ten-days-tribulation-unto-armageddon)

(require 'org.threeppnoah.mdqnm.sfo13.shulam-military-time :reload)
(refer 'org.threeppnoah.mdqnm.sfo13.shulam-military-time)

(require 'org.threeppnoah.mdqnm.sfo14.embryo-genesis-seedling-plant-photosynthesis :reload)
(refer 'org.threeppnoah.mdqnm.sfo14.embryo-genesis-seedling-plant-photosynthesis)

(require 'org.threeppnoah.mdqnm.sfo15.theeatrestwork-timesavingsgrant-the144000000redemptionconsideration :reload)
(refer 'org.threeppnoah.mdqnm.sfo15.theeatrestwork-timesavingsgrant-the144000000redemptionconsideration)

(require 'org.threeppnoah.mdqnm.sfo16.thefleefactor-thefleeingflood :reload)
(refer 'org.threeppnoah.mdqnm.sfo16.thefleefactor-thefleeingflood)

(require 'org.threeppnoah.mdqnm.sfo17.thegreatthingsofgodslaw-alittleherealittlethere :reload)
(refer 'org.threeppnoah.mdqnm.sfo17.thegreatthingsofgodslaw-alittleherealittlethere)

(require 'org.threeppnoah.mdqnm.sfo18.christjesusthelord-theeverlastingfather-istheking-oftheholyfamily :reload)
(refer 'org.threeppnoah.mdqnm.sfo18.christjesusthelord-theeverlastingfather-istheking-oftheholyfamily)

(require 'org.threeppnoah.mdqnm.sfo19.thegoodsamaritansystem-implementationofthezerotradesalvation :reload)
(refer 'org.threeppnoah.mdqnm.sfo19.thegoodsamaritansystem-implementationofthezerotradesalvation)

(require 'org.threeppnoah.mdqnm.sfo20.some-derivatives-of-thegreatthingsofgodslaw-alittleherealittlethere :reload)
(refer 'org.threeppnoah.mdqnm.sfo20.some-derivatives-of-thegreatthingsofgodslaw-alittleherealittlethere)

(require 'org.threeppnoah.mdqnm.sfo21.saved-and-locked-to-the-vision :reload)
(refer 'org.threeppnoah.mdqnm.sfo21.saved-and-locked-to-the-vision)

(require 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d :reload)
(refer 'org.threeppnoah.mdqnm.sfo22.tnl-onethousand-d)

(require 'org.threeppnoah.mdqnm.sfo23.the-core-completion-matrix-for-alien-corridor-creation :reload)
(refer   'org.threeppnoah.mdqnm.sfo23.the-core-completion-matrix-for-alien-corridor-creation)

(require 'org.threeppnoah.mdqnm.sfo24.daysi-month31028-pattern :reload)
(refer   'org.threeppnoah.mdqnm.sfo24.daysi-month31028-pattern)

(require 'org.threeppnoah.mdqnm.sfo25.concerning-the-new-nation-at-nigeria :reload)
(refer 'org.threeppnoah.mdqnm.sfo25.concerning-the-new-nation-at-nigeria)

(require 'org.threeppnoah.mdqnm.sfo26.execution-of-the-total-project-development-process :reload)
(refer   'org.threeppnoah.mdqnm.sfo26.execution-of-the-total-project-development-process)

(require 'org.threeppnoah.mdqnm.sfo27.the-abstract-of-projects-matricial-multiverse :reload)
(refer 'org.threeppnoah.mdqnm.sfo27.the-abstract-of-projects-matricial-multiverse)

(require 'org.threeppnoah.mdqnm.sfo28.theworkofgod-is-triedwithfire :reload)
(refer 'org.threeppnoah.mdqnm.sfo28.theworkofgod-is-triedwithfire)

(require 'org.threeppnoah.mdqnm.sfo29.zerotradesalvation-frombuttonwood-toeuronextnyse-etal :reload)
(refer 'org.threeppnoah.mdqnm.sfo29.zerotradesalvation-frombuttonwood-toeuronextnyse-etal)

(require 'org.threeppnoah.mdqnm.sfo30.judgements-of-which-we-have-not-heard :reload)
(refer 'org.threeppnoah.mdqnm.sfo30.judgements-of-which-we-have-not-heard)

(require 'org.threeppnoah.mdqnm.sfo31.untothejudgement-untotherest-thejoyofourlord :reload)
(refer 'org.threeppnoah.mdqnm.sfo31.untothejudgement-untotherest-thejoyofourlord)

(require 'org.threeppnoah.mdqnm.sfo32.greatwhitethrone-untothejudgement-untotherest-thejoyofourlord :reload)
(refer 'org.threeppnoah.mdqnm.sfo32.greatwhitethrone-untothejudgement-untotherest-thejoyofourlord)

(require 'org.threeppnoah.mdqnm.sfo33.dark-night-of-the-prophets-soul :reload)
(refer 'org.threeppnoah.mdqnm.sfo33.dark-night-of-the-prophets-soul)

(require 'org.threeppnoah.mdqnm.sfo34.ten-days-unto-the-alternative-havens :reload)
(refer 'org.threeppnoah.mdqnm.sfo34.ten-days-unto-the-alternative-havens)

(require 'org.threeppnoah.mdqnm.sfo35.threeppnoah-beliefpropagation :reload)
(refer 'org.threeppnoah.mdqnm.sfo35.threeppnoah-beliefpropagation)

(require 'org.threeppnoah.mdqnm.sfo36.napoleon-and-the-kings :reload)
(refer 'org.threeppnoah.mdqnm.sfo36.napoleon-and-the-kings)

(require 'org.threeppnoah.mdqnm.sfo37.daysi-to-daysv-and-seventytimesseventyyearsdetermined-and-patriarchview :reload)
(refer 'org.threeppnoah.mdqnm.sfo37.daysi-to-daysv-and-seventytimesseventyyearsdetermined-and-patriarchview)

(require 'org.threeppnoah.mdqnm.sfo38.the-birth-of-the-fig-tree :reload)
(refer 'org.threeppnoah.mdqnm.sfo38.the-birth-of-the-fig-tree)

(require 'org.threeppnoah.mdqnm.sfo39.from-thisnigeria-unto-thenewnigeria :reload)
(refer 'org.threeppnoah.mdqnm.sfo39.from-thisnigeria-unto-thenewnigeria)

(require 'org.threeppnoah.mdqnm.sfo40.awindofdoctrine-anengagingproposal-anintriguingprospect :reload)
(refer 'org.threeppnoah.mdqnm.sfo40.awindofdoctrine-anengagingproposal-anintriguingprospect)

(require 'org.threeppnoah.mdqnm.sfo41.some-winds-of-doctrine :reload)
(refer 'org.threeppnoah.mdqnm.sfo41.some-winds-of-doctrine)

(require 'org.threeppnoah.mdqnm.sfo42.house-of-white-gold :reload)
(refer 'org.threeppnoah.mdqnm.sfo42.house-of-white-gold)

(require 'org.threeppnoah.mdqnm.sfo43.threeppnoah-global-turnaround :reload)
(refer 'org.threeppnoah.mdqnm.sfo43.threeppnoah-global-turnaround)

(require 'org.threeppnoah.mdqnm.sfo44.the-revelation-of-the-trial-expanded :reload)
(refer 'org.threeppnoah.mdqnm.sfo44.the-revelation-of-the-trial-expanded)

(require 'org.threeppnoah.mdqnm.sfo45.some-derivatives-of-the-revelation-of-the-trial-expanded :reload)
(refer 'org.threeppnoah.mdqnm.sfo45.some-derivatives-of-the-revelation-of-the-trial-expanded)

(require 'org.threeppnoah.mdqnm.sfo46.making-wedding :reload)
(refer 'org.threeppnoah.mdqnm.sfo46.making-wedding)

(require 'org.threeppnoah.mdqnm.sfo47.some-derivatives-of-making-wedding :reload)
(refer 'org.threeppnoah.mdqnm.sfo47.some-derivatives-of-making-wedding)

(require 'org.threeppnoah.mdqnm.sfo48.the-marriage-supper-of-the-lamb :reload)
(refer 'org.threeppnoah.mdqnm.sfo48.the-marriage-supper-of-the-lamb)

(require 'org.threeppnoah.mdqnm.sfo49.some-derivatives-of-the-marriage-supper-of-the-lamb :reload)
(refer 'org.threeppnoah.mdqnm.sfo49.some-derivatives-of-the-marriage-supper-of-the-lamb)

(require 'org.threeppnoah.mdqnm.sfo50.the-revelation-of-the-seven-day-theory :reload)
(refer 'org.threeppnoah.mdqnm.sfo50.the-revelation-of-the-seven-day-theory)

(require 'org.threeppnoah.mdqnm.sfo51.the-blessed-glorious-hope :reload)
(refer 'org.threeppnoah.mdqnm.sfo51.the-blessed-glorious-hope)

(require 'org.threeppnoah.mdqnm.sfo52.the-advent-of-the-daughter :reload)
(refer 'org.threeppnoah.mdqnm.sfo52.the-advent-of-the-daughter)

(require 'org.threeppnoah.mdqnm.sfo53.some-derivatives-of-the-revelation-of-the-seven-day-theory :reload)
(refer 'org.threeppnoah.mdqnm.sfo53.some-derivatives-of-the-revelation-of-the-seven-day-theory)

(require 'org.threeppnoah.mdqnm.sfo54.the-equations-of-unity-revisited-for-the-end :reload)
(refer 'org.threeppnoah.mdqnm.sfo54.the-equations-of-unity-revisited-for-the-end)

(require 'org.threeppnoah.mdqnm.sfo55.your-savings-are-good-you-have-the-right-idea :reload)
(refer 'org.threeppnoah.mdqnm.sfo55.your-savings-are-good-you-have-the-right-idea)

(require 'org.threeppnoah.mdqnm.sfo56.unn-job-accepted :reload)
(refer 'org.threeppnoah.mdqnm.sfo56.unn-job-accepted)


(import '[java.util Date])



(comment "the clojure.repl namespace is incredibly important for gaining access to clojure's private suite of powerful macros e.g. doc, find-doc, print-doc, ns-interns, etc")


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

(let [Z "FEASTS OF THE LORD IN THE GREAT JUBILEE YEAR 1965 TO 2034 AND BEYOND IN STANDARD FORM 700D"] (println Z))
(let [Z "...0.00                          => New Year Beginning 19650315"] (println Z))
(let [Z "0.00 -> 4(.70|.80)               => 1st SEVEN WEEKS IN THE YEAR => 30TH OF 12TH MONTH -> 18TH OF 2ND MONTH=> 1965(0103|0314) -> 1974(0318|0527)"] (println Z))
(let [Z "THE SABBATH DAY                  => Seven days of work...SEVENTH DAY FOR REST "](println Z) )
(let [Z "...1.30->1.40                    => THE LORDS PASSOVER => 14th day of the 1st month (at even) => 19670910 -> 19671119  "](println Z) )
(let [Z "...1(.40|.50)->2(.10)            => FEAST OF THE UNLEAVENED BREAD => 15th -> 21st of 1st month=> 19671119|19680129 -> 1968(0129|0409) "](println Z) )
(let [Z "...3(.10)                        => 1ST DAY OF 2ND MONTH =>  19701214|19710222 "](println Z) )
(let [Z "...4(.80|.90)->9(.60|.70)        => 2nd SEVEN WEEKS IN THE YEAR => 19TH OF 2ND MONTH -> 7TH OF 4TH MONTH=> 1974(0527|0805) -> 1983(0808|1017)           "](println Z) )
(let [Z "...6(.10)                        => 1ST DAY OF 3RD MONTH =>  1976(0913|1122) "](println Z) )
(let [Z "...9(.10)                        => 1ST DAY OF 4TH MONTH =>  1982(0614|0823) "](println Z) )
(let [Z "...9(.70|.80)->14(.50|.60)       => 3rd SEVEN WEEKS IN THE YEAR => 8TH OF 4th MONTH -> 26TH OF 5TH MONTH=> 1983(1017|1226) -> 19921229|19930309 "](println Z) )
(let [Z "...12(.10)                       => 1ST DAY OF 5TH MONTH =>  1988(0315|0524) "](println Z) )
(let [Z "...14(.60|.70)->19(.40|.50)      => 4th SEVEN WEEKS IN THE YEAR =>27TH OF 5th MONTH -> 15TH OF 7TH MONTH=> 1993(0309|0518) -> 2002(0521|0730) "](println Z) )
(let [Z "...15(.10)                       => 1ST DAY OF 6TH MONTH =>  19931214|19940222 "](println Z) )
(let [Z "...15(.30|40)                    => FEAST OF THE FIRSTFRUITS => 4th day of the 6th month (Leviticus 23:9-14) => 1994(0712|0920) "](println Z) )
(let [Z "FEAST OF WEEKS (FOR THE FIRSTFRUITS) => 50 DAYS => reckoned from morrow after the Sabbath unto morrow after the Sabbath "](println Z) )
(let [Z "...15(.60|.70)->15(.90)|16.00    => 1st SEVEN DAYS => 7th to 10th day of 6th month => 1995(0206|0417) -> 1995(0904|1113) "](println Z) )
(let [Z "...16(.10)->16(.60|.70)          => 2nd SEVEN DAYS => 11th to 17th day of 6th month=> 19951113|19960122 -> 1997(0107|0318) "](println Z) )
(let [Z "...16(.70|.80)->17(.30|.40)      => 3rd SEVEN DAYS => 18th to 24th day of 6th month=> 1997(0318|0527) -> 1998(0512|0721) "](println Z) )
(let [Z "...17(.40|.50)->18(.10)          => 4th SEVEN DAYS =>25th of 6thmth ->1st of 7thmth=> 1998(0721|0929) -> 1999(0913|1122) "](println Z) )
(let [Z "...18(.10)                       => 1ST DAY OF 7TH MONTH => THE FEAST OF TRUMPETS  => 1999(0913|1122) "](println Z) )
(let [Z "...18(.10|.20)->18(.70|.80)      => 5th SEVEN DAYS => 2nd to 8th day of 7th month  => 19991122|20000131->2001(0116|0327) "](println Z) )
(let [Z "...18.875->18(.90)|19.00         => THE GREAT DAY OF ATONEMENT=>(9th even->) 10th day of the 7th month =>2001(0519->0605|0814) "](println Z) )
(let [Z "...18(.80|.90)->19(.40|.50)      => 6th SEVEN DAYS => 9th to 15th day of 7th month => 2001(0327|0605)  ->2002(0521|0730) "](println Z) )
(let [Z "...19(.40|.50)->20(.10)          => THE FEAST OF TABERNACLES => 15TH -> 21ST DAY OF THE 7TH MONTH      =>2002(0521|0730) -> 2003(0715|0923) "](println Z) )
(let [Z "...19(.50|.60)->24(.30|.40)      => 5th SEVEN WEEKS IN THE YEAR =>16TH OF 7th MONTH -> 4TH OF 9TH MONTH=>2002(0730|1008) -> 2011(1011|1220) "](println Z) )
(let [Z "...19(.50|.60)->20(.10|.20)      => 7th SEVEN DAYS => 16th to 22nd day of 7th month=> 2002(0730|1008) -> 2003(0923|1201) "](println Z) )
(let [Z "...20(.10|20)                    => 8th DAY (a Sabbath...an holy convocation) => 23RD day of 7th month=> 2003(0923|1201) "](println Z) )
(let [Z "...20(.20|.30)                   => 50th DAY       => 23RD day of 7th month                           => 20031201|20040209 "](println Z) )
(let [Z "...21(.10)                       => 1ST DAY OF 8TH MONTH =>  2005(0614|0823) "](println Z) )
(let [Z "...24(.10)                       => 1ST DAY OF 9TH MONTH =>  2011(0315|0524) "](println Z) )
(let [Z "...24(.40|.50)->29(.20|.30)      => 6th SEVEN WEEKS IN THE YEAR =>5TH OF 9th MONTH -> 23rd OF 10TH MONTH=> 20111220|20120228 -> 2021(0303|0512) "](println Z) )
(let [Z "...26(.30|.40)                   => 24TH DAY OF THE 9TH MONTH => 2015(0811|1020) "](println Z) )
(let [Z "...27(.10)                       => 1ST DAY OF 10TH MONTH =>  20161214|20170222 "](println Z) )
(let [Z "FEAST OF WEEKS (FOR THE INGATHERING) => 50 DAYS => reckoned from morrow after the Sabbath unto morrow after the Sabbath"](println Z) )
(let [Z "...29(.30|.40)->29(.90)|30.00    => 43RD SEVEN DAYS IN THE YEAR (0 -> 7DAYS) => 24TH -> 30TH OF THE 10TH MONTH => 2021(0512|0721) -> 2022(0705|0913) "](println Z) )
(let [Z "...29(.30|.40)->34(.10|.20)      => 7th SEVEN WEEKS IN THE YEAR =>24TH OF 10th MONTH -> 12TH OF 12TH MONTH=> 2021(0512|0721) -> 2030(0724|) "](println Z) )
(let [Z "...30(.10)                       => 1ST DAY OF 11TH MONTH =>  2022(0913|1122) "](println Z) )
(let [Z "...30(.10)->30(.60|.70)          => 44TH SEVEN DAYS IN THE YEAR (7 -> 14DYS) => 1ST -> 7TH OF THE 11TH MONTH => 2022(0913|1122) -> 20231107|20240116 "](println Z) )
(let [Z "...30(.70|.80)->31(.30|.40)      => 45TH SEVEN DAYS IN THE YEAR (14 ->21DYS) => 8TH -> 14TH OF THE 11TH MONTH=> 2024(0116|0327) -> 2025(0312|0521) "](println Z) )
(let [Z "...31(.40|.50)->32(.10)          => 46TH SEVEN DAYS IN THE YEAR (21 ->28DYS) => 15TH ->21ST OF THE 11TH MONTH=> 2025(0521|0730) -> 2026(0715|0923) "](println Z) )
(let [Z "...32(.10|.20)->32(.70|.80)      => 47TH SEVEN DAYS IN THE YEAR (28 ->35DYS) => 22ND ->28TH OF THE 11TH MONTH =>2026(0923|1201) -> 20271116|20280125 "](println Z) )
(let [Z "...32(.80|.90)->33(.40|.50)      => 48TH SEVEN DAYS IN THE YEAR (35 ->42DYS) =>29TH OF 11 MTH->5TH OF 12TH MTH=>2028(0125|0405) -> 2029(0321|0530) "](println Z) )
(let [Z "...33(.10)                       => 1ST DAY OF 12TH MONTH =>  2028(0614|0823) "](println Z) )
(let [Z "...33(.50|.60)->34(.10|.20)      => 49TH SEVEN DAYS IN THE YEAR (42 ->49DYS) => 6TH ->12TH OF THE 12TH MONTH =>2029(0530|0808) -> 2030(0724|1002) "](println Z) )
(let [Z "...34(.20|.30)                   => 50TH DAY OF SEVENDAY COUNT => 13TH DAY OF THE 12TH MONTH => 2030(1002|1211) "](println Z) )
(let [Z "...34(.20|.30)->34(.80|.90)      => 50TH WEEK OF THE SEVENWEEK COUNT => 13TH -> 19TH DAY OF THE 12TH MONTH   => 2030(1002|1211) -> 20311126|20320203 "](println Z) )
(let [Z "...33(.10) -> 35.90 | 36.00      => LAST MONTH OF THE YEAR (JEW) => 2028(0614|0823) -> 2034(0105|0315) "](println Z) )
(let [Z "...36(.52)                       => END OF THE YEAR (GENTILE) => 20340315 -> 20350315 "](println Z) )
(let [Z "...40(.2207)                     => 26458 TNLDY => 40.18 END-AS-IN-PURPOSE.100D => CO-INCIDENCE "](println Z) )
(let [Z "...44(.1207)                     => 29188 TNLDY => 67.48 END-AS-IN-PURPOSE.100D "](println Z) )
(let [Z "                             ZTP => -1696.5217391306596"](println Z) )
(let [Z "GENERIC SCHEDULE FOR OPERATION BUILDING BLOCKS"](println Z) )
(let [Z "         SFO_BB = -147.60   =>    ...Primordial Follicles..."](println Z) )
(let [Z "         SFO_BB = -104.40   =>    ...Primary-Stage Follicles..."](println Z) )
(let [Z "         SFO_BB =  -61.20   =>    ...Primary-Stage (Mitotic Cells almost 0.1mm in diameter)..."](println Z) )
(let [Z "         SFO_BB =  -43.20   =>    ...Secondary-Stage Follicles (Theca Cells...Granulosa Cells 0.2mm)..."](println Z) )
(let [Z "         SFO_BB =  -39.60   =>    ...Pre-A Tertiary-Stage Follices (Antral Phase 1)..."](println Z) )
(let [Z "         SFO_BB =  -32.028  =>    ...Eh Walks Tertiary-Stage Follices (Antral Phase 2)..."](println Z) )
(let [Z "         SFO_BB =  -29.071  =>    ...Eh Not Tertiary-Stage Follices (Antral Phase 3)..."](println Z) )
(let [Z "         SFO_BB =  -25.99   =>    ...Ang Sin..."](println Z) )
(let [Z "         SFO_BB =  -23.66   =>    ...Yet 120  (Atresia 1)..."](println Z) )
(let [Z "         SFO_BB =  -22.476  =>    ...Nh 600   (Atresia 2)..."](println Z) )
(let [Z "         SFO_BB =  -21.60   =>    ...         (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 0)..."](println Z) )
(let [Z "         SFO_BB =  -20.29   =>    ...Th       (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 1)..."](println Z) )
(let [Z "         SFO_BB =  -19.60   =>    ...A2m      (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 2)..."](println Z) )
(let [Z "         SFO_BB =  -18.859  =>    ...A2m75    (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 3)..."](println Z) )
(let [Z "         SFO_BB =  -18.612  =>    ...Ic       (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 4)..."](println Z) )
(let [Z "         SFO_BB =  -18.00   =>    ...Jb       (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 5) Start of Menses..."](println Z) )
(let [Z "         SFO_BB =  -16.56   =>    ...Estrogen Surge Ends Menses 0..."](println Z) )
(let [Z "         SFO_BB =  -16.40   =>    ...Estrogen Surge Ends Menses 1..."](println Z) )
(let [Z "         SFO_BB =  -16.00   =>    ...Estrogen Surge Ends Menses 2..."](println Z) )
(let [Z "         SFO_BB =  -15.241  =>    ...Ms40     Emergence of the Dominant Follicle..."](println Z) )
(let [Z "         SFO_BB =  -15.00   =>    ...of a flood (onset)..."](println Z) )
(let [Z "         SFO_BB =  -14.40   =>    ...Early Insemination..."](println Z) )
(let [Z "         SFO_BB =  -14.157  =>    ...Pl ChM   Luteinizing Hormone surges..."](println Z) )
(let [Z "         SFO_BB =  -13.50   =>    ...Ovulation Begins For ca. 36 hours..."](println Z) )
(let [Z "         SFO_BB =  -13.32   =>    ...Ed & Sr 80yJ (Fertilized Oocyte, Zygote, Pro-Nuclei 1)..."](println Z) )
(let [Z "         SFO_BB =  -13.14   =>    ...             (Fertilized Oocyte, Zygote, Pro-Nuclei 2)..."](println Z) )
(let [Z "         SFO_BB =  -12.96   =>    ...             (Fertilized Oocyte, Zygote, Pro-Nuclei 3)..."](println Z) )
(let [Z "-12.78 <=SFO_BB<=  -12.42   =>    ...Morula Cell Division with...Blastocyst Formation of Inner and Outer Cell Mass..."](println Z) )
(let [Z "         SFO_BB =  -12.00   =>    ...of a flood (midst)..."](println Z) )
(let [Z "-12.06 <=SFO_BB<=  -11.70   =>    ...Loss of Zona Pellucida, Free Blastocyst..."](println Z) )
(let [Z "-11.70 <=SFO_BB<=  -11.34   =>    ...Attaching Blastocyst..."](println Z) )
(let [Z "-10.98 <=SFO_BB<=   -9.18   =>    ...Implantation..."](println Z) )
(let [Z "         SFO_BB =   -8.89   =>    ...prince of the covenant also..."](println Z) )
(let [Z " -8.82 <=SFO_BB<=   -8.10   =>    ...Extraembryonic Mesoderm, Primitive Streak, Gastrulation..."](println Z) )
(let [Z "         SFO_BB =   -8.00   =>    ...of a flood (end)..."](println Z) )
(let [Z "         SFO_BB =   -7.92   =>    ...Gestation at 28 days..."](println Z) )
(let [Z " -8.10 <=SFO_BB<=   -7.38   =>    ...Gastrulation, Notochordal Process..."](println Z) )
(let [Z " -7.38 <=SFO_BB<=   -6.668  =>    ...Primitive Pit, Onset of Primary Neurulation, Notochordal Canal..."](println Z) )
(let [Z "         SFO_BB =   -6.56   =>    ...Somite Number 1 (Neural Folds, Cardiac Primordium, Head Fold 1)..."](println Z) )
(let [Z "         SFO_BB =   -6.452  =>    ...Somite Number 2 (Neural Folds, Cardiac Primordium, Head Fold 2)..."](println Z) )
(let [Z "         SFO_BB =   -6.344  =>    ...Somite Number 3 (Neural Folds, Cardiac Primordium, Head Fold 3)..."](println Z) )
(let [Z "         SFO_BB =   -6.30   =>    ...league (onset)..."](println Z) )
(let [Z "         SFO_BB =   -6.236  =>    ...Somite Number 4 (Neural Fold Closes 1)..."](println Z) )
(let [Z "         SFO_BB =   -6.128  =>    ...Somite Number 5 (Neural Fold Closes 2)..."](println Z) )
(let [Z "         SFO_BB =   -6.02   =>    ...Somite Number 6 (Neural Fold Closes 3)..."](println Z) )
(let [Z "         SFO_BB =   -6.00   =>    ...league (midst)..."](println Z) )
(let [Z "         SFO_BB =   -5.912  =>    ...Somite Number 7 (Neural Fold Closes 4)..."](println Z) )
(let [Z "         SFO_BB =   -5.804  =>    ...Somite Number 8 (Neural Fold Closes 5)..."](println Z) )
(let [Z "         SFO_BB =   -5.728  =>    ...league (end)..."](println Z) )
(let [Z "         SFO_BB =   -5.696  =>    ...Somite Number 9 (Neural Fold Closes 6)..."](println Z) )
(let [Z "         SFO_BB =   -5.588  =>    ...Somite Number 10 (Neural Fold Closes 7)..."](println Z) )
(let [Z "         SFO_BB =   -5.48   =>    ...Somite Number 11 (Neural Fold Closes 8)..."](println Z) )
(let [Z "         SFO_BB =   -5.372  =>    ...Somite Number 12 (Neural Fold Closes 9)..."](println Z) )
(let [Z "         SFO_BB =   -5.264  =>    ...Somite Number 13 (Cranial or Rostral Neuropore Closes 1)..."](println Z) )
(let [Z "         SFO_BB =   -5.156  =>    ...Somite Number 14 (Cranial or Rostral Neuropore Closes 2)..."](println Z) )
(let [Z "         SFO_BB =   -5.048  =>    ...Somite Number 15 (Cranial or Rostral Neuropore Closes 3)..."](println Z) )
(let [Z "         SFO_BB =   -4.94   =>    ...Somite Number 16 (Cranial or Rostral Neuropore Closes 4)..."](println Z) )
(let [Z "         SFO_BB =   -4.832  =>    ...Somite Number 17 (Cranial or Rostral Neuropore Closes 5)..."](println Z) )
(let [Z "         SFO_BB =   -4.724  =>    ...Somite Number 18 (Cranial or Rostral Neuropore Closes 6)..."](println Z) )
(let [Z "         SFO_BB =   -4.616  =>    ...Somite Number 19 (Cranial or Rostral Neuropore Closes 7)..."](println Z) )
(let [Z "         SFO_BB =   -4.508  =>    ...Somite Number 20 (Cranial or Rostral Neuropore Closes 8)..."](println Z) )
(let [Z "         SFO_BB =   -4.40   =>    ...Somite Number 21 (Caudal Neuropore Closes 1)..."](println Z) )
(let [Z "         SFO_BB =   -4.292  =>    ...Somite Number 22 (Caudal Neuropore Closes 2)..."](println Z) )
(let [Z "         SFO_BB =   -4.184  =>    ...Somite Number 23 (Caudal Neuropore Closes 3)..."](println Z) )
(let [Z "         SFO_BB =   -4.076  =>    ...Somite Number 24 (Caudal Neuropore Closes 4)..."](println Z) )
(let [Z "         SFO_BB =   -3.968  =>    ...Somite Number 25 (Caudal Neuropore Closes 5)..."](println Z) )
(let [Z "         SFO_BB =   -3.86   =>    ...Somite Number 26 (Caudal Neuropore Closes 6)..."](println Z) )
(let [Z "         SFO_BB =   -3.752  =>    ...Somite Number 27 (Caudal Neuropore Closes 7)..."](println Z) )
(let [Z "         SFO_BB =   -3.644  =>    ...Somite Number 28 (Caudal Neuropore Closes 8)..."](println Z) )
(let [Z "         SFO_BB =   -3.536  =>    ...Somite Number 29 (Caudal Neuropore Closes 9)..."](println Z) )
(let [Z "         SFO_BB =   -3.428  =>    ...Somite Number 30 (Leg Buds, Lens Placode, Pharyngeal Arches 1)..."](println Z) )
(let [Z "         SFO_BB =   -3.32   =>    ...Somite Number 31 (Leg Buds, Lens Placode, Pharyngeal Arches 2)..."](println Z) )
(let [Z "         SFO_BB =   -3.31   =>    ...come up..."](println Z) )
(let [Z "         SFO_BB =   -3.212  =>    ...Somite Number 32 (Leg Buds, Lens Placode, Pharyngeal Arches 3)..."](println Z) )
(let [Z "         SFO_BB =   -3.104  =>    ...Somite Number 33 (Leg Buds, Lens Placode, Pharyngeal Arches 4)..."](println Z) )
(let [Z "         SFO_BB =   -2.996  =>    ...Somite Number 34 (Leg Buds, Lens Placode, Pharyngeal Arches 5)..."](println Z) )
(let [Z "         SFO_BB =   -2.888  =>    ...Somite Number 35 (Leg Buds, Lens Placode, Pharyngeal Arches 6)..."](println Z) )
(let [Z "         SFO_BB =   -2.78   =>    ...Somite Number 36 (Leg Buds, Lens Placode, Pharyngeal Arches 7)..."](println Z) )
(let [Z "         SFO_BB =   -2.672  =>    ...Somite Number 37 (Leg Buds, Lens Placode, Pharyngeal Arches 8)..."](println Z) )
(let [Z "         SFO_BB =   -2.564  =>    ...Somite Number 38 (Leg Buds, Lens Placode, Pharyngeal Arches 9)..."](println Z) )
(let [Z "         SFO_BB =   -2.456  =>    ...Somite Number 39 (Leg Buds, Lens Placode, Pharyngeal Arches 10)..."](println Z) )
(let [Z "         SFO_BB =   -2.348  =>    ...Somite Number 40 (Leg Buds, Lens Placode, Pharyngeal Arches 11)..."](println Z) )
(let [Z "         SFO_BB =   -2.24   =>    ...Somite Number 41 (Leg Buds, Lens Placode, Pharyngeal Arches 12)..."](println Z) )
(let [Z "         SFO_BB =   -2.132  =>    ...Somite Number 42 (Leg Buds, Lens Placode, Pharyngeal Arches 13)..."](println Z) )
(let [Z "         SFO_BB =   -2.024  =>    ...Somite Number 43 (Leg Buds, Lens Placode, Pharyngeal Arches 14)..."](println Z) )
(let [Z "         SFO_BB =   -1.916  =>    ...Somite Number 44 (Leg Buds, Lens Placode, Pharyngeal Arches 15)..."](println Z) )
(let [Z " -0.90 <=SFO_BB<=   +0.18   =>    ...Lens Vesicle, Nasal Pit, Hand Plate..."](println Z) )
(let [Z "         SFO_BB =   +0.00   =>    ...7Shidden..."](println Z) )
(let [Z " -0.36 <=SFO_BB<=   +0.00   =>    ...become strong with a small people..."](println Z) )
(let [Z "         SFO_BB =   +0.80   =>    ...forecast devices (time 0)..."](println Z) )
(let [Z " -0.18 <=SFO_BB<=   +1.62   =>    ...Nasal Pits move ventrally, Auricular Hillocks, Foot Plate..."](println Z) )
(let [Z "         SFO_BB =   +1.81   =>    ...1Thidden..."](println Z) )
(let [Z "  1.62 <=SFO_BB<=    2.34   =>    ...Finger Rays..."](println Z) )
(let [Z "         SFO_BB =    3.60   =>    ...AShidden..."](println Z) )
(let [Z "  2.34 <=SFO_BB<=    3.78   =>    ...Ossification commences..."](println Z) )
(let [Z "         SFO_BB =    4.40   =>    ...forecast devices (time 360)..."](println Z) )
(let [Z "  3.78 <=SFO_BB<=    4.86   =>    ...Straightening of the Trunk..."](println Z) )
(let [Z "         SFO_BB =    5.41   =>    ...2Thidden..."](println Z) )
(let [Z "  5.28 <=SFO_BB<=    5.41   =>    ...stir up..."](println Z) )
(let [Z "  4.86 <=SFO_BB<=    5.58   =>    ...Upper limbs longer and bent at elbow..."](println Z) )
(let [Z "  5.58 <=SFO_BB<=    5.94   =>    ...Hands and feet turn inward..."](println Z) )
(let [Z "         SFO_BB =    6.12   =>    ...overflow..."](println Z) )
(let [Z "         SFO_BB =    6.41   =>    ...many..."](println Z) )
(let [Z "         SFO_BB =    6.65   =>    ...they that eat of the portion of his meat..."](println Z) )
(let [Z "  5.94 <=SFO_BB<=    6.66   =>    ...Eyelids, External Ears..."](println Z) )
(let [Z "         SFO_BB =    7.20   =>    ...2Shidden..."](println Z) )
(let [Z "  6.66 <=SFO_BB<=    8.10   =>    ...Embryo is now called Fetus, Rounded Head, Body and Limbs..."](println Z) )
(let [Z "         SFO_BB =    9.01   =>    ...3Thidden shall not be as the former..."](println Z) )
(let [Z "         SFO_BB =    9.5687 =>    ...(again) Eh NOT..."](println Z) )
(let [Z "         SFO_BB =    9.72   =>    ...Baby's genitals commence development..."](println Z) )
(let [Z "         SFO_BB =    10.80  =>    ...3Shidden..."](println Z) )
(let [Z " 10.80 <=SFO_BB<=   10.95   =>    ...fourth year (onset)..."](println Z) )
(let [Z " 9.729 <=SFO_BB<=   11.1921 =>    ...have intelligence..."](println Z) )
(let [Z "         SFO_BB =   11.1921 =>    ...arms shall stand..."](println Z) )
(let [Z " 11.19 <=SFO_BB<=   11.547  =>    ...sanctuary of strength, daily sacrifice..."](println Z) )
(let [Z "         SFO_BB =   11.547  =>    ...confirm the covenant for one week ..."](println Z) )
(let [Z "         SFO_BB =   11.6919 =>    ...beginning of kingdom..."](println Z) )
(let [Z "         SFO_BB =   11.8457 =>    ...earth was divided..."](println Z) )
(let [Z " 11.52 <=SFO_BB<=   12.24   =>    ...Placenta, Baby's fingernails begin to develop..."](println Z) )
(let [Z "         SFO_BB =   12.60   =>    ...midst of the week ca. ..."](println Z) )
(let [Z "         SFO_BB =   12.61   =>    ...4Thidden..."](println Z) )
(let [Z "         SFO_BB =   12.78   =>    ...midst of the week..."](println Z) )
(let [Z "         SFO_BB =   12.90   =>    ...is set up..."](println Z) )
(let [Z "         SFO_BB =   13.318  =>    ...7S..."](println Z) )
(let [Z "         SFO_BB =   13.35   =>    ...blessed is he that waiteth..."](println Z) )
(let [Z "         SFO_BB =   14.40   =>    ...4Shidden..."](println Z) )
(let [Z " 14.40 <=SFO_BB<=   14.608  =>    ...fourth year (end)..."](println Z) )
(let [Z "         SFO_BB =   14.76   =>    ...Urine forms..."](println Z) )
(let [Z "         SFO_BB =   14.95   =>    ...sacrifice of Jephthah's Daughter..."](println Z) )
(let [Z "         SFO_BB =   15.128  =>    ...1T..."](println Z) )
(let [Z "         SFO_BB =   16.21   =>    ...5Thidden..."](println Z) )
(let [Z "         SFO_BB =   16.918  =>    ...ONE OF THE SEALS..."](println Z) )
(let [Z "         SFO_BB =   17.22   =>    ...Alexander (start)..."](println Z) )
(let [Z "         SFO_BB =   17.32   =>    ...Alexander (finish)..."](println Z) )
(let [Z "         SFO_BB =   17.71   =>    ...end of 5Thidden..."](println Z) )
(let [Z "         SFO_BB =   18.00   =>    ...5Shidden..."](println Z) )
(let [Z " 17.28 <=SFO_BB<=   18.39   =>    ...Baby's sex becomes apparent..."](println Z) )
(let [Z "         SFO_BB =   18.728  =>    ...2T..."](println Z) )
(let [Z "         SFO_BB =   19.81   =>    ...6Thidden..."](println Z) )
(let [Z "         SFO_BB =   20.00   =>    ...Mohammed and the Tares (onset)..."](println Z) )
(let [Z "         SFO_BB =   20.186  =>    ...Mohammed and the Tares (loosed)..."](println Z) )
(let [Z "         SFO_BB =   20.518  =>    ...2S..."](println Z) )
(let [Z "         SFO_BB =   21.60   =>    ...6Shidden..."](println Z) )
(let [Z " 19.81 <=SFO_BB<=   21.60   =>    ...Baby's skeleton develops visible bones..."](println Z) )
(let [Z "         SFO_BB =   22.32   =>    ...Baby can make sucking motions..."](println Z) )
(let [Z "         SFO_BB =   22.328  =>    ...3T..."](println Z) )
(let [Z "         SFO_BB =   23.41   =>    ...7Thidden, 1Vhidden..."](println Z) )
(let [Z "         SFO_BB =   23.61   =>              ...2Vhidden..."](println Z) )
(let [Z "         SFO_BB =   23.71   =>    ...ascend like a cloud to cover the land..."](println Z) )
(let [Z "         SFO_BB =   23.81   =>              ...3Vhidden..."](println Z) )
(let [Z "         SFO_BB =   24.01   =>              ...4Vhidden..."](println Z) )
(let [Z "         SFO_BB =   24.118  =>    ...3S..."](println Z) )
(let [Z "         SFO_BB =   24.21   =>              ...5Vhidden..."](println Z) )
(let [Z "         SFO_BB =   24.29   =>    ...Tower(s) of Babylon the great is fallen is fallen..."](println Z) )
(let [Z "         SFO_BB =   24.329  =>    ...midst of one week covenant..."](println Z) )
(let [Z "         SFO_BB =   24.41   =>              ...6Vhidden..."](println Z) )
(let [Z "         SFO_BB =   24.412  =>    ...deadly wound..."](println Z) )
(let [Z "         SFO_BB =   24.447  =>    ...deadly wound healed..."](println Z) )
(let [Z "         SFO_BB =   24.61   =>              ...7Vhidden..."](println Z) )
(let [Z "         SFO_BB =   24.81   =>        ...end of Vhidden..."](println Z) )
(let [Z "         SFO_BB =   24.84   =>    ...Fat accumulates (Time of Baby's Heart Quickening for Experienced Mothers)..."](println Z) )
(let [Z "         SFO_BB =   24.897  =>    ...1335 DAYS (a rapture occurs here)..."](println Z) )
(let [Z "         SFO_BB =   25.20   =>    ...end of Shidden 7YJ..."](println Z) )
(let [Z "         SFO_BB =   25.565  =>    ...7YG..."](println Z) )
(let [Z "         SFO_BB =   25.928  =>    ...4T..."](println Z) )
(let [Z "         SFO_BB =   27.01   =>    ...end of Thidden..."](println Z) )
(let [Z " 26.80 <=SFO_BB =   27.01   =>    ...Babylon fall..."](println Z) )
(let [Z "         SFO_BB =   27.36   =>    ...Baby begins to hear..."](println Z) )
(let [Z " 24.41 <=SFO_BB<=   27.41   =>    ...the court without..."](println Z) )
(let [Z "         SFO_BB =   27.718  =>    ...4S..."](println Z) )
(let [Z "         SFO_BB =   28.28   =>    ...TWO WITNESSES (begin)..."](println Z) )
(let [Z "         SFO_BB =   29.217  =>    ...Star fall..."](println Z) )
(let [Z "         SFO_BB =   29.528  =>    ...5T..."](println Z) )
(let [Z "         SFO_BB =   29.88   =>    ...Baby girl's uterus forms..."](println Z) )
(let [Z " 30.53 <=SFO_BB<=   30.638  =>    ...Abaddon Apollyon..."](println Z) )
(let [Z "         SFO_BB =   31.028  =>    ...end of 5T..."](println Z) )
(let [Z "         SFO_BB =   31.318  =>    ...5S..."](println Z) )
(let [Z " 31.50 <=SFO_BB<=   31.63   =>    ...Tidings..."](println Z) )
(let [Z "         SFO_BB =   32.13   =>    ...tabernacles 1..."](println Z) )
(let [Z "         SFO_BB =   32.40   =>    ...tabernacles 2 (Time of Baby's Heart Quickening for First-time Mothers)..."](println Z) )
(let [Z "         SFO_BB =   32.68   =>    ...tabernacles 3..."](println Z) )
(let [Z "         SFO_BB =   33.128  =>    ...6T..."](println Z) )
(let [Z "         SFO_BB =   33.504  =>    ...day, month, year 1..."](println Z) )
(let [Z "         SFO_BB =   34.00   =>    ...day, month, year 2..."](println Z) )
(let [Z "         SFO_BB =   34.30   =>    ...day, month, year 3..."](println Z) )
(let [Z "         SFO_BB =   34.918  =>    ...6S..."](println Z) )
(let [Z "         SFO_BB =   34.92   =>    ...Baby poised to gain more weight, can swallow..."](println Z) )
(let [Z "         SFO_BB =   35.418  =>    ...SEVEN THUNDERS ANGEL..."](println Z) )
(let [Z " 36.00 <=SFO_BB<=   36.52   =>    ...10H vs LAMB war..."](println Z) )
(let [Z " 36.58 <=SFO_BB<=   36.68   =>    ...TWO WITNESSES VS BEAST WAR..."](println Z) )
(let [Z " 36.68 <=SFO_BB<=   36.7033 =>    ...TWO WITNESSES BODIES LAY IN JERUSALEM..."](println Z) )
(let [Z "         SFO_BB =   36.715  =>    ...come up hither..."](println Z) )
(let [Z "         SFO_BB =   36.728  =>    ...7T, 1V..."](println Z) )
(let [Z "         SFO_BB =   36.928  =>        ...2V..."](println Z) )
(let [Z "         SFO_BB =   37.112  =>    ...end of one week covenant..."](println Z) )
(let [Z "         SFO_BB =   37.128  =>        ...3V..."](println Z) )
(let [Z "         SFO_BB =   37.328  =>        ...4V..."](println Z) )
(let [Z "         SFO_BB =   37.44   =>    ...Baby's Lanugo-Hair becomes visible..."](println Z) )
(let [Z "         SFO_BB =   37.528  =>        ...5V..."](println Z) )
(let [Z "         SFO_BB =   37.728  =>        ...6V..."](println Z) )
(let [Z "         SFO_BB =   37.928  =>        ...7V..."](println Z) )
(let [Z "         SFO_BB =   38.128  =>  ...end of vials..."](println Z) )
(let [Z "         SFO_BB =   38.3478 =>    ...Babylon comes into remembrance..."](println Z) )
(let [Z "         SFO_BB =   38.518  =>  ...end of seals..."](println Z) )
(let [Z " 39.70 <=SFO_BB<=   39.80   =>    ...MARRIAGE SUPPER..."](println Z) )
(let [Z " 39.81 <=SFO_BB<=   39.88   =>    ...LIGHT OF SEVEN DAYS..."](println Z) )
(let [Z "         SFO_BB =   39.96   =>    ...Baby's fingerprints and footprints form..."](println Z) )
(let [Z "         SFO_BB =   40.328  =>  ...end of trumpets..."](println Z) )
(let [Z " 40.18 <=SFO_BB<=   42.28   =>     ...sanctuary cleansed (end)..."](println Z) )
(let [Z " 42.48 <=SFO_BB<=   42.86   =>    ...Baby is now completely covered in Lanugo-Hair..."](println Z) )
(let [Z "         SFO_BB =   45.00   =>    ...Baby responds to voice..."](println Z) )
(let [Z "         SFO_BB =   47.52   =>    ...Baby has fingernails..."](println Z) )
(let [Z "         SFO_BB =   50.04   =>    ...Baby has grown, lungs and CNS ie Central Nervous System continue to mature..."](println Z) )
(let [Z "         SFO_BB =   52.56   =>    ...Baby's eyelids partially open and eyelashes have formed..."](println Z) )
(let [Z "         SFO_BB =   55.08   =>    ...Baby's bones are fully developed..."](println Z) )
(let [Z "         SFO_BB =   57.60   =>    ...Baby's eyes are open a good part of the time..."](println Z) )
(let [Z "         SFO_BB =   60.12   =>    ...Baby's CNS has matured to control body temperature, sexual development continues..."](println Z) )
(let [Z "         SFO_BB =   62.64   =>    ...Baby practises breathing..."](println Z) )
(let [Z "         SFO_BB =   65.16   =>    ...Baby detects light..."](println Z) )
(let [Z " 42.28 <=SFO_BB<=   67.48   =>     ...land cleansed (end)..."](println Z) )
(let [Z "         SFO_BB =   67.68   =>    ...Baby's fingernails have reached fingertips and Mother is anxious to deliver..."](println Z) )
(let [Z "         SFO_BB =   70.20   =>    ...Baby gaining weight rapidly and protective coating thickens..."](println Z) )
(let [Z "         SFO_BB =   72.00   =>    ...Twenty YJ..."](println Z) )
(let [Z "         SFO_BB =   72.72   =>    ...Mother's uterus crowded due to rapid weight gain..."](println Z) )
(let [Z "         SFO_BB =   73.043  =>    ...Twenty YG..."](println Z) )
(let [Z "         SFO_BB =   75.24   =>    ...Baby's organs are ready to function on their own..."](println Z) )
(let [Z "         SFO_BB =   75.60   =>    ...One and Twenty YJ..."](println Z) )
(let [Z "         SFO_BB =   76.695  =>    ...One and Twenty YG..."](println Z) )
(let [Z "         SFO_BB =   77.76   =>    ...Baby develops firm grasp and sheds most of the Lanugo..."](println Z) )
(let [Z "         SFO_BB =   80.28   =>    ...Baby's Chest is becoming more prominent..."](println Z) )
(let [Z "         SFO_BB =   82.80   =>    ...Due date for delivery arrives..."](println Z) )
(let [Z " 85.32 <=SFO_BB<=   85.68   =>    ...Circumcision and Mother's separation fulfilled for male-child..."](println Z) )
(let [Z "         SFO_BB =   87.84   =>    ...Mother's separation fulfilled for female-child..."](println Z) )
(let [Z "         SFO_BB =   97.20   =>    ...Dedication for male-child..."](println Z) )
(let [Z "         SFO_BB =  111.60   =>    ...Dedication for female-child..."](println Z) )
(let [Z "         SFO_BB =  183.60   =>    ...The Infant can now stand on two feet..."](println Z) )
(let [Z "         SFO_BB =  212.40   =>    ...The Infant is now called a Toddler..."](println Z) )
(let [Z "...THE FOLLOWING IS AN INSTANTANEOUS SNAPSHOT OF SELECT MDQNM (ie JOMO) SFOs..."](println Z) )



(defn mdqnm-execution-of-selected-sfos [coll] (clojure.string/join \newline coll))




(mdqnm-execution-of-selected-sfos [
   
           '\
                                   
           {:cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}
           
           '\
           
           {:hsotp-rop-lr&r-function-call "(*hsotp-rop-lr&r-hypersurface-of-the-present-regardless-of-position-lazy-reflector-and-recmitter100d* HSotP_entry_tnldy)" }                        
                                   
           '\                        
                                   
           {:global-calc-zero-three-x-sfo-bbs-sparse-embedded-function-call "(*this-function-can-recreate-any-onedimensional-sfo-and-expects-coefficientforyvalue-and-ztp* COEFF4Y Ztp)" }
           
           '\

           {:sfobb-instance-range-computus-optimized-for-hemboss-function-call "(*ranges-of-sfobb-instance-values-but-optimized-for-hemboss-expects-coeffyj-coeffyg-sfobb-ztp1-ztp2* COEFFYJ COEFFYG SFOBB Ztp1 Ztp2)"}
           
           '\
           
           {:tnldy-by-yearday-value-to-the-second-and-ygad-or-ygbc-function-call "(tnldy-by-yearday-value-to-the-second-and-ygad-or-ygbc yearday ygadorygbc)" }

           {:yearday-value-to-the-second-by-tnldy-and-ygad-or-ygbc-function-call "(yearday-value-to-the-second-by-tnldy-and-ygad-or-ygbc Z ygadorygbc)" }
           
           '\

           {:cjtl-kilosecond-timestamp-token-generator-expects-sec-min-hour-yeardaynotvaluetosecond-and-yglongformieygadplus3880-function-call "(cjtl-kilosecond-timestamp-token-generator-expects-sec-min-hour-yeardaynotvaluetosecond-and-yglongformieygadplus3880 sec min hour yeardaynotvaluetosecond yglongformieygadplus3880)"}
           
           '\
           
           {:feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-enter *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-enter*}
           
           {:feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond-in-standard-form700d *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond-in-standard-form700d*}
           
           {:feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-leave *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-leave*}
           
           '\

           {:deliverance-and-redemption-of-the-man-Adam-planted-at-ztp-in-the-garden-eastward-in-eden36000d *deliverance-and-redemption-of-the-man-Adam-planted-at-ztp-in-the-garden-eastward-in-eden36000d*}
           
           '\
                      
           {:comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-enter36000d *comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-enter36000d*}
           
           {:comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-patriarch-view36000d *comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-patriarch-view36000d*}
           
           '\
           
           {:christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d*}
           
           {:christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d*}
           
           '\
           
           {:saved-and50yj-lock-to-the-vision-yj   *saved-and50yj-lock-to-the-vision-yj*} 

           {:countdown-from-the-twenty-fourth-yj-unto-the-vision360d *countdown-from-the-twenty-fourth-yj-unto-the-vision360d*}
           
           '\
           
           {:the-creature-learns-to-be-separate-between-good-and-evil-yj *the-creature-learns-to-be-separate-between-good-and-evil-yj*}
           {:the-creature-learns-to-be-separate-between-good-and-evil-yg *the-creature-learns-to-be-separate-between-good-and-evil-yg*}
           
           '\

           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-beginning-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-beginning-yg*}
           
           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-entry-point-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-entry-point-yg*}

           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-enter-fourth-egg-within-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-enter-fourth-egg-within-yg*}

           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point1-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point1-yg*}

           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point2-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point2-yg*}
           
           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-end-purpose-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-end-purpose-yg*}                      
                      
           '\

           'A-FOCUS-ON-RECKONINGS-OF-ONE-AND-TWENTY-YEARSJ-EVEN-UNTO-THREE-AND-TWENTY-YEARSJ-STARTS-HERE

           {:a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj*}
           
           {:a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj*}
           
           {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj*}
           
           {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj*}
           
           {:judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj *judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj*}
           
           {:judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj *judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj*}
           
           'A-FOCUS-ON-RECKONINGS-OF-ONE-AND-TWENTY-YEARSJ-EVEN-UNTO-THREE-AND-TWENTY-YEARSJ-ENDS-HERE
           
           '\
           
           {:the-creature-which-god-has-made-strong-for-himself-hemboss-enter360d *the-creature-which-god-has-made-strong-for-himself-hemboss-enter360d*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss360d *the-creature-which-god-has-made-strong-for-himself-hemboss360d*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-leave360d *the-creature-which-god-has-made-strong-for-himself-hemboss-leave360d*}
           
           '\
           
           {:a-holy-firstborn1-from-the-matrix-yg *a-holy-firstborn1-from-the-matrix-yg*}

           {:a-holy-firstborn2-from-the-matrix-yg *a-holy-firstborn2-from-the-matrix-yg*}

           {:a-holy-firstborn3-from-the-matrix-my-darling-beloved-soul-yg *a-holy-firstborn3-from-the-matrix-my-darling-beloved-soul-yg*}
           
           '\

           {:days-i *days-i*}

           {:cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23 *cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23*}
           
           {:cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23 *cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23*}
           
           '\

           {:napoleon-entering3500d *napoleon-entering3500d*}

           {:kings-leaving3500d *kings-leaving3500d*}
           
           '\
                      
           {:sixty-nine-week-paramour-discovery-optimum1-boundary7d *sixty-nine-week-paramour-discovery-optimum1-boundary7d*}

           {:sixty-nine-week-paramour-discovery-optimum2-boundary7d *sixty-nine-week-paramour-discovery-optimum2-boundary7d*}
           
           
           '\
           
           {:the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-forty-days-prior-entry *the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-forty-days-prior-entry*}

           {:the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-design-point *the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-design-point*}
           
           {:the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-exit *the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-exit*}
           
           {:the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-twenty-days-after-posterior-exit-for-total180day-ztp-interval *the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-twenty-days-after-posterior-exit-for-total180day-ztp-interval*}
           
           '\

           {:from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj*}
           
           {:from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg*}
                       
           '\
           
           {:ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           {:ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           {:ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           {:ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           {:ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           '\
           
           {:revott-fully-developed-secondary-stage-follicle-cross-trained-totmotn100d *revott-fully-developed-secondary-stage-follicle-cross-trained-totmotn100d*}
           
           {:cross-trained-to-otmotn-ztp1-at-tnldy9864-enter100d *cross-trained-to-otmotn-ztp1-at-tnldy9864-enter100d*}
           
           {:cross-trained-to-otmotn-ztp2-at-tnldy9894-leave100d *cross-trained-to-otmotn-ztp2-at-tnldy9894-leave100d*}
           
           {:overcoming-the-managers-of-the-night-ztp1-at-tnldy9904-optimum700ddiv6pt9 *overcoming-the-managers-of-the-night-ztp1-at-tnldy9904-optimum700ddiv6pt9*}

           {:overcoming-the-managers-of-the-night-ztp2-at-tnldy9934-optimum700ddiv6pt9 *overcoming-the-managers-of-the-night-ztp2-at-tnldy9934-optimum700ddiv6pt9*}
           
           {:revott-onset-of-antral-phase-tertiary-stage-follicle-cross-trained-totmotn100d *revott-onset-of-antral-phase-tertiary-stage-follicle-cross-trained-totmotn100d*}
           
           '\
           
           {:shulam-she-that-is-of-me-the-new-nigeria100d *shulam-she-that-is-of-me-the-new-nigeria100d*}
           
           '\
           
           {:dark-nignt-of-the-prophets-soul100d-ztp12000 *dark-nignt-of-the-prophets-soul100d-ztp12000*}
           
           {:dark-nignt-of-the-prophets-soul100d-ztp12052pt17 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}

           {:dark-nignt-of-the-prophets-soul100d-ztp12060 *dark-nignt-of-the-prophets-soul100d-ztp12060*}
           
           '\

           'HSotP-RoP-LRR-BEGIN-ZERO-DAY
           
           {:threeppnoah-ideation-cum-proposal-presentation-implies-arthur-george-consolidated-holdings-agch-sealed-a-slave-forever-in-the-unlimited-company-the-omega-project-aimee-mungovan-zkpcdp-etc-and-culminates-with-tie-in-to-background-onset-of-gogid100d *threeppnoah-ideation-cum-proposal-presentation-implies-arthur-george-consolidated-holdings-agch-sealed-a-slave-forever-in-the-unlimited-company-the-omega-project-aimee-mungovan-zkpcdp-etc-and-culminates-with-tie-in-to-background-onset-of-gogid100d*}
           
           {:within-few-days-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d *within-few-days-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}
           
           {:in-his-estate-there-shall-rise-a-vile-person-to-whom-they-shall-not-give-the-honour-of-the-kingdom100d *in-his-estate-there-shall-rise-a-vile-person-to-whom-they-shall-not-give-the-honour-of-the-kingdom100d*}
           
           {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d*}
           
           {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d*}
           
           {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d*}
           
           {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d*}
           
           {:having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d *having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d*}

           {:yea-and-the-prince-of-the-covenant-also100d *yea-and-the-prince-of-the-covenant-also100d*}
           
           {:and-after-the-league-made-with-him-he-shall-work-deceitfully100d *and-after-the-league-made-with-him-he-shall-work-deceitfully100d*}
           
           {:for-he-shall-come-up100d *for-he-shall-come-up100d*}
           
           {:and-become-strong-with-a-small-people100d *and-become-strong-with-a-small-people100d*}
           
           {:born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}
           
           'HSotP-RoP-LRR-FINISH-ZERO-DAY
           
           '\

           'HSotP-RoP-LRR-CA-BEGIN-IMPLIES-UNTO-THE-GREATEST-LOVE
           
           {:born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}
           
           {:and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d*}
           
           {:and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d*}
           
           {:and-his-army-shall-overflow100d *and-his-army-shall-overflow100d*}
           
           {:and-many-shall-fall-down-slain100d *and-many-shall-fall-down-slain100d*}
           
           {:and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d *and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d*}
           
           {:the-ships-of-chittim-shall-come-against-him100d *the-ships-of-chittim-shall-come-against-him100d*}
           
           {:and-arms-shall-stand-on-his-part100d *and-arms-shall-stand-on-his-part100d*}
           
           {:he-shall-confirm-the-covenant-with-many-for-one-week-start100d *he-shall-confirm-the-covenant-with-many-for-one-week-start100d*}
           
           {:and-they-shall-pollute-the-sanctuary-of-strength100d *and-they-shall-pollute-the-sanctuary-of-strength100d*}
           
           {:and-shall-take-away-the-daily-sacrifice100d *and-shall-take-away-the-daily-sacrifice100d*}
           
           {:and-they-shall-place-the-abomination-that-makes-desolate100d *and-they-shall-place-the-abomination-that-makes-desolate100d*}
           
           {:seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d *seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d*}

           {:first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d *first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d*}
           
           {:one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d *one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d*}
           
           {:manchild-born-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d *manchild-born-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d*}

           'HSotP-RoP-LRR-CA-FINISH-IMPLIES-UNTO-THE-GREATEST-LOVE
           
           '\
           
           {:second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d *second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d*}
           
           {:second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d *second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d*}
                      
           {:third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d *third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d*}
           
           {:mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d *mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d*}
           
           {:gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d *gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d*}
           
           {:third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d *third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d*}
           
           {:babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d *babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d*}
           
           {:he-shall-confirm-the-covenant-with-many-for-one-week-midst100d *he-shall-confirm-the-covenant-with-many-for-one-week-midst100d*}
           
           {:the-court-that-is-without-begin100d *the-court-that-is-without-begin100d*}
           
           {:one-of-gogs-heads-is-wounded-unto-death100d *one-of-gogs-heads-is-wounded-unto-death100d*}
           
           {:after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d *after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d*}

           {:a-rapture-occurs-circa-here100d *a-rapture-occurs-circa-here100d*}

           {:fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d *fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d*}
           
           {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d*}
           
           {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d*}

           {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d*}
           
           {:fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d *fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d*}
           
           {:the-two-prophets-the-lampstands-commence-testimony100d *the-two-prophets-the-lampstands-commence-testimony100d*}

           {:fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d *fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d*}
           
           {:abaddon-apollyon100d *abaddon-apollyon100d*}
           
           {:end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d *end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d*}
           
           {:fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d *fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d*}
           
           {:but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d *but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d*}
           
           {:he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d*}
           
           {:he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d*}
           
           {:sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d *sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d*}
           
           '\
           
           'HSotP-RoP-LRR-BEGIN-IMPLIES-TRIAL-AND-THE-JUDGMENT-IN-THE-LORDS-MONEY2COR5V10-WE-MUST-ALL-APPEAR-BEFORE-THE-JUDGMENT-SEAT-OF-CHRIST-AND-INCLUDES-A-SLACK-OF-CA120DAYS-OR4MONTHS-IMPLYING-THE-HARVEST-IS-NOW

           {:sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d *sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d*}

           {:another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d *another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d*}
           
           {:the-lamb-overcoming-the-ten-horns100d *the-lamb-overcoming-the-ten-horns100d*}
           
           {:the-two-prophets-the-lampstands-war-with-the-beast-start100d *the-two-prophets-the-lampstands-war-with-the-beast-start100d*}
           
           {:the-two-prophets-the-lampstands-war-with-the-beast-finish100d *the-two-prophets-the-lampstands-war-with-the-beast-finish100d*}
           
           {:the-two-prophets-the-lampstands-war-with-the-beast-end100d *the-two-prophets-the-lampstands-war-with-the-beast-end100d*}
           
           {:seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d *seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d*}
           
           {:second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d *second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d*}
           
           {:he-shall-confirm-the-covenant-with-many-for-one-week-finish100d *he-shall-confirm-the-covenant-with-many-for-one-week-finish100d*}
           
           {:third-vial-the-rivers-and-fountains-of-waters-become-blood100d *third-vial-the-rivers-and-fountains-of-waters-become-blood100d*}
           
           {:fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d *fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d*}
           
           {:fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d *fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d*}
           
           {:sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d *sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d*}
           
           {:seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d *seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d*}
           
           {:the-end-of-the-vial-judgments100d *the-end-of-the-vial-judgments100d*}
           
           {:in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d *in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d*}
           
           {:the-end-of-the-seal-judgments *the-end-of-the-seal-judgments*}
           
           {:end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d *end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d*}
           
           {:end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d *end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d*}
           
           {:end-of-day490-marriage-supper-of-the-lamb-end100d *end-of-day490-marriage-supper-of-the-lamb-end100d*}
           
           {:the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d*}

           {:the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d*}
           
           {:end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d *end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d*}
           
           {:seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d *seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d*}
                                
           {:the-egspp-creature-sets-off-into-the-world-and-finds-its-purpose100d *the-egspp-creature-sets-off-into-the-world-and-finds-its-purpose100d*}
           
           {:the-creature-which-god-has-made-strong-for-himself-hemboss-enter100d *the-creature-which-god-has-made-strong-for-himself-hemboss-enter100d*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss100d *the-creature-which-god-has-made-strong-for-himself-hemboss100d*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-leave100d *the-creature-which-god-has-made-strong-for-himself-hemboss-leave100d*}
                                
           {:the-work-of-god-is-tried-with-fire100d *the-work-of-god-is-tried-with-fire100d*}
                     
           {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter*}

           {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d*}

           {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave*}
                    
           'HSotP-RoP-LRR-FINISH-IMPLIES-TRIAL-AND-THE-JUDGMENT-IN-THE-LORDS-MONEY-HEBREWS7-VERSE25-HE-IS-ABLE-ALSO-TO-SAVE-THEM-TO-THE-UTTERMOST-AND-INCLUDES-A-SLACK-OF-CA120DAYS-OR4MONTHS-IMPLYING-THE-HARVEST-IS-NOW
           
           '\

          'HSotP-RoP-LRR-BEGIN-IMPLIES-THE-END-OF-ALL-THINGS-AND-THE-DARK-CLOUD-THAT-IS-GOG

           {:threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d *threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d*}
    
           {:threeppnoah-idea-adoption-and-implementation-two100d *threeppnoah-idea-adoption-and-implementation-two100d*}
           
           {:threeppnoah-idea-adoption-and-implementation-three100d *threeppnoah-idea-adoption-and-implementation-three100d*}
           
           {:revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d *revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d*}
           
           {:again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d *again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d*}
           
           'HSotP-RoP-LRR-FINISH-IMPLIES-THE-END-OF-ALL-THINGS-AND-THE-DARK-CLOUD-THAT-IS-GOG
           
           '\

           {:revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d *revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d*}
           
           '\
           
           {:ten-days-tribulation-unto-armageddon2800ddiv23 *ten-days-tribulation-unto-armageddon2800ddiv23*}
           
           '\

           {:jd-tnldy-by-the-revelation-of-the-trial-expanded-expects-s2-and-w-function-call "(*jd-tnldy-by-the-revelation-of-the-trial-expanded-expects-s2-and-w* S2 W)" }
           {:jd-s2value-of-the-revelation-of-the-trial-expanded-by-tnldy-and-w-function-call "(*jd-s2value-of-the-revelation-of-the-trial-expanded-by-tnldy-and-w* Z W)" }
           {:jd-wvalue-of-the-revelation-of-the-trial-expanded-by-tnldy-and-s2-function-call "(*jd-wvalue-of-the-revelation-of-the-trial-expanded-by-tnldy-and-s2* Z S2)" }
           
           '\

           {:jd-tnldy-by-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-expects-s2star-and-wstar-function-call "(*jd-tnldy-by-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-expects-s2star-and-wstar*  S2STAR WSTAR)" }
           {:jd-s2starvalue-of-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-by-tnldy-and-wstar-function-call "(*jd-s2starvalue-of-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-by-tnldy-and-wstar*  Z WSTAR)" }
           {:jd-wstarvalue-of-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-by-tnldy-and-s2star-function-call "(*jd-wstarvalue-of-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-by-tnldy-and-s2star*  Z S2STAR)" }
           
           '\
           
           {:the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7 *the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7*}
           
           '\

           {:ephesians221-building-yg *ephesians221-building-yg*}

           {:shulam-the-queen-sdq1000ddiv7 *shulam-the-queen-sdq1000ddiv7*}

           {:project-hybridization-development-parametric28yg-jennifer700ddiv6pt9 *project-hybridization-development-parametric28yg-jennifer700ddiv6pt9*}

           {:phdp-oage40yj-nkechichioma-osoka-imama1st-eyes-on-her1-fullchannel1000ddiv7 *phdp-oage40yj-nkechichioma-osoka-imama1st-eyes-on-her1-fullchannel1000ddiv7*}

           {:phdp-oage40yj-nkechichioma-osoka-imama1st-eyes-on-her2-fullchannel1000ddiv7 *phdp-oage40yj-nkechichioma-osoka-imama1st-eyes-on-her2-fullchannel1000ddiv7*}

           {:project-hybridization-development-parametric40yg-maryann1000ddiv6pt9 *project-hybridization-development-parametric40yg-maryann1000ddiv6pt9*}

           {:project-hybridization-development-parametric40yg-obianuju1000ddiv6pt9 *project-hybridization-development-parametric40yg-obianuju1000ddiv6pt9*}

           {:roundabout-aimee-magnified-proper2731ddiv18 *roundabout-aimee-magnified-proper2731ddiv18*}
           
           '\

           {:babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w *babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w*}
            
           {:zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3*}
           
           {:zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3*}

           '\
           
           {:zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg *zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg*}

           {:zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg *zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg*}
           
           '\

          {:jd-tnldy-by-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-expects-s2-and-w-function-call "(*jd-tnldy-by-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-expects-s2-and-w* S2 W)" }
          
          {:jd-s2value-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-by-tnldy-and-w-function-call "(*jd-s2value-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-by-tnldy-and-w* Z W)" }
          
          {:jd-wvalue-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-by-tnldy-and-s2-function-call "(*jd-wvalue-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-by-tnldy-and-s2* Z S2)" }

          '\ 
          
          {:jd-tnldy-by-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-expects-s2-and-w-function-call "(*jd-tnldy-by-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-expects-s2-and-w* S2 W)" }
          
          {:jd-s2value-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-by-tnldy-and-w-function-call "(*jd-s2value-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-by-tnldy-and-w* Z W)" }
          
          {:jd-wvalue-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-by-tnldy-and-s2-function-call "(*jd-wvalue-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-by-tnldy-and-s2* Z S2)" }
           
          '\

           {:observe-i-am-getting-married-to-the-new-nigeria25ddiv9 *observe-i-am-getting-married-to-the-new-nigeria25ddiv9*}
           
           '\

           {:threeppnoah-global-turnaround-fullydeveloped250ddiv9 *threeppnoah-global-turnaround-fullydeveloped250ddiv9*}
           
           '\

           {:part1-embryo-genesis-seedling-plant-photosynthesis360d *part1-embryo-genesis-seedling-plant-photosynthesis360d*}

           {:part2-embryo-genesis-seedling-plant-photosynthesis240d *part2-embryo-genesis-seedling-plant-photosynthesis240d*}
           
           '\

           {:birth-of-the-fig-tree-minusoneeightzerozero-yj *birth-of-the-fig-tree-minusoneeightzerozero-yj*}

           {:birth-of-the-fig-tree-minusninezerofour-yj *birth-of-the-fig-tree-minusninezerofour-yj*}

           {:birth-of-the-fig-tree-zero-yj *birth-of-the-fig-tree-zero-yj*}
           
           '\

           {:the-first-jeroboam-yg *the-first-jeroboam-yg*}

           {:the-second-jeroboam-yg *the-second-jeroboam-yg*}
           
           '\

           {:the-core-completion-matrix1-for-alien-corridor-creation-knowledge-is-increased-iron-is-not-mingled-but-can-react-at-singular-heat-with-miry-clay240d *the-core-completion-matrix1-for-alien-corridor-creation-knowledge-is-increased-iron-is-not-mingled-but-can-react-at-singular-heat-with-miry-clay240d*}

           {:the-core-completion-matrix2-for-alien-corridor-creation-knowledge-is-increased-iron-is-not-mingled-but-can-react-at-singular-heat-with-miry-clay240d *the-core-completion-matrix2-for-alien-corridor-creation-knowledge-is-increased-iron-is-not-mingled-but-can-react-at-singular-heat-with-miry-clay240d*}
           
           '\

           {:the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-entering-into-a360-day-frame1-of-a-time-times-and-half-a-time-not-in-standard-form2400d *the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-entering-into-a360-day-frame1-of-a-time-times-and-half-a-time-not-in-standard-form2400d*}

           {:the-trial-ztp12053-a-minus-half-six-and-then-seventh-day-depiction-entering-into-a360-day-frame2-of-a-time-times-and-half-a-time-not-in-standard-form2400d *the-trial-ztp12053-a-minus-half-six-and-then-seventh-day-depiction-entering-into-a360-day-frame2-of-a-time-times-and-half-a-time-not-in-standard-form2400d*}
           
           '\

           {:a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg *a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg*}
           
           '\

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-enter-yg *the-creature-which-god-has-made-strong-for-himself-hemboss-enter-yg*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-yg *the-creature-which-god-has-made-strong-for-himself-hemboss-yg*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-leave-yg *the-creature-which-god-has-made-strong-for-himself-hemboss-leave-yg*}
           
           '\
           
           {:tnl-yj *tnl-yj*}
           
           {:tnl-yg *tnl-yg*}
           
           '\
           
           {:z-tnldy-clock3 @z-tnldy-clock3}
           
           (l/local-now)
           
           '\

           {:cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}
           
           
                     

] )


(println (mdqnm-execution-of-selected-sfos [
   
   
           '\
                                   
           {:cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}
           
           '\
           
           {:hsotp-rop-lr&r-function-call "(*hsotp-rop-lr&r-hypersurface-of-the-present-regardless-of-position-lazy-reflector-and-recmitter100d* HSotP_entry_tnldy)" }                        
                                   
           '\                        
                                   
           {:global-calc-zero-three-x-sfo-bbs-sparse-embedded-function-call "(*this-function-can-recreate-any-onedimensional-sfo-and-expects-coefficientforyvalue-and-ztp* COEFF4Y Ztp)" }
           
           '\

           {:sfobb-instance-range-computus-optimized-for-hemboss-function-call "(*ranges-of-sfobb-instance-values-but-optimized-for-hemboss-expects-coeffyj-coeffyg-sfobb-ztp1-ztp2* COEFFYJ COEFFYG SFOBB Ztp1 Ztp2)"}
           
           '\
           
           {:tnldy-by-yearday-value-to-the-second-and-ygad-or-ygbc-function-call "(tnldy-by-yearday-value-to-the-second-and-ygad-or-ygbc yearday ygadorygbc)" }

           {:yearday-value-to-the-second-by-tnldy-and-ygad-or-ygbc-function-call "(yearday-value-to-the-second-by-tnldy-and-ygad-or-ygbc Z ygadorygbc)" }
           
           '\

           {:cjtl-kilosecond-timestamp-token-generator-expects-sec-min-hour-yeardaynotvaluetosecond-and-yglongformieygadplus3880-function-call "(cjtl-kilosecond-timestamp-token-generator-expects-sec-min-hour-yeardaynotvaluetosecond-and-yglongformieygadplus3880 sec min hour yeardaynotvaluetosecond yglongformieygadplus3880)"}
           
           '\
           
           {:feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-enter *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-enter*}
           
           {:feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond-in-standard-form700d *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond-in-standard-form700d*}
           
           {:feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-leave *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-leave*}
           
           '\

           {:deliverance-and-redemption-of-the-man-Adam-planted-at-ztp-in-the-garden-eastward-in-eden36000d *deliverance-and-redemption-of-the-man-Adam-planted-at-ztp-in-the-garden-eastward-in-eden36000d*}
           
           '\
                      
           {:comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-enter36000d *comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-enter36000d*}
           
           {:comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-patriarch-view36000d *comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-patriarch-view36000d*}
           
           '\
           
           {:christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d*}
           
           {:christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d*}
           
           '\
           
           {:saved-and50yj-lock-to-the-vision-yj   *saved-and50yj-lock-to-the-vision-yj*} 

           {:countdown-from-the-twenty-fourth-yj-unto-the-vision360d *countdown-from-the-twenty-fourth-yj-unto-the-vision360d*}
           
           '\
           
           {:the-creature-learns-to-be-separate-between-good-and-evil-yj *the-creature-learns-to-be-separate-between-good-and-evil-yj*}
           {:the-creature-learns-to-be-separate-between-good-and-evil-yg *the-creature-learns-to-be-separate-between-good-and-evil-yg*}
           
           '\

           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-beginning-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-beginning-yg*}
           
           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-entry-point-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-entry-point-yg*}

           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-enter-fourth-egg-within-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-enter-fourth-egg-within-yg*}

           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point1-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point1-yg*}

           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point2-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point2-yg*}
           
           {:the-new-creature-in-the-end-times-tnc-itet-an-hsotp-end-purpose-yg *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-end-purpose-yg*}                      
                      
           '\

           'A-FOCUS-ON-RECKONINGS-OF-ONE-AND-TWENTY-YEARSJ-EVEN-UNTO-THREE-AND-TWENTY-YEARSJ-STARTS-HERE

           {:a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj*}
           
           {:a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj*}
           
           {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj*}
           
           {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj*}
           
           {:judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj *judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj*}
           
           {:judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj *judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj*}
           
           'A-FOCUS-ON-RECKONINGS-OF-ONE-AND-TWENTY-YEARSJ-EVEN-UNTO-THREE-AND-TWENTY-YEARSJ-ENDS-HERE
           
           '\
           
           {:the-creature-which-god-has-made-strong-for-himself-hemboss-enter360d *the-creature-which-god-has-made-strong-for-himself-hemboss-enter360d*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss360d *the-creature-which-god-has-made-strong-for-himself-hemboss360d*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-leave360d *the-creature-which-god-has-made-strong-for-himself-hemboss-leave360d*}
           
           '\
           
           {:a-holy-firstborn1-from-the-matrix-yg *a-holy-firstborn1-from-the-matrix-yg*}

           {:a-holy-firstborn2-from-the-matrix-yg *a-holy-firstborn2-from-the-matrix-yg*}

           {:a-holy-firstborn3-from-the-matrix-my-darling-beloved-soul-yg *a-holy-firstborn3-from-the-matrix-my-darling-beloved-soul-yg*}
           
           '\

           {:days-i *days-i*}

           {:cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23 *cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23*}
           
           {:cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23 *cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23*}
           
           '\

           {:napoleon-entering3500d *napoleon-entering3500d*}

           {:kings-leaving3500d *kings-leaving3500d*}
           
           '\
                      
           {:sixty-nine-week-paramour-discovery-optimum1-boundary7d *sixty-nine-week-paramour-discovery-optimum1-boundary7d*}

           {:sixty-nine-week-paramour-discovery-optimum2-boundary7d *sixty-nine-week-paramour-discovery-optimum2-boundary7d*}
           
           
           '\
           
           {:the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-forty-days-prior-entry *the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-forty-days-prior-entry*}

           {:the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-design-point *the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-design-point*}
           
           {:the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-exit *the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-exit*}
           
           {:the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-twenty-days-after-posterior-exit-for-total180day-ztp-interval *the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-twenty-days-after-posterior-exit-for-total180day-ztp-interval*}
           
           '\

           {:from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj*}
           
           {:from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg*}
                       
           '\
           
           {:ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7571-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           {:ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7624-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           {:ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7680-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           {:ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7932-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           {:ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d *ztp7968-approaching-developed-primary-follicle-inner-galaxy-vision-development100d*}
           
           '\
           
           {:revott-fully-developed-secondary-stage-follicle-cross-trained-totmotn100d *revott-fully-developed-secondary-stage-follicle-cross-trained-totmotn100d*}
           
           {:cross-trained-to-otmotn-ztp1-at-tnldy9864-enter100d *cross-trained-to-otmotn-ztp1-at-tnldy9864-enter100d*}
           
           {:cross-trained-to-otmotn-ztp2-at-tnldy9894-leave100d *cross-trained-to-otmotn-ztp2-at-tnldy9894-leave100d*}
           
           {:overcoming-the-managers-of-the-night-ztp1-at-tnldy9904-optimum700ddiv6pt9 *overcoming-the-managers-of-the-night-ztp1-at-tnldy9904-optimum700ddiv6pt9*}

           {:overcoming-the-managers-of-the-night-ztp2-at-tnldy9934-optimum700ddiv6pt9 *overcoming-the-managers-of-the-night-ztp2-at-tnldy9934-optimum700ddiv6pt9*}
           
           {:revott-onset-of-antral-phase-tertiary-stage-follicle-cross-trained-totmotn100d *revott-onset-of-antral-phase-tertiary-stage-follicle-cross-trained-totmotn100d*}
           
           '\
           
           {:shulam-she-that-is-of-me-the-new-nigeria100d *shulam-she-that-is-of-me-the-new-nigeria100d*}
           
           '\
           
           {:dark-nignt-of-the-prophets-soul100d-ztp12000 *dark-nignt-of-the-prophets-soul100d-ztp12000*}
           
           {:dark-nignt-of-the-prophets-soul100d-ztp12052pt17 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}

           {:dark-nignt-of-the-prophets-soul100d-ztp12060 *dark-nignt-of-the-prophets-soul100d-ztp12060*}
           
           '\

           'HSotP-RoP-LRR-BEGIN-ZERO-DAY
           
           {:threeppnoah-ideation-cum-proposal-presentation-implies-arthur-george-consolidated-holdings-agch-sealed-a-slave-forever-in-the-unlimited-company-the-omega-project-aimee-mungovan-zkpcdp-etc-and-culminates-with-tie-in-to-background-onset-of-gogid100d *threeppnoah-ideation-cum-proposal-presentation-implies-arthur-george-consolidated-holdings-agch-sealed-a-slave-forever-in-the-unlimited-company-the-omega-project-aimee-mungovan-zkpcdp-etc-and-culminates-with-tie-in-to-background-onset-of-gogid100d*}
           
           {:within-few-days-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d *within-few-days-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}
           
           {:in-his-estate-there-shall-rise-a-vile-person-to-whom-they-shall-not-give-the-honour-of-the-kingdom100d *in-his-estate-there-shall-rise-a-vile-person-to-whom-they-shall-not-give-the-honour-of-the-kingdom100d*}
           
           {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d*}
           
           {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d*}
           
           {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d*}
           
           {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d*}
           
           {:having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d *having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d*}

           {:yea-and-the-prince-of-the-covenant-also100d *yea-and-the-prince-of-the-covenant-also100d*}
           
           {:and-after-the-league-made-with-him-he-shall-work-deceitfully100d *and-after-the-league-made-with-him-he-shall-work-deceitfully100d*}
           
           {:for-he-shall-come-up100d *for-he-shall-come-up100d*}
           
           {:and-become-strong-with-a-small-people100d *and-become-strong-with-a-small-people100d*}
           
           {:born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}
           
           'HSotP-RoP-LRR-FINISH-ZERO-DAY
           
           '\

           'HSotP-RoP-LRR-CA-BEGIN-IMPLIES-UNTO-THE-GREATEST-LOVE
           
           {:born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}
           
           {:and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d*}
           
           {:and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d*}
           
           {:and-his-army-shall-overflow100d *and-his-army-shall-overflow100d*}
           
           {:and-many-shall-fall-down-slain100d *and-many-shall-fall-down-slain100d*}
           
           {:and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d *and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d*}
           
           {:the-ships-of-chittim-shall-come-against-him100d *the-ships-of-chittim-shall-come-against-him100d*}
           
           {:and-arms-shall-stand-on-his-part100d *and-arms-shall-stand-on-his-part100d*}
           
           {:he-shall-confirm-the-covenant-with-many-for-one-week-start100d *he-shall-confirm-the-covenant-with-many-for-one-week-start100d*}
           
           {:and-they-shall-pollute-the-sanctuary-of-strength100d *and-they-shall-pollute-the-sanctuary-of-strength100d*}
           
           {:and-shall-take-away-the-daily-sacrifice100d *and-shall-take-away-the-daily-sacrifice100d*}
           
           {:and-they-shall-place-the-abomination-that-makes-desolate100d *and-they-shall-place-the-abomination-that-makes-desolate100d*}
           
           {:seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d *seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d*}

           {:first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d *first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d*}
           
           {:one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d *one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d*}
           
           {:manchild-born-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d *manchild-born-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d*}

           'HSotP-RoP-LRR-CA-FINISH-IMPLIES-UNTO-THE-GREATEST-LOVE
           
           '\
           
           {:second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d *second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d*}
           
           {:second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d *second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d*}
                      
           {:third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d *third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d*}
           
           {:mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d *mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d*}
           
           {:gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d *gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d*}
           
           {:third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d *third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d*}
           
           {:babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d *babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d*}
           
           {:he-shall-confirm-the-covenant-with-many-for-one-week-midst100d *he-shall-confirm-the-covenant-with-many-for-one-week-midst100d*}
           
           {:the-court-that-is-without-begin100d *the-court-that-is-without-begin100d*}
           
           {:one-of-gogs-heads-is-wounded-unto-death100d *one-of-gogs-heads-is-wounded-unto-death100d*}
           
           {:after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d *after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d*}

           {:a-rapture-occurs-circa-here100d *a-rapture-occurs-circa-here100d*}

           {:fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d *fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d*}
           
           {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d*}
           
           {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d*}

           {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d*}
           
           {:fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d *fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d*}
           
           {:the-two-prophets-the-lampstands-commence-testimony100d *the-two-prophets-the-lampstands-commence-testimony100d*}

           {:fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d *fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d*}
           
           {:abaddon-apollyon100d *abaddon-apollyon100d*}
           
           {:end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d *end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d*}
           
           {:fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d *fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d*}
           
           {:but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d *but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d*}
           
           {:he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d*}
           
           {:he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d*}
           
           {:sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d *sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d*}
           
           '\
           
           'HSotP-RoP-LRR-BEGIN-IMPLIES-TRIAL-AND-THE-JUDGMENT-IN-THE-LORDS-MONEY2COR5V10-WE-MUST-ALL-APPEAR-BEFORE-THE-JUDGMENT-SEAT-OF-CHRIST-AND-INCLUDES-A-SLACK-OF-CA120DAYS-OR4MONTHS-IMPLYING-THE-HARVEST-IS-NOW

           {:sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d *sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d*}

           {:another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d *another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d*}
           
           {:the-lamb-overcoming-the-ten-horns100d *the-lamb-overcoming-the-ten-horns100d*}
           
           {:the-two-prophets-the-lampstands-war-with-the-beast-start100d *the-two-prophets-the-lampstands-war-with-the-beast-start100d*}
           
           {:the-two-prophets-the-lampstands-war-with-the-beast-finish100d *the-two-prophets-the-lampstands-war-with-the-beast-finish100d*}
           
           {:the-two-prophets-the-lampstands-war-with-the-beast-end100d *the-two-prophets-the-lampstands-war-with-the-beast-end100d*}
           
           {:seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d *seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d*}
           
           {:second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d *second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d*}
           
           {:he-shall-confirm-the-covenant-with-many-for-one-week-finish100d *he-shall-confirm-the-covenant-with-many-for-one-week-finish100d*}
           
           {:third-vial-the-rivers-and-fountains-of-waters-become-blood100d *third-vial-the-rivers-and-fountains-of-waters-become-blood100d*}
           
           {:fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d *fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d*}
           
           {:fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d *fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d*}
           
           {:sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d *sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d*}
           
           {:seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d *seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d*}
           
           {:the-end-of-the-vial-judgments100d *the-end-of-the-vial-judgments100d*}
           
           {:in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d *in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d*}
           
           {:the-end-of-the-seal-judgments *the-end-of-the-seal-judgments*}
           
           {:end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d *end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d*}
           
           {:end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d *end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d*}
           
           {:end-of-day490-marriage-supper-of-the-lamb-end100d *end-of-day490-marriage-supper-of-the-lamb-end100d*}
           
           {:the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d*}

           {:the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d*}
           
           {:end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d *end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d*}
           
           {:seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d *seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d*}
                                
           {:the-egspp-creature-sets-off-into-the-world-and-finds-its-purpose100d *the-egspp-creature-sets-off-into-the-world-and-finds-its-purpose100d*}
           
           {:the-creature-which-god-has-made-strong-for-himself-hemboss-enter100d *the-creature-which-god-has-made-strong-for-himself-hemboss-enter100d*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss100d *the-creature-which-god-has-made-strong-for-himself-hemboss100d*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-leave100d *the-creature-which-god-has-made-strong-for-himself-hemboss-leave100d*}
                                
           {:the-work-of-god-is-tried-with-fire100d *the-work-of-god-is-tried-with-fire100d*}
                     
           {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter*}

           {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d*}

           {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave*}
                    
           'HSotP-RoP-LRR-FINISH-IMPLIES-TRIAL-AND-THE-JUDGMENT-IN-THE-LORDS-MONEY-HEBREWS7-VERSE25-HE-IS-ABLE-ALSO-TO-SAVE-THEM-TO-THE-UTTERMOST-AND-INCLUDES-A-SLACK-OF-CA120DAYS-OR4MONTHS-IMPLYING-THE-HARVEST-IS-NOW
           
           '\

          'HSotP-RoP-LRR-BEGIN-IMPLIES-THE-END-OF-ALL-THINGS-AND-THE-DARK-CLOUD-THAT-IS-GOG

           {:threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d *threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d*}
    
           {:threeppnoah-idea-adoption-and-implementation-two100d *threeppnoah-idea-adoption-and-implementation-two100d*}
           
           {:threeppnoah-idea-adoption-and-implementation-three100d *threeppnoah-idea-adoption-and-implementation-three100d*}
           
           {:revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d *revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d*}
           
           {:again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d *again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d*}
           
           'HSotP-RoP-LRR-FINISH-IMPLIES-THE-END-OF-ALL-THINGS-AND-THE-DARK-CLOUD-THAT-IS-GOG
           
           '\

           {:revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d *revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d*}
           
           '\
           
           {:ten-days-tribulation-unto-armageddon2800ddiv23 *ten-days-tribulation-unto-armageddon2800ddiv23*}
           
           '\

           {:jd-tnldy-by-the-revelation-of-the-trial-expanded-expects-s2-and-w-function-call "(*jd-tnldy-by-the-revelation-of-the-trial-expanded-expects-s2-and-w* S2 W)" }
           {:jd-s2value-of-the-revelation-of-the-trial-expanded-by-tnldy-and-w-function-call "(*jd-s2value-of-the-revelation-of-the-trial-expanded-by-tnldy-and-w* Z W)" }
           {:jd-wvalue-of-the-revelation-of-the-trial-expanded-by-tnldy-and-s2-function-call "(*jd-wvalue-of-the-revelation-of-the-trial-expanded-by-tnldy-and-s2* Z S2)" }
           
           '\

           {:jd-tnldy-by-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-expects-s2star-and-wstar-function-call "(*jd-tnldy-by-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-expects-s2star-and-wstar*  S2STAR WSTAR)" }
           {:jd-s2starvalue-of-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-by-tnldy-and-wstar-function-call "(*jd-s2starvalue-of-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-by-tnldy-and-wstar*  Z WSTAR)" }
           {:jd-wstarvalue-of-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-by-tnldy-and-s2star-function-call "(*jd-wstarvalue-of-the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-by-tnldy-and-s2star*  Z S2STAR)" }
           
           '\
           
           {:the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7 *the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7*}
           
           '\

           {:ephesians221-building-yg *ephesians221-building-yg*}

           {:shulam-the-queen-sdq1000ddiv7 *shulam-the-queen-sdq1000ddiv7*}

           {:project-hybridization-development-parametric28yg-jennifer700ddiv6pt9 *project-hybridization-development-parametric28yg-jennifer700ddiv6pt9*}

           {:phdp-oage40yj-nkechichioma-osoka-imama1st-eyes-on-her1-fullchannel1000ddiv7 *phdp-oage40yj-nkechichioma-osoka-imama1st-eyes-on-her1-fullchannel1000ddiv7*}

           {:phdp-oage40yj-nkechichioma-osoka-imama1st-eyes-on-her2-fullchannel1000ddiv7 *phdp-oage40yj-nkechichioma-osoka-imama1st-eyes-on-her2-fullchannel1000ddiv7*}

           {:project-hybridization-development-parametric40yg-maryann1000ddiv6pt9 *project-hybridization-development-parametric40yg-maryann1000ddiv6pt9*}

           {:project-hybridization-development-parametric40yg-obianuju1000ddiv6pt9 *project-hybridization-development-parametric40yg-obianuju1000ddiv6pt9*}

           {:roundabout-aimee-magnified-proper2731ddiv18 *roundabout-aimee-magnified-proper2731ddiv18*}
           
           '\

           {:babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w *babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w*}
            
           {:zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3*}
           
           {:zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3*}

           '\
           
           {:zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg *zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg*}

           {:zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg *zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg*}
           
           '\

          {:jd-tnldy-by-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-expects-s2-and-w-function-call "(*jd-tnldy-by-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-expects-s2-and-w* S2 W)" }
          
          {:jd-s2value-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-by-tnldy-and-w-function-call "(*jd-s2value-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-by-tnldy-and-w* Z W)" }
          
          {:jd-wvalue-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-by-tnldy-and-s2-function-call "(*jd-wvalue-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp1-by-tnldy-and-s2* Z S2)" }

          '\ 
          
          {:jd-tnldy-by-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-expects-s2-and-w-function-call "(*jd-tnldy-by-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-expects-s2-and-w* S2 W)" }
          
          {:jd-s2value-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-by-tnldy-and-w-function-call "(*jd-s2value-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-by-tnldy-and-w* Z W)" }
          
          {:jd-wvalue-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-by-tnldy-and-s2-function-call "(*jd-wvalue-of-zero-trade-salvation-universe-hemboss-inside-absolute-centralization-unto-utter-decentralization-ztp2-by-tnldy-and-s2* Z S2)" }
           
          '\

           {:observe-i-am-getting-married-to-the-new-nigeria25ddiv9 *observe-i-am-getting-married-to-the-new-nigeria25ddiv9*}
           
           '\

           {:threeppnoah-global-turnaround-fullydeveloped250ddiv9 *threeppnoah-global-turnaround-fullydeveloped250ddiv9*}
           
           '\

           {:part1-embryo-genesis-seedling-plant-photosynthesis360d *part1-embryo-genesis-seedling-plant-photosynthesis360d*}

           {:part2-embryo-genesis-seedling-plant-photosynthesis240d *part2-embryo-genesis-seedling-plant-photosynthesis240d*}
           
           '\

           {:birth-of-the-fig-tree-minusoneeightzerozero-yj *birth-of-the-fig-tree-minusoneeightzerozero-yj*}

           {:birth-of-the-fig-tree-minusninezerofour-yj *birth-of-the-fig-tree-minusninezerofour-yj*}

           {:birth-of-the-fig-tree-zero-yj *birth-of-the-fig-tree-zero-yj*}
           
           '\

           {:the-first-jeroboam-yg *the-first-jeroboam-yg*}

           {:the-second-jeroboam-yg *the-second-jeroboam-yg*}
           
           '\

           {:the-core-completion-matrix1-for-alien-corridor-creation-knowledge-is-increased-iron-is-not-mingled-but-can-react-at-singular-heat-with-miry-clay240d *the-core-completion-matrix1-for-alien-corridor-creation-knowledge-is-increased-iron-is-not-mingled-but-can-react-at-singular-heat-with-miry-clay240d*}

           {:the-core-completion-matrix2-for-alien-corridor-creation-knowledge-is-increased-iron-is-not-mingled-but-can-react-at-singular-heat-with-miry-clay240d *the-core-completion-matrix2-for-alien-corridor-creation-knowledge-is-increased-iron-is-not-mingled-but-can-react-at-singular-heat-with-miry-clay240d*}
           
           '\

           {:the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-entering-into-a360-day-frame1-of-a-time-times-and-half-a-time-not-in-standard-form2400d *the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-entering-into-a360-day-frame1-of-a-time-times-and-half-a-time-not-in-standard-form2400d*}

           {:the-trial-ztp12053-a-minus-half-six-and-then-seventh-day-depiction-entering-into-a360-day-frame2-of-a-time-times-and-half-a-time-not-in-standard-form2400d *the-trial-ztp12053-a-minus-half-six-and-then-seventh-day-depiction-entering-into-a360-day-frame2-of-a-time-times-and-half-a-time-not-in-standard-form2400d*}
           
           '\

           {:a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg *a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg*}
           
           '\

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-enter-yg *the-creature-which-god-has-made-strong-for-himself-hemboss-enter-yg*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-yg *the-creature-which-god-has-made-strong-for-himself-hemboss-yg*}

           {:the-creature-which-god-has-made-strong-for-himself-hemboss-leave-yg *the-creature-which-god-has-made-strong-for-himself-hemboss-leave-yg*}
           
           '\
           
           {:tnl-yj *tnl-yj*}
           
           {:tnl-yg *tnl-yg*}
           
           '\
           
           {:z-tnldy-clock3 @z-tnldy-clock3}
           
           (l/local-now)
           
           '\

           {:cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}
           
           
                     

] )
)



