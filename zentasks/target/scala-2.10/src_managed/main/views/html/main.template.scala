
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[Student,List[Course],List[Job],String,String,List[FavoriteCourses],Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , courses: List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses])(body: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.139*/("""

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
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*32.70*/routes/*32.76*/.Assets.at("stylesheets/tags.css"))),format.raw/*32.110*/("""">

        
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.min.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">
          
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*43.53*/routes/*43.59*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*43.104*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*44.53*/routes/*44.59*/.Assets.at("javascripts/jquery.dataTables.js"))),format.raw/*44.105*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*45.53*/routes/*45.59*/.Assets.at("javascripts/jquery.dataTables.min.js"))),format.raw/*45.109*/(""""></script>
               
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*47.78*/routes/*47.84*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*47.125*/("""">
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*48.78*/routes/*48.84*/.Assets.at("stylesheets/star-rating.min.css"))),format.raw/*48.129*/("""">
        <script  src=""""),_display_(Seq[Any](/*49.24*/routes/*49.30*/.Assets.at("javascripts/tags.js"))),format.raw/*49.63*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*50.23*/routes/*50.29*/.Assets.at("javascripts/star-rating.js"))),format.raw/*50.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*51.23*/routes/*51.29*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*51.73*/(""""></script>
  		
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/bootstrap-tokenfield.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/bootstrap-tokenfield.min.js"></script>
  		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  		<script src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
  		<script src="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/js/bootstrap-select.js"></script>
    </head>
    <body>
       
        <header style="padding-top: 12px; position:fixed">
			
			
			 
            <a href=""""),_display_(Seq[Any](/*67.23*/routes/*67.29*/.StudentOperationController.dashboard())),format.raw/*67.68*/("""" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*68.25*/routes/*68.31*/.Assets.at("images/logo-white.png"))),format.raw/*68.66*/("""" height="26px">
            </a>
            
		<button class="btn btn-danger" style="float: right;
  											  left: -355px;
  											   position: relative;" type="button" 
  		data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
			 Recommendation Tags</button>
            <dl id="user" >
                <dt style="padding-top: 10px">
                 """),_display_(Seq[Any](/*78.19*/student/*78.26*/.name)),format.raw/*78.31*/(""" <span>("""),_display_(Seq[Any](/*78.40*/student/*78.47*/.email)),format.raw/*78.53*/(""")</span></dt>
                <dd>
                  <a class="glyphicon glyphicon-off logout" href=""""),_display_(Seq[Any](/*80.68*/routes/*80.74*/.StudentController.logout())),format.raw/*80.101*/("""" style="padding: 8px 5px;"> 
                   <b style="font-family:arial; font-size: 14px"> Logout </b>
                  </a>    
                </dd>
            </dl>
        </header>
        
        
		<nav style="position:fixed">
		    <div style="padding: 10px 0 0 15px">
		     <img src=""""),_display_(Seq[Any](/*90.19*/routes/*90.25*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*90.70*/("""" height="60px">
		    </div>
		
		    <div style="padding: 10px 0 0 0px">
             <h4 class="dashboard">
                Courses
             </h4>
             <ul class="navlist">
              """),_display_(Seq[Any](/*98.16*/for(course <- favCourses) yield /*98.41*/ {_display_(Seq[Any](format.raw/*98.43*/("""
                <li>
                 <a href="""),_display_(Seq[Any](/*100.27*/{"course/" + course.course.id})),format.raw/*100.57*/(""">
                  
				<nobr> """),_display_(Seq[Any](/*102.13*/course/*102.19*/.course.name)),format.raw/*102.31*/(""" </nobr> 
                 </a>
                </li>
              """)))})),format.raw/*105.16*/("""
            </div>
  
        </nav>
        
		
		<div>
        <div class="collapse" id="collapseExample" style="   position: fixed;
													  right: 0;
													  z-index: 100;
													  top: 50px;
													  width: 540px;">
			  <div class="well">
			  <form action=""""),_display_(Seq[Any](/*118.21*/routes/*118.27*/.StudentOperationController.saveStudentTags())),format.raw/*118.72*/("""">
				 <div class="well">
				 <p> Courses Recommendation Tags:<p>
				 <input name="course_tags" type="text" class="form-control" id="ct" value=""""),_display_(Seq[Any](/*121.81*/course_tags)),format.raw/*121.92*/("""" />
	 			 <p> Jobs Recommendation Tags :<p>
				 <input name="job_tags" type="text" class="form-control" id="jt" value=""""),_display_(Seq[Any](/*123.78*/job_tags)),format.raw/*123.86*/("""" />
	 			 </div>
	 			 <button type="submit" style="  width: 100%;
  					"class="btn btn-danger">Submit</button>
	 			 </div>
 			 </form>
 		</div>
        <section>
      <ul class="breadcrumb" style="margin-top:52px;margin-left:218px">
      <li><a href=""""),_display_(Seq[Any](/*132.21*/routes/*132.27*/.StudentOperationController.dashboard())),format.raw/*132.66*/("""">Dashboard</a> <span class="divider">/</span></li>
		<li><a href=""""),_display_(Seq[Any](/*133.17*/routes/*133.23*/.StudentOperationController.compareCourses())),format.raw/*133.67*/("""">CompareCourses</a> <span
			class="divider"></span></li>
    </ul>
            """),_display_(Seq[Any](/*136.14*/body)),format.raw/*136.18*/("""
        </section>
		
		
		</div>
    </body>
 <script>
				  $('#ct').tokenfield();
				  $('#jt').tokenfield();
				  
			  </script>
</html>

"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses],body:Html): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs,course_tags,job_tags,favCourses)(body)
    
    def f:((Student,List[Course],List[Job],String,String,List[FavoriteCourses]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs,course_tags,job_tags,favCourses) => (body) => apply(student,courses,jobs,course_tags,job_tags,favCourses)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 05:45:56 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/main.scala.html
                    HASH: e0dd2c4ba864cdb063ae6121dd61cded0e3f03f5
                    MATRIX: 838->1|1070->138|1137->178|1165->179|1259->246|1287->247|1329->261|1358->262|1450->327|1478->328|1521->343|1550->344|1630->397|1658->398|1824->528|1839->534|1893->566|2002->639|2017->645|2074->679|2183->752|2198->758|2255->792|3288->1789|3303->1795|3371->1840|3472->1905|3487->1911|3556->1957|3657->2022|3672->2028|3745->2078|3888->2185|3903->2191|3967->2232|4084->2313|4099->2319|4167->2364|4230->2391|4245->2397|4300->2430|4371->2465|4386->2471|4448->2511|4519->2546|4534->2552|4600->2596|5553->3513|5568->3519|5629->3558|5704->3597|5719->3603|5776->3638|6243->4069|6259->4076|6286->4081|6331->4090|6347->4097|6375->4103|6515->4207|6530->4213|6580->4240|6929->4553|6944->4559|7011->4604|7258->4815|7299->4840|7339->4842|7426->4892|7479->4922|7551->4957|7567->4963|7602->4975|7707->5047|8048->5351|8064->5357|8132->5402|8320->5553|8354->5564|8515->5688|8546->5696|8853->5966|8869->5972|8931->6011|9037->6080|9053->6086|9120->6130|9242->6215|9269->6219
                    LINES: 26->1|29->1|35->7|35->7|38->10|38->10|40->12|40->12|43->15|43->15|45->17|45->17|48->20|48->20|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|95->67|95->67|95->67|96->68|96->68|96->68|106->78|106->78|106->78|106->78|106->78|106->78|108->80|108->80|108->80|118->90|118->90|118->90|126->98|126->98|126->98|128->100|128->100|130->102|130->102|130->102|133->105|146->118|146->118|146->118|149->121|149->121|151->123|151->123|160->132|160->132|160->132|161->133|161->133|161->133|164->136|164->136
                    -- GENERATED --
                */
            