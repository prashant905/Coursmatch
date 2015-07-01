
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
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script type="text/javascript" src="http://malsup.github.io/jquery.cycle.all.js"></script>
        <script>
        $(document).ready(function() """),format.raw/*11.38*/("""{"""),format.raw/*11.39*/("""
				$('#slideshow').cycle("""),format.raw/*12.27*/("""{"""),format.raw/*12.28*/("""
				fx: 'fade',
				pager: '#smallnav', 
				pause:   1, 
				speed: 2800,
				timeout:  4500 
			"""),format.raw/*18.4*/("""}"""),format.raw/*18.5*/(""");			
		"""),format.raw/*19.3*/("""}"""),format.raw/*19.4*/(""");
        </script>
        
    </head>
    <body>
        
        <div id="slideshow">
         <img src="http://www.in.tum.de/typo3temp/pics/d0b40b3dab.jpg" class="bgM"/>      
         <img src="https://upload.wikimedia.org/wikipedia/commons/4/40/TUM.-.Parabelrutsche1.jpg" class="bgM"/>
        </div>
    
        <header style="padding-top: 10px">
            <a href="" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*32.25*/routes/*32.31*/.Assets.at("images/logo-white.png"))),format.raw/*32.66*/("""" height="30px">
            </a>           
        </header>
        
        """),_display_(Seq[Any](/*36.10*/helper/*36.16*/.form(routes.CompanyController.authenticate)/*36.60*/ {_display_(Seq[Any](format.raw/*36.62*/("""
            
            <h1 style="height:50px">
               <img src=""""),_display_(Seq[Any](/*39.27*/routes/*39.33*/.Assets.at("images/logo.png"))),format.raw/*39.62*/("""" height="30px">
            </h1>
            
            
            """),_display_(Seq[Any](/*43.14*/if(form.hasGlobalErrors)/*43.38*/ {_display_(Seq[Any](format.raw/*43.40*/(""" 
                <p class="error" style="border: 1px solid #F00">
                    """),_display_(Seq[Any](/*45.22*/form/*45.26*/.globalError.message)),format.raw/*45.46*/("""
                </p>
            """)))})),format.raw/*47.14*/("""
            
            """),_display_(Seq[Any](/*49.14*/if(flash.contains("success"))/*49.43*/ {_display_(Seq[Any](format.raw/*49.45*/("""
                <p class="success" style="border: 1px solid #0F0">
                    """),_display_(Seq[Any](/*51.22*/flash/*51.27*/.get("success"))),format.raw/*51.42*/("""
                </p>
            """)))})),format.raw/*53.14*/("""
            
           
           
            <p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*58.78*/form("email")/*58.91*/.value)),format.raw/*58.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            
    
            
            
            
            
        """)))})),format.raw/*72.10*/("""
        
         
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
                    DATE: Wed Jul 01 05:29:12 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/companyLogin.scala.html
                    HASH: 79f6a9ecfa93bd3e18245cc3892bc59df68cea28
                    MATRIX: 804->1|935->38|1095->163|1109->169|1162->201|1271->275|1285->281|1342->316|1627->573|1656->574|1712->602|1741->603|1873->708|1901->709|1937->718|1965->719|2430->1148|2445->1154|2502->1189|2623->1274|2638->1280|2691->1324|2731->1326|2847->1406|2862->1412|2913->1441|3027->1519|3060->1543|3100->1545|3226->1635|3239->1639|3281->1659|3350->1696|3415->1725|3453->1754|3493->1756|3620->1847|3634->1852|3671->1867|3740->1904|3912->2040|3934->2053|3962->2059|4305->2370
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|39->11|39->11|40->12|40->12|46->18|46->18|47->19|47->19|60->32|60->32|60->32|64->36|64->36|64->36|64->36|67->39|67->39|67->39|71->43|71->43|71->43|73->45|73->45|73->45|75->47|77->49|77->49|77->49|79->51|79->51|79->51|81->53|86->58|86->58|86->58|100->72
                    -- GENERATED --
                */
            