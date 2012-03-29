                                                                  ;; SEMAINE 2 DU LIVRE 2
(ns epicerie.semaines.semaine-2-2-modif
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 2e semaine du livre 2
(def lun-dej-2-2
     (list
      (get-recipe "Smoothie rose" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "bagel ble entier" 1/2)
		    (make-ingredient "beurre d'arachide" (tablespoon 1))
		    (make-ingredient "clementine" 1)))))

;; Collation 1 du lundi de la 2e semaine du livre 2
(def lun-col1-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "peche" 1)))))

;; Diner du lundi de la 2e semaine du livre 2
(def lun-diner-2-2
     (list
      (get-recipe "Taboule aux lentilles" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "carotte" (cup 1/2))
		    (make-ingredient "jus de legumes" (cup 1/2))
		    (make-ingredient "yogourt allege de 100 g" 1) ))))

;; Collation 2 du lundi de la 2e semaine du livre 2
(def lun-col2-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromage cottage 1%" (cup 1/2))))))

;; Souper du lundi de la 2e semaine du livre 2
(def lun-souper-2-2
     (list
      (get-recipe "Saumon a la sauce vierge" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz brun" (cup (* 2 1/2)))
		    (make-ingredient "chou-fleur" (cup (* 2 1))) ))))

;; Lundi de la 2e semaine du livre 2
(def lundi-2-2
     (concat
      lun-dej-2-2
      lun-col1-2-2
      lun-diner-2-2
      lun-col2-2-2
      lun-souper-2-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 2e semaine du livre 2
(def mar-dej-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau" (cup 3/4))
		    (make-ingredient "sirop d'erable" (tablespoon 1))
		    (make-ingredient "graines de lin moulues" (tablespoon 1))
		    (make-ingredient "banane" 1)
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 2e semaine du livre 2
(def mar-col1-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Diner du mardi de la 2e semaine du livre 2
(def mar-diner-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "sauce vierge" (cup 1/2))
		    (make-ingredient "pita ble entier" 1)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "amandes" (tablespoon 2))
		    (make-ingredient "concombre" (cup 1/2))))))

;; Collation 2 du mardi de la 2e semaine du livre 2
(def mar-col2-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "peche" 1)))))

;; Souper du mardi de la 2e semaine du livre 2
(def mar-souper-2-2
     (list
      (get-recipe "Salade tomates, fromage et amandes" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "poivron rouge" (cup (* 2 1)))))))

;; Mardi de la 2e semaine du livre 2
(def mardi-2-2
     (concat
      mar-dej-2-2
      mar-col1-2-2
      mar-diner-2-2
      mar-col2-2-2
      mar-souper-2-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 2e semaine du livre 2
(def mer-dej-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "banane" 1/2)))))

;; Collation 1 du mercredi de la 2e semaine du livre 2
(def mer-col1-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "pomme" 1)
		    (make-ingredient "amandes" (tablespoon 1))))))

;; Diner du mercredi de la 2e semaine du livre 2
(def mer-diner-2-2
     (list
      (get-recipe "Salade cesar" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "recette galette aux bleuets et aux graines de lin" 1)))))

;; Collation 2 du mercredi de la 2e semaine du livre 2
(def mer-col2-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "chou-fleur" (cup 1/2))))))

;; Souper du mercredi de la 2e semaine du livre 2
(def mer-souper-2-2
     (list
      (get-recipe "Minipains veges" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "carotte" (cup (* 2 1)))))))

;; Mercredi de la 2e semaine du livre 2
(def mercredi-2-2
     (concat
      mer-dej-2-2
      mer-col1-2-2
      mer-diner-2-2
      mer-col2-2-2
      mer-souper-2-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 2e semaine du livre 2
(def jeu-dej-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "pamplemousse" 1/2)))))

;; Collation 1 du jeudi de la 2e semaine du livre 2
(def jeu-col1-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "clementine" 2)))))

;; Diner du jeudi de la 2e semaine du livre 2
(def jeu-diner-2-2
     (list
      (get-recipe "Pain aux noix pomme-ricotta" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "amandes" (tablespoon 2))
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Collation 2 du jeudi de la 2e semaine du livre 2
(def jeu-col2-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromage cottage 1%" (cup 1/2))
		    (make-ingredient "galette de riz brun" 1)))))

;; Souper du jeudi  de la 2e semaine du livre 2
(def jeu-souper-2-2
     (list
      (get-recipe "Salade l'oeuf en folie" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Jeudi de la 2e semaine du livre 2
(def jeudi-2-2
     (concat
      jeu-dej-2-2
      jeu-col1-2-2
      jeu-diner-2-2
      jeu-col2-2-2
      jeu-souper-2-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 2e semaine du livre 2
(def ven-dej-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de ble filamente" (cup 1))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "pamplemousse" 1/2)))))

;; Collation 1 du vendredi de la 2e semaine du livre 2
(def ven-col1-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "graines de lin moulues" (tablespoon 1))))))

;; Diner du vendredi de la 2e semaine du livre 2
(def ven-diner-2-2
     (list
      (get-recipe "Bagel au saumon fume" 1)
      (get-recipe "Salade toute verte" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Collation 2 du vendredi de la 2e semaine du livre 2
(def ven-col2-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "poivron" (cup 1/2))))))

;; Souper du vendredi de la 2e semaine du livre 2
(def ven-souper-2-2
     (list
      (get-recipe "Omelette feta, olives noires et basilic" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "tomate" 1)))))

;; Vendredi de la 2e semaine du livre 2
(def vendredi-2-2
     (concat
      ven-dej-2-2
      ven-col1-2-2
      ven-diner-2-2
      ven-col2-2-2
      ven-souper-2-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 2e semaine du livre 2
(def sam-dej-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "bagel ble entier" 1)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "lait de soya" (cup 1/2))
		    (make-ingredient "fraise" (cup 1/2))))))

;; Collation 1 du samedi de la 2e semaine du livre 2
(def sam-col1-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))

;; Diner du samedi de la 2e semaine du livre 2
(def sam-diner-2-2
     (list
      (get-recipe "Salade d'epinards (option fraises)" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "Recette Minipains veges" 1)))))

;; Collation 2 du samedi de la 2e semaine du livre 2
(def sam-col2-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "galette de riz brun" 2)
		    (make-ingredient "fromage a la creme leger" (tablespoon 1))))))

;; Souper du samedi de la 2e semaine du livre 2
(def sam-souper-2-2
     (list
      (get-recipe "Mijote de boeuf aux bleuets" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "pomme de terre" (* 2 1/2))
		    (make-ingredient "tranche de pain aux noix" 1/2)
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Samedi de la 2e semaine du livre 2
(def samedi-2-2
     (concat
      sam-dej-2-2
      sam-col1-2-2
      sam-diner-2-2
      sam-col2-2-2
      sam-souper-2-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 2e semaine du livre 2
(def dim-dej-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "ricotta allege" (cup 1/4))
		    (make-ingredient "yogourt nature sans gras" (cup 1/3))
		    (make-ingredient "cereales de type granola legeres" (cup 1/4))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 1 du dimanche de la 2e semaine du livre 2
(def dim-col1-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "poivron rouge" (cup 1/2))))))

;; Diner du dimanche de la 2e semaine du livre 2
(def dim-diner-2-2
     (list
      (get-recipe "Soupe a la courge musquee, au cari et aux pommes" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "pita ble entier" 1/4)))))

;; Collation 2 du dimanche de la 2e semaine du livre 2
(def dim-col2-2-2
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromage cottage 1%" (cup 1/4))
		    (make-ingredient "pita ble entier" 1/4)))))

;; Souper du dimanche de la 2e semaine du livre 2
(def dim-souper-2-2
     (list
      (get-recipe "Couscous royal au poulet" 2)
      (get-recipe "Peches caramelisees" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Dimanche de la 2e semaine du livre 2
(def dimanche-2-2
     (concat
      dim-dej-2-2
      dim-col1-2-2
      dim-diner-2-2
      dim-col2-2-2
      dim-souper-2-2))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  2-2 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 2-2
(def semaine-2-2-modif
     (concat
      lundi-2-2
      mardi-2-2
      mercredi-2-2
      jeudi-2-2
      vendredi-2-2
      samedi-2-2
      dimanche-2-2))
