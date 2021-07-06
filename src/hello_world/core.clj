(ns hello-world.core
    (:require [clojure.java.jdbc :as j]))
(require '[toucan.db :as db])

(def db-map {:classname   "com.mysql.jdbc.Driver"
             :subprotocol "mysql"
             :subname     "//192.168.20.123:3306/zxd_sjbs?useUnicode=true&characterEncoding=utf-8"
             :user        "root"
             :password  "root123"})

(db/set-default-db-connection!
    db-map)

(defn query []
    (j/query db-map ["SELECT * FROM sys_user"]))


(defn handler []
  {:status 200
   :headers {"Content-Type" "Text/html"}
   :body "Hello, word"})

(def a {:a "a" :b "b" :c {:d 2}})
(println a)
(def c (assoc-in a [:c :d] 3))
(println c)

;-> macro
(println "-> 宏")
(-> "a b c d"
    .toUpperCase
    (.replace "A" "X")
    (.split " ")
    first
    println)