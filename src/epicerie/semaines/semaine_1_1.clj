                                                                  ;; SEMAINE 1 DU LIVRE 1
(ns epicerie.semaines.semaine-1-1
  (:use epicerie.core)
  (:use [epicerie.recettes autres-1 autres-2 recettes-200-299-1 recettes-200-299-2 recettes-200moins-1 recettes-200moins-1
         recettes-300-399-1 recettes-300-399-2 recettes-400plus-1 recettes-400plus-2]))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 1e semaine du livre 1
(def lun-dej-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "jus d'orange" (cup 1/2))
		    (make-ingredient "cereales de son" (cup 1))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 1e semaine du livre 1
(def lun-col1-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fraise" (cup 1))
		    (make-ingredient "amandes" (tablespoon 2))))))

;; Diner du lundi de la 1e semaine du livre 1
(def lun-diner-1-1
     (list
      (get-recipe "Salade la grecque" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "pita ble entier" 1)
		    (make-ingredient "ananas" (cup 1/2))))))

;; Souper du lundi de la 1e semaine du livre 1
(def lun-souper-1-1
     (list
      (get-recipe "Filet de poisson bordelais" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz brun" (cup (* 2 1/2)))
		    (make-ingredient "courgette" (cup (* 2 1))) ))))

;; Lundi de la 1e semaine du livre 1
(def lundi-1-1
     (concat
      lun-dej-1-1
      lun-col1-1-1
      lun-diner-1-1
      lun-souper-1-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 1e semaine du livre 1
(def mar-dej-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "beurre d'arachide" (tablespoon 1))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 1e semaine du livre 1
(def mar-col1-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cantaloup" (cup 1/2))))))

;; Diner du mardi de la 1e semaine du livre 1
(def mar-diner-1-1
     (list
      (get-recipe "Salade l'oeuf en folie" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 4)))))

;; Souper du mardi de la 1e semaine du livre 1
(def mar-souper-1-1
     (list
      (get-recipe "Soupe-repas aux lentilles" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "pita ble entier" 1/2)
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Mardi de la 1e semaine du livre 1
(def mardi-1-1
     (concat
      mar-dej-1-1
      mar-col1-1-1
      mar-diner-1-1
      mar-souper-1-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 1e semaine du livre 1
(def mer-dej-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "poire" 1/2)
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "bagel ble entier" 1/2)
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 1))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 1e semaine du livre 1
(def mer-col1-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "amandes" (tablespoon 2))))))

;; Diner du mercredi de la 1e semaine du livre 1
(def mer-diner-1-1
     (list
      ;;(get-recipe "Sandwich Le sucre sale" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1))
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Souper du mercredi de la 1e semaine du livre 1
(def mer-souper-1-1
     (list
      (get-recipe "Spaghetti sauce primavera" 2)
      (get-recipe "Sauce primavera" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "parmesan" (tablespoon (* 2 2)))
		    (make-ingredient "cantaloup" (cup 1))))))

;; Mercredi de la 1e semaine du livre 1
(def mercredi-1-1
     (concat
      mer-dej-1-1
      mer-col1-1-1
      mer-diner-1-1
      mer-souper-1-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 1e semaine du livre 1
(def jeu-dej-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "muffin anglais ble entier" 1/2)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 1e semaine du livre 1
(def jeu-col1-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "graines de tournesol" (tablespoon 3))))))

;; Diner du jeudi de la 1e semaine du livre 1
(def jeu-diner-1-1
     (list
      (get-recipe "Spaghetti sauce primavera" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "cantaloup" (cup 1/2))))))

;; Souper du jeudi  de la 1e semaine du livre 1
(def jeu-souper-1-1
     (list
      ;;(get-recipe "Cotelette de porc braisee" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1)))
		    (make-ingredient "poivron" (cup (* 2 1/2)))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Jeudi de la 1e semaine du livre 1
(def jeudi-1-1
     (concat
      jeu-dej-1-1
      jeu-col1-1-1
      jeu-diner-1-1
      jeu-souper-1-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 1e semaine du livre 1
(def ven-dej-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "pamplemousse" 1/2)
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 1e semaine du livre 1
(def ven-col1-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 4)
		    (make-ingredient "fromage allege" (gram 25))))))

;; Diner du vendredi de la 1e semaine du livre 1
(def ven-diner-1-1
     (list
      (get-recipe "Sandwich L'italien" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "poivron" (cup 1/2))))))

;; Souper du vendredi de la 1e semaine du livre 1
(def ven-souper-1-1
     (list
      (get-recipe "Petoncles grilles au citron et au thym" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 1/2)))
		    (make-ingredient "brocoli" (cup (* 2 1)))))))

;; Vendredi de la 1e semaine du livre 1
(def vendredi-1-1
     (concat
      ven-dej-1-1
      ven-col1-1-1
      ven-diner-1-1
      ven-souper-1-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 1e semaine du livre 1
(def sam-dej-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "pamplemousse" 1/2)
		    (make-ingredient "gruau nature" (cup 3/4))
		    (make-ingredient "sirop d'erable" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 1e semaine du livre 1
(def sam-col1-1-1
     (list
      (get-recipe "Carre aux framboises" 1)))

;; Diner du samedi de la 1e semaine du livre 1
(def sam-diner-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain dore" (* 2 2))
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "cantaloup" (cup 1/2))
		    (make-ingredient "fraise" (cup 1/2))))))

;; Souper du samedi de la 1e semaine du livre 1
(def sam-souper-1-1
     (list
      (get-recipe "Steak aux fines herbes" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 3)
		    (make-ingredient "jus de legumes" (cup 1/2))
		    (make-ingredient "courgette" (cup (* 2 1)))))))

;; Samedi de la 1e semaine du livre 1
(def samedi-1-1
     (concat
      sam-dej-1-1
      sam-col1-1-1
      sam-diner-1-1
      sam-souper-1-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 1e semaine du livre 1
(def dim-dej-1-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cantaloup" (cup 1/2))
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "cereales de type granola legeres" (cup 1/4))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 1 du dimanche de la 1e semaine du livre 1
(def dim-col1-1-1
     (list
      (get-recipe "Muffins aux carottes et aux canneberges" 1)))

;; Diner du dimanche de la 1e semaine du livre 1
(def dim-diner-1-1
     (list
      (get-recipe "Omelette aux herbes du jardin" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Souper du dimanche de la 1e semaine du livre 1
(def dim-souper-1-1
     (list
      (get-recipe "Poulet parmesan" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "brocoli" (cup (* 2 1)))
		    (make-ingredient "biscotte melba" 3)))))

;; Dimanche de la 1e semaine du livre 1
(def dimanche-1-1
     (concat
      dim-dej-1-1
      dim-col1-1-1
      dim-diner-1-1
      dim-souper-1-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  1-1 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 1-1
(def semaine-1-1
     (concat
      lundi-1-1
      mardi-1-1
      mercredi-1-1
      jeudi-1-1
      vendredi-1-1
      samedi-1-1
      dimanche-1-1))
