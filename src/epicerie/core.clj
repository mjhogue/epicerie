(ns epicerie.core
  (:require clojure.contrib.duck-streams)
  (:require clojure.contrib.set))

;; can = can
;; C = cup
;; T = tablespoon
;; t = teaspoon
;; g = gram
;; kg = kilogram
;; mL = milliliter
;; L = liter

(defstruct recipe :name :quantity :ingredients)
(defstruct ingredient :name :quantity)
(defstruct quantity :number :unit)

(defn number-to-quantity [n]
  (if (number? n)
    (struct quantity n)
    n))

(defn make-recipe
  "Makes a recipe, q can be a number or a struct quantity."
  ([q ingredients]
     (make-recipe "" q ingredients))
  ([name q ingredients]
     (struct recipe
	     name
	     (number-to-quantity q)
	     ingredients)))

(defn make-ingredient
  [name q]
  (struct ingredient name (number-to-quantity q)))

(defmacro def-unit
  "Defines a function with name 'name' that creates a struct quantity for this new unit."
  [name string]
  `(defn ~name [n#]
     (struct quantity n# ~string)))

(def-unit can "can")
(def-unit cup "C")
(def-unit tablespoon "T")
(def-unit teaspoon "t")
(def-unit gram "g")
(def-unit kilogram "kg")
(def-unit milliliter "mL")
(def-unit liter "L")

(defn scale-quantity [n q]
  (struct quantity (* n (:number q)) (:unit q)))

(defn scale-ingredient [n ing]
  (make-ingredient (:name ing) (scale-quantity n (:quantity ing))))

(defn scale-recipe [n r]
  (make-recipe (:name r)
	       (scale-quantity n (:quantity r))
	       (map (partial scale-ingredient n) (:ingredients r))))

(def ^:dynamic *all-recipes* (atom '()))
(defn get-recipe
  "Get a recipe, with ingredients scaled for quantity q if possible."
  ([name] (get-recipe name nil))
  ([name q]
     (let [r (first (filter #(= (:name %) name) @*all-recipes*))]
       (if (not (= r nil))
	 (let [my-q (if (= q nil) ;; if q is nil, scale by 1, ie
		      (:quantity r) ;; return quantity as described in recipe
		      (number-to-quantity q))] ;; otherwise make a quantity out of q
	   (if (= (:unit (:quantity r))
		  (:unit my-q))
	     (scale-recipe (/ (:number my-q) (:number (:quantity r))) r)
	     (throw (Error. (str "Wrong type for scaling recipe: " name)))))
	 (throw (Error. (str "Recipe not found: " name)))))))

(defn add-quantity
  "Add a and b only if they have the same units, otherwise returns nil."
  [a b]
  (if (=
       (:unit a)
       (:unit b))
    (struct quantity (+ (:number a) (:number b)) (:unit a))))

(defn add-ingredients
  "Add a and b only if they have the same name and units, otherwise return nil."
  [a b]
  (if (and
       (= (:name a)
	  (:name b))
       (= (:unit (:quantity a))
	  (:unit (:quantity b))))
    (make-ingredient (:name a)
		     (add-quantity
		      (:quantity a)
		      (:quantity b)))))

(defn name-unit-ingredient [ing]
  (let [{name :name, {unit :unit} :quantity} ing]
    (list name unit)))

(defn unique-ingredients [coll_ing]
  (seq (set (map name-unit-ingredient coll_ing))))

(defn compatible-ingredients?
  "Return a function that takes an ingredient and verifies if the initial ingredient that 'a' came from is compatible with it."
  [a]
  (fn [b] (= a (name-unit-ingredient b))))

(defn reduce-ingredients [coll_ing]
  ;; for each function that verify compatibility with each unique ingredient of coll_ing,
  ;; filter the collection of ingredients. ie.: generate a list of lists of ingredients compatible
  ;; with each other, then reduce these lists with add-ingredients, and produce a final list, which
  ;; should contain only a single copy of each compatible ingredients (in other words, all
  ;; ingredients should now be incompatible).
  (for [ing
	(for [f (map compatible-ingredients? (unique-ingredients coll_ing))]
	  (filter f coll_ing))]
    (reduce add-ingredients ing)))

(defn get-all-ingredients [coll-recipes]
  (apply concat
	 (map :ingredients coll-recipes)))

(defn ingredient-list [coll-recipes]
  (reduce-ingredients (get-all-ingredients coll-recipes)))

(def short-to-long-unit
     {"can" "canne"
      "C" "tasse"
      "T" "c. a table"
      "t" "c. a the"
      "g" "g"
      "kg" "kg"
      "mL" "mL"
      "L" "L"})

(defn ingredient-to-string [ing]
  (format "[ ] %-30s %s %s"
	  (:name ing)
	  (str ((ing :quantity) :number))
	  (if (not (= nil ((ing :quantity) :unit)))
	    (short-to-long-unit ((ing :quantity) :unit))
	    "")))

(defn print-ingredients [file coll_ing]
  (clojure.contrib.duck-streams/write-lines
   file
   (sort
    (map ingredient-to-string coll_ing))))
