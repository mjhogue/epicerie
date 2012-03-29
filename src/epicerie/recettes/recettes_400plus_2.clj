(ns epicerie.recettes.recettes-400plus-2
  (:use epicerie.core))

					; DEFINITION DES RECETTES DE PLUS DE 400 CALORIES - LIVRE 2

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Recettes de plus de 400 Calories du livre 2
(def recipes-400-more-2
     (list
      (make-recipe "Couscous au poulet et aux fruits seches" 1
		   (list
		    (make-ingredient "couscous cuit" (cup 1))
		    (make-ingredient "poulet cuit" (gram 75))
		    (make-ingredient "feta allege" (gram 25))
		    (make-ingredient "pomme" 1/2)
		    (make-ingredient "poivron rouge" (tablespoon 2))
		    (make-ingredient "canneberges sechees" (tablespoon 1))
		    (make-ingredient "oignon vert" 1/2)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))
		    (make-ingredient "poudre de cari" (teaspoon 1/4))))
      (make-recipe "Couscous royal au poulet" 2
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "poulet" (gram 360))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "epice a couscous (ras-el-hanout)" (tablespoon 1))
		    (make-ingredient "pate de tomate" (tablespoon 1/2))
		    (make-ingredient "carotte" 2)
		    (make-ingredient "bouillon de poulet" (cup 1))
		    (make-ingredient "courgette" 1)
		    (make-ingredient "raisin sec" (tablespoon 1))
		    (make-ingredient "pois chiche" (cup 1/2))
		    (make-ingredient "eau" (cup (+ 1 1/4)))
		    (make-ingredient "couscous ble entier" (gram 140))
		    (make-ingredient "persil" 1)))
      (make-recipe "Linguines aux palourdes" 2
		   (list
		    (make-ingredient "spaghetti ble entier" (gram 150))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" 1)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "tomate cerise" 10)
		    (make-ingredient "bouillon de poulet" (cup 1/2))
		    (make-ingredient "boite de 142 g de palourdes" 1)))
      (make-recipe "Penne au thon et aux tomates" 2
		   (list
		    (make-ingredient "penne ble entier" (gram 240))
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "tomate cerise" 20)
		    (make-ingredient "olive noire" (cup 1/4))
		    (make-ingredient "boite de 170 g de thon" 1)
		    (make-ingredient "basilic frais" (tablespoon 2))))
      (make-recipe "Pizza mexicaine" 2
		   (list
		    (make-ingredient "boite de 540 ml de haricots rouges" 1)
		    (make-ingredient "eau" (cup 1/2))
		    (make-ingredient "citron" 1)
		    (make-ingredient "gousse d'ail" 2)
		    (make-ingredient "cumin" (tablespoon 2))
		    (make-ingredient "coriandre" (teaspoon 1))
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "boeuf hache extra maigre" (gram 90))
		    (make-ingredient "tortilla ble entier" 2)
		    (make-ingredient "poivron rouge" 1/2)
		    (make-ingredient "oignon vert" 2)
		    (make-ingredient "fromage mozzarella allege" (gram 50))))
      (make-recipe "Salade quinoa, tofu et gouda" 1
		   (list
		    (make-ingredient "quinoa cuit" (cup 1))
		    (make-ingredient "tofu" (gram 75))
		    (make-ingredient "gouda allege" (gram 25))
		    (make-ingredient "carotte" (cup 1/2))
		    (make-ingredient "oignon vert" 1)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "jus de lime" 1/2)))
      (make-recipe "Tofu marine aux tomates" 2
		   (list
		    (make-ingredient "feuille de basilic frais" 4)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "vinaigre balsamique" (teaspoon 2))
		    (make-ingredient "bloc de 300 g de tofu ferme" 1)
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "boite de 540 ml de tomates en des" 1)
		    (make-ingredient "fromage allege" (gram 30))
		    (make-ingredient "olive noire" 4))))
 )

(swap! *all-recipes* concat recipes-400-more-2)
