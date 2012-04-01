                                                                  ;; SEMAINE 6 DU LIVRE 1
(ns epicerie.semaines.semaine-1-6-modif
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 6e semaine du livre 1
(def lun-dej-1-6
     (list
      (make-recipe 1
		   (list
        (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "fromage ecreme" (gram 25))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 6e semaine du livre 1
(def lun-col1-1-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tomate cerise" (cup 1/2))))))

;; Diner du lundi de la 6e semaine du livre 1
(def lun-diner-1-6
     (list
      (get-recipe "Salade la multicolore" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 2)
        (make-ingredient "Croustade aux prunes et aux framboises" 1)))))

;; Souper du lundi de la 6e semaine du livre 1
(def lun-souper-1-6
     (list
      (get-recipe "Escalopes de veau a la dijonnaise" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 1/2)))
        (make-ingredient "poivron" (cup 1))
        (make-ingredient "lait de soya" (cup 1/2))))))

;; Lundi de la 6e semaine du livre 1
(def lundi-1-6
     (concat
      lun-dej-1-6
      lun-col1-1-6
      lun-diner-1-6
      lun-souper-1-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 6e semaine du livre 1
(def mar-dej-1-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de ble" 1)
		    (make-ingredient "lait de soya" (cup 1))
        (make-ingredient "ananas" (cup 1/2))))))

;; Collation 1 du mardi de la 6e semaine du livre 1
(def mar-col1-1-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Carre aux framboises" 1)))))

;; Diner du mardi de la 6e semaine du livre 1
(def mar-diner-1-6
     (list
      (get-recipe "Sandwich l'italien" 1)
      (make-recipe 1
		   (list
        (make-ingredient "yogourt allege de 100 g" 1)
        (make-ingredient "prune" 1)))))

;; Souper du mardi de la 6e semaine du livre 1
(def mar-souper-1-6
     (list
      (get-recipe "Crevettes a la cantonaise" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 1/2)))
        (make-ingredient "chou-fleur" (cup (* 2 1)))))))

;; Mardi de la 6e semaine du livre 1
(def mardi-1-6
     (concat
      mar-dej-1-6
      mar-col1-1-6
      mar-diner-1-6
      mar-souper-1-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 6e semaine du livre 1
(def mer-dej-1-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain aux raisins" 2)
		    (make-ingredient "fromage cottage 1%" (cup 1/2))
        (make-ingredient "bleuet" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 6e semaine du livre 1
(def mer-col1-1-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromage ecreme" (gram 25))
        (make-ingredient "biscotte melba" 3)))))

;; Diner du mercredi de la 6e semaine du livre 1
(def mer-diner-1-6
     (list
      (get-recipe "Sandwich le pita de la mer" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))
        (make-ingredient "chou-fleur" (cup 1/2))))))

;; Souper du mercredi de la 6e semaine du livre 1
(def mer-souper-1-6
     (list
      (get-recipe "Saute de tofu aux legumes" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "nouille de riz" (cup (* 2 1/2)))
        (make-ingredient "mangue" (cup (* 2 1/2)))))))

;; Mercredi de la 6e semaine du livre 1
(def mercredi-1-6
     (concat
      mer-dej-1-6
      mer-col1-1-6
      mer-diner-1-6
      mer-souper-1-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 6e semaine du livre 1
(def jeu-dej-1-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Muffin aux noix" 1)
        (make-ingredient "oeuf" 1)
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 6e semaine du livre 1
(def jeu-col1-1-6
     (list
      (make-recipe 1
		   (list
        (make-ingredient "fraise" (cup 1/2))))))

;; Diner du jeudi de la 6e semaine du livre 1
(def jeu-diner-1-6
     (list
      (get-recipe "Salade la grecque" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "pita ble entier" 1)))))

;; Souper du jeudi  de la 6e semaine du livre 1
(def jeu-souper-1-6
     (list
      (get-recipe "Filet de porc primavera" 2)
      (make-recipe 1
		   (list
        (make-ingredient "couscous" (cup (* 2 1)))
        (make-ingredient "asperge" (cup (* 2 1)))))))

;; Jeudi de la 6e semaine du livre 1
(def jeudi-1-6
     (concat
      jeu-dej-1-6
      jeu-col1-1-6
      jeu-diner-1-6
      jeu-souper-1-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 6e semaine du livre 1
(def ven-dej-1-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
        (make-ingredient "fromage ecreme" (gram 25))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 6e semaine du livre 1
(def ven-col1-1-6
     (list
      (make-recipe 1
		   (list
        (make-ingredient "Barre granola maison" 1)))))

;; Diner du vendredi de la 6e semaine du livre 1
(def ven-diner-1-6
     (list
      (get-recipe "Salade la simplette" 1)
      (make-recipe 1
		   (list
        (make-ingredient "Filet de porc" 1)
        (make-ingredient "crouton ble entier" (cup 1/4))))))

;; Souper du vendredi de la 6e semaine du livre 1
(def ven-souper-1-6
     (list
      (get-recipe "Poivron farci au boeuf et au tofu" 2)
      (make-recipe 1
		   (list
        (make-ingredient "pita ble entier" 1/2)))))

;; Vendredi de la 6e semaine du livre 1
(def vendredi-1-6
     (concat
      ven-dej-1-6
      ven-col1-1-6
      ven-diner-1-6
      ven-souper-1-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 6e semaine du livre 1
(def sam-dej-1-6
     (list
      (get-recipe "Smoothie" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 1))))))

;; Collation 1 du samedi de la 6e semaine du livre 1
(def sam-col1-1-6
     (list
      (make-recipe 1
       (list
        (make-ingredient "yogourt nature sans gras" (cup 3/4))
        (make-ingredient "fraise" (cup 1/2))))))

;; Diner du samedi de la 6e semaine du livre 1
(def sam-diner-1-6
     (list
      (get-recipe "Omelette aux herbes du jardin" 2)
      (get-recipe "Salade la simplette" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "crouton ble entier" (cup (* 2 1/4)))
        (make-ingredient "muffin anglais ble entier" 1)))))

;; Souper du samedi de la 6e semaine du livre 1
(def sam-souper-1-6
     (list
      (get-recipe "Poulet tex-mex" 2)
      (get-recipe "Mousse aux bananes" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "pita ble entier" 1)))))

;; Samedi de la 6e semaine du livre 1
(def samedi-1-6
     (concat
      sam-dej-1-6
      sam-col1-1-6
      sam-diner-1-6
      sam-souper-1-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 6e semaine du livre 1
(def dim-dej-1-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau nature" (cup 3/4))
		    (make-ingredient "tranche de pain aux raisins" 1)
        (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du dimanche de la 6e semaine du livre 1
(def dim-col1-1-6
     (list
      (get-recipe "Yogourt latte frappuccino" 1)))

;; Diner du dimanche de la 6e semaine du livre 1
(def dim-diner-1-6
     (list
      (get-recipe "Sandwich le poulet-mangue" 2)
      (make-recipe 1
		   (list
        (make-ingredient "celeri" (cup (* 2 1/2)))
		    (make-ingredient "radis" (cup (* 2 1/2)))))))

;; Souper du dimanche de la 6e semaine du livre 1
(def dim-souper-1-6
     (list
      (get-recipe "Poisson exotique" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 3/4)))
        (make-ingredient "jus de legumes" (cup 1/2))
        (make-ingredient "banane" 1/2)))))

;; Dimanche de la 6e semaine du livre 1
(def dimanche-1-6
     (concat
      dim-dej-1-6
      dim-col1-1-6
      dim-diner-1-6
      dim-souper-1-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  1-6 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 1-6
(def semaine-1-6-modif
     (concat
      lundi-1-6
      mardi-1-6
      mercredi-1-6
      jeudi-1-6
      vendredi-1-6
      samedi-1-6
      dimanche-1-6))



