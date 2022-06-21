(ns brincando-com-clojure.core)

(defn taxa-de-entrega
  [valor]
  (if (< valor 100)
    15
    (if (< valor 200)
      5
      0)))



