(ns hello-world.test)

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