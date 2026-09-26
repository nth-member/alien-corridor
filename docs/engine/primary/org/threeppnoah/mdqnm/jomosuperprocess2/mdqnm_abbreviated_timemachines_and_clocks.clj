(ns org.threeppnoah.mdqnm.jomosuperprocess2.mdqnm-abbreviated-timemachines-and-clocks)

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

(require 'org.threeppnoah.mdqnm.global.calc05.global-participating-bank-system-description-field-ciphers :reload)
(refer 'org.threeppnoah.mdqnm.global.calc05.global-participating-bank-system-description-field-ciphers)

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

(require 'org.threeppnoah.mdqnm.calc32.tt-taop-htmlcolor-by-span-transparent :reload)
(refer 'org.threeppnoah.mdqnm.calc32.tt-taop-htmlcolor-by-span-transparent)

(require 'org.threeppnoah.mdqnm.calc32.tt-taop-htmlcolor-by-span-transparent-zero :reload)
(refer 'org.threeppnoah.mdqnm.calc32.tt-taop-htmlcolor-by-span-transparent-zero)

(require 'org.threeppnoah.mdqnm.calc33.tt-taop-htmlcolor-by-text-transparent :reload)
(refer 'org.threeppnoah.mdqnm.calc33.tt-taop-htmlcolor-by-text-transparent)

(require 'org.threeppnoah.mdqnm.calc33.tt-taop-htmlcolor-by-text-transparent-zero :reload)
(refer 'org.threeppnoah.mdqnm.calc33.tt-taop-htmlcolor-by-text-transparent-zero)

(require 'org.threeppnoah.mdqnm.computer.global.calc04.for-original-ascii-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc04.for-original-ascii-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform)

(require 'org.threeppnoah.mdqnm.computer.global.calc05.unsupervised-hollerith-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc05.unsupervised-hollerith-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform)

(require 'org.threeppnoah.mdqnm.computer.global.calc06.supervised-hollerith-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc06.supervised-hollerith-eight-bit-to-seven-bit-reduction-ie-for-emitone-code-in-nodeexe-platform)

(require 'org.threeppnoah.mdqnm.computer.global.calc07.iso-one-zero-six-four-six-level-one-as-utf-eight :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc07.iso-one-zero-six-four-six-level-one-as-utf-eight)

(require 'org.threeppnoah.mdqnm.computer.global.calc08.iso-one-zero-six-four-six-level-two-as-utf-eight :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc08.iso-one-zero-six-four-six-level-two-as-utf-eight)

(require 'org.threeppnoah.mdqnm.computer.global.calc42.iso-one-zero-six-four-six-level-one-as-interpretation-one :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc42.iso-one-zero-six-four-six-level-one-as-interpretation-one)

(require 'org.threeppnoah.mdqnm.computer.global.calc42.iso-one-zero-six-four-six-level-one-as-interpretation-one-escape :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc42.iso-one-zero-six-four-six-level-one-as-interpretation-one-escape)

(require 'org.threeppnoah.mdqnm.computer.global.calc43.iso-one-zero-six-four-six-level-one-as-interpretation-two :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc43.iso-one-zero-six-four-six-level-one-as-interpretation-two)

(require 'org.threeppnoah.mdqnm.computer.global.calc44.iso-one-zero-six-four-six-level-two-as-interpretation-one :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc44.iso-one-zero-six-four-six-level-two-as-interpretation-one)

(require 'org.threeppnoah.mdqnm.computer.global.calc44.iso-one-zero-six-four-six-level-two-as-interpretation-one-escape :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc44.iso-one-zero-six-four-six-level-two-as-interpretation-one-escape)

(require 'org.threeppnoah.mdqnm.computer.global.calc45.iso-one-zero-six-four-six-level-two-as-interpretation-two :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc45.iso-one-zero-six-four-six-level-two-as-interpretation-two)

(require 'org.threeppnoah.mdqnm.computer.global.calc49.dtmf-dual-tone-six-multi-frequency-signalling :reload)
(refer 'org.threeppnoah.mdqnm.computer.global.calc49.dtmf-dual-tone-six-multi-frequency-signalling)

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


(let [Z "DISPENSATION IV => DAYS IV.100 yGad|yGbc (+ (* (+ ( * (Math/pow (/ 28000 23) 4) 100 -9.17)  -5.360247535E15)  (/ 48.3 17640))  (+ 1969 (/ 391 420))) "](println Z) )
(let [Z "         SFO_BB =  -18.00   =>    -2.5502215499385555E13...from the day that thou wast created..."](println Z) )
(let [Z "         SFO_BB =  -16.40   =>    -2.453996241042909E13..."](println Z) )
(let [Z "         SFO_BB =  -16.00   =>    -2.4299399138189977E13...till iniquity was found in thee..."](println Z) )
(let [Z "         SFO_BB =  -15.00   =>    -2.3697990957592184E13..."](println Z) )
(let [Z "         SFO_BB =  -12.00   =>    -2.189376641579881E13...by the multitude of thy merchandise they have filled thee with violence..."](println Z) )
(let [Z "         SFO_BB =  -11.20   =>    -2.1412639871320574E13..."](println Z) )
(let [Z "         SFO_BB =  -10.39   =>    -2.0925499245036363E13...and thou hast sinned..."](println Z) )
(let [Z "         SFO_BB =   -3.31   =>    -1.6667529326403996E13..."](println Z) )
(let [Z "         SFO_BB =   +0.00   =>    -1.4676868248625305E13...the mountain of GOD..."](println Z) )
(let [Z "         SFO_BB =   +1.81   =>    -1.35883194417433E13..."](println Z) )
(let [Z "         SFO_BB =    3.09   =>    -1.281851697057813E13..."](println Z) )
(let [Z "         SFO_BB =    3.60   =>    -1.2511798798473256E13..."](println Z) )
(let [Z "         SFO_BB =    5.41   =>    -1.1423249991591252E13...stones of fire..."](println Z) )
(let [Z "         SFO_BB =    6.12   =>    -1.099625018336682E13...stones of fire..."](println Z) )
(let [Z "         SFO_BB =    6.41   =>    -1.0821841810993459E13...stones of fire..."](println Z) )
(let [Z "         SFO_BB =    6.65   =>    -1.067750384764999E13...stones of fire..."](println Z) )
(let [Z "         SFO_BB =    7.20   =>    -1.0346729348321205E13..."](println Z) )
(let [Z "         SFO_BB =    9.01   =>    -9.258180541439201E12..."](println Z) )
(let [Z "         SFO_BB =    10.80  =>    -8.181659898169154E12..."](println Z) )
(let [Z "         SFO_BB =    10.95  =>    -8.091448671079487E12..."](println Z) )
(let [Z "         SFO_BB =    11.20  =>    -7.941096625930039E12...thou hast defiled thy sanctuaries by the multitude of thine iniquities..."](println Z) )
(let [Z "         SFO_BB =   11.547  =>    -7.7324079872626045E12..."](println Z) )
(let [Z "         SFO_BB =   11.69   =>    -7.646406617437121E12..."](println Z) )
(let [Z "         SFO_BB =   11.8457 =>    -7.552767363718045E12..."](println Z) )
(let [Z "         SFO_BB =   12.41   =>    -7.213392727406712E12..."](println Z) )
(let [Z "         SFO_BB =   12.61   =>    -7.093111091287153E12..."](println Z) )
(let [Z "         SFO_BB =   12.78   =>    -6.990871700585528E12..."](println Z) )
(let [Z "         SFO_BB =   12.90   =>    -6.918702718913793E12..."](println Z) )
(let [Z "         SFO_BB =   13.318  =>    -6.667314099423916E12..."](println Z) )
(let [Z "         SFO_BB =   13.35   =>    -6.648069037644787E12..."](println Z) )
(let [Z "         SFO_BB =   13.834  =>    -6.356987478235456E12..."](println Z) )
(let [Z "         SFO_BB =   14.40   =>    -6.016590448017106E12..."](println Z) )
(let [Z "         SFO_BB =   14.61   =>    -5.89029473009157E12..."](println Z) )
(let [Z "         SFO_BB =   15.128  =>    -5.578765292541913E12..."](println Z) )
(let [Z "         SFO_BB =   16.21   =>    -4.928041641135102E12..."](println Z) )
(let [Z "         SFO_BB =   16.918  =>    -4.502244649271866E12..."](println Z) )
(let [Z "         SFO_BB =   17.71   =>    -4.0259293702384146E12..."](println Z) )
(let [Z "         SFO_BB =   18.00   =>    -3.8515209978650557E12..."](println Z) )
(let [Z "         SFO_BB =   18.29   =>    -3.677112625491697E12...HAST THOU CAUSED THE DAYSPRING TO KNOW HIS PLACE?..."](println Z) )
(let [Z "         SFO_BB =   18.39   =>    -3.616971807431916E12..."](println Z) )
(let [Z "         SFO_BB =   18.50   =>    -3.550816907566159E12..."](println Z) )
(let [Z "         SFO_BB =   18.728  =>    -3.4136958423898613E12..."](println Z) )
(let [Z "         SFO_BB =   19.24   =>    -3.105774853923795E12..."](println Z) )
(let [Z "         SFO_BB =   19.72   =>    -2.8170989272368545E12..."](println Z) )
(let [Z "         SFO_BB =   19.81   =>    -2.7629721909830527E12..."](println Z) )
(let [Z "         SFO_BB =   20.00   =>    -2.6487046366694717E12..."](println Z) )
(let [Z "         SFO_BB =   20.518  =>    -2.337175199119816E12..."](println Z) )
(let [Z "         SFO_BB =   21.60   =>    -1.6864515477130032E12..."](println Z) )
(let [Z "         SFO_BB =   22.328  =>    -1.2486263922378142E12..."](println Z) )
(let [Z "         SFO_BB =   22.44   =>    -1.1812686760108594E12..."](println Z) )
(let [Z "         SFO_BB =   23.00   =>    -8.444800948760961E11..."](println Z) )
(let [Z "         SFO_BB =   23.22   =>    -7.121702951445828E11...by the iniquity of thy traffick..."](println Z) )
(let [Z "         SFO_BB =   23.41   =>    -5.979027408310016E11..."](println Z) )
(let [Z "         SFO_BB =   23.61   =>    -4.776211047114457E11..."](println Z) )
(let [Z "         SFO_BB =   23.71   =>    -4.1748028665166364E11..."](println Z) )
(let [Z "         SFO_BB =   23.81   =>    -3.573394685918871E11..."](println Z) )
(let [Z "         SFO_BB =   24.01   =>    -2.3705783247232584E11..."](println Z) )
(let [Z "         SFO_BB =   24.118  =>    -1.7210574896776736E11..."](println Z) )
(let [Z "         SFO_BB =   24.21   =>    -1.1677619635276724E11..."](println Z) )
(let [Z "         SFO_BB =   24.27   =>    -8.069170551690297E10..."](println Z) )
(let [Z "         SFO_BB =   24.29   =>    -6.8663541904945465E10..."](println Z) )
(let [Z "         SFO_BB =   24.31   =>    -5.663537829299071E10..."](println Z) )
(let [Z " SFO_BB = 24.3693357142857142857=> -18.00 dysiii.100 => -2.095039431994833E10..."](println Z) )
(let [Z "         SFO_BB =   24.37065    => -16.40 dysiii.100 => -2.0159972139733925E10..."](println Z) )
(let [Z "         SFO_BB =   24.37097    => -16.00 dysiii.100 => -1.996752152194166E10..."](println Z) )
(let [Z "         SFO_BB =   24.3718     => -15.00 dysiii.100 => -1.946835273204666E10..."](println Z) )
(let [Z "         SFO_BB =   24.37426    => -12.00 dysiii.100 => -1.798888860777464E10..."](println Z) )
(let [Z "         SFO_BB = 24.3749214285 => -11.20 dysiii.100 => -1.759110009699714E10..."](println Z) )
(let [Z "         SFO_BB =   24.375587   => -10.39 dysiii.100 => -1.7190819952122616E10..."](println Z) )
(let [Z "         SFO_BB =   24.3814025  =>  -3.31 dysiii.100 => -1.369333067785488E10...How art thou fallen from heaven, O Lucifer, son of the morning..."](println Z) )
(let [Z "         SFO_BB =   24.384125   =>   0.00 dysiii.100 => -1.2055996906178928E10..."](println Z) )
(let [Z "         SFO_BB =   24.389386   =>   6.41 dysiii.100 =>   -8.891988468053808E9..."](println Z) )
(let [Z "         SFO_BB =   24.404176   =>  24.41 dysiii.100 =>      2838522.988571428..."](println Z) )
(let [Z "         SFO_BB =   24.41       =>        dysiii.100 =>  3.5054397667885714E9..."](println Z) )


(let [Z "DISPENSATION III => DAYS III.100 yGad|yGbc (+ (* (+ ( * (Math/pow (/ 28000 23) 3) 100 20.00)  -4.40306045E12)  (/ 48.3 17640))  (+ 1969 (/ 391 420))) "](println Z) )
(let [Z "         SFO_BB =  -18.00   =>    -2.0948246408669727E10..."](println Z) )
(let [Z "         SFO_BB =  -16.40   =>    -2.0157824228455486E10..."](println Z) )
(let [Z "         SFO_BB =  -16.00   =>    -1.9960218683401928E10..."](println Z) )
(let [Z "         SFO_BB =  -15.00   =>    -1.9466204820768024E10..."](println Z) )
(let [Z "         SFO_BB =  -12.00   =>    -1.7984163232866325E10..."](println Z) )
(let [Z "         SFO_BB =  -11.20   =>    -1.7588952142759205E10...Cronus and the Titans found in space and time..."](println Z) )
(let [Z "         SFO_BB =  -10.39   =>    -1.7188800914025745E10..."](println Z) )
(let [Z "         SFO_BB =   -3.31   =>    -1.3691182766577734E10...Cosmic Background Radiation...formation of galactic superclusters (begin)..."](println Z) )
(let [Z "         SFO_BB =   +0.00   =>    -1.2055996881259523E10...Universe is expanding rapidly (begin)..."](println Z) )
(let [Z "         SFO_BB =   +1.81   =>    -1.1161831789892162E10..."](println Z) )
(let [Z "         SFO_BB =    3.09   =>    -1.0529494045720772E10..."](println Z) )
(let [Z "         SFO_BB =    3.60   =>    -1.0277546975777481E10..."](println Z) )
(let [Z "         SFO_BB =    5.41   =>      -9.383381884410122E9..."](println Z) )
(let [Z "         SFO_BB =    6.12   =>      -9.032632041940052E9...formation of galactic superclusters (end)..."](println Z) )
(let [Z "         SFO_BB =    6.41   =>      -8.889368021776222E9...THE LOCAL SUPERCLUSTER..."](println Z) )
(let [Z "         SFO_BB =    6.65   =>      -8.770804694744085E9...beginning of the star which became the Sun of earth's solar system..."](println Z) )
(let [Z "         SFO_BB =    7.20   =>       -8.49909707029544E9...Universe is expanding rapidly (end)..."](println Z) )
(let [Z "         SFO_BB =    9.01   =>     -7.6049319789280815E9...formation of the Virgo group (cluster) of galaxies..."](println Z) )
(let [Z "         SFO_BB =    10.80  =>      -6.720647164813398E9..."](println Z) )
(let [Z "         SFO_BB =    10.95  =>      -6.646545085418314E9..."](println Z) )
(let [Z "         SFO_BB =    11.20  =>       -6.52304161975984E9...the gravitational pull of Virgo (with thousands of galaxies) on The Local Group deccelerates the pace of expansion on the latter..."](println Z) )
(let [Z "         SFO_BB =   11.547  =>      -6.351618809425876E9..."](println Z) )
(let [Z "         SFO_BB =   11.69   =>      -6.280974827069228E9..."](println Z) )
(let [Z "         SFO_BB =   11.8457 =>      -6.204056868657129E9...formation of the Local Group (Cluster) of Galaxies (Milky Way and Andromeda are largest members)...(begin)..."](println Z) )
(let [Z "         SFO_BB =   12.41   =>       -5.92528484597282E9...formation of the Local Group (Cluster) of Galaxies (Milky Way and Andromeda are largest members)...(end)..."](println Z) )
(let [Z "         SFO_BB =   12.61   =>      -5.826482073446039E9..."](println Z) )
(let [Z "         SFO_BB =   12.78   =>      -5.742499716798277E9..."](println Z) )
(let [Z "         SFO_BB =   12.90   =>      -5.683218053282208E9..."](println Z) )
(let [Z "         SFO_BB =   13.318  =>      -5.476720258701239E9...Supernova infolds on itself producing a violent explosion that sends material (ie chemical elements) that will form the Solar Nebula across Space..."](println Z) )
(let [Z "         SFO_BB =   13.35   =>      -5.460911815096954E9..."](println Z) )
(let [Z "         SFO_BB =   13.834  =>      -5.221809105582147E9...Star-seeded Nebula forming..."](println Z) )
(let [Z "         SFO_BB =   13.954  =>      -5.162527442066077E9...Matter (3 families of 4 elementary particles each vis quarks, leptons, neutrinos) combining uniquely to form earth..."](println Z) )
(let [Z "         SFO_BB =   14.40   =>      -4.942197259331358E9..."](println Z) )
(let [Z "         SFO_BB =   14.61   =>       -4.83845434817824E9..."](println Z) )
(let [Z "         SFO_BB =   15.128  =>     -4.5825551673338785E9...Earth forms from Star-seeded Nebula..."](println Z) )
(let [Z "         SFO_BB =   16.00   =>     -4.1517750791171174E9...life in oceans..."](println Z) )
(let [Z "         SFO_BB =   16.21   =>      -4.048032167963998E9...Plate Tectonics forms early continents (begin)..."](println Z) )
(let [Z "         SFO_BB =   16.918  =>      -3.698270353219197E9..."](println Z) )
(let [Z "         SFO_BB =   17.71   =>      -3.307011374013147E9...Plate Tectonics forms early continents (end)..."](println Z) )
(let [Z "         SFO_BB =   18.00   =>     -3.1637473538493176E9..."](println Z) )
(let [Z "         SFO_BB =   18.29   =>     -3.0204833336854863E9..."](println Z) )
(let [Z "         SFO_BB =   18.39   =>      -2.971081947422096E9...our Solar System (at this time a Sun with 12 planets) is conducive for life on earth..."](println Z) )
(let [Z "         SFO_BB =   18.50   =>     -2.9167404225323668E9..."](println Z) )
(let [Z "         SFO_BB =   18.728  =>      -2.804105261851837E9...Oceanic Oxygen (1)..."](println Z) )
(let [Z "         SFO_BB =   19.24   =>     -2.5511701641832814E9...Oceanic Oxygen (2)..."](println Z) )
(let [Z "         SFO_BB =   19.72   =>      -2.314043510119009E9...Oceanic Oxygen (3)..."](println Z) )
(let [Z "         SFO_BB =   19.81   =>     -2.2695822624819574E9..."](println Z) )
(let [Z "         SFO_BB =   20.00   =>     -2.1757196285815163E9..."](println Z) )
(let [Z "         SFO_BB =   20.518  =>     -1.9198204477371557E9...formation of atmospheric oxygen (there is Ferrous Oxide in the ocean)"](println Z) )
(let [Z "         SFO_BB =   21.60   =>     -1.3852974483672748E9..."](println Z) )
(let [Z "         SFO_BB =   22.328  =>     -1.0256553563697969E9..."](println Z) )
(let [Z "         SFO_BB =   22.44   =>      -9.703258037547983E8..."](println Z) )
(let [Z "         SFO_BB =   23.00   =>      -6.936780406798149E8..."](println Z) )
(let [Z "         SFO_BB =   23.22   =>      -5.849949909003574E8...the oxygen content of the atmosphere and oceans become high enough to permit marine life capable of respiration..."](println Z) )
(let [Z "         SFO_BB =   23.41   =>      -4.911323569999161E8..."](println Z) )
(let [Z "         SFO_BB =   23.61   =>      -3.923295844731369E8...atmosphere contains enough oxygen to evolve air-breathing land animals..."](println Z) )
(let [Z "         SFO_BB =   23.71   =>     -3.4292819820974594E8..."](println Z) )
(let [Z "         SFO_BB =   23.81   =>     -2.9352681194635636E8..."](println Z) )
(let [Z "         SFO_BB =   23.90   =>       -2.49065564309306E8...ca. Dinosaurs arrive..."](println Z) )
(let [Z "         SFO_BB =   24.01   =>     -1.9472403941957584E8..."](println Z) )
(let [Z "         SFO_BB =   24.118  =>      -1.413705422551154E8..."](println Z) )
(let [Z "         SFO_BB =   24.21   =>      -9.592126689279528E7...Earth starts to undergo crises (upheavals, disruptions)..."](println Z) )
(let [Z "         SFO_BB =   24.27   =>       -6.62804351347626E7...ca. rumored extinction event wipes out Dinosaur life..."](println Z) )
(let [Z "         SFO_BB =   24.29   =>     -5.6400157882084146E7..."](println Z) )
(let [Z "         SFO_BB =   24.31   =>     -4.6519880629407026E7..."](println Z) )
(let [Z "         SFO_BB =   24.34   =>     -3.169946475038934E7...ca. Ancient Tethys Sea swallowed by plate tectonics of Eurasia..."](println Z) )
(let [Z "         SFO_BB =   24.360464285714285714      => -28.80 dysii.100     =>   -2.158982391863118E7...volcanic activity builds Aegean Islands (begin)..."](println Z) )
(let [Z "         SFO_BB =   24.368021428571428571      => -19.60 dysii.100     =>  -1.7856490585297674E7...volcanic activity builds Aegean Islands (end)..."](println Z) )
(let [Z "         SFO_BB =   24.3693357142857142857     => -18.00 dysii.100     =>   -1.720721522297834E7..."](println Z) )
(let [Z "         SFO_BB =   24.37065                   => -16.40 dysii.100     =>  -1.6557939860659003E7..."](println Z) )
(let [Z "         SFO_BB =   24.37097                   => -16.00 dysii.100     =>  -1.6399855424617453E7..."](println Z) )
(let [Z "         SFO_BB =   24.3718                    => -15.00 dysii.100     =>  -1.5989823918630254E7..."](println Z) )
(let [Z "         SFO_BB =   24.37426                   => -12.00 dysii.100     =>  -1.4774549816551976E7..."](println Z) )
(let [Z "         SFO_BB  = 24.3749214285               => -11.20 dysii.100     =>  -1.4447794968411572E7..."](println Z) )
(let [Z "         SFO_BB =   24.375587                  => -10.39 dysii.100     =>  -1.4118993420835948E7..."](println Z) )
(let [Z "         SFO_BB =   24.3814025                 =>  -3.31 dysii.100     =>  -1.1246055802688917E7..."](println Z) )
(let [Z "         SFO_BB =   24.384125                  =>   0.00 dysii.100     =>     -9901103.061666317..."](println Z) )
(let [Z "         SFO_BB =   24.389386                  =>   6.41 dysii.100     =>     -7302096.130352027..."](println Z) )
(let [Z "         SFO_BB =   24.4041593022944697        =>        dysii.100     =>     -3880.000001976376..."](println Z) )
(let [Z "         SFO_BB =   24.4041712857638575        =>        dysii.100     =>     2039.9999994187124..."](println Z) )
(let [Z "         SFO_BB =   24.40417330999855138       =>        dysii.100     =>     3039.9999975585933..."](println Z) )
(let [Z "         SFO_BB =   24.404176                  =>        dysii.100     =>      4368.898003627231..."](println Z) )
(let [Z "         SFO_BB =   24.41                      =>        dysii.100     =>     2881505.6339839096..."](println Z) )


(let [Z "DISPENSATION II => DAYS II.100 yGad|yGbc (+ (* (+ ( * (Math/pow (/ 28000 23) 2) 100 -9.17)  -3616774795.1984877126654064272211)  (/ 48.3 17640))  (+ 1969 (/ 391 420))) "](println Z) )
(let [Z "         SFO_BB =  -28.80   =>    -2.1588060434782606E7...ca. volcanic activity builds the Aegean Islands (begin)...Red Sea forms (1)..."](println Z) )
(let [Z "         SFO_BB =  -19.60   =>    -1.7854727101449274E7...ca. volcanic activity builds the Aegean Islands (end)...Red Sea forms (2)..."](println Z) )
(let [Z "         SFO_BB =  -18.00   =>    -1.7205451739130434E7..."](println Z) )
(let [Z "         SFO_BB =  -16.40   =>    -1.6556176376811592E7...Ape Griphopithecus (1)..."](println Z) )
(let [Z "         SFO_BB =  -16.00   =>    -1.6393857536231881E7...Ape Griphopithecus (2)..."](println Z) )
(let [Z "         SFO_BB =  -15.00   =>    -1.5988060434782607E7..."](println Z) )
(let [Z "         SFO_BB =  -12.00   =>    -1.4770669130434781E7...Ape Kenyapithecus...Red Sea forms (3)..."](println Z) )
(let [Z "         SFO_BB =  -11.20   =>    -1.4446031449275361E7...Zeus & the Olympians (Satan & co.) replace Cronus & the Titans (Satan & co.)..."](println Z) )
(let [Z "         SFO_BB =  -10.39   =>    -1.4117335797101447E7..."](println Z) )
(let [Z "         SFO_BB =   -3.31   =>    -1.1244292318840578E7...Era of Leviathan Versus the Companions (1)..."](println Z) )
(let [Z "         SFO_BB =   +0.00   =>       -9901103.913043477..."](println Z) )
(let [Z "         SFO_BB =   +1.81   =>        -9166611.15942029..."](println Z) )
(let [Z "         SFO_BB =    3.09   =>       -8647190.869565215..."](println Z) )
(let [Z "         SFO_BB =    3.60   =>       -8440234.347826086..."](println Z) )
(let [Z "         SFO_BB =    5.41   =>      -7705741.5942028975..."](println Z) )
(let [Z "         SFO_BB =    6.12   =>       -7417625.652173912..."](println Z) )
(let [Z "         SFO_BB =    6.41   =>       -7299944.492753622..."](println Z) )
(let [Z "         SFO_BB =    6.65   =>       -7202553.188405796...Era of Leviathan Versus the Companions (2)..."](println Z) )
(let [Z "         SFO_BB =    7.20   =>       -6979364.782608694...Sahelanthropus Tchadensis (an early Australopith)..."](println Z) )
(let [Z "         SFO_BB =    9.01   =>       -6244872.028985507...Orrorin Tugenensis (an early Australopith)..."](println Z) )
(let [Z "         SFO_BB =    10.80  =>       -5518495.217391303..."](println Z) )
(let [Z "         SFO_BB =    10.95  =>       -5457625.652173912..."](println Z) )
(let [Z "         SFO_BB =    11.20  =>       -5356176.376811594..."](println Z) )
(let [Z "         SFO_BB =   11.547  =>       -5215364.782608694...Ardipithecus Kadabba (1)..."](println Z) )
(let [Z "         SFO_BB =   11.69   =>       -5157335.797101448...Ardipithecus Kadabba (2)..."](println Z) )
(let [Z "         SFO_BB =   11.8457 =>       -5094153.188405796...ca. End of the Miocene Epoch (1)..."](println Z) )
(let [Z "         SFO_BB =   12.41   =>        -4865161.88405797...ca. End of the Miocene Epoch (2)..."](println Z) )
(let [Z "         SFO_BB =   12.61   =>       -4784002.463768115..."](println Z) )
(let [Z "         SFO_BB =   12.78   =>       -4715016.956521739..."](println Z) )
(let [Z "         SFO_BB =   12.90   =>       -4666321.304347825..."](println Z) )
(let [Z "         SFO_BB =   13.318  =>       -4496698.115942028...DEDUCTION: 12 subdivisions of the genus AUSTRALOPITHECUS (ie. PARANTHROPUS) emerge..."](println Z) )
(let [Z "         SFO_BB =   13.35   =>       -4483712.608695651...Ardipithecus Ramidus (an early Australopith)..."](println Z) )
(let [Z "         SFO_BB =   13.834  =>       -4287306.811594202...Australopith Anamensis (0)..."](println Z) )
(let [Z "         SFO_BB =   13.954  =>       -4238611.159420288...Australopith Anamensis (1)..."](println Z) )
(let [Z "         SFO_BB =   14.40   =>      -4057625.6521739126...Australopith Anamensis (2)..."](println Z) )
(let [Z "         SFO_BB =   14.61   =>      -3972408.2608695654...Australopith Anamensis (3)..."](println Z) )
(let [Z "         SFO_BB =   15.128  =>      -3762205.3623188403...Australopith Afarensis (1)..."](println Z) )
(let [Z "         SFO_BB =   15.4918 =>      -3614576.3768115947...Kenyanthropus Platyops (0)..."](println Z) )
(let [Z "         SFO_BB =   15.57761=>       -3579753.188411595...Kenyanthropus Platyops (1)..."](println Z) )
(let [Z "         SFO_BB =   16.21   =>       -3323132.898550724...Australopith Africanus..."](println Z) )
(let [Z "         SFO_BB =   16.918  =>       -3035828.550724637...Australopith Afarensis (2)..."](println Z) )
(let [Z "         SFO_BB =   17.71   =>      -2714437.2463768115...Later Australopiths arrive...eg Australopith Aethiopicus..."](println Z) )
(let [Z "         SFO_BB =   18.00   =>      -2596756.0869565215...Australopith Garhi..."](println Z) )
(let [Z "         SFO_BB =   18.29   =>      -2479074.9275362324...arrival of the genus HOMO (0)..."](println Z) )
(let [Z "         SFO_BB =   18.39   =>      -2438495.2173913037...DEDUCTION: 12 subdivisions of the genus HOMO (1)..."](println Z) )
(let [Z "         SFO_BB =   18.50   =>      -2393857.5362318843...arrival of the genus HOMO (2)..."](println Z) )
(let [Z "         SFO_BB =   18.728  =>      -2301335.7971014483...Australopith Boisei..."](println Z) )
(let [Z "         SFO_BB =   19.24   =>      -2093567.6811594204..."](println Z) )
(let [Z "         SFO_BB =   19.72   =>      -1898785.0724637683..."](println Z) )
(let [Z "         SFO_BB =   19.81   =>      -1862263.3333333335...Australopith Robustus...Homo Habilis...Homo Erectus (0)...Homo Rudolfensis..."](println Z) )
(let [Z "         SFO_BB =   20.00   =>      -1785161.8840579703...Homo Egaster..."](println Z) )
(let [Z "         SFO_BB =   20.518  =>      -1574958.9855072466...Homo Erectus (1)..."](println Z) )
(let [Z "         SFO_BB =   21.60   =>      -1135886.5217391292..."](println Z) )
(let [Z "         SFO_BB =   22.328  =>       -840466.2318840587..."](println Z) )
(let [Z "         SFO_BB =   22.44   =>       -795016.9565217382...ca. ending of Homo Egaster..."](println Z) )
(let [Z "         SFO_BB =   23.00   =>        -567770.579710145...Homo Heidelbergensis..."](println Z) )
(let [Z "         SFO_BB =   23.22   =>       -478495.2173913046..."](println Z) )
(let [Z "         SFO_BB =   23.41   =>      -401393.76811594144..."](println Z) )
(let [Z "         SFO_BB =   23.61   =>       -320234.3478260871..."](println Z) )
(let [Z "         SFO_BB =   23.71   =>      -279654.63768115867...dawn of pre-Atlantean Sumerian Civilization (please see Sumerian Kings List wiki) preceding the era of the kings of Atlantis...ca. onset (0) of Homo Sapiens Sapiens...Ending of Homo Erectus in China..."](println Z) )
(let [Z "         SFO_BB =   23.81   =>      -239074.92753623278..."](println Z) )
(let [Z "         SFO_BB =   23.90   =>      -202553.18840579808...ca. onset of Homo Sapiens Sapiens (0)..."](println Z) )
(let [Z "         SFO_BB =   23.92   =>      -194437.24637681057...ca. midst of 43,200-year reign of EN-MEN-LU-ANA king of Sumerian Civilization preceding the era of the kings of Atlantis...ca. onset (1) of Homo Sapiens Sapiens..."](println Z) )
(let [Z "         SFO_BB =   24.01   =>      -157915.50724637584..."](println Z) )
(let [Z "         SFO_BB =   24.118  =>      -114089.42028985579...ca. beginning of the end for The Neanderthal..."](println Z) )
(let [Z "         SFO_BB =   24.21   =>       -76756.08695652155...ca. The Great Climate-Change Squeeze...Homo Sapiens Sapiens down to only 2000 individuals..."](println Z) )
(let [Z "         SFO_BB =   24.27   =>       -52408.26086956552..."](println Z) )
(let [Z "         SFO_BB =   24.29   =>       -44292.31884058061..."](println Z) )
(let [Z "         SFO_BB =   24.31   =>        -36176.3768115944..."](println Z) )
(let [Z "         SFO_BB =   24.360464285714285714      => -28.80 dysi.100     =>   -15698.115942028648...dusk of Sumerian Civilization (preceding the era of Atlantis Proper)..."](println Z) )
(let [Z "         SFO_BB =   24.368021428571428571      => -19.60 dysi.100     =>   -12631.449275363286...Poseidon rises to become the progenitor of the 10 fathers of Atlantis Proper..."](println Z) )
(let [Z "         SFO_BB =   24.3693357142857142857     => -18.00 dysi.100     =>   -12098.115942029044...onset of the dominion the 10 fathers of Atlantis Proper..."](println Z) )
(let [Z "         SFO_BB =   24.37065                   => -16.40 dysi.100     =>   -11564.782608694803..."](println Z) )
(let [Z "         SFO_BB =   24.37097                   => -16.00 dysi.100     =>    -11434.92753623213...rise of Hellen the proto-Greek?..."](println Z) )
(let [Z "         SFO_BB =   24.3718                    => -15.00 dysi.100     =>   -11098.115942028648..."](println Z) )
(let [Z "         SFO_BB =   24.37426                   => -12.00 dysi.100     =>   -10099.855072463693..."](println Z) )
(let [Z "         SFO_BB  = 24.3749214285               => -11.20 dysi.100     =>    -9831.449304348627...Athena & the Hellenes (Satan & co.) replace Zeus, Poseidon & the Olympians (Satan & co.)..."](println Z) )
(let [Z "         SFO_BB =   24.375587                  => -10.39 dysi.100     =>    -9561.362318840595...Devastating flood destroys Atlantis in the midst of the seas..."](println Z) )
(let [Z "         SFO_BB =   24.3765925                 =>  -9.17 dysi.100     =>    -9153.333333333618...WORLD ORDER: Athena & the Hellenes sit on a remnant from 7 nations of Atlantis and rest of the known world..."](println Z) )
(let [Z "         SFO_BB =   24.3768225                 =>  -8.89 dysi.100     =>    -9060.000000000908...Athena & the Hellenes (Satan & co.) replace Zeus, Poseidon & the Olympians (Satan & co.)..."](println Z) )
(let [Z "         SFO_BB =   24.3814025                 =>  -3.31 dysi.100     =>    -7201.449275362265...Jericho (an oasis in a valley at the northern end of the Dead Sea)..."](println Z) )
(let [Z "         SFO_BB =   24.384125                  =>   0.00 dysi.100     =>    -6096.666666666837..."](println Z) )
(let [Z "         SFO_BB =   24.389386                  =>   6.41 dysi.100     =>   -3961.7681159429317...remnant of the pre-Adamite Sumerian and Hellenic peoples"](println Z) )
(let [Z "         SFO_BB =   24.3895874986607142        =>   6.65 dysi.100     =>   -3880.0005434793516...the man Adam is placed by GOD in a garden eastward in Eden"](println Z) )
(let [Z "         SFO_BB =   24.399148927232142          =>  18.29 dysi.100   => -0.0005434790114122734...birth of JESUS CHRIST...THE DAYSPRING FROM ON HIGH..."](println Z) )
(let [Z "         SFO_BB =   24.404176070089285714      =>  24.41 dysi.100     =>     2039.999456521329...THE NAME OF THE LORD cometh from far..."](println Z) )
(let [Z "         SFO_BB =   24.406640355803571428      =>  27.41 dysi.100     =>     3039.999456521726...after the thousand years Satan shall be loosed from his prison..."](println Z) )
(let [Z "         SFO_BB =   24.41                      =>        dysi.100     =>     4403.333333332765..."](println Z) )


(let [Z "DISPENSATION I => DAYS I.100 yGad|yGbc (+ (* (+ ( * (Math/pow (/ 28000 23) 1) 100 20.00)  -2946061 (/ -17 23))  (/ 48.3 17640))  (+ 1969 (/ 391 420))) "](println Z) )
(let [Z "         SFO_BB =  -28.80   =>    -15696.666666666662..."](println Z) )
(let [Z "         SFO_BB =  -19.60   =>    -12629.999999999996..."](println Z) )
(let [Z "         SFO_BB =  -18.00   =>    -12096.666666666666..."](println Z) )
(let [Z "         SFO_BB =  -16.40   =>    -11563.333333333332..."](println Z) )
(let [Z "         SFO_BB =  -16.00   =>    -11429.999999999998..."](println Z) )
(let [Z "         SFO_BB =  -15.00   =>    -11096.666666666664..."](println Z) )
(let [Z "         SFO_BB =  -12.00   =>    -10096.666666666664...rise of Hellen the proto-Greek?..."](println Z) )
(let [Z "         SFO_BB =  -11.20   =>     -9829.999999999996...Athena & the Hellenes (Satan & co.) replace Zeus, Poseidon & the Olympians (Satan & co.)..."](println Z) )
(let [Z "         SFO_BB =  -10.39   =>     -9559.999999999998...Devastating flood destroys Atlantis in the midst of the seas..."](println Z) )
(let [Z "         SFO_BB =   -3.31   =>                -7200.0...Jericho (an oasis in a valley at the northern end of the Dead Sea)..."](println Z) )
(let [Z "         SFO_BB =   +0.00   =>     -6096.666666666666...Catal Huyuk (Great Red Bull)..."](println Z) )
(let [Z "         SFO_BB =   +1.81   =>     -5493.333333333332...Terra Rossa (0)...Hassuna..."](println Z) )
(let [Z "         SFO_BB =    3.09   =>     -5066.666666666666...Halaf (North) (0) / Ubaid (South) (0)..."](println Z) )
(let [Z "         SFO_BB =    3.60   =>     -4896.666666666666..."](println Z) )
(let [Z "         SFO_BB =    5.41   =>     -4293.333333333332..."](println Z) )
(let [Z "         SFO_BB =    6.12   =>    -4056.6666666666656...Halaf (North) (1)...Terra Rossa (1)...Ubaid overthrown by mingled wild nomadic tribesmen of Syrian/Arabian descent..."](println Z) )
(let [Z "         SFO_BB =    6.41   =>    -3959.9999999999995...Ubaid (South) (1)..."](println Z) )
(let [Z "         SFO_BB =    6.65   =>    -3879.9999999999995...forming of Adam and Eve..."](println Z) )
(let [Z "         SFO_BB =    7.20   =>    -3696.6666666666674...during the life and times of Seth..."](println Z) )
(let [Z "         SFO_BB =    9.01   =>    -3093.3333333333335...during the life and times of Methuselah..."](println Z) )
(let [Z "         SFO_BB =    10.80  =>    -2496.6666666666665...during the life and times of Noah..."](println Z) )
(let [Z "         SFO_BB =    10.95  =>    -2446.6666666666674...during the life and times of Noah..."](println Z) )
(let [Z "         SFO_BB =    11.20  =>    -2363.3333333333344...during the life and times of Noah..."](println Z) )
(let [Z "         SFO_BB =   11.547  =>    -2247.6666666666674...THE GREAT FLOOD OF NOAH...Death of Methuselah..."](println Z) )
(let [Z "         SFO_BB =   11.69   =>    -2200.0000000000005...Nimrod...beginning of kingdom of his kingdom was Babel..."](println Z) )
(let [Z "         SFO_BB =   11.8457 =>     -2148.100000000001...birth of Peleg...for in his days the earth was divided..."](println Z) )
(let [Z "         SFO_BB =   12.41   =>    -1960.0000000000005...Birth of Abram..."](println Z) )
(let [Z "         SFO_BB =   12.61   =>     -1893.333333333334...during the life and times of Abram..."](println Z) )
(let [Z "         SFO_BB =   12.78   =>    -1836.6666666666674...during the life and times of Isaac..."](println Z) )
(let [Z "         SFO_BB =   12.8837 =>    -1802.1142851428571...birth of Jacob and Esau..."](println Z) )
(let [Z "         SFO_BB =   12.90   =>     -1796.666666666667...during the childhood of Jacob and Esau..."](println Z) )
(let [Z "         SFO_BB =   13.1084 =>     -1727.200000000000...Jacob marries Leah and Rachel.."](println Z) )
(let [Z "         SFO_BB =   13.15   =>     -1713.333333333333...birth of Joseph.."](println Z) )
(let [Z "         SFO_BB =   13.20   =>     -1696.666666666666...Joseph at seventeen years of age.."](println Z) )
(let [Z "         SFO_BB =   13.2385 =>     -1683.828571428571...Joseph stands before Pharaoh at thirty years of age.."](println Z) )
(let [Z "         SFO_BB =   13.26808=>     -1673.971428571429...Jacob aged one hundred and thirty years blesses Pharaoh.."](println Z) )
(let [Z "         SFO_BB =   13.31835=>     -1657.214285714286...Death of Jacob (Israel) at a hundred and forty seven years"](println Z) )
(let [Z "         SFO_BB =   13.35   =>     -1646.666666666667...the children of Israel are sojourning in Egypt ..."](println Z) )
(let [Z "         SFO_BB =   13.47509=>     -1604.971428571429...Death of Joseph at a hundred and ten years"](println Z) )
(let [Z "  SFO_BB =   13.8358571428  =>    -1484.7142857333338...Moses at 80yJ...the children of Israel...WITH AN OUTSTRETCHED ARM...are delivered from Pharaoh and Egypt..."](println Z) )
(let [Z "  SFO_BB =   13.9541428571  =>          -1445.2857143...Death of Moses at 120yJ...the children of Israel arrive in the Promised Land..."](println Z) )
(let [Z "         SFO_BB =   14.40   =>    -1296.6666666666674...during the life and times of Shamgar the son of Anath"](println Z) )
(let [Z "         SFO_BB =   14.61   =>    -1226.666...during life and times of Deborah, a prophetess, the wife of Lapidoth"](println Z) )
(let [Z "         SFO_BB =   15.128  =>    -1054.0000000000005...during the life and times of Samson..."](println Z) )
(let [Z "         SFO_BB =   16.21   =>     -693.3333333333339...during the life and times of good king Uzziah of Judah AND evil king Menahem of Israel..."](println Z) )
(let [Z "         SFO_BB =   16.918  =>     -457.3333333333344...Darius the Son of Ahasuerus the Mede reigning in Babylon"](println Z) )
(let [Z "         SFO_BB =   16.94   =>     -450.000...Proclamation of Cyrus the Great of Persia (Jews return to Jerusalem)"](println Z) )
(let [Z "         SFO_BB =   17.71   =>    -193.33333333333348..."](println Z) )
(let [Z "         SFO_BB =   18.00   =>     -96.66666666666697..."](println Z) )
(let [Z "      SFO_BB= 18.29=> -0.0000000000018189894035458565...birth of THE LORD JESUS CHRIST..."](println Z) )
(let [Z "         SFO_BB =   18.39   =>      33.33333333333235...resurrection of THE LORD JESUS CHRIST..."](println Z) )
(let [Z "         SFO_BB =   18.50   =>      69.99999999999909...General Titus sacks Jerusalem..."](println Z) )
(let [Z "         SFO_BB =   18.728  =>     145.99999999999886..."](println Z) )
(let [Z "         SFO_BB =   19.24   =>      316.6666666666649...during the life and times of Emperor Constantine the Great..."](println Z) )
(let [Z "         SFO_BB =   19.72   =>     476.66666666666515...Fall of Rome..."](println Z) )
(let [Z "         SFO_BB =   19.81   =>     506.66666666666515..."](println Z) )
(let [Z "         SFO_BB =   20.00   =>      569.9999999999991...birth of Mohammed...Parable of the Tares (onset)..."](println Z) )
(let [Z "         SFO_BB =   20.518  =>      742.6666666666654..."](println Z) )
(let [Z "         SFO_BB =   21.60   =>     1103.3333333333328..."](println Z) )
(let [Z "         SFO_BB =   22.328  =>     1345.9999999999986...ca. The Black Death ravages Europe..."](println Z) )
(let [Z "       SFO_BB = 22.44981125 =>     1386.6037499999984...ca. Arnold of Winkelried at the Battle of Sempach..."](println Z) )
(let [Z "         SFO_BB =   23.00   =>     1569.9999999999984..."](println Z) )
(let [Z "   SFO_BB =   23.22035125   =>     1643.4504166666661...Louis XIV ascends the throne of France..."](println Z) )
(let [Z "         SFO_BB =   23.41   =>     1706.666666666666..."](println Z) )
(let [Z "         SFO_BB =   23.61   =>     1773.3333333333314..."](println Z) )
(let [Z "         SFO_BB =   23.71   =>     1806.6666666666654...Napoleon sweeps away what is still in name The Holy Roman Empire..."](println Z) )
(let [Z "         SFO_BB =   23.81   =>     1839.9999999999982..."](println Z) )
(let [Z "         SFO_BB =   24.01   =>      1906.666666666666..."](println Z) )
(let [Z "         SFO_BB =   24.118  =>      1942.666666666665..."](println Z) )
(let [Z "         SFO_BB =   24.21   =>     1973.3333333333328..."](println Z) )
(let [Z "         SFO_BB =   24.27   =>     1993.3333333333314..."](println Z) )
(let [Z " SFO_BB = 24.295336964285   =>     2001.7789880949979...AL-QAEDA 9-11 TERRORIST ATTACK..."](println Z) )
(let [Z "         SFO_BB =   24.31   =>     2006.6666666666642..."](println Z) )
(let [Z "         SFO_BB =   24.360464285714285714      => -28.80 dys1.100     =>   2023.4880952380943..."](println Z) )
(let [Z "         SFO_BB =   24.368021428571428571      => -19.60 dys1.100     =>   2026.0071428571407..."](println Z) )
(let [Z "         SFO_BB =   24.3693357142857142857     => -18.00 dys1.100     =>    2026.445238095237..."](println Z) )
(let [Z "         SFO_BB =   24.37065                   => -16.40 dys1.100     =>   2026.8833333333323..."](println Z) )
(let [Z "         SFO_BB =   24.37097                   => -16.00 dys1.100     =>   2026.9899999999982..."](println Z) )
(let [Z "         SFO_BB =   24.3718                    => -15.00 dys1.100     =>   2027.2666666666657..."](println Z) )
(let [Z "         SFO_BB =   24.37426                   => -12.00 dys1.100     =>   2028.0866666666645..."](println Z) )
(let [Z "         SFO_BB  = 24.3749214285               => -11.20 dys1.100     =>   2028.3071428333321..."](println Z) )
(let [Z "         SFO_BB =   24.375587                  => -10.39 dys1.100     =>   2028.5289999999984..."](println Z) )
(let [Z "         SFO_BB =   24.3765925                 =>  -9.17 dys1.100     =>   2028.8641666666663..."](println Z) )
(let [Z "         SFO_BB =   24.3768225                 =>  -8.89 dys1.100     =>   2028.9408333333317..."](println Z) )
(let [Z "         SFO_BB =   24.3814025                 =>  -3.31 dys1.100     =>    2030.467499999999..."](println Z) )
(let [Z "         SFO_BB =   24.384125                  =>   0.00 dys1.100     =>   2031.3749999999984..."](println Z) )
(let [Z "         SFO_BB =   24.389386                  =>   6.41 dys1.100     =>    2033.128666666665..."](println Z) )
(let [Z "         SFO_BB =   24.3895874986607142        =>   6.65 dys1.100     =>   2033.1958328869034..."](println Z) )
(let [Z "         SFO_BB =   24.399148927232142          => 18.29 dys1.100     =>   2036.3829757440449..."](println Z) )
(let [Z "         SFO_BB =   24.404176070089285714      =>  24.41 dys1.100     =>   2038.0586900297606..."](println Z) )
(let [Z "         SFO_BB =   24.406640355803571428      =>  27.41 dys1.100     =>    2038.880118601189..."](println Z) )
(let [Z "         SFO_BB =   24.41                      =>        dys1.100     =>   2039.9999999999982..."](println Z) )


(let [Z "TNL.1000D SFO BUILDING BLOCKS....AMONG THE TRIBES OF ISRAEL...THAT WHICH SHALL SURELY BE...HOSEA 5:9"](println Z) )
(let [Z " 193903071231 =>    -11.200    => ...Pre-Adamites Tertiary-Stage Follices (Antral Phase 1)..."](println Z) )
(let [Z " 194105260205 =>    -10.390    => ...Adam is formed..."](println Z) )
(let [Z " 194412160513 =>     -9.090    => ...Birth of Seth..."](println Z) )
(let [Z " 194710311847 =>     -8.040    => ...Birth of Enos...men begin to call upon THE NAME OF THE LORD..."](println Z) )
(let [Z " 195004190308 =>     -7.140    => ...Birth of Cainan..."](println Z) )
(let [Z " 195203191642 =>     -6.440    => ...Birth of Mahalaleel..."](println Z) )
(let [Z " 195312290616 =>     -5.790    => ...Birth of Jared..."](println Z) )
(let [Z " 195806090924 =>     -4.170    => ...Birth of Enoch..."](println Z) )
(let [Z " 195911241642 =>     -3.633    => ...the Angels that sinned (0)..."](println Z) )
(let [Z " 196003172257 =>     -3.520    => ...Birth of Methuselah...Tertiary-Stage Follicles (Antral Phase 2)..."](println Z) )
(let [Z " 196504302052 =>     -1.650    => ...Birth of Lamech..."](println Z) )
(let [Z " 196611111539 =>     -1.090    => ...Death of Adam..."](println Z) )
(let [Z " 196806040513 =>     -0.520    => ...Enoch was not..."](println Z) )
(let [Z " 196908080000 =>     -0.090    => ...1st 490yJ begins..."](println Z) )
(let [Z " 196911060000 =>      0.000    => ...Death of Eve?...the mother of all living..."](println Z) )
(let [Z " 196912051847 =>      0.030    => ...Death of Seth..."](println Z) )
(let [Z " 197004241847 =>      0.170    => ...Birth of Noah..."](println Z) )
(let [Z " 197207051600 =>      0.972    => ...the Angels that sinned (1)..."](println Z) )
(let [Z " 197208120718 =>      1.00995  => ...Death of Enos..."](println Z) )
(let [Z " 197503191642 =>      1.960    => ...Death of Cainan..."](println Z) )
(let [Z " 197609201129 =>      2.510    => ...Death of Mahalaleel..."](println Z) )
(let [Z " 197703260513 =>      2.69696  => ...the Angels that sinned (2)..."](println Z) )
(let [Z " 198005021437 =>      3.830    => ...Death of Jared..."](println Z) )
(let [Z " 198301062257 =>      4.810    => ...2nd 490yJ begins..."](println Z) )
(let [Z " 198306152257 =>      4.970    => ...Yet his days shall be 120 years...  (Atresia 1)..."](println Z) )
(let [Z " 198401011744 =>      5.170    => ...Birth of Shem..."](println Z) )
(let [Z " 198608090718 =>      6.120    => ...Death of Lamech..."](println Z) )
(let [Z " 198609280718 =>      6.170    => ...THE GREAT FLOOD...Death of Methuselah...Noah is 600yJ of age...(Atresia 2)..."](println Z) )
(let [Z " 198610180718 =>      6.190    => ...Birth of Arphaxad..."](println Z) )
(let [Z " 198710030205 =>      6.540    => ...Birth of Salah..."](println Z) )
(let [Z " 198801302052 =>      6.660    => ...Nimrod a mighty hunter before THE LORD..."](println Z) )
(let [Z " 198807292052 =>      6.840    => ...Birth of Eber..."](println Z) )
(let [Z " 198903052216 =>      7.05928  => ...(A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 0)..."](println Z) )
(let [Z " 198907041539 =>      7.180    => ...Birth of Peleg...in his days the earth was divided..."](println Z) )
(let [Z " 199004301026 =>      7.480    => ...Birth of Reu..."](println Z) )
(let [Z " 199103160513 =>      7.800    => ...Birth of Serug..."](println Z) )
(let [Z " 199201100000 =>      8.100    => ...Birth of Nahor..."](println Z) )
(let [Z " 199210270000 =>      8.390    => ...Birth of Terah (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 1)..."](println Z) )
(let [Z " 199409261334 =>      9.090    => ...Birth of Abram (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 2)..."](println Z) )
(let [Z " 199601190308 =>      9.570    => ...Death of Peleg..."](println Z) )
(let [Z " 199601290308 =>      9.580    => ...Death of Nahor..."](println Z) )
(let [Z " 199602280308 =>      9.610    => ...Now THE LORD had said unto Abram...Get thee out of thy country..."](println Z) )
(let [Z " 199604290308 =>      9.670    => ...Death of Noah..."](println Z) )
(let [Z " 199606080308 =>      9.710    => ...3rd 490yJ begins..."](println Z) )
(let [Z " 199610160308 =>      9.840    => ...and Abram was 75yJ when he departed (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 3)..."](println Z) )
(let [Z " 199611150308 =>      9.870    => ...Death of Reu..."](println Z) )
(let [Z " 199612242155 =>      9.910    => ...Birth of Ishmael..."](println Z) )
(let [Z " 199706222155 =>     10.090    => ...Birth of Isaac (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 4)..."](println Z) )
(let [Z " 199707022155 =>     10.100    => ...Death of Serug..."](println Z) )
(let [Z " 199806071642 =>     10.440    => ...Death of Terah..."](println Z) )
(let [Z " 199810151642 =>     10.570    => ...Death of Arphaxad..."](println Z) )
(let [Z " 199902121129 =>     10.690    => ...Birth of Jacob       (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 5) Start of Menses..."](println Z) )
(let [Z " 199907121129 =>     10.840    => ...Death of Abraham..."](println Z) )
(let [Z " 199908111129 =>     10.870    => ...Death of Salah..."](println Z) )
(let [Z " 200006270616 =>     11.190    => ...Death of Shem..."](println Z) )
(let [Z " 200009250616 =>     11.280    => ...Death of Ishmael..."](println Z) )
(let [Z " 200103140103 =>     11.450    => ...And Isaac sent away Jacob...and he went to Padan-aram unto Laban..."](println Z) )
(let [Z " 200104130103 =>     11.480    => ...Death of Eber..."](println Z) )
(let [Z " 200108010103 =>     11.590    => ...Birth of Joseph..."](println Z) )
(let [Z " 200201171950 =>     11.760    => ...Joseph...being 17yJ old...was feeding the flock with his brethren..."](println Z) )
(let [Z " 200205271950 =>     11.890    => ...Death of Isaac...Joseph was 30yJ old when he stood before Pharaoh king of Egypt..."](println Z) )
(let [Z " 200209041950 =>     11.990    => ...And Jacob said unto Pharaoh...The days of the years of my pilgrimage are 130yJ..."](println Z) )
(let [Z " 200302211437 =>     12.160    => ...Death of Jacob (Israel)..."](println Z) )
(let [Z " 200303052216 =>     12.17232  => ...Estrogen Surge Ends Menses 0..."](println Z) )
(let [Z " 200308150555 =>     12.33464  => ...Estrogen Surge Ends Menses 1..."](println Z) )
(let [Z " 200408050923 =>     12.690    => ...Death of Joseph..."](println Z) )
(let [Z " 200409241950 =>     12.74043  => ...Estrogen Surge Ends Menses 2..."](println Z) )
(let [Z " 200509290410 =>     13.110    => ...Birth of Moses..."](println Z) )
(let [Z " 200611022257 =>     13.510    => ...Moses at 40yJ  Emergence of the Dominant Follicle..."](println Z) )
(let [Z " 200707051600 =>     13.75493  => ...of a flood (onset)..."](println Z) )
(let [Z " 200712071231 =>     13.910    => ...Moses at 80yJ...the children of Israel...WITH AN OUTSTRETCHED ARM...are delivered from Pharaoh and Egypt..."](println Z) )
(let [Z " 200901110718 =>     14.310    => ...Death of Moses..."](println Z) )
(let [Z " 200903052216 =>     14.36362  => ...Early Insemination..."](println Z) )
(let [Z " 200911070718 =>     14.610    => ...Israel in the Promised Land...begin to serve Chushan-rishathaim 8yJ...era of Judges begins...4th OR FIRST 490yJ begins...Luteinizing Hormone surges..."](println Z) )
(let [Z " 201001260205 =>     14.690    => ...Othniel the son of Kenaz begins to judge Israel 40yJ..."](println Z) )
(let [Z " 201103012052 =>     15.090    => ...children of Israel begin to serve Eglon king of Moab 18yJ..."](println Z) )
(let [Z " 201108282052 =>     15.270    => ...Ehud the son of Gera (and Shamgar the son of Anath after him) begin to judge Israel 80yJ..."](println Z) )
(let [Z " 201109041252 =>     15.27666  => ...Ovulation Begins For ca. 36 hours..."](println Z) )
(let [Z " 201203061539 =>     15.460    => ...Ed & Sr 80yJ (Fertilized Oocyte, Zygote, Pro-Nuclei 1)..."](println Z) )
(let [Z " 201209041252 =>     15.64188  => ...             (Fertilized Oocyte, Zygote, Pro-Nuclei 2)..."](println Z) )
(let [Z " 201303052216 =>     15.82449  => ...             (Fertilized Oocyte, Zygote, Pro-Nuclei 3)..."](println Z) )
(let [Z " 201311061026 =>     16.070    => ...Jabin king of Canaan begins to mightily oppress Israel for 20yJ..."](println Z) )
(let [Z " 201405250513 =>     16.270    => ...Deborah...a prophetess...the wife of Lapidoth...begins to judge Israel for 40yJ..."](println Z) )
(let [Z " 201309041252|201409041252 => 16.00710|16.37232 => ...Morula Cell Division with...Blastocyst Formation of Inner and Outer Cell Mass..."](println Z) )
(let [Z " 201506290000 =>     16.670    => ...children of Israel begin to serve Midian for 7yJ..."](println Z) )
(let [Z " 201509070000 =>     16.740    => ...Gideon begins to judge Israel for 40yJ..."](println Z) )
(let [Z " 201511040944 =>     16.79841  => ...of a flood (midst)..."](println Z) )
(let [Z " 201509041252|201609041252 => 16.73754|17.10275 => ...Loss of Zona Pellucida, Free Blastocyst..."](println Z) )
(let [Z " 201610111847 =>     17.140    => ...Abimelech begins to judge Israel for 3yJ..."](println Z) )
(let [Z " 201611101847 =>     17.170    => ...Tola the son of Puah begins to judge Israel for 23yJ..."](println Z) )
(let [Z " 201908270308 =>     17.324    => ...Birth of Eli the priest..."](println Z) )
(let [Z " 201706281334 =>     17.400    => ...Jair...a Gileadite...begins to judge Israel for 22yJ..."](println Z) )
(let [Z " 201609041252|201709041252 => 17.10275|17.46797 => ...Attaching Blastocyst..."](println Z) )
(let [Z " 201802030821 =>     17.620    => ...the Philistines and the children of Ammon begin to oppress the children of Israel 18yJ..."](println Z) )
(let [Z " 201808020821 =>     17.800    => ...Jephthah the Gileadite begins to judge Israel for 6yJ..."](println Z) )
(let [Z " 201810010821 =>     17.860    => ...Ibzan of Bethlehem begins to judge Israel for 7yJ..."](println Z) )
(let [Z " 201810010821 =>     17.904    => ...Eli the priest begins priesthood in Israel for 40yJ..."](println Z) )
(let [Z " 201812100308 =>     17.930    => ...Elon...a Zebulonite...begins to judge Israel for 10yJ..."](println Z) )
(let [Z " 201902080308 =>     17.990    => ...Birth of the Nazarites...Samuel (1 Samuel 1) and Samson (Judges 13:2-24)..."](println Z) )
(let [Z " 201903200308 =>     18.030    => ...Abdon the son of Hillel...a Pirathonite...begins to judge Israel for 8yJ..."](println Z) )
(let [Z " 201906080308 =>     18.110    => ...the children of Israel begin to serve the Philistines for 40yJ..."](println Z) )
(let [Z " 201908270308 =>     18.190    => ...Samson begins to judge Israel for 20yJ..."](println Z) )
(let [Z " 201908270308 =>     18.304    => ...Death of Eli the priest at 98 years...Israel defeated...Philistines smitten 7 months with emerods..."](println Z) )
(let [Z " 201912242155 =>     18.310    => ...(begin) The Ark in Kirjath-jearim for 20yJ (1 Samuel 7:2)..."](println Z) )
(let [Z " 202003142155 =>     18.390    => ...Death of Samson (Judges 16:30)..."](println Z) )
(let [Z " 202007122155 =>     18.510    => ...The Ark in Kirjath-jearim for 20yJ...(end)......The Philistines were subdued...all the days of Samuel...No king in Israel (begin)..."](println Z) )
(let [Z " 202010102155 =>     18.600    => ...and there they made Saul king before THE LORD .(1 Samuel 11:15)..No king in Israel (end)"](println Z) )
(let [Z " 202101181642 =>     18.700    => ...ca birth of David..."](println Z) )
(let [Z " 202107301154 =>     18.89280  => ...ca. death of Samuel (1 Samuel 25:1)..."](println Z) )
(let [Z " 202111141642 =>     19.000    => ...Death of Saul...David begins 40yJ reign as king over all Israel..."](println Z) )
(let [Z " 202206021129|202208011129 => 19.200|19.260     => ...ca. birth of Solomon..."](println Z) )
(let [Z " 202211241129 =>     19.375    => ...Solomon begins 40yJ co-reign (with David) over all Israel..."](println Z) )
(let [Z " 202212240616 =>     19.405    => ...Death of David...And it came to pass in the four hundred and eightieth year...in the fourth year of Solomon's reign...he began to build the house of the LORD...1 Kings 6:1... "](println Z) )
(let [Z " 202302020616 =>     19.445    => ...in the fourth year was the foundation of the house of the LORD laid, in the month Zif...1 Kings 6:17... "](println Z) )
(let [Z " 202304130616 =>     19.515    => ...And in the eleventh year...was the house finished...So was he seven years in building it...1 Kings 6:185th OR SECOND 490yJ begins"](println Z) )
(let [Z " 201809041252|202309041252 => 17.83319|19.65928 => ...Implantation..."](println Z) )
(let [Z " 202312290103 =>     19.775    => ...Rehoboam begins 17yJ reign over Judah...Jeroboam begins 22yJ reign over rest of Israel..."](println Z) )
(let [Z " 202406170103 =>     19.945    => ...Abijam begins 3yJ reign over Judah..."](println Z) )
(let [Z " 202406251231 =>     19.95348  => ...prince of the covenant also..."](println Z) )
(let [Z " 202407170103 =>     19.975    => ...good king Asa begins 41yJ reign over Judah..."](println Z) )
(let [Z " 202408060103 =>     19.995    => ...Nadab begins to reign 2yJ over the rest of Israel..."](println Z) )
(let [Z " 202408260103 =>     20.015    => ...evil king Baasha begins to reign 24yJ over the rest of Israel after assassinating Nadab..."](println Z) )
(let [Z " 202504221950 =>     20.255    => ...evil king Elah begins to reign 2yJ over the rest of Israel..."](println Z) )
(let [Z " 202505121950 =>     20.275    =>  -21.65   GOG_ID.100D...evil kings...Zimri 7days...Omri 12yJ...and Tibni 4yJ begin to reign over the rest of Israel"](println Z) )
(let [Z " 202506211950 =>     20.315    =>  -21.25   GOG_ID.100D...evil king Omri begins 8yJ sole-rule over the rest of Israel..."](println Z) )
(let [Z " 202507061950 =>     20.330    =>  -21.10   GOG_ID.100D...at this point Ahab the son of Omri begins 22yJ co-reign over the rest of Israel with his father Omri..."](println Z) )
(let [Z " 202508301950 =>     20.385    =>  -20.55   GOG_ID.100D...good king Jehoshaphat begins reign 25yJ over Judah..."](println Z) )
(let [Z " 202509091950 =>     20.395    =>  -20.45   GOG_ID.100D...evil king Ahab begins sole reign over the rest of Israel..."](println Z) )
(let [Z " 202601241437|202602111437 => 20.532|20.550    =>  -19.08|18.90   GOG_ID.100D...evil king Ahaziah begins 2yJ sole reign over the rest of Israel upon THE STUMBLING DEATH 1Kings 22:29-40 of Ahab..."](println Z) )
(let [Z " 202603031437 =>     20.570    =>  -18.70   GOG_ID.100D...evil king Ahaziah FALLS 2Kings 1:2 down through a lattice in his upper chamber (and begins co-reign with Jehoram)..."](println Z) )
(let [Z " 202604171437 =>     20.615    =>  -18.25   GOG_ID.100D...evil king Jehoram begins to 11yJ sole-reign over the rest of Israel..."](println Z) )
(let [Z " 202605071437 =>     20.635    =>  -18.05   GOG_ID.100D...another evil king Jehoram begins 8yJ reign over Judah..."](println Z) )
(let [Z " 202607261437 =>     20.715    =>  -17.25   GOG_ID.100D...evil king Ahaziah begins 1yJ reign over Judah ..."](println Z) )
(let [Z " 202608051437 =>     20.725    =>  -17.15   GOG_ID.100D...good king Jehu begins 28yJ reign over the rest of Israel upon the deaths of Ahaziah, Jehoram (and Jezebel whose complete carcass WAS NOT FOUND 2Kings 9:6-37)..."](println Z) )
(let [Z " 202608051437 =>     20.725    =>  -17.15   GOG_ID.100D...evil Queen Athaliah begins 6yJ reign over Judah..."](println Z) )
(let [Z " 202409041252|202609041252 => 20.02449|20.75493 => -24.16|-16.85   GOG_ID.100D...Extraembryonic Mesoderm, Primitive Streak, Gastrulation..."](println Z) )
(let [Z " 202610041437 =>     20.785    =>  -16.55   GOG_ID.100D...good king Jehoash begins 40yJ reign over Judah..."](println Z) )
(let [Z " 202612141826 =>     20.85638  =>  -15.84   GOG_ID.100D...of a flood (end)..."](println Z) )
(let [Z " 202703052216 =>     20.93754  =>  -15.0246 GOG_ID.100D...Gestation at 28 days..."](println Z) )
(let [Z " 202705120923 =>     21.005    =>  -14.35   GOG_ID.100D...evil king Jehoahaz begins 17yJ reign over the rest of Israel..."](println Z) )
(let [Z " 202710290923 =>     21.175    =>  -12.65   GOG_ID.100D...evil king Jehoash begins 16yJ reign over the rest of Israel..."](println Z) )
(let [Z " 202711080923 =>     21.185    =>  -12.55   GOG_ID.100D...good king Amaziah of Judah begins 29yJ reign over Judah..."](println Z) )
(let [Z " 202711230923 =>     21.200    =>  -12.40   GOG_ID.100D...birth of evil king Jeroboam II of the rest of Israel..."](println Z) )
(let [Z " 202803230410 =>     21.320    =>  -11.20   GOG_ID.100D...CA FOUNDATION OF ROME..."](println Z) )
(let [Z " 202804070410 =>     21.335    =>  -11.05   GOG_ID.100D...evil king Jeroboam II begins 41yJ reign over the rest of Israel...CA FOUNDATION OF ROME..."](println Z) )
(let [Z " 202808250410 =>     21.475    =>   -9.65   GOG_ID.100D...good king Uzziah begins 52yJ reign over Judah..."](println Z) )
(let [Z " 202609041252|202809041252 => 20.75493|21.48536 => -16.85|-9.55   GOG_ID.100D...Gastrulation, Notochordal Process..."](println Z) )
(let [Z " 202905212257 =>     21.745    =>   -6.95   GOG_ID.100D...an 11yJ coregency begins between the end of Jeroboam II and beginning proper of Zachariah..."](println Z) )
(let [Z " 202909082257 =>     21.855    =>   -5.95   GOG_ID.100D...evil king Zachariah begins 0.5yJ reign over the rest of Israel in the 38th year of Uzziah of Judah's  reign..."](println Z) )
(let [Z " 202909132257 =>     21.860    =>   -5.80   GOG_ID.100D...evil king Shallum begins 1 month reign over the rest of Israel..."](println Z) )
(let [Z " 202909142113 =>     21.86093  =>   -5.791  GOG_ID.100D...evil king Menahem begins 10yJ reign over the rest of Israel..."](println Z) )
(let [Z " 202912231520 =>     21.9609   =>   -4.791  GOG_ID.100D...evil king Pekahiah begins 2yJ reign over the rest of Israel..."](println Z) )
(let [Z " 203001121520 =>     21.9809   =>   -4.591  GOG_ID.100D...evil king Pekah begins 20yJ reign over the rest of Israel..."](println Z) )
(let [Z " 203001261744 =>     21.995    =>   -4.45   GOG_ID.100D...good king Jotham begins 16yJ reign over Judah..."](println Z) )
(let [Z " 203007051744 =>     22.155    =>   -2.85   GOG_ID.100D...evil king Ahaz begins 16yJ reign over Judah .."](println Z) )
(let [Z " 203007311520 =>     22.1809   =>   -2.591  GOG_ID.100D...evil king Hoshea begins 9yJ reign over the rest of Israel..."](println Z) )
(let [Z " 202809041252|203008271005 => 21.48536|22.20768 =>  -9.55|-2.32   GOG_ID.100D...Primitive Pit, Onset of Primary Neurulation, Notochordal Canal..."](println Z) )
(let [Z " 203010291520 =>     22.2709   =>   -1.691  GOG_ID.100D...Hoshea and Israel begin 9yJ servitude to Shalmaneser king of Assyria..."](println Z) )
(let [Z " 203012121231 =>     22.315    =>   -1.25   GOG_ID.100D...good king Hezekiah begins 29yJ reign over Judah..."](println Z) )
(let [Z " 203012141826 =>     22.31725  =>   -1.2275 GOG_ID.100D...Somite Number 1 (Neural Folds, Cardiac Primordium, Head Fold 1)..."](println Z) )
(let [Z " 203101271007 =>     22.3609   =>   -0.791  GOG_ID.100D...Hoshea and Israel are carried away captive by Shalmaneser king of Assyria..."](println Z) )
(let [Z " 203104030800 =>     22.42681  =>   -0.1319 GOG_ID.100D...Somite Number 2 (Neural Folds, Cardiac Primordium, Head Fold 2)..."](println Z) )
(let [Z " 203104211231 =>     22.445    =>    0.05   GOG_ID.100D...185,000 soldiers of the armies of king Sennacherib of Assyria are completely destroyed in one night..."](println Z) )
(let [Z " 203107212134 =>     22.53638  =>    0.9638 GOG_ID.100D...Somite Number 3 (Neural Folds, Cardiac Primordium, Head Fold 3)..."](println Z) )
(let [Z " 203109041252 =>     22.58101  =>    1.4101 GOG_ID.100D...league (onset)..."](println Z) )
(let [Z " 203109281231 =>     22.605    =>    1.65   GOG_ID.100D...evil (and then repented) king Manasseh begins 55yJ reign over Judah..."](println Z) )
(let [Z " 203111081108 =>     22.64594  =>    2.0594 GOG_ID.100D...Somite Number 4 (Neural Fold Closes 1)..."](println Z) )
(let [Z " 203202251929 =>     22.75551  =>    3.1551 GOG_ID.100D...Somite Number 5 (Neural Fold Closes 2)..."](println Z) )
(let [Z " 203206150903 =>     22.86507  =>    4.2507 GOG_ID.100D...Somite Number 6 (Neural Fold Closes 3)..."](println Z) )
(let [Z " 203207051600 =>     22.88536  =>    4.4536 GOG_ID.100D...league (midst)..."](println Z) )
(let [Z " 203210022237 =>     22.97464  =>    5.3464 GOG_ID.100D...Somite Number 7 (Neural Fold Closes 4)..."](println Z) )
(let [Z " 203301200657 =>     23.08420  =>    6.2220 GOG_ID.100D...Somite Number 8 (Neural Fold Closes 5)..."](println Z) )
(let [Z " 203304010205 =>     23.155    =>    7.15   GOG_ID.100D...evil king Amon begins 2yJ reign over Judah..."](println Z) )
(let [Z " 203304070923 =>     23.16130  =>    7.2130 GOG_ID.100D...league (end)..."](println Z) )
(let [Z " 203304210205 =>     23.175    =>    7.35   GOG_ID.100D...good king Josiah begins 31yJ reign over Judah..."](println Z) )
(let [Z " 203305092031 =>     23.19377  =>    7.5377 GOG_ID.100D...Somite Number 9 (Neural Fold Closes 6)..."](println Z) )
(let [Z " 203306050205 =>     23.22000  =>    7.8000 GOG_ID.100D...CA BIRTH OF NEBUCHADNEZZAR..."](println Z) )
(let [Z " 203308271005 =>     23.30333  =>    8.6333 GOG_ID.100D...Somite Number 10 (Neural Fold Closes 7)..."](println Z) )
(let [Z " 203310080205 =>     23.345    =>    9.05   GOG_ID.100D...JOSIAH'S PASSOVER PREPARATION..."](println Z) )
(let [Z " 203312141826 =>     23.41290  =>    9.7290 GOG_ID.100D...Somite Number 11 (Neural Fold Closes 8)..."](println Z) )
(let [Z " 203402242052 =>     23.485    =>    10.45  GOG_ID.100D...JOSIAH'S ARMAGEDDON...evil king Jehoahaz begins 3month reign over Judah"](println Z) )
(let [Z " 203402270852 =>     23.4875   =>    10.475 GOG_ID.100D...evil king Jehoiakim begins 11yJ reign over Judah..."](println Z) )
(let [Z " 203404030800 =>     23.52246  =>    10.8246GOG_ID.100D...Somite Number 12 (Neural Fold Closes 9)..."](println Z) )
(let [Z " 203405180852 =>     23.5675   =>    11.275 GOG_ID.100D...evil king Jehoiakim becomes tributary to Nebuchadnezzar..."](println Z) )
(let [Z " 203406170852 =>     23.5975   =>    11.575 GOG_ID.100D...evil king Jehoiachin begins 3month reign over Judah...tributary to Nebuchadnezzar"](println Z) )
(let [Z " 203406192052 =>     23.600    =>    11.60  GOG_ID.100D...evil king Zedekiah begins 11yJ reign over Judah...tributary to Nebuchadnezzar"](println Z) )
(let [Z " 203407212134 =>     23.63203  =>    11.9203GOG_ID.100D...Somite Number 13 (Cranial or Rostral Neuropore Closes 1)..."](println Z) )
(let [Z " 203410072052 =>     23.710    =>    12.70  GOG_ID.100D...Nebuchadnezzar king of Babylon carries Zedekiah and all Judah into captivity..."](println Z) )
(let [Z " 203411081108 =>     23.74159  =>    13.0159GOG_ID.100D...Somite Number 14 (Cranial or Rostral Neuropore Closes 2)..."](println Z) )
(let [Z " 203502251929 =>     23.85116  =>    14.1116GOG_ID.100D...Somite Number 15 (Cranial or Rostral Neuropore Closes 3)..."](println Z) )
(let [Z " 203506150903 =>     23.96072  =>    15.2072GOG_ID.100D...Somite Number 16 (Cranial or Rostral Neuropore Closes 4)..."](println Z) )
(let [Z " 203510022237 =>     24.07029  =>    16.3029GOG_ID.100D...Somite Number 17 (Cranial or Rostral Neuropore Closes 5)..."](println Z) )
(let [Z " 203601200657 =>     24.17986  =>    17.3986GOG_ID.100D...Somite Number 18 (Cranial or Rostral Neuropore Closes 6)..."](println Z) )
(let [Z " 203604191026 =>     24.26900  =>    18.2900GOG_ID.100D...Babylon is fallen is fallen...ONSET...Jeremiah 51:46-47"](println Z) )
(let [Z " 203605092031 =>     24.28942  =>    18.4942GOG_ID.100D...Somite Number 19 (Cranial or Rostral Neuropore Closes 7)..."](println Z) )
(let [Z " 203605101026 =>     24.29000  =>    18.5000GOG_ID.100D...Babylon is fallen is fallen...CONCLUSION...Jeremiah 51:46-47...The Medes overrun Babylon...Isaiah 21:1-10..."](println Z) )
(let [Z " 203608271005 =>     24.39899  =>    19.5899GOG_ID.100D...Somite Number 20 (Cranial or Rostral Neuropore Closes 8)..."](println Z) )
(let [Z " 203609091026 =>     24.41200  =>    19.7200GOG_ID.100D...PROCLAMATION OF CYRUS...begin...6th OR THIRD 490yJ begins..."](println Z) )
(let [Z " 203610071026 =>     24.44000  =>    20.0000GOG_ID.100D...PROCLAMATION OF CYRUS...end..."](println Z) )
(let [Z " 203612141826 =>     24.50855  =>    20.6855GOG_ID.100D...Somite Number 21 (Caudal Neuropore Closes 1)..."](println Z) )
(let [Z " 203704030800 =>     24.61812  =>    21.7812GOG_ID.100D...Somite Number 22 (Caudal Neuropore Closes 2)..."](println Z) )
(let [Z " 203707212134 =>     24.72768  =>    22.8768GOG_ID.100D...Somite Number 23 (Caudal Neuropore Closes 3)..."](println Z) )
(let [Z " 203711081108 =>     24.83725  =>    23.9725GOG_ID.100D...Somite Number 24 (Caudal Neuropore Closes 4)..."](println Z) )
(let [Z " 203801190226 =>     24.90910  =>    24.6910GOG_ID.100D...Nehemiah finishes rebuilding the wall and the city of Jerusalem...after 49yG"](println Z) )
(let [Z " 203801290555 =>     24.91925  =>    24.7925GOG_ID.100D...Nehemiah's building work at 50yG..."](println Z) )
(let [Z " 203802081648 =>     24.92970  =>    24.8970GOG_ID.100D...blessed is he who waiteth and cometh to the 1335 days...Nehemiah's building waits and comes to ca. 51.03042857142857yG..."](println Z) )
(let [Z " 203802120800 =>     24.93333  =>    24.9333GOG_ID.100D...Nehemiah's building waits and comes to ca. 51.38857142857142yG..."](println Z) )
(let [Z " 203802251929 =>     24.94681  =>    25.0681GOG_ID.100D...Somite Number 25 (Caudal Neuropore Closes 5)..."](println Z) )
(let [Z " 203806150903 =>     25.05638  =>    26.1638GOG_ID.100D...Somite Number 26 (Caudal Neuropore Closes 6)..."](println Z) )
(let [Z " 203810022237 =>     25.16594  =>    27.2594GOG_ID.100D...Somite Number 27 (Caudal Neuropore Closes 7)..."](println Z) )
(let [Z " 203901200657 =>     25.27551  =>    28.3551GOG_ID.100D...Somite Number 28 (Caudal Neuropore Closes 8)..."](println Z) )
(let [Z " 203904081751 =>     25.35396  =>    29.1396GOG_ID.100D...Alexander the Great...begin..."](println Z) )
(let [Z " 203905092031 =>     25.38507  =>    29.4507GOG_ID.100D...Somite Number 29 (Caudal Neuropore Closes 9)..."](println Z) )
(let [Z " 203908271005 =>     25.49464  =>    30.5464GOG_ID.100D...Somite Number 30 (Leg Buds, Lens Placode, Pharyngeal Arches 1)..."](println Z) )
(let [Z " 203912141826 =>     25.60420  =>    31.6420GOG_ID.100D...Somite Number 31 (Leg Buds, Lens Placode, Pharyngeal Arches 2)..."](println Z) )
(let [Z " 203912242155 =>     25.61435  =>    31.7435GOG_ID.100D...come up..."](println Z) )
(let [Z " 204003121635 =>     25.69213  =>    32.5213GOG_ID.100D...Alexander the Great...end..."](println Z) )
(let [Z " 204003281334 =>     25.70800  =>    32.6800GOG_ID.100D...Wars of the Diadochi (Successors of Alexander the Great)...begin..."](println Z) )
(let [Z " 204004030800 =>     25.71377  =>    32.7377GOG_ID.100D...Somite Number 32 (Leg Buds, Lens Placode, Pharyngeal Arches 3)..."](println Z) )
(let [Z " 204007212134 =>     25.82333  =>    33.8333GOG_ID.100D...Somite Number 33 (Leg Buds, Lens Placode, Pharyngeal Arches 4)..."](println Z) )
(let [Z " 204011070846 =>     25.93180  =>    34.9180GOG_ID.100D...Wars of the Diadochi (Successors of Alexander the Great)...end 0...TURN THEE BACK, BUT THE SIXTH PART OF THEE EZEKIEL 39:2 ISAIAH 31:9 REVELATION 6:12-17"](println Z) )
(let [Z " 204011081108 =>     25.93290  =>    34.9290GOG_ID.100D...Somite Number 34 (Leg Buds, Lens Placode, Pharyngeal Arches 5)..."](println Z) )
(let [Z " 204102251929 =>     26.04246  =>    36.0246GOG_ID.100D...Somite Number 35 (Leg Buds, Lens Placode, Pharyngeal Arches 6)..."](println Z) )
(let [Z " 204105070333 =>     26.11280  =>    36.7280GOG_ID.100D...Wars of the Diadochi (Successors of Alexander the Great)...end 1..."](println Z) )
(let [Z " 204106150903 =>     26.15203  =>    37.1203GOG_ID.100D...Somite Number 36 (Leg Buds, Lens Placode, Pharyngeal Arches 7)..."](println Z) )
(let [Z " 204110022237 =>     26.26159  =>    38.2159GOG_ID.100D...Somite Number 37 (Leg Buds, Lens Placode, Pharyngeal Arches 8)..."](println Z) )
(let [Z " 204111020333 =>     26.29180  =>    38.5180GOG_ID.100D...First Punic War...begin...A PLACE CALLED IN THE HEBREW TONGUE ARMAGEDDON REVELATION 16:16...EARLY ONSET"](println Z) )
(let [Z " 204201200657 =>     26.37116  =>    39.3116GOG_ID.100D...Somite Number 38 (Leg Buds, Lens Placode, Pharyngeal Arches 9)..."](println Z) )
(let [Z " 204204170308 =>     26.45800  =>    40.1800GOG_ID.100D...First Punic War...end...THEN SHALL THE SANCTUARY BE CLEANSED DANIEL 8:14...BEGIN"](println Z) )
(let [Z " 204205092031 =>     26.48072  =>    40.4072GOG_ID.100D...Somite Number 39 (Leg Buds, Lens Placode, Pharyngeal Arches 10)..."](println Z) )
(let [Z " 204208271005 =>     26.59029  =>    41.5029GOG_ID.100D...Somite Number 40 (Leg Buds, Lens Placode, Pharyngeal Arches 11)..."](println Z) )
(let [Z " 204211130308 =>     26.66800  =>    42.2800GOG_ID.100D...CA DEATH IN BATTLE OF HAMILCAR BARCA OF CARTHAGE...SEVEN MONTHS SHALL...ISRAEL BE BURYING OF THEM, THAT THEY MAY CLEANSE THE LAND EZEKIEL 39:12...END"](println Z) )
(let [Z " 204212141826 =>     26.69986  =>    42.5986GOG_ID.100D...Somite Number 41 (Leg Buds, Lens Placode, Pharyngeal Arches 12)..."](println Z) )
(let [Z " 204304030800 =>     26.80942  =>    43.6942GOG_ID.100D...Somite Number 42 (Leg Buds, Lens Placode, Pharyngeal Arches 13)..."](println Z) )
(let [Z " 204307212134 =>     26.91899  =>    44.7899GOG_ID.100D...Somite Number 43 (Leg Buds, Lens Placode, Pharyngeal Arches 14)..."](println Z) )
(let [Z " 204311081108 =>     27.02855  =>    45.8855GOG_ID.100D...Somite Number 44 (Leg Buds, Lens Placode, Pharyngeal Arches 15)..."](println Z) )
(let [Z " 204609041252|204909041252 => 28.05928|29.15493 =>  56.1928|67.1493GOG_ID.100D    ...Lens Vesicle, Nasal Pit, Hand Plate..."](println Z) )
(let [Z " 204903052216 =>     28.97232  =>    65.3232GOG_ID.100D...Satan withstands the person JESUS...age 0yG...begin"](println Z) )
(let [Z " 204910071437 =>     29.18800  =>    67.4800GOG_ID.100D...CA PAX ROMANA BEGIN 0...THE VALLEY OF HAMON-GOG 0...EZEKIEL 39:15..."](println Z) )
(let [Z " 204910080021 =>     29.18841  =>    67.4841GOG_ID.100D...Satan withstands the person JESUS...age 21.3yG end"](println Z) )
(let [Z " 204910271437 =>     29.20800  =>    67.6800GOG_ID.100D...CA PAX ROMANA BEGIN 1...THE VALLEY OF HAMON-GOG 1...EZEKIEL 39:15..."](println Z) )
(let [Z " 205001040123 =>     29.27666  =>    68.3666GOG_ID.100D...MINISTRY OF JESUS CHRIST THE LORD BEGINS"](println Z) )
(let [Z " 205002031150 =>     29.30710  =>    68.6710GOG_ID.100D...CRUCIFIXION (AT GOLGOTHA - THE PLACE OF A SKULL) AND RESURRECTION OF CHRIST JESUS THE LORD...7th OR FOURTH 490yJ begins..."](println Z) )
(let [Z " 205003080923 =>     29.34000  =>    69.0000GOG_ID.100D...COLOSSIANS 1:24...Who now rejoice in my sufferings for you, and fill up that which is behind of the afflictions of CHRIST in my flesh for HIS body's sake, which is the Church..."](println Z) )
(let [Z " 205101020410 =>     29.64000  =>    72.0000GOG_ID.100D...CA BEGINNING OF THE JUDGMENT ON CHRISTIANS (UNDER NERO)..."](println Z) )
(let [Z " 205112272257 =>     30.00000  =>    75.6000GOG_ID.100D...CA THE APOCALYPSE OF THE GLORY OF THE LORD JESUS CHRIST TO ST. JOHN THE BELOVED ON THE ISLAND OF PATMOS..."](println Z) )
(let [Z " 205312171231 =>     30.72000  =>    82.8000GOG_ID.100D...CA PAX ROMANA END...THE NAME OF THE CITY SHALL BE HAMONAH...END...EZEKIEL 39:16..."](println Z) )
(let [Z " 205408261231 =>     30.97200  =>    85.3200GOG_ID.100D...CA PAX ROMANA END-CIRCUMSPECTION...THE NAME OF THE CITY SHALL BE HAMONAH...END-CIRCUMSPECTION...EZEKIEL 39:16..."](println Z) )


(let [Z "GENERIC SCHEDULE FOR OPERATION BUILDING BLOCKS"](println Z) )
(let [Z "         SFO_BB = -147.60   =>    ...-25.99dysi...Primordial Follicles..."](println Z) )
(let [Z "         SFO_BB = -132.97   =>    ...-21.60dysi..."](println Z) )
(let [Z "         SFO_BB = -126.30   =>    ...-19.60dysi..."](println Z) )
(let [Z "         SFO_BB = -123.01   =>    ...-18.612dysi..."](println Z) )
(let [Z "         SFO_BB = -120.97   =>    ...-18.00dysi..."](println Z) )
(let [Z "         SFO_BB = -110.97   =>    ...-15.00dysi..."](println Z) )
(let [Z "         SFO_BB = -104.40   =>    ...Primary-Stage Follicles..."](println Z) )
(let [Z "         SFO_BB = -100.97   =>    ...-12.00dysi..."](println Z) )
(let [Z "         SFO_BB =  -98.30   =>    ...-11.20dysi..."](println Z) )
(let [Z "         SFO_BB =  -95.60   =>    ...-10.39dysi...Jericho 0 (Joshua 2:1-3 & Joshua 6:17-23) | Rahab...to them that know me (Psalms 87:4)"](println Z) )
(let [Z "         SFO_BB =  -91.56   =>     ...-9.18dysi...Jericho 1 (Joshua 2:1-3 & Joshua 6:17-23) | Rahab...to them that know me (Psalms 87:4)"](println Z) )
(let [Z "         SFO_BB =  -90.60   =>     ...-8.89dysi...Jericho 2 (Joshua 2:1-3 & Joshua 6:17-23) | Rahab...to them that know me (Psalms 87:4)"](println Z) )
(let [Z "         SFO_BB =  -83.19   =>     ...-6.668dysi..."](println Z) )
(let [Z "         SFO_BB =  -72.03   =>     ...-3.32dysi..."](println Z) )
(let [Z "         SFO_BB =  -61.20   =>     ...-0.07dysi...=> ZERO DAYS OF SEVEN DYSI COUNT...Primary-Stage (Mitotic Cells almost 0.1mm in diameter)..."](println Z) )
(let [Z "         SFO_BB =  -60.97   =>      ...0.00dysi...=> SEVEN DAYS OF SEVEN DYSI COUNT..."](println Z) )
(let [Z "         SFO_BB =  -43.20   =>      ...5.33dysi...Secondary-Stage Follicles (Theca Cells...Granulosa Cells 0.2mm)..."](println Z) )
(let [Z "         SFO_BB =  -39.5984 =>      ...6.41048dysi...Pre-Adamites Tertiary-Stage Follices (Antral Phase 1)..."](println Z) )
(let [Z "         SFO_BB =  -38.80   =>      ...6.65dysi...Adam is formed..."](println Z) )
(let [Z "         SFO_BB =  -37.5186 =>    ...Birth of Seth..."](println Z) )
(let [Z "         SFO_BB =  -36.4836 =>    ...Birth of Enos...men begin to call upon THE NAME OF THE LORD..."](println Z) )
(let [Z "         SFO_BB =  -35.5964 =>    ...Birth of Cainan..."](println Z) )
(let [Z "         SFO_BB =  -34.9064 =>    ...Birth of Mahalaleel..."](println Z) )
(let [Z "         SFO_BB =  -34.2657 =>    ...Birth of Jared..."](println Z) )
(let [Z "         SFO_BB =  -32.6689 =>    ...Birth of Enoch..."](println Z) )
(let [Z "         SFO_BB =  -32.1400 =>    ...the Angels that sinned (0)..."](println Z) )
(let [Z "         SFO_BB =  -32.0281 =>    ...Birth of Methuselah...Tertiary-Stage Follicles (Antral Phase 2)..."](println Z) )
(let [Z "         SFO_BB =  -30.1849 =>    ...Birth of Lamech..."](println Z) )
(let [Z "         SFO_BB =  -29.6329 =>    ...Death of Adam..."](println Z) )
(let [Z "         SFO_BB =  -29.0710 =>    ...Enoch was not..."](println Z) )
(let [Z "         SFO_BB =  -28.6471 =>    ...1st 490yJ begins..."](println Z) )
(let [Z "         SFO_BB =  -28.5289 =>    ...Death of Seth..."](println Z) )
(let [Z "         SFO_BB =  -28.3909 =>    ...Birth of Noah..."](println Z) )
(let [Z "         SFO_BB =  -27.6000 =>    ...the Angels that sinned (1)..."](println Z) )
(let [Z "         SFO_BB =  -27.5629 =>    ...Death of Enos..."](println Z) )
(let [Z "         SFO_BB =  -26.6264 =>    ...Death of Cainan..."](println Z) )
(let [Z "         SFO_BB =  -26.0843 =>    ...Death of Mahalaleel..."](println Z) )
(let [Z "         SFO_BB =  -25.9000 =>    ...the Angels that sinned (2)..."](println Z) )
(let [Z "         SFO_BB =  -24.7831 =>    ...Death of Jared..."](println Z) )
(let [Z "         SFO_BB =  -23.8171 =>    ...2nd 490yJ begins..."](println Z) )
(let [Z "         SFO_BB =  -23.6594 =>    ...Yet his days shall be 120 years...  (Atresia 1)..."](println Z) )
(let [Z "         SFO_BB =  -23.4623 =>    ...Birth of Shem..."](println Z) )
(let [Z "         SFO_BB =  -22.5259 =>    ...Death of Lamech..."](println Z) )
(let [Z "         SFO_BB =  -22.4766 =>    ...Death of Methuselah...Noah is 600yJ of age...(Atresia 2)..."](println Z) )
(let [Z "         SFO_BB =  -22.4569 =>    ...Birth of Arphaxad..."](println Z) )
(let [Z "         SFO_BB =  -22.1119 =>    ...Birth of Salah..."](println Z) )
(let [Z "         SFO_BB =  -21.9936 =>    ...Nimrod a mighty hunter before THE LORD..."](println Z) )
(let [Z "         SFO_BB =  -21.8161 =>    ...Birth of Eber..."](println Z) )
(let [Z "         SFO_BB =  -21.60   =>    ...         (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 0)..."](println Z) )
(let [Z "         SFO_BB =  -21.4810 =>    ...Birth of Peleg...in his days the earth was divided..."](println Z) )
(let [Z "         SFO_BB =  -21.1853 =>    ...Birth of Reu..."](println Z) )
(let [Z "         SFO_BB =  -20.8699 =>    ...Birth of Serug..."](println Z) )
(let [Z "         SFO_BB =  -20.5741 =>    ...Birth of Nahor..."](println Z) )
(let [Z "         SFO_BB =  -20.2883 =>    ...Birth of Terah (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 1)..."](println Z) )
(let [Z "         SFO_BB =  -19.5983 =>    ...Birth of Abram (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 2)..."](println Z) )
(let [Z "         SFO_BB =  -19.1251 =>    ...Death of Peleg..."](println Z) )
(let [Z "         SFO_BB =  -19.1153 =>    ...Death of Nahor..."](println Z) )
(let [Z "         SFO_BB =  -19.0857 =>    ...Now THE LORD had said unto Abram...Get thee out of thy country..."](println Z) )
(let [Z "         SFO_BB =  -19.0266 =>    ...Death of Noah..."](println Z) )
(let [Z "         SFO_BB =  -18.9871 =>    ...3rd 490yJ begins..."](println Z) )
(let [Z "         SFO_BB =  -18.8590 =>    ...and Abram was 75yJ when he departed (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 3)..."](println Z) )
(let [Z "         SFO_BB =  -18.8294 =>    ...Death of Reu..."](println Z) )
(let [Z "         SFO_BB =  -18.7900 =>    ...Birth of Ishmael..."](println Z) )
(let [Z "         SFO_BB =  -18.6126 =>    ...Birth of Isaac (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 4)..."](println Z) )
(let [Z "         SFO_BB =  -18.6027 =>    ...Death of Serug..."](println Z) )
(let [Z "         SFO_BB =  -18.2676 =>    ...Death of Terah..."](println Z) )
(let [Z "         SFO_BB =  -18.1394 =>    ...Death of Arphaxad..."](println Z) )
(let [Z "         SFO_BB =  -18.0211 =>    ...Birth of Jacob       (A Cohort of 5 to 7 Class 5 Follicles Is Recruited Into the Menstrual Cycle 5) Start of Menses..."](println Z) )
(let [Z "         SFO_BB =  -17.8733 =>    ...Death of Abraham..."](println Z) )
(let [Z "         SFO_BB =  -17.8437 =>    ...Death of Salah..."](println Z) )
(let [Z "         SFO_BB =  -17.5283 =>    ...Death of Shem..."](println Z) )
(let [Z "         SFO_BB =  -17.4396 =>    ...Death of Ishmael..."](println Z) )
(let [Z "         SFO_BB =  -17.2720 =>    ...And Isaac sent away Jacob...and he went to Padan-aram unto Laban..."](println Z) )
(let [Z "         SFO_BB =  -17.2424 =>    ...Death of Eber..."](println Z) )
(let [Z "         SFO_BB =  -17.1340 =>    ...Birth of Joseph..."](println Z) )
(let [Z "         SFO_BB =  -16.9664 =>    ...Joseph...being 17yJ old...was feeding the flock with his brethren..."](println Z) )
(let [Z "         SFO_BB =  -16.8383 =>    ...Death of Isaac...Joseph was 30yJ old when he stood before Pharaoh king of Egypt..."](println Z) )
(let [Z "         SFO_BB =  -16.7397 =>    ...And Jacob said unto Pharaoh...The days of the years of my pilgrimage are 130yJ..."](println Z) )
(let [Z "         SFO_BB =  -16.5721 =>    ...Death of Jacob (Israel)..."](println Z) )
(let [Z "         SFO_BB =  -16.56   =>    ...Estrogen Surge Ends Menses 0..."](println Z) )
(let [Z "         SFO_BB =  -16.40   =>    ...Estrogen Surge Ends Menses 1..."](println Z) )
(let [Z "         SFO_BB =  -16.0497 =>    ...Death of Joseph..."](println Z) )
(let [Z "         SFO_BB =  -16.00   =>    ...Estrogen Surge Ends Menses 2..."](println Z) )
(let [Z "         SFO_BB =  -15.6357 =>    ...Birth of Moses..."](println Z) )
(let [Z "         SFO_BB =  -15.2414 =>    ...Moses at 40yJ  Emergence of the Dominant Follicle..."](println Z) )
(let [Z "         SFO_BB =  -15.00   =>    ...of a flood (onset)..."](println Z) )
(let [Z "         SFO_BB =  -14.8471 =>    ...Moses at 80yJ...the children of Israel...WITH AN OUTSTRETCHED ARM...are delivered from Pharaoh and Egypt..."](println Z) )
(let [Z "         SFO_BB =  -14.4529 =>    ...Death of Moses..."](println Z) )
(let [Z "         SFO_BB =  -14.40   =>    ...Early Insemination..."](println Z) )
(let [Z "         SFO_BB =  -14.1571 =>    ...Israel in the Promised Land...begin to serve Chushan-rishathaim 8yJ...era of Judges begins...4th OR FIRST 490yJ begins...Luteinizing Hormone surges..."](println Z) )
(let [Z "         SFO_BB =  -14.0783 =>    ...Othniel the son of Kenaz begins to judge Israel 40yJ..."](println Z) )
(let [Z "         SFO_BB =  -13.6840 =>    ...children of Israel begin to serve Eglon king of Moab 18yJ..."](println Z) )
(let [Z "         SFO_BB =  -13.5066 =>    ...Ehud the son of Gera (and Shamgar the son of Anath after him) begin to judge Israel 80yJ..."](println Z) )
(let [Z "         SFO_BB =  -13.50   =>    ...Ovulation Begins For ca. 36 hours..."](println Z) )
(let [Z "         SFO_BB =  -13.32   =>    ...Ed & Sr 80yJ (Fertilized Oocyte, Zygote, Pro-Nuclei 1)..."](println Z) )
(let [Z "         SFO_BB =  -13.14   =>    ...             (Fertilized Oocyte, Zygote, Pro-Nuclei 2)..."](println Z) )
(let [Z "         SFO_BB =  -12.96   =>    ...             (Fertilized Oocyte, Zygote, Pro-Nuclei 3)..."](println Z) )
(let [Z "         SFO_BB =  -12.7180 =>    ...Jabin king of Canaan begins to mightily oppress Israel for 20yJ..."](println Z) )
(let [Z "         SFO_BB =  -12.5209 =>    ...Deborah...a prophetess...the wife of Lapidoth...begins to judge Israel for 40yJ..."](println Z) )
(let [Z "-12.78 <=SFO_BB<=  -12.42   =>    ...Morula Cell Division with...Blastocyst Formation of Inner and Outer Cell Mass..."](println Z) )
(let [Z "         SFO_BB =  -12.1266 =>    ...children of Israel begin to serve Midian for 7yJ..."](println Z) )
(let [Z "         SFO_BB =  -12.0576 =>    ...Gideon begins to judge Israel for 40yJ..."](println Z) )
(let [Z "         SFO_BB =  -12.00   =>    ...of a flood (midst)..."](println Z) )
(let [Z "-12.06 <=SFO_BB<=  -11.70   =>    ...Loss of Zona Pellucida, Free Blastocyst..."](println Z) )
(let [Z "         SFO_BB =  -11.6633 =>    ...Abimelech begins to judge Israel for 3yJ..."](println Z) )
(let [Z "         SFO_BB =  -11.6337 =>    ...Tola the son of Puah begins to judge Israel for 23yJ..."](println Z) )
(let [Z "         SFO_BB =  -11.4070 =>    ...Jair...a Gileadite...begins to judge Israel for 22yJ..."](println Z) )
(let [Z "-11.70 <=SFO_BB<=  -11.34   =>    ...Attaching Blastocyst..."](println Z) )
(let [Z "         SFO_BB =  -11.1901 =>    ...the Philistines and the children of Ammon begin to oppress the children of Israel 18yJ..."](println Z) )
(let [Z "         SFO_BB =  -11.0127 =>    ...Jephthah the Gileadite begins to judge Israel for 6yJ..."](println Z) )
(let [Z "         SFO_BB =  -10.9536 =>    ...Ibzan of Bethlehem begins to judge Israel for 7yJ..."](println Z) )
(let [Z "         SFO_BB =  -10.8846 =>    ...Elon...a Zebulonite...begins to judge Israel for 10yJ..."](println Z) )
(let [Z "         SFO_BB =  -10.8254 =>    ...Birth of the Nazarites...Samuel (1 Samuel 1) and Samson (Judges 13:2-24)..."](println Z) )
(let [Z "         SFO_BB =  -10.7860 =>    ...Abdon the son of Hillel...a Pirathonite...begins to judge Israel for 8yJ..."](println Z) )
(let [Z "         SFO_BB =  -10.7071 =>    ...the children of Israel begin to serve the Philistines for 40yJ..."](println Z) )
(let [Z "         SFO_BB =  -10.6283 =>    ...Samson begins to judge Israel for 20yJ..."](println Z) )
(let [Z "         SFO_BB =  -10.5100 =>    ...(begin) The Ark in Kirjath-jearim for 20yJ (1 Samuel 7:2)...(begin)..."](println Z) )
(let [Z "         SFO_BB =  -10.4311 =>    ...Death of Samson (Judges 16:30)..."](println Z) )
(let [Z "         SFO_BB =  -10.3129 =>    ...(end) The Ark in Kirjath-jearim for 20yJ...(end)......The Philistines were subdued...all the days of Samuel...No king in Israel (begin)..."](println Z) )
(let [Z "         SFO_BB =  -10.2241 =>    ...and there they made Saul king before THE LORD .(1 Samuel 11:15)..No king in Israel (end)"](println Z) )
(let [Z "         SFO_BB =   -9.8496 =>    ...ca. death of Samuel (1 Samuel 25:1)..."](println Z) )
(let [Z "         SFO_BB =   -9.8299 =>    ...Death of Saul...David begins 40yJ reign as king over all Israel..."](println Z) )
(let [Z "         SFO_BB =   -9.4602 =>    ...Solomon begins 40yJ co-reign (with David) over all Israel..."](println Z) )
(let [Z "         SFO_BB =   -9.4356 =>    ...Solomon begins 36.5yJ sole-reign over all Israel...480th year...he begins to build the temple of THE LORD"](println Z) )
(let [Z "         SFO_BB =   -9.3271 =>    ...Solomon completes the temple of THE LORD...5th OR SECOND 490yJ begins"](println Z) )
(let [Z "-10.98 <=SFO_BB<=   -9.18   =>    ...Implantation..."](println Z) )
(let [Z "         SFO_BB =   -9.0659 =>    ...Rehoboam begins 17yJ reign over Judah...Jeroboam begins 22yJ reign over rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -8.8984 =>    ...Abijam begins 3yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -8.89   =>    ...prince of the covenant also..."](println Z) )
(let [Z "         SFO_BB =   -8.8688 =>    ...good king Asa begins 41yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -8.8491 =>    ...Nadab begins to reign 2yJ over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -8.8294 =>    ...evil king Baasha begins to reign 24yJ over the rest of Israel after assassinating Nadab..."](println Z) )
(let [Z "         SFO_BB =   -8.5928 =>    ...evil king Elah begins to reign 2yJ over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -8.5731 =>    ...evil kings...Zimri 7days...Omri 12yJ...and Tibni 4yJ begin to reign over the rest of Israel"](println Z) )
(let [Z "         SFO_BB =   -8.5336 =>    ...evil king Omri begins 8yJ rule over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -8.5189 =>    ...at this point Ahab the son of Omri begins 22yJ co-reign over the rest of Israel with his father Omri..."](println Z) )
(let [Z "         SFO_BB =   -8.4646 =>    ...good king Jehoshaphat begins reign 25yJ over Judah..."](println Z) )
(let [Z "         SFO_BB =   -8.4548 =>    ...evil king Ahab begins sole reign over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -8.302  =>    ...evil king Ahaziah begins 2yJ sole reign over the rest of Israel upon THE STUMBLING DEATH 1Kings 22:29-40 of Ahab..."](println Z) )
(let [Z "         SFO_BB =   -8.2823 =>    ...evil king Ahaziah FALLS 2Kings 1:2 down through a lattice in his upper chamber (and begins co-reign with Jehoram)..."](println Z) )
(let [Z "         SFO_BB =   -8.2379 =>    ...evil king Jehoram begins to 11yJ sole-reign over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -8.2182 =>    ...another evil king Jehoram begins 8yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -8.1394 =>    ...evil king Ahaziah begins 1yJ reign over Judah ..."](println Z) )
(let [Z "         SFO_BB =   -8.1295 =>    ...good king Jehu begins 28yJ reign over the rest of Israel upon the deaths of Ahaziah, Jehoram (and Jezebel whose complete carcass WAS NOT FOUND 2Kings 9:6-37)..."](println Z) )
(let [Z "         SFO_BB =   -8.1295 =>    ...evil Queen Athaliah begins 6yJ reign over Judah..."](println Z) )
(let [Z " -8.82 <=SFO_BB<=   -8.10   =>    ...Extraembryonic Mesoderm, Primitive Streak, Gastrulation..."](println Z) )
(let [Z "         SFO_BB =   -8.0704 =>    ...good king Jehoash begins 40yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -8.00   =>    ...of a flood (end)..."](println Z) )
(let [Z "         SFO_BB =   -7.92   =>    ...Gestation at 28 days..."](println Z) )
(let [Z "         SFO_BB =   -7.8535 =>    ...evil king Jehoahaz begins 17yJ reign over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -7.6859 =>    ...evil king Jehoash begins 16yJ reign over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -7.6761 =>    ...good king Amaziah of Judah begins 29yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -7.6613 =>    ...birth of evil king Jeroboam II of the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -7.5282 =>    ...evil king Jeroboam II begins 41yJ reign over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -7.3902 =>    ...good king Uzziah begins 52yJ reign over Judah..."](println Z) )
(let [Z " -8.10 <=SFO_BB<=   -7.38   =>    ...Gastrulation, Notochordal Process..."](println Z) )
(let [Z "         SFO_BB =   -7.1241 =>    ...an 11yJ coregency begins between the end of Jeroboam II and beginning proper of Zachariah..."](println Z) )
(let [Z "         SFO_BB =   -7.0156 =>    ...evil king Zachariah begins 0.5yJ reign over the rest of Israel in the 38th year of Uzziah of Judah's  reign..."](println Z) )
(let [Z "         SFO_BB =   -7.0107 =>    ...evil king Shallum begins 1 month reign over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -7.0098 =>    ...evil king Menahem begins 10yJ reign over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -6.9113 =>    ...evil king Pekahiah begins 2yJ reign over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -6.8915 =>    ...evil king Pekah begins 20yJ reign over the rest of Israel..."](println Z) )
(let [Z "         SFO_BB =   -6.8776 =>    ...good king Jotham begins 16yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -6.7199 =>    ...evil king Ahaz begins 16yJ reign over Judah .."](println Z) )
(let [Z "         SFO_BB =   -6.6944 =>    ...evil king Hoshea begins 9yJ reign over the rest of Israel..."](println Z) )
(let [Z " -7.38 <=SFO_BB<=   -6.668  =>    ...Primitive Pit, Onset of Primary Neurulation, Notochordal Canal..."](println Z) )
(let [Z "         SFO_BB =   -6.6057 =>    ...Hoshea and Israel begin 9yJ servitude to Shalmaneser king of Assyria..."](println Z) )
(let [Z "         SFO_BB =   -6.5622 =>    ...good king Hezekiah begins 29yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -6.56   =>    ...Somite Number 1 (Neural Folds, Cardiac Primordium, Head Fold 1)..."](println Z) )
(let [Z "         SFO_BB =   -6.5170 =>    ...Hoshea and Israel are carried away captive by Shalmaneser kingof Assyria..."](println Z) )
(let [Z "         SFO_BB =   -6.452  =>    ...Somite Number 2 (Neural Folds, Cardiac Primordium, Head Fold 2)..."](println Z) )
(let [Z "         SFO_BB =   -6.4341 =>    ...185,000 soldiers of the armies of king Sennacherib of Assyria are completely destroyed in one night..."](println Z) )
(let [Z "         SFO_BB =   -6.344  =>    ...Somite Number 3 (Neural Folds, Cardiac Primordium, Head Fold 3)..."](println Z) )
(let [Z "         SFO_BB =   -6.30   =>    ...league (onset)..."](println Z) )
(let [Z "         SFO_BB =   -6.2764 =>    ...evil (and then repented) king Manasseh begins 55yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -6.236  =>    ...Somite Number 4 (Neural Fold Closes 1)..."](println Z) )
(let [Z "         SFO_BB =   -6.128  =>    ...Somite Number 5 (Neural Fold Closes 2)..."](println Z) )
(let [Z "         SFO_BB =   -6.02   =>    ...Somite Number 6 (Neural Fold Closes 3)..."](println Z) )
(let [Z "         SFO_BB =   -6.00   =>    ...league (midst)..."](println Z) )
(let [Z "         SFO_BB =   -5.912  =>    ...Somite Number 7 (Neural Fold Closes 4)..."](println Z) )
(let [Z "         SFO_BB =   -5.804  =>    ...Somite Number 8 (Neural Fold Closes 5)..."](println Z) )
(let [Z "         SFO_BB =   -5.7342 =>    ...evil king Amon begins 2yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -5.728  =>    ...league (end)..."](println Z) )
(let [Z "         SFO_BB =   -5.7145 =>    ...good king Josiah begins 31yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -5.696  =>    ...Somite Number 9 (Neural Fold Closes 6)..."](println Z) )
(let [Z "         SFO_BB =   -5.588  =>    ...Somite Number 10 (Neural Fold Closes 7)..."](println Z) )
(let [Z "         SFO_BB =   -5.5469 =>    ...JOSIAH'S PASSOVER PREPARATION..."](println Z) )
(let [Z "         SFO_BB =   -5.48   =>    ...Somite Number 11 (Neural Fold Closes 8)..."](println Z) )
(let [Z "         SFO_BB =   -5.4089 =>    ...JOSIAH'S ARMAGEDDON...evil king Jehoahaz begins 3month reign over Judah"](println Z) )
(let [Z "         SFO_BB =   -5.4065 =>    ...evil king Jehoiakim begins 11yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -5.372  =>    ...Somite Number 12 (Neural Fold Closes 9)..."](println Z) )
(let [Z "         SFO_BB =   -5.2980 =>    ...evil king Jehoiachin begins 3month reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -5.2956 =>    ...evil king Zedekiah begins 11yJ reign over Judah..."](println Z) )
(let [Z "         SFO_BB =   -5.264  =>    ...Somite Number 13 (Cranial or Rostral Neuropore Closes 1)..."](println Z) )
(let [Z "         SFO_BB =   -5.1871 =>    ...Nebuchadnezzar king of Babylon carries Zedekiah and all Judah into captivity..."](println Z) )
(let [Z "         SFO_BB =   -5.156  =>    ...Somite Number 14 (Cranial or Rostral Neuropore Closes 2)..."](println Z) )
(let [Z "         SFO_BB =   -5.048  =>    ...Somite Number 15 (Cranial or Rostral Neuropore Closes 3)..."](println Z) )
(let [Z "         SFO_BB =   -4.94   =>    ...Somite Number 16 (Cranial or Rostral Neuropore Closes 4)..."](println Z) )
(let [Z "         SFO_BB =   -4.832  =>    ...Somite Number 17 (Cranial or Rostral Neuropore Closes 5)..."](println Z) )
(let [Z "         SFO_BB =   -4.724  =>    ...Somite Number 18 (Cranial or Rostral Neuropore Closes 6)..."](println Z) )
(let [Z "         SFO_BB =   -4.616  =>    ...Somite Number 19 (Cranial or Rostral Neuropore Closes 7)..."](println Z) )
(let [Z "         SFO_BB =   -4.508  =>    ...Somite Number 20 (Cranial or Rostral Neuropore Closes 8)..."](println Z) )
(let [Z "         SFO_BB =   -4.5000 =>    ...PROCLAMATION OF CYRUS...6th OR THIRD 490yJ begins..."](println Z) )
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
(let [Z "         SFO_BB =   +0.33   =>    ...CRUCIFIXION AND RESURRECTION OF JESUS CHRIST...7th OR FOURTH 490yJ begins..."](println Z) )
(let [Z "         SFO_BB =   +0.80   =>    ...forecast devices (time 0)..."](println Z) )
(let [Z " -0.18 <=SFO_BB<=   +1.62   =>    ...Nasal Pits move ventrally, Auricular Hillocks, Foot Plate..."](println Z) )
(let [Z "         SFO_BB =   +1.81   =>    ...1Thidden..."](println Z) )
(let [Z "  1.62 <=SFO_BB<=    2.34   =>    ...Finger Rays..."](println Z) )
(let [Z "         SFO_BB =    3.60   =>    ...AShidden..."](println Z) )
(let [Z "  2.34 <=SFO_BB<=    3.78   =>    ...Ossification commences..."](println Z) )
(let [Z "         SFO_BB =    4.40   =>    ...forecast devices (time 360)..."](println Z) )
(let [Z "  3.78 <=SFO_BB<=    4.86   =>    ...Straightening of the Trunk..."](println Z) )
(let [Z "         SFO_BB =    5.16   =>    ...8th OR FIFTH 490yJ begins..."](println Z) )
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
(let [Z "         SFO_BB =    9.99   =>    ...9th OR SIXTH 490yJ begins..."](println Z) )
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
(let [Z "         SFO_BB =   14.82   =>    ...10th OR SEVENTH 490yJ begins..."](println Z) )
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
(let [Z "         SFO_BB =   19.65   =>    ...10th OR SEVENTH 490yJ ends...70yJ begins"](println Z) )
(let [Z "         SFO_BB =   19.81   =>    ...6Thidden..."](println Z) )
(let [Z "         SFO_BB =   20.00   =>    ...Mohammed and the Tares (onset)..."](println Z) )
(let [Z "         SFO_BB =   20.186  =>    ...Mohammed and the Tares (loosed)..."](println Z) )
(let [Z "         SFO_BB =   20.34   =>    ...70yJ ends...1 week begins..."](println Z) )
(let [Z "         SFO_BB =   20.41   =>    ...1 week ends..."](println Z) )
(let [Z "         SFO_BB =   20.42   =>    ...ca. 1000yG begins..."](println Z) )
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
(let [Z "         SFO_BB =   30.42   =>    ...ca. 1000yG ends..."](println Z) )
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


(let [Z "FEASTS OF THE LORD IN THE GREAT JUBILEE YEAR 1965 TO 2034 AND BEYOND IN STANDARD FORM 700D"] (println Z))
(let [Z "...0.00                          => New Year Beginning 19650315"] (println Z))
(let [Z "0.00 -> 4(.70|.80)               => 1st SEVEN WEEKS IN THE YEAR => 30TH OF 12TH MONTH -> 18TH OF 2ND MONTH=> 1965(0103|0314) -> 1974(0318|0527)"] (println Z))
(let [Z "THE SABBATH DAY                  => Seven days of work...SEVENTH DAY FOR REST "](println Z) )
(let [Z "...1.30->1.40                    => THE LORDS PASSOVER => 14th day of the 1st month (at even) => 19670910 -> 19671119  "](println Z) )
(let [Z "...1(.40|.50)->2(.10)            => EXODUS 23:14-16 1ST TIME, 1ST MONTH => -716.52|-646.52 -> -226 TNLDY => THE FEAST OF THE UNLEAVENED BREAD => 15th -> 21st of 1st month=> 19671119|19680129 -> 1968(0129|0409) "](println Z) )
(let [Z "...3(.10)                        => 1ST DAY OF 2ND MONTH =>  19701214|19710222 "](println Z) )
(let [Z "...4(.80|.90)->9(.60|.70)        => 2nd SEVEN WEEKS IN THE YEAR => 19TH OF 2ND MONTH -> 7TH OF 4TH MONTH=> 1974(0527|0805) -> 1983(0808|1017)           "](println Z) )
(let [Z "...6(.10)                        => 1ST DAY OF 3RD MONTH =>  1976(0913|1122) "](println Z) )
(let [Z "...9(.10)                        => 1ST DAY OF 4TH MONTH =>  1982(0614|0823) "](println Z) )
(let [Z "...9(.70|.80)->14(.50|.60)       => 3rd SEVEN WEEKS IN THE YEAR => 8TH OF 4th MONTH -> 26TH OF 5TH MONTH=> 1983(1017|1226) -> 19921229|19930309 "](println Z) )
(let [Z "...12(.10)                       => 1ST DAY OF 5TH MONTH =>  1988(0315|0524) "](println Z) )
(let [Z "13.318|15.128->18.39|19.40->20.10=> EXODUS 23:14-16 2ND TIME, 6TH->7TH MONTH => FEAST OF HARVEST, FIRSTFRUIT OF THY LABOURS INCL. THE FEAST OF TABERNACLES => 1990(0923)|1994(0313)->2000(0613)|2002(0521)->2003(0923) "](println Z) )
(let [Z "...14(.60|.70)->19(.40|.50)      => 4th SEVEN WEEKS IN THE YEAR =>27TH OF 5th MONTH -> 15TH OF 7TH MONTH=> 1993(0309|0518) -> 2002(0521|0730) "](println Z) )
(let [Z "...15(.10)                       => 1ST DAY OF 6TH MONTH =>  19931214|19940222 "](println Z) )
(let [Z "...15(.30|40)                    => FEAST OF THE FIRSTFRUITS => 4th day of the 6th month (Leviticus 23:9-14) => 1994(0712|0920) "](println Z) )
(let [Z "FEAST OF HARVEST, FIRSTFRUIT OF THY LABOURS => FEAST OF WEEKS 49 (+ 1) DAYS => reckoned from morrow after the Sabbath unto morrow after the Sabbath "](println Z) )
(let [Z "...15(.30|.40)->15(.90)|16.00    => 1st SEVEN DAYS => 4th to 10th day of 6th month => 1994(0712|0920) -> 1995(0904|1113) "](println Z) )
(let [Z "...15(.60|.70)->15(.90)|16.00    =>                   7th to 10th day of 6th month => 1995(0206|0417) -> 1995(0904|1113) "](println Z) )
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
(let [Z "...29(.30|.40)->29(.90)|30.00    => 43RD SEVEN DAYS IN THE YEAR (0 -> 7DAYS) => 24TH -> 30TH OF THE 10TH MONTH => 2021(0512|0721) -> 2022(0705|0913) "](println Z) )
(let [Z "...29(.30|.40)->34(.10|.20)      => 7th SEVEN WEEKS IN THE YEAR =>24TH OF 10th MONTH -> 12TH OF 12TH MONTH=> 2021(0512|0721) -> 2030(0724|) "](println Z) )
(let [Z "...30(.10)                       => 1ST DAY OF 11TH MONTH =>  2022(0913|1122) "](println Z) )
(let [Z "...30(.10)->30(.60|.70)          => 44TH SEVEN DAYS IN THE YEAR (7 -> 14DYS) => 1ST -> 7TH OF THE 11TH MONTH => 2022(0913|1122) -> 20231107|20240116 "](println Z) )
(let [Z "...30(.70|.80)->31(.30|.40)      => 45TH SEVEN DAYS IN THE YEAR (14 ->21DYS) => 8TH -> 14TH OF THE 11TH MONTH=> 2024(0116|0327) -> 2025(0312|0521) "](println Z) )
(let [Z "...31(.40|.50)->32(.10)          => 46TH SEVEN DAYS IN THE YEAR (21 ->28DYS) => -21.565|-20.865 -> -16.665 GOG_ID.100D => 15TH ->21ST OF THE 11TH MONTH=> 2025(0521|0730) -> 2026(0715|0923) "](println Z) )
(let [Z "...32(.10|.20)->32(.70|.80)      => 47TH SEVEN DAYS IN THE YEAR (28 ->35DYS) => -16.665|-15.965 -> -12.465|-11.765 GOG_ID.100D => 22ND ->28TH OF THE 11TH MONTH =>2026(0923|1201) -> 20271116|20280125 "](println Z) )
(let [Z "...32(.80|.90)->33(.40|.50)      => 48TH SEVEN DAYS IN THE YEAR (35 ->42DYS) => -11.765|-11.065 -> -7.565|-6.865 GOG_ID.100D => 29TH OF 11 MTH->5TH OF 12TH MTH=>2028(0125|0405) -> 2029(0321|0530) "](println Z) )
(let [Z "...33(.10)                       => 1ST DAY OF 12TH MONTH => -10.365|-9.665 GOG_ID.100D => 2028(0614|0823) "](println Z) )
(let [Z "...33(.10) -> 35.90 | 36.00      => LAST MONTH OF THE YEAR (JEW) => -10.365|-9.665 -> 9.935|10.635 GOG_ID.100D => 2028(0614|0823) -> 2034(0105|0315) "](println Z) )
(let [Z "...33(.50|.60)->34(.10|.20)      => 49TH SEVEN DAYS IN THE YEAR (42 -> 49DYS) => -6.865|-6.165 -> -2.665|-1.965 GOG_ID.100D => 6TH ->12TH OF THE 12TH MONTH =>2029(0530|0808) -> 2030(0724|1002) "](println Z) )
(let [Z "...34(.20|.30)                   => 50TH DAY OF SEVENDAY COUNT => -1.965|-1.265 GOG_ID.100D => 13TH DAY OF THE 12TH MONTH => 2030(1002|1211) "](println Z) )
(let [Z "...34(.20|.30)->34(.80|.90)      => 50TH WEEK OF THE SEVENWEEK COUNT => -1.965|-1.265 -> 2.235|2.935 GOG_ID.100D => 13TH -> 19TH DAY OF THE 12TH MONTH   => 2030(1002|1211) -> 20311126|20320203 "](println Z) )
(let [Z "...34(.776|.918)->35.418-->38.518=> EXODUS 23:14-16 3RD TIME, 12TH MONTH => FEAST OF INGATHERING, WHICH IS IN THE END OF THE (LEAP) YEAR => 2.067|3.061 -> 6.561 --> 28.261 GOG_ID.100D => 2031(1109)|2032(0216) -> 2033(0201) --> 2039(0110) "](println Z) )
(let [Z "...36.00 -> 36.5217              => END OF THE YEAR (GENTILE) => 10.635 -> 14.287 GOG_ID.100D => 20340315 -> 20350315 "](println Z) )
(let [Z "...40(.17391304347826)           => 26425.2 TNLDY => 39.85 GOG_ID.100D => REVELATION 19:11-16 "](println Z) )
(let [Z "FEASTS OF THE LORD IN THE GREAT JUBILEE YEAR 1965 TO 2034 AND BEYOND => (+ (* 700 Y) -1696.5217391306596)"](println Z) )
(let [Z "TO OBTAIN Ztp = -1696.5217391306596 TNLDY RECALL => (- (* 6000 (/ 48.3 49.0)) 69) in yG"](println Z) )
(let [Z "Ztp HSotP_RoP_LR&R => -1800 -> 0 TNLDY "](println Z) )





(let [Z "...THE FOLLOWING IS AN INSTANTANEOUS SNAPSHOT OF SELECT MDQNM (ie JOMO) SFOs..."](println Z) )

(defn mdqnm-execution-of-selected-sfos2 [coll] (clojure.string/join \newline coll))




(mdqnm-execution-of-selected-sfos2 [
   
           {:feasts-of-the-lord-in-the-great-jubilee-yea0 *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-enter*}
           {:feasts-of-the-lord-in-the-great-jubilee-yea1 *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond-in-standard-form700d*}
           {:feasts-of-the-lord-in-the-great-jubilee-yea2 *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-leave*}
           {:deliverance-and-redemption-of-the-man-Adam-p *deliverance-and-redemption-of-the-man-Adam-planted-at-ztp-in-the-garden-eastward-in-eden36000d*}
           {:chronicles-of-the-holy-scriptures-having-so0 *comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-enter36000d*}
           {:chronicles-of-the-holy-scriptures-having-so1 *comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-patriarch-view36000d*}
           {:christ-jesus-the-lord-the-everlasting-fathe0 *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d*}
           {:christ-jesus-the-lord-the-everlasting-fathe1 *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d*}
           {:saved000000000000000000000000000000000000000 *saved-by-christ-jesus-100d*}
           {:saved000000000000000000000000000000000000001 *saved-and50yj-lock-to-the-vision-yj*} 
           {:countdown00000000000000000000000000000-from- *countdown-from-the-twenty-fourth-yj-unto-the-vision360d*}
           {:the-creature000000000000000000000000000-lea0 *the-creature-learns-to-be-separate-between-good-and-evil-yj*}
           {:the-creature000000000000000000000000000-lea1 *the-creature-learns-to-be-separate-between-good-and-evil-yg*}
           {:the-new-creature000000000000000000000-in-the *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-beginning-yg*}
           {:the-new-creature000-in-the-end-times-tnc-ite *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-entry-point-yg*}
           {:the-new-creature-in-the-end-times-an-hsotp-e *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-enter-fourth-egg-within-yg*}
           {:the-new-creature0000-in-the-end-times-tnc-i0 *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point1-yg*}
           {:the-new-creature0000-in-the-end-times-tnc-i1 *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point2-yg*}
           {:the-new-creature00000000000000000000-in-the- *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-end-purpose-yg*}                      
           {:a-time-of-trouble00000000-the-tribulation-o0 *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj*}
           {:a-time-of-trouble00000000-the-tribulation-o1 *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj*}
           {:judgment1-pleading000000000000000-against-t0 *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj*}
           {:judgment1-pleading000000000000000-against-t1 *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj*}
           {:judgment2-unto-hamonah0000000000000000000000 *judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj*}
           {:judgment2-unto-hamonah0000000000000000000001 *judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj*}
           {:cfh-flowing-through-heavily-encrypted-machin *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter360d*}
           {:cfh-flowing-through-the-creat-heavily-encryp *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss360d*}
           {:cfh-flowing-through-heavily-encrypted-machin *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet360d*}
           {:cfh-flowing-throug-heavily-encrypted-machine *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave360d*}
           {:a-holy-firstborn1000000000000000000000000000 *a-holy-firstborn-from-the-matrix-reckoning-from-abraham-yg*}
           {:a-holy-firstborn2000000000000000000000000001 *a-holy-firstborn-from-the-matrix-reckoning-from-isaac-yg*}
           {:a-holy-firstborn3000000000000000000000000002 *a-holy-firstborn-from-the-matrix-reckoning-from-jacob-yg*}
           {:days-i00000000000000000000000000000000000000 *days-i*}
           {:cleansing-ca-virgin-mary-tnldy18242-dob00000 *cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23*}
           {:cleansing-ca-jesus-christ-tnldy18286-dob0000 *cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23*}
           {:kristallnacht-to-begincleanseafterarmageddon *kristallnacht-to-begincleanseafterarmageddon-31028one-month-pattern-daysi-28000ddiv23*}
           {:seventh-king-uses-let-out-th-mystery-babylon *seventh-king-uses-the-key-of-thermonuclear-war-to-open-the-bottomless-pit-and-let-out-the-ten-horns-mystery-babylon-a-raiser-of-taxes-the-eighth-king-etc-35d*}
           {:countdown-in-days-to-the-end-at-ztp0-russian *countdown-in-days-to-the-end-at-ztp-of-the-russian-government-of-the-overt-seventh-king-1d*}
           {:napoleon000000000000000000000000000000000000 *napoleon-entering3500d*}
           {:kings000000000000000000000000000000000000000 *kings-leaving3500d*}
           {:thesymbolasread-from-kings-leaving3500d-and- *the-symbolic-synodic-period-of-venus-a-time-of-the-gentiles-as-read-from-kings-leaving3500d-and-containing-the-seventy-weeks-of-daniel350d*}
           {:usa00000000000000000000000000000000000000000 *usa-sit-10yg*}
           {:usa00000000000000000000000000000000000000001 *usa-dem-rev-sit-on-brit-emp-70000ddiv69*}
           {:countdown0000-in-days-to-the-end-at-ztp-of-0 *countdown0-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           {:countdown10000-in-days-to-the-end-at-ztp-of1 *countdown1-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           {:countdown20000-in-days-to-the-end-at-ztp-of2 *countdown2-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           {:countdown3000-in-days-to-the-end-at-ztp-of-3 *countdown3-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           {:of-revhenry-pathway-to-the-new-nation-for-th *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj*}
           {:from-the-exppathway-to-the-new-nation-for-th *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg*}
           {:shulam-she-that-isof-me-the-nsfobbminus13pt3 *shulam-she-that-is-of-me-the-new-nigeria100d-named-because-of-sfobbminus13pt32-and-whose-ztp-is-s2minus28pt80-on-revott*}
           {:dark-nignt-of-the-prophets-soul100d-sfobbzer *dark-nignt-of-the-prophets-soul100d-named-because-of-sfobbzero-and-whose-ztp-is-s2minus21pt07-on-revott*}
           {:sealed-a-slave-forbecause-of-sfobbminus18pt0 *sealed-a-slave-forever-in-the-unlimited-company-the-omega-project100d-because-of-sfobbminus18pt00-and-whose-ztp-is-s2minus18pt00-on-revott*}
           {:born-of-the-flesh0-enter100d-because-of-sfo0 *born-of-the-flesh-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-0pt00-on-revott*}
           {:born-of-the-flesh-leave100d-because-of-sfob1 *born-of-the-flesh-leave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-6pt00-on-revott*}
           {:cfh-rapturing-through-familybecause-of-sfob2 *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-23pt71-on-revott*}
           {:cfh-rapturing-through-famibecause-of-sfobb03 *cfh-rapturing-through-family-friends-acquaintances-etc-ffae100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-24pt897-on-revott*}
           {:cfh-rapturing-through-familbecause-of-sfobb4 *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leaveone100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt20-on-revott*}
           {:cfh-rapturing-through-familbecause-of-sfobb5 *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leavetwo100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt56-on-revott*}
           {:cfh-flowing-through-the-creabecause-of-sfob6 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealenter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-45pt718-on-revott*}
           {:cfh-flowing-through-the-creabecause-of-sfob7 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-trumpet100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-47pt528-on-revott*}
           {:cfh-flowing-through-the-crebecause-of-sfobb8 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealleave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-49pt318-on-revott*}
           {:the-purpose-of-all-things-ibecause-of-sfobb9 *the-purpose-of-all-things-is-at-hand-ie-birth100d-because-of-sfobbzero-and-whose-ztp-is-s2-82pt80-on-revott*}
           {:the-purpose-of-all-things-ibecause-of-sfobba *the-purpose-of-all-things-is-at-hand-ie-circumspection100d-because-of-sfobbzero-and-whose-ztp-is-s2-85pt32-on-revott*}
           {:emancipationsignalin-the-time-lockdown-bound *shulam-she-that-is-of-me-the-new-nation-determined-and-globally-resonant-emancipation-signal-in-the-time-lockdown-boundary-of-enoch-between-is-and-is-to-come100d*}
           {:tss-thefiveterawatelusive-sixty-nine-week-si *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpexit*}
           {:ontwenty-days-after-and-for-a-total-180day-z *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-twenty-days-after-and-for-a-total-180day-ztp-interval-cfhthruhembossztpposteriorexit*}
           {:tss-elusive-sixty-nine-week-singularity-pred *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity-predestination-unto-the-immanence-in-nigeria7d*}
           {:ca-time0000000000000000000000000000000000000 *ca-time-of-the-enoch-type-rapture7d*}
           {:the-shulamanifestation-of-the-mystery-the-im *the-shulammite-singularity-manifestation-of-the-mystery-the-immanence-in-nigeria-count-is-in-reverse7d*}
           {:acc-5tw0000000000000000000000000000000000000 *acc-5tw-tidb-tac-blackwhole-ztp11940-dnps1000d*}
           {:acc-5tw0000000000000000000000000000000000001 *acc-5tw-tidb-tac-blackwhole-ztp12000-dnps1000d*}
           {:acc-5tw0000000000000000000000000000000000002 *acc-5tw-tidb-tac-blackwhole-ztp12060-dnps1000d*}
           {:dark-nignt0000000000000000000000000000000003 *dark-nignt-of-the-prophets-soul100d-ztp12000*}
           {:dark-nignt0000000000000000000000000000000004 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}
           {:dark-nignt0000000000000000000000000000000005 *dark-nignt-of-the-prophets-soul100d-ztp12060*}
           {:oaimee-mungovan-zkpcdp-etc-and-culminates-wi *threeppnoah-ideation-cum-proposal-presentation-implies-arthur-george-consolidated-holdings-agch-sealed-a-slave-forever-in-the-unlimited-company-the-omega-project-aimee-mungovan-zkpcdp-etc-and-culminates-with-tie-in-to-background-onset-of-gogid100d*}
           {:within-few-days00000000000-raiser-of-taxes-i *within-few-days-m1640-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}
           {:in-his-estate-tha-vile-person-to-whomthey-sh *in-his-estate-there-shall-rise-a-vile-person-to-whom-they-shall-not-give-the-honour-of-the-kingdom100d*}
           {:what-is-t-question-is-answered-by-the-god-pa *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d*}
           {:what0-question-is-answered-by-the-god-partic *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d*}
           {:what-is-t-question-is-answered-by-the-god-pa *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d*}
           {:what0-question-is-answered-by-the-god-partic *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d*}
           {:three0-kings-covenantprinceinc-requirement-t *having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d*}
           {:yea00000000000000000000000000000000000000000 *yea-and-the-prince-of-the-covenant-also100d*}
           {:and000000000000000000000-after-the-league-ma *and-after-the-league-made-with-him-he-shall-work-deceitfully100d*}
           {:for00000000000000000000000000000000000000000 *for-he-shall-come-up100d*}
           {:and00000000000000000000000000000000000000000 *and-become-strong-with-a-small-people100d*}           
           {:born0000000000000-of-the-flesh-is-the-revela *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}
           {:and00000000-shall-forecast-his-devices-again *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d*}
           {:and000000-shall-forecast-his-devices-against *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d*}
           {:and00000000000000000000000000000000000000000 *and-his-army-shall-overflow100d*}
           {:and00000000000000000000000000000000000000000 *and-many-shall-fall-down-slain100d*}
           {:and000000000-his-heart-shall-be-against-the- *and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d*}
           {:the000000000000000000000000000000000000000-s *the-ships-of-chittim-shall-come-against-him100d*}
           {:and00000000000000000000000000000000000000000 *and-arms-shall-stand-on-his-part100d*}
           {:he000000000000000000000000-shall-confirm-the *he-shall-confirm-the-covenant-with-many-for-one-week-start100d*}
           {:and0000000000000000000000000000000000-they-s *and-they-shall-pollute-the-sanctuary-of-strength100d*}
           {:and00000000000000000000000000000000000000000 *and-shall-take-away-the-daily-sacrifice100d*}
           {:and00000000000000000000000000-they-shall-pla *and-they-shall-place-the-abomination-that-makes-desolate100d*}
           {:seventh-seal-half-hour-of-silence0-as144000- *seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d*}
           {:first000000000000000000000000-trumpet-hail-f *first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d*}
           {:one00000000000000-of-the-seals-a-white-horse *one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d*}
           {:manchild-born-sun-and-moon-clothed-woman-fle *manchild-born-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d*}
           {:second000000000000-trumpet-a-great-mountain- *second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d*}
           {:second00000000000-seal-a-red-horse-a-rider-a *second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d*}
           {:third-trumpet-a-great-star-called-wormwood-f *third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d*}
           {:heading-which-she-sits-on-ie-controls-a-leth *mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d*}
           {:gog00000000-ascending-to-power-on-the-dragon *gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d*}
           {:thirdseal-a-black-horse-and-rider-a-pair0-of *third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d*}
           {:babylon-is-fallen-is-fallen-start-of-2300day *babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d*}
           {:he00000000000000000000000-shall-confirm-the- *he-shall-confirm-the-covenant-with-many-for-one-week-midst100d*}
           {:the00000000000000000000000000000000000000000 *the-court-that-is-without-begin100d*}
           {:one00000000000000000000000000000000000000000 *one-of-gogs-heads-is-wounded-unto-death100d*}
           {:after-gogs-deadly-wound-is-heald-empowered0- *after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d*}
           {:fourth00000000000000000-trumpet-a-third-part *fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d*}
           {:the00000000-ten-horns-completely-burn-the-fl *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d*}
           {:the0000000-ten-horns-completely-burn-the-fle *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d*}
           {:the-ten-burn-the-flesh-of-mystery-babylon-wi *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d*}
           {:fourth000000000000000-seal-a-pale-horse-and- *fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d*}
           {:the00000000000000000000000000000000-two-prop *the-two-prophets-the-lampstands-commence-testimony100d*}
           {:fifth0-trumpet-a-star-falls-from-heaven-to-e *fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d*}
           {:abaddon0000000000000000000000000000000000000 *abaddon-apollyon100d*}
           {:end000000000-of-five-months-of-abaddon-apoll *end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d*}
           {:fifth00000000000-seal-under-the-altar-the-so *fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d*}
           {:but0000000000000000-tidings-out-of-the-east- *but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d*}
           {:he-shall-plant-the-tabernacles-betweenthe-se *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d*}
           {:he-shall-plant-the-tabernaclebetween-the-sea *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d*}
           {:sixth-trumpet000000-the-four-angels-bound-in *sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d*}
           {:sixth000000000000000000000000000000000000000 *sixth-seal-zero-100d*}
           {:sixth-seal-the-vision-the-great-day-of-his-w *sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d*}
           {:another-mighty-angel-clothed-with-a-cloud-an *another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d*}
           {:the00000000000000000000000000000000000000000 *the-lamb-overcoming-the-ten-horns100d*}
           {:the00000000000000000000000000-two-prophets-t *the-two-prophets-the-lampstands-war-with-the-beast-start100d*}
           {:the0000000000000000000000000-two-prophets-th *the-two-prophets-the-lampstands-war-with-the-beast-finish100d*}
           {:the0000000000000000000000000000-two-prophets *the-two-prophets-the-lampstands-war-with-the-beast-end100d*}
           {:seventh-trumpet-begins-to-sound-first-vial-a *seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d*}
           {:second00000000000000000000-vial-the-sea-beco *second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d*}
           {:he00000000000000000000000-shall-confirm-the- *he-shall-confirm-the-covenant-with-many-for-one-week-finish100d*}
           {:third000000000000000000000000-vial-the-river *third-vial-the-rivers-and-fountains-of-waters-become-blood100d*}
           {:fourth0000000000000000000000000000000-vial-u *fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d*}
           {:fifth00000000000000000000000-vial-on-seat-of *fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d*}
           {:sixth000000000-vial-great-river-euphrates-dr *sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d*}
           {:seventh-vial-into-the-air-a-great-voice-it-i *seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d*}
           {:the00000000000000000000000000000000000000000 *the-end-of-the-vial-judgments100d*}
           {:in0000-remembrance-great-babylon0-is-given-c *in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d*}
           {:the00000000000000000000000000000000000000000 *the-end-of-the-seal-judgments*}
           {:end0000000000-of-day479-of-making0-wedding-a *end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d*}
           {:end-of-day483-marriage-supper0-the-righteous *end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d*}
           {:end-of-day490-marriage-supper000000000000000 *end-of-day490-marriage-supper-of-the-lamb-end100d*}
           {:the-light0000000000000000-of-the-sun-is-seve *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d*}
           {:the-light000000000000000-of-the-sun-is-seven *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d*}
           {:end-of-the-trumpet-judgments-then0-shall-the *end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d*}
           {:seven0000000000000000000000-year-cleansing-o *seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d*}
           {:general00-shulammite-singularity-culminating *general-and-state-examination-of-common-phenomena-effluent-from-the-shulammite-singularity-culminating-in-the-gogid100d-feast-of-tabernacles100d*}
           {:dnps00000000000000000000000000-the-seven-and *dnps-the-seven-and-thirteen-year-conversion12000ztp7500ddiv7*}
           {:dnps00000000000000000000000000-the-seven-and *dnps-the-seven-and-thirteen-year-conversion12060ztp7500ddiv7*}
           {:cfh-flowing-himself-heavily-encrypted-machi0 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter100d*}
           {:cfh-flowing0-himself-heavily-encrypted-mach1 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting0-100d*}
           {:cfh-flowing-himself-heavily-encrypted-machi2 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting1-100d*}
           {:cfh-flowing00-himself-heavily-encrypted-mac3 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet100d*}
           {:cfh-flowing-himself-heavily-encrypted-machi4 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave100d*}
           {:judgment100000000000000000000000000000000005 *judgment1-shall-begin-at-the-house-of-god-100d*}
           {:judgment200000000000000000000000000000000006 *judgment2-shall-begin-at-the-house-of-god-100d*}
           {:the00000000000000000000000000000000000000007 *the-work-of-god-is-tried-with-fire100d*}
           {:the00000000000000000000-destroyer-of-the-gen *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter*}
           {:the00000000000000000000000000-destroyer-of-t *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d*}
           {:the00000000000000000000-destroyer-of-the-gen *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave*}
           {:the00000000000000000000000000000000000000000 *the-robin-hood-protocol-ahz-ahi-100d*}
           {:judgment-turns-in-favour-of-the-broken-stone *judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5587*}
           {:threeppn-end00-of-seven-year-cleansing-of-al *threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d*}
           {:threeppnoah000000000000000000000000000000000 *threeppnoah-idea-adoption-and-implementation-two100d*}
           {:threeppnoah000000000000000000000000000000001 *threeppnoah-idea-adoption-and-implementation-three100d*}
           {:revelatiotrial-revott-at-the-end00-ie-purpos *revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d*}
           {:again-born-ie-born-of000-spirit-is-the-end-i *again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d*}
           {:the00000000000000000000000000000000000000000 *the-power-of-the-manchild-100d*}
           {:revelationof-the-trial-expanded-revotte-ie-p *revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d*}
           {:ten00000000000000000000000000000000000000000 *ten-days-tribulation2800ddiv23*}
           {:ten0000000000000000000-days-tribulation-unto *ten-days-tribulation-unto-armageddon-ca-gathering-starts-2800ddiv23*}
           {:ten000000000000000000000000000000-days-tribu *ten-days-tribulation-unto-armageddon-finished-2800ddiv23*}
           {:the-shulammite-sdq-globaldedicated-to-juliet *the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7*}
           {:project-hybridization-developmentparametric- *project-hybridization-development-parametric-nkechichiomaosoka40yj-taop1-internals1000ddiv7*}
           {:project-hybridization-developmentparametric- *project-hybridization-development-parametric-nkechichiomaosoka40yj-taop2-internals1000ddiv7*}
           {:core-completion-matrix1-wherein-whilst-iron- *core-completion-matrix1-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d*}
           {:core-completion-matrix2-wherein-twhilst-iron *core-completion-matrix2-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d*}
           {:the0-minus-half-six-and-then-seventh-day-dep *the-acc-abstract-of-projects-and-the-trial-ztp11640-a-minus-half-six-and-then-seventh-day-depiction-minus360d-not-in-standard-form2400d*}
           {:the-acc-abstraminus-half-six-and-then-sevent *the-acc-abstract-of-projects-and-the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-not-in-standard-form2400d*}
           {:the-aminus-half-six-and-then-seventh-day0-de *the-acc-abstract-of-projects-and-the-trial-ztp12360-a-minus-half-six-and-then-seventh-day-depiction-plus360d-not-in-standard-form2400d*}
           {:dark0000000000000000000000000000000000000000 *dark-nignt-of-the-prophets-soul100d-ztp12000*}
           {:dark0000000000000000000000000000000000000001 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}
           {:dark0000000000000000000000000000000000000002 *dark-nignt-of-the-prophets-soul100d-ztp12060*}
           {:ephesians221-building00000000000000000000000 *ephesians221-building-yg*}
           {:project-hybridization-development00000000000 *project-hybridization-development-parametric28yg-jennifer700ddiv6pt9*}
           {:roundabout-aimee-magnified000000000000000000 *roundabout-aimee-magnified-proper2731ddiv18*}
           {:babylon-the-great-emergence000000000000-and- *babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w*}
           {:z-absolute-centralization-unto-utter-decent0 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3*}
           {:zabsolute-centralization-unto-utter0-decent1 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3*}
           {:zero000000-trade-salvation-from-ca-under-the *zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg*}
           {:zero0000000000000-trade-salvation-from-ca-to *zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg*}
           {:observe000000000000000000000000000000000-i-a *observe-i-am-getting-married-to-the-new-nigeria25ddiv9*}
           {:threeppnoah000000000000000000000000000000000 *threeppnoah-global-turnaround-fullydeveloped250ddiv9*}
           {:part1-embryo-genesis-seedling-plant0-photosy *part1-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-before-25032pt8tnldy-360d*}
           {:part2-embryo-genesis-seedling-plant-photosyn *part2-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-after-25032pt8tnldy-240d*}
           {:birth000000000000000000000000000000000000000 *birth-of-the-fig-tree-minusoneeightzerozero-yj*}
           {:birth000000000000000000000000000000000000001 *birth-of-the-fig-tree-ztp-minus904tnldy-egypt-begins-amassing-troops-on-israels-borders-yj*}
           {:birth000000000000000000000000000000000000002 *birth-of-the-fig-tree-zero-yj*}
           {:the-redemption-of-a-people-scatteredand-peel *the-redemption-of-a-people-scattered-and-peeled-terrible-from-their-beginning-hitherto-101dys31div69*}
           {:the00000000000000-light-shines-in-the-darkne *the-light-shines-in-the-darkness-but-the-darkness-comprehends-it-not10yg*}
           {:the-mystery-of-iniquity-they-shallmingle-the *the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-earliest-dnps-overlap-infiltration-100d*}
           {:the-mystery0-of-iniquity-they-shall-mingle-t *the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-latest-100d*}
           {:the00000000000000000000000000000000000000000 *the-first-jeroboam-yg*}
           {:the00000000000000000000000000000000000000001 *the-second-jeroboam-yg*}
           {:a-simple-count-of-years-of-the-creature-born *a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg*}
           {:cfh-flowing-through-the-creature0-which-godw *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter-yg*}
           {:cfh-flowing-through-the-creaturheavily-encrx *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-yg*}
           {:cfh-flowing-through-theheavily-encrypted-may *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet-yg*}
           {:cfh-flowing-through-heavily-encrypted-machiz *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave-yg*}
           {:ephesians613-fulfillmenshula-manifests-even0 *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-cultivation100d*}
           {:ephesians613-fulfillment-wishula-manifests-1 *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-harvest100d*}
           {:ephesians613-fulfillment-withshula-manifest2 *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-end-harvest100d*}
           {:recuperation-and-shulamite-vindication-again *recuperation-and-shulamite-vindication-against-the-backdrop-of-the-gestation-of-the-dystopia-of-the-seventh-king-and-wwiii100ddiv7*}
           {:begin-inordinate-first-love-deliverentry-to0 *begin-inordinate-first-love-deliverance-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-hsotp-entry-to-the-eleven-curtains-of-the-temple1000ddiv7*}
           {:end-inordinate-first-love-deliveentry-to-th1 *end-inordinate-first-love-deliverance-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-hsotp-entry-to-the-eleven-curtains-of-the-temple1000ddiv6pt9*}
           {:begin-traditional-marrentry-to-the-eleven-c2 *begin-traditional-marriage-sdq-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-entry-to-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:end-traditional-mentry-to-the-eleven-curtai3 *end-traditional-marriage-sdq-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-entry-to-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:begin-ca-cend-of-the-fifth-of-the-eleven-cu4 *begin-ca-cross-trained-engineer-she-that-is-of-me-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-sunclothed-woman-sixth-curtain-doubled-up-at-the-end-of-the-fifth-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:end-ca-cend-of-the-fifth-of-the-eleven-curt5 *end-ca-cross-trained-engineer-she-that-is-of-me-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-sunclothed-woman-sixth-curtain-doubled-up-at-the-end-of-the-fifth-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:beginning00-of-the-seventh-of-the-eleven-cu6 *begin-ca-nonye-igboanusi-nwokedi-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-heloise-d-argenteuil-du-paraclet-sixth-curtain-doubled-up-at-the-beginning-of-the-seventh-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:beginningof-the-seventh-of-the-eleven-curta7 *end-ca-nonye-igboanusi-nwokedi-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-heloise-d-argenteuil-du-paraclet-sixth-curtain-doubled-up-at-the-beginning-of-the-seventh-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:forefront-of-the-eleventh-curtain-of-the-el8 *begin-ca-dnps-similitude-save-ueo-at-all-cost-from-the-ten-horns-etc-armageddon-death-march-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-at-forefront-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:forefront-of-the-eleventh-curtain-eleven-cu9 *end-ca-dnps-similitude-save-ueo-at-all-cost-from-the-ten-horns-etc-armageddon-death-march-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-at-forefront-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:midst-of-the-eleventh-curtain-of-eleven-cura *begin-it-is-done-acc-document-reception-part1-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-in-the-midst-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:midst-of-the-eleventh-curtain-of-the-elevenb *end-it-is-done-acc-document-reception-part1-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-in-the-midst-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:midst-of-the-eleventh-curtain-of-the-elevenc *begin-it-is-done-acc-document-reception-part2-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-in-the-midst-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*} 
           {:midst-of-the-eleventh-curtain-of-the-elevend *end-it-is-done-acc-document-reception-part2-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-in-the-midst-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:uttermost-end-of-the-eleventh-curtain-of-the *begin-ca-dnps-cleansing-fulfillment-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-at-uttermost-end-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:uttermost-end-of-the-eleventh-curtain-of-thf *end-ca-dnps-cleansing-fulfillment-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-at-uttermost-end-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:unn00000000000000000000000000000000000000000 *unn-job-offered-100d*}
           {:unn00000000000000000000000000000000000000001 *unn-job-accepted-100d*}
           {:unn00000000000000000000000000000000000000002 *unn-job-offered-yj*}
           {:unn00000000000000000000000000000000000000003 *unn-job-accepted-yj*}
           {:unn00000000000000000000000000000000000000004 *unn-job-offered-yg*}
           {:unn00000000000000000000000000000000000000005 *unn-job-accepted-yg*}
           {:ca000000000000000000000000000000000000000006 *ca-time-of-the-enoch-type-rapture7d*}
           {:a0000000000000000000000000000000000000000000 *a-rapture-occurs-circa-here100d*}
           {:dnps-begin-cleanse1-40yj-view-ztp12052-what0 *dnps-begin-cleanse1-40yj-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj*}
           {:dnps-begin-cleanse2-40yj-view-ztp12060-what1 *dnps-begin-cleanse2-40yj-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj*}
           {:dnps-end-cleanse1-40yg-view-ztp12052-what002 *dnps-end-cleanse1-40yg-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg*}
           {:dnps-end-cleanse2-40yg-view-ztp12060-what-o3 *dnps-end-cleanse2-40yg-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg*}
           {:tnl00000000000000000000000000000000000000000 *tnl-1000d*}
           {:tnl00000000000000000000000000000000000000001 *tnl-yj*}
           {:tnl00000000000000000000000000000000000000002 *tnl-yg*}
           {:z0000000000000000000000000000000000000000003 @z-tnldy-clock3}
           {:grace-and-truth-of-jesus-christ-unto-the-sev *imputation-of-sin-via-the-law-given-by-moses-against-the-transgression-of-those-angels-followed-by-the-grace-and-truth-of-jesus-christ-unto-the-seventh-angel-trumpet-sound-daysi-synchronization-100yg*}
           {:days000000000000000000000000000000000000000i *days-i*}
           {:cognitive00000000000000000-radio-frequency-t *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}
           (l/local-now)           
           
                     

] )


(println (mdqnm-execution-of-selected-sfos2 [
   
           {:feasts-of-the-lord-in-the-great-jubilee-yea0 *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-enter*}
           {:feasts-of-the-lord-in-the-great-jubilee-yea1 *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond-in-standard-form700d*}
           {:feasts-of-the-lord-in-the-great-jubilee-yea2 *feasts-of-the-lord-in-the-great-jubilee-year1965to2034andbeyond700d-hsotp-leave*}
           {:deliverance-and-redemption-of-the-man-Adam-p *deliverance-and-redemption-of-the-man-Adam-planted-at-ztp-in-the-garden-eastward-in-eden36000d*}
           {:chronicles-of-the-holy-scriptures-having-so0 *comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-enter36000d*}
           {:chronicles-of-the-holy-scriptures-having-so1 *comprehensive-chronicles-of-the-holy-scriptures-having-solomons-temple-complete-at19pt51-patriarch-view36000d*}
           {:christ-jesus-the-lord-the-everlasting-fathe0 *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d*}
           {:christ-jesus-the-lord-the-everlasting-fathe1 *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d*}
           {:saved000000000000000000000000000000000000000 *saved-by-christ-jesus-100d*}
           {:saved000000000000000000000000000000000000001 *saved-and50yj-lock-to-the-vision-yj*} 
           {:countdown00000000000000000000000000000-from- *countdown-from-the-twenty-fourth-yj-unto-the-vision360d*}
           {:the-creature000000000000000000000000000-lea0 *the-creature-learns-to-be-separate-between-good-and-evil-yj*}
           {:the-creature000000000000000000000000000-lea1 *the-creature-learns-to-be-separate-between-good-and-evil-yg*}
           {:the-new-creature000000000000000000000-in-the *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-beginning-yg*}
           {:the-new-creature000-in-the-end-times-tnc-ite *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-entry-point-yg*}
           {:the-new-creature-in-the-end-times-an-hsotp-e *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-enter-fourth-egg-within-yg*}
           {:the-new-creature0000-in-the-end-times-tnc-i0 *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point1-yg*}
           {:the-new-creature0000-in-the-end-times-tnc-i1 *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-executable-core-exit-point2-yg*}
           {:the-new-creature00000000000000000000-in-the- *the-new-creature-in-the-end-times-tnc-itet-an-hsotp-end-purpose-yg*}                      
           {:a-time-of-trouble00000000-the-tribulation-o0 *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj*}
           {:a-time-of-trouble00000000-the-tribulation-o1 *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj*}
           {:judgment1-pleading000000000000000-against-t0 *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj*}
           {:judgment1-pleading000000000000000-against-t1 *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj*}
           {:judgment2-unto-hamonah0000000000000000000000 *judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj*}
           {:judgment2-unto-hamonah0000000000000000000001 *judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj*}
           {:cfh-flowing-through-heavily-encrypted-machin *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter360d*}
           {:cfh-flowing-through-the-creat-heavily-encryp *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss360d*}
           {:cfh-flowing-through-heavily-encrypted-machin *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet360d*}
           {:cfh-flowing-throug-heavily-encrypted-machine *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave360d*}
           {:a-holy-firstborn1000000000000000000000000000 *a-holy-firstborn-from-the-matrix-reckoning-from-abraham-yg*}
           {:a-holy-firstborn2000000000000000000000000001 *a-holy-firstborn-from-the-matrix-reckoning-from-isaac-yg*}
           {:a-holy-firstborn3000000000000000000000000002 *a-holy-firstborn-from-the-matrix-reckoning-from-jacob-yg*}
           {:days-i00000000000000000000000000000000000000 *days-i*}
           {:cleansing-ca-virgin-mary-tnldy18242-dob00000 *cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23*}
           {:cleansing-ca-jesus-christ-tnldy18286-dob0000 *cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23*}
           {:kristallnacht-to-begincleanseafterarmageddon *kristallnacht-to-begincleanseafterarmageddon-31028one-month-pattern-daysi-28000ddiv23*}
           {:seventh-king-uses-let-out-th-mystery-babylon *seventh-king-uses-the-key-of-thermonuclear-war-to-open-the-bottomless-pit-and-let-out-the-ten-horns-mystery-babylon-a-raiser-of-taxes-the-eighth-king-etc-35d*}
           {:countdown-in-days-to-the-end-at-ztp0-russian *countdown-in-days-to-the-end-at-ztp-of-the-russian-government-of-the-overt-seventh-king-1d*}
           {:napoleon000000000000000000000000000000000000 *napoleon-entering3500d*}
           {:kings000000000000000000000000000000000000000 *kings-leaving3500d*}
           {:thesymbolasread-from-kings-leaving3500d-and- *the-symbolic-synodic-period-of-venus-a-time-of-the-gentiles-as-read-from-kings-leaving3500d-and-containing-the-seventy-weeks-of-daniel350d*}
           {:usa00000000000000000000000000000000000000000 *usa-sit-10yg*}
           {:usa00000000000000000000000000000000000000001 *usa-dem-rev-sit-on-brit-emp-70000ddiv69*}
           {:countdown0000-in-days-to-the-end-at-ztp-of-0 *countdown0-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           {:countdown10000-in-days-to-the-end-at-ztp-of1 *countdown1-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           {:countdown20000-in-days-to-the-end-at-ztp-of2 *countdown2-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           {:countdown3000-in-days-to-the-end-at-ztp-of-3 *countdown3-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           {:of-revhenry-pathway-to-the-new-nation-for-th *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj*}
           {:from-the-exppathway-to-the-new-nation-for-th *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg*}
           {:shulam-she-that-isof-me-the-nsfobbminus13pt3 *shulam-she-that-is-of-me-the-new-nigeria100d-named-because-of-sfobbminus13pt32-and-whose-ztp-is-s2minus28pt80-on-revott*}
           {:dark-nignt-of-the-prophets-soul100d-sfobbzer *dark-nignt-of-the-prophets-soul100d-named-because-of-sfobbzero-and-whose-ztp-is-s2minus21pt07-on-revott*}
           {:sealed-a-slave-forbecause-of-sfobbminus18pt0 *sealed-a-slave-forever-in-the-unlimited-company-the-omega-project100d-because-of-sfobbminus18pt00-and-whose-ztp-is-s2minus18pt00-on-revott*}
           {:born-of-the-flesh0-enter100d-because-of-sfo0 *born-of-the-flesh-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-0pt00-on-revott*}
           {:born-of-the-flesh-leave100d-because-of-sfob1 *born-of-the-flesh-leave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-6pt00-on-revott*}
           {:cfh-rapturing-through-familybecause-of-sfob2 *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-23pt71-on-revott*}
           {:cfh-rapturing-through-famibecause-of-sfobb03 *cfh-rapturing-through-family-friends-acquaintances-etc-ffae100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-24pt897-on-revott*}
           {:cfh-rapturing-through-familbecause-of-sfobb4 *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leaveone100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt20-on-revott*}
           {:cfh-rapturing-through-familbecause-of-sfobb5 *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leavetwo100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt56-on-revott*}
           {:cfh-flowing-through-the-creabecause-of-sfob6 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealenter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-45pt718-on-revott*}
           {:cfh-flowing-through-the-creabecause-of-sfob7 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-trumpet100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-47pt528-on-revott*}
           {:cfh-flowing-through-the-crebecause-of-sfobb8 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealleave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-49pt318-on-revott*}
           {:the-purpose-of-all-things-ibecause-of-sfobb9 *the-purpose-of-all-things-is-at-hand-ie-birth100d-because-of-sfobbzero-and-whose-ztp-is-s2-82pt80-on-revott*}
           {:the-purpose-of-all-things-ibecause-of-sfobba *the-purpose-of-all-things-is-at-hand-ie-circumspection100d-because-of-sfobbzero-and-whose-ztp-is-s2-85pt32-on-revott*}
           {:emancipationsignalin-the-time-lockdown-bound *shulam-she-that-is-of-me-the-new-nation-determined-and-globally-resonant-emancipation-signal-in-the-time-lockdown-boundary-of-enoch-between-is-and-is-to-come100d*}
           {:tss-thefiveterawatelusive-sixty-nine-week-si *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpexit*}
           {:ontwenty-days-after-and-for-a-total-180day-z *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-twenty-days-after-and-for-a-total-180day-ztp-interval-cfhthruhembossztpposteriorexit*}
           {:tss-elusive-sixty-nine-week-singularity-pred *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity-predestination-unto-the-immanence-in-nigeria7d*}
           {:ca-time0000000000000000000000000000000000000 *ca-time-of-the-enoch-type-rapture7d*}
           {:the-shulamanifestation-of-the-mystery-the-im *the-shulammite-singularity-manifestation-of-the-mystery-the-immanence-in-nigeria-count-is-in-reverse7d*}
           {:acc-5tw0000000000000000000000000000000000000 *acc-5tw-tidb-tac-blackwhole-ztp11940-dnps1000d*}
           {:acc-5tw0000000000000000000000000000000000001 *acc-5tw-tidb-tac-blackwhole-ztp12000-dnps1000d*}
           {:acc-5tw0000000000000000000000000000000000002 *acc-5tw-tidb-tac-blackwhole-ztp12060-dnps1000d*}
           {:dark-nignt0000000000000000000000000000000003 *dark-nignt-of-the-prophets-soul100d-ztp12000*}
           {:dark-nignt0000000000000000000000000000000004 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}
           {:dark-nignt0000000000000000000000000000000005 *dark-nignt-of-the-prophets-soul100d-ztp12060*}
           {:oaimee-mungovan-zkpcdp-etc-and-culminates-wi *threeppnoah-ideation-cum-proposal-presentation-implies-arthur-george-consolidated-holdings-agch-sealed-a-slave-forever-in-the-unlimited-company-the-omega-project-aimee-mungovan-zkpcdp-etc-and-culminates-with-tie-in-to-background-onset-of-gogid100d*}
           {:within-few-days00000000000-raiser-of-taxes-i *within-few-days-m1640-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}
           {:in-his-estate-tha-vile-person-to-whomthey-sh *in-his-estate-there-shall-rise-a-vile-person-to-whom-they-shall-not-give-the-honour-of-the-kingdom100d*}
           {:what-is-t-question-is-answered-by-the-god-pa *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d*}
           {:what0-question-is-answered-by-the-god-partic *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d*}
           {:what-is-t-question-is-answered-by-the-god-pa *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d*}
           {:what0-question-is-answered-by-the-god-partic *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d*}
           {:three0-kings-covenantprinceinc-requirement-t *having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d*}
           {:yea00000000000000000000000000000000000000000 *yea-and-the-prince-of-the-covenant-also100d*}
           {:and000000000000000000000-after-the-league-ma *and-after-the-league-made-with-him-he-shall-work-deceitfully100d*}
           {:for00000000000000000000000000000000000000000 *for-he-shall-come-up100d*}
           {:and00000000000000000000000000000000000000000 *and-become-strong-with-a-small-people100d*}           
           {:born0000000000000-of-the-flesh-is-the-revela *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}
           {:and00000000-shall-forecast-his-devices-again *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d*}
           {:and000000-shall-forecast-his-devices-against *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d*}
           {:and00000000000000000000000000000000000000000 *and-his-army-shall-overflow100d*}
           {:and00000000000000000000000000000000000000000 *and-many-shall-fall-down-slain100d*}
           {:and000000000-his-heart-shall-be-against-the- *and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d*}
           {:the000000000000000000000000000000000000000-s *the-ships-of-chittim-shall-come-against-him100d*}
           {:and00000000000000000000000000000000000000000 *and-arms-shall-stand-on-his-part100d*}
           {:he000000000000000000000000-shall-confirm-the *he-shall-confirm-the-covenant-with-many-for-one-week-start100d*}
           {:and0000000000000000000000000000000000-they-s *and-they-shall-pollute-the-sanctuary-of-strength100d*}
           {:and00000000000000000000000000000000000000000 *and-shall-take-away-the-daily-sacrifice100d*}
           {:and00000000000000000000000000-they-shall-pla *and-they-shall-place-the-abomination-that-makes-desolate100d*}
           {:seventh-seal-half-hour-of-silence0-as144000- *seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d*}
           {:first000000000000000000000000-trumpet-hail-f *first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d*}
           {:one00000000000000-of-the-seals-a-white-horse *one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d*}
           {:manchild-born-sun-and-moon-clothed-woman-fle *manchild-born-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d*}
           {:second000000000000-trumpet-a-great-mountain- *second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d*}
           {:second00000000000-seal-a-red-horse-a-rider-a *second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d*}
           {:third-trumpet-a-great-star-called-wormwood-f *third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d*}
           {:heading-which-she-sits-on-ie-controls-a-leth *mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d*}
           {:gog00000000-ascending-to-power-on-the-dragon *gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d*}
           {:thirdseal-a-black-horse-and-rider-a-pair0-of *third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d*}
           {:babylon-is-fallen-is-fallen-start-of-2300day *babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d*}
           {:he00000000000000000000000-shall-confirm-the- *he-shall-confirm-the-covenant-with-many-for-one-week-midst100d*}
           {:the00000000000000000000000000000000000000000 *the-court-that-is-without-begin100d*}
           {:one00000000000000000000000000000000000000000 *one-of-gogs-heads-is-wounded-unto-death100d*}
           {:after-gogs-deadly-wound-is-heald-empowered0- *after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d*}
           {:fourth00000000000000000-trumpet-a-third-part *fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d*}
           {:the00000000-ten-horns-completely-burn-the-fl *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d*}
           {:the0000000-ten-horns-completely-burn-the-fle *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d*}
           {:the-ten-burn-the-flesh-of-mystery-babylon-wi *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d*}
           {:fourth000000000000000-seal-a-pale-horse-and- *fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d*}
           {:the00000000000000000000000000000000-two-prop *the-two-prophets-the-lampstands-commence-testimony100d*}
           {:fifth0-trumpet-a-star-falls-from-heaven-to-e *fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d*}
           {:abaddon0000000000000000000000000000000000000 *abaddon-apollyon100d*}
           {:end000000000-of-five-months-of-abaddon-apoll *end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d*}
           {:fifth00000000000-seal-under-the-altar-the-so *fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d*}
           {:but0000000000000000-tidings-out-of-the-east- *but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d*}
           {:he-shall-plant-the-tabernacles-betweenthe-se *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d*}
           {:he-shall-plant-the-tabernaclebetween-the-sea *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d*}
           {:sixth-trumpet000000-the-four-angels-bound-in *sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d*}
           {:sixth000000000000000000000000000000000000000 *sixth-seal-zero-100d*}
           {:sixth-seal-the-vision-the-great-day-of-his-w *sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d*}
           {:another-mighty-angel-clothed-with-a-cloud-an *another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d*}
           {:the00000000000000000000000000000000000000000 *the-lamb-overcoming-the-ten-horns100d*}
           {:the00000000000000000000000000-two-prophets-t *the-two-prophets-the-lampstands-war-with-the-beast-start100d*}
           {:the0000000000000000000000000-two-prophets-th *the-two-prophets-the-lampstands-war-with-the-beast-finish100d*}
           {:the0000000000000000000000000000-two-prophets *the-two-prophets-the-lampstands-war-with-the-beast-end100d*}
           {:seventh-trumpet-begins-to-sound-first-vial-a *seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d*}
           {:second00000000000000000000-vial-the-sea-beco *second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d*}
           {:he00000000000000000000000-shall-confirm-the- *he-shall-confirm-the-covenant-with-many-for-one-week-finish100d*}
           {:third000000000000000000000000-vial-the-river *third-vial-the-rivers-and-fountains-of-waters-become-blood100d*}
           {:fourth0000000000000000000000000000000-vial-u *fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d*}
           {:fifth00000000000000000000000-vial-on-seat-of *fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d*}
           {:sixth000000000-vial-great-river-euphrates-dr *sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d*}
           {:seventh-vial-into-the-air-a-great-voice-it-i *seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d*}
           {:the00000000000000000000000000000000000000000 *the-end-of-the-vial-judgments100d*}
           {:in0000-remembrance-great-babylon0-is-given-c *in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d*}
           {:the00000000000000000000000000000000000000000 *the-end-of-the-seal-judgments*}
           {:end0000000000-of-day479-of-making0-wedding-a *end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d*}
           {:end-of-day483-marriage-supper0-the-righteous *end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d*}
           {:end-of-day490-marriage-supper000000000000000 *end-of-day490-marriage-supper-of-the-lamb-end100d*}
           {:the-light0000000000000000-of-the-sun-is-seve *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d*}
           {:the-light000000000000000-of-the-sun-is-seven *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d*}
           {:end-of-the-trumpet-judgments-then0-shall-the *end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d*}
           {:seven0000000000000000000000-year-cleansing-o *seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d*}
           {:general00-shulammite-singularity-culminating *general-and-state-examination-of-common-phenomena-effluent-from-the-shulammite-singularity-culminating-in-the-gogid100d-feast-of-tabernacles100d*}
           {:dnps00000000000000000000000000-the-seven-and *dnps-the-seven-and-thirteen-year-conversion12000ztp7500ddiv7*}
           {:dnps00000000000000000000000000-the-seven-and *dnps-the-seven-and-thirteen-year-conversion12060ztp7500ddiv7*}
           {:cfh-flowing-himself-heavily-encrypted-machi0 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter100d*}
           {:cfh-flowing0-himself-heavily-encrypted-mach1 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting0-100d*}
           {:cfh-flowing-himself-heavily-encrypted-machi2 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting1-100d*}
           {:cfh-flowing00-himself-heavily-encrypted-mac3 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet100d*}
           {:cfh-flowing-himself-heavily-encrypted-machi4 *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave100d*}
           {:judgment100000000000000000000000000000000005 *judgment1-shall-begin-at-the-house-of-god-100d*}
           {:judgment200000000000000000000000000000000006 *judgment2-shall-begin-at-the-house-of-god-100d*}
           {:the00000000000000000000000000000000000000007 *the-work-of-god-is-tried-with-fire100d*}
           {:the00000000000000000000-destroyer-of-the-gen *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter*}
           {:the00000000000000000000000000-destroyer-of-t *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d*}
           {:the00000000000000000000-destroyer-of-the-gen *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave*}
           {:the00000000000000000000000000000000000000000 *the-robin-hood-protocol-ahz-ahi-100d*}
           {:judgment-turns-in-favour-of-the-broken-stone *judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5587*}
           {:threeppn-end00-of-seven-year-cleansing-of-al *threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d*}
           {:threeppnoah000000000000000000000000000000000 *threeppnoah-idea-adoption-and-implementation-two100d*}
           {:threeppnoah000000000000000000000000000000001 *threeppnoah-idea-adoption-and-implementation-three100d*}
           {:revelatiotrial-revott-at-the-end00-ie-purpos *revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d*}
           {:again-born-ie-born-of000-spirit-is-the-end-i *again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d*}
           {:the00000000000000000000000000000000000000000 *the-power-of-the-manchild-100d*}
           {:revelationof-the-trial-expanded-revotte-ie-p *revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d*}
           {:ten00000000000000000000000000000000000000000 *ten-days-tribulation2800ddiv23*}
           {:ten0000000000000000000-days-tribulation-unto *ten-days-tribulation-unto-armageddon-ca-gathering-starts-2800ddiv23*}
           {:ten000000000000000000000000000000-days-tribu *ten-days-tribulation-unto-armageddon-finished-2800ddiv23*}
           {:the-shulammite-sdq-globaldedicated-to-juliet *the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7*}
           {:project-hybridization-developmentparametric- *project-hybridization-development-parametric-nkechichiomaosoka40yj-taop1-internals1000ddiv7*}
           {:project-hybridization-developmentparametric- *project-hybridization-development-parametric-nkechichiomaosoka40yj-taop2-internals1000ddiv7*}
           {:core-completion-matrix1-wherein-whilst-iron- *core-completion-matrix1-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d*}
           {:core-completion-matrix2-wherein-twhilst-iron *core-completion-matrix2-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d*}
           {:the0-minus-half-six-and-then-seventh-day-dep *the-acc-abstract-of-projects-and-the-trial-ztp11640-a-minus-half-six-and-then-seventh-day-depiction-minus360d-not-in-standard-form2400d*}
           {:the-acc-abstraminus-half-six-and-then-sevent *the-acc-abstract-of-projects-and-the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-not-in-standard-form2400d*}
           {:the-aminus-half-six-and-then-seventh-day0-de *the-acc-abstract-of-projects-and-the-trial-ztp12360-a-minus-half-six-and-then-seventh-day-depiction-plus360d-not-in-standard-form2400d*}
           {:dark0000000000000000000000000000000000000000 *dark-nignt-of-the-prophets-soul100d-ztp12000*}
           {:dark0000000000000000000000000000000000000001 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}
           {:dark0000000000000000000000000000000000000002 *dark-nignt-of-the-prophets-soul100d-ztp12060*}
           {:ephesians221-building00000000000000000000000 *ephesians221-building-yg*}
           {:project-hybridization-development00000000000 *project-hybridization-development-parametric28yg-jennifer700ddiv6pt9*}
           {:roundabout-aimee-magnified000000000000000000 *roundabout-aimee-magnified-proper2731ddiv18*}
           {:babylon-the-great-emergence000000000000-and- *babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w*}
           {:z-absolute-centralization-unto-utter-decent0 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3*}
           {:zabsolute-centralization-unto-utter0-decent1 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3*}
           {:zero000000-trade-salvation-from-ca-under-the *zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg*}
           {:zero0000000000000-trade-salvation-from-ca-to *zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg*}
           {:observe000000000000000000000000000000000-i-a *observe-i-am-getting-married-to-the-new-nigeria25ddiv9*}
           {:threeppnoah000000000000000000000000000000000 *threeppnoah-global-turnaround-fullydeveloped250ddiv9*}
           {:part1-embryo-genesis-seedling-plant0-photosy *part1-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-before-25032pt8tnldy-360d*}
           {:part2-embryo-genesis-seedling-plant-photosyn *part2-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-after-25032pt8tnldy-240d*}
           {:birth000000000000000000000000000000000000000 *birth-of-the-fig-tree-minusoneeightzerozero-yj*}
           {:birth000000000000000000000000000000000000001 *birth-of-the-fig-tree-ztp-minus904tnldy-egypt-begins-amassing-troops-on-israels-borders-yj*}
           {:birth000000000000000000000000000000000000002 *birth-of-the-fig-tree-zero-yj*}
           {:the-redemption-of-a-people-scatteredand-peel *the-redemption-of-a-people-scattered-and-peeled-terrible-from-their-beginning-hitherto-101dys31div69*}
           {:the00000000000000-light-shines-in-the-darkne *the-light-shines-in-the-darkness-but-the-darkness-comprehends-it-not10yg*}
           {:the-mystery-of-iniquity-they-shallmingle-the *the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-earliest-dnps-overlap-infiltration-100d*}
           {:the-mystery0-of-iniquity-they-shall-mingle-t *the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-latest-100d*}
           {:the00000000000000000000000000000000000000000 *the-first-jeroboam-yg*}
           {:the00000000000000000000000000000000000000001 *the-second-jeroboam-yg*}
           {:a-simple-count-of-years-of-the-creature-born *a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg*}
           {:cfh-flowing-through-the-creature0-which-godw *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter-yg*}
           {:cfh-flowing-through-the-creaturheavily-encrx *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-yg*}
           {:cfh-flowing-through-theheavily-encrypted-may *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet-yg*}
           {:cfh-flowing-through-heavily-encrypted-machiz *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave-yg*}
           {:ephesians613-fulfillmenshula-manifests-even0 *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-cultivation100d*}
           {:ephesians613-fulfillment-wishula-manifests-1 *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-harvest100d*}
           {:ephesians613-fulfillment-withshula-manifest2 *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-end-harvest100d*}
           {:recuperation-and-shulamite-vindication-again *recuperation-and-shulamite-vindication-against-the-backdrop-of-the-gestation-of-the-dystopia-of-the-seventh-king-and-wwiii100ddiv7*}
           {:begin-inordinate-first-love-deliverentry-to0 *begin-inordinate-first-love-deliverance-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-hsotp-entry-to-the-eleven-curtains-of-the-temple1000ddiv7*}
           {:end-inordinate-first-love-deliveentry-to-th1 *end-inordinate-first-love-deliverance-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-hsotp-entry-to-the-eleven-curtains-of-the-temple1000ddiv6pt9*}
           {:begin-traditional-marrentry-to-the-eleven-c2 *begin-traditional-marriage-sdq-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-entry-to-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:end-traditional-mentry-to-the-eleven-curtai3 *end-traditional-marriage-sdq-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-entry-to-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:begin-ca-cend-of-the-fifth-of-the-eleven-cu4 *begin-ca-cross-trained-engineer-she-that-is-of-me-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-sunclothed-woman-sixth-curtain-doubled-up-at-the-end-of-the-fifth-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:end-ca-cend-of-the-fifth-of-the-eleven-curt5 *end-ca-cross-trained-engineer-she-that-is-of-me-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-sunclothed-woman-sixth-curtain-doubled-up-at-the-end-of-the-fifth-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:beginning00-of-the-seventh-of-the-eleven-cu6 *begin-ca-nonye-igboanusi-nwokedi-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-heloise-d-argenteuil-du-paraclet-sixth-curtain-doubled-up-at-the-beginning-of-the-seventh-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:beginningof-the-seventh-of-the-eleven-curta7 *end-ca-nonye-igboanusi-nwokedi-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-heloise-d-argenteuil-du-paraclet-sixth-curtain-doubled-up-at-the-beginning-of-the-seventh-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:forefront-of-the-eleventh-curtain-of-the-el8 *begin-ca-dnps-similitude-save-ueo-at-all-cost-from-the-ten-horns-etc-armageddon-death-march-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-at-forefront-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:forefront-of-the-eleventh-curtain-eleven-cu9 *end-ca-dnps-similitude-save-ueo-at-all-cost-from-the-ten-horns-etc-armageddon-death-march-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-at-forefront-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:midst-of-the-eleventh-curtain-of-eleven-cura *begin-it-is-done-acc-document-reception-part1-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-in-the-midst-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:midst-of-the-eleventh-curtain-of-the-elevenb *end-it-is-done-acc-document-reception-part1-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-in-the-midst-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:midst-of-the-eleventh-curtain-of-the-elevenc *begin-it-is-done-acc-document-reception-part2-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-in-the-midst-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*} 
           {:midst-of-the-eleventh-curtain-of-the-elevend *end-it-is-done-acc-document-reception-part2-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-in-the-midst-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:uttermost-end-of-the-eleventh-curtain-of-the *begin-ca-dnps-cleansing-fulfillment-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-at-uttermost-end-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv7*}
           {:uttermost-end-of-the-eleventh-curtain-of-thf *end-ca-dnps-cleansing-fulfillment-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-at-uttermost-end-of-the-eleventh-curtain-of-the-eleven-curtains-of-the-exodus26v7to9temple-1000ddiv6pt9*}
           {:unn00000000000000000000000000000000000000000 *unn-job-offered-100d*}
           {:unn00000000000000000000000000000000000000001 *unn-job-accepted-100d*}
           {:unn00000000000000000000000000000000000000002 *unn-job-offered-yj*}
           {:unn00000000000000000000000000000000000000003 *unn-job-accepted-yj*}
           {:unn00000000000000000000000000000000000000004 *unn-job-offered-yg*}
           {:unn00000000000000000000000000000000000000005 *unn-job-accepted-yg*}
           {:ca000000000000000000000000000000000000000006 *ca-time-of-the-enoch-type-rapture7d*}
           {:a0000000000000000000000000000000000000000000 *a-rapture-occurs-circa-here100d*}
           {:dnps-begin-cleanse1-40yj-view-ztp12052-what0 *dnps-begin-cleanse1-40yj-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj*}
           {:dnps-begin-cleanse2-40yj-view-ztp12060-what1 *dnps-begin-cleanse2-40yj-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj*}
           {:dnps-end-cleanse1-40yg-view-ztp12052-what002 *dnps-end-cleanse1-40yg-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg*}
           {:dnps-end-cleanse2-40yg-view-ztp12060-what-o3 *dnps-end-cleanse2-40yg-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg*}
           {:tnl00000000000000000000000000000000000000000 *tnl-1000d*}
           {:tnl00000000000000000000000000000000000000001 *tnl-yj*}
           {:tnl00000000000000000000000000000000000000002 *tnl-yg*}
           {:z0000000000000000000000000000000000000000003 @z-tnldy-clock3}
           {:grace-and-truth-of-jesus-christ-unto-the-sev *imputation-of-sin-via-the-law-given-by-moses-against-the-transgression-of-those-angels-followed-by-the-grace-and-truth-of-jesus-christ-unto-the-seventh-angel-trumpet-sound-daysi-synchronization-100yg*}
           {:days000000000000000000000000000000000000000i *days-i*}
           {:cognitive00000000000000000-radio-frequency-t *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}
           (l/local-now)           
      
] 
))
         