                                                                  ;; SEMAINE 7 DU LIVRE 2
(ns epicerie.semaines.semaine-2-7
  (:use epicerie.core))     
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 7e semaine du livre 2
(def lun-dej-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau" (cup 3/4))
		    (make-ingredient "sirop d'erable" (teaspoon 1/2))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 7e semaine du livre 2
(def lun-col1-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain aux raisons" 1)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))))))

;; Diner du lundi de la 7e semaine du livre 2
(def lun-diner-2-7
     (list
      (get-recipe "Salade arc-en-ciel" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 2)))))

;; Collation 2 du lundi de la 7e semaine du livre 2
(def lun-col2-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "tomate cerise" 10))))

;; Souper du lundi de la 7e semaine du livre 2
(def lun-souper-2-7
     (list
      (get-recipe "Sole manadine" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz brun" (cup (* 2 1/2)))
		    (make-ingredient "haricot noir" (cup (* 2 3/4)))
		    (make-ingredient "asperge" (cup (* 2 1/2)))))))

;; Lundi de la 7e semaine du livre 2
(def lundi-2-7
     (concat
      lun-dej-2-7
      lun-col1-2-7
      lun-diner-2-7
      lun-col2-2-7
      lun-souper-2-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 7e semaine du livre 2
(def mar-dej-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette muffin courgette et citron" 1)
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "bleuet" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 7e semaine du livre 2
(def mar-col1-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))

;; Diner du mardi de la 7e semaine du livre 2
(def mar-diner-2-7
     (list
      (get-recipe "Ciabatta poulet-pesto" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "pomme" 1)))))

;; Collation 2 du mardi de la 7e semaine du livre 2
(def mar-col2-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fraise" (cup 1/2))))))

;; Souper du mardi de la 7e semaine du livre 2
(def mar-souper-2-7
     (list
      (get-recipe "Falafels avec tzatziki" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1/2)))
		    (make-ingredient "poivron" (cup (* 2 1)))))))

;; Mardi de la 7e semaine du livre 2
(def mardi-2-7
     (concat
      mar-dej-2-7
      mar-col1-2-7
      mar-diner-2-7
      mar-col2-2-7
      mar-souper-2-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 7e semaine du livre 2
(def mer-dej-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "ciabbata ble entier" 2)
		    (make-ingredient "beurre d'arachide" (tablespoon 1))
		    (make-ingredient "ananas" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 7e semaine du livre 2
(def mer-col1-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "pistaches" (tablespoon 2))))))

;; Diner du mercredi de la 7e semaine du livre 2
(def mer-diner-2-7
     (list
      (get-recipe "Pain aux nois pomme-ricotta" 1)
      (get-recipe "Salade de roquette" 1)))


;; Collation 2 du mercredi de la 7e semaine du livre 2
(def mer-col2-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "bleuet" (cup 1/2))))))

;; Souper du mercredi de la 7e semaine du livre 2
(def mer-souper-2-7
     (list
      (get-recipe "Saute de poulet thai aux poivrons" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "nouilles soba" (cup (* 2 1)))
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Mercredi de la 7e semaine du livre 2
(def mercredi-2-7
     (concat
      mer-dej-2-7
      mer-col1-2-7
      mer-diner-2-7
      mer-col2-2-7
      mer-souper-2-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 7e semaine du livre 2
(def jeu-dej-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de son" (cup 1/2))
		    (make-ingredient "cereales de mais" (cup 1/2))
		    (make-ingredient "graines de lin moulues" (tablespoon 1))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "kiwi" 1)))))

;; Collation 1 du jeudi de la 7e semaine du livre 2
(def jeu-col1-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromane cottage 1 %" (cup 1/2))
		    (make-ingredient "amandes" (tablespoon 2))))))

;; Diner du jeudi de la 7e semaine du livre 2
(def jeu-diner-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette soupe aux carottes et au gingembre" 1)
		    (make-ingredient "tranche de pain aux noix" 1)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "pistaches" (tablespoon 2))))))

;; Collation 2 du jeudi de la 7e semaine du livre 2
(def jeu-col2-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "carotte" (cup 1/2))))))

;; Souper du jeudi  de la 7e semaine du livre 2
(def jeu-souper-2-7
     (list
      (get-recipe "Penne au thon et aux tomates" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "cantaloup" (cup 1/2))))))

;; Jeudi de la 7e semaine du livre 2
(def jeudi-2-7
     (concat
      jeu-dej-2-7
      jeu-col1-2-7
      jeu-diner-2-7
      jeu-col2-2-7
      jeu-souper-2-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 7e semaine du livre 2
(def ven-dej-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 7e semaine du livre 2
(def ven-col1-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "ananas" (cup 1/2))))))

;; Diner du vendredi de la 7e semaine du livre 2
(def ven-diner-2-7
     (list
      (get-recipe "Salade pates, tomates et olives noires" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Collation 2 du vendredi de la 7e semaine du livre 2
(def ven-col2-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Souper du vendredi de la 7e semaine du livre 2
(def ven-souper-2-7
     (list
      (get-recipe "Medaillons de boeuf teriyaki" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "pomme de terre" (* 2 1))
		    (make-ingredient "brocoli" (cup (* 2 1)))))))
      
;; Vendredi de la 7e semaine du livre 2
(def vendredi-2-7
     (concat
      ven-dej-2-7
      ven-col1-2-7
      ven-diner-2-7
      ven-col2-2-7
      ven-souper-2-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 7e semaine du livre 2
(def sam-dej-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain aux raisins" 2)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 7e semaine du livre 2
(def sam-col1-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromage allege" (gram 25))))))

;; Diner du samedi de la 7e semaine du livre 2
(def sam-diner-2-7
     (list
      (get-recipe "Salade tomates, fromage et amandes" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 2)))))

;; Collation 2 du samedi de la 7e semaine du livre 2
(def sam-col2-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Souper du samedi de la 7e semaine du livre 2
(def sam-souper-2-7
     (list
      (get-recipe "Dore sur ratatouille" 2)
      (get-recipe "Pommes au four a l'erable" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz brun" (cup (* 2 1/2)))))))

;; Samedi de la 7e semaine du livre 2
(def samedi-2-7
     (concat
      sam-dej-2-7
      sam-col1-2-7
      sam-diner-2-7
      sam-col2-2-7
      sam-souper-2-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 7e semaine du livre 2
(def dim-dej-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "oeuf" 2)
		    (make-ingredient "margarine non hydrogenee" (teaspoon 1))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "cantaloup" (cup 1/2))))))

;; Collation 1 du dimanche de la 7e semaine du livre 2
(def dim-col1-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette muffin aux bananes" 1)))))

;; Diner du dimanche de la 7e semaine du livre 2
(def dim-diner-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette ratatouille" 1)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "tranche de pain aux noix" 1)))))

;; Collation 2 du dimanche de la 7e semaine du livre 2
(def dim-col2-2-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "ananas" (cup 1/2))))))

;; Souper du dimanche de la 7e semaine du livre 2
(def dim-souper-2-7
     (list
      (get-recipe "Escalopes de poulet pane au mais" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "mais" (cup (* 2 1/2)))
		    (make-ingredient "pomme de mer" (* 2 1/2))
		    (make-ingredient "courgette" (cup (* 2 1/2)))))))

;; Dimanche de la 7e semaine du livre 2
(def dimanche-2-7
     (concat
      dim-dej-2-7
      dim-col1-2-7
      dim-diner-2-7
      dim-col2-2-7
      dim-souper-2-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  2-7 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 2-7
(def semaine-2-7
     (concat
      lundi-2-7
      mardi-2-7
      mercredi-2-7
      jeudi-2-7
      vendredi-2-7
      samedi-2-7
      dimanche-2-7))
