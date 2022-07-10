(ns brincando-com-clojure.threading.logic
  (:require [clojure.string :refer [upper-case join]]))

;Desafio: precisamos criar uma função que, dado um conjunto (vetor) de disciplinas
;e o semestre da discentem, deve:
;- filtrar a lista para exibir disciplinas restantes (que sejam do semestre atual ou superior)
;- transformar nome da disciplina para maisucilo e descatar maiores informaçoes
;- criar uma String concatenando o nome de todas as disciplinas filtradas
;Exemplo de entrada:
;[{:nome "Estrutura de dados" :semestre 2}
;{:nome "Algoritmos" :semestre 1}
;{:nome "Inteligencia Artificial" :semestre 3}] 2
;Saida esperada: "ESTRUTURA DE DADOS, INTELIGENCIA ARTIFICIAL"

(defn disciplinas
  []
  [{:nome "Estrutura de dados" :semestre 2}
   {:nome "Algoritmos" :semestre 1}
   {:nome "Inteligencia Artificial" :semestre 3}])


(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (join ", " (map upper-case (map :nome (filter (fn [semestre] (>= (:semestre semestre) semestre-atual)) disciplinas)))))

(nomes-disciplinas-restantes (disciplinas) 2)

;Usando threading last

(defn disciplinas
  []
  [{:nome "Estrutura de dados" :semestre 2}
   {:nome "Algoritmos" :semestre 1}
   {:nome "Inteligencia Artificial" :semestre 3}])


(defn nomes-disciplinas-restantes
  [disciplinas semestre-atual]
  (->> disciplinas
       (filter (fn [semestre] (>= (:semestre semestre) semestre-atual)))
       (map :nome)
       (map upper-case)
       (join ", ")))

(nomes-disciplinas-restantes (disciplinas) 2)

