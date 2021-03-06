(ns cljs-react-material-ui.tf0054
  (:require
    [cljs-react-material-ui.elements :as el]
    [cljs-react-material-ui.icons :as ic]
    [camel-snake-kebab.core :refer :all])
  )

(doall (map #(let [k (->kebab-case %)]
               (println
                 (str
                   ;"(def " k " (r/adapt-react-class (aget js/MaterialUIIcons \"" % "\")))"
                   "(def " k " (r/adapt-react-class (aget js/MaterialUI \"" % "\")))"
                 ))
               )
            el/tags
            ;ic/tags
            ))

