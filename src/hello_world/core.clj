(ns hello-world.core)

(defn handler []
  {:status 200
   :headers {"Content-Type" "Text/html"}
   :body "Hello, word"})

(def a {:a "a" :b "b" :c {:d 2}})
(println a)
(def c (assoc-in a [:c :d] 3))
(println c)