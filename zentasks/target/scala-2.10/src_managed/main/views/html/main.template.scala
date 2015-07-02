
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
	margin-left: 360px;  
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""

.posFixed"""),format.raw/*10.10*/("""{"""),format.raw/*10.11*/("""
  position:fixed;
  z-index: 1000;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

.nav > li """),format.raw/*15.11*/("""{"""),format.raw/*15.12*/("""
   width: 220px !important;
  text-align: center !important;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""
.text-title"""),format.raw/*19.12*/("""{"""),format.raw/*19.13*/("""
	font-style:italic;
	text-decoration: underline;
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""
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
        
        
		<nav class="posFixed" >
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
                </ul>
            </div>
            
              <div style="padding: 10px 0 0 0px">
             <h4 class="dashboard">
                Jobs
             </h4>
             <ul class="navlist">
              """),_display_(Seq[Any](/*114.16*/for(job <- favoriteJobs) yield /*114.40*/ {_display_(Seq[Any](format.raw/*114.42*/("""
                <li>
                 <a href="""),_display_(Seq[Any](/*116.27*/job/*116.30*/.job.link)),format.raw/*116.39*/(""" target="_blank">
				<nobr> """),_display_(Seq[Any](/*117.13*/job/*117.16*/.job.title)),format.raw/*117.26*/(""" </nobr> 
                 </a>
                </li>
                </ul>
              """)))})),format.raw/*121.16*/("""
            </div>
  
        </nav>
        
		
		<div>
        <div class="collapse" id="collapseExample" style="   position: fixed;
													  right: 0;
													  z-index: 100;
													  top: 50px;
													  width: 540px;">
			  <div class="well">
			  <form action=""""),_display_(Seq[Any](/*134.21*/routes/*134.27*/.StudentOperationController.saveStudentTags())),format.raw/*134.72*/("""">
				 <div class="well">
				 <p> Courses Recommendation Tags:<p>
				 <input name="course_tags" type="text" class="form-control" id="ct" value=""""),_display_(Seq[Any](/*137.81*/course_tags)),format.raw/*137.92*/("""" />
	 			 <p> Jobs Recommendation Tags :<p>
				 <input name="job_tags" type="text" class="form-control" id="jt" value=""""),_display_(Seq[Any](/*139.78*/job_tags)),format.raw/*139.86*/("""" />
	 			 </div>
	 			 <button type="submit" style="  width: 100%;
  					"class="btn btn-danger">Submit</button>
	 			 </div>
 			 </form>
 		</div>
        <section>
      <ul class="breadcrumb"  style="margin-top:52px;margin-left:218px">
      <li><a href=""""),_display_(Seq[Any](/*148.21*/routes/*148.27*/.StudentOperationController.dashboard())),format.raw/*148.66*/("""">Dashboard</a> <span class="divider">/</span></li>
		<li><a href=""""),_display_(Seq[Any](/*149.17*/routes/*149.23*/.StudentOperationController.compareCourses())),format.raw/*149.67*/("""">CompareCourses</a> <span
			class="divider"></span></li>
    </ul>
            """),_display_(Seq[Any](/*152.14*/body)),format.raw/*152.18*/("""
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
                    DATE: Thu Jul 02 17:17:33 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/main.scala.html
                    HASH: 4eb4e8b8460bae396b1b26c6b3e96271c3f084da
                    MATRIX: 857->1|1121->170|1184->206|1212->207|1286->255|1313->256|1354->269|1383->270|1449->309|1477->310|1519->324|1548->325|1640->390|1668->391|1709->404|1738->405|1818->458|1846->459|2008->585|2023->591|2077->623|2186->696|2201->702|2258->736|2367->809|2382->815|2439->849|3472->1846|3487->1852|3555->1897|3656->1962|3671->1968|3740->2014|3841->2079|3856->2085|3929->2135|4072->2242|4087->2248|4151->2289|4268->2370|4283->2376|4351->2421|4414->2448|4429->2454|4484->2487|4555->2522|4570->2528|4632->2568|4703->2603|4718->2609|4784->2653|5737->3570|5752->3576|5813->3615|5888->3654|5903->3660|5960->3695|6427->4126|6443->4133|6470->4138|6515->4147|6531->4154|6559->4160|6699->4264|6714->4270|6764->4297|7108->4605|7123->4611|7190->4656|7437->4867|7478->4892|7518->4894|7605->4944|7658->4974|7730->5009|7746->5015|7781->5027|7886->5099|8162->5338|8203->5362|8244->5364|8331->5414|8344->5417|8376->5426|8444->5457|8457->5460|8490->5470|8618->5565|8959->5869|8975->5875|9043->5920|9231->6071|9265->6082|9426->6206|9457->6214|9765->6485|9781->6491|9843->6530|9949->6599|9965->6605|10032->6649|10154->6734|10181->6738
                    LINES: 26->1|29->1|33->5|33->5|36->8|36->8|38->10|38->10|41->13|41->13|43->15|43->15|46->18|46->18|47->19|47->19|50->22|50->22|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|95->67|95->67|95->67|96->68|96->68|96->68|106->78|106->78|106->78|106->78|106->78|106->78|108->80|108->80|108->80|118->90|118->90|118->90|126->98|126->98|126->98|128->100|128->100|130->102|130->102|130->102|133->105|142->114|142->114|142->114|144->116|144->116|144->116|145->117|145->117|145->117|149->121|162->134|162->134|162->134|165->137|165->137|167->139|167->139|176->148|176->148|176->148|177->149|177->149|177->149|180->152|180->152
                    -- GENERATED --
                */
            