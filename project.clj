(defproject hello "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [quil "2.2.6"]
                 [org.clojure/clojurescript "1.7.170"]]

  :plugins [[lein-cljsbuild "1.1.1-SNAPSHOT"]
            [lein-figwheel "0.5.0-SNAPSHOT"]]
  :hooks [leiningen.cljsbuild]

  :cljsbuild
  {:builds [{:source-paths ["src"]
              :figwheel true
             :compiler
             {:output-to "resources/public/js/main.js"
              :output-dir "resources/public/js/out"
              :asset-path "js/out"
              :main "hello.core"
              :optimizations :none
              :pretty-print true}}]})
