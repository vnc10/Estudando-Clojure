(ns brincando-com-clojure.core-test
  (:require [clojure.test :refer :all]
            [brincando-com-clojure.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest compra-ate-100-reais-test
  (testing "valor da compra até 100 reais"
    (let [valor 43]
    (is
      (= 15 (taxa-de-entrega valor)))))
  (testing "valor da compra até 200 reais"
    (let [valor 150]
      (is (= 5 (taxa-de-entrega valor)))))
  (testing "valor da compra mais de 200 reais"
    (let [valor 250]
      (is (= 0 (taxa-de-entrega valor))))))