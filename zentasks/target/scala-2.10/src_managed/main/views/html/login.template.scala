
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
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        
        <header style="padding-top: 10px">
            <a href="" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*13.25*/routes/*13.31*/.Assets.at("images/logo-white.png"))),format.raw/*13.66*/("""" height="30px">
            </a>           
        </header>
        
        """),_display_(Seq[Any](/*17.10*/helper/*17.16*/.form(routes.Application.authenticate)/*17.54*/ {_display_(Seq[Any](format.raw/*17.56*/("""
            
            <h1 style="height:50px">
               <img src=""""),_display_(Seq[Any](/*20.27*/routes/*20.33*/.Assets.at("images/logo.png"))),format.raw/*20.62*/("""" height="30px">
            </h1>
            
            
            """),_display_(Seq[Any](/*24.14*/if(form.hasGlobalErrors)/*24.38*/ {_display_(Seq[Any](format.raw/*24.40*/(""" 
                <p class="error" style="border: 1px solid #F00">
                    """),_display_(Seq[Any](/*26.22*/form/*26.26*/.globalError.message)),format.raw/*26.46*/("""
                </p>
            """)))})),format.raw/*28.14*/("""
            
            """),_display_(Seq[Any](/*30.14*/if(flash.contains("success"))/*30.43*/ {_display_(Seq[Any](format.raw/*30.45*/("""
                <p class="success" style="border: 1px solid #0F0">
                    """),_display_(Seq[Any](/*32.22*/flash/*32.27*/.get("success"))),format.raw/*32.42*/("""
                </p>
            """)))})),format.raw/*34.14*/("""
            
           
           
            <p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*39.78*/form("email")/*39.91*/.value)),format.raw/*39.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            
    
            
            
            
            
        """)))})),format.raw/*53.10*/("""
        
 
            
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
                    DATE: Tue Jun 23 23:53:33 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/login.scala.html
                    HASH: d3b5813d9e14b8aec42b806d428578e23f422f2d
                    MATRIX: 791->1|916->32|1076->157|1090->163|1143->195|1251->268|1265->274|1322->309|1501->452|1516->458|1573->493|1694->578|1709->584|1756->622|1796->624|1912->704|1927->710|1978->739|2092->817|2125->841|2165->843|2291->933|2304->937|2346->957|2415->994|2480->1023|2518->1052|2558->1054|2685->1145|2699->1150|2736->1165|2805->1202|2977->1338|2999->1351|3027->1357|3370->1668
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|41->13|41->13|41->13|45->17|45->17|45->17|45->17|48->20|48->20|48->20|52->24|52->24|52->24|54->26|54->26|54->26|56->28|58->30|58->30|58->30|60->32|60->32|60->32|62->34|67->39|67->39|67->39|81->53
                    -- GENERATED --
                */
            