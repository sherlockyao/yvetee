(ns yvetee.core
  (:gen-class))

(defn exec-cmd
  [cmd]
  (if (= cmd "exit")
    true
    (do
      (println (str cmd " executed"))
      false)))

(defn -main
  "The main entry of the app."
  [& args]
  (loop [cmd "help"]
    (if (exec-cmd cmd)
      (println "Bye Bye")
      (recur (read-line)))))

;(loop [cmd (read-line)]
;  (if (== cmd "exit")
;    (println "Bye Bye")
;    (recur (read-line)))
