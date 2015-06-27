
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
	margin-top: 80px;
	margin-left:450px;
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

        
        
          <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.css">
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  		<script src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
  		<script src="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/js/bootstrap-select.js"></script>
    </head>
    <body>
       
        <header style="padding-top: 12px">
            
            <a href="" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*50.25*/routes/*50.31*/.Assets.at("images/logo-white.png"))),format.raw/*50.66*/("""" height="26px">
            </a>
            
            <dl id="user" >
                <dt style="padding-top: 10px">
                 """),_display_(Seq[Any](/*55.19*/student/*55.26*/.name)),format.raw/*55.31*/(""" <span>("""),_display_(Seq[Any](/*55.40*/student/*55.47*/.email)),format.raw/*55.53*/(""")</span></dt>
                <dd>
                  <a class="glyphicon glyphicon-off logout" href=""""),_display_(Seq[Any](/*57.68*/routes/*57.74*/.Application.logout())),format.raw/*57.95*/("""" style="padding: 8px 5px;"> 
                   <b style="font-family:arial; font-size: 14px"> Logout </b>
                  </a>    
                </dd>
            </dl>
        </header>
        
        
		<nav>
		    <div style="padding: 10px 0 0 15px">
		     <img src=""""),_display_(Seq[Any](/*67.19*/routes/*67.25*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*67.70*/("""" height="60px">
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
            """),_display_(Seq[Any](/*101.14*/body)),format.raw/*101.18*/("""
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
                    DATE: Sat Jun 27 21:23:54 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/main.scala.html
                    HASH: 89f31e9ec1177ef8708bc575ad1115c2fd099871
                    MATRIX: 802->1|965->70|1032->110|1060->111|1152->176|1180->177|1222->191|1251->192|1343->257|1371->258|1414->273|1443->274|1523->327|1551->328|1717->458|1732->464|1786->496|1895->569|1910->575|1967->609|3068->1674|3083->1680|3140->1715|3321->1860|3337->1867|3364->1872|3409->1881|3425->1888|3453->1894|3593->1998|3608->2004|3651->2025|3977->2315|3992->2321|4059->2366|5334->3604|5361->3608
                    LINES: 26->1|29->1|35->7|35->7|39->11|39->11|41->13|41->13|44->16|44->16|46->18|46->18|49->21|49->21|59->31|59->31|59->31|60->32|60->32|60->32|78->50|78->50|78->50|83->55|83->55|83->55|83->55|83->55|83->55|85->57|85->57|85->57|95->67|95->67|95->67|129->101|129->101
                    -- GENERATED --
                */
            