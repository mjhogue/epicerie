                                                                  ;; SEMAINE 3 DU LIVRE 1
(ns epicerie.semaines.semaine-1-3
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 3e semaine du livre 1
(def lun-dej-1-3
     (list
      (make-recipe 1
		   (list
        (make-ingredient "Salade tropicale" 1)
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
        (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 3e semaine du livre 1
(def lun-col1-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Muffin aux carottes et aux canneberges" 1)))))

;; Diner du lundi de la 3e semaine du livre 1
(def lun-diner-1-3
     (list
      (get-recipe "Sandwich le vege" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 3/4))))))

;; Souper du lundi de la 3e semaine du livre 1
(def lun-souper-1-3
     (list
      (get-recipe "Filet de pangasius a la sauce creole" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1/2))) ))))

;; Lundi de la 3e semaine du livre 1
(def lundi-1-3
     (concat
      lun-dej-1-3
      lun-col1-1-3
      lun-diner-1-3
      lun-souper-1-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 3e semaine du livre 1
(def mar-dej-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "gruau nature" (cup 3/4))
		    (make-ingredient "banane" 1)
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mardi de la 3e semaine du livre 1
(def mar-col1-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "fromage patiellement ecreme" (gram 25))))))

;; Diner du mardi de la 3e semaine du livre 1
(def mar-diner-1-3
     (list
      (get-recipe "Salade la simplette" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "sardines" (gram 60))
        (make-ingredient "biscotte melba" 4)))))

;; Souper du mardi de la 3e semaine du livre 1
(def mar-souper-1-3
     (list
      (get-recipe "Saute de boeuf" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "courge spaghetti" (cup (* 2 1)))
		    (make-ingredient "pita ble entier" 1)
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Mardi de la 3e semaine du livre 1
(def mardi-1-3
     (concat
      mar-dej-1-3
      mar-col1-1-3
      mar-diner-1-3
      mar-souper-1-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 3e semaine du livre 1
(def mer-dej-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "yogourt nature sans gras" 1/2)
		    (make-ingredient "cereales de type granola legeres" (cup 1/4))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 3e semaine du livre 1
(def mer-col1-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "melon d'eau" (cup 1/2))))))

;; Diner du mercredi de la 3e semaine du livre 1
(def mer-diner-1-3
     (list
      (get-recipe "Sandwich le dinde-legumes" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "radis" (cup 1/2))
		    (make-ingredient "concombre" (cup 1/2))))))

;; Souper du mercredi de la 3e semaine du livre 1
(def mer-souper-1-3
     (list
      (get-recipe "Cari aux pois chiches" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz" (cup (* 2 1)))))))

;; Mercredi de la 3e semaine du livre 1
(def mercredi-1-3
     (concat
      mer-dej-1-3
      mer-col1-1-3
      mer-diner-1-3
      mer-souper-1-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 3e semaine du livre 1
(def jeu-dej-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1/2)
		    (make-ingredient "fromage cottage 1 %" (cup 1/2))
        (make-ingredient "melon d'eau" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 3e semaine du livre 1
(def jeu-col1-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "radis" (cup 1/2))
        (make-ingredient "celeri" (cup 1/2))))))

;; Diner du jeudi de la 3e semaine du livre 1
(def jeu-diner-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Cari aux pois chiches" 1)
		    (make-ingredient "riz" (cup 3/4))))))

;; Souper du jeudi  de la 3e semaine du livre 1
(def jeu-souper-1-3
     (list
      (get-recipe "Quesadillas au poulet" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "brocoli" (cup (* 2 1/2)))))))

;; Jeudi de la 3e semaine du livre 1
(def jeudi-1-3
     (concat
      jeu-dej-1-3
      jeu-col1-1-3
      jeu-diner-1-3
      jeu-souper-1-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 3e semaine du livre 1
(def ven-dej-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Muffin aux carottes et aux canneberges" 1)
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 3e semaine du livre 1
(def ven-col1-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "poivron" (cup 1/2))))))

;; Diner du vendredi de la 3e semaine du livre 1
(def ven-diner-1-3
     (list
      (get-recipe "Salade la chiche" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "biscotte melba" 3)))))

;; Souper du vendredi de la 3e semaine du livre 1
(def ven-souper-1-3
     (list
      (get-recipe "Roulade de veau au brie et aux tomates" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "couscous" (cup (* 2 1)))
        (make-ingredient "courgette" (cup (* 2 1/2)))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Vendredi de la 3e semaine du livre 1
(def vendredi-1-3
     (concat
      ven-dej-1-3
      ven-col1-1-3
      ven-diner-1-3
      ven-souper-1-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 3e semaine du livre 1
(def sam-dej-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entie" 2)
		    (make-ingredient "beurre d'arachide" (teaspoon 1))
		    (make-ingredient "melon d'eau" (cup 3/4))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 3e semaine du livre 1
(def sam-col1-1-3
     (list
      (get-recipe "Barre granola maison" 1)))

;; Diner du samedi de la 3e semaine du livre 1
(def sam-diner-1-3
     (list
      (get-recipe "Crepe au poulet et au fromage" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "asperge" (cup (* 2 1/2)))
		    (make-ingredient "concombre" (cup (* 2 1/2)))))))

;; Souper du samedi de la 3e semaine du livre 1
(def sam-souper-1-3
     (list
      (get-recipe "Crevettes grillees" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "orge" (cup (* 2 3/4)))
		    (make-ingredient "chou-fleur" (cup (* 2 1)))
		    (make-ingredient "kiwi" 1)))))

;; Samedi de la 3e semaine du livre 1
(def samedi-1-3
     (concat
      sam-dej-1-3
      sam-col1-1-3
      sam-diner-1-3
      sam-souper-1-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 3e semaine du livre 1
(def dim-dej-1-3
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Collation 1 du dimanche de la 3e semaine du livre 1
(def dim-col1-1-3
     (list
      (get-recipe "Pudding au riz au lait de coco" 2)))

;; Diner du dimanche de la 3e semaine du livre 1
(def dim-diner-1-3
     (list
      (get-recipe "Omelette au saumon fume" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "asperge" (cup (* 2 1)))))))

;; Souper du dimanche de la 3e semaine du livre 1
(def dim-souper-1-3
     (list
      (get-recipe "Pates au pesto" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup (* 2 1/2)))
		    (make-ingredient "bleuet" (cup 1/2))))))

;; Dimanche de la 3e semaine du livre 1
(def dimanche-1-3
     (concat
      dim-dej-1-3
      dim-col1-1-3
      dim-diner-1-3
      dim-souper-1-3))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  1-3 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 1-3
(def semaine-1-3
     (concat
      lundi-1-3
      mardi-1-3
      mercredi-1-3
      jeudi-1-3
      vendredi-1-3
      samedi-1-3
      dimanche-1-3))




