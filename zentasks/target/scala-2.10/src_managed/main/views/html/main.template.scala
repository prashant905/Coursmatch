
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Student,List[Course],List[Job],Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , courses: List[Course],jobs:List[Job])(body: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""

<html>

<style>

#menu_container"""),format.raw/*7.16*/("""{"""),format.raw/*7.17*/("""
	position: relative;
	margin-top:4%;
	width:50%;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""

.nav > li """),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""
   width: 220px !important;
  text-align: center !important;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""

.text-title"""),format.raw/*18.12*/("""{"""),format.raw/*18.13*/("""
	font-style:italic;
	text-decoration: underline;
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""


</style>
    <head>
        <title>TUM</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*27.59*/routes/*27.65*/.Assets.at("images/favicon.png"))),format.raw/*27.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*28.70*/routes/*28.76*/.Assets.at("stylesheets/main.css"))),format.raw/*28.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*29.46*/routes/*29.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*29.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*30.46*/routes/*30.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*30.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*31.46*/routes/*31.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*31.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*32.46*/routes/*32.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*32.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*33.46*/routes/*33.52*/.Assets.at("javascripts/main.js"))),format.raw/*33.85*/(""""></script>
        
          <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    </head>
    <body>
        <header>
            <a href="" id="logo">TUM</a>
            <dl id="user">
                <dt>"""),_display_(Seq[Any](/*43.22*/student/*43.29*/.name)),format.raw/*43.34*/(""" <span>("""),_display_(Seq[Any](/*43.43*/student/*43.50*/.email)),format.raw/*43.56*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq[Any](/*45.31*/routes/*45.37*/.Application.logout())),format.raw/*45.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>
		            <nav>
            <h4 class="dashboard"><a href="#/">Courses</a></h4>
            
        </nav>
        
		
		<div>
        
        <section>
            """),_display_(Seq[Any](/*58.14*/body)),format.raw/*58.18*/("""
        </section>
		
		
		</div>
    </body>
</html>

"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job],body:Html): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs)(body)
    
    def f:((Student,List[Course],List[Job]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs) => (body) => apply(student,courses,jobs)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 17 23:07:14 CEST 2015
                    SOURCE: C:/Users/PRASHANT/workspace/zentasks/app/views/main.scala.html
                    HASH: e0df1954d07387f12150a3c0bb322d3625a83d93
                    MATRIX: 802->1|965->70|1026->104|1054->105|1131->155|1159->156|1199->168|1228->169|1317->231|1345->232|1386->245|1415->246|1492->296|1520->297|1664->405|1679->411|1733->443|1841->515|1856->521|1913->555|1997->603|2012->609|2075->650|2168->707|2183->713|2251->759|2344->816|2359->822|2424->865|2517->922|2532->928|2595->969|2688->1026|2703->1032|2758->1065|3243->1514|3259->1521|3286->1526|3331->1535|3347->1542|3375->1548|3476->1613|3491->1619|3534->1640|3813->1883|3839->1887
                    LINES: 26->1|29->1|35->7|35->7|39->11|39->11|41->13|41->13|44->16|44->16|46->18|46->18|49->21|49->21|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|71->43|71->43|71->43|71->43|71->43|71->43|73->45|73->45|73->45|86->58|86->58
                    -- GENERATED --
                */
            