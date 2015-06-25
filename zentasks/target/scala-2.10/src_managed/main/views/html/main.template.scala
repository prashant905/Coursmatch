
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
        <title>CourseMatch</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*31.59*/routes/*31.65*/.Assets.at("images/favicon.png"))),format.raw/*31.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*32.70*/routes/*32.76*/.Assets.at("stylesheets/main.css"))),format.raw/*32.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*33.46*/routes/*33.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*33.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*34.46*/routes/*34.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*34.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*35.46*/routes/*35.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*35.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*36.46*/routes/*36.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*36.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*37.46*/routes/*37.52*/.Assets.at("javascripts/main.js"))),format.raw/*37.85*/(""""></script>
        
          <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    </head>
    <body>
       
        <header style="padding-top: 12px">
            
            <a href="" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*48.25*/routes/*48.31*/.Assets.at("images/logo-white.png"))),format.raw/*48.66*/("""" height="26px">
            </a>
            
            <dl id="user" >
                <dt style="padding-top: 10px">
                 """),_display_(Seq[Any](/*53.19*/student/*53.26*/.name)),format.raw/*53.31*/(""" <span>("""),_display_(Seq[Any](/*53.40*/student/*53.47*/.email)),format.raw/*53.53*/(""")</span></dt>
                <dd>
                  <a class="glyphicon glyphicon-off logout" href=""""),_display_(Seq[Any](/*55.68*/routes/*55.74*/.Application.logout())),format.raw/*55.95*/("""" style="padding: 8px 5px;"> 
                   <b style="font-family:arial; font-size: 14px"> Logout </b>
                  </a>    
                </dd>
            </dl>
        </header>
        
        
		<nav>
		    <div style="padding: 10px 0 0 15px">
		     <img src=""""),_display_(Seq[Any](/*65.19*/routes/*65.25*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*65.70*/("""" height="60px">
		    </div>
		
		    <div style="padding: 10px 0 0 0px">
             <h4 class="dashboard">
                Courses
             </h4>
             <ul class="navlist">
              <li><a href="course/1">Introduction to software Eng.</a></li>
              <li><a href="course/1">Introduction to software Eng.</a></li>
              <li><a href="course/1">Introduction to software Eng.</a></li>
              <li><a href="course/1">Introduction to software Eng.</a></li>
              <li><a href="course/1">Introduction to software Eng.</a></li>
              <li><a href="course/1">Introduction to software Eng.</a></li>
             </ul> 
            </div>
            
            <div style="padding: 10px 0 0 0px">
             <h4 class="dashboard">
                Favorites
             </h4>
             <ul class="navlist">
              <li><a href="course/1">Introduction to software Eng.</a></li>
              <li><a href="course/1">Introduction to software Eng.</a></li>
              <li><a href="course/1">Introduction to software Eng.</a></li>
             </ul> 
            </div>
  
        </nav>
        
		
		<div>
        
        <section>
            """),_display_(Seq[Any](/*99.14*/body)),format.raw/*99.18*/("""
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
                    DATE: Sat Jun 20 19:59:29 CEST 2015
                    SOURCE: D:/Code/Eclipse-SEBA/Coursmatch/zentasks/app/views/main.scala.html
                    HASH: ddf4e35fb5933625813edd63ed380641b7d7d751
                    MATRIX: 802->1|965->70|1032->110|1060->111|1141->165|1169->166|1211->180|1240->181|1332->246|1360->247|1403->262|1432->263|1512->316|1540->317|1706->447|1721->453|1775->485|1884->558|1899->564|1956->598|2041->647|2056->653|2119->694|2213->752|2228->758|2296->804|2390->862|2405->868|2470->911|2564->969|2579->975|2642->1016|2736->1074|2751->1080|2806->1113|3319->1590|3334->1596|3391->1631|3572->1776|3588->1783|3615->1788|3660->1797|3676->1804|3704->1810|3844->1914|3859->1920|3902->1941|4228->2231|4243->2237|4310->2282|5584->3520|5610->3524
                    LINES: 26->1|29->1|35->7|35->7|39->11|39->11|41->13|41->13|44->16|44->16|46->18|46->18|49->21|49->21|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|76->48|76->48|76->48|81->53|81->53|81->53|81->53|81->53|81->53|83->55|83->55|83->55|93->65|93->65|93->65|127->99|127->99
                    -- GENERATED --
                */
            