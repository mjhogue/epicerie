            ;; SEMAINE 4 DU LIVRE 2
(ns epicerie.semaines.semaine-2-4-modif
  (:use epicerie.core))
            
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 4e semaine du livre 2
(def lun-dej-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "beurre d'arachide" (tablespoon 1))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "pamplemousse" 1/2)))))

;; Collation 1 du lundi de la 4e semaine du livre 2
(def lun-col1-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette muffin courgette et citron" 1)))))

;; Diner du lundi de la 4e semaine du livre 2
(def lun-diner-2-4
     (list
      (get-recipe "Pita moyen-oriental" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "yogourt allege de 100 g" 1)
		    (make-ingredient "ananas" (cup 1/2))))))

;; Collation 2 du lundi de la 4e semaine du livre 2
(def lun-col2-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "graines de tournesol" (tablespoon 1))
		    (make-ingredient "poivron" (cup 1/2))))))

;; Souper du lundi de la 4e semaine du livre 2
(def lun-souper-2-4
     (list
      (get-recipe "Poulet facon tandoori" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz brun" (cup (* 2 1/2)))
		    (make-ingredient "chou-fleur" (cup (* 2 1)))
		    (make-ingredient "clementine" 1)))))

;; Lundi de la 4e semaine du livre 2
(def lundi-2-4
     (concat
      lun-dej-2-4
      lun-col1-2-4
      lun-diner-2-4
      lun-col2-2-4
      lun-souper-2-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 4e semaine du livre 2
(def mar-dej-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau" (cup 3/4))
		    (make-ingredient "sirop d'erable" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Collation 1 du mardi de la 4e semaine du livre 2
(def mar-col1-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "chou-fleur" (cup 1/2))
		    (make-ingredient "hoummos" (tablespoon 3))))))

;; Diner du mardi de la 4e semaine du livre 2
(def mar-diner-2-4
     (list
      (get-recipe "Coleslaw au poulet" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 2)
		    (make-ingredient "prune" 1)))))

;; Collation 2 du mardi de la 4e semaine du livre 2
(def mar-col2-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "pita ble entier" 1/2)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))))))

;; Souper du mardi de la 4e semaine du livre 2
(def mar-souper-2-4
     (list
      (get-recipe "Salade tomates, fromage et amandes" 1)))


;; Mardi de la 4e semaine du livre 2
(def mardi-2-4
     (concat
      mar-dej-2-4
      mar-col1-2-4
      mar-diner-2-4
      mar-col2-2-4
      mar-souper-2-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 4e semaine du livre 2
(def mer-dej-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette muffin courgette et citron" 1)
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "prune" 1)
		    (make-ingredient "oeuf" 1)))))

;; Collation 1 du mercredi de la 4e semaine du livre 2
(def mer-col1-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 3)
		    (make-ingredient "hoummos" (teaspoon 5))))))

;; Diner du mercredi de la 4e semaine du livre 2
(def mer-diner-2-4
     (list
      (get-recipe "Salade arc-en-ciel" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "pita ble entier" 1/2)
		    (make-ingredient "fraise" (cup 1/4))))))

;; Collation 2 du mercredi de la 4e semaine du livre 2
(def mer-col2-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "graines de tournesol" (tablespoon 2))
		    (make-ingredient "concombre" (cup 1/2))))))

;; Souper du mercredi de la 4e semaine du livre 2
(def mer-souper-2-4
     (list
      (get-recipe "Crevettes marinees au lait de coco" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "nouilles de riz" (cup (* 2 1/2)))
		    (make-ingredient "poivron" (cup (* 2 1)))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Mercredi de la 4e semaine du livre 2
(def mercredi-2-4
     (concat
      mer-dej-2-4
      mer-col1-2-4
      mer-diner-2-4
      mer-col2-2-4
      mer-souper-2-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 4e semaine du livre 2
(def jeu-dej-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de ble filamente" (cup 1))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "ananas" (cup 1/2))
		    (make-ingredient "graines de lin moulues" (tablespoon 1))))))

;; Collation 1 du jeudi de la 4e semaine du livre 2
(def jeu-col1-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "graines de tournesol" (tablespoon 2))
		    (make-ingredient "clementine" 2)))))

;; Diner du jeudi de la 4e semaine du livre 2
(def jeu-diner-2-4
     (list
      (get-recipe "Salade de la mer" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 1/3))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "sirop d'erable" (teaspoon 1/2))))))

;; Collation 2 du jeudi de la 4e semaine du livre 2
(def jeu-col2-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain aux raisins" 1)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))))))

;; Souper du jeudi  de la 4e semaine du livre 2
(def jeu-souper-2-4
     (list
      (get-recipe "Salade prosciutto, laitue, tomates" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Jeudi de la 4e semaine du livre 2
(def jeudi-2-4
     (concat
      jeu-dej-2-4
      jeu-col1-2-4
      jeu-diner-2-4
      jeu-col2-2-4
      jeu-souper-2-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 4e semaine du livre 2
(def ven-dej-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "beurre d'arachide" (tablespoon 1))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "pamplemousse" 1/2)))))

;; Collation 1 du vendredi de la 4e semaine du livre 2
(def ven-col1-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fenouil" (cup 1/2))))))

;; Diner du vendredi de la 4e semaine du livre 2
(def ven-diner-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette minestrone" 1)
		    (make-ingredient "pita ble entier" 1/2)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "prune" 1)
		    (make-ingredient "recette galette aux bleuets et aux graines de lin" 1)))))

;; Collation 2 du vendredi de la 4e semaine du livre 2
(def ven-col2-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Souper du vendredi de la 4e semaine du livre 2
(def ven-souper-2-4
     (list
      (get-recipe "Tilapia aux olives" 2)
      (get-recipe "Salade d'epinards (option fraises)" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "quinoa" (cup (* 2 1/2)))))))
      

;; Vendredi de la 4e semaine du livre 2
(def vendredi-2-4
     (concat
      ven-dej-2-4
      ven-col1-2-4
      ven-diner-2-4
      ven-col2-2-4
      ven-souper-2-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 4e semaine du livre 2
(def sam-dej-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 4e semaine du livre 2
(def sam-col1-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du samedi de la 4e semaine du livre 2
(def sam-diner-2-4
     (list
      (get-recipe "Galette forestiere" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 2)))))

;; Collation 2 du samedi de la 4e semaine du livre 2
(def sam-col2-2-4
     (list
      (get-recipe "Salade orangee" 2)))

;; Souper du samedi de la 4e semaine du livre 2
(def sam-souper-2-4
     (list
      (get-recipe "Magret de canard a l'orange" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "pomme de terre" (* 2 1/2))
		    (make-ingredient "asperge" (cup (* 2 1/2)))))))

;; Samedi de la 4e semaine du livre 2
(def samedi-2-4
     (concat
      sam-dej-2-4
      sam-col1-2-4
      sam-diner-2-4
      sam-col2-2-4
      sam-souper-2-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 4e semaine du livre 2
(def dim-dej-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain aux raisins" 1)
		    (make-ingredient "margarine non hydrogenee" (teaspoon 1))
		    (make-ingredient "gruau" (cup 3/4))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "fraise" (cup 1/2))))))

;; Collation 1 du dimanche de la 4e semaine du livre 2
(def dim-col1-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 1/3))))))

;; Diner du dimanche de la 4e semaine du livre 2
(def dim-diner-2-4
     (list
      (get-recipe "Salade crevettes et ananas" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 2)))))

;; Collation 2 du dimanche de la 4e semaine du livre 2
(def dim-col2-2-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))


;; Souper du dimanche de la 4e semaine du livre 2
(def dim-souper-2-4
     (list
      (get-recipe "Pilons de poulet aux herbes" 2)
      (get-recipe "Salade de chou cremeuse" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "lait de soya" (cup 1/2))
		    (make-ingredient "recette salade orangee" 2)))))

;; Dimanche de la 4e semaine du livre 2
(def dimanche-2-4
     (concat
      dim-dej-2-4
      dim-col1-2-4
      dim-diner-2-4
      dim-col2-2-4
      dim-souper-2-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  2-4 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 2-4
(def semaine-2-4-modif
     (concat
      lundi-2-4
      mardi-2-4
      mercredi-2-4
      jeudi-2-4
      vendredi-2-4))
