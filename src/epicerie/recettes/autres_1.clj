(ns epicerie.recettes.autres-1
  (:use epicerie.core))

					; DEFINITION DES AUTRES RECETTES - LIVRE 1

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Autres recettes du livre 1
(def other-recipes-1
     (list
      (make-recipe "Barre granola maison" 1
		   (list
		    (make-ingredient "huile de canola" (teaspoon 2))
		    (make-ingredient "sirop d'erable" (tablespoon 3))
		    (make-ingredient "lait de coco leger" (cup 1/3))
		    (make-ingredient "flocons d'avoine" (cup 1/2))
		    (make-ingredient "farine ble entier" (tablespoon 3))
		    (make-ingredient "bicarbonate de soude" 1)
		    (make-ingredient "sel" 1)
		    (make-ingredient "cannelle" 1)
		    (make-ingredient "cardamome" 1)
		    (make-ingredient "canneberges sechees" (cup 1/2))))
      (make-recipe "Carre aux framboises" 1
		   (list
		    (make-ingredient "framboise" (cup 7/2))
		    (make-ingredient "sucre" (cup 1/4))
		    (make-ingredient "eau" (cup 1/4))
		    (make-ingredient "farine ble entier" (cup 1/2))
		    (make-ingredient "flocons d'avoine" (cup 3/4))
		    (make-ingredient "germe de ble" (tablespoon 2))
		    (make-ingredient "cassonade" (tablespoon 2))
		    (make-ingredient "beurre" (cup 1/3))
		    (make-ingredient "lait" (tablespoon 3))))
      (make-recipe "Coupe a la ricotta et aux fraises" 1
		   (list
		    (make-ingredient "chocolat blanc" (teaspoon 2))
		    (make-ingredient "lait" (teaspoon 1))
		    (make-ingredient "ricotta" (cup 1/4))
		    (make-ingredient "creme fouettee" (tablespoon 3))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "feuille de menthe fraiche" 1)))
      (make-recipe "Croustade aux prunes et aux framboises" 1
		   (list
		    (make-ingredient "prune" (cup 1/2))
		    (make-ingredient "framboise" (cup 1/2))
		    (make-ingredient "farine ble entier" (teaspoon 2))
		    (make-ingredient "flocons d'avoine" (tablespoon 3))
		    (make-ingredient "cassonade" (teaspoon 2))
		    (make-ingredient "graines de lin moulues" (tablespoon 1))
		    (make-ingredient "beurre" (tablespoon 2))))
      (make-recipe "Mousse aux bananes" 1
		   (list
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "sucre" (teaspoon 2))
		    (make-ingredient "banane" 1/2)
		    (make-ingredient "vanille" (teaspoon 1/4))))
      (make-recipe "Muffin aux carottes et aux canneberges" 1
		   (list
		    (make-ingredient "beurre" (tablespoon 3))
		    (make-ingredient "sucre" (tablespoon 3))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "compote de pomme non sucree" (cup 1/2))
		    (make-ingredient "lait" (tablespoon 2))
		    (make-ingredient "farine ble entier" (cup 3/4))
		    (make-ingredient "poudre a pate" (teaspoon 2))
		    (make-ingredient "bicarbonate de soude" (teaspoon 1))
		    (make-ingredient "sel" 1)
		    (make-ingredient "carotte" (cup 3/2))
		    (make-ingredient "canneberges sechees" (cup 1/2))))
      (make-recipe "Muffin aux noix" 1
		   (list
		    (make-ingredient "lait" (cup 1/3))
		    (make-ingredient "vinaigre" (teaspoon 1))
		    (make-ingredient "beurre" (tablespoon 3))
		    (make-ingredient "cassonade" (tablespoon 3))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "farine ble entier" (cup 3/4))
		    (make-ingredient "graines de lin moulues" (cup 1/4))
		    (make-ingredient "poudre a pate" (teaspoon 2))
		    (make-ingredient "bicarbonate de soude" (teaspoon 1))
		    (make-ingredient "sel" 1)
		    (make-ingredient "noix de grenoble" (cup 1/2))))
      (make-recipe "Pamplemousse grille" 1
		   (list
		    (make-ingredient "pamplemousse" 1/2)
		    (make-ingredient "sucre d'erable" (teaspoon 1))
		    (make-ingredient "cannelle" (teaspoon 1/4))))
      (make-recipe "Poire pochee au citron" 1
		   (list
		    (make-ingredient "eau" (cup 2))
		    (make-ingredient "citron" 1/2)
		    (make-ingredient "poire" 1)))
      (make-recipe "Pudding au riz au lait de coco" 1
		   (list
		    (make-ingredient "fecule de mais" (tablespoon 1))
		    (make-ingredient "lait" (cup 1))
		    (make-ingredient "lait de coco leger" (cup 1/4))
		    (make-ingredient "riz" (cup 1/2))
		    (make-ingredient "miel" (teaspoon 2))))
      (make-recipe "Salade tropicale" 1
		   (list
		    (make-ingredient "mangue" (cup 1/2))
		    (make-ingredient "ananas" (cup 1/2))
		    (make-ingredient "pamplemousse" (cup 1/1))
		    (make-ingredient "carambole" 1)
		    (make-ingredient "vanille" (teaspoon 1))
		    (make-ingredient "jus d'orange" (tablespoon 2))))
      (make-recipe "Smoothie" 1
		   (list
		    (make-ingredient "lait de soya" (cup 1/2))
		    (make-ingredient "jus d'orange" (cup 1/2))
		    (make-ingredient "mangue" (cup 1/4))
		    (make-ingredient "fraise" (cup 1/4))))
      (make-recipe "Tartinade a la ricotta et aux framboises" 1
		   (list
		    (make-ingredient "ricotta" (cup 1/4))
		    (make-ingredient "framboise" (tablespoon 2))
		    (make-ingredient "cardamome" 1)
		    (make-ingredient "vanille" 1)))
      (make-recipe "Yogourt a la grecque" 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "pistaches" (tablespoon 2))
		    (make-ingredient "miel" (teaspoon 2))
		    (make-ingredient "zeste de citron" 1)))
      (make-recipe "Yogourt latte frappuccino" 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 1/2))
		    (make-ingredient "cafe ou chocolat ou caramel" (tablespoon 2))
		    (make-ingredient "lait de soya" (cup 1/4))
		    (make-ingredient "vanille" (teaspoon 1/2))))
 ))
      
(swap! *all-recipes* concat other-recipes-1)
