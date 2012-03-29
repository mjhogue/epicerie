(ns epicerie.recettes.recettes-400plus-1
  (:use epicerie.core))

					; DEFINITION DES RECETTES DE PLUS DE 400 CALORIES - LIVRE 1

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Recettes de plus de 400 Calories du livre 1
(def recipes-400-more-1
     (list
      (make-recipe "Linguinis a l'italienne" 1
		   (list
		    (make-ingredient "linguinis ble entier" (cup 1))
		    (make-ingredient "huile d'olive" (tablespoon 1))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "tomate" 1)
		    (make-ingredient "herbes de provence" (teaspoon 1/2))
		    (make-ingredient "sucre" (teaspoon 1/2))
		    (make-ingredient "vinaigre" (teaspoon 1))
		    (make-ingredient "parmesan" (tablespoon 2))
		    (make-ingredient "quelques feuilles de basilic frais" 1)))
      (make-recipe "Macaroni au boeuf et au fromage" 2
		   (list
		    (make-ingredient "macaronis ble entier" (cup 2))
		    (make-ingredient "boeuf hache extra-maigre" (gram 150))
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "recette sauce primavera" (cup 1))
		    (make-ingredient "tomate" 1)
		    (make-ingredient "fromage allege" (gram 45))))
      (make-recipe "Poulet et quinoa epice" 2
		   (list
		    (make-ingredient "poitrine de poulet de 120 g" 1)
		    (make-ingredient "quinoa sec" (cup 1/2))
		    (make-ingredient "beurre ou margarine non hydrogenee" (tablespoon 1))
		    (make-ingredient "bouillon de poulet"(cup 1))
		    (make-ingredient "gingembre frais" (tablespoon 1))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "cannelle moulue" (teaspoon 1/2))
		    (make-ingredient "cari" (teaspoon 1))
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "huile d'olive" (tablespoon 2))
		    (make-ingredient "jus de citron" (tablespoon 2))
		    (make-ingredient "persil frais" (cup 1/2))
		    (make-ingredient "paprika" 1)))
      (make-recipe "Penne a la verdure" 1
		   (list
		    (make-ingredient "penne ble entier" (cup 1))
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "vin blanc" (teaspoon 2))
		    (make-ingredient "eau de cuisson des pates" (teaspoon 2))
		    (make-ingredient "ail" 1)
		    (make-ingredient "origan" 1)
		    (make-ingredient "tomate cerise" (cup 1/2))
		    (make-ingredient "petit bocconcini" (gram 30))
		    (make-ingredient "epinard miniature" (cup 1))
		    (make-ingredient "roquette" (cup 1))))
      (make-recipe "Saucisse et gratin de chou aux pommes" 2
		   (list
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 2))
		    (make-ingredient "farine tout usage" (teaspoon 2))
		    (make-ingredient "lait" (cup 1/2))
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "chou" (cup 1))
		    (make-ingredient "pomme" (cup 1/4))
		    (make-ingredient "muscade" 1)
		    (make-ingredient "saucisse de porc de 75 g" 2)
		    (make-ingredient "fromage allege" (gram 30))))
      (make-recipe "Vol-au-vent au poulet" 1
		   (list
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 3/2))
		    (make-ingredient "farine tout usage" (teaspoon 3/2))
		    (make-ingredient "lait" (cup 3/4))
		    (make-ingredient "poulet cuit" (gram 60))
		    (make-ingredient "parmesan" (tablespoon 2))
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "muscade" 1)))
 ))
 
(swap! *all-recipes* concat recipes-400-more-1)
