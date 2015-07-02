
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object companyLogin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[CompanyController.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[CompanyController.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

<html>
    <head>
        <title>Course Match Login</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/(""""/>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
        <script type="text/javascript" src="http://code.jquery.com/jquery-1.6.3.min.js"></script>
        <script type="text/javascript" src="http://malsup.github.io/jquery.cycle.all.js"></script>
      
        <script>
        $(document).ready(function() """),format.raw/*12.38*/("""{"""),format.raw/*12.39*/("""
				$('#slideshow').cycle("""),format.raw/*13.27*/("""{"""),format.raw/*13.28*/("""
				fx: 'fade',
				pager: '#smallnav', 
				pause:   1, 
				speed: 2800,
				timeout:  4500 
			"""),format.raw/*19.4*/("""}"""),format.raw/*19.5*/(""");			
		"""),format.raw/*20.3*/("""}"""),format.raw/*20.4*/(""");
        </script>
        
    </head>
    <body>
        
        <div id="slideshow">
         <img src="http://www.in.tum.de/typo3temp/pics/d0b40b3dab.jpg" class="bgM"/>      
         <img src="https://upload.wikimedia.org/wikipedia/commons/4/40/TUM.-.Parabelrutsche1.jpg" class="bgM"/>
        </div>
    
        <header style="padding-top: 10px">
            <a href="" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*33.25*/routes/*33.31*/.Assets.at("images/logo-white.png"))),format.raw/*33.66*/("""" height="30px">
            </a>           
        </header>
        
        """),_display_(Seq[Any](/*37.10*/helper/*37.16*/.form(routes.CompanyController.authenticate)/*37.60*/ {_display_(Seq[Any](format.raw/*37.62*/("""
            
            <h1 style="height:50px">
               <img src=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.Assets.at("images/logo.png"))),format.raw/*40.62*/("""" height="30px">
            </h1>
            
            
            """),_display_(Seq[Any](/*44.14*/if(form.hasGlobalErrors)/*44.38*/ {_display_(Seq[Any](format.raw/*44.40*/(""" 
                <p class="error" style="border: 1px solid #F00">
                    """),_display_(Seq[Any](/*46.22*/form/*46.26*/.globalError.message)),format.raw/*46.46*/("""
                </p>
            """)))})),format.raw/*48.14*/("""
            
            """),_display_(Seq[Any](/*50.14*/if(flash.contains("success"))/*50.43*/ {_display_(Seq[Any](format.raw/*50.45*/("""
                <p class="success" style="border: 1px solid #0F0">
                    """),_display_(Seq[Any](/*52.22*/flash/*52.27*/.get("success"))),format.raw/*52.42*/("""
                </p>
            """)))})),format.raw/*54.14*/("""
            
           
           
            <p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*59.78*/form("email")/*59.91*/.value)),format.raw/*59.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            
        """)))})),format.raw/*68.10*/("""
        
         
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[CompanyController.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[CompanyController.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 06:43:13 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/companyLogin.scala.html
                    HASH: de17f33ec3fbaa6c4a6c80c0015e779f8ffe478c
                    MATRIX: 804->1|935->38|1095->163|1109->169|1162->201|1271->275|1285->281|1342->316|1636->582|1665->583|1721->611|1750->612|1882->717|1910->718|1946->727|1974->728|2439->1157|2454->1163|2511->1198|2632->1283|2647->1289|2700->1333|2740->1335|2856->1415|2871->1421|2922->1450|3036->1528|3069->1552|3109->1554|3235->1644|3248->1648|3290->1668|3359->1705|3424->1734|3462->1763|3502->1765|3629->1856|3643->1861|3680->1876|3749->1913|3921->2049|3943->2062|3971->2068|4252->2317
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|41->13|41->13|47->19|47->19|48->20|48->20|61->33|61->33|61->33|65->37|65->37|65->37|65->37|68->40|68->40|68->40|72->44|72->44|72->44|74->46|74->46|74->46|76->48|78->50|78->50|78->50|80->52|80->52|80->52|82->54|87->59|87->59|87->59|96->68
                    -- GENERATED --
                */
            