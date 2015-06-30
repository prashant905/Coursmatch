
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
object dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[List[Course],List[Job],Student,List[Course],List[Job],String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(matchedCourses:List[Course],matchJobs:List[Job],student: Student , courses: List[Course], jobs:List[Job],course_tags:String,job_tags:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.143*/("""
"""),_display_(Seq[Any](/*2.2*/main(student,courses,jobs,course_tags,job_tags)/*2.49*/{_display_(Seq[Any](format.raw/*2.50*/("""


<div id="menu_container" class="container">
	<ul class="nav nav-pills" style="width: 1000px">
		<li class="active"><a data-toggle="pill" href="#home">Dashboard</a></li>
		<li><a data-toggle="pill" href="#menu2">Courses</a></li>
		<li><a data-toggle="pill" href="#menu3">Jobs</a></li>
		<li><a data-toggle="pill" href="#menu4">About us</a></li>
	</ul>



	<div class="tab-content">
		<div id="home" class="tab-pane fade in active">
			<h3>Dashboard</h3>

	
<div class="panel panel-danger" style="margin-bottom:60px">
	<div class="panel-heading">Recommended Courses</div>
		<table id="recommendedCourses" class="table table-striped" cellspacing="0"
				>
				<thead>
					<tr>
						<th>Name</th>
						<th>Professor</th>
						<th>Chair</th>
						<th>Description</th>
					</tr>
				</thead>
				<tbody class="searchable">
					"""),_display_(Seq[Any](/*33.7*/for(course <- matchedCourses) yield /*33.36*/ {_display_(Seq[Any](format.raw/*33.38*/("""
					<tr>

						<td><a href=""""),_display_(Seq[Any](/*36.21*/routes/*36.27*/.Application.viewCourse(course.id))),format.raw/*36.61*/("""">"""),_display_(Seq[Any](/*36.64*/course/*36.70*/.name)),format.raw/*36.75*/("""</td>
						<td>"""),_display_(Seq[Any](/*37.12*/course/*37.18*/.professor_name)),format.raw/*37.33*/("""</td>
						<td>"""),_display_(Seq[Any](/*38.12*/course/*38.18*/.chair)),format.raw/*38.24*/("""</td>
						<td>"""),_display_(Seq[Any](/*39.12*/course/*39.18*/.description)),format.raw/*39.30*/("""</td>
					</tr>
					""")))})),format.raw/*41.7*/("""
				</tbody>
			</table>
		</div>
	<div class="panel panel-danger">
		<div class="panel-heading">Recommended Jobs</div>
			"""),_display_(Seq[Any](/*47.5*/for(job <- matchJobs) yield /*47.26*/ {_display_(Seq[Any](format.raw/*47.28*/("""

			<div class="panel panel-default">
				<div class="panel-body">


					<div style="float: left; width: 160px">
						<img src="assets/images/tum.png" height="60" width="60">
					</div>
					<div style="float: left">


						<div style="float: left; width: 500px">
							<span class="text-title">Description</span>
							<p>"""),_display_(Seq[Any](/*61.12*/job/*61.15*/.description)),format.raw/*61.27*/("""</p>
							<p>"""),_display_(Seq[Any](/*62.12*/job/*62.15*/.company_name)),format.raw/*62.28*/("""</p>
						</div>

						<div style="float: left; padding-left: 30px"></div>


					</div>

				</div>
			</div>
			""")))})),format.raw/*72.5*/("""
		</div>
	</div>

		<div id="menu2" class="tab-pane fade">

			<h3>Search Courses</h3>
			<form
				style="top: -38px; position: relative; z-index: 1000; left: -288px;"
				action=""""),_display_(Seq[Any](/*81.14*/routes/*81.20*/.Application.compareCourses())),format.raw/*81.49*/("""">
				<div
					style="width: 100; min-height: 20px; margin: auto; padding-bottom: 15px;">
					<button id="compareCoursesButton" type="submit"
						class="btn btn-sm btn-primary" style="height: 30px; width: 200px">Compare
						Courses</button>

				</div>
			</form>
			<table id="courses" class="table table-striped" cellspacing="0"
				style="width: 1250px">
				<thead>
					<tr>
						<th>Name</th>
						<th>Professor</th>
						<th>Chair</th>
						<th>Description</th>
					</tr>
				</thead>
				<tbody class="searchable">
					"""),_display_(Seq[Any](/*101.7*/for(course <- courses) yield /*101.29*/ {_display_(Seq[Any](format.raw/*101.31*/("""
					<tr>

						<td><a href=""""),_display_(Seq[Any](/*104.21*/routes/*104.27*/.Application.viewCourse(course.id))),format.raw/*104.61*/("""">"""),_display_(Seq[Any](/*104.64*/course/*104.70*/.name)),format.raw/*104.75*/("""</td>
						<td>"""),_display_(Seq[Any](/*105.12*/course/*105.18*/.professor_name)),format.raw/*105.33*/("""</td>
						<td>"""),_display_(Seq[Any](/*106.12*/course/*106.18*/.chair)),format.raw/*106.24*/("""</td>
						<td>"""),_display_(Seq[Any](/*107.12*/course/*107.18*/.description)),format.raw/*107.30*/("""</td>
					</tr>
					""")))})),format.raw/*109.7*/("""
				</tbody>
			</table>
		</div>

		<div id="menu3" class="tab-pane fade">
			<h3>Jobs</h3>

				<table id="jobs" class="table table-striped" cellspacing="0">
				<th></th>
				<tbody class="searchable">
					"""),_display_(Seq[Any](/*120.7*/for(job <- jobs) yield /*120.23*/ {_display_(Seq[Any](format.raw/*120.25*/("""
					<tr>
						<td>
				<a href="""),_display_(Seq[Any](/*123.14*/job/*123.17*/.link)),format.raw/*123.22*/(""" target="_blank" >
  	 			<div class="panel panel-default">
				<div class="panel-body">
					<div style="float: left; width: 160px">
						<img src="""),_display_(Seq[Any](/*127.17*/{"assets/images/" + job.company_name + ".png"})),format.raw/*127.63*/(""">
					</div>
					<div style="float: left">

						<div style="float: left; width: 500px">
							<span class="text-title">Description</span>
							<p>"""),_display_(Seq[Any](/*133.12*/job/*133.15*/.description)),format.raw/*133.27*/("""</p>
						</div>

						<div style="float: left; padding-left: 30px">
							<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*137.55*/job/*137.58*/.company_name)),format.raw/*137.71*/("""</span><br>
							<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*138.55*/job/*138.58*/.salary)),format.raw/*138.65*/("""</span><br>
							<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*139.62*/job/*139.65*/.begin_time)),format.raw/*139.76*/("""</span>
							<span class="text-title"><b>Contact:</b></span> <span>"""),_display_(Seq[Any](/*140.63*/job/*140.66*/.contact)),format.raw/*140.74*/("""</span>
						</div>


					</div>

				</div>
			</div>
			</a>
						
						</td>
					</tr>
					""")))})),format.raw/*152.7*/("""
				</tbody>
			</table>


		</div>





		<div id="menu4" class="tab-pane fade">
			<h3>About Us</h3>
			<p>
				CourseMatch is a team project, which was created by students as part
				of the Web Application Engineering<br> course at the Technical
				University Munich. As a result of the hard time finding university
				courses and<br> jobs the team decided to implement a web
				application for universities to make life for students easier<br>
				when it comes to choosing courses.
			</p>

			<h3>Imprint</h3>
			<p>
				CourseMatch GmbH</br> Hauptstrasse 123</br> 80333 Munich - Germany
			</p>

			<p>
				Contact</br> + 49 42-123456789</br> team[at]coursematch.de
			</p>

			<p>
				CourseMatch GmbH</br> Headquarters: Munich</br> Register Court: Munich HRB
				102273</br> Ust-Ident-Nr .: DE123456789
			</p>

			<p>Managing Director: The CourseMatch Team</p>

			<p>
				Responsible for content according to § 55 II RStV: CourseMatch</br> ©
				Copyright 2015-2123</br> CourseMatch GmbH
			</p>

			<p>All rights reserved.</p>

			<p>
				The information on this website has been carefully compiled and
				checked to the best of its knowledge and belief.<br> No
				guarantee or liability for the information, particularly regarding
				its accuracy, completeness, timeliness or<br> availability at
				any time, but can not be accepted. Any liability for damages arising
				from the use of the <br> information, is - to the extent
				permitted by law - excluded. The website also contains links or
				references to <br> other websites. The CourseMatch GmbH is not
				responsible for the content of other Web sites, it dissociates <br>
				itself and makes this content as its own. The CourseMatch GmbH
				reserves the right to amend without notice the<br> information
				provided, to change or remove.
			</p>

			<p>
				Privacy: The radio.de GmbH will abide strictly by the data
				protection regulations and only use particular<br> personally
				identifiable information such as name or e-mail address to answer or
				to process requests concern.
			</p>



		</div>
	</div>
</div>


<script>
	$(document).ready(function() """),format.raw/*227.31*/("""{"""),format.raw/*227.32*/("""
		$('#courses').dataTable();
		$('#recommendedCourses').dataTable();
		$('#jobs').dataTable();
	"""),format.raw/*231.2*/("""}"""),format.raw/*231.3*/(""");
</script>
<style>
div.dropdown-menu>ul.dropdown-menu """),format.raw/*234.36*/("""{"""),format.raw/*234.37*/("""
	max-height: 135px !important;
"""),format.raw/*236.1*/("""}"""),format.raw/*236.2*/("""

#courses_wrapper>div.row """),format.raw/*238.26*/("""{"""),format.raw/*238.27*/("""
	width: 1250px;
"""),format.raw/*240.1*/("""}"""),format.raw/*240.2*/("""

#courses_filter>label """),format.raw/*242.23*/("""{"""),format.raw/*242.24*/("""
	float: right;
"""),format.raw/*244.1*/("""}"""),format.raw/*244.2*/("""

#courses_filter>label>input[type="search"] """),format.raw/*246.44*/("""{"""),format.raw/*246.45*/("""
	width: 400px !important;
"""),format.raw/*248.1*/("""}"""),format.raw/*248.2*/("""

.pagination """),format.raw/*250.13*/("""{"""),format.raw/*250.14*/("""
	top: -25px;
	position: relative;
"""),format.raw/*253.1*/("""}"""),format.raw/*253.2*/("""

.panel-body """),format.raw/*255.13*/("""{"""),format.raw/*255.14*/("""
	padding: 5px 15px 0;
"""),format.raw/*257.1*/("""}"""),format.raw/*257.2*/("""

.panel """),format.raw/*259.8*/("""{"""),format.raw/*259.9*/("""
	margin-bottom: 3px;
"""),format.raw/*261.1*/("""}"""),format.raw/*261.2*/("""
</style>

""")))})),format.raw/*264.2*/("""
"""))}
    }
    
    def render(matchedCourses:List[Course],matchJobs:List[Job],student:Student,courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String): play.api.templates.HtmlFormat.Appendable = apply(matchedCourses,matchJobs,student,courses,jobs,course_tags,job_tags)
    
    def f:((List[Course],List[Job],Student,List[Course],List[Job],String,String) => play.api.templates.HtmlFormat.Appendable) = (matchedCourses,matchJobs,student,courses,jobs,course_tags,job_tags) => apply(matchedCourses,matchJobs,student,courses,jobs,course_tags,job_tags)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 30 05:16:09 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/dashboard.scala.html
                    HASH: 6a0625b57deb02e20028a9bba1fe9ac99476a94d
                    MATRIX: 839->1|1075->142|1112->145|1167->192|1205->193|2103->1056|2148->1085|2188->1087|2259->1122|2274->1128|2330->1162|2369->1165|2384->1171|2411->1176|2465->1194|2480->1200|2517->1215|2571->1233|2586->1239|2614->1245|2668->1263|2683->1269|2717->1281|2773->1306|2939->1437|2976->1458|3016->1460|3397->1805|3409->1808|3443->1820|3496->1837|3508->1840|3543->1853|3701->1980|3929->2172|3944->2178|3995->2207|4592->2768|4631->2790|4672->2792|4744->2827|4760->2833|4817->2867|4857->2870|4873->2876|4901->2881|4956->2899|4972->2905|5010->2920|5065->2938|5081->2944|5110->2950|5165->2968|5181->2974|5216->2986|5273->3011|5532->3234|5565->3250|5606->3252|5681->3290|5694->3293|5722->3298|5913->3452|5982->3498|6179->3658|6192->3661|6227->3673|6393->3802|6406->3805|6442->3818|6546->3885|6559->3888|6589->3895|6700->3969|6713->3972|6747->3983|6855->4054|6868->4057|6899->4065|7044->4178|9302->6407|9332->6408|9461->6509|9490->6510|9578->6569|9608->6570|9670->6604|9699->6605|9757->6634|9787->6635|9834->6654|9863->6655|9918->6681|9948->6682|9994->6700|10023->6701|10099->6748|10129->6749|10186->6778|10215->6779|10260->6795|10290->6796|10356->6834|10385->6835|10430->6851|10460->6852|10513->6877|10542->6878|10581->6889|10610->6890|10662->6914|10691->6915|10738->6930
                    LINES: 26->1|29->1|30->2|30->2|30->2|61->33|61->33|61->33|64->36|64->36|64->36|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|69->41|75->47|75->47|75->47|89->61|89->61|89->61|90->62|90->62|90->62|100->72|109->81|109->81|109->81|129->101|129->101|129->101|132->104|132->104|132->104|132->104|132->104|132->104|133->105|133->105|133->105|134->106|134->106|134->106|135->107|135->107|135->107|137->109|148->120|148->120|148->120|151->123|151->123|151->123|155->127|155->127|161->133|161->133|161->133|165->137|165->137|165->137|166->138|166->138|166->138|167->139|167->139|167->139|168->140|168->140|168->140|180->152|255->227|255->227|259->231|259->231|262->234|262->234|264->236|264->236|266->238|266->238|268->240|268->240|270->242|270->242|272->244|272->244|274->246|274->246|276->248|276->248|278->250|278->250|281->253|281->253|283->255|283->255|285->257|285->257|287->259|287->259|289->261|289->261|292->264
                    -- GENERATED --
                */
            