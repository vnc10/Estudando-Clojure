(ns brincando-com-clojure.imposto.logic)

(defn- esta-na-faixa-insencao?
  [num]
  (< num 1000))

(defn calcular-imposto
  [num]
  (if (esta-na-faixa-insencao? num)
    0
    (* num 0.1)))
