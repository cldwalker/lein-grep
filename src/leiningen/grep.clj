(ns leiningen.grep
  (:require leiningen.search))

(defn grep
  "Same search syntax as the default search command but output
   is in an ascii table with one line per result."
  ([project query] (grep project query 1))
  ([project query page]
     (leiningen.search/search project query page)))

;; override search fns until I can hook into them
(ns leiningen.search
  (:require [table.core :refer [table]]))

(defn- parse-result [result]
  (let [group-id (.groupId result)
        artifact-id (.artifactId result)
        version (.version result)
        ;classifier (.classifier result)
        ;packaging (.packaging result)
        name (if (= group-id artifact-id)
               (symbol artifact-id)
               (symbol group-id artifact-id))]
    {
     :artifact artifact-id
     :group group-id
     :version version
     :name name
     :desc (or (.description result) "")}))

(defn- print-results [response page]
  (when (seq response)
    (let [results (map parse-result response)]
      (table results))
    (println " == Page" page "/"
             (-> (.getTotalHitsCount response) (/ page-size) Math/ceil int))    
    (println)))