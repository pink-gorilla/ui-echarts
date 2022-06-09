# ui-echarts [![GitHub Actions status |pink-gorilla/ui-echartsmirror](https://github.com/pink-gorilla/ui-echarts/workflows/CI/badge.svg)](https://github.com/pink-gorilla/ui-echarts/actions?workflow=CI)[![Clojars Project](https://img.shields.io/clojars/v/org.pinkgorilla/ui-echarts.svg)](https://clojars.org/org.pinkgorilla/ui-echarts)

Apache ECharts

## End-Users
- this project is NOT for you! Instead go to:
- [goldly](https://github.com/pink-gorilla/goldly)
 
## Demo

```
clojure -X:goldly
```

Navigate your webbrowser to port 8080. 


## build your own bundle (for testing):


```
clj -X:goldly:build :profile '"npm-install"'
clj -X:goldly:build :profile '"compile2"'
clojure -X:goldly
```