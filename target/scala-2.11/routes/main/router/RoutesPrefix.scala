
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dan/activator/guru/conf/routes
// @DATE:Fri Jul 10 13:39:59 PDT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
