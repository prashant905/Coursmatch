
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

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
         <img src="http://images7.alphacoders.com/418/418009.jpg" class="bgM"/>
         <img src="http://www.in.tum.de/typo3temp/pics/d0b40b3dab.jpg" class="bgM"/>      
         <img src="https://upload.wikimedia.org/wikipedia/commons/4/40/TUM.-.Parabelrutsche1.jpg" class="bgM"/>
        </div>
    
        <header style="padding-top: 10px">
            <a href="" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*34.25*/routes/*34.31*/.Assets.at("images/logo-white.png"))),format.raw/*34.66*/("""" height="30px">
            </a>           
        </header>
        
        """),_display_(Seq[Any](/*38.10*/helper/*38.16*/.form(routes.Application.authenticate)/*38.54*/ {_display_(Seq[Any](format.raw/*38.56*/("""
            
            <h1 style="height:50px">
               <img src=""""),_display_(Seq[Any](/*41.27*/routes/*41.33*/.Assets.at("images/logo.png"))),format.raw/*41.62*/("""" height="30px">
            </h1>
            
            
            """),_display_(Seq[Any](/*45.14*/if(form.hasGlobalErrors)/*45.38*/ {_display_(Seq[Any](format.raw/*45.40*/(""" 
                <p class="error" style="border: 1px solid #F00">
                    """),_display_(Seq[Any](/*47.22*/form/*47.26*/.globalError.message)),format.raw/*47.46*/("""
                </p>
            """)))})),format.raw/*49.14*/("""
            
            """),_display_(Seq[Any](/*51.14*/if(flash.contains("success"))/*51.43*/ {_display_(Seq[Any](format.raw/*51.45*/("""
                <p class="success" style="border: 1px solid #0F0">
                    """),_display_(Seq[Any](/*53.22*/flash/*53.27*/.get("success"))),format.raw/*53.42*/("""
                </p>
            """)))})),format.raw/*55.14*/("""
            
           
           
            <p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*60.78*/form("email")/*60.91*/.value)),format.raw/*60.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            
    
            
            
            
            
        """)))})),format.raw/*74.10*/("""
        
         
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 30 05:16:09 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/login.scala.html
                    HASH: a559a69e8992edda1aa741efb28921dd42e1489f
                    MATRIX: 791->1|916->32|1076->157|1090->163|1143->195|1252->269|1266->275|1323->310|1617->576|1646->577|1702->605|1731->606|1863->711|1891->712|1927->721|1955->722|2501->1232|2516->1238|2573->1273|2694->1358|2709->1364|2756->1402|2796->1404|2912->1484|2927->1490|2978->1519|3092->1597|3125->1621|3165->1623|3291->1713|3304->1717|3346->1737|3415->1774|3480->1803|3518->1832|3558->1834|3685->1925|3699->1930|3736->1945|3805->1982|3977->2118|3999->2131|4027->2137|4370->2448
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|41->13|41->13|47->19|47->19|48->20|48->20|62->34|62->34|62->34|66->38|66->38|66->38|66->38|69->41|69->41|69->41|73->45|73->45|73->45|75->47|75->47|75->47|77->49|79->51|79->51|79->51|81->53|81->53|81->53|83->55|88->60|88->60|88->60|102->74
                    -- GENERATED --
                */
            