
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dan/activator/guru/conf/routes
// @DATE:Fri Jul 10 13:39:59 PDT 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseTwitter Twitter = new controllers.ReverseTwitter(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseTwitter Twitter = new controllers.javascript.ReverseTwitter(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
