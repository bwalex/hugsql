(defproject org.clojars.bwalex/hugsql "0.4.9"
  :description "A Clojure library for embracing SQL"
  :url "https://github.org.clojars.bwalex/hugsql"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :scm {:name "HugSQL"
        :url "https://github.org.clojars.bwalex/hugsql"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojars.bwalex/hugsql-core "0.4.9"]
                 [org.clojars.bwalex/hugsql-adapter-clojure-java-jdbc "0.4.9"]]
  :aliases {"install-all" ["do" ["sub" "install"] "install"]}
  :profiles {:dev
             {:plugins [[lein-codox "0.10.3"]
                        [lein-sub "0.3.0"]]
              :sub ["hugsql-adapter"
                    "hugsql-core"
                    "hugsql-adapter-clojure-java-jdbc"
                    "hugsql-adapter-clojure-jdbc"]
              :dependencies [[org.clojars.bwalex/hugsql-adapter-clojure-jdbc "0.4.9"]]
              :codox {:source-uri "http://github.org.clojars.bwalex/hugsql/blob/0.4.9/{filepath}#L{line}"
                      :output-path "../gh-pages"
                      :source-paths ["hugsql-core/src"
                                     "hugsql-adapter/src"
                                     "hugsql-adapter-clojure-java-jdbc/src"
                                     "hugsql-adapter-clojure-jdbc/src"]}
              :global-vars {*warn-on-reflection* false
                            *assert* false}}})
