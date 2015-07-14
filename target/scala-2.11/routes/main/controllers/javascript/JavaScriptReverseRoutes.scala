
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dan/activator/guru/conf/routes
// @DATE:Fri Jul 10 13:39:59 PDT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseTwitter(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def getTweetsGeo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Twitter.getTweetsGeo",
      """
        function(location,auth) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "twitter_geo/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("location", encodeURIComponent(location)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("auth", encodeURIComponent(auth))})
        }
      """
    )
  
    // @LINE:7
    def getTweets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Twitter.getTweets",
      """
        function(location) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "twitter/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("location", encodeURIComponent(location))})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}