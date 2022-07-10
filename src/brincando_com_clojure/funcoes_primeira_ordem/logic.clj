(ns brincando-com-clojure.funcoes-primeira-ordem.logic)


(defn consulta-taxa-padrao
  []
  0.20)

(defn consulta-taxa-padrao-fixa
  []
  0.30)

(defn imposto-retido
  [consulta-taxa-padrao salario]
  (if (< salario 1000)
    0
    (* salario (consulta-taxa-padrao))))

(imposto-retido consulta-taxa-padrao 1000)

(defn escolhe-consulta-taxa-padrao
  [ambiente]
  (if (= ambiente :teste)
    consulta-taxa-padrao
    consulta-taxa-padrao-fixa))

(imposto-retido (escolhe-consulta-taxa-padrao :teste) 1000)

;função anonima
((fn [x] (* 2 x)) 3)
;ou sem dar nome ao parametro
(#(* 2 %) 3)
;com dois parametros
(#(+ %1 %2) 3 4)
;cria uma constante
((constantly 0.2) 1)

(defn escolhe-consulta-taxa-padrao
  [ambiente]
  (if (= ambiente :teste)
    (constantly 0.2)
    (constantly 0.3)))

(imposto-retido (escolhe-consulta-taxa-padrao :aaa) 1000)