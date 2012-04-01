                                                                  ;; SEMAINE 5 DU LIVRE 1
(ns epicerie.semaines.semaine-1-5-modif
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 5e semaine du livre 1
(def lun-dej-1-5
     (list
      (make-recipe 1
		   (list
        (make-ingredient "Muffin aux carottes et canneberges" 1)
		    (make-ingredient "fraise" (cup 1/2))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 5e semaine du livre 1
(def lun-col1-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du lundi de la 5e semaine du livre 1
(def lun-diner-1-5
     (list
      (get-recipe "Salade l'oeuf en folie" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
        (make-ingredient "yogourt allege de 100g" 1)))))

;; Souper du lundi de la 5e semaine du livre 1
(def lun-souper-1-5
     (list
      ;;(get-recipe "Sardines grillees et tomates a la provencale" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1)))
        (make-ingredient "lait de soya" (cup 1/2))))))

;; Lundi de la 5e semaine du livre 1
(def lundi-1-5
     (concat
      lun-dej-1-5
      lun-col1-1-5
      lun-diner-1-5
      lun-souper-1-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 5e semaine du livre 1
(def mar-dej-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "bagel ble entier" 1)
		    (make-ingredient "beurre d'arachise" (teaspoon 4))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 5e semaine du livre 1
(def mar-col1-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "prune" 1)))))

;; Diner du mardi de la 5e semaine du livre 1
(def mar-diner-1-5
     (list
      (get-recipe "Sandwich le sucre sale" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))
        (make-ingredient "concombre" (cup 1/2))
        (make-ingredient "poire" 1/2)
        (make-ingredient "yogourt allege de 100 g" 1)))))

;; Souper du mardi de la 5e semaine du livre 1
(def mar-souper-1-5
     (list
      (get-recipe "Linguinis a l'italienne" 2)
      (get-recipe "Salade la simplette" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Mardi de la 5e semaine du livre 1
(def mardi-1-5
     (concat
      mar-dej-1-5
      mar-col1-1-5
      mar-diner-1-5
      mar-souper-1-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 5e semaine du livre 1
(def mer-dej-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain aux raisins" 2)
		    (make-ingredient "fromage cottage 1%" (cup 1/2))
        (make-ingredient "framboise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 5e semaine du livre 1
(def mer-col1-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "amande" (tablespoon 2))
        (make-ingredient "bleuet" (cup 1/2))))))

;; Diner du mercredi de la 5e semaine du livre 1
(def mer-diner-1-5
     (list
      (get-recipe "Salade les pates et bocconcinis" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Souper du mercredi de la 5e semaine du livre 1
(def mer-souper-1-5
     (list
      (get-recipe "Omelette au saumon fume" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)))))

;; Mercredi de la 5e semaine du livre 1
(def mercredi-1-5
     (concat
      mer-dej-1-5
      mer-col1-1-5
      mer-diner-1-5
      mer-souper-1-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 5e semaine du livre 1
(def jeu-dej-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
        (make-ingredient "cereales de type granola legeres" (cup 1/4))
        (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 5e semaine du livre 1
(def jeu-col1-1-5
     (list
      (make-recipe 1
		   (list
        (make-ingredient "concombre" (cup 1/2))))))

;; Diner du jeudi de la 5e semaine du livre 1
(def jeu-diner-1-5
     (list
      (get-recipe "Salade le pied marin" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "Carre aux framboises" 1)))))

;; Souper du jeudi  de la 5e semaine du livre 1
(def jeu-souper-1-5
     (list
      (get-recipe "Bifteck a la moutarde" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "orge" (cup (* 2 1/2)))
        (make-ingredient "poivron" (cup (* 2 1)))
        (make-ingredient "lait de soya" (cup 1/2))
        (make-ingredient "cantaloup" (cup (* 2 1/2)))))))

;; Jeudi de la 5e semaine du livre 1
(def jeudi-1-5
     (concat
      jeu-dej-1-5
      jeu-col1-1-5
      jeu-diner-1-5
      jeu-souper-1-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 5e semaine du livre 1
(def ven-dej-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
        (make-ingredient "framboise" (cup 1/2))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 5e semaine du livre 1
(def ven-col1-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Barre granola maison" 1)))))

;; Diner du vendredi de la 5e semaine du livre 1
(def ven-diner-1-5
     (list
      (get-recipe "Sandwich le vege" 1)
      (make-recipe 1
		   (list
        (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "radis" (cup 1/2))))))

;; Souper du vendredi de la 5e semaine du livre 1
(def ven-souper-1-5
     (list
      (get-recipe "Escalope de poulet en croute de noix de grenoble" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 1/2)))
        (make-ingredient "courgette" (cup (* 2 1)))))))

;; Vendredi de la 5e semaine du livre 1
(def vendredi-1-5
     (concat
      ven-dej-1-5
      ven-col1-1-5
      ven-diner-1-5
      ven-souper-1-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 5e semaine du livre 1
(def sam-dej-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau nature" (cup 3/4))
		    (make-ingredient "cantaloup" (cup 1/2))
		    (make-ingredient "fromage ecreme" (gram 25))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 5e semaine du livre 1
(def sam-col1-1-5
     (list
      (get-recipe "Muffin aux noix" 1)))

;; Diner du samedi de la 5e semaine du livre 1
(def sam-diner-1-5
     (list
      (get-recipe "Salade etagee de thon" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "pita ble entier" 1)))))

;; Souper du samedi de la 5e semaine du livre 1
(def sam-souper-1-5
     (list
      (get-recipe "Hamburger de veau" 2)
      (get-recipe "Salade la simplette" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "lait de soya" (cup (* 2 1/2)))))))

;; Samedi de la 5e semaine du livre 1
(def samedi-1-5
     (concat
      sam-dej-1-5
      sam-col1-1-5
      sam-diner-1-5
      sam-souper-1-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 5e semaine du livre 1
(def dim-dej-1-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "yogourt allege de 100g" 1)
        (make-ingredient "jus d'orange" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du dimanche de la 5e semaine du livre 1
(def dim-col1-1-5
     (list
      (make-recipe 1
       (list
         (make-ingredient "concombre" (cup 1/2))))))

;; Diner du dimanche de la 5e semaine du livre 1
(def dim-diner-1-5
     (list
      (get-recipe "Sandwich le croque-monsieur" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "radis" (cup (* 2 1/2)))))))

;; Souper du dimanche de la 5e semaine du livre 1
(def dim-souper-1-5
     (list
      (get-recipe "Saumon glace au miel" 2)
      (get-recipe "Croustade aux prunes et aux framboises" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "poivron" (cup (* 2 1)))))))

;; Dimanche de la 5e semaine du livre 1
(def dimanche-1-5
     (concat
      dim-dej-1-5
      dim-col1-1-5
      dim-diner-1-5
      dim-souper-1-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  1-5 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 1-5
(def semaine-1-5-modif
     (concat
      lundi-1-5
      mardi-1-5
      mercredi-1-5
      jeudi-1-5
      vendredi-1-5
      samedi-1-5
      dimanche-1-5))




