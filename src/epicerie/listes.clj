(ns epicerie.listes
  (:use epicerie.core)
  (:use [epicerie.recettes autres-1 autres-2 recettes-200-299-1 recettes-200-299-2 recettes-200moins-1 recettes-200moins-2
         recettes-300-399-1 recettes-300-399-2 recettes-400plus-1 recettes-400plus-2])
  (:use [epicerie.semaines semaine-1-1 semaine-1-2 semaine-2-2 semaine-2-2-modif semaine-2-3 semaine-2-3-modif
         semaine-2-4 semaine-2-4-modif semaine-2-5 semaine-2-6 semaine-2-7 semaine-2-8]))

;; ;; semaine 1
;; (def semaine-1
;;      (list
;;       (get-recipe "ketchup" (cup 4))
;;       (make-recipe "recette a part" 1 ;; cette recette n'est pas accessible par get-recipe, car elle n'est pas dans all-recipes ci-haut
;; 		   (list
;; 		    (make-ingredient "cereales" (cup 2))))
;;       (get-recipe "dejeuner 1" 2)))

;; ;; la semaine 2 est identique a la semaine 1, mais avec les recettes doublees
;; (def semaine-2
;;      (map (partial scale-recipe 2) semaine-1))

;; ;; le mois 1 est une répétition des semaines 1 et 2
;; (def mois-1
;;      (concat
;;       semaine-1
;;       semaine-2
;;       semaine-1
;;       semaine-2))

;; 					; EXEMPLES

;; ;; Produit la liste des ingredients d'une liste de recettes
;; (ingredient-list all-recipes)
;; (ingredient-list semaine-1)
;; (ingredient-list semaine-2)
;; (ingredient-list mois-1)

;; ;; Produit la liste doublee des ingredients de la semaine 1 vers un fichier
;; (print-ingredients "c:\\epicerie\\epicerie.txt"
;; 		   (ingredient-list (map (partial scale-recipe 2) semaine-1)))


					; EXEMPLES

;; Produit la liste des ingredients de la semaine 2-4-modif
(print-ingredients "./epicerie.txt" (ingredient-list semaine-2-3-modif))

