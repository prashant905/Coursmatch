
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
        
        <header>
            <a href="" id="logo">Course Match</a>
        </header>
        
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.authenticate)/*15.54*/ {_display_(Seq[Any](format.raw/*15.56*/("""
            
            <h1>Sign in</h1>
            
            """),_display_(Seq[Any](/*19.14*/if(form.hasGlobalErrors)/*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/(""" 
                <p class="error">
                    """),_display_(Seq[Any](/*21.22*/form/*21.26*/.globalError.message)),format.raw/*21.46*/("""
                </p>
            """)))})),format.raw/*23.14*/("""
            
            """),_display_(Seq[Any](/*25.14*/if(flash.contains("success"))/*25.43*/ {_display_(Seq[Any](format.raw/*25.45*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*27.22*/flash/*27.27*/.get("success"))),format.raw/*27.42*/("""
                </p>
            """)))})),format.raw/*29.14*/("""
            
            <p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*32.78*/form("email")/*32.91*/.value)),format.raw/*32.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            
        """)))})),format.raw/*41.10*/("""
        
 
            
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
                    DATE: Wed Jun 17 23:07:14 CEST 2015
                    SOURCE: C:/Users/PRASHANT/workspace/zentasks/app/views/login.scala.html
                    HASH: f964f3ae250d584100a5a1a3ce2f004204e93dda
                    MATRIX: 791->1|916->32|1071->152|1085->158|1138->190|1245->262|1259->268|1316->303|1490->441|1505->447|1552->485|1592->487|1697->556|1730->580|1770->582|1863->639|1876->643|1918->663|1985->698|2048->725|2086->754|2126->756|2220->814|2234->819|2271->834|2338->869|2481->976|2503->989|2531->995|2803->1235
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|43->15|43->15|43->15|43->15|47->19|47->19|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|60->32|60->32|60->32|69->41
                    -- GENERATED --
                */
            