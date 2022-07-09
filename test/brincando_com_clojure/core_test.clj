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

(deftest adicionar-elemento-no-final-do-vetor-test
  (testing "Adicionar elemento no final do vetor"
    (let [vetor [1 2]]
      (is
        (= 3 (get (adicionar-elemento-no-final-do-vetor vetor) 2))))))

(deftest adicionar-elemento-no-final-do-vetor-test-2
  (testing "Adicionar elemento no final do vetor"
    (let [vetor [1 2]]
      (is
        (= 3 (count (adicionar-elemento-no-final-do-vetor vetor)))))))

(deftest remover-elemento-no-final-do-vetor-test
  (testing "Remover elemento no final do vetor"
    (let [vetor [1 2]]
      (is
        (= 1 (count (remover-elemento-no-final-do-vetor vetor)))))))

(deftest remover-elemento-no-final-do-vetor-test-2
  (testing "Remover elemento no final do vetor"
    (let [vetor [1 2]]
      (is
        (= 1 (get (remover-elemento-no-final-do-vetor vetor) 0))))))

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


(deftest imposto-retido-deve-ser-0-test
  (testing "imposto retido deve ser 0 quando for menor que 1000"
    (let [num 900]
      (is
        (= 0 (calcular-imposto num))))))