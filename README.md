# ui-echarts [![GitHub Actions status |pink-gorilla/ui-echartsmirror](https://github.com/pink-gorilla/ui-echarts/workflows/CI/badge.svg)](https://github.com/pink-gorilla/ui-echarts/actions?workflow=CI)[![Clojars Project](https://img.shields.io/clojars/v/org.pinkgorilla/ui-echarts.svg)](https://clojars.org/org.pinkgorilla/ui-echarts)

Apache ECharts

## End-Users
- this project is NOT for you! Instead go to:
- [goldly](https://github.com/pink-gorilla/goldly)
 
## Demo

```
clojure -X:webly:npm-install
clojure -X:webly:compile
clojure -X:webly:run
```

Navigate your webbrowser to port 8080. 

** problems**

If there are problems in using echarts with errors to "buffer" then `npm install shadow-cljs --save` might fix it.
thheller: both buffer and process are polyfills packages that shadow-cljs will provide ... 
the npm package is mostly the for CLI stuff but also brings in some extra npm packages
the compiler is from the CLJ dependency you have in project.clj.
the npm stuff never does any actual compilation, just runs the java process

you do not need to worry about process or buffer at all
you can fix this easily by bumping 
:compiler-options {:output-feature-set :es6} or whatever language level is appropriate
:es8 is good if you have bunch of async/await code in libs

With UNPKG you can see output of npm builds. Useful for debugging.
https://unpkg.com/browse/vega-embed@6.19.1/build/vega-embed.js