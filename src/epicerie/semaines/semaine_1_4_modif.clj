                                                                  ;; SEMAINE 4 DU LIVRE 1
(ns epicerie.semaines.semaine-1-4-modif
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 4e semaine du livre 1
(def lun-dej-1-4
     (list
      (make-recipe 1
		   (list
        (make-ingredient "gruau nature" (cup 3/4))
		    (make-ingredient "fraise" (cup 1/2))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 4e semaine du livre 1
(def lun-col1-1-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Barre granola maison" 1)))))

;; Diner du lundi de la 4e semaine du livre 1
(def lun-diner-1-4
     (list
      (get-recipe "Salade la saucissonne" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))
        (make-ingredient "radis" (cup 1/2))))))

;; Souper du lundi de la 4e semaine du livre 1
(def lun-souper-1-4
     (list
      (get-recipe "Poulet au yogourt et aux herbes" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1/2)))
        (make-ingredient "poivron" (cup (* 2 1)))
        (make-ingredient "Pudding au riz" 2)))))

;; Lundi de la 4e semaine du livre 1
(def lundi-1-4
     (concat
      lun-dej-1-4
      lun-col1-1-4
      lun-diner-1-4
      lun-souper-1-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 4e semaine du livre 1
(def mar-dej-1-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
        (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 4e semaine du livre 1
(def mar-col1-1-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "mangue" (cup 1/2))))))

;; Diner du mardi de la 4e semaine du livre 1
(def mar-diner-1-4
     (list
      (get-recipe "Sandwich le poulet-mangue" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "radis" (cup 1/2))
        (make-ingredient "melon miel" (cup 1/2))))))

;; Souper du mardi de la 4e semaine du livre 1
(def mar-souper-1-4
     (list
      (get-recipe "Croquette de saumon" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 1/2)))
		    (make-ingredient "brocoli" (cup (* 2 1)))))))

;; Mardi de la 4e semaine du livre 1
(def mardi-1-4
     (concat
      mar-dej-1-4
      mar-col1-1-4
      mar-diner-1-4
      mar-souper-1-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 4e semaine du livre 1
(def mer-dej-1-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "margarine" (teaspoon 1))
		    (make-ingredient "yogourt allege de 100 g" 1)
        (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 4e semaine du livre 1
(def mer-col1-1-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "framboise" (cup 1/2))))))

;; Diner du mercredi de la 4e semaine du livre 1
(def mer-diner-1-4
     (list
      (get-recipe "Salade la multicolore" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 3)))))

;; Souper du mercredi de la 4e semaine du livre 1
(def mer-souper-1-4
     (list
      (get-recipe "Vol-au-vent au poulet" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "asperge" (cup (* 2 1)))))))

;; Mercredi de la 4e semaine du livre 1
(def mercredi-1-4
     (concat
      mer-dej-1-4
      mer-col1-1-4
      mer-diner-1-4
      mer-souper-1-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 4e semaine du livre 1
(def jeu-dej-1-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau nature" (cup 3/4))
		    (make-ingredient "lait de soya" (cup 1))
        (make-ingredient "kiwi" 1)))))

;; Collation 1 du jeudi de la 4e semaine du livre 1
(def jeu-col1-1-4
     (list
      (make-recipe 1
		   (list
        (make-ingredient "Carre aux framboises" 1)))))

;; Diner du jeudi de la 4e semaine du livre 1
(def jeu-diner-1-4
     (list
      (get-recipe "Sandwich le bagel surprise" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "radis" (cup 1/2))
		    (make-ingredient "celeri" (cup 1/2))))))

;; Souper du jeudi  de la 4e semaine du livre 1
(def jeu-souper-1-4
     (list
      (get-recipe "Macaroni au boeuf et au fromage" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "mangue" (cup (* 2 1/2)))))))

;; Jeudi de la 4e semaine du livre 1
(def jeudi-1-4
     (concat
      jeu-dej-1-4
      jeu-col1-1-4
      jeu-diner-1-4
      jeu-souper-1-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 4e semaine du livre 1
(def ven-dej-1-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "fromage ecreme" (gram 25))
        (make-ingredient "melon miel" (cup 1/2))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 4e semaine du livre 1
(def ven-col1-1-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "carotte" (cup 1/2))))))

;; Diner du vendredi de la 4e semaine du livre 1
(def ven-diner-1-4
     (list
      (make-recipe 1
		   (list
        (make-ingredient "Macaroni au boeuf et au fromage" 1)
		    (make-ingredient "melon miel" (cup 1/2))))))

;; Souper du vendredi de la 4e semaine du livre 1
(def ven-souper-1-4
     (list
      (get-recipe "Brochette de petoncles" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 1)))))))

;; Vendredi de la 4e semaine du livre 1
(def vendredi-1-4
     (concat
      ven-dej-1-4
      ven-col1-1-4
      ven-diner-1-4
      ven-souper-1-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 4e semaine du livre 1
(def sam-dej-1-4
     (list
      (get-recipe "Tartinade a la ricotta et aux framboises" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "bagel ble entier" 1/2)
		    (make-ingredient "peche" 1)
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 1 du samedi de la 4e semaine du livre 1
(def sam-col1-1-4
     (list
      (make-recipe 1
       (list
        (make-ingredient "Barre granola maison" 1)))))

;; Diner du samedi de la 4e semaine du livre 1
(def sam-diner-1-4
     (list
      (get-recipe "Omelette western" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)))))

;; Souper du samedi de la 4e semaine du livre 1
(def sam-souper-1-4
     (list
      (get-recipe "Pizza sante" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "asperge" (cup (* 2 1/2)))))))

;; Samedi de la 4e semaine du livre 1
(def samedi-1-4
     (concat
      sam-dej-1-4
      sam-col1-1-4
      sam-diner-1-4
      sam-souper-1-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 4e semaine du livre 1
(def dim-dej-1-4
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau nature" (cup 1))
		    (make-ingredient "melon d'eau" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 1 du dimanche de la 4e semaine du livre 1
(def dim-col1-1-4
     (list
      (make-recipe 1
       (list
         (make-ingredient "Muffin aux carottes et aux canneberges" 1)))))

;; Diner du dimanche de la 4e semaine du livre 1
(def dim-diner-1-4
     (list
      (get-recipe "Grilled cheese de luxe" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup (* 2 3/4)))))))

;; Souper du dimanche de la 4e semaine du livre 1
(def dim-souper-1-4
     (list
      (get-recipe "Medaillon de veau farci" 2)
      (get-recipe "Coupe a la ricotta et aux fraises" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1/2)))
		    (make-ingredient "poivron" (cup (* 2 1)))))))

;; Dimanche de la 4e semaine du livre 1
(def dimanche-1-4
     (concat
      dim-dej-1-4
      dim-col1-1-4
      dim-diner-1-4
      dim-souper-1-4))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  1-4 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 1-4
(def semaine-1-4-modif
     (concat
      lundi-1-4
      mardi-1-4
      mercredi-1-4
      jeudi-1-4
      vendredi-1-4
      samedi-1-4
      dimanche-1-4))

