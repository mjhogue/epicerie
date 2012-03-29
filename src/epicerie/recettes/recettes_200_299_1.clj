(ns epicerie.recettes.recettes-200-299-1
  (:use epicerie.core))

					; DEFINITION DES RECETTES DE 200-299 CALORIES - LIVRE 1

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Recettes de 200-299 Calories du livre 1
(def recipes-200-299-1
     (list
      (make-recipe "Agneau au vin rouge" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "cotelette d'agneau de 150-175 g" 1)
		    (make-ingredient "vin rouge" (cup 1/3))
		    (make-ingredient "moutarde de dijon" (teaspoon 1))
		    (make-ingredient "fecule de mais" (teaspoon 1/2))
		    (make-ingredient "sucre" (teaspoon 1/2))
		    (make-ingredient "romarin" 1)
		    (make-ingredient "herbes de provence" 1)))
      (make-recipe "Bifteck a la moutarde" 1
		   (list
		    (make-ingredient "huile d'olive" (tablespoon 1))
		    (make-ingredient "vinaigre de vin rouge" (teaspoon 1))
		    (make-ingredient "moutarde de dijon" (teaspoon 1))
		    (make-ingredient "sauce worcestershire" (teaspoon 1))
		    (make-ingredient "thym seche" (teaspoon 1/2))
		    (make-ingredient "bifteck de surlonge de boeuf" (gram 75))))
      (make-recipe "Brochette de petoncles" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "jus de citron" (teaspoon 1))
		    (make-ingredient "petoncle" (gram 120))
		    (make-ingredient "poivron" (cup 1/2))
		    (make-ingredient "champignon" 4)
		    (make-ingredient "paprika" 1)))
      (make-recipe "Cotelette de porc braise" 1
		   (list
		    (make-ingredient "cotelette de porc sans gras de 90 g" 1)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" (tablespoon 2))
		    (make-ingredient "champignon" (cup 1/2))
		    (make-ingredient "sauce soya" (teaspoon 1))
		    (make-ingredient "vin blanc" (tablespoon 2))
		    (make-ingredient "jus de citron" (teaspoon 1))
		    (make-ingredient "gousse d'ail" 1)))
      (make-recipe "Croquette de saumon" 1
		   (list
		    (make-ingredient "boite de 213 g de saumon en conserve" 1/2)
		    (make-ingredient "germe de ble" (tablespoon 1))
		    (make-ingredient "noix de grenoble" (tablespoon 1))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "celeri" (cup 1/4))
		    (make-ingredient "oignon" (tablespoon 2))
		    (make-ingredient "quartier de citron" 1)))
      (make-recipe "Escalope de poulet en croute de noix de grenoble" 1
		   (list
		    (make-ingredient "farine ble entier" (teaspoon 2))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "noix de grenoble" (tablespoon 2))
		    (make-ingredient "chapelure" (teaspoon 2))
		    (make-ingredient "escalope de poulet de 90 g" 1)
		    (make-ingredient "petit bouquet de persil frais" 1)))
      (make-recipe "Espadon a la salsa de tomates cerises" 1
		   (list
		    (make-ingredient "tomate cerise" (cup 1))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre balsamique" (teaspoon 1/2))
		    (make-ingredient "jus de citron" (teaspoon 1/2))
		    (make-ingredient "basilic frais" (tablespoon 2))
		    (make-ingredient "coriandre fraiche" (tablespoon 2))
		    (make-ingredient "paprika" 1)
		    (make-ingredient "morceau d'espadon de 90 g" 1)))
      (make-recipe "Hamburger de veau" 1
		   (list
		    (make-ingredient "veau hache" (gram 75))
		    (make-ingredient "oignon vert" (tablespoon 1))
		    (make-ingredient "cari" (teaspoon 1))
		    (make-ingredient "pain hamburger ble entier" 1)
		    (make-ingredient "tranche de tomate" 2)
		    (make-ingredient "salsa" (teaspoon 2))
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "moutarde de dijon" (teaspoon 1))))
      (make-recipe "Omelette au saumon fume" 1
		   (list
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "lait" (tablespoon 2))
		    (make-ingredient "tomate" (cup 1/4))
		    (make-ingredient "celeri" (cup 1/4))
		    (make-ingredient "saumon fume" (gram 30))
		    (make-ingredient "oignon vert" (teaspoon 2) )))
      (make-recipe "Omelette tomate-fromage" 1
		   (list
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "lait" (tablespoon 2))
		    (make-ingredient "tomate" (cup 1/4))
		    (make-ingredient "fromage allege" (gram 30))))
      (make-recipe "Omelette western" 1
		   (list
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "lait" (tablespoon 2))
		    (make-ingredient "poivron" (cup 1/4))
		    (make-ingredient "tomate" (cup 1/2))
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "jambon" (cup 1/2))
		    (make-ingredient "persil frais" (tablespoon 2))))
      (make-recipe "Poulet au wok" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "ail" 1)
		    (make-ingredient "gingembre" 1)
		    (make-ingredient "brocoli" (cup 1/2))
		    (make-ingredient "poivron colore" (cup 1/2))
		    (make-ingredient "pois mange-tout" (cup 1/2))
		    (make-ingredient "poulet cuit" (gram 75))
		    (make-ingredient "sauce soya" (teaspoon 1))
		    (make-ingredient "vinaigre de riz" (teaspoon 1))
		    (make-ingredient "bouillon de poulet" (tablespoon 1))
		    (make-ingredient "graines de sesame" 1)))
      (make-recipe "Poulet aux agrumes" 1
		   (list
		    (make-ingredient "poulet" (gram 90))
		    (make-ingredient "orange" 1)
		    (make-ingredient "pamplemousse" 1/2)
		    (make-ingredient "huile d'olive" (teaspoon 1/2))
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "farine" (teaspoon 1/2))
		    (make-ingredient "jus d'orange" (cup 1/4))))
      (make-recipe "Poulet aux framboises" 1
		   (list
		    (make-ingredient "poulet" (gram 90))
		    (make-ingredient "framboise" (cup 1/4))
		    (make-ingredient "oignon" (tablespoon 1))
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "sauce soya" (teaspoon 1))
		    (make-ingredient "sirop d'erable" (teaspoon 1))
		    (make-ingredient "vinaigre balsamique" (teaspoon 1))
		    (make-ingredient "moutarde de dijon" (teaspoon 1))))
      (make-recipe "Poulet cacciatore" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "poulet" (gram 90))
		    (make-ingredient "bouillon de poulet" (cup 1/2))
		    (make-ingredient "feuille de laurier" 1)
		    (make-ingredient "oignon" (tablespoon 2))
		    (make-ingredient "gousse d'ail" 1/2)
		    (make-ingredient "champignon" (cup 1/4))
		    (make-ingredient "tomates de conserve" (cup 1/2))
		    (make-ingredient "vin blanc" (tablespoon 2))))
      (make-recipe "Poisson exotique" 1
		   (list
		    (make-ingredient "vivaneau" (gram 95))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "jus d'orange" (cup 1/2))
		    (make-ingredient "mangue" (cup 1/4))
		    (make-ingredient "ananas" (cup 1/4))
		    (make-ingredient "vanille" (teaspoon 1/2))
		    (make-ingredient "coriandre fraiche" (tablespoon 2))))
      (make-recipe "Poulet parmesan" 1
		   (list
		    (make-ingredient "chapelure" (tablespoon 2))
		    (make-ingredient "parmesan" (tablespoon 2))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "persil seche" (teaspoon 1)) 
		    (make-ingredient "poulet" (gram 90))
		    (make-ingredient "recette sauce primavera" (cup 1/2))
		    (make-ingredient "paprika" 1)))
      (make-recipe "Poulet tex-mex" 1
		   (list
		    (make-ingredient "poulet" (gram 90))
		    (make-ingredient "salsa" (tablespoon 2))
		    (make-ingredient "chapelure" (teaspoon 1))
		    (make-ingredient "fromage allege" (gram 30))))
      (make-recipe "Roulade de veau au brie et aux tomates" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "escalope de veau de 75 g" 1)
		    (make-ingredient "tranche fine de tomate" 3)
		    (make-ingredient "brie" (gram 30))
		    (make-ingredient "feuille de sauge fraiche" 2)))
      (make-recipe "Salade etagee de thon" 1
		   (list
		    (make-ingredient "boite de thon" 1/2)
		    (make-ingredient "carotte" (cup 1/2))
		    (make-ingredient "mayonnaise" (teaspoon 1))
		    (make-ingredient "yogourt nature sans gras" (teaspoon 2))
		    (make-ingredient "oignon vert" 2)
		    (make-ingredient "moutarde" (teaspoon 1/2))
		    (make-ingredient "tomate mure" 1)))
      (make-recipe "Salade la grecque" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "feta allege" (cup 1/3))
		    (make-ingredient "tomate cerise" (cup 1/2))
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "olive noire" (tablespoon 2))
		    (make-ingredient "huile d'olive" (teaspoon 1)) 
		    (make-ingredient "vinaigre balsamique" (teaspoon 2))
		    (make-ingredient "jus de citron" (teaspoon 1))))
      (make-recipe "Salade la multicolore" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "saumon en boite" (gram 90))
		    (make-ingredient "carotte" (cup 1/4))
		    (make-ingredient "mais" (cup 1/4))
		    (make-ingredient "chou-fleur" (cup 1/2))
		    (make-ingredient "jus de citron" (teaspoon 2))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de vin blanc" (teaspoon 1))
		    (make-ingredient "aneth frais" 1)))
      (make-recipe "Salade la saumonee" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "saumon cuit" (gram 40))
		    (make-ingredient "pois mange-tout" (cup 1/4))
		    (make-ingredient "mangue" (cup 1/4))
		    (make-ingredient "crouton ble entier" (cup 1/2))
		    (make-ingredient "jus d'orange" (teaspoon 2))
		    (make-ingredient "sauce soya" 1)))
      (make-recipe "Salade l'oeuf en folie" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "poivron rouge" (cup 1/4))
		    (make-ingredient "celeri" (cup 1/4))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de vin blanc" (teaspoon 2))
		    (make-ingredient "herbes de provence" (teaspoon 2))))
      (make-recipe "Sandwich le pita de la mer" 1
		   (list
		    (make-ingredient "pita ble entier" 1/2)
		    (make-ingredient "boite de thon" 1/2)
		    (make-ingredient "poivron rouge" (cup 1/2))
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "mayonnaise" (teaspoon 1))
		    (make-ingredient "yogourt nature sans gras" (teaspoon 2))))
      (make-recipe "Saumon glace au miel" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "miel" (teaspoon 1))
		    (make-ingredient "filet de saumon" (gram 90))
		    (make-ingredient "brin de coriandre fraiche" 1)))
      (make-recipe "Saute de boeuf" 1
		   (list
		    (make-ingredient "bouillon de boeuf" (cup 1/2))
		    (make-ingredient "sauce soya" (tablespoon 2))
		    (make-ingredient "vinaigre de riz" (tablespoon 2))
		    (make-ingredient "fecule de mais" (teaspoon 2))
		    (make-ingredient "gingembre frais" (teaspoon 1))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "carotte" (cup 1/4)) 
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "lanieres de boeuf" (gram 90))
		    (make-ingredient "gousse d'ail" 1)))
      (make-recipe "Saute de tofu aux legumes" 1
		   (list
		    (make-ingredient "sauce soya" (tablespoon 1))
		    (make-ingredient "sirop d'erable" (tablespoon 1))
		    (make-ingredient "thym frais" (tablespoon 1))
		    (make-ingredient "eau" (cup 1/4))
		    (make-ingredient "tofu ferme" (gram 150))
		    (make-ingredient "huile d'olive" (tablespoon 1))
		    (make-ingredient "gousse d'ail" 2)
		    (make-ingredient "gingembre frais" (teaspoon 2))
		    (make-ingredient "haricot vert" (cup 1/2))
		    (make-ingredient "poivron" (cup 1/2))))
      (make-recipe "Soupe-repas aux lentilles" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" (cup 1/4)) 
		    (make-ingredient "carotte" (cup 1/4))
		    (make-ingredient "thym seche" (teaspoon 1/2))
		    (make-ingredient "bouillon de poulet" (cup 1))
		    (make-ingredient "tomates etuvees en conserve" (cup 2/3)) 
		    (make-ingredient "lentilles seches" (tablespoon 2))
		    (make-ingredient "persil frais" (tablespoon 1))))
      (make-recipe "Steak aux fines herbes" 1
		   (list
		    (make-ingredient "flanc de boeuf" (gram 90))
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "oignon" (tablespoon 2))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "farine tout usage" (teaspoon 1))
		    (make-ingredient "herbes de provence" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))
		    (make-ingredient "bouillon de boeuf" (cup 1/2))))
      
      ))

(swap! *all-recipes* concat recipes-200-299-1)
