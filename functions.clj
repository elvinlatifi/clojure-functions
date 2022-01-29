
;; Helper function for my-max
(defn bigger
  [num1 num2]
  (if (> num1 num2)
    num1
    num2))

;; Definition of my-max
(defn my-max
  ([l]
   (if (empty? l)
     nil
     (my-max l 0)))
  ([l curMax]
   (if (empty? l)
     curMax
     (my-max (rest l) (bigger curMax (first l))))))

;; Definition of my-reverse
(defn my-reverse
  ([l]
   (if (list? l)
     (my-reverse l '())
     nil))
  ([l reversedList]
   (if (empty? l)
     reversedList
     (my-reverse (rest l) (conj reversedList (first l))))))

;; Definition of my-map (the already implemented my-reverse is used as helper function)
(defn my-map
  ([l func]
    (my-map l func '()))
  ([l func newList]
   (if (empty? l)
     (my-reverse newList)
     (my-map (rest l) func (conj newList (func (first l)))))))

