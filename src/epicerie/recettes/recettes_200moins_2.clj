(ns epicerie.recettes.recettes-200moins-2
  (:use epicerie.core))

					; DEFINITION DES RECETTES DE MOINS DE 200 CALORIES - LIVRE 2

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter


;; Recettes de moins de 200 Calories du livre 2
(def recipes-less-200-2
     (list
      (make-recipe "Aiglefin sur fenouil braise" 2
		   (list
		    (make-ingredient "bulbe de fenouil" 1)
		    (make-ingredient "bouillon de poulet" (cup 1/2))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "orange" 1)
		    (make-ingredient "thym seche" (teaspoon 1/4))
		    (make-ingredient "filet d'aiglefin" (gram 270))))
      (make-recipe "Brochettes de lotte teriyaki aux peches" 2
		   (list
		    (make-ingredient "sauce soya" (tablespoon 1))
		    (make-ingredient "miel" (tablespoon 1/2))
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "flocons de piment" 1)
		    (make-ingredient "lotte" (gram 180))
		    (make-ingredient "peche" 2)))
      (make-recipe "Crevettes croustillantes au coco" 2
		   (list
		    (make-ingredient "grosse crevette" (gram 180))
		    (make-ingredient "miel" (teaspoon 2))
		    (make-ingredient "noix de coco rapee non sucree" (tablespoon 3))
		    (make-ingredient "lime" 1)))
      (make-recipe "Crevettes marinees au lait de coco" 2
		   (list
		    (make-ingredient "lait de coco allege" (cup 1/2))
		    (make-ingredient "sauce soya" (tablespoon 4))
		    (make-ingredient "flocons de piment" 1)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "petites crevettes environ 7 g" 12)
		    (make-ingredient "huile de canola" (teaspoon 1))))
      (make-recipe "Dindon en croute de noix et de miel" 2
		   (list
		    (make-ingredient "miel" (tablespoon 1/2))
		    (make-ingredient "moutarde de dijon" (teaspoon 2))
		    (make-ingredient "noix de grenoble" (cup 1/4))
		    (make-ingredient "escalope de poulet de 80 g" 2)))
      (make-recipe "Escalopes de poulet pane au mais" 2
		   (list
		    (make-ingredient "escalope de poulet" (gram 330))
		    (make-ingredient "moutarde de dijon" (tablespoon 1/2))
		    (make-ingredient "semoule de mais" (cup 1/4))
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "citron" 1)))
      (make-recipe "Escalopes de veau facon saltimboca" 2
		   (list
		    (make-ingredient "escalope de veau de 80 g" 2)
		    (make-ingredient "tranche mince de prosciutto environ 15 g" 2)
		    (make-ingredient "feuille de sauge fraiche" 2)
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "bouillon de poulet" (cup 1/3))))
      (make-recipe "Filet de porc aux canneberges" 2
		   (list
		    (make-ingredient "filet de porc 330 g" 1)
		    (make-ingredient "huile de canola" (teaspoon 1))
		    (make-ingredient "jus d'orange" (cup 1/4))
		    (make-ingredient "canneberge fraiche" (cup 1/2))
		    (make-ingredient "moutarde de dijon" (teaspoon 1))
		    (make-ingredient "herbes de provence" (teaspoon 1/2))))
      (make-recipe "Galette complete" 2
		   (list
		    (make-ingredient "farine de sarrasin" (cup 1/2))
		    (make-ingredient "sel" (teaspoon 1/2))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "eau" (cup 2/3))
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 2))
		    (make-ingredient "oeuf" 2)))
      (make-recipe "Mahi-mahi en croute de germe de ble" 2
		   (list
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "germe de ble" (tablespoon 1))
		    (make-ingredient "herbes de provence" (teaspoon 1))
		    (make-ingredient "paprika" (teaspoon 1/2))
		    (make-ingredient "filet de mahi-mahi" (gram 240))))
      (make-recipe "Minestrone" 1
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" 1/4)
		    (make-ingredient "carotte" (cup 1/3))
		    (make-ingredient "celeri" (cup 1/3))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "eau" (cup (+ 1 1/2)))
		    (make-ingredient "petite pomme de terre" 1)
		    (make-ingredient "boite de 540 ml de tomates en des" 1/2)
		    (make-ingredient "feuille de laurier" 1)
		    (make-ingredient "basilic seche" (teaspoon 1/2))
		    (make-ingredient "origan seche" (teaspoon 1/2))
		    (make-ingredient "courgette" 1)
		    (make-ingredient "boite de 540 ml de haricots rouges" 1/2)))
      (make-recipe "Morue aux olives" 2
		   (list
		    (make-ingredient "filet de morue" (gram 270))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "tomate italienne" 3)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "herbes de provence" (teaspoon 1/2))
		    (make-ingredient "olive noire" (cup 1/3))
		    (make-ingredient "basilic frais" 1)))
      (make-recipe "Pain aux noix pomme-ricotta" 1
		   (list
		    (make-ingredient "tranche de pain aux noix" 1)
		    (make-ingredient "fromage ricotta allege" (cup 1/4))
		    (make-ingredient "roquette" (cup 1/2))
		    (make-ingredient "pomme" 1/2)))
      (make-recipe "Poulet facon tandoori" 2
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 1/2))
		    (make-ingredient "pate de cari rouge" (tablespoon 1))
		    (make-ingredient "paprika" (tablespoon 1))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "poulet" (gram 300))))
      (make-recipe "Salade carottes et raisins sec" 1
		   (list
		    (make-ingredient "carotte" (cup 1))
		    (make-ingredient "raisins secs" (teaspoon 2))
		    (make-ingredient "jus d'orange" (teaspoon 2))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "cannelle ou cumin" 1)))
      (make-recipe "Salade de chou cremeuse" 1
		   (list
		    (make-ingredient "chou" (cup 1))
		    (make-ingredient "mayonnaise" (tablespoon 1/2))
		    (make-ingredient "yogourt nature sans gras" (tablespoon 1/2))
		    (make-ingredient "vinaigre blanc" (teaspoon 1/4))
		    (make-ingredient "miel" (teaspoon 1/4))))
      (make-recipe "Salade d'epinards (option fraises)" 1
		   (list
		    (make-ingredient "epinard" (cup 3/4))
		    (make-ingredient "fraise" (tablespoon 2))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de framboise" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))))
      (make-recipe "Salade d'epinards (option radis)" 1
		   (list
		    (make-ingredient "epinard" (cup 3/4))
		    (make-ingredient "radis" 4)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de framboise" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))))
      (make-recipe "Salade d'epinards (option raisins)" 1
		   (list
		    (make-ingredient "epinard" (cup 3/4))
		    (make-ingredient "raisin rouge" 4)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre de framboise" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1))))
      (make-recipe "Salade de roquette" 1
		   (list
		    (make-ingredient "roquette" (cup 3/4))
		    (make-ingredient "concombre" (cup 1/4))
		    (make-ingredient "tomate cerise" 2)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "vinaigre balsamique" (teaspoon 1))
		    (make-ingredient "jus de citron" (teaspoon 1/2))))
      (make-recipe "Salade toute verte" 1
		   (list
		    (make-ingredient "laitue" (cup 3/4))
		    (make-ingredient "concombre" (cup 1/4))
		    (make-ingredient "celeri" (tablespoon 2))
		    (make-ingredient "herbes de provence" (tablespoon 2))
		    (make-ingredient "oignon vert" 1/2)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "eau" (teaspoon 1/2))
		    (make-ingredient "vinaigre balsamique" (teaspoon 1))
		    (make-ingredient "moutarde de dijon" (teaspoon 1/2))))
      (make-recipe "Saumon a la sauce vierge" 2
		   (list
		    (make-ingredient "saumon" (gram 180))
		    (make-ingredient "persil" (tablespoon 2))
		    (make-ingredient "basilic" (tablespoon 2))
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "jus de citron" (tablespoon 1/2))
		    (make-ingredient "huile d'olive" (teaspoon 4))
		    (make-ingredient "tomate cerise" 20)))
      (make-recipe "Sole a l'orange" 2
		   (list
		    (make-ingredient "filet de sole" (gram 270))
		    (make-ingredient "huile d'olive" (tablespoon 1/2))
		    (make-ingredient "jus d'orange" (cup 1/4))
		    (make-ingredient "sauce soya" (teaspoon 1))
		    (make-ingredient "fecule de mais" (teaspoon 1))
		    (make-ingredient "sirop d'erable" (teaspoon 1))
		    (make-ingredient "gingembre frais" (teaspoon 1/4))))
      (make-recipe "Soupe a la courge musquee, au cari et aux pommes" 1
		   (list
		    (make-ingredient "courge musquee (butternut)" 1)
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "poudre de cari" (teaspoon 1))
		    (make-ingredient "grosse pomme type Cortland" 1)
		    (make-ingredient "eau" (cup 3))))
      (make-recipe "Soupe aux carottes et au gingembre" 1
		   (list
		    (make-ingredient "huile de canola" (teaspoon 2))
		    (make-ingredient "petit oignon" 1/2)
		    (make-ingredient "carotte" (cup 2))
		    (make-ingredient "pomme de terre" (cup 1/2))
		    (make-ingredient "eau" (cup 3))
		    (make-ingredient "gingembre frais" (teaspoon 1))))
      (make-recipe "Tilapia a la lime" 2
		   (list
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "lime" 2)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "filet de tilapia" (gram 270))
		    (make-ingredient "persil frais" 1)))
      (make-recipe "Tilapia aux olives" 2
		   (list
		    (make-ingredient "filet de tilapia" (gram 270))
		    (make-ingredient "huile d'olive" (teaspoon 1))
		    (make-ingredient "oignon" 1/2)
		    (make-ingredient "tomate italienne" 3)
		    (make-ingredient "gousse d'ail" 1)
		    (make-ingredient "herbes de provence" (teaspoon 1/2))
		    (make-ingredient "olive noire" (cup 1/3))))
      (make-recipe "Tilapia cajun" 2
		   (list
		    (make-ingredient "cereales de son" (cup 1/4))
		    (make-ingredient "paprika" (teaspoon 2))
		    (make-ingredient "poudre de chili" (teaspoon 2))
		    (make-ingredient "origan" (teaspoon 1))
		    (make-ingredient "filet de tilapia" (gram 270))))
      (make-recipe "Tournedos de petoncles" 2
		   (list
		    (make-ingredient "tranche mince de prosciutto" 2)
		    (make-ingredient "petoncle" (gram 270))
		    (make-ingredient "huile d'olive" (teaspoon 2))
		    (make-ingredient "citron" 1)))
      ))

(swap! *all-recipes* concat recipes-less-200-2)
