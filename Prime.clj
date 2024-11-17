(defn is-prime? [n]
  (cond
    (< n 2) false 
    (= n 2) true  
    :else
    (not-any? #(zero? (mod n %)) (range 2 (inc (Math/sqrt n)))))) 
(println (is-prime? 7))
(println (is-prime? 10))

; OUTPUT : 
; true
; false
