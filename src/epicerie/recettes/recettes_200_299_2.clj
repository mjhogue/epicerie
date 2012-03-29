(ns epicerie.recettes.recettes-200-299-2
  (:use epicerie.core))

					; DEFINITION DES RECETTES DE 200-299 CALORIES - LIVRE 2

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Recettes de 200-299 Calories du livre 2
(def recipes-200-299-2
     (list
      (make-recipe "Coleslaw au poulet" 1
		   (list
		    (make-ingredient "chou" (cup 1))
		    (make-ingredient "poulet cuit" (gram 50))
		    (make-ingredient "carotte" (cup 1/4))
		    (make-ingredient "pomme" 1/2)
		    (make-ingredient "raisins secs" (tablespoon 1/2))
		    (make-ingredient "mayonnaise" (tablespoon 1/2))
		    (make-ingredient "yogourt nature sans gras" (tablespoon 1/2))
		    (make-ingredient "moutarde de dijon" (teaspoon 1/2))
		    (make-ingredient "miel" (teaspoon 1/4))))
      (make-recipe "Cotelettes de porc aux pommes" 2
		   (list
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "cotelette de porc sans gras de 90 g" 2)
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 2))
		    (make-ingredient "sirop d'erable" (teaspoon 2))
		    (make-ingredient "pomme" 1)
		    (make-ingredient "tabasco ou sambal oelek" 1)))
      (make-recipe "Croque-monsieur fruite" 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "jambon" (gram 40))
		    (make-ingredient "poire" 1/2)
		    (make-ingredient "fromage allege" (gram 25))))
      (make-recipe "Dore sur ratatouille" 2
		   (list
		    (make-ingredient "courgette moyenne" 4)
		    (make-ingredient "poivron" 4)
		    (make-ingredient "gros oignon" 2)
		    (make-ingredient "gousse d'ail" 2)
		    (make-ingredient "tomate italienne" 6)
		    (make-ingredient "basilic frais" 1)
		    (make-ingredient "sauge fraiche" 1)
		    (make-ingredient "huile d'olive" (teaspoon 4))
		    (make-ingredient "filet de dore" (gram 270))))
      (make-recipe "Fajitas de poulet en feuilles de laitue" 2
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "poivron rouge" 1)
		    (make-ingredient "poulet" (gram 300))
		    (make-ingredient "poudre de chili" (teaspoon 2))
		    (make-ingredient "cumin" (teaspoon 1/4))
		    (make-ingredient "concombre" 1/2)
		    (make-ingredient "grande feuille de laitue" 4)
		    (make-ingredient "fromage allege" (gram 50))))
      (make-recipe "Frittata aux legumes et au fromage" 2
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "courgette" 1)
		    (make-ingredient "poivron rouge" 1)
		    (make-ingredient "oeuf" 4)
		    (make-ingredient "lait" (tablespoon 1))
		    (make-ingredient "herbes de provence" (teaspoon 1))
		    (make-ingredient "fromage allege" (gram 25))))
      (make-recipe "Galette forestiere" 2
		   (list
		    (make-ingredient "champignons melanges" (gram 300))
		    (make-ingredient "oignon" 1/4)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "basilic frais" 1)
		    (make-ingredient "recette galette de sarrasin" 2)
		    (make-ingredient "fromage allege" (gram 50))))
      (make-recipe "Kefta de veau" 2
		   (list
		    (make-ingredient "veau hache maigre" (gram 160))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "gousse d'ail" 1/2)
		    (make-ingredient "persil frais" (tablespoon 3))
		    (make-ingredient "menthe fraiche" (tablespoon 1))
		    (make-ingredient "cumin" (teaspoon 1))
		    (make-ingredient "paprika" (teaspoon 1/2))
		    (make-ingredient "cannelle" (teaspoon 1/4))
		    (make-ingredient "yogourt nature sans gras" (cup 1/4))
		    (make-ingredient "concombre" (tablespoon 2))
		    (make-ingredient "gousse d'ail" 1/2)
		    (make-ingredient "menthe fraiche" (teaspoon 2))
		    (make-ingredient "pita ble entier" 2)
		    (make-ingredient "tomate cerise" 6)))
      (make-recipe "Maquereau, salsa de mangue et de coriandre" 2
		   (list
		    (make-ingredient "filet de maquereau" (gram 180))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "tomate cerise" (cup 3/4))
		    (make-ingredient "petite mangue" 1)
		    (make-ingredient "coriandre fraiche" (tablespoon 2))
		    (make-ingredient "oignon vert" 1/2)
		    (make-ingredient "jus d'orange" (tablespoon 2))
		    (make-ingredient "huile d'olive" (tablespoon 1/2))))
      (make-recipe "Medaillons de boeuf teriyaki" 2
		   (list
		    (make-ingredient "sauce soya" (tablespoon 1))
		    (make-ingredient "mirin" (tablespoon 1))
		    (make-ingredient "jus de citron" (tablespoon 1))
		    (make-ingredient "miel" (teaspoon 1))
		    (make-ingredient "gingembre frais" (teaspoon 1))
		    (make-ingredient "gousse d'ail" 1/2)
		    (make-ingredient "petit medaillon de boeuf de 150 g" 2)
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "graines de sesame" (teaspoon 1))))
      (make-recipe "Minipains veges" 2
		   (list
		    (make-ingredient "orge perle" (cup 1/3))
		    (make-ingredient "huile vegetale" (teaspoon 2))
		    (make-ingredient "lentille" (cup (+ 1 1/2)))
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "graines de lin moulues" (tablespoon 2))
		    (make-ingredient "sauce soya" (teaspoon 1))
		    (make-ingredient "herbes de provence" (teaspoon 1/2))
		    (make-ingredient "carotte" 1)
		    (make-ingredient "poivron rouge" 1/2)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "fromage mozzarella allege" (gram 90))))
      (make-recipe "Omelette feta, olives noires et basilic" 2
		   (list
		    (make-ingredient "oeuf" 4)
		    (make-ingredient "lait" (cup 1/4))
		    (make-ingredient "olive noire" (cup 1/2))
		    (make-ingredient "feta" (gram 50))
		    (make-ingredient "feuille de basilic" 3)))
      (make-recipe "Omelette florentine" 2
		   (list
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 1))
		    (make-ingredient "oignon vert" 1/4)
		    (make-ingredient "epinard" (cup 1))
		    (make-ingredient "oeuf" 4)
		    (make-ingredient "lait" (cup 1/4))
		    (make-ingredient "fromage allege" (gram 50))))
      (make-recipe "Pate chinois revisite" 2
		   (list
		    (make-ingredient "celeri-rave" (gram 500))
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "veau hache" (gram 320))
		    (make-ingredient "paprika" (teaspoon 1))
		    (make-ingredient "cumin" (teaspoon 1))
		    (make-ingredient "poudre de chili" (teaspoon 1))
		    (make-ingredient "piment de Cayenne" (teaspoon 1/4))
		    (make-ingredient "cannelle" (teaspoon 1/4))
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 1))
		    (make-ingredient "lait" (tablespoon 2))
		    (make-ingredient "poivron jaune" 1)
		    (make-ingredient "parmesan" 1)))
      (make-recipe "Pilons de poulet aux herbes" 2
		   (list
		    (make-ingredient "ciboulette" (tablespoon 3))
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 2))
		    (make-ingredient "pilon de poulet" 8)))
      (make-recipe "Pita moyen-oriental" 1
		   (list
		    (make-ingredient "pita ble entier" 1)
		    (make-ingredient "hoummos" (tablespoon 2))
		    (make-ingredient "feta allege" (gram 25))
		    (make-ingredient "poivron rouge" (tablespoon 2))
		    (make-ingredient "feuille de laitue" 1)))
      (make-recipe "Poulet farci au fromage et aux epinards" 2
		   (list
		    (make-ingredient "poulet" (gram 360))
		    (make-ingredient "fromage allege" (gram 50))
		    (make-ingredient "epinard" (cup 1/2))
		    (make-ingredient "boite de 540 ml de tomates en des" 1)
		    (make-ingredient "huile d'olive" (teaspoon 1))))
      (make-recipe "Poulet aux arachides" 2
		   (list
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "cumin" (teaspoon 1))
		    (make-ingredient "curcuma" (teaspoon 1/4))
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "citron" 1/2)
		    (make-ingredient "poulet" (gram 180))
		    (make-ingredient "beurre d'arachide" (teaspoon 5))
		    (make-ingredient "miel" (teaspoon 1/2))
		    (make-ingredient "sauce soya" (teaspoon 1/2))
		    (make-ingredient "flocons de piment" 1)))
      (make-recipe "Quiche sans croute jambon et asperges" 2
		   (list
		    (make-ingredient "asperge" (cup 1/2))
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "lait" (tablespoon 6))
		    (make-ingredient "farine tout usage" (teaspoon 4))
		    (make-ingredient "jambon" (gram 75))
		    (make-ingredient "fromage allege" (gram 25))))
      (make-recipe "Rouleaux de printemps au poulet" 2
		   (list
		    (make-ingredient "poulet" (gram 315))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "galette de riz de 23 cm (9 po)" 4)
		    (make-ingredient "concombre" 1/2)
		    (make-ingredient "oignon vert" 2)
		    (make-ingredient "poivron rouge" 1/2)
		    (make-ingredient "petite mangue" 1)
		    (make-ingredient "mirin" (tablespoon 3))
		    (make-ingredient "sauce de poisson (nuoc-mam)" (teaspoon 1))
		    (make-ingredient "trait de jus de citron" 1)))
      (make-recipe "Salade arc-en-ciel" 1
		   (list
		    (make-ingredient "mais en grain" (cup 1/2))
		    (make-ingredient "haricot rouge" (cup 1/4))
		    (make-ingredient "feta allege" (gram 25))
		    (make-ingredient "concombre" (cup 1/4))
		    (make-ingredient "poivron" (cup 1/4))
		    (make-ingredient "carotte" (tablespoon 2))
		    (make-ingredient "oignon vert" 1/2)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de vin" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))))
      (make-recipe "Salade crevettes et ananas" 1
		   (list
		    (make-ingredient "vermicelles de riz cuit" (cup 1/2))
		    (make-ingredient "crevette nordique cuite" (gram 75))
		    (make-ingredient "ananas" (cup 1/4))
		    (make-ingredient "poivron rouge" (cup 1/3))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de riz" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))
		    (make-ingredient "gingembre frais" (teaspoon 1/4))))
      (make-recipe "Salade de la mer" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "saumon cuit" (gram 45))
		    (make-ingredient "pomme" 1/2)
		    (make-ingredient "fenouil" (cup 1/2))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "jus d'orange" (tablespoon 1/2))
		    (make-ingredient "zeste d'orange" 1/2)))
      (make-recipe "Salade endives, noix de grenoble et feta" 1
		   (list
		    (make-ingredient "endive" (cup 1))
		    (make-ingredient "noix de grenoble" (tablespoon 2))
		    (make-ingredient "feta" (gram 25))
		    (make-ingredient "huile de noix" (teaspoon 1))
		    (make-ingredient "vinaigre balsamique" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1/2))))
      (make-recipe "Salade prosciutto, laitue, tomates" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "prosciutto" (gram 30))
		    (make-ingredient "parmesan allege" (teaspoon 5))
		    (make-ingredient "tomate cerise" 5)
		    (make-ingredient "celeri" (cup 1/4))
		    (make-ingredient "crouton" (tablespoon 2))
		    (make-ingredient "mayonnaise" (teaspoon 2))
		    (make-ingredient "yogourt nature sans gras" (teaspoon 1))
		    (make-ingredient "vinaigre de cidre" (teaspoon 1/2))
		    (make-ingredient "miel" (teaspoon 1/4))))
      (make-recipe "Salade tiede de pois chiches" 1
		   (list
		    (make-ingredient "pois chiche" (cup 3/4))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "persil frais" (tablespoon 2))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "bouillon de poulet" (teaspoon 1))
		    (make-ingredient "zeste de citron" (teaspoon 1/2))))
      (make-recipe "Salade tomates, fromage et amandes" 1
		   (list
		    (make-ingredient "tomate italienne" (cup 1/2))
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "amandes effilees" (tablespoon 2))
		    (make-ingredient "huile de noix" (teaspoon 1))
		    (make-ingredient "vinaigre balsamique" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1/2))))
      (make-recipe "Sandwich a la garniture de tofu" 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "tofu ferme" (gram 80))
		    (make-ingredient "carotte" 1/2)
		    (make-ingredient "oignon vert" 1/2)
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "curcuma" 1)
		    (make-ingredient "mayonnaise" (tablespoon 1/2))
		    (make-ingredient "yogourt nature sans gras" (tablespoon 1/2))
		    (make-ingredient "cumin" 1)))
      (make-recipe "Saumon en croute de sesame" 2
		   (list
		    (make-ingredient "miel" (tablespoon 1/2))
		    (make-ingredient "huile de sesame" (teaspoon 1/4))
		    (make-ingredient "graines de sesame" (teaspoon 2))
		    (make-ingredient "cumin" (teaspoon 1/4))
		    (make-ingredient "filet de saumon" (gram 280))))
      (make-recipe "Saute de poulet thai aux poivrons" 2
		   (list
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "poulet" (gram 180))
		    (make-ingredient "poudre de cari" (tablespoon 1/2))
		    (make-ingredient "cannelle" (teaspoon 1/4))
		    (make-ingredient "gingembre frais" (teaspoon 1/2))
		    (make-ingredient "farine tout usage" (tablespoon 1))
		    (make-ingredient "bouillon de poulet" (cup 1/2))
		    (make-ingredient "lait de coco allege" (cup 1/4))
		    (make-ingredient "carotte" 1)
		    (make-ingredient "poivron" 1)
		    (make-ingredient "raisins secs" (tablespoon 1))
		    (make-ingredient "oignon vert" 1)))
      (make-recipe "Sole amandine" 2
		   (list
		    (make-ingredient "farine tout usage" (tablespoon 3))
		    (make-ingredient "filet de sole" (gram 240))
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 2))
		    (make-ingredient "amandes effilees" (tablespoon 3))
		    (make-ingredient "persil frais" (tablespoon 1))
		    (make-ingredient "citron" 1)))
      (make-recipe "Soupe espagnole" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "boite de 796 ml de tomates en des" 1)
		    (make-ingredient "eau" (cup (+ 1 1/3)))
		    (make-ingredient "boite de 540 ml de pois chiche" 1)
		    (make-ingredient "tabasco ou sambal oelek" (teaspoon 1))
		    (make-ingredient "spaghetti ble entier" (gram 30))))
      (make-recipe "Truite a l'erable" 2
		   (list
		    (make-ingredient "sirop d'erable" (tablespoon 3))
		    (make-ingredient "eau" (tablespoon 2))
		    (make-ingredient "sauce soya" (tablespoon 1))
		    (make-ingredient "jus de citron" (teaspoon 2))
		    (make-ingredient "cannelle" 1)
		    (make-ingredient "tabasco ou sambal oelek" (teaspoon 1/8))
		    (make-ingredient "filet de truite" (gram 180))
		    (make-ingredient "oignon vert" 1)))
      (make-recipe "Vivaneau en papillote" 2
		   (list
		    (make-ingredient "oignon rouge" 1/2)
		    (make-ingredient "courgette" 1/2)
		    (make-ingredient "poivron rouge" 1/2)
		    (make-ingredient "tomate italienne" 1)
		    (make-ingredient "persil" 1)
		    (make-ingredient "feuille de basilic" 2)
		    (make-ingredient "gousse d'ail" 2)
		    (make-ingredient "vivaneau" (gram 270))
		    (make-ingredient "huile d'olive" (tablespoon 1/2))))
      ))

(swap! *all-recipes* concat recipes-200-299-2)
