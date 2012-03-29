                                                                  ;; SEMAINE 5 DU LIVRE 2
(ns epicerie.semaines.semaine-2-5
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 5e semaine du livre 2
(def lun-dej-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette muffin courgette et citron" 2)
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "bleuet" (cup 1/2))
		    (make-ingredient "cereales de type granola legeres" (tablespoon 2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 5e semaine du livre 2
(def lun-col1-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "clementine" 2)))))

;; Diner du lundi de la 5e semaine du livre 2
(def lun-diner-2-5
     (list
      (get-recipe "Sandwich poulet-raisins" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "poivron" (cup 1/2))))))

;; Collation 2 du lundi de la 5e semaine du livre 2
(def lun-col2-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt a boire de 200 ml" 1)))))

;; Souper du lundi de la 5e semaine du livre 2
(def lun-souper-2-5
     (list
      (get-recipe "Kefta de veau" 2)
      (get-recipe "Salade toute verte" 2)))

;; Lundi de la 5e semaine du livre 2
(def lundi-2-5
     (concat
      lun-dej-2-5
      lun-col1-2-5
      lun-diner-2-5
      lun-col2-2-5
      lun-souper-2-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 5e semaine du livre 2
(def mar-dej-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de son" (cup 1))
		    (make-ingredient "cereales de type granola legeres" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "melon miel" (cup 1/2))))))

;; Collation 1 du mardi de la 5e semaine du livre 2
(def mar-col1-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))

;; Diner du mardi de la 5e semaine du livre 2
(def mar-diner-2-5
     (list
      (get-recipe "Salade prosciutto, laiture, tomates" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "galette de riz brun" 2)))))

;; Collation 2 du mardi de la 5e semaine du livre 2
(def mar-col2-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "noix de grenoble" (tablespoon 2))))))

;; Souper du mardi de la 5e semaine du livre 2
(def mar-souper-2-5
     (list
      (get-recipe "Chaudree de poisson" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "margarine non hydrogenee" (teaspoon 1))
		    (make-ingredient "jus de legumes" (cup 1/2))
		    (make-ingredient "fromage allege" (gram 25))))))

;; Mardi de la 5e semaine du livre 2
(def mardi-2-5
     (concat
      mar-dej-2-5
      mar-col1-2-5
      mar-diner-2-5
      mar-col2-2-5
      mar-souper-2-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 5e semaine du livre 2
(def mer-dej-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "compote de pomme non sucree" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 5e semaine du livre 2
(def mer-col1-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt a boire de 200 ml" 1)))))

;; Diner du mercredi de la 5e semaine du livre 2
(def mer-diner-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette soupe espagnole" 1)
		    (make-ingredient "pita ble entier" 1/2)))))

;; Collation 2 du mercredi de la 5e semaine du livre 2
(def mer-col2-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "tomate cerise" 10)))))

;; Souper du mercredi de la 5e semaine du livre 2
(def mer-souper-2-5
     (list
      (get-recipe "Dindon burger" 2)
      (get-recipe "Salade d'epinards (option raisins)" 2)))

;; Mercredi de la 5e semaine du livre 2
(def mercredi-2-5
     (concat
      mer-dej-2-5
      mer-col1-2-5
      mer-diner-2-5
      mer-col2-2-5
      mer-souper-2-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 5e semaine du livre 2
(def jeu-dej-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau" (cup 3/4))
		    (make-ingredient "bleuet" (cup 1/4))
		    (make-ingredient "sirop d'erable" (tablespoon 1/2))
		    (make-ingredient "graines de lin moulues" (tablespoon 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 5e semaine du livre 2
(def jeu-col1-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 1/3))
		    (make-ingredient "cereales de type granola legeres" (tablespoon 2))))))

;; Diner du jeudi de la 5e semaine du livre 2
(def jeu-diner-2-5
     (list
      (get-recipe "Wrap thon et avocat" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "melon miel" (cup 1/2))))))

;; Collation 2 du jeudi de la 5e semaine du livre 2
(def jeu-col2-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "galette de riz brun" 1)
		    (make-ingredient "poivron" (cup 1/2))))))

;; Souper du jeudi  de la 5e semaine du livre 2
(def jeu-souper-2-5
     (list
      (get-recipe "Tofu marine aux tomates" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "nouilles de riz" (cup (* 2 1/2)))
		    (make-ingredient "bok choy" (cup (* 2 1)))))))

;; Jeudi de la 5e semaine du livre 2
(def jeudi-2-5
     (concat
      jeu-dej-2-5
      jeu-col1-2-5
      jeu-diner-2-5
      jeu-col2-2-5
      jeu-souper-2-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 5e semaine du livre 2
(def ven-dej-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de son" (cup 3/4))
		    (make-ingredient "cereales de typa granola legeres" (tablespoon 2))
		    (make-ingredient "graines de lin moulues" (tablespoon 1))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "banane" 1/2)))))

;; Collation 1 du vendredi de la 5e semaine du livre 2
(def ven-col1-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt a boire de 200 ml" 1)))))

;; Diner du vendredi de la 5e semaine du livre 2
(def ven-diner-2-5
     (list
      (get-recipe "Sandwich a la garniture de tofu" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "raisin" 5)))))

;; Collation 2 du vendredi de la 5e semaine du livre 2
(def ven-col2-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "melon miel" (cup 1/2))))))

;; Souper du vendredi de la 5e semaine du livre 2
(def ven-souper-2-5
     (list
      (get-recipe "Fajitas de poulet en feuilles de laitue" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tortilla ble entier" (* 2 1))))
      
;; Vendredi de la 5e semaine du livre 2
(def vendredi-2-5
     (concat
      ven-dej-2-5
      ven-col1-2-5
      ven-diner-2-5
      ven-col2-2-5
      ven-souper-2-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 5e semaine du livre 2
(def sam-dej-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "petit pain kaiser ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "pamplemousse" 1/2)))))

;; Collation 1 du samedi de la 5e semaine du livre 2
(def sam-col1-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "noix de grenoble" (tablespoon 2))))))

;; Diner du samedi de la 5e semaine du livre 2
(def sam-diner-2-5
     (list
      (get-recipe "Salade cesar" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "galette de riz brun" 1)))))

;; Collation 2 du samedi de la 5e semaine du livre 2
(def sam-col2-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "bleuet" (cup 1/2))))))

;; Souper du samedi de la 5e semaine du livre 2
(def sam-souper-2-5
     (list
      (get-recipe "Pate chinois revisite" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legume" (cup 1/2))
		    (make-ingredient "pita ble entier" 1/2))))))

;; Samedi de la 5e semaine du livre 2
(def samedi-2-5
     (concat
      sam-dej-2-5
      sam-col1-2-5
      sam-diner-2-5
      sam-col2-2-5
      sam-souper-2-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 5e semaine du livre 2
(def dim-dej-2-5
     (list
      (get-recipe "Gaufres aux bananes et au beurre d'arachide" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du dimanche de la 5e semaine du livre 2
(def dim-col1-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "melon miel" (cup 1/2))))))

;; Diner du dimanche de la 5e semaine du livre 2
(def dim-diner-2-5
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette pate chinois revisite" 2)
		    (make-ingredient "petit pain kaiser ble entier" 1/2)
		    (make-ingredient "concombre" (cup 1/2))))))

;; Collation 2 du dimanche de la 5e semaine du livre 2
(def dim-col2-2-5
     (list
      (get-recipe "Muffins aux bananes" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "lait de soya" (cup 1/2))))))


;; Souper du dimanche de la 5e semaine du livre 2
(def dim-souper-2-5
     (list
      (get-recipe "Tilapia cajun" 2)
      (get-recipe "Tapio-choco" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "bok choy" (cup (* 2 1)))
		    (make-ingredient "riz brun" (cup (* 2 1/2)))))))

;; Dimanche de la 5e semaine du livre 2
(def dimanche-2-5
     (concat
      dim-dej-2-5
      dim-col1-2-5
      dim-diner-2-5
      dim-col2-2-5
      dim-souper-2-5))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  2-5 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 2-5
(def semaine-2-5
     (concat
      lundi-2-5
      mardi-2-5
      mercredi-2-5
      jeudi-2-5
      vendredi-2-5
      samedi-2-5
      dimanche-2-5))
