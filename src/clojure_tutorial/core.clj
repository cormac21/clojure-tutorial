(ns clojure-tutorial.core
  (:gen-class))

(defn -main [& args]
  (println "Welcome to my project! These are your args:" args))

(defn calculate-percent-discount [base discount]
  (let [total-discount (* base discount)]
    (if (> total-discount base)
      0.0
      (- base total-discount))))
