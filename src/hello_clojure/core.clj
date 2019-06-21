(ns hello-clojure.core)

(defn somar
  "Vai somar"
  [a b]
  (+ a b))

(defn foo
  "Ponto de entrada"
  [a b]
  (println (somar (Integer/parseInt a) (Integer/parseInt b))))