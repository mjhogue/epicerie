(ns epicerie.recettes.recettes-200moins-1
  (:use epicerie.core))

					; DEFINITION DES RECETTES DE MOINS DE 200 CALORIES - LIVRE 1

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Recettes de moins de 200 Calories du livre 1
(def recipes-less-200-1
     (list
      (make-recipe "Boeuf aux poivrons" 1
		   (list
		    (make-ingredient "fecule de mais" (teaspoon 1))
		    (make-ingredient "sauce soya" (tablespoon 2))
		    (make-ingredient "bouillon de boeuf" (cup 1/4))
		    (make-ingredient "steak de boeuf de 75 g" 1)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "poivron rouge" (cup 1))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "gingembre frais" (teaspoon 1))
		    (make-ingredient "tomate" (cup 1/2))
		    (make-ingredient "brin de romarin frais" 1)))
      (make-recipe "Boeuf a l'asiatique" 1
		   (list
		    (make-ingredient "haut de surlonge de boeuf" (gram 75))
		    (make-ingredient "vinaigre de vin rouge" (tablespoon 2))
		    (make-ingredient "sauce soya" (tablespoon 3))
		    (make-ingredient "gingembre frais" (teaspoon 1/2))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "champignon" (cup 1/2))))
      (make-recipe "Courge spaghetti a la sauce tomate" 1
		   (list
		    (make-ingredient "courge spaghetti" (cup 1))
		    (make-ingredient "recette sauce primavera" (cup 1/2))
		    (make-ingredient "parmesan" (tablespoon 2))
		    (make-ingredient "chapelure" (tablespoon 2))))
      (make-recipe "Crevettes cantonnaises" 1
		   (list
		    (make-ingredient "fecule de mais" (teaspoon 1))
		    (make-ingredient "bouillon de poulet faible en sel" (cup 1/2))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "crevette" (gram 120))
		    (make-ingredient "haricot vert" (cup 1/2))
		    (make-ingredient "sauce soya" (teaspoon 1))))
      (make-recipe "Crevettes grillees" 1
		   (list
		    (make-ingredient "crevette" (gram 90))
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "jus de citron" (tablespoon 1))
		    (make-ingredient "graines de sesame" (teaspoon 1))
		    (make-ingredient "coriandre fraiche" (tablespoon 1))
		    (make-ingredient "quartier de citron" 1)))
      (make-recipe "Escalopes de veau a la dijonnaise" 1
		   (list
		    (make-ingredient "escalope de veau de 75 g" 1)
		    (make-ingredient "yogourt nature sans gras" (tablespoon 2))
		    (make-ingredient "moutarde de dijon" (teaspoon 2))
		    (make-ingredient "estragon frais" (teaspoon 1))))
      (make-recipe "Filet de pangasius a la sauce creole" 1
		   (list
		    (make-ingredient "pangasius ou autre poisson a chair blanche" (gram 120))
		    (make-ingredient "recette sauce primavera" (cup 1/2))
		    (make-ingredient "olive noire" (tablespoon 3))
		    (make-ingredient "ananas" (cup 1/4))))
      (make-recipe "Filet de poisson bordelais" 1
		   (list
		    (make-ingredient "oignon" (tablespoon 1))
		    (make-ingredient "filet de morue" (gram 120))
		    (make-ingredient "persil frais" (tablespoon 1))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vin blanc" (tablespoon 2))
		    (make-ingredient "quatier de citron" 1)))
      (make-recipe "Filet de porc primavera" 2
		   (list
		    (make-ingredient "filet de porc" 180)
		    (make-ingredient "oignon" 1)
		    (make-ingredient "sauce worcestershire" (teaspoon 1))
		    (make-ingredient "vinaigre blanc" (tablespoon 1))
		    (make-ingredient "recette sauce primavera" (cup 1/2))
		    (make-ingredient "eau" (cup 1/2))
		    (make-ingredient "pate de tomates" (tablespoon 1))
		    (make-ingredient "sucre" (teaspoon 1))))
      (make-recipe "Fletan a l'antillaise" 1
		   (list
		    (make-ingredient "concombre" (cup 1/4))
		    (make-ingredient "poivron rouge" (cup 1/4))
		    (make-ingredient "ananas" (cup 1/4))
		    (make-ingredient "oignon" (tablespoon 1))
		    (make-ingredient "tomate" (cup 1/2))
		    (make-ingredient "vinaigre de vin rouge" (teaspoon 1))
		    (make-ingredient "sauce worcestershire" (teaspoon 1/2))
		    (make-ingredient "fletan" (gram 100))
		    (make-ingredient "coriandre fraiche" 1)))
      (make-recipe "Melange de fruits de mer" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "crevette" (gram 45))
		    (make-ingredient "petoncle" (gram 45))
		    (make-ingredient "vin blanc" (tablespoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))
		    (make-ingredient "zeste de citron" (teaspoon 1))
		    (make-ingredient "oignon" (cup 1/4))))
      (make-recipe "Omelette aux herbes du jardin" 1
		   (list
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "lait" (tablespoon 2))
		    (make-ingredient "poivron rouge" (cup 1/2))
		    (make-ingredient "thym seche" (teaspoon 2))
		    (make-ingredient "ciboulette fraiche" (teaspoon 2))
		    (make-ingredient "persil frais" (tablespoon 2))))
      (make-recipe "Petoncles grilles au citron et au thym" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "jus de citron" (teaspoon 2))
		    (make-ingredient "thym seche" (teaspoon 1))
		    (make-ingredient "petoncle" (gram 120))
		    (make-ingredient "zeste de citron" 1)
		    (make-ingredient "paprika" 1)))
      (make-recipe "Poulet au yogourt et aux herbes" 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 1/2))
		    (make-ingredient "moutarde de dijon" (teaspoon 1))
		    (make-ingredient "jus de citron" (tablespoon 2))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "poulet" (gram 90))
		    (make-ingredient "persil frais" (teaspoon 2))
		    (make-ingredient "basilic frais" (teaspoon 2))))
      (make-recipe "Salade le pied marin" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "thon" (gram 60))
		    (make-ingredient "tomate cerise" (cup 1/4))
		    (make-ingredient "poivron" (cup 1/4))
		    (make-ingredient "mayonnaise" (teaspoon 1))
		    (make-ingredient "yogourt nature sans gras" (teaspoon 2)) 
		    (make-ingredient "cari" (teaspoon 1/2))
		    (make-ingredient "ciboulette" (teaspoon 1))
		    (make-ingredient "huile d'olive" (teaspoon 1))))
      (make-recipe "Sandwich le sucre sale" 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "dinde tranchee" (gram 75))
		    (make-ingredient "poire" 1/2)
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "mayonnaise" (teaspoon 2))))
      (make-recipe "Salade la simplette" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "concombre" (cup 1/4))
		    (make-ingredient "radis" (cup 1/4))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre balsamique" (teaspoon 1))))
      (make-recipe "Sauce primavera" 1
		   (list
		    (make-ingredient "huile d'olive" (tablespoon 3))
		    (make-ingredient "oignon" 2)
		    (make-ingredient "gousse d'ail" 3)
		    (make-ingredient "poivron vert" 2)
		    (make-ingredient "poivron rouge" 2)
		    (make-ingredient "champignon" (cup 3))
		    (make-ingredient "jus de tomate" (cup 5))
		    (make-ingredient "pate de tomate" (tablespoon 2))
		    (make-ingredient "boite de 796 ml de tomates etuvees" 2)
		    (make-ingredient "feuille de laurier" 2)))
      
      ))

(swap! *all-recipes* concat recipes-less-200-1)
