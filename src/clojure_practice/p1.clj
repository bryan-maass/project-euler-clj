(ns clojure-practice.core)

; p1
(apply + (filter #(or (zero? (mod % 5))(zero? (mod % 3)))(range 1000)))

