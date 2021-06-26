(ns hello-world.core)

(defn handle [request]
  {:status 200
   :headers {"Content-Type" "Text/html"}
   :body "Hello, word"})