(defproject ib-re-actor "0.1.10"
  :description "Clojure friendly wrapper for InteractiveBrokers java API"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-time "0.13.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [clj-logging-config "1.9.12"]]
  :profiles {:dev {:dependencies [[twsapi "9.71.01"]
                                  [midje "1.8.3"]]
                   :plugins [[lein-midje "3.2.1"]
                             [lein-localrepo "0.5.3"]
                             [com.gfredericks/how-to-ns "0.1.6"]]
                   :how-to-ns {:require-docstring? false}}})
