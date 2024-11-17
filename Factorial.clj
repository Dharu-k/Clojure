(defn factorial [n]
  (if (<= n 1)
    1
    (* n (factorial (dec n)))))
(println (factorial 5)) 


;OUTPUT : 120
