(ns my-repl.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "Hello, World!"))

;; Clojureのバージョン参照
(clojure-version)

;; ライブラリ読み込み
(require 'my-repl.core)

;; 名前空間の直接参照
(use 'my-repl.core)

;; ドキュメント参照
(doc str)

;; 関数定義
(defn hello-some [name]
	(format "Hello %s" name))
(hello-some "hoge")
;; => "Hello hoge"
