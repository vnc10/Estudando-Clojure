(ns brincando-com-clojure.core)

(defn taxa-de-entrega
  [valor]
  (if (< valor 100)
    15
    (if (< valor 200)
      5
      0)))

(defn adicionar-elemento-no-final-do-vetor
  [vetor]
  (conj vetor "Teste3"))

(defn remover-elemento-no-final-do-vetor
  [vetor]
  (pop vetor))

(defn obter-primeiro-elemento
  [vetor]
  (get vetor 0 "Erro"))

(defn substituir-primeiro-elemento
  [vetor substituir]
  (assoc vetor 0 substituir))
