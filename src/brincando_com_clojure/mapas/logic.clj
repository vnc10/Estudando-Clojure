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

;Como associar um novo valor a um mapa

(conj (compras) {:alface {:quantidade 2 :preco 8}})

(assoc (compras) :alface {:quantidade 2 :preco 8})

;Como desassociar um valor de um mapa
;Pode passar mais de um parametro
;Ex: :alface :feijao
(dissoc (compras) :alface)

;Como atualizar um valor de um mapa

;Pior forma
(assoc (compras) :tomate {:quantidade 3 :preco 10})

;Melhor forma
;update-in atualizar um valor de um mapa dentro de um mapa;
;update atualizar um valor de um mapa simples
;inc função de incrimento

(update-in (compras) [:tomate :preco] inc)

(update-in (compras) [:tomate :preco] * 2)

