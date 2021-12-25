(ns clojure-tutorial.core-test
  (:require
    [clojure.test :refer :all]
    [clojure-tutorial.core :refer :all]))

(deftest core-tests
  (testing "First clojure test ever"
    (is (= 75.00 (calculate-percent-discount 100.00 1/4))))
  (testing "Calculates with ratio"
    (is (= 66.66666666666667 (calculate-percent-discount 100.00 1/3))))
  (testing "Calculates something"
    (is (= 67.00 (calculate-percent-discount 100.00 0.33))))
  (testing "Cannot be more than 0 if the discount is greater than 100%")
    (is (= 0.0 (calculate-percent-discount 25.0 1.1))))
