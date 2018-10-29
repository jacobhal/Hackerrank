
;; Too slow/Takes too much stack space
(defn countingValleys [s level]
  (if (empty? s) 0
      (let [x (subs s 0 1)]
        (cond
          (and (= x "U") (= level -1)) (+ 1 (countingValleys (subs s 1 (count s)) (+ level 1)))
          (= x "U") (recur (subs s 1 (count s)) (+ level 1))
          (= x "D") (recur (subs s 1 (count s)) (- level 1))))))

(defn reducingFn [[valleyCount seaLevel] letter]
  (if (= letter \D)
    (if (= seaLevel 0)
      [(inc valleyCount) (dec seaLevel)]
      [valleyCount (dec seaLevel)])
    [valleyCount (inc seaLevel)]))

(read-line) ;; Read length of sequence and ignore it
(println (first (reduce reducingFn [0 0] (seq (read-line)))))
