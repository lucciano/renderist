;;heroku config:add  JVM_OPTS

(defproject renderist "0.0.1"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/core.memoize "0.5.2"]
                 [ring/ring-core "1.1.1"]
                 [ring-server "0.2.5"]
                 [compojure "1.1.1"]
                 [ring-json-response "0.2.0"]
                 [net.sourceforge.plantuml/plantuml "7941"]
                 [markdown-clj "0.9.8"]
                 [clj-time "0.4.4"]
                 [tentacles "0.2.0-beta1"]
                 [enlive "1.0.1"]
                 [ring-mock "0.1.3"]]
  :profiles {
    :dev {
      :dependencies [[clj-ns-browser "1.3.0"]]
    }
    :production {
      :mirrors {
        #"central|clojars" "http://s3pository.herokuapp.com/clojure"
      }
    }
  }
  :min-lein-version "2.0.0")
