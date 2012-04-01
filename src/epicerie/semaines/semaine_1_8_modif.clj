                                                                  ;; SEMAINE 8 DU LIVRE 1
(ns epicerie.semaines.semaine-1-8-modif
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 8e semaine du livre 1
(def lun-dej-1-8
     (list
      (make-recipe 1
		   (list
        (make-ingredient "Muffin aux noix" 1)
		    (make-ingredient "gruau nature" (cup 3/4))
        (make-ingredient "cantaloup" (cup 1/4))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 8e semaine du livre 1
(def lun-col1-1-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
        (make-ingredient "framboise" (cup 1/2))))))

;; Diner du lundi de la 8e semaine du livre 1
(def lun-diner-1-8
     (list
      (get-recipe "Salade la multicolore" 1)
      (make-recipe 1
		   (list
        (make-ingredient "biscotte melba" 3)))))

;; Souper du lundi de la 8e semaine du livre 1
(def lun-souper-1-8
     (list
      (get-recipe "Souvlaki" 2)
      (make-recipe 1
		   (list
        (make-ingredient "concombre" (cup (* 2 1/2)))))))

;; Lundi de la 8e semaine du livre 1
(def lundi-1-8
     (concat
      lun-dej-1-8
      lun-col1-1-8
      lun-diner-1-8
      lun-souper-1-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 8e semaine du livre 1
(def mar-dej-1-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "bagel ble entier" 1)
		    (make-ingredient "beurre d'arachise" (teaspoon 2))
        (make-ingredient "fraise" (cup 1/2))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 8e semaine du livre 1
(def mar-col1-1-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Carre aux framboises" 1)))))

;; Diner du mardi de la 8e semaine du livre 1
(def mar-diner-1-8
     (list
      (get-recipe "Sandwich le vege" 1)
      (make-recipe 1
		   (list
        (make-ingredient "jus de legumes" (cup 1/2))
        (make-ingredient "ananas" (cup 1/4))))))

;; Souper du mardi de la 8e semaine du livre 1
(def mar-souper-1-8
     (list
      (get-recipe "Fletan a l'antillaise" 2)
      (make-recipe 1
		   (list
        (make-ingredient "orge" (cup (* 2 1/2)))))))

;; Mardi de la 8e semaine du livre 1
(def mardi-1-8
     (concat
      mar-dej-1-8
      mar-col1-1-8
      mar-diner-1-8
      mar-souper-1-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 8e semaine du livre 1
(def mer-dej-1-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Muffin aux noix" 1)
		    (make-ingredient "gruau nature" (cup 3/4))
        (make-ingredient "noix de grenoble" (tablespoon 2))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 1 du mercredi de la 8e semaine du livre 1
(def mer-col1-1-8
     (list
      (make-recipe 1
		   (list
        (make-ingredient "prune" 1)))))

;; Diner du mercredi de la 8e semaine du livre 1
(def mer-diner-1-8
     (list
      (get-recipe "Sandwich le bagel surprise" 1)
      (make-recipe 1
		   (list
        (make-ingredient "carotte" (cup 1/2))))))

;; Souper du mercredi de la 8e semaine du livre 1
(def mer-souper-1-8
     (list
      (get-recipe "Risotto aux champignons" 2)
      (get-recipe "Salade la simplette" 2)))

;; Mercredi de la 8e semaine du livre 1
(def mercredi-1-8
     (concat
      mer-dej-1-8
      mer-col1-1-8
      mer-diner-1-8
      mer-souper-1-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 8e semaine du livre 1
(def jeu-dej-1-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
        (make-ingredient "oeuf" 1)
        (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 8e semaine du livre 1
(def jeu-col1-1-8
     (list
      (make-recipe 1
		   (list
        (make-ingredient "fromage ecreme" (gram 25))
        (make-ingredient "prune" 1)))))

;; Diner du jeudi de la 8e semaine du livre 1
(def jeu-diner-1-8
     (list
      (get-recipe "Salade le pied marin" 1)
      (make-recipe 1
		   (list
        (make-ingredient "biscotte melba" 3)))))

;; Souper du jeudi  de la 8e semaine du livre 1
(def jeu-souper-1-8
     (list
      (get-recipe "Poulet et quinoa epice" 2)
      (make-recipe 1
		   (list
        (make-ingredient "poivron" (cup (* 2 1)))
        (make-ingredient "lait de soya" (cup 1/2))))))

;; Jeudi de la 8e semaine du livre 1
(def jeudi-1-8
     (concat
      jeu-dej-1-8
      jeu-col1-1-8
      jeu-diner-1-8
      jeu-souper-1-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 8e semaine du livre 1
(def ven-dej-1-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de ble" (cup 3/4))
        (make-ingredient "lait de soya" (cup 1))
        (make-ingredient "jus d'orange" (cup 1/2))))))

;; Collation 1 du vendredi de la 8e semaine du livre 1
(def ven-col1-1-8
     (list
      (make-recipe 1
		   (list
        (make-ingredient "ananas" (cup 3/4))))))

;; Diner du vendredi de la 8e semaine du livre 1
(def ven-diner-1-8
     (list
      (make-recipe 1
		   (list
        (make-ingredient "Salade de quinoa" 1)
        (make-ingredient "yogourt nature sans gras" (cup 3/4))
        (make-ingredient "fraise" (cup 1/2))))))

;; Souper du vendredi de la 8e semaine du livre 1
(def ven-souper-1-8
     (list
      (get-recipe "Paella" 2)))

;; Vendredi de la 8e semaine du livre 1
(def vendredi-1-8
     (concat
      ven-dej-1-8
      ven-col1-1-8
      ven-diner-1-8
      ven-souper-1-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 8e semaine du livre 1
(def sam-dej-1-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain aux raison" 1)
		    (make-ingredient "gruau nature" (cup 3/4))
        (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 1 du samedi de la 8e semaine du livre 1
(def sam-col1-1-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Carre aux framboises" 1)))))

;; Diner du samedi de la 8e semaine du livre 1
(def sam-diner-1-8
     (list
      (get-recipe "Sandwich le croque-monsieur" 2)
      (get-recipe "Salade la simplette" 2)))

;; Souper du samedi de la 8e semaine du livre 1
(def sam-souper-1-8
     (list
      (get-recipe "Boeuf a l'asiatique" 2)
      (get-recipe "Yogourt a la grecque" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1/2)))
        (make-ingredient "tomate" (* 2 1))))))

;; Samedi de la 8e semaine du livre 1
(def samedi-1-8
     (concat
      sam-dej-1-8
      sam-col1-1-8
      sam-diner-1-8
      sam-souper-1-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 8e semaine du livre 1
(def dim-dej-1-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin ble entier" 1)
        (make-ingredient "fromage ecreme" (gram 25))
        (make-ingredient "framboise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du dimanche de la 8e semaine du livre 1
(def dim-col1-1-8
     (list
      (make-recipe 1
       (list
        (make-ingredient "poivron" (cup 1/2))))))

;; Diner du dimanche de la 8e semaine du livre 1
(def dim-diner-1-8
     (list
      (get-recipe "Omelette aux herbes du jardin" 2)
      (get-recipe "Salade la simplette" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)))))

;; Souper du dimanche de la 8e semaine du livre 1
(def dim-souper-1-8
     (list
      (get-recipe "Thon frais poele" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "nouille de riz" (cup (* 2 1/2)))
        (make-ingredient "courgette" (cup (* 2 1)))
        (make-ingredient "lait de soya" (cup 1/2))))))

;; Dimanche de la 8e semaine du livre 1
(def dimanche-1-8
     (concat
      dim-dej-1-8
      dim-col1-1-8
      dim-diner-1-8
      dim-souper-1-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  1-8 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 1-8
(def semaine-1-8-modif
     (concat
      lundi-1-8
      mardi-1-8
      mercredi-1-8
      jeudi-1-8
      vendredi-1-8
      samedi-1-8
      dimanche-1-8))







