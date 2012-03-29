                                                                  ;; SEMAINE 3 DU LIVRE 2
(ns epicerie.semaines.semaine-2-3
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 3e semaine du livre 2
(def lun-dej-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain  ble entier" 2)
		    (make-ingredient "beurre d'arachide" (tablespoon 1))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "orange" 1)))))

;; Collation 1 du lundi de la 3e semaine du livre 2
(def lun-col1-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "pistache" (tablespoon 1))))))

;; Diner du lundi de la 3e semaine du livre 2
(def lun-diner-2-3
     (list
      (get-recipe "Ciabatta poulet-pesto" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "celeri" (cup 1/2))))))

;; Collation 2 du lundi de la 3e semaine du livre 2
(def lun-col2-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "framboise" (cup 1/2))))))

;; Souper du lundi de la 3e semaine du livre 2
(def lun-souper-2-3
     (list
      (get-recipe "Escalopes de veau facon saltimbocca" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "orge" (cup (* 2 1/2)))
		    (make-ingredient "brocoli" (cup (* 2 1)))))))

;; Lundi de la 3e semaine du livre 2
(def lundi-2-3
     (concat
      lun-dej-2-3
      lun-col1-2-3
      lun-diner-2-3
      lun-col2-2-3
      lun-souper-2-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 3e semaine du livre 2
(def mar-dej-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette galette aux bleuets et aux graines de lin" 1)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "cantaloup" (cup 1/2))))))

;; Collation 1 du mardi de la 3e semaine du livre 2
(def mar-col1-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du mardi de la 3e semaine du livre 2
(def mar-diner-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette soupe a la courge musquee, au cari et aux pommes" 1)
		    (make-ingredient "ciabatta ble entier" 1)
		    (make-ingredient "boite de thon" 1/2)))))

;; Collation 2 du mardi de la 3e semaine du livre 2
(def mar-col2-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 4)
		    (make-ingredient "bocconcini" (gram 25))))))

;; Souper du mardi de la 3e semaine du livre 2
(def mar-souper-2-3
     (list
      (get-recipe "Aiglefin sur fenouil braise" 2)
      (get-recipe "Salade tiede de pois chiches" 2)))

;; Mardi de la 3e semaine du livre 2
(def mardi-2-3
     (concat
      mar-dej-2-3
      mar-col1-2-3
      mar-diner-2-3
      mar-col2-2-3
      mar-souper-2-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 3e semaine du livre 2
(def mer-dej-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain aux raisins" 2)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "kiwi" 1/2)))))

;; Collation 1 du mercredi de la 3e semaine du livre 2
(def mer-col1-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Diner du mercredi de la 3e semaine du livre 2
(def mer-diner-2-3
     (list
      (get-recipe "Salade saumon et pommes de terre" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 3)))))

;; Collation 2 du mercredi de la 3e semaine du livre 2
(def mer-col2-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tomate cerise" 5)))))

;; Souper du mercredi de la 3e semaine du livre 2
(def mer-souper-2-3
     (list
      (get-recipe "Quiche sans croure jambon et asperges" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "brocoli" (cup (* 2 1/2)))
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Mercredi de la 3e semaine du livre 2
(def mercredi-2-3
     (concat
      mer-dej-2-3
      mer-col1-2-3
      mer-diner-2-3
      mer-col2-2-3
      mer-souper-2-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 3e semaine du livre 2
(def jeu-dej-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau" (cup 3/4))
		    (make-ingredient "graines de lin moulues" (teaspoon 1))
		    (make-ingredient "sirop d'erable" (teaspoon 2))
		    (make-ingredient "cantaloup" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 3e semaine du livre 2
(def jeu-col1-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "carotte" (cup 1/2))
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du jeudi de la 3e semaine du livre 2
(def jeu-diner-2-3
     (list
      (get-recipe "Sandwich au prosciutto" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "banane" 1/2)))))

;; Collation 2 du jeudi de la 3e semaine du livre 2
(def jeu-col2-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Souper du jeudi  de la 3e semaine du livre 2
(def jeu-souper-2-3
     (list
      (get-recipe "Sole a l'orange" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "penne ble entier" (cup (* 2 1/2)))
		    (make-ingredient "petit pois" (cup (* 2 1)))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Jeudi de la 3e semaine du livre 2
(def jeudi-2-3
     (concat
      jeu-dej-2-3
      jeu-col1-2-3
      jeu-diner-2-3
      jeu-col2-2-3
      jeu-souper-2-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 3e semaine du livre 2
(def ven-dej-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "muslix" (cup 1/2))
		    (make-ingredient "graines de lin moulues" (tablespoon 1))
		    (make-ingredient "lait de soya" (cup 1/2))
		    (make-ingredient "framboise" (cup 1/2))))))

;; Collation 1 du vendredi de la 3e semaine du livre 2
(def ven-col1-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du vendredi de la 3e semaine du livre 2
(def ven-diner-2-3
     (list
      (get-recipe "Sandwich aux oeufs et aux petites feuilles de fenouil" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "orange" 1)))))

;; Collation 2 du vendredi de la 3e semaine du livre 2
(def ven-col2-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cantaloup" (cup 1/2))))))

;; Souper du vendredi de la 3e semaine du livre 2
(def ven-souper-2-3
     (list
      (get-recipe "Risotto d'orge au poulet et aux petits pois" 2)
      (get-recipe "Salade de roquette" 2)))
      
;; Vendredi de la 3e semaine du livre 2
(def vendredi-2-3
     (concat
      ven-dej-2-3
      ven-col1-2-3
      ven-diner-2-3
      ven-col2-2-3
      ven-souper-2-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 3e semaine du livre 2
(def sam-dej-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "baguette ble entier" (gram 60))
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "framboise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 3e semaine du livre 2
(def sam-col1-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "brocoli" (cup 1/2))))))

;; Diner du samedi de la 3e semaine du livre 2
(def sam-diner-2-3
     (list
      (get-recipe "Salade pates, tomates et olives noires" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup (* 2 1/2)))))))

;; Collation 2 du samedi de la 3e semaine du livre 2
(def sam-col2-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cantaloup" (cup 1/2))
		    (make-ingredient "fromage cottage 1 %" (cup 1/4))))))

;; Souper du samedi de la 3e semaine du livre 2
(def sam-souper-2-3
     (list
      (get-recipe "Jarret d'agneau" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "asperge" (cup (* 2 1)))
		    (make-ingredient "pomme de terre grelot" (* 2 1))))))

;; Samedi de la 3e semaine du livre 2
(def samedi-2-3
     (concat
      sam-dej-2-3
      sam-col1-2-3
      sam-diner-2-3
      sam-col2-2-3
      sam-souper-2-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 3e semaine du livre 2
(def dim-dej-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muslix" (cup 1/2))
		    (make-ingredient "cereales de son" (cup 1/2))
		    (make-ingredient "framboise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du dimanche de la 3e semaine du livre 2
(def dim-col1-2-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 1/3))))))

;; Diner du dimanche de la 3e semaine du livre 2
(def dim-diner-2-3
     (list
      (get-recipe "Soupe espagnole" 1)
      (get-recipe "Granite au cafe" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "carotte" (cup 1/2))))))

;; Collation 2 du dimanche de la 3e semaine du livre 2
(def dim-col2-2-3
     (list
      (get-recipe "Muffins a la courgette et au citron" 1)))


;; Souper du dimanche de la 3e semaine du livre 2
(def dim-souper-2-3
     (list
      (get-recipe "Tournedos de petoncles" 2)
      (get-recipe "Salade de roquette" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "orge" (cup (* 2 1/2)))
		    (make-ingredient "courgette" (cup (* 2 1)))))))

;; Dimanche de la 3e semaine du livre 2
(def dimanche-2-3
     (concat
      dim-dej-2-3
      dim-col1-2-3
      dim-diner-2-3
      dim-col2-2-3
      dim-souper-2-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  2-3 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 2-3
(def semaine-2-3
     (concat
      lundi-2-3
      mardi-2-3
      mercredi-2-3
      jeudi-2-3
      vendredi-2-3
      samedi-2-3
      dimanche-2-3))
