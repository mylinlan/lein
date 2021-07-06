(ns hello-world.core
    (:require [clojure.java.jdbc :as j]
              [toucan.db :as db]
              [toucan.models :as models]))

(def db-map {:classname   "com.mysql.jdbc.Driver"
             :subprotocol "mysql"
             :subname     "//192.168.20.123:3306/zxd_sjbs?useUnicode=true&characterEncoding=utf-8"
             :user        "root"
             :password  "root123"})

(db/set-default-db-connection!
    db-map)

;; 非常重要 见 https://github.com/metabase/toucan/blob/master/docs/setup.md#configuring-quoting-style
(db/set-default-quoting-style! :mysql)

(models/defmodel User :sys_user)

(defn query []
    (j/query db-map ["SELECT * FROM sys_user"]))


(defn handler []
  {:status 200
   :headers {"Content-Type" "Text/html"}
   :body "Hello, word"})