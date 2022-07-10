(ns brincando-com-clojure.filter-map-reduce.logic)

;Imagine que tenhamos um vetor de numeros onde cada numero representa o ano que o estuda esta
;Exemplo [5 6 6]; Temos um estudante no quinta ano e dois no sexto
;Desafio 1: crie uma função que recebe este vetor como entreada e retorna a quantidade de estudantes que estão no quinto ano

(defn- esta-no-quinto-ano?
  [ano]
  (= ano 5))

(defn desafio-1
  [estudantes]
  (count (filter esta-no-quinto-ano? estudantes)))

(desafio-1 [5 5 6 7 8 6 5 5])

;desafio 1 com função anonima

(defn desafio-1-func-anonima
  [estudantes]
  (count (filter (fn [ano] (= ano 5)) estudantes)))

(desafio-1-func-anonima [5 5 6 7 8 6 5 5])


;Desafio 2: cria uma função que receba um vetor de idade e retorna a soma
;;Ex (soma-das-idades [5 10 5]) ; deve retornar 20

(defn desafio-2
  [idades]
    (reduce + idades))

(desafio-2 [5 10 5])

;Desafio 3: cria uma função que recebe um vetor de nomes e retorne o tamanho médio dos nomes
;Ex: (tamanho-medio-dos-nomes ["Marcio" "Joao"]) ;deve retornar 5

(defn desafio-3
  [nomes]
  (/ (reduce + (map count nomes)) (count nomes)))

(desafio-3 ["Marcio" "Joao"])

;Desafio 4: Crie um função que receba um vetor de nomes e retorne o tamanho medio dos nomes;
;deve-se ignorar nomes com 3 ou menos caracteres


