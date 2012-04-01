                                                                  ;; SEMAINE 1 DU LIVRE 2
(ns epicerie.semaines.semaine-2-1-modif
  (:use epicerie.core))
                                                                  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; L U N D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du lundi de la 1e semaine du livre 2
(def lun-dej-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
        (make-ingredient "beurre d'arachise" (teaspoon 2))
		    (make-ingredient "melon d'eau" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du lundi de la 1e semaine du livre 2
(def lun-col1-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du lundi de la 1e semaine du livre 2
(def lun-diner-2-1
     (list
      (get-recipe "Salade oeufs et feta" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "craquelin de seigle" 2)
		    (make-ingredient "bleuet" (cup 1/2))))))

;; Collation 2 du lundi de la 1e semaine du livre 2
(def lun-col2-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "lait de soya" (cup 1/2))
        (make-ingredient "raisin" 10)))))

;; Souper du lundi de la 1e semaine du livre 2
(def lun-souper-2-1
     (list
      (get-recipe "Tilapia a la lime" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "quinoa" (cup (* 2 1)))
		    (make-ingredient "brocoli" (cup (* 2 1))) ))))

;; Lundi de la 1e semaine du livre 2
(def lundi-2-1
     (concat
      lun-dej-2-1
      lun-col1-2-1
      lun-diner-2-1
      lun-col2-2-1
      lun-souper-2-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M A R D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mardi de la 1e semaine du livre 2
(def mar-dej-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "pamplemousse" 1/2)
		    (make-ingredient "cereales de son" (cup 1))
		    (make-ingredient "lait de soya" (cup 1))
		    (make-ingredient "graines de lin moulues" (tablespoon 1/2))))))

;; Collation 1 du mardi de la 1e semaine du livre 2
(def mar-col1-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "brocoli" (cup 1/2))))))

;; Diner du mardi de la 1e semaine du livre 2
(def mar-diner-2-1
     (list
      (get-recipe "Wrap thon et avocat" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "jus de legumes" (cup 1/2))))))

;; Collation 2 du mardi de la 1e semaine du livre 2
(def mar-col2-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "galette de riz brun" 1)
        (make-ingredient "fromage allege" (gram 25))))))

;; Souper du mardi de la 1e semaine du livre 2
(def mar-souper-2-1
     (list
      (get-recipe "Frittata aux legumes et au fromage" 2)
      (get-recipe "Salade toute verte" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 1)
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Mardi de la 1e semaine du livre 2
(def mardi-2-1
     (concat
      mar-dej-2-1
      mar-col1-2-1
      mar-diner-2-1
      mar-col2-2-1
      mar-souper-2-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; M E R C R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du mercredi de la 1e semaine du livre 2
(def mer-dej-2-1
     (list
      (make-recipe 1
		   (list
        (make-ingredient "pamplemousse" 1/2)
		    (make-ingredient "muffin anglais ble entier" 2)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du mercredi de la 1e semaine du livre 2
(def mer-col1-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "compotee de pommes" (cup 1/2))))))

;; Diner du mercredi de la 1e semaine du livre 2
(def mer-diner-2-1
     (list
      (get-recipe "Salade quinoa, tofu et gouda" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))

;; Collation 2 du mercredi de la 1e semaine du livre 2
(def mer-col2-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "noix de grenoble" (tablespoon 2))))))

;; Souper du mercredi de la 1e semaine du livre 2
(def mer-souper-2-1
     (list
      (get-recipe "Poulet farci au fromage et aux epinards" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz brun" (cup (* 2 1/2)))
        (make-ingredient "courgette" (cup (* 2 1)))))))

;; Mercredi de la 1e semaine du livre 2
(def mercredi-2-1
     (concat
      mer-dej-2-1
      mer-col1-2-1
      mer-diner-2-1
      mer-col2-2-1
      mer-souper-2-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; J E U D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du jeudi de la 1e semaine du livre 2
(def jeu-dej-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "cereales de son" (cup 1/4))
		    (make-ingredient "cereales de mais" (cup 1/2))
		    (make-ingredient "melon d'eau" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du jeudi de la 1e semaine du livre 2
(def jeu-col1-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "raisin" 20)))))

;; Diner du jeudi de la 1e semaine du livre 2
(def jeu-diner-2-1
     (list
      (get-recipe "Couscous au poulet et aux fruits seches" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "poivron" (cup 1/2))
		    (make-ingredient "yogourt allege de 100 g" 1)))))

;; Collation 2 du jeudi de la 1e semaine du livre 2
(def jeu-col2-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Souper du jeudi  de la 1e semaine du livre 2
(def jeu-souper-2-1
     (list
      (get-recipe "Fletan sur lentilles vertes" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "carotte" (cup (* 2 1)))
		    (make-ingredient "tranche de pain ble entier" 1)))))

;; Jeudi de la 1e semaine du livre 2
(def jeudi-2-1
     (concat
      jeu-dej-2-1
      jeu-col1-2-1
      jeu-diner-2-1
      jeu-col2-2-1
      jeu-souper-2-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; V E N D R E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du vendredi de la 1e semaine du livre 2
(def ven-dej-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "tranche de pain ble entier" 2)
        (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "bleuet" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du vendredi de la 1e semaine du livre 2
(def ven-col1-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du vendredi de la 1e semaine du livre 2
(def ven-diner-2-1
     (list
      (get-recipe "Salade endives, noix de grenoble et feta" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "craquelin de seigle" 2)
        (make-ingredient "oeuf" 1)
        (make-ingredient "fraise" (cup 1/2))))))

;; Collation 2 du vendredi de la 1e semaine du livre 2
(def ven-col2-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "raisin" 10)))))

;; Souper du vendredi de la 1e semaine du livre 2
(def ven-souper-2-1
     (list
      (get-recipe "Cari de tofu" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "riz brun" (cup (* 2 1/2)))
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Vendredi de la 1e semaine du livre 2
(def vendredi-2-1
     (concat
      ven-dej-2-1
      ven-col1-2-1
      ven-diner-2-1
      ven-col2-2-1
      ven-souper-2-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S A M E D I ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du samedi de la 1e semaine du livre 2
(def sam-dej-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "muffin anglais ble entier" 1)
		    (make-ingredient "beurre d'arachide" (teaspoon 2))
		    (make-ingredient "fraise" (cup 1/2))
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du samedi de la 1e semaine du livre 2
(def sam-col1-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "melon d'eau" (cup 1/2))))))

;; Diner du samedi de la 1e semaine du livre 2
(def sam-diner-2-1
     (list
      (get-recipe "Minestrone" 1)
      (make-recipe 1
		   (list
		    (make-ingredient "craquelin de seigle" 2)
        (make-ingredient "fromage allege" (gram 25))
        (make-ingredient "hoummos" (teaspoon 5))
        (make-ingredient "poivron" (cup 1/2))))))

;; Collation 2 du samedi de la 1e semaine du livre 2
(def sam-col2-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "concombre" (cup 1/2))))))

;; Souper du samedi de la 1e semaine du livre 2
(def sam-souper-2-1
     (list
      (get-recipe "Dindon en croute de noix et miel" 2)
      (get-recipe "Salade d'epinards (option raisins)" 2)
      (get-recipe "Crumble aux poires et aux fraises" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "lait de soya" (cup 1/2))))))

;; Samedi de la 1e semaine du livre 2
(def samedi-2-1
     (concat
      sam-dej-2-1
      sam-col1-2-1
      sam-diner-2-1
      sam-col2-2-1
      sam-souper-2-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; D I M A N C H E ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Dejeuner du dimanche de la 1e semaine du livre 2
(def dim-dej-2-1
     (list
      ;;(get-recipe "Tortilla tourbillon de bleuets" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "lait de soya" (cup 1))))))

;; Collation 1 du dimanche de la 1e semaine du livre 2
(def dim-col1-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "celeri" (cup 1/2))))))

;; Diner du dimanche de la 1e semaine du livre 2
(def dim-diner-2-1
     (list
      (get-recipe "Croque-monsieur fruite" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "tomate" (* 2 1/2))))))

;; Collation 2 du dimanche de la 1e semaine du livre 2
(def dim-col2-2-1
     (list
      (make-recipe 1
		   (list
		    (make-ingredient "Galette aux bleuets et aux graines de lin" 1)))))

;; Souper du dimanche de la 1e semaine du livre 2
(def dim-souper-2-1
     (list
      (get-recipe "Poivron farci a la mexicaine" 2)
      (make-recipe 1
		   (list
		    (make-ingredient "Crumble aux poires et aux fraises" 2)))))

;; Dimanche de la 1e semaine du livre 2
(def dimanche-2-1
     (concat
      dim-dej-2-1
      dim-col1-2-1
      dim-diner-2-1
      dim-col2-2-1
      dim-souper-2-1))



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; S E M A I N E  2-1 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Semaine 2-1
(def semaine-2-1-modif
     (concat
      lundi-2-1
      mardi-2-1
      mercredi-2-1
      jeudi-2-1
      vendredi-2-1
      samedi-2-1
      dimanche-2-1))




