(defproject clj-spotify "0.1.10"
  :description "A client library for the Spotify Web API"
  :url "https://github.com/blmstrm/clj-spotify"
  :license {:name "The MIT License (MIT)"
            :url  "http://opensource.org/licenses/MIT"}
  :plugins [[lein-cloverage "1.2.1"]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [cheshire "5.13.0"]
                 [clj-http "3.13.0"]]
  :profiles {
             :dev {
                   :source-paths ["dev-resources"]
                   :dependencies [[org.clojure/tools.namespace "1.0.0"]
                                  [loudmoauth "0.1.3"]
                                  [ring "1.8.2"]
                                  [org.clojure/tools.nrepl "0.2.13"]]}})

