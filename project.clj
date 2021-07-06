(defproject hello-world "0.1.0-SNAPSHOT"
  :description "clojure学习"
  :url "https://github.com/mylinlan/lein.git"
  :jvm-opts ["-Dfile.encoding=utf-8"]
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring-core "1.5.0"]
                 [org.clojure/java.jdbc "0.7.12"]                                   ; basic JDBC access from Clojure
                 [ring/ring-jetty-adapter "1.5.0"]
                 [mysql/mysql-connector-java "5.1.47"]
                 [toucan "1.15.3" :exclusions [org.clojure/java.jdbc]]]
  :repl-options {:init-ns hello-world.core})
