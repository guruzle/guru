package controllers
import play.api.libs.json._
import play.api.libs.functional.syntax._
import javax.inject.Inject
import play.api.Play._
import play.api.mvc._
import play.api.libs.ws._

case class BearerToken (tokenType:String,accessToken:String)

class Twitter @Inject() (ws: WSClient) extends Controller {
  implicit val context = play.api.libs.concurrent.Execution.Implicits.defaultContext

  //bearer token serialization
  implicit val bearerTokenReads:Reads[BearerToken] = (
    (JsPath \ "token_type").read[String] and
      (JsPath \ "access_token").read[String]
    ) (BearerToken.apply _)

  val authType = current.configuration.getString("guru.twitter.authType").getOrElse("unknown")
  val contentType = current.configuration.getString("guru.twitter.contentType").getOrElse("unknown")
  val tokenUrl = current.configuration.getString("guru.twitter.tokenUrl").getOrElse("unknown")
  val grantType = current.configuration.getString("guru.twitter.grantType").getOrElse("unknown")
  def getTweets(geoCode:String) = Action.async {//get bearer token redirect
    ws.url(tokenUrl).withHeaders("Authorization" -> authType)
      .withHeaders("Content-Type"->contentType)
      .post(grantType).map {
        response =>
          val bearerContents:JsResult[BearerToken] = response.json.validate[BearerToken]
          val bearerAuth = bearerContents.map(auth => auth.accessToken).get
          Redirect(routes.Twitter.getTweetsGeo(geoCode,bearerAuth))
      }
  }
  def getTweetsGeo(geoCode:String, auth:String) = Action.async { //make call with bearer token
      val count:String = "10"
      val distance:String = "100"
      val authorization:String = "Bearer " + auth
      val url:String = "https://api.twitter.com/1.1/search/tweets.json?q=''&count=" +
        count + "&result_type=recent&geocode=" + geoCode + "," + distance + "km"
      ws.url(url)
        .withHeaders("Authorization" -> authorization)
        .get()
        .map{
          response => Ok(response.json)
         }
  }


}
