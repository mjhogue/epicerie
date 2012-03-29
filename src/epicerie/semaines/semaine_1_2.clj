                                                                  ;; SEMAINE 2 DU LIVRE 1
(ns epicerie.semaines.semaine-1-2
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 2e semaine du livre 1
(def lun-dej-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "melon miel" (cup 3/4))
		    (make-ingredient "petit yogourt de 100g" 1)
        (make-ingredient "lait" (cup 1))))))

;; Collation 1 du lundi de la 2e semaine du livre 1
(def lun-col1-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "clementine" 1)))))

;; Diner du lundi de la 2e semaine du livre 1
(def lun-diner-1-2
     (list
      (get-recipe "Sandwich Le pita de la mer" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "carre aux framboises" 1)))))

;; Souper du lundi de la 2e semaine du livre 1
(def lun-souper-1-2
     (list
      (get-recipe "Poulet au wok" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "pain pita ble entier" 1/2)
		    (make-ingredient "lait" (cup 1/2)) ))))

;; Lundi de la 2e semaine du livre 1
(def lundi-1-2
     (concat
      lun-dej-1-2
      lun-col1-1-2
      lun-diner-1-2
      lun-souper-1-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 2e semaine du livre 1
(def mar-dej-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "beurre d'arachide" (tablespoon 1))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 2e semaine du livre 1
(def mar-col1-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cantaloup" (cup 1/2))))))

;; Diner du mardi de la 2e semaine du livre 1
(def mar-diner-1-2
     (list
      (get-recipe "Salade l'oeuf en folie" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 4)))))

;; Souper du mardi de la 2e semaine du livre 1
(def mar-souper-1-2
     (list
      (get-recipe "Soupe-repas aux lentilles" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "pita ble entier" 1/2)
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Mardi de la 2e semaine du livre 1
(def mardi-1-2
     (concat
      mar-dej-1-2
      mar-col1-1-2
      mar-diner-1-2
      mar-souper-1-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 2e semaine du livre 1
(def mer-dej-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "poire" 1/2)
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "bagel ble entier" 1/2)
		    (make-ingredient "beurre ou margarine non hydrogenee" (teaspoon 1))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 2e semaine du livre 1
(def mer-col1-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "amandes" (tablespoon 2))))))

;; Diner du mercredi de la 2e semaine du livre 1
(def mer-diner-1-2
     (list
      (get-recipe "Sandwich Le sucre sale" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1))
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Souper du mercredi de la 2e semaine du livre 1
(def mer-souper-1-2
     (list
      (get-recipe "Spaghetti sauce primavera" 2)
      (get-recipe "Sauce primavera" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "parmesan" (tablespoon (* 2 2)))
		    (make-ingredient "cantaloup" (cup 1))))))

;; Mercredi de la 2e semaine du livre 1
(def mercredi-1-2
     (concat
      mer-dej-1-2
      mer-col1-1-2
      mer-diner-1-2
      mer-souper-1-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 2e semaine du livre 1
(def jeu-dej-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "muffin anglais ble entier" 1/2)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 2e semaine du livre 1
(def jeu-col1-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "graines de tournesol" (tablespoon 3))))))

;; Diner du jeudi de la 2e semaine du livre 1
(def jeu-diner-1-2
     (list
      (get-recipe "Spaghetti sauce primavera" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "cantaloup" (cup 1/2))))))

;; Souper du jeudi  de la 2e semaine du livre 1
(def jeu-souper-1-2
     (list
      (get-recipe "Cotelette de porc braisee" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1)))
		    (make-ingredient "poivron" (cup (* 2 1/2)))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Jeudi de la 2e semaine du livre 1
(def jeudi-1-2
     (concat
      jeu-dej-1-2
      jeu-col1-1-2
      jeu-diner-1-2
      jeu-souper-1-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 2e semaine du livre 1
(def ven-dej-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "pamplemousse" 1/2)
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 2e semaine du livre 1
(def ven-col1-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 4)
		    (make-ingredient "fromage allege" (gram 25))))))

;; Diner du vendredi de la 2e semaine du livre 1
(def ven-diner-1-2
     (list
      (get-recipe "Sandwich L'italien" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "poivron" (cup 1/2))))))

;; Souper du vendredi de la 2e semaine du livre 1
(def ven-souper-1-2
     (list
      (get-recipe "Petoncles grilles au citron et au thym" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 1/2)))
		    (make-ingredient "brocoli" (cup (* 2 1)))))))

;; Vendredi de la 2e semaine du livre 1
(def vendredi-1-2
     (concat
      ven-dej-1-2
      ven-col1-1-2
      ven-diner-1-2
      ven-souper-1-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 2e semaine du livre 1
(def sam-dej-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "pamplemousse" 1/2)
		    (make-ingredient "gruau nature" (cup 3/4))
		    (make-ingredient "sirop d'erable" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 2e semaine du livre 1
(def sam-col1-1-2
     (list
      (get-recipe "Carre aux framboises" 1)))

;; Diner du samedi de la 2e semaine du livre 1
(def sam-diner-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain dore" (* 2 2))
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "cantaloup" (cup 1/2))
		    (make-ingredient "fraise" (cup 1/2))))))

;; Souper du samedi de la 2e semaine du livre 1
(def sam-souper-1-2
     (list
      (get-recipe "Steak aux fines herbes" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 3)
		    (make-ingredient "jus de legumes" (cup 1/2))
		    (make-ingredient "courgette" (cup (* 2 1)))))))

;; Samedi de la 2e semaine du livre 1
(def samedi-1-2
     (concat
      sam-dej-1-2
      sam-col1-1-2
      sam-diner-1-2
      sam-souper-1-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 2e semaine du livre 1
(def dim-dej-1-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cantaloup" (cup 1/2))
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "cereales de type granola legeres" (cup 1/4))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 1 du dimanche de la 2e semaine du livre 1
(def dim-col1-1-2
     (list
      (get-recipe "Muffins aux carottes et aux canneberges" 1)))

;; Diner du dimanche de la 2e semaine du livre 1
(def dim-diner-1-2
     (list
      (get-recipe "Omelette aux herbes du jardin" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Souper du dimanche de la 2e semaine du livre 1
(def dim-souper-1-2
     (list
      (get-recipe "Poulet parmesan" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "brocoli" (cup (* 2 1)))
		    (make-ingredient "biscotte melba" 3)))))

;; Dimanche de la 2e semaine du livre 1
(def dimanche-1-2
     (concat
      dim-dej-1-2
      dim-col1-1-2
      dim-diner-1-2
      dim-souper-1-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  1-2 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 1-2
(def semaine-1-2
     (concat
      lundi-1-2
      mardi-1-2
      mercredi-1-2
      jeudi-1-2
      vendredi-1-2
      samedi-1-2
      dimanche-1-2))


