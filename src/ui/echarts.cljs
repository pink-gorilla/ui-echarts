(ns ui.echarts
  (:require
   ["echarts" :as aecharts]))

(defn echarts
  ([echart-option]
   (echarts echart-option nil))
  ([echart-option {:keys [on register-map]
                   :as options}]
   (fn []
     [:div
      {:style {:height "500px"}
       :ref (fn [el]
              (when el
                (when-let [[map-name map-options] register-map]
                  (.registerMap aecharts
                                map-name (clj->js map-options)))
                (let [chart (.init aecharts el)]
                  (->> echart-option
                       clj->js
                       (.setOption chart))
                  (some->> on
                           (run! (fn [[event-type f]]
                                   (.on chart
                                        (name event-type)
                                        f)))))))}])))

