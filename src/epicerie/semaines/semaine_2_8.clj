                                                                  ;; SEMAINE 8 DU LIVRE 2
(ns epicerie.semaines.semaine-2-8
  (:use epicerie.core))     
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 8e semaine du livre 2
(def lun-dej-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de ble filamente" (cup 1))
		    (make-ingredient "graines de lin moulues" (tablespoon 1/2))
		    (make-ingredient "melon miel" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 8e semaine du livre 2
(def lun-col1-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du lundi de la 8e semaine du livre 2
(def lun-diner-2-8
     (list
      (get-recipe "Salade quinoa, tofu et gouda" 1)))

;; Collation 2 du lundi de la 8e semaine du livre 2
(def lun-col2-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "prune" 1))))

;; Souper du lundi de la 8e semaine du livre 2
(def lun-souper-2-8
     (list
      (get-recipe "Boeuf aux herbes et au brie" 2)
      (get-recipe "Salade toute verte" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "orge" (cup (* 2 1/2)))
		    (make-ingredient "asperge" (cup (* 2 1/2)))))))



;; Lundi de la 8e semaine du livre 2
(def lundi-2-8
     (concat
      lun-dej-2-8
      lun-col1-2-8
      lun-diner-2-8
      lun-col2-2-8
      lun-souper-2-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 8e semaine du livre 2
(def mar-dej-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "margarine hydrogenee" (teaspoon 1))
		    (make-ingredient "fromage allege" (gram 25))
		    (make-ingredient "framboise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 8e semaine du livre 2
(def mar-col1-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "peche" 1)))))

;; Diner du mardi de la 8e semaine du livre 2
(def mar-diner-2-8
     (list
      (get-recipe "Couscous au poulet et aux fruits seches" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "poivron" (cup 1/2))))))

;; Collation 2 du mardi de la 8e semaine du livre 2
(def mar-col2-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "galette de riz brun" 1)
		    (make-ingredient "hoummos" (teaspoon 4))))))

;; Souper du mardi de la 8e semaine du livre 2
(def mar-souper-2-8
     (list
      (get-recipe "Mahi-mahi en croute de germe de ble" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "pomme de terre grelot" (* 2 2))
		    (make-ingredient "bok choy" (cup (* 2 1)))))))


;; Mardi de la 8e semaine du livre 2
(def mardi-2-8
     (concat
      mar-dej-2-8
      mar-col1-2-8
      mar-diner-2-8
      mar-col2-2-8
      mar-souper-2-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 8e semaine du livre 2
(def mer-dej-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "bagel ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "melon miel" (cup 3/4))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 8e semaine du livre 2
(def mer-col1-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "mangue" (cup 1/2))))))

;; Diner du mercredi de la 8e semaine du livre 2
(def mer-diner-2-8
     (list
      (get-recipe "Sandwich a la garniture de tofu" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Collation 2 du mercredi de la 8e semaine du livre 2
(def mer-col2-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))
		    (make-ingredient "concombre" (cup 1/2))))))

;; Souper du mercredi de la 8e semaine du livre 2
(def mer-souper-2-8
     (list
      (get-recipe "Pizza mexicaine" 2)))

;; Mercredi de la 8e semaine du livre 2
(def mercredi-2-8
     (concat
      mer-dej-2-8
      mer-col1-2-8
      mer-diner-2-8
      mer-col2-2-8
      mer-souper-2-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 8e semaine du livre 2
(def jeu-dej-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau" (cup 3/4))
		    (make-ingredient "graines de lin moulues" (tablespoon 1))
		    (make-ingredient "sirop d'erable" (tablespoon 1/2))
		    (make-ingredient "framboise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 8e semaine du livre 2
(def jeu-col1-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt a boire de 200 ml" 1)))))

;; Diner du jeudi de la 8e semaine du livre 2
(def jeu-diner-2-8
     (list
      (get-recipe "Bagel au saumon fume" 1)
      (get-recipe "Salade de chou cremeuse" 1)))

;; Collation 2 du jeudi de la 8e semaine du livre 2
(def jeu-col2-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "poivron" (cup 1/2))
		    (make-ingredient "concombre" (cup 1/2))))))

;; Souper du jeudi  de la 8e semaine du livre 2
(def jeu-souper-2-8
     (list
      (get-recipe "Cotelettes de porc aux pommes" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz brun" (cup (* 2 1/2)))
		    (make-ingredient "carotte" (cup (* 2 1/2)))
		    (make-ingredient "panais" (cup (* 2 1/2)))))))

;; Jeudi de la 8e semaine du livre 2
(def jeudi-2-8
     (concat
      jeu-dej-2-8
      jeu-col1-2-8
      jeu-diner-2-8
      jeu-col2-2-8
      jeu-souper-2-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 8e semaine du livre 2
(def ven-dej-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 2)
		    (make-ingredient "margarine non hydrogenee" (teaspoon 1))
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "framboise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 8e semaine du livre 2
(def ven-col1-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "graines de tournesol" (tablespoon 1))))))

;; Diner du vendredi de la 8e semaine du livre 2
(def ven-diner-2-8
     (list
      (get-recipe "Wrap a la tartinade de haricots" 1)
      (get-recipe "Salade toute verte" 1)))

;; Collation 2 du vendredi de la 8e semaine du livre 2
(def ven-col2-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))

;; Souper du vendredi de la 8e semaine du livre 2
(def ven-souper-2-8
     (list
      (get-recipe "Brochettes de lotte teriyaki aux peches" 2)
      (get-recipe "Cheesecake au tofu" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1/2)))
		    (make-ingredient "bok choy" (cup (* 2 1)))))))
      

;; Vendredi de la 8e semaine du livre 2
(def vendredi-2-8
     (concat
      ven-dej-2-8
      ven-col1-2-8
      ven-diner-2-8
      ven-col2-2-8
      ven-souper-2-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 8e semaine du livre 2
(def sam-dej-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
		    (make-ingredient "brie allege" (gram 25))
		    (make-ingredient "prune" 1)
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 8e semaine du livre 2
(def sam-col1-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))

;; Diner du samedi de la 8e semaine du livre 2
(def sam-diner-2-8
     (list
      (get-recipe "Salade saumon et pommes de terre" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "gelette de riz brun" 3)))))

;; Collation 2 du samedi de la 8e semaine du livre 2
(def sam-col2-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Souper du samedi de la 8e semaine du livre 2
(def sam-souper-2-8
     (list
      (get-recipe "Poulet marocain sur legumes-racines" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1/2)
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Samedi de la 8e semaine du livre 2
(def samedi-2-8
     (concat
      sam-dej-2-8
      sam-col1-2-8
      sam-diner-2-8
      sam-col2-2-8
      sam-souper-2-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 8e semaine du livre 2
(def dim-dej-2-8
     (list
      (get-recipe "Smoothie energisant" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "recette muffin courgette et citron" 1)
		    (make-ingredient "melon miel" (cup 1/2))))))

;; Collation 1 du dimanche de la 8e semaine du livre 2
(def dim-col1-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))

;; Diner du dimanche de la 8e semaine du livre 2
(def dim-diner-2-8
     (list
      (get-recipe "Coleslaw au poulet" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "galette de riz brun" 3)
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 2 du dimanche de la 8e semaine du livre 2
(def dim-col2-2-8
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" (cup 3/4))
		    (make-ingredient "cereales de type granola legeres" (tablespoon 2))))))

;; Souper du dimanche de la 8e semaine du livre 2
(def dim-souper-2-8
     (list
      (get-recipe "Crevettes croustillantes au coco" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "nouille de riz" (cup (* 2 1/2)))
		    (make-ingredient "asperge" (cup (* 2 1)))
		    (make-ingredient "recette cheesecake au tofu" 2)))))

;; Dimanche de la 8e semaine du livre 2
(def dimanche-2-8
     (concat
      dim-dej-2-8
      dim-col1-2-8
      dim-diner-2-8
      dim-col2-2-8
      dim-souper-2-8))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  2-8 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 2-8
(def semaine-2-8
     (concat
      lundi-2-8
      mardi-2-8
      mercredi-2-8
      jeudi-2-8
      vendredi-2-8
      samedi-2-8
      dimanche-2-8))
