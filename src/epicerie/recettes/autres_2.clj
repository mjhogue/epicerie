(ns epicerie.recettes.autres-2
  (:use epicerie.core))

					; DEFINITION DES AUTRES RECETTES - LIVRE 2

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Autres recettes du livre 2
(def other-recipes-2
     (list
      (make-recipe "Cheesecake au tofu" 1
		   (list
		    (make-ingredient "chapelure de biscuits graham" (cup 1/4))
		    (make-ingredient "beurre" (tablespoon 1))
		    (make-ingredient "tofu soyeux" (tablespoon 3))
		    (make-ingredient "fromage a la creme leger" (cup 1/4))
		    (make-ingredient "miel" (tablespoon 2))
		    (make-ingredient "vanille" (teaspoon 1))
		    (make-ingredient "oeuf" 1)))
      (make-recipe "Crumble aux poires et aux fraises" 1
		   (list
		    (make-ingredient "farine tout usage" (cup 1/4))
		    (make-ingredient "gros flocaons d'avoine" (cup 2/3))
		    (make-ingredient "graines de lin moulues" (tablespoon 1))
		    (make-ingredient "cassonade" (tablespoon 3))
		    (make-ingredient "beurre" (tablespoon 3))
		    (make-ingredient "poire" 2)
		    (make-ingredient "fraise" (cup 1))
		    (make-ingredient "miel" (teaspoon 2))
		    (make-ingredient "fecule de mais" (teaspoon 1))))
      (make-recipe "Galettes aux bleuets et aux graines de lin" 1
		   (list
		    (make-ingredient "yogourt nature" (cup 1/3))
		    (make-ingredient "lait" (cup 2/3))
		    (make-ingredient "vinaigre blanc" (teaspoon 2))
		    (make-ingredient "sucre" (cup 1/4))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "citron" 1/2)
		    (make-ingredient "margarine non hydrogenee" (cup 1/4))
		    (make-ingredient "farine tout usage" (cup (+ 1 3/4)))
		    (make-ingredient "graines de lin moulues" (cup 1/4))
		    (make-ingredient "bicarbonate de soude" (teaspoon 1))
		    (make-ingredient "poudre a pate" (tablespoon 1))
		    (make-ingredient "bleuet" (cup 1/2))))
      (make-recipe "Gaufres aux bananes et au beure d'arachide" 2
		   (list
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "banane" 1)
		    (make-ingredient "gaufre de ble entier" 2)))
      (make-recipe "Granite au cafe" 1
		   (list
		    (make-ingredient "cafe fort ou expresso" (cup 1/2))
		    (make-ingredient "sucre" (teaspoon 2))
		    (make-ingredient "Baileys ou liqueur de cafe" (teaspoon 1))))
      (make-recipe "Muffins a la courgette et au citron" 1
		   (list
		    (make-ingredient "farine tout usage" (cup 1/2))
		    (make-ingredient "farine ble entier" (cup 1/2))
		    (make-ingredient "sel" (teaspoon 1/4))
		    (make-ingredient "bicarbonate de soude" (teaspoon 1/2))
		    (make-ingredient "poudre a pate" (teaspoon 1/4))
		    (make-ingredient "zeste de citron" (teaspoon 2))
		    (make-ingredient "courgette" (cup 1))
		    (make-ingredient "huile de canola" (tablespoon 2))
		    (make-ingredient "lait" (tablespoon 2))
		    (make-ingredient "miel" (cup 1/4))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "vanille" (teaspoon 1/2))))
      (make-recipe "Muffins aux bananes" 1
		   (list
		    (make-ingredient "farine ble entier" (cup 1/2))
		    (make-ingredient "farine tout usage" (cup 1/3))
		    (make-ingredient "flocons d'avoine a cuisson rapide" (tablespoon 3))
		    (make-ingredient "graines de lin moulues" (tablespoon 3))
		    (make-ingredient "bicarbonate de soude" (teaspoon 1))
		    (make-ingredient "poudre a pate" (teaspoon 1/4))
		    (make-ingredient "cacao" (teaspoon 2))
		    (make-ingredient "banane mure" 2)
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "yogourt nature" (cup 1/4))
		    (make-ingredient "sirop d'erable" (tablespoon 3))
		    (make-ingredient "huile de canola" (tablespoon 3))
		    (make-ingredient "compote de pommes sans sucre ajoute" (tablespoon 2))))
      (make-recipe "Panna cotta, compotee de fruits" 2
		   (list
		    (make-ingredient "vanille" (teaspoon 2))
		    (make-ingredient "lait" (cup 2))
		    (make-ingredient "sucre" (tablespoon 3))
		    (make-ingredient "eau" (tablespoon 2))
		    (make-ingredient "gelatine en poudre" (tablespoon 1))
		    (make-ingredient "framboise" (cup 1/3))
		    (make-ingredient "bleuet" (cup 3/4))
		    (make-ingredient "sucre" (tablespoon 1))))
      (make-recipe "Peches caramelisees" 2
		   (list
		    (make-ingredient "peche" 2)
		    (make-ingredient "sirop d'erable" (teaspoon 4))
		    (make-ingredient "eau" (tablespoon 1))
		    (make-ingredient "pacane" (tablespoon 1))))
      (make-recipe "Pommes au four a l'erable" 2
		   (list
		    (make-ingredient "pomme" 2)
		    (make-ingredient "raisins secs" (tablespoon 1))
		    (make-ingredient "flocons d'avoine � cuisson lente" (tablespoon 1))
		    (make-ingredient "amandes effilees" (tablespoon 2))
		    (make-ingredient "sirop d'erable" (teaspoon 1))
		    (make-ingredient "cannelle" 1)))
      (make-recipe "Salade orangee" 2
		   (list
		    (make-ingredient "orange" 1)
		    (make-ingredient "mangue" 1)
		    (make-ingredient "petite papaye" 1)
		    (make-ingredient "ananas" 1/2)
		    (make-ingredient "lime" 1)))
      (make-recipe "Smoothie energisant" 1
		   (list
		    (make-ingredient "lait de soya" (cup 3/4))
		    (make-ingredient "banane" 1/2)
		    (make-ingredient "tofu soyeux" (tablespoon 2))
		    (make-ingredient "beurre d'arachide" (teaspoon 1))))
      (make-recipe "Smoothie rose" 1
		   (list
		    (make-ingredient "lait de soya" (cup 3/4))
		    (make-ingredient "fraise" (cup 1/4))
		    (make-ingredient "yogourt nature" (tablespoon 2))
		    (make-ingredient "sirop d'erable" (teaspoon 1))))
      (make-recipe "Tapio-choco" 2
		   (list
		    (make-ingredient "lait au chocolat 1%" (cup 2))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "tapioca fin" (tablespoon 2))))
      (make-recipe "Tortillas tourbillon de bleuets" 1
		   (list
		    (make-ingredient "tortilla ble entier" 1)
		    (make-ingredient "fromage ricotta allege" (cup 1/4))
		    (make-ingredient "bleuet" (cup 1/2)))))
 )

(swap! *all-recipes* concat other-recipes-2)
