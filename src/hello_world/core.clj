(ns hello-world.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "Text/html"}
   :body "Hello, word"})