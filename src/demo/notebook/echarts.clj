(ns demo.notebook.echarts)

^:R
[:div.bg-blue-300 ; test how background is on different color
 [:p "this snippet demonstrates to use echarts"]
 ['ui.echarts/echarts
  {:xAxis {:type "category"
           :data ["Mon" "Tue" "Wed" "Thu" "Fri" "Sat" "Sun"]}
   :yAxis {:type "value"}
   :series [{:data [150 230 224 218 135 147 260]
             :type "line"}]}]
 [:p "live goes on!"]]