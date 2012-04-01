                                                                  ;; SEMAINE 7 DU LIVRE 1
(ns epicerie.semaines.semaine-1-7-modif
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 7e semaine du livre 1
(def lun-dej-1-7
     (list
      (make-recipe 1
		   (list
        (make-ingredient "Muffin aux noix" 1)
		    (make-ingredient "fraise" (cup 3/4))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 7e semaine du livre 1
(def lun-col1-1-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromage ecreme" (gram 25))
        (make-ingredient "tranche de pain ble entier" 1)))))

;; Diner du lundi de la 7e semaine du livre 1
(def lun-diner-1-7
     (list
      (get-recipe "Salade la saumonee" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
        (make-ingredient "celeri" (cup 1/2))))))

;; Souper du lundi de la 7e semaine du livre 1
(def lun-souper-1-7
     (list
      (get-recipe "Agneau au vin rouge" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "spaghetti ble entier" (cup (* 2 1/2)))
        (make-ingredient "poivron" (cup (* 2 1)))
        (make-ingredient "lait de soya" (cup 1/2))))))

;; Lundi de la 7e semaine du livre 1
(def lundi-1-7
     (concat
      lun-dej-1-7
      lun-col1-1-7
      lun-diner-1-7
      lun-souper-1-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 7e semaine du livre 1
(def mar-dej-1-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain aux raisins" 1)
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
        (make-ingredient "melon miel" 1/2)
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 7e semaine du livre 1
(def mar-col1-1-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du mardi de la 7e semaine du livre 1
(def mar-diner-1-7
     (list
      (get-recipe "Salade la saucissonne" 1)
      (make-recipe 1
		   (list
        (make-ingredient "Barre granola maison" 1)))))

;; Souper du mardi de la 7e semaine du livre 1
(def mar-souper-1-7
     (list
      (get-recipe "Poulet aux agrumes" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 1/2)))
        (make-ingredient "brocoli" (cup (* 2 1/2)))))))

;; Mardi de la 7e semaine du livre 1
(def mardi-1-7
     (concat
      mar-dej-1-7
      mar-col1-1-7
      mar-diner-1-7
      mar-souper-1-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 7e semaine du livre 1
(def mer-dej-1-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "fromage ecreme" (gram 25))
        (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 7e semaine du livre 1
(def mer-col1-1-7
     (list
      (make-recipe 1
		   (list
        (make-ingredient "melon miel" (cup 1/2))))))

;; Diner du mercredi de la 7e semaine du livre 1
(def mer-diner-1-7
     (list
      (get-recipe "Sandwich le poulet-mangue" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))
        (make-ingredient "radis" (cup 1/2))))))

;; Souper du mercredi de la 7e semaine du livre 1
(def mer-souper-1-7
     (list
      (get-recipe "Tilapia aux noix et a l'erable" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "orge" (cup (* 2 3/4)))
        (make-ingredient "brocoli" (cup (* 2 1)))
        (make-ingredient "lait" (cup 1/2))))))

;; Mercredi de la 7e semaine du livre 1
(def mercredi-1-7
     (concat
      mer-dej-1-7
      mer-col1-1-7
      mer-diner-1-7
      mer-souper-1-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 7e semaine du livre 1
(def jeu-dej-1-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de ble" (cup 1/2))
        (make-ingredient "jus d'orange" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 7e semaine du livre 1
(def jeu-col1-1-7
     (list
      (make-recipe 1
		   (list
        (make-ingredient "fraise" (cup 1/2))))))

;; Diner du jeudi de la 7e semaine du livre 1
(def jeu-diner-1-7
     (list
      (get-recipe "Sandwich le dinde-legumes" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "tomate cerise" (cup 1/2))
        (make-ingredient "concombre" (cup 1/2))))))

;; Souper du jeudi  de la 7e semaine du livre 1
(def jeu-souper-1-7
     (list
      (get-recipe "Saucisse et gratin de chou aux pommes" 2)
      (make-recipe 1
		   (list
        (make-ingredient "pain pita ble entier" 1)
        (make-ingredient "jus de legumes" (cup 1/2))))))

;; Jeudi de la 7e semaine du livre 1
(def jeudi-1-7
     (concat
      jeu-dej-1-7
      jeu-col1-1-7
      jeu-diner-1-7
      jeu-souper-1-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 7e semaine du livre 1
(def ven-dej-1-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau nature" (cup 3/4))
        (make-ingredient "tranche de pain ble entier" 1)
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 7e semaine du livre 1
(def ven-col1-1-7
     (list
      (make-recipe 1
		   (list
        (make-ingredient "yogourt nature sans gras" (cup 1/3))
        (make-ingredient "framboise" (cup 1/2))))))

;; Diner du vendredi de la 7e semaine du livre 1
(def ven-diner-1-7
     (list
      (make-recipe 1
		   (list
        (make-ingredient "Saucisse et gratin de chou aux pommes" 1)
        (make-ingredient "biscotte melba" 2)
        (make-ingredient "jus de legumes" (cup 1/2))))))

;; Souper du vendredi de la 7e semaine du livre 1
(def ven-souper-1-7
     (list
      (get-recipe "Boeuf aux poivrons" 2)
      (make-recipe 1
		   (list
        (make-ingredient "couscous" (cup (* 2 1)))))))

;; Vendredi de la 7e semaine du livre 1
(def vendredi-1-7
     (concat
      ven-dej-1-7
      ven-col1-1-7
      ven-diner-1-7
      ven-souper-1-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 7e semaine du livre 1
(def sam-dej-1-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Muffin aux noix" 1)
		    (make-ingredient "yogourt allege de 100g" 1)
        (make-ingredient "melon miel" (cup 1/2))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 7e semaine du livre 1
(def sam-col1-1-7
     (list
      (make-recipe 1
       (list
        (make-ingredient "concombre" (cup 1/2))))))

;; Diner du samedi de la 7e semaine du livre 1
(def sam-diner-1-7
     (list
      (get-recipe "Grilled cheese de luxe" 2)
      (get-recipe "Salade la simplette" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "crouton ble entier" (cup (* 2 1/4)))))))

;; Souper du samedi de la 7e semaine du livre 1
(def sam-souper-1-7
     (list
      (get-recipe "Espadon a la salsa de tomates cerises" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "nouille de riz" (cup (* 2 1)))))))

;; Samedi de la 7e semaine du livre 1
(def samedi-1-7
     (concat
      sam-dej-1-7
      sam-col1-1-7
      sam-diner-1-7
      sam-souper-1-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 7e semaine du livre 1
(def dim-dej-1-7
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin ble entier" 1)
        (make-ingredient "fromage ecreme" (gram 25))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du dimanche de la 7e semaine du livre 1
(def dim-col1-1-7
     (list
      (make-recipe 1
       (list
        (make-ingredient "mangue" (cup 1/2))))))

;; Diner du dimanche de la 7e semaine du livre 1
(def dim-diner-1-7
     (list
      (get-recipe "Omelette tomate-fromage" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)))))

;; Souper du dimanche de la 7e semaine du livre 1
(def dim-souper-1-7
     (list
      (get-recipe "Poulet aux framboises" 2)
      (get-recipe "Pamplemousse grille" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 3)
        (make-ingredient "pois mange-tout" (cup (* 2 1)))))))

;; Dimanche de la 7e semaine du livre 1
(def dimanche-1-7
     (concat
      dim-dej-1-7
      dim-col1-1-7
      dim-diner-1-7
      dim-souper-1-7))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  1-7 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 1-7
(def semaine-1-7-modif
     (concat
      lundi-1-7
      mardi-1-7
      mercredi-1-7
      jeudi-1-7
      vendredi-1-7
      samedi-1-7
      dimanche-1-7))





