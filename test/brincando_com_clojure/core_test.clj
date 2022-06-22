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

(deftest tamanho-vetor-add
  (testing "tamanho do vetor "
    (let [vetor ["oi" "teste"]]
      (is
        (= 3 (count (adicionar-elemento-no-final-do-vetor vetor)))))))

(deftest tamanho-vetor-remover
  (testing "tamanho do vetor remover "
    (let [vetor ["oi" "teste"]]
      (is
        (= 1 (count (remover-elemento-no-final-do-vetor vetor)))))))

(deftest obter-primeiro-elemento-test
  (testing "obter primeiro elemento"
    (let [vetor [1 2]]
      (is
        (= 1 (obter-primeiro-elemento vetor))))))

(deftest substituir-primeiro-elemento-test
  (testing "substituir primeiro elemento"
    (let [vetor [1 2] num 10]
      (is
        (= 10 (get (substituir-primeiro-elemento vetor num) 0))))))