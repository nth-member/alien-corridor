(ns org.threeppnoah.mdqnm.jomosuperprocess1.mdqnm-timemachines-and-clocks)

(require '[clj-time.core :as t])
(require '[clj-time.coerce :as c])
(require '[clj-time.local :as l])

(require 'org.threeppnoah.mdqnm.jomosuperprocess2.mdqnm-abbreviated-timemachines-and-clocks :reload)
(refer 'org.threeppnoah.mdqnm.jomosuperprocess2.mdqnm-abbreviated-timemachines-and-clocks)

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



(let [Z "...THE FOLLOWING IS AN INSTANTANEOUS SNAPSHOT OF SELECT MDQNM (ie JOMO) SFOs..."](println Z) )

(defn mdqnm-execution-of-selected-sfos [coll] (clojure.string/join \newline coll))




(mdqnm-execution-of-selected-sfos [
   
              '\
                                   
          {:cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}

              '\                        
                                   
          {:global-calc-zero-three-x-sfo-bbs-sparse-embedded-function-call "(*this-function-can-recreate-any-onedimensional-sfo-and-expects-coefficientforyvalue-and-ztp* COEFF4Y Ztp)" }

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
          
          {:after-israel-comes-up-out-of-egypt-and-elders-overlive-joshua-at-ztp-ca-m1236496tnldy-unto-2nd-advent-of-the-lord-jesus-christ-36000d *after-israel-comes-up-out-of-egypt-and-elders-overlive-joshua-at-ztp-ca-m1236496tnldy-unto-2nd-advent-of-the-lord-jesus-christ-36000d*}
           
              '\
           
          {:christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d*}
           
          {:christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d*}
           
              '\
           
          {:saved-by-christ-jesus-100d *saved-by-christ-jesus-100d*}
           
          {:saved-and50yj-lock-to-the-vision-yj   *saved-and50yj-lock-to-the-vision-yj*} 

          {:countdown-from-the-twenty-fourth-yj-unto-the-vision360d *countdown-from-the-twenty-fourth-yj-unto-the-vision360d*}
		  
		       
               '\
			   
	  {:what-withholdeth-bw-ca-18pt50-and-25pt20-the-mystery-of-iniquity-and-that-number-is-embedded-in-this-sfo36d *what-withholdeth-bw-ca-18pt50-and-25pt20-the-mystery-of-iniquity-and-that-number-is-embedded-in-this-sfo36d*}
           
               '\

          'FOUR-PROPER-EIGEN-EQUATIONS-START
         {:eleven-curtains-of-the-shulammite-dark-night-of-the-prophets-soul-dnps-the-jew-first-eigen-proper-1700ddiv7 *eleven-curtains-of-the-shulammite-dark-night-of-the-prophets-soul-dnps-the-jew-first-eigen-proper-1700ddiv7*}
         {:eleven-curtains-of-the-shulammite-dark-night-of-the-prophets-soul-dnps-and-also-the-gentile-eigen-proper-16900ddiv69 *eleven-curtains-of-the-shulammite-dark-night-of-the-prophets-soul-dnps-and-also-the-gentile-eigen-proper-16900ddiv69*}
         {:revelation-of-the-trial-revott-eigen-proper-equation-200d *revelation-of-the-trial-revott-eigen-proper-equation-200d*}
         {:ten-days-tribulation-10dt-eigen-proper-equation-2961ddiv23 *ten-days-tribulation-10dt-eigen-proper-equation-2961ddiv23*}
          'FOUR-PROPER-EIGEN-EQUATIONS-END
      
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
		   
              '\
          
		  'CONCLUSION-OF-BUILDING-THE-HOUSE-OF-THE-LORD-SEVEN-YEARS-START
		  {:deliverance0-ztp16571pt8-went-forth-conquering-and-to-conquer-yj *deliverance0-ztp16571pt8-went-forth-conquering-and-to-conquer-yj*}
          
		  {:deliverance1-ztp16680-iron-yj *deliverance1-ztp16680-iron-yj*}
          
		  {:deliverance2-ztp16709-birth-of-jesus-christ-yj *deliverance2-ztp16709-birth-of-jesus-christ-yj*}
          
		  {:deliverance3-ztp16716pt52-jesus-christ-is-well-on-about-the-business-of-his-father-yj *deliverance3-ztp16716pt52-jesus-christ-is-well-on-about-the-business-of-his-father-yj*}
          
		  {:deliverance4-ztp16719-at-calvary-the-world-is-delivered-of-a-manchild-destined-to-rule-all-nations-with-a-rod-of-iron-yj *deliverance4-ztp16719-at-calvary-the-world-is-delivered-of-a-manchild-destined-to-rule-all-nations-with-a-rod-of-iron-yj*}
		  'CONCLUSION-OF-BUILDING-THE-HOUSE-OF-THE-LORD-SEVEN-YEARS-END
		  
			  '\

          {:a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj*}
           
          {:a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj*}
           
		       '\
			   
		  'CONCLUSION-OF-BUILDING-MY-OWN-HOUSE-THIRTEEN-YEARS-START	
          {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-preamble-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-preamble-yj*}
		  
		  {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj*}
           
          {:on-the-money1-pleading-against-the-kingdom-of-darkness-yj *on-the-money1-pleading-against-the-kingdom-of-darkness-yj*}
           
          {:on-the-money2-pleading-against-the-kingdom-of-darkness-yj *on-the-money2-pleading-against-the-kingdom-of-darkness-yj*}
          
          {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj*}
          'CONCLUSION-OF-BUILDING-MY-OWN-HOUSE-THIRTEEN-YEARS-END
		  
		       '\ 
			   
		  'CONCLUSION-OF-PREVAILING-AGAINST-HAMATH-ZOBAH-START 
          {:judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj *judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj*}
           
          {:judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj *judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj*}
          'CONCLUSION-OF-PREVAILING-AGAINST-HAMATH-ZOBAH-END
		  
		       '\  
			   
		  'CONCLUSION-OF-EVEN-UNTO-THREE-AND-TWENTY-YEARS-START
		  {:judgment3-even-unto-three-and-twenty-years-gogid-ztp-at-22440tnldy-yj *judgment3-even-unto-three-and-twenty-years-gogid-ztp-at-22440tnldy-yj*}
		  
		  {:judgment3-even-unto-three-and-twenty-years-circumspection-ztp-at-22692tnldy-yj *judgment3-even-unto-three-and-twenty-years-circumspection-ztp-at-22692tnldy-yj*}
		  'CONCLUSION-OF-EVEN-UNTO-THREE-AND-TWENTY-YEARS-END
		  
		       '\
		  
		  'A-FOCUS-ON-RECKONINGS-OF-ONE-AND-TWENTY-YEARSJ-EVEN-UNTO-THREE-AND-TWENTY-YEARSJ-ENDS-HERE
           
              '\
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter360d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter360d*}

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss360d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss360d*}

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet360d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet360d*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave360d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave360d*}
           
              '\
           
          {:a-holy-firstborn-from-the-matrix-reckoning-from-abraham-yg *a-holy-firstborn-from-the-matrix-reckoning-from-abraham-yg*}

          {:a-holy-firstborn-from-the-matrix-reckoning-from-isaac-yg *a-holy-firstborn-from-the-matrix-reckoning-from-isaac-yg*}

          {:a-holy-firstborn-from-the-matrix-reckoning-from-jacob-yg *a-holy-firstborn-from-the-matrix-reckoning-from-jacob-yg*}
           
              '\

          {:days-i *days-i*}

          {:cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23 *cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23*}
           
          {:cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23 *cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23*}

              '\
 
          {:kristallnacht-to-begincleanseafterarmageddon-31028one-month-pattern-daysi-28000ddiv23 *kristallnacht-to-begincleanseafterarmageddon-31028one-month-pattern-daysi-28000ddiv23*}
           
              '\

          {:seventh-king-uses-the-key-of-thermonuclear-war-to-open-the-bottomless-pit-and-let-out-the-ten-horns-mystery-babylon-a-raiser-of-taxes-the-eighth-king-etc-35d *seventh-king-uses-the-key-of-thermonuclear-war-to-open-the-bottomless-pit-and-let-out-the-ten-horns-mystery-babylon-a-raiser-of-taxes-the-eighth-king-etc-35d*}
           
          {:countdown-in-days-to-the-end-at-ztp-of-the-russian-government-of-the-overt-seventh-king-1d *countdown-in-days-to-the-end-at-ztp-of-the-russian-government-of-the-overt-seventh-king-1d*}
          
          {:the-seventy-weeks-of-the-seventh-king-7d *the-seventy-weeks-of-the-seventh-king-7d*}

          {:multiple-detonations-and-destructions-at-great-babylon-viscerally-shock-many-generational-slaves-and-servants-into-emancipation-from-among-the-chaos-attendant-at-her-destruction-360d *multiple-detonations-and-destructions-at-great-babylon-viscerally-shock-many-generational-slaves-and-servants-into-emancipation-from-among-the-chaos-attendant-at-her-destruction-360d*}

                   
              '\
           
          {:napoleon-entering3500d *napoleon-entering3500d*}

          {:kings-leaving3500d *kings-leaving3500d*}
           
          {:the-symbolic-synodic-period-of-venus-a-time-of-the-gentiles-as-read-from-kings-leaving3500d-and-containing-the-seventy-weeks-of-daniel350d *the-symbolic-synodic-period-of-venus-a-time-of-the-gentiles-as-read-from-kings-leaving3500d-and-containing-the-seventy-weeks-of-daniel350d*}
           
              '\

          {:usa-sit-10yg *usa-sit-10yg*}
           
          {:usa-dem-rev-sit-on-brit-emp-70000ddiv69 *usa-dem-rev-sit-on-brit-emp-70000ddiv69*}
           
          {:countdown0-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d *countdown0-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           
          {:countdown1-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d *countdown1-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           
          {:countdown2-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d *countdown2-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           
          {:countdown3-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d *countdown3-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}

              '\ 
           
          {:from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj*}
           
          {:from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg*}
           
              '\                       
           
           'DIGEST-REVOTT-SFOs-WITH-ABSOLUTE-AND-RELATIVE-POSITIONS-SHOWN-BEGIN
           
          {:shulam-she-that-is-of-me-the-new-nigeria100d-named-because-of-sfobbminus13pt32-and-whose-ztp-is-s2minus28pt80-on-revott *shulam-she-that-is-of-me-the-new-nigeria100d-named-because-of-sfobbminus13pt32-and-whose-ztp-is-s2minus28pt80-on-revott*}
           
          {:dark-nignt-of-the-prophets-soul100d-named-because-of-sfobbzero-and-whose-ztp-is-s2minus21pt07-on-revott *dark-nignt-of-the-prophets-soul100d-named-because-of-sfobbzero-and-whose-ztp-is-s2minus21pt07-on-revott*}
           
          {:sealed-a-slave-forever-in-the-unlimited-company-the-omega-project100d-because-of-sfobbminus18pt00-and-whose-ztp-is-s2minus18pt00-on-revott *sealed-a-slave-forever-in-the-unlimited-company-the-omega-project100d-because-of-sfobbminus18pt00-and-whose-ztp-is-s2minus18pt00-on-revott*}
           
          {:born-of-the-flesh-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-0pt00-on-revott *born-of-the-flesh-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-0pt00-on-revott*}
           
          {:born-of-the-flesh-leave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-6pt00-on-revott *born-of-the-flesh-leave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-6pt00-on-revott*}
           
          {:cfh-rapturing-through-family-friends-acquaintances-etc-ffae-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-23pt71-on-revott *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-23pt71-on-revott*}
           
          {:cfh-rapturing-through-family-friends-acquaintances-etc-ffae100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-24pt897-on-revott *cfh-rapturing-through-family-friends-acquaintances-etc-ffae100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-24pt897-on-revott*}
           
          {:cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leaveone100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt20-on-revott *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leaveone100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt20-on-revott*}
           
          {:cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leavetwo100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt56-on-revott *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leavetwo100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt56-on-revott*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealenter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-45pt718-on-revott *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealenter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-45pt718-on-revott*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-trumpet100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-47pt528-on-revott *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-trumpet100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-47pt528-on-revott*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealleave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-49pt318-on-revott *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealleave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-49pt318-on-revott*}
           
          {:the-purpose-of-all-things-is-at-hand-ie-birth100d-because-of-sfobbzero-and-whose-ztp-is-s2-82pt80-on-revott *the-purpose-of-all-things-is-at-hand-ie-birth100d-because-of-sfobbzero-and-whose-ztp-is-s2-82pt80-on-revott*}
           
          {:the-purpose-of-all-things-is-at-hand-ie-circumspection100d-because-of-sfobbzero-and-whose-ztp-is-s2-85pt32-on-revott *the-purpose-of-all-things-is-at-hand-ie-circumspection100d-because-of-sfobbzero-and-whose-ztp-is-s2-85pt32-on-revott*}
           
           'DIGEST-REVOTT-SFOs-WITH-ABSOLUTE-AND-RELATIVE-POSITIONS-SHOWN-END
           
              '\
           
          {:shulam-she-that-is-of-me-the-new-nation-determined-and-globally-resonant-emancipation-signal-in-the-time-lockdown-boundary-of-enoch-between-is-and-is-to-come100d *shulam-she-that-is-of-me-the-new-nation-determined-and-globally-resonant-emancipation-signal-in-the-time-lockdown-boundary-of-enoch-between-is-and-is-to-come100d*}
           
              '\
                      
           'THE-SHULAMMITE-SINGULARITY-IMMANENT-IN-NIGERIA-START 
           
          {:sixty-nine-week-paramour-discovery-optimum1-boundary7d *sixty-nine-week-paramour-discovery-optimum1-boundary7d*}

          {:sixty-nine-week-paramour-discovery-optimum2-boundary7d *sixty-nine-week-paramour-discovery-optimum2-boundary7d*}
         
          {:the-intelligent-defence-body-and-the-five-terawatt-project-ie-the-elusive-sixty-nine-week-singularity-manifestation-after-the-fact-of-a-metonic-cycle7d *the-intelligent-defence-body-and-the-five-terawatt-project-ie-the-elusive-sixty-nine-week-singularity-manifestation-after-the-fact-of-a-metonic-cycle7d*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-forty-days-prior-cfhthruhembossztpentry *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-forty-days-prior-cfhthruhembossztpentry*}

          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpdesignpoint0 *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpdesignpoint0*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-present-at-olokoro-for-the-loving-celebration-of-life-and-interrment-of-albert-onyenuloya-uhiara-cfhthruhembossztp18794pt8div10setting0 *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-present-at-olokoro-for-the-loving-celebration-of-life-and-interrment-of-albert-onyenuloya-uhiara-cfhthruhembossztp18794pt8div10setting0*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-barebones-darkly-through-a-glass-prerecord-of-facebook-ruminations-on-the-order-for-the-rise-of-the-7th-king-cfhthruhembossztp18827pt81div115setting1 *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-barebones-darkly-through-a-glass-prerecord-of-facebook-ruminations-on-the-order-for-the-rise-of-the-7th-king-cfhthruhembossztp18827pt81div115setting1*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpdesignpoint1 *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpdesignpoint1*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpexit *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpexit*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-twenty-days-after-and-for-a-total-180day-ztp-interval-cfhthruhembossztpposteriorexit *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-twenty-days-after-and-for-a-total-180day-ztp-interval-cfhthruhembossztpposteriorexit*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity-predestination-unto-the-immanence-in-nigeria7d *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity-predestination-unto-the-immanence-in-nigeria7d*}

          {:ca-time-of-the-enoch-type-rapture7d *ca-time-of-the-enoch-type-rapture7d*}
           
          {:the-shulammite-singularity-manifestation-of-the-mystery-the-immanence-in-nigeria-count-is-in-reverse7d *the-shulammite-singularity-manifestation-of-the-mystery-the-immanence-in-nigeria-count-is-in-reverse7d*}
           
           'THE-SHULAMMITE-SINGULARITY-IMMANENT-IN-NIGERIA-END
           
              '\
           
          {:a-rapture-occurs-circa-here100d *a-rapture-occurs-circa-here100d*}
           
              '\

          {:acc-5tw-tidb-tac-blackwhole-ztp11940-dnps1000d *acc-5tw-tidb-tac-blackwhole-ztp11940-dnps1000d*}
           
          {:acc-5tw-tidb-tac-blackwhole-ztp12000-dnps1000d *acc-5tw-tidb-tac-blackwhole-ztp12000-dnps1000d*}
           
          {:acc-5tw-tidb-tac-blackwhole-ztp12060-dnps1000d *acc-5tw-tidb-tac-blackwhole-ztp12060-dnps1000d*}
           
             '\
        
      'GOGID-M2333PT3333-UNTO-GOGID-ZTP-BEGIN
      {:commence-save-ueo-at-all-cost-ca-70-week-death-march-m2420-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *commence-save-ueo-at-all-cost-ca-70-week-death-march-m2420-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:commence-save-ueo-at-all-cost-ca-70-week-death-march-ztp11740 *commence-save-ueo-at-all-cost-ca-70-week-death-march-ztp11740*}
      
      '\
      
      {:alien-corridor-creation-m2333pt3333-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *alien-corridor-creation-m2333pt3333-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:alien-corridor-creation100d-ztp11826pt6667 *alien-corridor-creation100d-ztp11826pt6667*}
      
      '\
      
      {:dark-night1-m2160-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *dark-night1-m2160-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:dark-nignt-of-the-prophets-soul100d-ztp12000 *dark-nignt-of-the-prophets-soul100d-ztp12000*}

      '\

      {:dark-night2-m2107-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *dark-night2-m2107-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:dark-nignt-of-the-prophets-soul100d-ztp12052pt17 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}

      '\

      {:dark-night3-m2100-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *dark-night3-m2100-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:dark-nignt-of-the-prophets-soul100d-ztp12060 *dark-nignt-of-the-prophets-soul100d-ztp12060*}

      '\

      {:ebe-city-complex-m1960-gogid-end1-seventh-king-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *ebe-city-complex-m1960-gogid-end1-seventh-king-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:ebe-city-complex100d-ztp12200 *ebe-city-complex100d-ztp12200*}

      '\

      {:ebe-city-complex-m1908-gogid-end2-seventh-king-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *ebe-city-complex-m1908-gogid-end2-seventh-king-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:ebe-city-complex100d-ztp12252 *ebe-city-complex100d-ztp12252*}

      '\

      {:the-main-strain-shulammite-lineage-of-grace-through-faith-m1800-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-main-strain-shulammite-lineage-of-grace-through-faith-m1800-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-main-strain-shulammite-lineage-of-grace-through-faith-threeppnoah-omega-project-ideation-implies-arthur-george-consolidated-holdings-sealed-a-slave-forever-in-the-unlimited-company-etc-aimee-mungovan-zkpcdp-over-gogid100d *the-main-strain-shulammite-lineage-of-grace-through-faith-threeppnoah-omega-project-ideation-implies-arthur-george-consolidated-holdings-sealed-a-slave-forever-in-the-unlimited-company-etc-aimee-mungovan-zkpcdp-over-gogid100d*}
 
      '\

      {:ca-peak-m1710-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *ca-peak-m1710-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:ca-peak-m1710-of-the-raiser-of-taxes-in-the-glory-of-the-kingdom100d *ca-peak-m1710-of-the-raiser-of-taxes-in-the-glory-of-the-kingdom100d*}
      
      '\

     {:within-few-days-m1656-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *within-few-days-m1656-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
     {:within-few-days-m1656-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d *within-few-days-m1656-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}
       
      '\

     {:within-few-days-m1640-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *within-few-days-m1640-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
     {:within-few-days-m1640-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d *within-few-days-m1640-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}
       
      '\

     {:within-few-days-m1600-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *within-few-days-m1600-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
     {:within-few-days-m1600-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d *within-few-days-m1600-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}

      '\

      {:if-the-universe1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *if-the-universe1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d*}

      '\

      {:if-the-universe2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *if-the-universe2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d*}

      '\

      {:if-the-universe3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *if-the-universe3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d*}

      '\

      {:if-the-universe4-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *if-the-universe4-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d*}

      '\

      {:having-subdued-three-kings-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *having-subdued-three-kings-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d *having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d*}

      '\

      {:yea-and-the-prince-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *yea-and-the-prince-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:yea-and-the-prince-of-the-covenant-also100d *yea-and-the-prince-of-the-covenant-also100d*}

      '\

      {:and-after-the-league-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-after-the-league-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-after-the-league-made-with-him-he-shall-work-deceitfully100d *and-after-the-league-made-with-him-he-shall-work-deceitfully100d*}

      '\

      {:for-he-shall-come-up-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *for-he-shall-come-up-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:for-he-shall-come-up100d *for-he-shall-come-up100d*}

      '\

      {:and-become-strong-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-become-strong-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-become-strong-with-a-small-people100d *and-become-strong-with-a-small-people100d*}

      '\

      {:born-of-the-flesh-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *born-of-the-flesh-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}
      'GOGID-M2333PT3333-UNTO-GOGID-ZTP-END

      '\

      'GOGID-ZTP-UNTO-THE-SEVENTH-SEAL-BEGIN
      {:born-of-the-flesh-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *born-of-the-flesh-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}

      '\

      {:and-shall-forecast1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-shall-forecast1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d*}

      '\

      {:and-shall-forecast2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-shall-forecast2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d*}

      '\

      {:and-his-army-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-his-army-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-his-army-shall-overflow100d *and-his-army-shall-overflow100d*}

      '\

      {:and-many-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-many-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-many-shall-fall-down-slain100d *and-many-shall-fall-down-slain100d*}

      '\

      {:and-his-heart-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-his-heart-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d *and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d*}

      '\

      {:the-ships-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-ships-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-ships-of-chittim-shall-come-against-him100d *the-ships-of-chittim-shall-come-against-him100d*}

      '\

      {:foundation1-1080days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *foundation1-1080days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:foundation1-1080days-100d *foundation1-1080days-100d*}
 
      '\

      {:and-arms-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-arms-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-arms-shall-stand-on-his-part100d *and-arms-shall-stand-on-his-part100d*}

      '\

      {:he-shall-confirm-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-confirm-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-confirm-the-covenant-with-many-for-one-week-start100d *he-shall-confirm-the-covenant-with-many-for-one-week-start100d*}

      '\

      {:and-they-shall-pollute-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-they-shall-pollute-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-they-shall-pollute-the-sanctuary-of-strength100d *and-they-shall-pollute-the-sanctuary-of-strength100d*}

      '\

      {:and-shall-take-away-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-shall-take-away-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-shall-take-away-the-daily-sacrifice100d *and-shall-take-away-the-daily-sacrifice100d*}

      '\

      {:and-they-shall-place-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-they-shall-place-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-they-shall-place-the-abomination-that-makes-desolate100d *and-they-shall-place-the-abomination-that-makes-desolate100d*}

      '\

      {:seventh-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seventh-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d *seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d*}
     'GOGID-ZTP-UNTO-THE-SEVENTH-SEAL-END

      '\

     'SEVENTH-SEAL-UNTO-THE-END-OF-ALL-THE-IMMEDIATE-OUTCOMES-OF-THE-BATTLE-OF-ARMAGEDDON-BEGIN
      
      {:seventh-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seventh-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d *seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d*}

      '\

      {:foundation2-1440days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *foundation2-1440days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:foundation2-1440days-100d *foundation2-1440days-100d*}

      '\

      {:first-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *first-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d *first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d*}

      '\

      {:one-of-the-seals-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *one-of-the-seals-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d *one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d*}

      '\

      {:manchild-born-christmas-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *manchild-born-christmas-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:manchild-born-christmas-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d *manchild-born-christmas-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d*}

      '\

      {:manchild-born-easter-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *manchild-born-easter-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:manchild-born-easter-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d *manchild-born-easter-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d*}

      '\

      {:false-prophet0-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *false-prophet0-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:false-prophet-another-beast-coming-up-out-of-the-earth-100d *false-prophet-another-beast-coming-up-out-of-the-earth-100d*}
       
      '\

      {:second-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *second-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d *second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d*}

      '\

      {:second-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *second-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d *second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d*}

      '\

      {:third-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *third-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d *third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d*}

      '\

      {:mystery-babylon-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *mystery-babylon-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d *mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d*}

      '\

      {:gog-ascending-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *gog-ascending-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d *gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d*}

      '\

      {:third-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *third-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d *third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d*}

      '\

      {:babylon-is-fallen-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *babylon-is-fallen-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d *babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d*}

      '\

      {:he-shall-confirm2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-confirm2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-confirm-the-covenant-with-many-for-one-week-midst100d *he-shall-confirm-the-covenant-with-many-for-one-week-midst100d*}

      '\

      {:the-court-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-court-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-court-that-is-without-begin100d *the-court-that-is-without-begin100d*}

      '\

      {:one-of-gogs-heads-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *one-of-gogs-heads-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:one-of-gogs-heads-is-wounded-unto-death100d *one-of-gogs-heads-is-wounded-unto-death100d*}

      '\

      {:after-gogs-deadly-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *after-gogs-deadly-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d *after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d*}

      '\

      {:false-prophet1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *false-prophet1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:false-prophet-that-they-should-make-an-image-to-the-beast-100d *false-prophet-that-they-should-make-an-image-to-the-beast-100d*}

      '\

      {:a-rapture-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *a-rapture-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:a-rapture-occurs-circa-here100d *a-rapture-occurs-circa-here100d*}

      '\

      {:false-prophet2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *false-prophet2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:false-prophet-had-power-to-give-life-unto-the-image-of-the-beast-100d *false-prophet-had-power-to-give-life-unto-the-image-of-the-beast-100d*}

      '\

      {:false-prophet3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *false-prophet3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:false-prophet-causeth-all-to-receive-a-mark-in-their-right-hand-or-in-their-foreheads-100d *false-prophet-causeth-all-to-receive-a-mark-in-their-right-hand-or-in-their-foreheads-100d*}

      '\
	  
	  {:the-temple-2520days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-temple-2520days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-temple-2520days-100d *the-temple-2520days-100d*}
	  
	  '\

      {:fourth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fourth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d *fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d*}

      '\

      {:the-ten-horns-completely-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-ten-horns-completely-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d*}

      '\

      {:the-ten-horns-completely2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-ten-horns-completely2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d*}

      '\

      {:the-court2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-court2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d*}

      '\

      {:fourth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fourth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d *fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d*}

      '\

      {:the-two-prophets1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-two-prophets1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-two-prophets-the-lampstands-commence-testimony100d *the-two-prophets-the-lampstands-commence-testimony100d*}

      '\

      {:fifth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fifth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d *fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d*}

      '\

      {:abaddon-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *abaddon-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:abaddon-apollyon100d *abaddon-apollyon100d*}

      '\

      {:end-of-five-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-five-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d *end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d*}

      '\

      {:fifth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fifth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d *fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d*}

      '\

      {:but-tidings-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *but-tidings-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d *but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d*}

      '\

      {:he-shall-plant1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-plant1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d*}
    
      '\
    
      {:he-shall-plant2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-plant2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d*}

      '\
    
      {:sixth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *sixth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d *sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d*}

      '\
    
      {:sixth-seal-zero-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *sixth-seal-zero-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:sixth-seal-zero-100d *sixth-seal-zero-100d*}

      '\
    
      {:sixth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *sixth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d *sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d*}

      '\
    
      {:another-mighty-angel-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *another-mighty-angel-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d *another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d*}

      '\
    
      {:the-lamb-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-lamb-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-lamb-overcoming-the-ten-horns100d *the-lamb-overcoming-the-ten-horns100d*}

      '\
    
      {:the-two-prophets2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-two-prophets2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-two-prophets-the-lampstands-war-with-the-beast-start100d *the-two-prophets-the-lampstands-war-with-the-beast-start100d*}

      '\
    
      {:the-two-prophets3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-two-prophets3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-two-prophets-the-lampstands-war-with-the-beast-finish100d *the-two-prophets-the-lampstands-war-with-the-beast-finish100d*}

      '\
    
      {:the-two-prophets4-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-two-prophets4-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-two-prophets-the-lampstands-war-with-the-beast-end100d *the-two-prophets-the-lampstands-war-with-the-beast-end100d*}

      '\
    
      {:seventh-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seventh-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d *seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d*}

      '\
    
      {:second-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *second-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d *second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d*}

      '\
    
      {:he-shall-confirm3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-confirm3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-confirm-the-covenant-with-many-for-one-week-finish100d *he-shall-confirm-the-covenant-with-many-for-one-week-finish100d*}

      '\
    
      {:third-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *third-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:third-vial-the-rivers-and-fountains-of-waters-become-blood100d *third-vial-the-rivers-and-fountains-of-waters-become-blood100d*}

      '\
    
      {:fourth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fourth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d *fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d*}

      '\
    
      {:fifth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fifth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d *fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d*}

      '\
    
      {:sixth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *sixth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d *sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d*}

      '\
    
      {:seventh-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seventh-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d *seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d*}

      '\
    
      {:the-end-of-the-vial-judgments-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-end-of-the-vial-judgments-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-end-of-the-vial-judgments100d *the-end-of-the-vial-judgments100d*}

      '\
    
      {:in-remembrance-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *in-remembrance-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d *in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d*}

      '\
    
      {:the-end-of-the-seal-judgments-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-end-of-the-seal-judgments-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-end-of-the-seal-judgments *the-end-of-the-seal-judgments*}

      '\
    
      {:end-of-day479-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-day479-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d *end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d*}

      '\
    
      {:end-of-day483-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-day483-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d *end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d*}

      '\
    
      {:end-of-day490-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-day490-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-day490-marriage-supper-of-the-lamb-end100d *end-of-day490-marriage-supper-of-the-lamb-end100d*}

      '\
    
      {:the-light-of-the-sun-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-light-of-the-sun-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d*}

      '\
    
      {:the-light-of-the-sun2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-light-of-the-sun2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d*}

      '\
    
      {:end-of-the-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-the-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d *end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d*}

      '\
    
      {:seven-year-cleansing-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seven-year-cleansing-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d *seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d*}
      
      '\

      {:my-own-house-4680days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *my-own-house-4680days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:my-own-house-4680days-100d *my-own-house-4680days-100d*}

      '\
	  
      {:judgment-turns-in-favour-of-the-broken-stones-5561pt-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *judgment-turns-in-favour-of-the-broken-stones-5561pt-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5561pt *judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5561pt*}

      '\

      {:judgment-turns-in-favour-of-the-broken-stones-5587-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *judgment-turns-in-favour-of-the-broken-stones-5587-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5587 *judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5587*}
      
      '\
    
      {:end-of-seven-year-cleansing-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-seven-year-cleansing-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d *threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d*}

      '\
       
      'I-SUBDUED-THEY-WITHSTOOD-AND-I-REMAINED-START
      {:at-the-end-of-twenty-years-7200days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *at-the-end-of-twenty-years-7200days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:at-the-end-of-twenty-years-7200days-100d *at-the-end-of-twenty-years-7200days-100d*}
 
      '\
 
      {:withstood-me-one-and-twenty-7560days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *withstood-me-one-and-twenty-7560days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:withstood-me-one-and-twenty-7560days-100d *withstood-me-one-and-twenty-7560days-100d*}

      '\

      {:lives-of-the-rest-of-the-beasts-prolonged-a-season-and-a-time-7669days-their-end-is-literally-fulfilled-here-higgaion-selah-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *lives-of-the-rest-of-the-beasts-prolonged-a-season-and-a-time-7669days-their-end-is-literally-fulfilled-here-higgaion-selah-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:lives-of-the-rest-of-the-beasts-prolonged-a-season-and-a-time-7669days-their-end-is-literally-fulfilled-here-higgaion-selah-100d *lives-of-the-rest-of-the-beasts-prolonged-a-season-and-a-time-7669days-their-end-is-literally-fulfilled-here-higgaion-selah-100d*}

      '\
   
      {:revott-purpose-of-all-things-is-at-hand-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *revott-purpose-of-all-things-is-at-hand-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d *revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d*}
           
      '\

      {:again-born-ie-born-of-the-spirit-circumspection-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *again-born-ie-born-of-the-spirit-circumspection-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d *again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d*}
      'I-SUBDUED-THEY-WITHSTOOD-AND-I-REMAINED-END
      
      'SEVENTH-SEAL-UNTO-THE-END-OF-ALL-THE-IMMEDIATE-OUTCOMES-OF-THE-BATTLE-OF-ARMAGEDDON-END

      '\
                                
          {:general-and-state-examination-of-common-phenomena-effluent-from-the-shulammite-singularity-culminating-in-the-gogid100d-feast-of-tabernacles100d *general-and-state-examination-of-common-phenomena-effluent-from-the-shulammite-singularity-culminating-in-the-gogid100d-feast-of-tabernacles100d*}
           
          {:the-egspp-creature-sets-off-into-the-world-and-finds-its-purpose100d *the-egspp-creature-sets-off-into-the-world-and-finds-its-purpose100d*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter100d*}

              '\
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting0-100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting0-100d*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting1-100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting1-100d*}
           
              '\

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet100d*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave100d*}
                                
          {:judgment1-shall-begin-at-the-house-of-god-100d *judgment1-shall-begin-at-the-house-of-god-100d*}
           
          {:judgment2-shall-begin-at-the-house-of-god-100d *judgment2-shall-begin-at-the-house-of-god-100d*}
           
          {:the-work-of-god-is-tried-with-fire100d *the-work-of-god-is-tried-with-fire100d*}
           
          {:the-robin-hood-protocol-ahz-ahi-100d *the-robin-hood-protocol-ahz-ahi-100d*}
           
              '\
                     
          {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter*}

          {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d*}

          {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave*}
          
          {:make-to-yourselves-friends-of-the-mammon-of-unrighteousness-that-when-ye-fail-they-may-receive-you-into-everlasting-habitations-ztp-at-wild-sweet-potato-forage-with-chimdi-and-honest-inverter-negotiation-with-chira100d *make-to-yourselves-friends-of-the-mammon-of-unrighteousness-that-when-ye-fail-they-may-receive-you-into-everlasting-habitations-ztp-at-wild-sweet-potato-forage-with-chimdi-and-honest-inverter-negotiation-with-chira100d*}
           
              '\
            
          {:revott-s2-14pt955-360d-implies-ztp-at-5tw-lawrence-livermore-lab-nuclear-fusion-breakthrough-implies-jephthahs-awful-sacrifice-of-daughter-100d *revott-s2-14pt955-360d-implies-ztp-at-5tw-lawrence-livermore-lab-nuclear-fusion-breakthrough-implies-jephthahs-awful-sacrifice-of-daughter-100d*}
           
          {:revott-s2-15pt341-360d-implies-ztp-at-definitively-linking-the-success-of-noah-atdf-to-fall-of-7th-and-8th-kings-implies-1st-year-of-king-david-reign-100d *revott-s2-15pt341-360d-implies-ztp-at-definitively-linking-the-success-of-noah-atdf-to-fall-of-7th-and-8th-kings-implies-1st-year-of-king-david-reign-100d*}           
           
          {:revott-s2-15pt367-360d-implies-ztp-at-20231007-realtime-50th-yom-kippur-anniversary-attack-on-israel-by-hamas-implies-beginnings-of-king-david-reign-in-jerusalem-100d *revott-s2-15pt367-360d-implies-ztp-at-20231007-realtime-50th-yom-kippur-anniversary-attack-on-israel-by-hamas-implies-beginnings-of-king-david-reign-in-jerusalem-100d*}
           
          {:revott-s2-15pt449-360d-implies-ztp-at-54pt00-tnlyg-ygbday-castigliano-failure-singularity-implies-1st-year-coreign-david-and-solomon-100d *revott-s2-15pt449-360d-implies-ztp-at-54pt00-tnlyg-ygbday-castigliano-failure-singularity-implies-1st-year-coreign-david-and-solomon-100d*}

           
           
              '\

          'HSotP-RoP-LRR-BEGIN-IMPLIES-THE-END-OF-ALL-THINGS-AND-THE-DARK-CLOUD-THAT-IS-GOG
           
          {:the-numbering-of-the-5587days-of-gog-in-power-on-the-earth100d *the-numbering-of-the-5587days-of-gog-in-power-on-the-earth100d*}
           
          {:threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d *threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d*}
    
          {:threeppnoah-idea-adoption-and-implementation-two100d *threeppnoah-idea-adoption-and-implementation-two100d*}
           
          {:threeppnoah-idea-adoption-and-implementation-three100d *threeppnoah-idea-adoption-and-implementation-three100d*}
           
          {:revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d *revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d*}
           
          {:again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d *again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d*}
           
          {:the-power-of-the-manchild-100d *the-power-of-the-manchild-100d*}
           
           'HSotP-RoP-LRR-FINISH-IMPLIES-THE-END-OF-ALL-THINGS-AND-THE-DARK-CLOUD-THAT-IS-GOG
           
              '\

          {:revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d *revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d*}
           
              '\
           
          {:ten-days-tribulation2800ddiv23 *ten-days-tribulation2800ddiv23*}
          
          {:surprised-by-love-formerly-understood-by-paramour-discovery-2800ddiv23 *surprised-by-love-formerly-understood-by-paramour-discovery-2800ddiv23*}
           
          {:ten-days-tribulation-unto-armageddon-ca-gathering-starts-2800ddiv23 *ten-days-tribulation-unto-armageddon-ca-gathering-starts-2800ddiv23*}
           
          {:ten-days-tribulation-unto-armageddon-finished-2800ddiv23 *ten-days-tribulation-unto-armageddon-finished-2800ddiv23*}
          
          {:ten-days-tribulation-eigen-diagonalized-for-seventy-weeks-system-proper-values2961ddiv23 *ten-days-tribulation-eigen-diagonalized-for-seventy-weeks-system-proper-values2961ddiv23*}
           
             '\


          'SEVENTY-WEEK-BURSTS-START

          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus147pt60-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus147pt60-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus19pt60-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus19pt60-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus18pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus18pt00-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus10pt39-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus10pt39-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus6pt668-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus6pt668-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-0pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-0pt00-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-6pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-6pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-10pt80-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-10pt80-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-12pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-12pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-13pt318-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-13pt318-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-14pt40-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-14pt40-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-18pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-18pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-24pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-24pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-25pt20-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-25pt20-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-25pt928-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-25pt928-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt00-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt718-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt718-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-29pt528-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-29pt528-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-31pt318-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-31pt318-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-31pt50-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-31pt50-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-32pt40-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-32pt40-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-33pt128-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-33pt128-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-33pt58-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-33pt58-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt00-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt10-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt10-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt918-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt918-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-35pt418-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-35pt418-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-36pt728-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-36pt728-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-37pt928-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-37pt928-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt128-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt128-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt347-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt347-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt518-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt518-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt362-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt362-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt60-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt60-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt88-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt88-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-40pt18-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-40pt18-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-42pt28-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-42pt28-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-50pt40-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-50pt40-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-52pt92-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-52pt92-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-56pt52-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-56pt52-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-60pt12-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-60pt12-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-63pt72-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-63pt72-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt32-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt32-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt48-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt48-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt68-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt68-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-70pt92-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-70pt92-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-72pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-72pt00-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-74pt52-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-74pt52-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-75pt60-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-75pt60-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-78pt12-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-78pt12-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-81pt72-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-81pt72-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-82pt80-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-82pt80-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-85pt32-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-85pt32-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-111pt60-of-ten-days-tribulation-7d  *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-111pt60-of-ten-days-tribulation-7d*}

          'SEVENTY-WEEK-BURSTS-END
          
          '\
           
          {:the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7 *the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7*}
           
              '\
           
           'THE-ABSTRACT-OF-PROJECTS-MEASUREMENTS-AND-DERIVATIONS-BEGIN
                     
          {:core-completion-matrix1-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d *core-completion-matrix1-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d*}

          {:core-completion-matrix2-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d *core-completion-matrix2-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d*}
           
          {:the-acc-abstract-of-projects-and-the-trial-ztp11640-a-minus-half-six-and-then-seventh-day-depiction-minus360d-not-in-standard-form2400d *the-acc-abstract-of-projects-and-the-trial-ztp11640-a-minus-half-six-and-then-seventh-day-depiction-minus360d-not-in-standard-form2400d*}
          
          {:the-acc-abstract-of-projects-and-the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-not-in-standard-form2400d *the-acc-abstract-of-projects-and-the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-not-in-standard-form2400d*}
           
          {:the-acc-abstract-of-projects-and-the-trial-ztp12360-a-minus-half-six-and-then-seventh-day-depiction-plus360d-not-in-standard-form2400d *the-acc-abstract-of-projects-and-the-trial-ztp12360-a-minus-half-six-and-then-seventh-day-depiction-plus360d-not-in-standard-form2400d*}
           
          {:dark-nignt-of-the-prophets-soul100d-ztp12000 *dark-nignt-of-the-prophets-soul100d-ztp12000*}
           
          {:dark-nignt-of-the-prophets-soul100d-ztp12052pt17 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}

          {:dark-nignt-of-the-prophets-soul100d-ztp12060 *dark-nignt-of-the-prophets-soul100d-ztp12060*}
           
           'THE-ABSTRACT-OF-PROJECTS-MEASUREMENTS-AND-DERIVATIONS-END
           
		     '\		  
            
		   'PROJECT-HYBRIDIZATION-DEVELOPMENT-PARAMETRIC-ETC-FIFTY-BANK-DOCS-ACC-DOC-DNPS-BEGIN

          {:ephesians221-building-yg *ephesians221-building-yg*}
       
        	 '\

          {:project-hybridization-development-parametric28yg-jennifer700ddiv6pt9 *project-hybridization-development-parametric28yg-jennifer700ddiv6pt9*}
                
			 '\
				
          {:project-hybridization-development-parametric40yg-maryann1000ddiv6pt9 *project-hybridization-development-parametric40yg-maryann1000ddiv6pt9*}
          
		  {:project-hybridization-development-parametric-nkechichiomaosoka40yj-taop1-internals1000ddiv7 *project-hybridization-development-parametric-nkechichiomaosoka40yj-taop1-internals1000ddiv7*}

          {:project-hybridization-development-parametric-nkechichiomaosoka40yj-taop2-internals1000ddiv7 *project-hybridization-development-parametric-nkechichiomaosoka40yj-taop2-internals1000ddiv7*}
                 
			 '\
				 
          {:project-hybridization-development-parametric40yg-obianuju1000ddiv6pt9 *project-hybridization-development-parametric40yg-obianuju1000ddiv6pt9*}
                 
			 '\
				 
          {:roundabout-aimee-magnified-proper2731ddiv18 *roundabout-aimee-magnified-proper2731ddiv18*}
          
		  'PROJECT-HYBRIDIZATION-DEVELOPMENT-PARAMETRIC-ETC-FIFTY-BANK-DOCS-ACC-DOC-DNPS-END          

		     '\

          {:babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w *babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w*}
            
          {:zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3*}
           
          {:zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3*}

             '\
           
          {:zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg *zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg*}

          {:zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg *zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg*}
           
              '\

          {:observe-i-am-getting-married-to-the-new-nigeria25ddiv9 *observe-i-am-getting-married-to-the-new-nigeria25ddiv9*}
           
              '\

          {:threeppnoah-global-turnaround-fullydeveloped250ddiv9 *threeppnoah-global-turnaround-fullydeveloped250ddiv9*}
           
              '\

          {:part1-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-before-25032pt8tnldy-360d *part1-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-before-25032pt8tnldy-360d*}

          {:part2-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-after-25032pt8tnldy-240d *part2-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-after-25032pt8tnldy-240d*}
           
              '\

          {:birth-of-the-fig-tree-minusoneeightzerozero-yj *birth-of-the-fig-tree-minusoneeightzerozero-yj*}

          {:birth-of-the-fig-tree-ztp-minus904tnldy-egypt-begins-amassing-troops-on-israels-borders-yj *birth-of-the-fig-tree-ztp-minus904tnldy-egypt-begins-amassing-troops-on-israels-borders-yj*}
           
          {:birth-of-the-fig-tree-ztp-minus898tnldy-egypt-closes-the-straits-of-tiran-yj *birth-of-the-fig-tree-ztp-minus898tnldy-egypt-closes-the-straits-of-tiran-yj*}
           
          {:birth-of-the-fig-tree-ztp-minus884tnldy-start-of-the-six-day-war-yj *birth-of-the-fig-tree-ztp-minus884tnldy-start-of-the-six-day-war-yj*}
           
          {:birth-of-the-fig-tree-ztp-minus879tnldy-end-of-the-six-day-war-yj *birth-of-the-fig-tree-ztp-minus879tnldy-end-of-the-six-day-war-yj*}

          {:birth-of-the-fig-tree-zero-yj *birth-of-the-fig-tree-zero-yj*}
          
          '\

          {:she-that-travaileth-and-bringeth-forth-the-fruits-of-the-kingdom-of-god-measured-from-ca-the-international-human-rights-declaration-against-slavery-at-the-congress-of-vienna-unto-etc-patrice-lumumba-at-ztp-ca-the-preminent-month-of-the-year-of-africa-360d *she-that-travaileth-and-bringeth-forth-the-fruits-of-the-kingdom-of-god-measured-from-ca-the-international-human-rights-declaration-against-slavery-at-the-congress-of-vienna-unto-etc-patrice-lumumba-at-ztp-ca-the-preminent-month-of-the-year-of-africa-360d*}
          
          {:she-that-travaileth-and-bringeth-forth-the-fruits-of-the-kingdom-of-god-measured-from-ca-the-international-human-rights-declaration-against-slavery-at-the-congress-of-vienna-unto-ztp-at-etc-nigeria-independence-360d *she-that-travaileth-and-bringeth-forth-the-fruits-of-the-kingdom-of-god-measured-from-ca-the-international-human-rights-declaration-against-slavery-at-the-congress-of-vienna-unto-ztp-at-etc-nigeria-independence-360d*}
          
          '\

          {:the-redemption-of-a-people-scattered-and-peeled-terrible-from-their-beginning-hitherto-101dys31div69 *the-redemption-of-a-people-scattered-and-peeled-terrible-from-their-beginning-hitherto-101dys31div69*}
           
              '\

          {:dnps-the-seven-and-thirteen-year-conversion12000ztp7500ddiv7 *dnps-the-seven-and-thirteen-year-conversion12000ztp7500ddiv7*}
           
          {:dnps-the-seven-and-thirteen-year-conversion12060ztp7500ddiv7 *dnps-the-seven-and-thirteen-year-conversion12060ztp7500ddiv7*}
           
              '\

          {:the-light-shines-in-the-darkness-but-the-darkness-comprehends-it-not10yg *the-light-shines-in-the-darkness-but-the-darkness-comprehends-it-not10yg*}
           
          {:the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-earliest-dnps-overlap-infiltration-100d *the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-earliest-dnps-overlap-infiltration-100d*}
           
          {:the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-latest-100d *the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-latest-100d*}
      
          {:the-first-jeroboam-yg *the-first-jeroboam-yg*}

          {:the-second-jeroboam-yg *the-second-jeroboam-yg*}
           
              '\

          {:a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg *a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg*}
           
              '\

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter-yg *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter-yg*}

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-yg *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-yg*}

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet-yg *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet-yg*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave-yg *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave-yg*}
           
              '\
           
          {:ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-cultivation100d *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-cultivation100d*}
           
          {:ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-harvest100d *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-harvest100d*}
           
          {:ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-end-harvest100d *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-end-harvest100d*}

              '\

          {:recuperation-and-shulamite-vindication-against-the-backdrop-of-the-gestation-of-the-dystopia-of-the-seventh-king-and-wwiii100ddiv7 *recuperation-and-shulamite-vindication-against-the-backdrop-of-the-gestation-of-the-dystopia-of-the-seventh-king-and-wwiii100ddiv7*}
           
          {:sdq-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-becomes-the-shulamite1000ddiv7 *sdq-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-becomes-the-shulamite1000ddiv7*}
           
        '\
     
     'ELEVEN-CURTAINS-OF-THE-TEMPLE-THE-JEW-FIRST-AND-ALSO-THE-GENTILE-ETC-THE-SHULAMMITE-START
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-minus18pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-minus18pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-minus18pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-minus18pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-0pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-0pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-0pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-0pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-18pt29-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-18pt29-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-18pt29-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-18pt29-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-18pt39-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-18pt39-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-18pt39-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-18pt39-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-21pt91-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-21pt91-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-21pt91-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-21pt91-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-34pt918-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-34pt918-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-34pt918-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-34pt918-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-35pt418-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-35pt418-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-35pt418-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-35pt418-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-37pt928-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-37pt928-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-37pt928-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-37pt928-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-38pt347-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-38pt347-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-38pt347-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-38pt347-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-39pt88-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-39pt88-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-39pt88-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-39pt88-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-40pt18-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-40pt18-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-40pt18-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-40pt18-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-42pt28-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-42pt28-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-42pt28-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-42pt28-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     'ELEVEN-CURTAINS-OF-THE-TEMPLE-THE-JEW-FIRST-AND-ALSO-THE-GENTILE-ETC-THE-SHULAMMITE-END
     
        '\


           'BE-YE-NOT-THE-SERVANTS-OF-MEN-1CORINTHIANS-CHAPTER7-VERSE23B-START
          {:unn-job-offered-100d *unn-job-offered-100d*}
          {:unn-job-accepted-100d *unn-job-accepted-100d*}
              '\
          {:unn-job-offered-700div6pt9d *unn-job-offered-700div6pt9d*}
          {:unn-job-accepted-700div6pt9d *unn-job-accepted-700div6pt9d*}
              '\
          {:unn-job-offered-yj *unn-job-offered-yj*}
          {:unn-job-accepted-yj *unn-job-accepted-yj*}
              '\
          {:unn-job-offered-yg *unn-job-offered-yg*}
          {:unn-job-accepted-yg *unn-job-accepted-yg*}
           'BE-YE-NOT-THE-SERVANTS-OF-MEN-1CORINTHIANS-CHAPTER7-VERSE23B-END

              '\

          {:ca-time-of-the-enoch-type-rapture7d *ca-time-of-the-enoch-type-rapture7d*}
           
          {:a-rapture-occurs-circa-here100d *a-rapture-occurs-circa-here100d*}

              '\

          {:fifty-bank-documents-end-armageddon-40yg-view-nene-maryann-ijioma-ztp11820-yg *fifty-bank-documents-end-armageddon-40yg-view-nene-maryann-ijioma-ztp11820-yg*}

          {:acc-document-begin-cleanse-after-armageddon-40yg-view-nene-maryann-ijioma-ztp11850-yg *acc-document-begin-cleanse-after-armageddon-40yg-view-nene-maryann-ijioma-ztp11850-yg*}

              '\


          {:dnps-begin-cleanse1-40yj-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj *dnps-begin-cleanse1-40yj-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj*}
           
          {:dnps-begin-cleanse2-40yj-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj *dnps-begin-cleanse2-40yj-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj*}
           
              '\

          {:dnps-end-cleanse1-40yg-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg *dnps-end-cleanse1-40yg-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg*}
           
          {:dnps-end-cleanse2-40yg-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg *dnps-end-cleanse2-40yg-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg*}
           
              '\
           
          {:tnl-1000d *tnl-1000d*}
           
          {:tnl-yj *tnl-yj*}
           
          {:tnl-yg *tnl-yg*}
           
              '\
           
          {:z-tnldy-clock3 @z-tnldy-clock3}
           
           (l/local-now)
           
          {:imputation-of-sin-via-the-law-given-by-moses-against-the-transgression-of-those-angels-followed-by-the-grace-and-truth-of-jesus-christ-unto-the-seventh-angel-trumpet-sound-daysi-synchronization-100yg *imputation-of-sin-via-the-law-given-by-moses-against-the-transgression-of-those-angels-followed-by-the-grace-and-truth-of-jesus-christ-unto-the-seventh-angel-trumpet-sound-daysi-synchronization-100yg*}
           
          {:days-i *days-i*}
           
              '\

          {:cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}
           
           
                     

] )


(println (mdqnm-execution-of-selected-sfos [
   
              '\
                                   
          {:cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}

              '\                        
                                   
          {:global-calc-zero-three-x-sfo-bbs-sparse-embedded-function-call "(*this-function-can-recreate-any-onedimensional-sfo-and-expects-coefficientforyvalue-and-ztp* COEFF4Y Ztp)" }

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
          
          {:after-israel-comes-up-out-of-egypt-and-elders-overlive-joshua-at-ztp-ca-m1236496tnldy-unto-2nd-advent-of-the-lord-jesus-christ-36000d *after-israel-comes-up-out-of-egypt-and-elders-overlive-joshua-at-ztp-ca-m1236496tnldy-unto-2nd-advent-of-the-lord-jesus-christ-36000d*}
           
              '\
           
          {:christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-jesus36000d*}
           
          {:christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d *christ-jesus-the-lord-the-everlasting-father-is-the-king-of-the-holy-family-cjtl-tef-itk-othf-paul36000d*}
           
              '\
           
          {:saved-by-christ-jesus-100d *saved-by-christ-jesus-100d*}
           
          {:saved-and50yj-lock-to-the-vision-yj   *saved-and50yj-lock-to-the-vision-yj*} 

          {:countdown-from-the-twenty-fourth-yj-unto-the-vision360d *countdown-from-the-twenty-fourth-yj-unto-the-vision360d*}
           
          
             '\
		 
          {:what-withholdeth-bw-ca-18pt50-and-25pt20-the-mystery-of-iniquity-and-that-number-is-embedded-in-this-sfo36d *what-withholdeth-bw-ca-18pt50-and-25pt20-the-mystery-of-iniquity-and-that-number-is-embedded-in-this-sfo36d*}

             '\
		  

      'FOUR-PROPER-EIGEN-EQUATIONS-START
       {:eleven-curtains-of-the-shulammite-dark-night-of-the-prophets-soul-dnps-the-jew-first-eigen-proper-1700ddiv7 *eleven-curtains-of-the-shulammite-dark-night-of-the-prophets-soul-dnps-the-jew-first-eigen-proper-1700ddiv7*}
       {:eleven-curtains-of-the-shulammite-dark-night-of-the-prophets-soul-dnps-and-also-the-gentile-eigen-proper-16900ddiv69 *eleven-curtains-of-the-shulammite-dark-night-of-the-prophets-soul-dnps-and-also-the-gentile-eigen-proper-16900ddiv69*}
       {:revelation-of-the-trial-revott-eigen-proper-equation-200d *revelation-of-the-trial-revott-eigen-proper-equation-200d*}
       {:ten-days-tribulation-10dt-eigen-proper-equation-2961ddiv23 *ten-days-tribulation-10dt-eigen-proper-equation-2961ddiv23*}
      'FOUR-PROPER-EIGEN-EQUATIONS-END
      
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
		   
              '\
          
		  'CONCLUSION-OF-BUILDING-THE-HOUSE-OF-THE-LORD-SEVEN-YEARS-START
		  {:deliverance0-ztp16571pt8-went-forth-conquering-and-to-conquer-yj *deliverance0-ztp16571pt8-went-forth-conquering-and-to-conquer-yj*}
          
		  {:deliverance1-ztp16680-iron-yj *deliverance1-ztp16680-iron-yj*}
          
		  {:deliverance2-ztp16709-birth-of-jesus-christ-yj *deliverance2-ztp16709-birth-of-jesus-christ-yj*}
          
		  {:deliverance3-ztp16716pt52-jesus-christ-is-well-on-about-the-business-of-his-father-yj *deliverance3-ztp16716pt52-jesus-christ-is-well-on-about-the-business-of-his-father-yj*}
          
		  {:deliverance4-ztp16719-at-calvary-the-world-is-delivered-of-a-manchild-destined-to-rule-all-nations-with-a-rod-of-iron-yj *deliverance4-ztp16719-at-calvary-the-world-is-delivered-of-a-manchild-destined-to-rule-all-nations-with-a-rod-of-iron-yj*}
		  'CONCLUSION-OF-BUILDING-THE-HOUSE-OF-THE-LORD-SEVEN-YEARS-END
		  
			  '\

          {:a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-enter-yj*}
           
          {:a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj *a-time-of-trouble-the-tribulation-of-those-days-thou-art-my-battleaxe-leave-yj*}
           
		       '\
			   
		  'CONCLUSION-OF-BUILDING-MY-OWN-HOUSE-THIRTEEN-YEARS-START	
          {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-preamble-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-preamble-yj*}
		  
		  {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-enter-yj*}
           
          {:on-the-money1-pleading-against-the-kingdom-of-darkness-yj *on-the-money1-pleading-against-the-kingdom-of-darkness-yj*}
           
          {:on-the-money2-pleading-against-the-kingdom-of-darkness-yj *on-the-money2-pleading-against-the-kingdom-of-darkness-yj*}
          
          {:judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj *judgment1-pleading-against-the-host-of-the-kingdom-of-darkness-leave-yj*}
          'CONCLUSION-OF-BUILDING-MY-OWN-HOUSE-THIRTEEN-YEARS-END
		  
		       '\ 
			   
		  'CONCLUSION-OF-PREVAILING-AGAINST-HAMATH-ZOBAH-START 
          {:judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj *judgment2-unto-hamonah-and-the-valley-of-hamongog-enter-yj*}
           
          {:judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj *judgment2-unto-hamonah-and-the-valley-of-hamongog-leave-yj*}
          'CONCLUSION-OF-PREVAILING-AGAINST-HAMATH-ZOBAH-END
		  
		       '\  
			   
		  'CONCLUSION-OF-EVEN-UNTO-THREE-AND-TWENTY-YEARS-START
		  {:judgment3-even-unto-three-and-twenty-years-gogid-ztp-at-22440tnldy-yj *judgment3-even-unto-three-and-twenty-years-gogid-ztp-at-22440tnldy-yj*}
		  
		  {:judgment3-even-unto-three-and-twenty-years-circumspection-ztp-at-22692tnldy-yj *judgment3-even-unto-three-and-twenty-years-circumspection-ztp-at-22692tnldy-yj*}
		  'CONCLUSION-OF-EVEN-UNTO-THREE-AND-TWENTY-YEARS-END
		  
		       '\
		  
		  'A-FOCUS-ON-RECKONINGS-OF-ONE-AND-TWENTY-YEARSJ-EVEN-UNTO-THREE-AND-TWENTY-YEARSJ-ENDS-HERE
           
              '\
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter360d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter360d*}

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss360d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss360d*}

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet360d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet360d*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave360d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave360d*}
           
              '\
           
          {:a-holy-firstborn-from-the-matrix-reckoning-from-abraham-yg *a-holy-firstborn-from-the-matrix-reckoning-from-abraham-yg*}

          {:a-holy-firstborn-from-the-matrix-reckoning-from-isaac-yg *a-holy-firstborn-from-the-matrix-reckoning-from-isaac-yg*}

          {:a-holy-firstborn-from-the-matrix-reckoning-from-jacob-yg *a-holy-firstborn-from-the-matrix-reckoning-from-jacob-yg*}
           
              '\

          {:days-i *days-i*}

          {:cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23 *cleansing-ca-virgin-mary-tnldy18242-dob-all-the-land-with-all-judgment2800ddiv23*}
           
          {:cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23 *cleansing-ca-jesus-christ-tnldy18286-dob-all-the-land-with-all-judgment2800ddiv23*}

              '\
 
          {:kristallnacht-to-begincleanseafterarmageddon-31028one-month-pattern-daysi-28000ddiv23 *kristallnacht-to-begincleanseafterarmageddon-31028one-month-pattern-daysi-28000ddiv23*}
           
              '\

          {:seventh-king-uses-the-key-of-thermonuclear-war-to-open-the-bottomless-pit-and-let-out-the-ten-horns-mystery-babylon-a-raiser-of-taxes-the-eighth-king-etc-35d *seventh-king-uses-the-key-of-thermonuclear-war-to-open-the-bottomless-pit-and-let-out-the-ten-horns-mystery-babylon-a-raiser-of-taxes-the-eighth-king-etc-35d*}
           
          {:countdown-in-days-to-the-end-at-ztp-of-the-russian-government-of-the-overt-seventh-king-1d *countdown-in-days-to-the-end-at-ztp-of-the-russian-government-of-the-overt-seventh-king-1d*}
          
          {:the-seventy-weeks-of-the-seventh-king-7d *the-seventy-weeks-of-the-seventh-king-7d*}

          {:multiple-detonations-and-destructions-at-great-babylon-viscerally-shock-many-generational-slaves-and-servants-into-emancipation-from-among-the-chaos-attendant-at-her-destruction-360d *multiple-detonations-and-destructions-at-great-babylon-viscerally-shock-many-generational-slaves-and-servants-into-emancipation-from-among-the-chaos-attendant-at-her-destruction-360d*}

                   
              '\
           
          {:napoleon-entering3500d *napoleon-entering3500d*}

          {:kings-leaving3500d *kings-leaving3500d*}
           
          {:the-symbolic-synodic-period-of-venus-a-time-of-the-gentiles-as-read-from-kings-leaving3500d-and-containing-the-seventy-weeks-of-daniel350d *the-symbolic-synodic-period-of-venus-a-time-of-the-gentiles-as-read-from-kings-leaving3500d-and-containing-the-seventy-weeks-of-daniel350d*}
           
              '\

          {:usa-sit-10yg *usa-sit-10yg*}
           
          {:usa-dem-rev-sit-on-brit-emp-70000ddiv69 *usa-dem-rev-sit-on-brit-emp-70000ddiv69*}
           
          {:countdown0-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d *countdown0-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           
          {:countdown1-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d *countdown1-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           
          {:countdown2-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d *countdown2-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}
           
          {:countdown3-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d *countdown3-in-days-to-the-end-at-ztp-of-the-usa-government-of-babylon-the-great-1d*}

              '\ 
           
          {:from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yj*}
           
          {:from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg *from-the-expulsion-of-rev-henry-townsend-etc-first-missionary-to-abeokuta-ca1867-unto-justification-is-the-pathway-to-the-new-nation-for-those-burdened-with-this-nigeria-isaiah18-yg*}
           
              '\                       
           
           'DIGEST-REVOTT-SFOs-WITH-ABSOLUTE-AND-RELATIVE-POSITIONS-SHOWN-BEGIN
           
          {:shulam-she-that-is-of-me-the-new-nigeria100d-named-because-of-sfobbminus13pt32-and-whose-ztp-is-s2minus28pt80-on-revott *shulam-she-that-is-of-me-the-new-nigeria100d-named-because-of-sfobbminus13pt32-and-whose-ztp-is-s2minus28pt80-on-revott*}
           
          {:dark-nignt-of-the-prophets-soul100d-named-because-of-sfobbzero-and-whose-ztp-is-s2minus21pt07-on-revott *dark-nignt-of-the-prophets-soul100d-named-because-of-sfobbzero-and-whose-ztp-is-s2minus21pt07-on-revott*}
           
          {:sealed-a-slave-forever-in-the-unlimited-company-the-omega-project100d-because-of-sfobbminus18pt00-and-whose-ztp-is-s2minus18pt00-on-revott *sealed-a-slave-forever-in-the-unlimited-company-the-omega-project100d-because-of-sfobbminus18pt00-and-whose-ztp-is-s2minus18pt00-on-revott*}
           
          {:born-of-the-flesh-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-0pt00-on-revott *born-of-the-flesh-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-0pt00-on-revott*}
           
          {:born-of-the-flesh-leave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-6pt00-on-revott *born-of-the-flesh-leave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-6pt00-on-revott*}
           
          {:cfh-rapturing-through-family-friends-acquaintances-etc-ffae-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-23pt71-on-revott *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-enter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-23pt71-on-revott*}
           
          {:cfh-rapturing-through-family-friends-acquaintances-etc-ffae100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-24pt897-on-revott *cfh-rapturing-through-family-friends-acquaintances-etc-ffae100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-24pt897-on-revott*}
           
          {:cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leaveone100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt20-on-revott *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leaveone100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt20-on-revott*}
           
          {:cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leavetwo100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt56-on-revott *cfh-rapturing-through-family-friends-acquaintances-etc-ffae-leavetwo100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-25pt56-on-revott*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealenter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-45pt718-on-revott *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealenter100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-45pt718-on-revott*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-trumpet100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-47pt528-on-revott *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-trumpet100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-47pt528-on-revott*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealleave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-49pt318-on-revott *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-hemboss-sealleave100d-because-of-sfobb0pt00-and-whose-ztp-is-s2-49pt318-on-revott*}
           
          {:the-purpose-of-all-things-is-at-hand-ie-birth100d-because-of-sfobbzero-and-whose-ztp-is-s2-82pt80-on-revott *the-purpose-of-all-things-is-at-hand-ie-birth100d-because-of-sfobbzero-and-whose-ztp-is-s2-82pt80-on-revott*}
           
          {:the-purpose-of-all-things-is-at-hand-ie-circumspection100d-because-of-sfobbzero-and-whose-ztp-is-s2-85pt32-on-revott *the-purpose-of-all-things-is-at-hand-ie-circumspection100d-because-of-sfobbzero-and-whose-ztp-is-s2-85pt32-on-revott*}
           
           'DIGEST-REVOTT-SFOs-WITH-ABSOLUTE-AND-RELATIVE-POSITIONS-SHOWN-END
           
              '\
           
          {:shulam-she-that-is-of-me-the-new-nation-determined-and-globally-resonant-emancipation-signal-in-the-time-lockdown-boundary-of-enoch-between-is-and-is-to-come100d *shulam-she-that-is-of-me-the-new-nation-determined-and-globally-resonant-emancipation-signal-in-the-time-lockdown-boundary-of-enoch-between-is-and-is-to-come100d*}
           
              '\
                      
           'THE-SHULAMMITE-SINGULARITY-IMMANENT-IN-NIGERIA-START 
           
          {:sixty-nine-week-paramour-discovery-optimum1-boundary7d *sixty-nine-week-paramour-discovery-optimum1-boundary7d*}

          {:sixty-nine-week-paramour-discovery-optimum2-boundary7d *sixty-nine-week-paramour-discovery-optimum2-boundary7d*}
         
          {:the-intelligent-defence-body-and-the-five-terawatt-project-ie-the-elusive-sixty-nine-week-singularity-manifestation-after-the-fact-of-a-metonic-cycle7d *the-intelligent-defence-body-and-the-five-terawatt-project-ie-the-elusive-sixty-nine-week-singularity-manifestation-after-the-fact-of-a-metonic-cycle7d*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-forty-days-prior-cfhthruhembossztpentry *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-forty-days-prior-cfhthruhembossztpentry*}

          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpdesignpoint0 *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpdesignpoint0*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-present-at-olokoro-for-the-loving-celebration-of-life-and-interrment-of-albert-onyenuloya-uhiara-cfhthruhembossztp18794pt8div10setting0 *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-present-at-olokoro-for-the-loving-celebration-of-life-and-interrment-of-albert-onyenuloya-uhiara-cfhthruhembossztp18794pt8div10setting0*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-barebones-darkly-through-a-glass-prerecord-of-facebook-ruminations-on-the-order-for-the-rise-of-the-7th-king-cfhthruhembossztp18827pt81div115setting1 *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-barebones-darkly-through-a-glass-prerecord-of-facebook-ruminations-on-the-order-for-the-rise-of-the-7th-king-cfhthruhembossztp18827pt81div115setting1*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpdesignpoint1 *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpdesignpoint1*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpexit *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-cfhthruhembossztpexit*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-twenty-days-after-and-for-a-total-180day-ztp-interval-cfhthruhembossztpposteriorexit *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity7d-on-paper-twenty-days-after-and-for-a-total-180day-ztp-interval-cfhthruhembossztpposteriorexit*}
           
          {:tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity-predestination-unto-the-immanence-in-nigeria7d *tss-the-five-terawatt-project-and-the-intelligent-defence-body5tw-tidb-the-elusive-sixty-nine-week-singularity-predestination-unto-the-immanence-in-nigeria7d*}

          {:ca-time-of-the-enoch-type-rapture7d *ca-time-of-the-enoch-type-rapture7d*}
           
          {:the-shulammite-singularity-manifestation-of-the-mystery-the-immanence-in-nigeria-count-is-in-reverse7d *the-shulammite-singularity-manifestation-of-the-mystery-the-immanence-in-nigeria-count-is-in-reverse7d*}
           
           'THE-SHULAMMITE-SINGULARITY-IMMANENT-IN-NIGERIA-END
           
              '\
           
          {:a-rapture-occurs-circa-here100d *a-rapture-occurs-circa-here100d*}
           
              '\

          {:acc-5tw-tidb-tac-blackwhole-ztp11940-dnps1000d *acc-5tw-tidb-tac-blackwhole-ztp11940-dnps1000d*}
           
          {:acc-5tw-tidb-tac-blackwhole-ztp12000-dnps1000d *acc-5tw-tidb-tac-blackwhole-ztp12000-dnps1000d*}
           
          {:acc-5tw-tidb-tac-blackwhole-ztp12060-dnps1000d *acc-5tw-tidb-tac-blackwhole-ztp12060-dnps1000d*}
           
      '\
        
      'GOGID-M2333PT3333-UNTO-GOGID-ZTP-BEGIN
     {:commence-save-ueo-at-all-cost-ca-70-week-death-march-m2420-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *commence-save-ueo-at-all-cost-ca-70-week-death-march-m2420-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
     {:commence-save-ueo-at-all-cost-ca-70-week-death-march-ztp11740 *commence-save-ueo-at-all-cost-ca-70-week-death-march-ztp11740*}
      
     '\
      
     {:alien-corridor-creation-m2333pt3333-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *alien-corridor-creation-m2333pt3333-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
     {:alien-corridor-creation100d-ztp11826pt6667 *alien-corridor-creation100d-ztp11826pt6667*}
     
      '\

      {:dark-night1-m2160-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *dark-night1-m2160-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:dark-nignt-of-the-prophets-soul100d-ztp12000 *dark-nignt-of-the-prophets-soul100d-ztp12000*}

      '\

      {:dark-night2-m2107-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *dark-night2-m2107-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:dark-nignt-of-the-prophets-soul100d-ztp12052pt17 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}

      '\

      {:dark-night3-m2100-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *dark-night3-m2100-gogid-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:dark-nignt-of-the-prophets-soul100d-ztp12060 *dark-nignt-of-the-prophets-soul100d-ztp12060*}

      '\

      {:ebe-city-complex-m1960-gogid-end1-seventh-king-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *ebe-city-complex-m1960-gogid-end1-seventh-king-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:ebe-city-complex100d-ztp12200 *ebe-city-complex100d-ztp12200*}

      '\

      {:ebe-city-complex-m1908-gogid-end2-seventh-king-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *ebe-city-complex-m1908-gogid-end2-seventh-king-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:ebe-city-complex100d-ztp12252 *ebe-city-complex100d-ztp12252*}

      '\

      {:the-main-strain-shulammite-lineage-of-grace-through-faith-m1800-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-main-strain-shulammite-lineage-of-grace-through-faith-m1800-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-main-strain-shulammite-lineage-of-grace-through-faith-threeppnoah-omega-project-ideation-implies-arthur-george-consolidated-holdings-sealed-a-slave-forever-in-the-unlimited-company-etc-aimee-mungovan-zkpcdp-over-gogid100d *the-main-strain-shulammite-lineage-of-grace-through-faith-threeppnoah-omega-project-ideation-implies-arthur-george-consolidated-holdings-sealed-a-slave-forever-in-the-unlimited-company-etc-aimee-mungovan-zkpcdp-over-gogid100d*}

      '\

      {:ca-peak-m1710-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *ca-peak-m1710-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:ca-peak-m1710-of-the-raiser-of-taxes-in-the-glory-of-the-kingdom100d *ca-peak-m1710-of-the-raiser-of-taxes-in-the-glory-of-the-kingdom100d*}
      
      '\

      {:within-few-days-m1656-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *within-few-days-m1656-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:within-few-days-m1656-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d *within-few-days-m1656-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}

      '\

      {:within-few-days-m1640-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *within-few-days-m1640-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:within-few-days-m1640-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d *within-few-days-m1640-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}

      '\

      {:within-few-days-m1600-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *within-few-days-m1600-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:within-few-days-m1600-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d *within-few-days-m1600-raiser-of-taxes-is-destroyed-not-in-battle-nor-in-anger100d*}

      '\

      {:if-the-universe1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *if-the-universe1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset1-of-dispensation-one100d*}

      '\

      {:if-the-universe2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *if-the-universe2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset2star-of-dispensation-one100d*}

      '\

      {:if-the-universe3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *if-the-universe3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset3-of-dispensation-one100d*}

      '\

      {:if-the-universe4-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *if-the-universe4-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d *if-the-universe-is-the-answer-what-is-the-question-is-answered-by-the-god-particle-unto-onset4star-of-dispensation-one100d*}

      '\

      {:having-subdued-three-kings-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *having-subdued-three-kings-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d *having-subdued-three-kings-covenantprinceinc-requirement-to-rule-ie-mystery-babylon-sits-on-gog100d*}

      '\

      {:yea-and-the-prince-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *yea-and-the-prince-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:yea-and-the-prince-of-the-covenant-also100d *yea-and-the-prince-of-the-covenant-also100d*}

      '\

      {:and-after-the-league-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-after-the-league-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-after-the-league-made-with-him-he-shall-work-deceitfully100d *and-after-the-league-made-with-him-he-shall-work-deceitfully100d*}

      '\

      {:for-he-shall-come-up-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *for-he-shall-come-up-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:for-he-shall-come-up100d *for-he-shall-come-up100d*}

      '\

      {:and-become-strong-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-become-strong-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-become-strong-with-a-small-people100d *and-become-strong-with-a-small-people100d*}

      '\

      {:born-of-the-flesh-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *born-of-the-flesh-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}
      'GOGID-M2333PT3333-UNTO-GOGID-ZTP-END

      '\

      'GOGID-ZTP-UNTO-THE-SEVENTH-SEAL-BEGIN
      {:born-of-the-flesh-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *born-of-the-flesh-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d *born-of-the-flesh-is-the-revelation-of-the-trial-revott-absolute-zero100d*}

      '\

      {:and-shall-forecast1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-shall-forecast1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-start100d*}

      '\

      {:and-shall-forecast2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-shall-forecast2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d *and-shall-forecast-his-devices-against-the-strongholds-even-for-a-time-finish100d*}

      '\

      {:and-his-army-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-his-army-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-his-army-shall-overflow100d *and-his-army-shall-overflow100d*}

      '\

      {:and-many-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-many-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-many-shall-fall-down-slain100d *and-many-shall-fall-down-slain100d*}

      '\

      {:and-his-heart-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-his-heart-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d *and-his-heart-shall-be-against-the-holy-covenant-and-he-shall-do-exploits100d*}

      '\

      {:the-ships-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-ships-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-ships-of-chittim-shall-come-against-him100d *the-ships-of-chittim-shall-come-against-him100d*}

      '\

      {:foundation1-1080days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *foundation1-1080days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:foundation1-1080days-100d *foundation1-1080days-100d*}
 
      '\

      {:and-arms-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-arms-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-arms-shall-stand-on-his-part100d *and-arms-shall-stand-on-his-part100d*}

      '\

      {:he-shall-confirm-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-confirm-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-confirm-the-covenant-with-many-for-one-week-start100d *he-shall-confirm-the-covenant-with-many-for-one-week-start100d*}

      '\

      {:and-they-shall-pollute-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-they-shall-pollute-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-they-shall-pollute-the-sanctuary-of-strength100d *and-they-shall-pollute-the-sanctuary-of-strength100d*}

      '\

      {:and-shall-take-away-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-shall-take-away-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-shall-take-away-the-daily-sacrifice100d *and-shall-take-away-the-daily-sacrifice100d*}

      '\

      {:and-they-shall-place-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *and-they-shall-place-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:and-they-shall-place-the-abomination-that-makes-desolate100d *and-they-shall-place-the-abomination-that-makes-desolate100d*}

      '\

      {:seventh-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seventh-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d *seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d*}
     'GOGID-ZTP-UNTO-THE-SEVENTH-SEAL-END

      '\

     'SEVENTH-SEAL-UNTO-THE-END-OF-ALL-THE-IMMEDIATE-OUTCOMES-OF-THE-BATTLE-OF-ARMAGEDDON-BEGIN
      
      {:seventh-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seventh-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d *seventh-seal-half-hour-of-silence-as144000-are-sealed-before-overwhelming-rebukes-on-gog-and-his-hordes-commence100d*}

      '\

      {:foundation2-1440days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *foundation2-1440days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:foundation2-1440days-100d *foundation2-1440days-100d*}

      '\

      {:first-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *first-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d *first-trumpet-hail-fire-mingled-with-blood-cast-upon-earth100d*}

      '\

      {:one-of-the-seals-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *one-of-the-seals-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d *one-of-the-seals-a-white-horse-and-its-rider-going-forth-conquering100d*}

      '\

      {:manchild-born-christmas-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *manchild-born-christmas-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:manchild-born-christmas-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d *manchild-born-christmas-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d*}

      '\

      {:manchild-born-easter-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *manchild-born-easter-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:manchild-born-easter-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d *manchild-born-easter-sun-and-moon-clothed-woman-flees-great-wrath-of-red-dragon-as-devil-comes-to-earth100d*}

      '\

      {:false-prophet0-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *false-prophet0-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:false-prophet-another-beast-coming-up-out-of-the-earth-100d *false-prophet-another-beast-coming-up-out-of-the-earth-100d*}
       
      '\

      {:second-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *second-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d *second-trumpet-a-great-mountain-burning-with-fire-is-cast-into-the-sea100d*}

      '\

      {:second-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *second-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d *second-seal-a-red-horse-a-rider-a-great-sword-to-take-peace-from-earth100d*}

      '\

      {:third-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *third-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d *third-trumpet-a-great-star-called-wormwood-falls-from-heaven-burning-as-a-lamp-waters-made-bitter100d*}

      '\

      {:mystery-babylon-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *mystery-babylon-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d *mystery-babylon-is-revealed-to-be-the-vampire-system-that-propagates-itself-by-drinking-the-saints-blood-while-gog-becomes-the-lycan-of-the-abyss-ie-an-end-of-pure-destruction-heading-to-perdition-which-she-sits-on-ie-controls-a-lethal-unsustainable-mix-ergo-the-10horns100d*}

      '\

      {:gog-ascending-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *gog-ascending-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d *gog-ascending-to-power-on-the-dragons-throne-as-a-cloud-to-cover-the-land100d*}

      '\

      {:third-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *third-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d *third-seal-a-black-horse-and-rider-a-pair-of-balances-in-his-hand-hurt-not-the-oil100d*}

      '\

      {:babylon-is-fallen-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *babylon-is-fallen-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d *babylon-is-fallen-is-fallen-start-of-2300days-unto-the-cleansing-of-the-sanctuary100d*}

      '\

      {:he-shall-confirm2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-confirm2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-confirm-the-covenant-with-many-for-one-week-midst100d *he-shall-confirm-the-covenant-with-many-for-one-week-midst100d*}

      '\

      {:the-court-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-court-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-court-that-is-without-begin100d *the-court-that-is-without-begin100d*}

      '\

      {:one-of-gogs-heads-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *one-of-gogs-heads-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:one-of-gogs-heads-is-wounded-unto-death100d *one-of-gogs-heads-is-wounded-unto-death100d*}

      '\

      {:after-gogs-deadly-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *after-gogs-deadly-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d *after-gogs-deadly-wound-is-healed-he-is-completely-empowered-and-the-ten-horns-hate-mystery-babylon100d*}

      '\

      {:false-prophet1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *false-prophet1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:false-prophet-that-they-should-make-an-image-to-the-beast-100d *false-prophet-that-they-should-make-an-image-to-the-beast-100d*}

      '\

      {:a-rapture-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *a-rapture-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:a-rapture-occurs-circa-here100d *a-rapture-occurs-circa-here100d*}

      '\

      {:false-prophet2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *false-prophet2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:false-prophet-had-power-to-give-life-unto-the-image-of-the-beast-100d *false-prophet-had-power-to-give-life-unto-the-image-of-the-beast-100d*}

      '\

      {:false-prophet3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *false-prophet3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:false-prophet-causeth-all-to-receive-a-mark-in-their-right-hand-or-in-their-foreheads-100d *false-prophet-causeth-all-to-receive-a-mark-in-their-right-hand-or-in-their-foreheads-100d*}

      '\
	  
	  {:the-temple-2520days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-temple-2520days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-temple-2520days-100d *the-temple-2520days-100d*}
	  
	  '\

      {:fourth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fourth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d *fourth-trumpet-a-third-part-of-the-sun-moon-and-stars-are-smitten100d*}

      '\

      {:the-ten-horns-completely-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-ten-horns-completely-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-start100d*}

      '\

      {:the-ten-horns-completely2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-ten-horns-completely2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-finish100d*}

      '\

      {:the-court2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-court2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d *the-ten-horns-completely-burn-the-flesh-of-mystery-babylon-with-fire-the-court-that-is-without-end100d*}

      '\

      {:fourth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fourth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d *fourth-seal-a-pale-horse-and-rider-death-and-hell-followed-with-him100d*}

      '\

      {:the-two-prophets1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-two-prophets1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-two-prophets-the-lampstands-commence-testimony100d *the-two-prophets-the-lampstands-commence-testimony100d*}

      '\

      {:fifth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fifth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d *fifth-trumpet-a-star-falls-from-heaven-to-earth-and-opens-bottomless-pit-with-key100d*}

      '\

      {:abaddon-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *abaddon-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:abaddon-apollyon100d *abaddon-apollyon100d*}

      '\

      {:end-of-five-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-five-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d *end-of-five-months-of-abaddon-apollyon-and-the-host-of-the-bottomless-pit100d*}

      '\

      {:fifth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fifth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d *fifth-seal-under-the-altar-the-souls-of-those-slain-for-the-word-of-god100d*}

      '\

      {:but-tidings-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *but-tidings-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d *but-tidings-out-of-the-east-and-out-of-the-north-shall-trouble-him100d*}

      '\

      {:he-shall-plant1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-plant1-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-start100d*}
    
      '\
    
      {:he-shall-plant2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-plant2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d *he-shall-plant-the-tabernacles-of-his-palace-between-the-seas-in-the-glorious-holy-mountain-finish100d*}

      '\
    
      {:sixth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *sixth-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d *sixth-trumpet-the-four-angels-bound-in-the-great-river-euphrates-are-loosed100d*}

      '\
    
      {:sixth-seal-zero-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *sixth-seal-zero-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:sixth-seal-zero-100d *sixth-seal-zero-100d*}

      '\
    
      {:sixth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *sixth-seal-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d *sixth-seal-the-vision-the-great-day-of-his-wrath-is-come-who-can-stand-exe-tpdp-end-of-day1-of-making-wedding100d*}

      '\
    
      {:another-mighty-angel-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *another-mighty-angel-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d *another-mighty-angel-clothed-with-a-cloud-and-a-rainbow-upon-his-head-and-his-face-as-it-were-the-sun-his-feet-as-pillars-of-fire-end-of-day49-of-making-wedding100d*}

      '\
    
      {:the-lamb-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-lamb-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-lamb-overcoming-the-ten-horns100d *the-lamb-overcoming-the-ten-horns100d*}

      '\
    
      {:the-two-prophets2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-two-prophets2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-two-prophets-the-lampstands-war-with-the-beast-start100d *the-two-prophets-the-lampstands-war-with-the-beast-start100d*}

      '\
    
      {:the-two-prophets3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-two-prophets3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-two-prophets-the-lampstands-war-with-the-beast-finish100d *the-two-prophets-the-lampstands-war-with-the-beast-finish100d*}

      '\
    
      {:the-two-prophets4-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-two-prophets4-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-two-prophets-the-lampstands-war-with-the-beast-end100d *the-two-prophets-the-lampstands-war-with-the-beast-end100d*}

      '\
    
      {:seventh-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seventh-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d *seventh-trumpet-begins-to-sound-first-vial-a-noisome-grievous-sore-on-those-with-mark-of-beast100d*}

      '\
    
      {:second-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *second-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d *second-vial-the-sea-becomes-as-the-blood-of-a-dead-human-being100d*}

      '\
    
      {:he-shall-confirm3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *he-shall-confirm3-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:he-shall-confirm-the-covenant-with-many-for-one-week-finish100d *he-shall-confirm-the-covenant-with-many-for-one-week-finish100d*}

      '\
    
      {:third-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *third-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:third-vial-the-rivers-and-fountains-of-waters-become-blood100d *third-vial-the-rivers-and-fountains-of-waters-become-blood100d*}

      '\
    
      {:fourth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fourth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d *fourth-vial-upon-the-sun-to-scorch-humans-with-fire100d*}

      '\
    
      {:fifth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *fifth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d *fifth-vial-on-seat-of-beast-his-kingdom-is-full-of-darkness100d*}

      '\
    
      {:sixth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *sixth-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d *sixth-vial-great-river-euphrates-dries-up-to-prepare-way-of-kings-of-east100d*}

      '\
    
      {:seventh-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seventh-vial-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d *seventh-vial-into-the-air-a-great-voice-out-of-the-temple-of-heaven-it-is-done-end-of-day301-of-making-wedding-and-his-wife-has-made-herself-ready-begin100d*}

      '\
    
      {:the-end-of-the-vial-judgments-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-end-of-the-vial-judgments-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-end-of-the-vial-judgments100d *the-end-of-the-vial-judgments100d*}

      '\
    
      {:in-remembrance-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *in-remembrance-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d *in-remembrance-great-babylon-is-given-cup-of-wine-of-fierceness-of-gods-wrath100d*}

      '\
    
      {:the-end-of-the-seal-judgments-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-end-of-the-seal-judgments-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-end-of-the-seal-judgments *the-end-of-the-seal-judgments*}

      '\
    
      {:end-of-day479-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-day479-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d *end-of-day479-of-making-wedding-and-his-wife-has-made-herself-ready-end100d*}

      '\
    
      {:end-of-day483-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-day483-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d *end-of-day483-marriage-supper-of-the-lamb-begin-fine-linen-clean-and-white-ie-the-righteousness-of-the-saints-was-granted-to-her100d*}

      '\
    
      {:end-of-day490-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-day490-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-day490-marriage-supper-of-the-lamb-end100d *end-of-day490-marriage-supper-of-the-lamb-end100d*}

      '\
    
      {:the-light-of-the-sun-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-light-of-the-sun-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-start100d*}

      '\
    
      {:the-light-of-the-sun2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *the-light-of-the-sun2-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d *the-light-of-the-sun-is-sevenfold-as-gog-taken-at-armageddon-finish100d*}

      '\
    
      {:end-of-the-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-the-trumpet-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d *end-of-the-trumpet-judgments-then-shall-the-sanctuary-be-cleansed-seven-months-onset100d*}

      '\
    
      {:seven-year-cleansing-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *seven-year-cleansing-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d *seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-start100d*}
      
      '\

      {:my-own-house-4680days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *my-own-house-4680days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:my-own-house-4680days-100d *my-own-house-4680days-100d*}

      '\
	  
      {:judgment-turns-in-favour-of-the-broken-stones-5561pt-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *judgment-turns-in-favour-of-the-broken-stones-5561pt-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5561pt *judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5561pt*}

      '\

      {:judgment-turns-in-favour-of-the-broken-stones-5587-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *judgment-turns-in-favour-of-the-broken-stones-5587-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5587 *judgment-turns-in-favour-of-the-broken-stones-set-at-naught-by-that-number-and-by-that-troop100d-revott-s2-at-5587*}
      
      '\
    
      {:end-of-seven-year-cleansing-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *end-of-seven-year-cleansing-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d *threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d*}

      '\
       
      'I-SUBDUED-THEY-WITHSTOOD-AND-I-REMAINED-START
      {:at-the-end-of-twenty-years-7200days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *at-the-end-of-twenty-years-7200days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:at-the-end-of-twenty-years-7200days-100d *at-the-end-of-twenty-years-7200days-100d*}
 
      '\
 
      {:withstood-me-one-and-twenty-7560days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *withstood-me-one-and-twenty-7560days-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:withstood-me-one-and-twenty-7560days-100d *withstood-me-one-and-twenty-7560days-100d*}

      '\

      {:lives-of-the-rest-of-the-beasts-prolonged-a-season-and-a-time-7669days-their-end-is-literally-fulfilled-here-higgaion-selah-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *lives-of-the-rest-of-the-beasts-prolonged-a-season-and-a-time-7669days-their-end-is-literally-fulfilled-here-higgaion-selah-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:lives-of-the-rest-of-the-beasts-prolonged-a-season-and-a-time-7669days-their-end-is-literally-fulfilled-here-higgaion-selah-100d *lives-of-the-rest-of-the-beasts-prolonged-a-season-and-a-time-7669days-their-end-is-literally-fulfilled-here-higgaion-selah-100d*}

      '\
   
      {:revott-purpose-of-all-things-is-at-hand-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *revott-purpose-of-all-things-is-at-hand-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d *revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d*}
           
      '\

      {:again-born-ie-born-of-the-spirit-circumspection-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d *again-born-ie-born-of-the-spirit-circumspection-etc-with-bb-82pt80-ie-on-gogid-placed-as-ztp-100d*}
      {:again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d *again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d*}
      'I-SUBDUED-THEY-WITHSTOOD-AND-I-REMAINED-END
      
      'SEVENTH-SEAL-UNTO-THE-END-OF-ALL-THE-IMMEDIATE-OUTCOMES-OF-THE-BATTLE-OF-ARMAGEDDON-END

      '\
                                
          {:general-and-state-examination-of-common-phenomena-effluent-from-the-shulammite-singularity-culminating-in-the-gogid100d-feast-of-tabernacles100d *general-and-state-examination-of-common-phenomena-effluent-from-the-shulammite-singularity-culminating-in-the-gogid100d-feast-of-tabernacles100d*}
           
          {:the-egspp-creature-sets-off-into-the-world-and-finds-its-purpose100d *the-egspp-creature-sets-off-into-the-world-and-finds-its-purpose100d*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter100d*}

              '\
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting0-100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting0-100d*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting1-100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-setting1-100d*}
           
              '\

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet100d*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave100d *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave100d*}
                                
          {:judgment1-shall-begin-at-the-house-of-god-100d *judgment1-shall-begin-at-the-house-of-god-100d*}
           
          {:judgment2-shall-begin-at-the-house-of-god-100d *judgment2-shall-begin-at-the-house-of-god-100d*}
           
          {:the-work-of-god-is-tried-with-fire100d *the-work-of-god-is-tried-with-fire100d*}
                                
          {:the-robin-hood-protocol-ahz-ahi-100d *the-robin-hood-protocol-ahz-ahi-100d*}
           
              '\
                     
          {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-enter*}

          {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d*}

          {:the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave *the-destroyer-of-the-gentiles-is-on-his-way-to-perdition100d-leave*}
          
          {:make-to-yourselves-friends-of-the-mammon-of-unrighteousness-that-when-ye-fail-they-may-receive-you-into-everlasting-habitations-ztp-at-wild-sweet-potato-forage-with-chimdi-and-honest-inverter-negotiation-with-chira100d *make-to-yourselves-friends-of-the-mammon-of-unrighteousness-that-when-ye-fail-they-may-receive-you-into-everlasting-habitations-ztp-at-wild-sweet-potato-forage-with-chimdi-and-honest-inverter-negotiation-with-chira100d*}
           
              '\
            
          {:revott-s2-14pt955-360d-implies-ztp-at-5tw-lawrence-livermore-lab-nuclear-fusion-breakthrough-implies-jephthahs-awful-sacrifice-of-daughter-100d *revott-s2-14pt955-360d-implies-ztp-at-5tw-lawrence-livermore-lab-nuclear-fusion-breakthrough-implies-jephthahs-awful-sacrifice-of-daughter-100d*}
           
          {:revott-s2-15pt341-360d-implies-ztp-at-definitively-linking-the-success-of-noah-atdf-to-fall-of-7th-and-8th-kings-implies-1st-year-of-king-david-reign-100d *revott-s2-15pt341-360d-implies-ztp-at-definitively-linking-the-success-of-noah-atdf-to-fall-of-7th-and-8th-kings-implies-1st-year-of-king-david-reign-100d*}           
           
          {:revott-s2-15pt367-360d-implies-ztp-at-20231007-realtime-50th-yom-kippur-anniversary-attack-on-israel-by-hamas-implies-beginnings-of-king-david-reign-in-jerusalem-100d *revott-s2-15pt367-360d-implies-ztp-at-20231007-realtime-50th-yom-kippur-anniversary-attack-on-israel-by-hamas-implies-beginnings-of-king-david-reign-in-jerusalem-100d*}
           
          {:revott-s2-15pt449-360d-implies-ztp-at-54pt00-tnlyg-ygbday-castigliano-failure-singularity-implies-1st-year-coreign-david-and-solomon-100d *revott-s2-15pt449-360d-implies-ztp-at-54pt00-tnlyg-ygbday-castigliano-failure-singularity-implies-1st-year-coreign-david-and-solomon-100d*}
                    
           'HSotP-RoP-LRR-FINISH-IMPLIES-TRIAL-AND-THE-JUDGMENT-IN-THE-LORDS-MONEY-HEBREWS7-VERSE25-HE-IS-ABLE-ALSO-TO-SAVE-THEM-TO-THE-UTTERMOST-AND-INCLUDES-A-SLACK-OF-CA120DAYS-OR4MONTHS-IMPLYING-THE-HARVEST-IS-NOW
           
              '\

          'HSotP-RoP-LRR-BEGIN-IMPLIES-THE-END-OF-ALL-THINGS-AND-THE-DARK-CLOUD-THAT-IS-GOG
           
          {:the-numbering-of-the-5587days-of-gog-in-power-on-the-earth100d *the-numbering-of-the-5587days-of-gog-in-power-on-the-earth100d*}
           
          {:threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d *threeppnoah-idea-adoption-and-implementation-culminates-with-the-end-of-seven-year-cleansing-of-all-the-land-ie-the-zkp-of-cfh-ie-finish100d*}
    
          {:threeppnoah-idea-adoption-and-implementation-two100d *threeppnoah-idea-adoption-and-implementation-two100d*}
           
          {:threeppnoah-idea-adoption-and-implementation-three100d *threeppnoah-idea-adoption-and-implementation-three100d*}
           
          {:revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d *revelation-of-the-trial-revott-at-the-end-ie-purpose-of-all-things-is-at-hand-ie-at-birth100d*}
           
          {:again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d *again-born-ie-born-of-the-spirit-is-the-end-ie-purpose-of-all-things-circumspection100d*}
           
          {:the-power-of-the-manchild-100d *the-power-of-the-manchild-100d*}
           
           'HSotP-RoP-LRR-FINISH-IMPLIES-THE-END-OF-ALL-THINGS-AND-THE-DARK-CLOUD-THAT-IS-GOG
           
              '\

          {:revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d *revelation-of-the-trial-expanded-revotte-ie-proper-ie-eigen-diagonalization-metric200d*}
           
              '\
           
          {:ten-days-tribulation2800ddiv23 *ten-days-tribulation2800ddiv23*}
          
          {:surprised-by-love-formerly-understood-by-paramour-discovery-2800ddiv23 *surprised-by-love-formerly-understood-by-paramour-discovery-2800ddiv23*}
          
          {:ten-days-tribulation-unto-armageddon-ca-gathering-starts-2800ddiv23 *ten-days-tribulation-unto-armageddon-ca-gathering-starts-2800ddiv23*}
           
          {:ten-days-tribulation-unto-armageddon-finished-2800ddiv23 *ten-days-tribulation-unto-armageddon-finished-2800ddiv23*}
          
          {:ten-days-tribulation-eigen-diagonalized-for-seventy-weeks-system-proper-values2961ddiv23 *ten-days-tribulation-eigen-diagonalized-for-seventy-weeks-system-proper-values2961ddiv23*}          
          
             '\
           
          'SEVENTY-WEEK-BURSTS-START   
          
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus147pt60-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus147pt60-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus19pt60-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus19pt60-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus18pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus18pt00-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus10pt39-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus10pt39-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus6pt668-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-minus6pt668-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-0pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-0pt00-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-6pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-6pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-10pt80-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-10pt80-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-12pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-12pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-13pt318-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-13pt318-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-14pt40-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-14pt40-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-18pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-18pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-24pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-24pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-25pt20-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-25pt20-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-25pt928-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-25pt928-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt00-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt41-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt41-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt718-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-27pt718-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-29pt528-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-29pt528-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-31pt318-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-31pt318-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-31pt50-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-31pt50-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-32pt40-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-32pt40-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-33pt128-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-33pt128-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-33pt58-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-33pt58-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt00-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt10-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt10-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt918-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-34pt918-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-35pt418-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-35pt418-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-36pt728-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-36pt728-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-37pt928-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-37pt928-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt128-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt128-of-ten-days-tribulation-7d*}
        {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt347-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt347-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt518-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-38pt518-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt362-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt362-of-ten-days-tribulation-7d*}
       {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt60-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt60-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt88-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-39pt88-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-40pt18-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-40pt18-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-42pt28-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-42pt28-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-50pt40-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-50pt40-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-52pt92-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-52pt92-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-56pt52-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-56pt52-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-60pt12-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-60pt12-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-63pt72-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-63pt72-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt32-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt32-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt48-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt48-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt68-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-67pt68-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-70pt92-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-70pt92-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-72pt00-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-72pt00-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-74pt52-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-74pt52-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-75pt60-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-75pt60-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-78pt12-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-78pt12-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-81pt72-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-81pt72-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-82pt80-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-82pt80-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-85pt32-of-ten-days-tribulation-7d *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-85pt32-of-ten-days-tribulation-7d*}
          {:seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-111pt60-of-ten-days-tribulation-7d  *seventy-weeks-of-range-minus19pt60-to-75pt60-is-at-111pt60-of-ten-days-tribulation-7d*}

          'SEVENTY-WEEK-BURSTS-END
          
              '\

           
          {:the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7 *the-shulammite-sdq-global-dedicated-to-juliet-koji-iwu-jki-ie-proper-ie-eigen-diagonalization-metric1700ddiv7*}
           
              '\
           
           'THE-ABSTRACT-OF-PROJECTS-MEASUREMENTS-AND-DERIVATIONS-BEGIN
                     
          {:core-completion-matrix1-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d *core-completion-matrix1-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d*}

          {:core-completion-matrix2-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d *core-completion-matrix2-wherein-the-creature-of-the-alien-corridor-cleanses-his-way-and-knowledge-is-increased-whilst-iron-reacts-at-singular-heat-with-miry-clay240d*}
           
          {:the-acc-abstract-of-projects-and-the-trial-ztp11640-a-minus-half-six-and-then-seventh-day-depiction-minus360d-not-in-standard-form2400d *the-acc-abstract-of-projects-and-the-trial-ztp11640-a-minus-half-six-and-then-seventh-day-depiction-minus360d-not-in-standard-form2400d*}
          
          {:the-acc-abstract-of-projects-and-the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-not-in-standard-form2400d *the-acc-abstract-of-projects-and-the-trial-ztp12000-a-minus-half-six-and-then-seventh-day-depiction-not-in-standard-form2400d*}
           
          {:the-acc-abstract-of-projects-and-the-trial-ztp12360-a-minus-half-six-and-then-seventh-day-depiction-plus360d-not-in-standard-form2400d *the-acc-abstract-of-projects-and-the-trial-ztp12360-a-minus-half-six-and-then-seventh-day-depiction-plus360d-not-in-standard-form2400d*}
           
          {:dark-nignt-of-the-prophets-soul100d-ztp12000 *dark-nignt-of-the-prophets-soul100d-ztp12000*}
           
          {:dark-nignt-of-the-prophets-soul100d-ztp12052pt17 *dark-nignt-of-the-prophets-soul100d-ztp12052pt17*}

          {:dark-nignt-of-the-prophets-soul100d-ztp12060 *dark-nignt-of-the-prophets-soul100d-ztp12060*}
           
           'THE-ABSTRACT-OF-PROJECTS-MEASUREMENTS-AND-DERIVATIONS-END
           
		     '\		  
            
		   'PROJECT-HYBRIDIZATION-DEVELOPMENT-PARAMETRIC-ETC-FIFTY-BANK-DOCS-ACC-DOC-DNPS-BEGIN

          {:ephesians221-building-yg *ephesians221-building-yg*}
       
        	 '\

          {:project-hybridization-development-parametric28yg-jennifer700ddiv6pt9 *project-hybridization-development-parametric28yg-jennifer700ddiv6pt9*}
                
			 '\
				
          {:project-hybridization-development-parametric40yg-maryann1000ddiv6pt9 *project-hybridization-development-parametric40yg-maryann1000ddiv6pt9*}
          
		  {:project-hybridization-development-parametric-nkechichiomaosoka40yj-taop1-internals1000ddiv7 *project-hybridization-development-parametric-nkechichiomaosoka40yj-taop1-internals1000ddiv7*}

          {:project-hybridization-development-parametric-nkechichiomaosoka40yj-taop2-internals1000ddiv7 *project-hybridization-development-parametric-nkechichiomaosoka40yj-taop2-internals1000ddiv7*}
                 
			 '\
				 
          {:project-hybridization-development-parametric40yg-obianuju1000ddiv6pt9 *project-hybridization-development-parametric40yg-obianuju1000ddiv6pt9*}
                 
			 '\
				 
          {:roundabout-aimee-magnified-proper2731ddiv18 *roundabout-aimee-magnified-proper2731ddiv18*}
          
		  'PROJECT-HYBRIDIZATION-DEVELOPMENT-PARAMETRIC-ETC-FIFTY-BANK-DOCS-ACC-DOC-DNPS-END          

		     '\

          {:babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w *babylon-the-great-emergence-and-rise-and-fall-ztsuhiacuudztp1-stwo82pt80-w*}
            
          {:zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp1-eigenfunction35280ddiv48pt3*}
           
          {:zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3 *zero-trade-salvation-universe-absolute-centralization-unto-utter-decentralization-ztp2-eigenfunction35280ddiv48pt3*}

             '\
           
          {:zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg *zero-trade-salvation-from-ca-under-the-buttonwood-tree--to-euronext-nyse-etal-yg*}

          {:zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg *zero-trade-salvation-from-ca-tontine-coffee-shop--to-euronext-nyse-etal-yg*}
           
              '\

          {:observe-i-am-getting-married-to-the-new-nigeria25ddiv9 *observe-i-am-getting-married-to-the-new-nigeria25ddiv9*}
           
              '\

          {:threeppnoah-global-turnaround-fullydeveloped250ddiv9 *threeppnoah-global-turnaround-fullydeveloped250ddiv9*}
           
              '\

          {:part1-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-before-25032pt8tnldy-360d *part1-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-before-25032pt8tnldy-360d*}

          {:part2-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-after-25032pt8tnldy-240d *part2-embryo-genesis-seedling-plant-photosynthesis-egspp-perspective-of-growth-of-christ-in-me-documenting-my-disconnection-from-these-streets-forever-the-count-of-which-is-effective-after-25032pt8tnldy-240d*}
           
              '\

          {:birth-of-the-fig-tree-minusoneeightzerozero-yj *birth-of-the-fig-tree-minusoneeightzerozero-yj*}

          {:birth-of-the-fig-tree-ztp-minus904tnldy-egypt-begins-amassing-troops-on-israels-borders-yj *birth-of-the-fig-tree-ztp-minus904tnldy-egypt-begins-amassing-troops-on-israels-borders-yj*}
           
          {:birth-of-the-fig-tree-ztp-minus898tnldy-egypt-closes-the-straits-of-tiran-yj *birth-of-the-fig-tree-ztp-minus898tnldy-egypt-closes-the-straits-of-tiran-yj*}
           
          {:birth-of-the-fig-tree-ztp-minus884tnldy-start-of-the-six-day-war-yj *birth-of-the-fig-tree-ztp-minus884tnldy-start-of-the-six-day-war-yj*}
           
          {:birth-of-the-fig-tree-ztp-minus879tnldy-end-of-the-six-day-war-yj *birth-of-the-fig-tree-ztp-minus879tnldy-end-of-the-six-day-war-yj*}

          {:birth-of-the-fig-tree-zero-yj *birth-of-the-fig-tree-zero-yj*}
          
              '\

          {:she-that-travaileth-and-bringeth-forth-the-fruits-of-the-kingdom-of-god-measured-from-ca-the-international-human-rights-declaration-against-slavery-at-the-congress-of-vienna-unto-etc-patrice-lumumba-at-ztp-ca-the-preminent-month-of-the-year-of-africa-360d *she-that-travaileth-and-bringeth-forth-the-fruits-of-the-kingdom-of-god-measured-from-ca-the-international-human-rights-declaration-against-slavery-at-the-congress-of-vienna-unto-etc-patrice-lumumba-at-ztp-ca-the-preminent-month-of-the-year-of-africa-360d*}
          
          {:she-that-travaileth-and-bringeth-forth-the-fruits-of-the-kingdom-of-god-measured-from-ca-the-international-human-rights-declaration-against-slavery-at-the-congress-of-vienna-unto-ztp-at-etc-nigeria-independence-360d *she-that-travaileth-and-bringeth-forth-the-fruits-of-the-kingdom-of-god-measured-from-ca-the-international-human-rights-declaration-against-slavery-at-the-congress-of-vienna-unto-ztp-at-etc-nigeria-independence-360d*}
           
              '\

          {:the-redemption-of-a-people-scattered-and-peeled-terrible-from-their-beginning-hitherto-101dys31div69 *the-redemption-of-a-people-scattered-and-peeled-terrible-from-their-beginning-hitherto-101dys31div69*}
           
              '\

          {:dnps-the-seven-and-thirteen-year-conversion12000ztp7500ddiv7 *dnps-the-seven-and-thirteen-year-conversion12000ztp7500ddiv7*}
           
          {:dnps-the-seven-and-thirteen-year-conversion12060ztp7500ddiv7 *dnps-the-seven-and-thirteen-year-conversion12060ztp7500ddiv7*}
           
              '\

          {:the-light-shines-in-the-darkness-but-the-darkness-comprehends-it-not10yg *the-light-shines-in-the-darkness-but-the-darkness-comprehends-it-not10yg*}
           
          {:the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-earliest-dnps-overlap-infiltration-100d *the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-earliest-dnps-overlap-infiltration-100d*}
           
          {:the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-latest-100d *the-mystery-of-iniquity-they-shall-mingle-themselves-with-the-seed-of-men-latest-100d*}
      
          {:the-first-jeroboam-yg *the-first-jeroboam-yg*}

          {:the-second-jeroboam-yg *the-second-jeroboam-yg*}
           
              '\

          {:a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg *a-simple-count-of-years-of-the-creature-born-of-the-dnps-tacc-unto-he-begins-to-be-thirty-as-was-supposed-yg*}
           
              '\

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter-yg *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealenter-yg*}

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-yg *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-yg*}

          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet-yg *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-trumpet-yg*}
           
          {:cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave-yg *cfh-flowing-through-the-creature-which-god-has-made-strong-for-himself-heavily-encrypted-machine-biometric-system-s-hemboss-sealleave-yg*}
           
              '\
           
          {:ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-cultivation100d *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-cultivation100d*}
           
          {:ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-harvest100d *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-begin-harvest100d*}
           
          {:ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-end-harvest100d *ephesians613-fulfillment-withstand-in-the-evil-day-and-having-done-all-to-stand-means-the-lords-money-in-context-of-the-shula-manifests-even-thru-the-mammon-line-end-harvest100d*}

              '\

          {:recuperation-and-shulamite-vindication-against-the-backdrop-of-the-gestation-of-the-dystopia-of-the-seventh-king-and-wwiii100ddiv7 *recuperation-and-shulamite-vindication-against-the-backdrop-of-the-gestation-of-the-dystopia-of-the-seventh-king-and-wwiii100ddiv7*}
           
          {:sdq-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-becomes-the-shulamite1000ddiv7 *sdq-philippians212b13-fulfilled-in-sos-ie-work-out-your-own-salvation-becomes-the-shulamite1000ddiv7*}
           
        '\
     
     'ELEVEN-CURTAINS-OF-THE-TEMPLE-THE-JEW-FIRST-AND-ALSO-THE-GENTILE-ETC-THE-SHULAMMITE-START
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-minus18pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-minus18pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-minus18pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-minus18pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-0pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-0pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-0pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-0pt00-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-18pt29-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-18pt29-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-18pt29-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-18pt29-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-18pt39-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-18pt39-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-18pt39-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-18pt39-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-21pt91-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-21pt91-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-21pt91-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-21pt91-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-34pt918-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-34pt918-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-34pt918-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-34pt918-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-35pt418-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-35pt418-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-35pt418-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-35pt418-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-37pt928-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-37pt928-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-37pt928-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-37pt928-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-38pt347-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-38pt347-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-38pt347-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-38pt347-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-39pt88-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-39pt88-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-39pt88-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-39pt88-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-40pt18-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-40pt18-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-40pt18-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-40pt18-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     
        {:eleven-curtains-the-jew-first-at-w-equals-42pt28-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7 *eleven-curtains-the-jew-first-at-w-equals-42pt28-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv7*}
        {:eleven-curtains-and-also-the-gentile-at-w-equals-42pt28-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9 *eleven-curtains-and-also-the-gentile-at-w-equals-42pt28-which-is-one-to-one-with-value-on-gogiddot100d-1000ddiv6pt9*}
     
        '\
     'ELEVEN-CURTAINS-OF-THE-TEMPLE-THE-JEW-FIRST-AND-ALSO-THE-GENTILE-ETC-THE-SHULAMMITE-END
     
        '\


           'BE-YE-NOT-THE-SERVANTS-OF-MEN-1CORINTHIANS-CHAPTER7-VERSE23B-START
          {:unn-job-offered-100d *unn-job-offered-100d*}
          {:unn-job-accepted-100d *unn-job-accepted-100d*}
              '\
          {:unn-job-offered-700div6pt9d *unn-job-offered-700div6pt9d*}
          {:unn-job-accepted-700div6pt9d *unn-job-accepted-700div6pt9d*}

              '\
          {:unn-job-offered-yj *unn-job-offered-yj*}
          {:unn-job-accepted-yj *unn-job-accepted-yj*}
              '\
          {:unn-job-offered-yg *unn-job-offered-yg*}
          {:unn-job-accepted-yg *unn-job-accepted-yg*}
           'BE-YE-NOT-THE-SERVANTS-OF-MEN-1CORINTHIANS-CHAPTER7-VERSE23B-END

              '\

          {:ca-time-of-the-enoch-type-rapture7d *ca-time-of-the-enoch-type-rapture7d*}
           
          {:a-rapture-occurs-circa-here100d *a-rapture-occurs-circa-here100d*}

              '\

          {:fifty-bank-documents-end-armageddon-40yg-view-nene-maryann-ijioma-ztp11820-yg *fifty-bank-documents-end-armageddon-40yg-view-nene-maryann-ijioma-ztp11820-yg*}

          {:acc-document-begin-cleanse-after-armageddon-40yg-view-nene-maryann-ijioma-ztp11850-yg *acc-document-begin-cleanse-after-armageddon-40yg-view-nene-maryann-ijioma-ztp11850-yg*}

              '\
			  
          {:dnps-begin-cleanse1-40yj-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj *dnps-begin-cleanse1-40yj-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj*}
           
          {:dnps-begin-cleanse2-40yj-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj *dnps-begin-cleanse2-40yj-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yj*}
           
              '\

          {:dnps-end-cleanse1-40yg-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg *dnps-end-cleanse1-40yg-view-ztp12052-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg*}
           
          {:dnps-end-cleanse2-40yg-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg *dnps-end-cleanse2-40yg-view-ztp12060-what-overflowing-army-is-overcoming-the-inordinacy-in-me-and-establishing-the-new-creature-in-the-end-times-yg*}
           
              '\
           
          {:tnl-1000d *tnl-1000d*}
           
          {:tnl-yj *tnl-yj*}
           
          {:tnl-yg *tnl-yg*}
           
              '\
           
          {:z-tnldy-clock3 @z-tnldy-clock3}
           
           (l/local-now)
           
          {:imputation-of-sin-via-the-law-given-by-moses-against-the-transgression-of-those-angels-followed-by-the-grace-and-truth-of-jesus-christ-unto-the-seventh-angel-trumpet-sound-daysi-synchronization-100yg *imputation-of-sin-via-the-law-given-by-moses-against-the-transgression-of-those-angels-followed-by-the-grace-and-truth-of-jesus-christ-unto-the-seventh-angel-trumpet-sound-daysi-synchronization-100yg*}
           
          {:days-i *days-i*}
           
              '\

          {:cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal *cognitive-radio-frequency-tuner-for-the-exec-tpdp-hertz-pulsar-signal*}
           
      
] 
))