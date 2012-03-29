(ns epicerie.recettes.recettes-300-399-1
  (:use epicerie.core))

					; DEFINITION DES RECETTES DE 300-399 CALORIES - LIVRE 1

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Recettes de 300-399 Calories du livre 1
(def recipes-300-399-1
     (list
      (make-recipe "Cari aux pois chiche" 2
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "poudre de cari" (teaspoon 1))
		    (make-ingredient "farine tout usage" (teaspoon 2))
		    (make-ingredient "bouillon de poulet" (cup 1/2))
		    (make-ingredient "lait de coco leger" (tablespoon 3)) 
		    (make-ingredient "pois chiche" (cup 3/2))
		    (make-ingredient "brocoli" (cup 1/2))
		    (make-ingredient "chou-fleur" (cup 1/2))
		    (make-ingredient "poivron colore" (cup 1/2))
		    (make-ingredient "quelques feuilles de basilic frais" 1)
		    (make-ingredient "cannelle" 1)
		    (make-ingredient "gingembre" 1)))
      (make-recipe "Chili con carne" 2
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "celeri" (cup 1))
		    (make-ingredient "poivron vert" 1)
		    (make-ingredient "boeuf hache extra-maigre" (gram 150))
		    (make-ingredient "tomates etuvees en conserve" (cup 5/4))
		    (make-ingredient "haricot rouge" (cup 1))
		    (make-ingredient "ail" 1)))
      (make-recipe "Crepe au poulet et au fromage" 1
		   (list
		    (make-ingredient "farine ble entier" (tablespoon 3))
		    (make-ingredient "lait" (tablespoon 3))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "poulet cuit" (gram 45))
		    (make-ingredient "mozzarella allege" (gram 30))
		    (make-ingredient "fraomge suisse allege" (gram 15))
		    (make-ingredient "quelques feuilles de basilic" 1)))
       (make-recipe "Grilled cheese de luxe" 1
		   (list
		    (make-ingredient "tranche de pain aux raisins" 2)
		    (make-ingredient "jambon cuit" (gram 45))
		    (make-ingredient "fromage allege" (gram 30))
		    (make-ingredient "tomate" (cup 1/4))))
      (make-recipe "Paella" 1
		   (list
		    (make-ingredient "crevette" (gram 30))
		    (make-ingredient "petoncle" (gram 30))
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "mais" (cup 1/4))
		    (make-ingredient "petit pois" (cup 1/4))
		    (make-ingredient "tomate" 1)
		    (make-ingredient "pincee de safran" 1)
		    (make-ingredient "riz" (cup 1))
		    (make-ingredient "jus de legumes" (tablespoon 2))
		    (make-ingredient "quartier de citron" 1)))
      (make-recipe "Pates au pesto" 1
		   (list
		    (make-ingredient "spaghetti ble entier" (cup 1))
		    (make-ingredient "eau de cuisson des pates" (tablespoon 1))
		    (make-ingredient "pesto de basilic" (tablespoon 1))
		    (make-ingredient "tomate cerise" (cup 1/2))
		    (make-ingredient "olive noire" (tablespoon 1))
		    (make-ingredient "feta allege" (gram 25))))
      (make-recipe "Pizza sante" 1
		   (list
		    (make-ingredient "pita ble entier" 1)
		    (make-ingredient "recette sauce primavera" (cup 1/2))
		    (make-ingredient "carotte" (cup 1/2))
		    (make-ingredient "fromage allege" (gram 30))
		    (make-ingredient "fromage suisse allege" (gram 30))
		    (make-ingredient "olive noire" (tablespoon 1))
		    (make-ingredient "basilic frais" 1)))
      (make-recipe "Poivron farci au boeuf et au tofu" 1
		   (list
		    (make-ingredient "poivron rouge" 1)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" (cup 1/4))
		    (make-ingredient "boeuf hache maigre" (gram 45))
		    (make-ingredient "tofu ferme" (gram 75))
		    (make-ingredient "salsa" (cup 1/4))
		    (make-ingredient "mais" (cup 1/4))
		    (make-ingredient "fromage allege" (gram 30))
		    (make-ingredient "paprika" 1)))
      (make-recipe "Quesadillas au poulet" 1
		   (list
		    (make-ingredient "tortilla ble entier" 1)
		    (make-ingredient "poulet" (gram 75))
		    (make-ingredient "tomate" (cup 1/4))
		    (make-ingredient "fromage mozzarella allege" (gram 30))))
      (make-recipe "Risotto aux champignons" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon vert" 1)
		    (make-ingredient "gousse d'ail" 2)
		    (make-ingredient "champignon" (cup 3/4))
		    (make-ingredient "riz arborio" (cup 1/4))
		    (make-ingredient "vin blanc" (tablespoon 2))
		    (make-ingredient "bouillon de poulet" (cup 1))
		    (make-ingredient "parmesan rape" (cup 1/4))
		    (make-ingredient "thym frais" (tablespoon 1))
		    (make-ingredient "origan seche" (teaspoon 1))
		    (make-ingredient "zeste de citron" (teaspoon 1))))
      (make-recipe "Salade la chiche" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "pois chiche" (cup 3/4))
		    (make-ingredient "tomate" (cup 1/4))
		    (make-ingredient "concombre" (cup 1/4))
		    (make-ingredient "celeri" (cup 1/4))
		    (make-ingredient "crouton ble entier"(cup 1/4))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de vin blanc" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))))
      (make-recipe "Salade la mexicaine" 1
		   (list
		    (make-ingredient "laitue" (cup 1))
		    (make-ingredient "poulet cuit" (gram 30))
		    (make-ingredient "haricot rouge" (cup 1/3))
		    (make-ingredient "mais" (cup 1/4))
		    (make-ingredient "creme sure legere" (tablespoon 1))
		    (make-ingredient "salsa" (tablespoon 1))))
      (make-recipe "Salade la saucisonne" 1
		   (list
		    (make-ingredient "spaghetti ble entier" (cup 1))
		    (make-ingredient "saucisson" (gram 45))
		    (make-ingredient "tomate" (cup 1/2))
		    (make-ingredient "zeste de citron" (tablespoon 1))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de vin blanc" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))))
      (make-recipe "Salade les pates et bocconcinis" 1
		   (list
		    (make-ingredient "pate courte ble entier" (cup 1))
		    (make-ingredient "bocconcini" (gram 30))
		    (make-ingredient "tomate cerise" (cup 1/2))
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "poivron" (cup 1/2))
		    (make-ingredient "huile d'olive" (teaspoon 2))))
      (make-recipe "Sandwich le bagel surpise" 1
		   (list
		    (make-ingredient "bagel ble entier" 1)
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "fromage suisse allege" (gram 25))
		    (make-ingredient "poivron rouge" (cup 1/2))
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "yogourt nature sans gras" (teaspoon 4))
		    (make-ingredient "mayonnaise" (teaspoon 1))))
      (make-recipe "Sandwich le croque-monsieur" 1
		   (list
		    (make-ingredient "pain baguette ble entier" (gram 60))
		    (make-ingredient "jambon cuit" (gram 35))
		    (make-ingredient "tomate" 1/2)
		    (make-ingredient "fromage allege" (gram 25))))
      (make-recipe "Sandwich le dinde-legumes" 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "dinde tranchee" (gram 75))
		    (make-ingredient "poivron" (cup 1/4))
		    (make-ingredient "concombre" (cup 1/4))
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "pesto de basilic" (teaspoon 1))
		    (make-ingredient "fromage suisse allege" (gram 25))))
      (make-recipe "Sandwich le poulet-mangue" 1
		   (list
		    (make-ingredient "pita ble entier" 1)
		    (make-ingredient "poulet cuit" (gram 50))
		    (make-ingredient "celeri" (cup 1/4))
		    (make-ingredient "mangue" (cup 1/4))
		    (make-ingredient "mayonnaise" (teaspoon 1))
		    (make-ingredient "yogourt nature sans gras" (teaspoon 2))
		    (make-ingredient "zeste de citron" 1)))
      (make-recipe "Sandwich le vege" 1
		   (list
		    (make-ingredient "ciabatta ble entier" 1)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "fromage suisse allege" (gram 25))
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "concombre" (teaspoon 3))
		    (make-ingredient "tomate cerise" (tablespoon 3))
		    (make-ingredient "olive noire" (teaspoon 1))
		    (make-ingredient "moutarde de dijon" (teaspoon 1))))
       (make-recipe "Sandwich l'italien" 1
		   (list
		    (make-ingredient "ciabatta ble entier" 1/2)
		    (make-ingredient "prosciutto" (gram 25))
		    (make-ingredient "feuille de laitue" 1)
		    (make-ingredient "tranche de tomate" 2)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "moutarde de dijon" (teaspoon 1))))
       (make-recipe "Saumon aux epinards" 1
		    (list
		     (make-ingredient "eau" (cup 1/2))
		     (make-ingredient "vin blanc" (cup 1/2))
		     (make-ingredient "oignon" 1/2)
		     (make-ingredient "feuille de laurier" 1)
		     (make-ingredient "sel" (teaspoon 1))
		     (make-ingredient "saumon frais" (gram 100))
		     (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 1))
		     (make-ingredient "farine tout usage" (teaspoon 2))
		     (make-ingredient "lait" (cup 1/3))
		     (make-ingredient "epinards miniatures" (cup 1))
		     (make-ingredient "fromage mozzarella allege" (gram 30))))
       (make-recipe "Souvlaki" 1
		    (list
		     (make-ingredient "pita ble entier" 1)
		     (make-ingredient "poulet" (gram 75))
		     (make-ingredient "tomate" (cup 1/2))
		     (make-ingredient "oignon" (cup 1/4))
		     (make-ingredient "tzatziki" (teaspoon 4))))
       (make-recipe "Spaghetti sauce primavera" 1
		    (list
		     (make-ingredient "spaghetti ble entier" (cup 1))
		     (make-ingredient "recette sauce primavera" (cup 1))))
       (make-recipe "Thon frais poele" 1
		    (list
		     (make-ingredient "darne de thon frais de 100 g" 1)
		     (make-ingredient "huile d'olive" (teaspoon 1))
		     (make-ingredient "miel" (teaspoon 1/2))
		     (make-ingredient "pistache" (tablespoon 2))))
       (make-recipe "Tilapia aux noix et a l'erable" 1
		    (list
		     (make-ingredient "filet de tilapia de 100 g" 1)
		     (make-ingredient "jus d'orange" (tablespoon 2))
		     (make-ingredient "huile d'olive" (teaspoon 1))
		     (make-ingredient "gousse d'ail" 1)
		     (make-ingredient "oignon" (tablespoon 2))
		     (make-ingredient "tranche de prosciutto" 1)
		     (make-ingredient "noix de grenoble" (tablespoon 2))
		     (make-ingredient "sirop d'erable" (teaspoon 2))))
      
      ))

(swap! *all-recipes* concat recipes-300-399-1)
