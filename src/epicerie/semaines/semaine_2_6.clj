                                                                  ;; SEMAINE 6 DU LIVRE 2
(ns epicerie.semaines.semaine-2-6
  (:use epicerie.core))                                    
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 6e semaine du livre 2
(def lun-dej-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "bagel ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 1))
		    (make-ingredient "orange" 1)
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 6e semaine du livre 2
(def lun-col1-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "amandes" (tablespoon 2))
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du lundi de la 6e semaine du livre 2
(def lun-diner-2-6
     (list
      (get-recipe "Pita moyen-oriental" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "tomate cerise" 5)))))

;; Collation 2 du lundi de la 6e semaine du livre 2
(def lun-col2-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette tapio-choco" 1)))))

;; Souper du lundi de la 6e semaine du livre 2
(def lun-souper-2-6
     (list
      (get-recipe "Rouleaux de printemps au poulet" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "pois mange-tout" (cup (* 2 1)))))))



;; Lundi de la 6e semaine du livre 2
(def lundi-2-6
     (concat
      lun-dej-2-6
      lun-col1-2-6
      lun-diner-2-6
      lun-col2-2-6
      lun-souper-2-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 6e semaine du livre 2
(def mar-dej-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette muffin aux bananes" 1)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))
		    (make-ingredient "poire" 1)
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 6e semaine du livre 2
(def mar-col1-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du mardi de la 6e semaine du livre 2
(def mar-diner-2-6
     (list
      (get-recipe "Sandwich poulet-raisins" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))

;; Collation 2 du mardi de la 6e semaine du livre 2
(def mar-col2-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt allege de 100 g" 1)
		    (make-ingredient "melon d'eau" (cup 1/2))))))

;; Souper du mardi de la 6e semaine du livre 2
(def mar-souper-2-6
     (list
      (get-recipe "Linguines aux palourdes" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))))))


;; Mardi de la 6e semaine du livre 2
(def mardi-2-6
     (concat
      mar-dej-2-6
      mar-col1-2-6
      mar-diner-2-6
      mar-col2-2-6
      mar-souper-2-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 6e semaine du livre 2
(def mer-dej-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "compote de pomme non sucree" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 6e semaine du livre 2
(def mer-col1-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 1/3))
		    (make-ingredient "framboise" (cup 1/2))))))

;; Diner du mercredi de la 6e semaine du livre 2
(def mer-diner-2-6
     (list
      (get-recipe "Salade oeufs et feta" 1)
      (make-recipe 1
		    (make-ingredient "pita ble entier" 1/2)))))

;; Collation 2 du mercredi de la 6e semaine du livre 2
(def mer-col2-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "carotte" (cup 1/2))))))

;; Souper du mercredi de la 6e semaine du livre 2
(def mer-souper-2-6
     (list
      (get-recipe "Maquereau, salsa de mangue et de coriandre" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "linguine ble entier" (cup (* 2 1/2)))
		    (make-ingredient "epinard" (cup (* 2 1/2)))))))



;; Mercredi de la 6e semaine du livre 2
(def mercredi-2-6
     (concat
      mer-dej-2-6
      mer-col1-2-6
      mer-diner-2-6
      mer-col2-2-6
      mer-souper-2-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 6e semaine du livre 2
(def jeu-dej-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de ble filamentee" (cup 1))
		    (make-ingredient "bleuet" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 6e semaine du livre 2
(def jeu-col1-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "orange" 1)))))

;; Diner du jeudi de la 6e semaine du livre 2
(def jeu-diner-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "reste de salsa de mangue" 1)
		    (make-ingredient "lentille" (cup 3/4))
		    (make-ingredient "biscotte melba" 4)
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Collation 2 du jeudi de la 6e semaine du livre 2
(def jeu-col2-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))
		    (make-ingredient "carotte" (cup 1/2))))))

;; Souper du jeudi  de la 6e semaine du livre 2
(def jeu-souper-2-6
     (list
      (get-recipe "Omelette florentine" 2)
      (get-recipe "Salade toute verte" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)))))

;; Jeudi de la 6e semaine du livre 2
(def jeudi-2-6
     (concat
      jeu-dej-2-6
      jeu-col1-2-6
      jeu-diner-2-6
      jeu-col2-2-6
      jeu-souper-2-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 6e semaine du livre 2
(def ven-dej-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "recette muffin aux bananes" 1)
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "framboise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 1 du vendredi de la 6e semaine du livre 2
(def ven-col1-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "melon d'eau" (cup 1/2))))))

;; Diner du vendredi de la 6e semaine du livre 2
(def ven-diner-2-6
     (list
      (get-recipe "Taboule aux lentilles" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "amandes" (tablespoon 2))
		    (make-ingredient "biscotte melba" 2)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))))))

;; Collation 2 du vendredi de la 6e semaine du livre 2
(def ven-col2-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "poivron" (cup 1/2))))))

;; Souper du vendredi de la 6e semaine du livre 2
(def ven-souper-2-6
     (list
      (get-recipe "Truite a l'erable" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz brun" (cup (* 2 1/2)))
		    (make-ingredient "pois mange-tout" (cup (* 2 1)))))))
      

;; Vendredi de la 6e semaine du livre 2
(def vendredi-2-6
     (concat
      ven-dej-2-6
      ven-col1-2-6
      ven-diner-2-6
      ven-col2-2-6
      ven-souper-2-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 6e semaine du livre 2
(def sam-dej-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "bagel ble entier" 1)
		    (make-ingredient "beurre d'arachide" (tablespoon 1))
		    (make-ingredient "melon d'eau" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 6e semaine du livre 2
(def sam-col1-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "concombre" (cup 1/2))))))

;; Diner du samedi de la 6e semaine du livre 2
(def sam-diner-2-6
     (list
      (get-recipe "Soupe aux carottes et au gingembre" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "ciabatta ble entier" 1/2)
		    (make-ingrrdient "hoummos" (tablespoon 3))
		    (make-ingredient "fromage allege" (gram 25))))))

;; Collation 2 du samedi de la 6e semaine du livre 2
(def sam-col2-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "amandes" (tablespoon 1))))))

;; Souper du samedi de la 6e semaine du livre 2
(def sam-souper-2-6
     (list
      (get-recipe "Filet de porc aux canneberges" 2)
      (get-recipe "Panna cotta, compotee de fruits" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "orge" (cup (* 2 1/2)))
		    (make-ingredient "courgette" (cup (* 2 1)))))))

;; Samedi de la 6e semaine du livre 2
(def samedi-2-6
     (concat
      sam-dej-2-6
      sam-col1-2-6
      sam-diner-2-6
      sam-col2-2-6
      sam-souper-2-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 6e semaine du livre 2
(def dim-dej-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "oeuf" 1)
		    (make-ingredient "margarine non hydrogenee" (teaspoon 1))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du dimanche de la 6e semaine du livre 2
(def dim-col1-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "compote de pomme" (cup 1/2))))))

;; Diner du dimanche de la 6e semaine du livre 2
(def dim-diner-2-6
     (list
      (get-recipe "Sandwich au porc a la dijonnaise" 2)
      (get-recipe "Salade carottes et raisins secs" 2)))


;; Collation 2 du dimanche de la 6e semaine du livre 2
(def dim-col2-2-6
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))


;; Souper du dimanche de la 6e semaine du livre 2
(def dim-souper-2-6
     (list
      (get-recipe "Pizza au poulet" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))
		    (make-ingredient "recette panna cotta, compotee de fruits" 2)))))

;; Dimanche de la 6e semaine du livre 2
(def dimanche-2-6
     (concat
      dim-dej-2-6
      dim-col1-2-6
      dim-diner-2-6
      dim-col2-2-6
      dim-souper-2-6))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  2-6 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 2-6
(def semaine-2-6
     (concat
      lundi-2-6
      mardi-2-6
      mercredi-2-6
      jeudi-2-6
      vendredi-2-6
      samedi-2-6
      dimanche-2-6))
