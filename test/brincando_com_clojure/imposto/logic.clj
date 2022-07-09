(ns brincando-com-clojure.imposto.logic
  (:require [clojure.test :refer :all]
            [brincando-com-clojure.imposto.logic :as logic]))

(deftest imposto-retido-deve-ser-0-test
  (testing "imposto retido deve ser 0 quando for menor que 1000"
    (let [num 900]
      (is
        (= 0 (logic/calcular-imposto num))))))


(deftest imposto-retido-deve-ser-maior-que-0-test
  (testing "imposto retido deve ser maior que 0 quando for maior que 1000"
    (let [num 1100]
      (is
        (= 110 (logic/calcular-imposto num))))))