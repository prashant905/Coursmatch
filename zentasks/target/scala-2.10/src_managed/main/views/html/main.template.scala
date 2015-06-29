
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
	margin-left: 360px;   //not 450px please
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""

.nav > li """),format.raw/*12.11*/("""{"""),format.raw/*12.12*/("""
   width: 220px !important;
  text-align: center !important;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

.text-title"""),format.raw/*17.12*/("""{"""),format.raw/*17.13*/("""
	font-style:italic;
	text-decoration: underline;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""


</style>




    <head>
        <title>CourseMatch</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*30.59*/routes/*30.65*/.Assets.at("images/favicon.png"))),format.raw/*30.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*31.70*/routes/*31.76*/.Assets.at("stylesheets/main.css"))),format.raw/*31.110*/("""">

        
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.min.css">
        
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*38.53*/routes/*38.59*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*38.104*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*39.53*/routes/*39.59*/.Assets.at("javascripts/jquery.dataTables.js"))),format.raw/*39.105*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*40.53*/routes/*40.59*/.Assets.at("javascripts/jquery.dataTables.min.js"))),format.raw/*40.109*/(""""></script>
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*41.78*/routes/*41.84*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*41.125*/("""">
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*42.78*/routes/*42.84*/.Assets.at("stylesheets/star-rating.min.css"))),format.raw/*42.129*/("""">
                
        <script src=""""),_display_(Seq[Any](/*44.23*/routes/*44.29*/.Assets.at("javascripts/star-rating.js"))),format.raw/*44.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*45.23*/routes/*45.29*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*45.73*/(""""></script>
  		
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  		<script src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
  		<script src="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/js/bootstrap-select.js"></script>
    </head>
    <body>
       
        <header style="padding-top: 12px">
            
            <a href="" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*58.25*/routes/*58.31*/.Assets.at("images/logo-white.png"))),format.raw/*58.66*/("""" height="26px">
            </a>
            
            <dl id="user" >
                <dt style="padding-top: 10px">
                 """),_display_(Seq[Any](/*63.19*/student/*63.26*/.name)),format.raw/*63.31*/(""" <span>("""),_display_(Seq[Any](/*63.40*/student/*63.47*/.email)),format.raw/*63.53*/(""")</span></dt>
                <dd>
                  <a class="glyphicon glyphicon-off logout" href=""""),_display_(Seq[Any](/*65.68*/routes/*65.74*/.Application.logout())),format.raw/*65.95*/("""" style="padding: 8px 5px;"> 
                   <b style="font-family:arial; font-size: 14px"> Logout </b>
                  </a>    
                </dd>
            </dl>
        </header>
        
        
		<nav>
		    <div style="padding: 10px 0 0 15px">
		     <img src=""""),_display_(Seq[Any](/*75.19*/routes/*75.25*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*75.70*/("""" height="60px">
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
      <ul class="breadcrumb" style="margin-top:52px;margin-left:218px">
      <li><a href="dashboard">Dashboard</a> <span class="divider">/</span></li>
      <li><a href="compareCourses">CompareCourses</a> <span class="divider">/</span></li>
    </ul>
            """),_display_(Seq[Any](/*113.14*/body)),format.raw/*113.18*/("""
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
                    DATE: Sun Jun 28 22:23:10 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/main.scala.html
                    HASH: b716c4a8f4fc3ecae974996d0b9d34718c68e4ee
                    MATRIX: 802->1|965->70|1032->110|1060->111|1154->178|1182->179|1224->193|1253->194|1345->259|1373->260|1416->275|1445->276|1525->329|1553->330|1719->460|1734->466|1788->498|1897->571|1912->577|1969->611|2450->1056|2465->1062|2533->1107|2634->1172|2649->1178|2718->1224|2819->1289|2834->1295|2907->1345|3033->1435|3048->1441|3112->1482|3229->1563|3244->1569|3312->1614|3392->1658|3407->1664|3469->1704|3540->1739|3555->1745|3621->1789|4346->2478|4361->2484|4418->2519|4599->2664|4615->2671|4642->2676|4687->2685|4703->2692|4731->2698|4871->2802|4886->2808|4929->2829|5255->3119|5270->3125|5337->3170|6868->4664|6895->4668
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|40->12|40->12|43->15|43->15|45->17|45->17|48->20|48->20|58->30|58->30|58->30|59->31|59->31|59->31|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|72->44|72->44|72->44|73->45|73->45|73->45|86->58|86->58|86->58|91->63|91->63|91->63|91->63|91->63|91->63|93->65|93->65|93->65|103->75|103->75|103->75|141->113|141->113
                    -- GENERATED --
                */
            