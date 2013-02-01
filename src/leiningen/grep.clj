(ns leiningen.grep
  (:require [leiningen.search :as search]
            [leiningen.core.user :as user]
            [table.core :refer [table]]))

; this number needs to be higher than the default to get through
; all the duplicates caused by versions
(def ^:private page-size (:grep-page-size (:user (user/profiles)) 500))

(defn- parse-result [result]
  (let [group-id (.groupId result)
        artifact-id (.artifactId result)
        version (.version result)
        ;classifier (.classifier result)
        ;packaging (.packaging result)
        name (if (= group-id artifact-id)
               (keyword artifact-id)
               (keyword group-id artifact-id))]
    {
     :artifact artifact-id
     :group group-id
     :version version
     :name name
     :desc (or (.description result) "")}))

(defn- filter-latest-version-per-name [results]
  (vals (reduce
         (fn [total {:keys [name version] :as row}]
           (if (total name)
             (if (pos? (compare version (:version (total name))))
               (assoc total name row)
               total)
             (assoc total name row)))
         {}
         results)))

(defn- print-results [response page]
  (when (seq response)
    (let [results (->> (map parse-result response)
                       filter-latest-version-per-name
                       (map #(dissoc % :name)))]
      (table results :sort true)
      (println (format "Count: %s\nPage: %s/%s"
                       (count results)
                       page
                       (-> (count results) (/ page-size) Math/ceil int))))
    (println)))

(defn grep
  "Same search syntax/engine as the default search command but output
is in an ascii table with one line per result."
  ([project query & [temp-page-size]]
     ; remove redefs if search gets an api
     (with-redefs [search/page-size (if temp-page-size (Integer/parseInt temp-page-size) page-size)
                   search/print-results print-results]
       (leiningen.search/search project query))))
