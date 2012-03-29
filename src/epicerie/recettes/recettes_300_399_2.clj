(ns epicerie.recettes.recettes-300-399-2
  (:use epicerie.core))

					; DEFINITION DES RECETTES DE 300-399 CALORIES - LIVRE 2

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Recettes de 300-399 Calories du livre 2
(def recipes-300-399-2
     (list
      (make-recipe "Bagel au saumon fume" 1
		   (list
		    (make-ingredient "bagel ble entier" 1)
		    (make-ingredient "saumon fume" (gram 50))
		    (make-ingredient "oignon rouge" (cup 1/4))
		    (make-ingredient "fromage a la creme leger" (tablespoon 2))
		    (make-ingredient "capre" (teaspoon 1))))
      (make-recipe "Boeuf aux herbes et au brie" 2
		   (list
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "bifteck de faux-filet de 115g" 2)
		    (make-ingredient "fromage brie allege" (gram 50))
		    (make-ingredient "persil frais" (tablespoon 2))))
      (make-recipe "Cari de tofu" 2
		   (list
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "gingembre frais" (teaspoon 1))
		    (make-ingredient "flocons de piment" 1)
		    (make-ingredient "pate de cari rouge" (teaspoon 2))
		    (make-ingredient "carotte" 2)
		    (make-ingredient "tofu marine a l'indienne ou nature" (gram 300))
		    (make-ingredient "lait de coco allege" (cup 1/2))
		    (make-ingredient "bouillon de poulet reduit en sel" (cup 1/4))
		    (make-ingredient "epinard" (cup 1))
		    (make-ingredient "feuille de coriandre" 1)))
      (make-recipe "Chaudree de poisson" 2
		   (list
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "oignon" 1/4)
		    (make-ingredient "carotte" 1)
		    (make-ingredient "bouillon de poulet" (cup (+ 1 1/4)))
		    (make-ingredient "lait" (cup (+ 1 1/4)))
		    (make-ingredient "thym seche" (teaspoon 1/2))
		    (make-ingredient "pomme de terre" 1)
		    (make-ingredient "mais en grain" (cup 2/3))
		    (make-ingredient "filet de pangasius" (gram 150))
		    (make-ingredient "fecule de mais" (tablespoon 3))
		    (make-ingredient "eau" (tablespoon 3))))
      (make-recipe "Ciabatta poulet-pesto" 1
		   (list
		    (make-ingredient "ciabatta ble entier" 1)
		    (make-ingredient "poulet" (gram 75))
		    (make-ingredient "poivron rouge" (cup 1/4))
		    (make-ingredient "laitue" (cup 1/2))
		    (make-ingredient "pesto" (tablespoon 1/2))
		    (make-ingredient "parmesan" (gram 7))))
      (make-recipe "Dindon burger" 2
		   (list
		    (make-ingredient "dindon hache maigre" (gram 180))
		    (make-ingredient "moutarde de dijon" (tablespoon 1))
		    (make-ingredient "miel" (tablespoon 1))
		    (make-ingredient "paprika" (teaspoon 1/2))
		    (make-ingredient "tabasco ou sambal oelek" (teaspoon 1/4))
		    (make-ingredient "oignon vert" 1)
		    (make-ingredient "pain hamburger ble entier" 2)
		    (make-ingredient "mayonnaise" (tablespoon 1))
		    (make-ingredient "tomate" 1)))
      (make-recipe "Falafels avec tzatziki" 2
		   (list
		    (make-ingredient "pois chiche sec" (cup 3/4))
		    (make-ingredient "persil frais" (teaspoon 4))
		    (make-ingredient "oignon" (tablespoon 3))
		    (make-ingredient "gousse d'ail" 1/2)
		    (make-ingredient "tabasco" 1)
		    (make-ingredient "cumin" (teaspoon 1))
		    (make-ingredient "coriandre" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 2))
		    (make-ingredient "eau" (teaspoon 2))
		    (make-ingredient "bicarbonate de soude" (teaspoon 1/2))
		    (make-ingredient "chapelure nature" (tablespoon 2))
		    (make-ingredient "yogourt nature sans gras" (cup 1/4))
		    (make-ingredient "concombre" (tablespoon 2))
		    (make-ingredient "gousse d'ail" 1/2)
		    (make-ingredient "menthe fraiche" (teaspoon 2))))
      (make-recipe "Fletan sur lentilles vertes" 2
		   (list
		    (make-ingredient "lentilles vertes seches" (tablespoon 6))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "feuille de laurier" 1)
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "jus de citron" (teaspoon 1))
		    (make-ingredient "filet de fletan" (gram 270))
		    (make-ingredient "citron" 1)))
      (make-recipe "Jarret d'agneau" 2
		   (list
		    (make-ingredient "pistaches" (cup 1/3))
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "branche de thym frais" 2)
		    (make-ingredient "gousse d'ail" 2)
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "oignon vert" 1)
		    (make-ingredient "jaret d'agneau de 120 g" 2)))
      (make-recipe "Magret de canard a l'orange" 2
		   (list
		    (make-ingredient "gros magret de canard 400 g" 1)
		    (make-ingredient "bouillon de poulet" (cup 1/4))
		    (make-ingredient "echalotte francaise" (teaspoon 2))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "jus d'orange" (cup 1/4))
		    (make-ingredient "vin blanc" (tablespoon 2))
		    (make-ingredient "vinaigre balsamique" (teaspoon 1))
		    (make-ingredient "marmelade d'orange" (teaspoon 2))))
      (make-recipe "Mijote de boeuf aux bleuets" 2
		   (list
		    (make-ingredient "cubes de boeuf a mijote" (gram 180))
		    (make-ingredient "bouillon de boeuf" (cup 1))
		    (make-ingredient "bleuet" (cup 1))
		    (make-ingredient "carotte" 2)
		    (make-ingredient "celeri" 1)
		    (make-ingredient "gingembre frais" (tablespoon 1))
		    (make-ingredient "sirop d'erable" (tablespoon 2))))
      (make-recipe "Pizza au poulet" 2
		   (list
		    (make-ingredient "poulet" (gram 360))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "paprika" (teaspoon 1/2))
		    (make-ingredient "tomate cerise" 10)
		    (make-ingredient "pita ble entier" 2)
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "courgette" 1/2)
		    (make-ingredient "fromage mozzarella allege" (gram 50))
		    (make-ingredient "poivron rouge" 1)
		    (make-ingredient "origan seche" 1)))
      (make-recipe "Pain aux noix pomme-ricotta" 1
		   (list
		    (make-ingredient "tranche de pain aux noix" (cup 1))
		    (make-ingredient "fromage ricotta allege" (cup 1/4))
		    (make-ingredient "roquette" (cup 1/2))
		    (make-ingredient "pomme" 1/2)))
      (make-recipe "Poivron farci a la mexicaine" 2
		   (list
		    (make-ingredient "riz brun" (tablespoon 3))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "boeuf hache extra-maigre" (gram 150))
		    (make-ingredient "poudre de chili" (teaspoon 1))
		    (make-ingredient "cumin" (teaspoon 1/2))
		    (make-ingredient "origan seche" (teaspoon 1/2))
		    (make-ingredient "paprika" (teaspoon 1/2))
		    (make-ingredient "mais en grain" (cup 1/2))
		    (make-ingredient "poivron rouge" 2)
		    (make-ingredient "fromage allege" (gram 25))))
      (make-recipe "Poulet marocain sur legumes-racines" 2
		   (list
		    (make-ingredient "oignon" 1)
		    (make-ingredient "carotte" 2)
		    (make-ingredient "panais moyen" 3)
		    (make-ingredient "patate douce" 1)
		    (make-ingredient "gousse d'ail" 2)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "poulet" (gram 300))
		    (make-ingredient "pate de cari rouge" (tablespoon 2))
		    (make-ingredient "eau" (teaspoon 2))))
      (make-recipe "Risotto d'orge au poulet et petits pois" 2
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "poulet" (gram 180))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "orge perle" (cup 1/3))
		    (make-ingredient "bouillon de poulet" (cup (+ 1 1/4)))
		    (make-ingredient "pois vert" (cup 3/4))
		    (make-ingredient "persil frais" (cup 1/4))
		    (make-ingredient "parmesan" (gram 15))))
      (make-recipe "Salade cesar" 1
		   (list
		    (make-ingredient "laitue" (cup 1/2))
		    (make-ingredient "radicchio" (cup 1/2))
		    (make-ingredient "tranche de bacon" 1)
		    (make-ingredient "poulet" (gram 50))
		    (make-ingredient "tomate cerise" 4)
		    (make-ingredient "crouton" (cup 1/4))
		    (make-ingredient "mayonnaise" (teaspoon 2))
		    (make-ingredient "yogourt nature sans gras" (teaspoon 2))
		    (make-ingredient "jus de citron" (teaspoon 1/2))
		    (make-ingredient "gousse d'ail" 1/2)
		    (make-ingredient "parmesan" (teaspoon 1/2))
		    (make-ingredient "sauce Worcestershire" (teaspoon 1/4))))
      (make-recipe "Salade oeufs et feta" 1
		   (list
		    (make-ingredient "epinard" (cup 1/2))
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "feta allege" (gram 50))
		    (make-ingredient "tomate" 1)
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de vin" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))))
      (make-recipe "Salade pates, tomates et olives noires" 1
		   (list
		    (make-ingredient "penne ble entier" (cup 1))
		    (make-ingredient "feta allege" (gram 25))
		    (make-ingredient "olive noire" (tablespoon 2))
		    (make-ingredient "tomate cerise" (cup 1/4))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre balsamique" (teaspoon 1))
		    (make-ingredient "origan seche" (teaspoon 1/4))))
      (make-recipe "Salade saumon et pommes de terre" 1
		   (list
		    (make-ingredient "laitue" (cup 1/2))
		    (make-ingredient "saumon en conserve" (gram 90))
		    (make-ingredient "radis" 4)
		    (make-ingredient "oignon vert" 1)
		    (make-ingredient "capre" (teaspoon 1))
		    (make-ingredient "3-4 pommes de terre grelot cuite ou 250 g" 1)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))
		    (make-ingredient "vinaigre de vin blanc" (teaspoon 1))
		    (make-ingredient "pate de cari" (teaspoon 1/4))))
      (make-recipe "Sandwich au porc a la dijonnaise" 1
		   (list
		    (make-ingredient "ciabatta ble entier" 1)
		    (make-ingredient "porc" (gram 50))
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "tomate" 1/2)
		    (make-ingredient "mayonnaise" (teaspoon 1))
		    (make-ingredient "moutarde de dijon" (teaspoon 1/2))))
      (make-recipe "Sandwich au prosciutto" 1
		   (list
		    (make-ingredient "pain baguette ble entier de 60 g" 1)
		    (make-ingredient "prosciutto ou jambon" (gram 60))
		    (make-ingredient "roquette" (cup 1/3))
		    (make-ingredient "tranche de courgette" 1)
		    (make-ingredient "olive noire" (tablespoon 1))
		    (make-ingredient "mayonnaise" (teaspoon 1/2))
		    (make-ingredient "moutarde de dijon" (teaspoon 1/2))))
      (make-recipe "Sandwich aux oeufs et aux petites feuilles de fenouil" 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "petite feuille d'un bulbe de fenouil" (tablespoon 2))
		    (make-ingredient "mayonnaise" (teaspoon 1))
		    (make-ingredient "yogourt nature sans gras" (teaspoon 1))
		    (make-ingredient "moutarde de dijon" (teaspoon 1/4))))
      (make-recipe "Sandwich poulet-raisins" 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "poulet cuit" (gram 75))
		    (make-ingredient "menthe" (tablespoon 1))
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "raisin rouge" 5)
		    (make-ingredient "mayonnaise" (tablespoon 1/2))
		    (make-ingredient "yogourt nature sans gras" (tablespoon 1/2))))
      (make-recipe "Taboule aux lentilles" 1
		   (list
		    (make-ingredient "couscous" (cup 1))
		    (make-ingredient "lentille" (cup 1/3))
		    (make-ingredient "tomate" (cup 1/3))
		    (make-ingredient "oignon vert" 1)
		    (make-ingredient "persil" (cup 1/4))
		    (make-ingredient "menthe fraiche" (tablespoon 1))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "jus de citron" (tablespoon 1/2))))
      (make-recipe "Wrap a la tartinade de haricots" 1
		   (list
		    (make-ingredient "tortilla ble entier" 1)
		    (make-ingredient "recette tartinade de haricots rouges ou hoummos" (cup 1))
		    (make-ingredient "poivron" (cup 1/2))
		    (make-ingredient "oignon rouge" 1/4)
		    (make-ingredient "yogourt nature sans gras" (tablespoon 1))))
      (make-recipe "Wrap thon et avocat" 1
		   (list
		    (make-ingredient "tortilla ble entier" 1)
		    (make-ingredient "thon" (can 1/2))
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "avocat" 1/2)
		    (make-ingredient "tomate" 1/2)
		    (make-ingredient "oignon vert" 1/4)
		    (make-ingredient "lime" 1/2)))
 ))

(swap! *all-recipes* concat recipes-300-399-2)
