
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.70*/("""" type="text/javascript"></script>
        <script src="https://code.jquery.com/jquery-2.1.4.min.js" type="text/javascript">
        <script>
        $.getJSON( "localhost:9000/twitter_api", function( data ) """),format.raw/*13.67*/("""{"""),format.raw/*13.68*/("""
            """),format.raw/*14.13*/("""alert(data)
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/(""");
        </script>
    </head>
    <body>
        """),_display_(/*19.10*/content),format.raw/*19.17*/("""
    """),format.raw/*20.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Jul 09 11:38:13 PDT 2015
                  SOURCE: /home/dan/activator/guru/app/views/main.scala.html
                  HASH: 8f1d1cb33576be9769f90ca0f43526dcdbff7a8a
                  MATRIX: 530->1|655->31|683->33|770->94|795->99|883->161|897->167|959->208|1046->269|1060->275|1120->314|1172->339|1187->345|1249->386|1485->594|1514->595|1555->608|1602->628|1631->629|1711->682|1739->689|1771->694
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|37->13|37->13|38->14|39->15|39->15|43->19|43->19|44->20
                  -- GENERATED --
              */
          