
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template8[Student,List[Course],List[Job],String,String,List[FavoriteCourses],List[FavoriteJobs],Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , courses: List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses],favoriteJobs:List[FavoriteJobs])(body: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.171*/("""
<html>

<style>
#menu_container"""),format.raw/*5.16*/("""{"""),format.raw/*5.17*/("""
	position: relative;
	margin-left: 360px;   //not 450px please
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""
.nav > li """),format.raw/*9.11*/("""{"""),format.raw/*9.12*/("""
   width: 220px !important;
  text-align: center !important;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""
.text-title"""),format.raw/*13.12*/("""{"""),format.raw/*13.13*/("""
	font-style:italic;
	text-decoration: underline;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""
</style>




    <head>
        <title>CourseMatch</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*24.59*/routes/*24.65*/.Assets.at("images/favicon.png"))),format.raw/*24.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*25.70*/routes/*25.76*/.Assets.at("stylesheets/main.css"))),format.raw/*25.110*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*26.70*/routes/*26.76*/.Assets.at("stylesheets/tags.css"))),format.raw/*26.110*/("""">

        
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.min.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">
          
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*37.53*/routes/*37.59*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*37.104*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*38.53*/routes/*38.59*/.Assets.at("javascripts/jquery.dataTables.js"))),format.raw/*38.105*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*39.53*/routes/*39.59*/.Assets.at("javascripts/jquery.dataTables.min.js"))),format.raw/*39.109*/(""""></script>
               
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*41.78*/routes/*41.84*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*41.125*/("""">
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*42.78*/routes/*42.84*/.Assets.at("stylesheets/star-rating.min.css"))),format.raw/*42.129*/("""">
        <script  src=""""),_display_(Seq[Any](/*43.24*/routes/*43.30*/.Assets.at("javascripts/tags.js"))),format.raw/*43.63*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*44.23*/routes/*44.29*/.Assets.at("javascripts/star-rating.js"))),format.raw/*44.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*45.23*/routes/*45.29*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*45.73*/(""""></script>
  		
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
			
			
			 
            <a href=""""),_display_(Seq[Any](/*61.23*/routes/*61.29*/.StudentOperationController.dashboard())),format.raw/*61.68*/("""" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*62.25*/routes/*62.31*/.Assets.at("images/logo-white.png"))),format.raw/*62.66*/("""" height="26px">
            </a>
            
		<button class="btn btn-danger" style="float: right;
  											  left: -355px;
  											   position: relative;" type="button" 
  		data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
			 Recommendation Tags</button>
            <dl id="user" >
                <dt style="padding-top: 10px">
                 """),_display_(Seq[Any](/*72.19*/student/*72.26*/.name)),format.raw/*72.31*/(""" <span>("""),_display_(Seq[Any](/*72.40*/student/*72.47*/.email)),format.raw/*72.53*/(""")</span></dt>
                <dd>
                  <a class="glyphicon glyphicon-off logout" href=""""),_display_(Seq[Any](/*74.68*/routes/*74.74*/.StudentController.logout())),format.raw/*74.101*/("""" style="padding: 8px 5px;"> 
                   <b style="font-family:arial; font-size: 14px"> Logout </b>
                  </a>    
                </dd>
            </dl>
        </header>
        
        
		<nav style="position:fixed">
		    <div style="padding: 10px 0 0 15px">
		     <img src=""""),_display_(Seq[Any](/*84.19*/routes/*84.25*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*84.70*/("""" height="60px">
		    </div>
		
		    <div style="padding: 10px 0 0 0px">
             <h4 class="dashboard">
                Courses
             </h4>
             <ul class="navlist">
              """),_display_(Seq[Any](/*92.16*/for(course <- favCourses) yield /*92.41*/ {_display_(Seq[Any](format.raw/*92.43*/("""
                <li>
                 <a href="""),_display_(Seq[Any](/*94.27*/{"course/" + course.course.id})),format.raw/*94.57*/(""">
                  
				<nobr> """),_display_(Seq[Any](/*96.13*/course/*96.19*/.course.name)),format.raw/*96.31*/(""" </nobr> 
                 </a>
                </li>
              """)))})),format.raw/*99.16*/("""
                </ul>
            </div>
            
              <div style="padding: 10px 0 0 0px">
             <h4 class="dashboard">
                Jobs
             </h4>
             <ul class="navlist">
              """),_display_(Seq[Any](/*108.16*/for(job <- favoriteJobs) yield /*108.40*/ {_display_(Seq[Any](format.raw/*108.42*/("""
                <li>
                 <a href="""),_display_(Seq[Any](/*110.27*/{})),format.raw/*110.29*/(""">
				<nobr> """),_display_(Seq[Any](/*111.13*/job/*111.16*/.job.title)),format.raw/*111.26*/(""" </nobr> 
                 </a>
                </li>
                </ul>
              """)))})),format.raw/*115.16*/("""
            </div>
  
        </nav>
        
		
		<div>
        <div class="collapse" id="collapseExample" style="   position: fixed;
													  right: 0;
													  z-index: 100;
													  top: 50px;
													  width: 540px;">
			  <div class="well">
			  <form action=""""),_display_(Seq[Any](/*128.21*/routes/*128.27*/.StudentOperationController.saveStudentTags())),format.raw/*128.72*/("""">
				 <div class="well">
				 <p> Courses Recommendation Tags:<p>
				 <input name="course_tags" type="text" class="form-control" id="ct" value=""""),_display_(Seq[Any](/*131.81*/course_tags)),format.raw/*131.92*/("""" />
	 			 <p> Jobs Recommendation Tags :<p>
				 <input name="job_tags" type="text" class="form-control" id="jt" value=""""),_display_(Seq[Any](/*133.78*/job_tags)),format.raw/*133.86*/("""" />
	 			 </div>
	 			 <button type="submit" style="  width: 100%;
  					"class="btn btn-danger">Submit</button>
	 			 </div>
 			 </form>
 		</div>
        <section>
      <ul class="breadcrumb" style="margin-top:52px;margin-left:218px">
      <li><a href=""""),_display_(Seq[Any](/*142.21*/routes/*142.27*/.StudentOperationController.dashboard())),format.raw/*142.66*/("""">Dashboard</a> <span class="divider">/</span></li>
		<li><a href=""""),_display_(Seq[Any](/*143.17*/routes/*143.23*/.StudentOperationController.compareCourses())),format.raw/*143.67*/("""">CompareCourses</a> <span
			class="divider"></span></li>
    </ul>
            """),_display_(Seq[Any](/*146.14*/body)),format.raw/*146.18*/("""
        </section>
		
		
		</div>
    </body>
 <script>
				  $('#ct').tokenfield();
				  $('#jt').tokenfield();
				  
			  </script>
</html>"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses],favoriteJobs:List[FavoriteJobs],body:Html): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs)(body)
    
    def f:((Student,List[Course],List[Job],String,String,List[FavoriteCourses],List[FavoriteJobs]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs) => (body) => apply(student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 12:37:27 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/main.scala.html
                    HASH: 7b4ff429e820a23ec5ae30430caaa25f6be63d30
                    MATRIX: 857->1|1121->170|1184->206|1212->207|1305->274|1332->275|1371->287|1399->288|1491->353|1519->354|1560->367|1589->368|1669->421|1697->422|1859->548|1874->554|1928->586|2037->659|2052->665|2109->699|2218->772|2233->778|2290->812|3323->1809|3338->1815|3406->1860|3507->1925|3522->1931|3591->1977|3692->2042|3707->2048|3780->2098|3923->2205|3938->2211|4002->2252|4119->2333|4134->2339|4202->2384|4265->2411|4280->2417|4335->2450|4406->2485|4421->2491|4483->2531|4554->2566|4569->2572|4635->2616|5588->3533|5603->3539|5664->3578|5739->3617|5754->3623|5811->3658|6278->4089|6294->4096|6321->4101|6366->4110|6382->4117|6410->4123|6550->4227|6565->4233|6615->4260|6964->4573|6979->4579|7046->4624|7293->4835|7334->4860|7374->4862|7460->4912|7512->4942|7583->4977|7598->4983|7632->4995|7736->5067|8012->5306|8053->5330|8094->5332|8181->5382|8206->5384|8258->5399|8271->5402|8304->5412|8432->5507|8773->5811|8789->5817|8857->5862|9045->6013|9079->6024|9240->6148|9271->6156|9578->6426|9594->6432|9656->6471|9762->6540|9778->6546|9845->6590|9967->6675|9994->6679
                    LINES: 26->1|29->1|33->5|33->5|36->8|36->8|37->9|37->9|40->12|40->12|41->13|41->13|44->16|44->16|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|89->61|89->61|89->61|90->62|90->62|90->62|100->72|100->72|100->72|100->72|100->72|100->72|102->74|102->74|102->74|112->84|112->84|112->84|120->92|120->92|120->92|122->94|122->94|124->96|124->96|124->96|127->99|136->108|136->108|136->108|138->110|138->110|139->111|139->111|139->111|143->115|156->128|156->128|156->128|159->131|159->131|161->133|161->133|170->142|170->142|170->142|171->143|171->143|171->143|174->146|174->146
                    -- GENERATED --
                */
            