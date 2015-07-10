
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dan/activator/guru/conf/routes
// @DATE:Fri Jul 10 13:39:59 PDT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:7
  Twitter_1: controllers.Twitter,
  // @LINE:11
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:7
    Twitter_1: controllers.Twitter,
    // @LINE:11
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_2, Twitter_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Twitter_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """twitter/$location<[^/]+>""", """controllers.Twitter.getTweets(location:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """twitter_geo/$location<[^/]+>/$auth<[^/]+>""", """controllers.Twitter.getTweetsGeo(location:String, auth:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Twitter_getTweets1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("twitter/"), DynamicPart("location", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Twitter_getTweets1_invoker = createInvoker(
    Twitter_1.getTweets(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Twitter",
      "getTweets",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """twitter/$location<[^/]+>"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Twitter_getTweetsGeo2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("twitter_geo/"), DynamicPart("location", """[^/]+""",true), StaticPart("/"), DynamicPart("auth", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Twitter_getTweetsGeo2_invoker = createInvoker(
    Twitter_1.getTweetsGeo(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Twitter",
      "getTweetsGeo",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """twitter_geo/$location<[^/]+>/$auth<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:7
    case controllers_Twitter_getTweets1_route(params) =>
      call(params.fromPath[String]("location", None)) { (location) =>
        controllers_Twitter_getTweets1_invoker.call(Twitter_1.getTweets(location))
      }
  
    // @LINE:8
    case controllers_Twitter_getTweetsGeo2_route(params) =>
      call(params.fromPath[String]("location", None), params.fromPath[String]("auth", None)) { (location, auth) =>
        controllers_Twitter_getTweetsGeo2_invoker.call(Twitter_1.getTweetsGeo(location, auth))
      }
  
    // @LINE:11
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_0.versioned(path, file))
      }
  }
}