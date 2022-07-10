(ns brincando-com-clojure.mapas.logic)

;Mapas

;Carrinho de compras

(defn compras
  []
  {
   :tomate {:quantidade 2 :preco 5}
   :arroz  {:quantidade 1 :preco 4}
   :feijao {:quantidade 2 :preco 10}
   })

(compras)

;Recuperar valores de um mapa: 3 formas

(get (compras) :tomate)
((compras) :tomate)
(:tomate (compras))

;Navegar mais a dentro do mapa
(:quantidade (:tomate (compras)))
