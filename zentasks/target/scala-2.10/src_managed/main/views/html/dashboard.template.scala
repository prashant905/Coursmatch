
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
object dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Student,List[Course],List[Job],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , courses: List[Course], jobs:List[Job]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""
"""),_display_(Seq[Any](/*2.2*/main(student,courses,jobs)/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""


<div id="menu_container" class="container">
	<ul class="nav nav-pills" style="width: 1000px">
		<li class="active"><a data-toggle="pill" href="#home">Dashboard</a></li>
		<li><a data-toggle="pill" href="#menu2">Courses</a></li>
		<li><a data-toggle="pill" href="#menu3">Jobs</a></li>
		<li><a data-toggle="pill" href="#menu4">About us</a></li>
	</ul>



	<div class="tab-content">
		<div id="home" class="tab-pane fade in active">
			<h3>Dashboard... actually we need there the dashboard table with
				news</h3>

			"""),_display_(Seq[Any](/*20.5*/for(job <- jobs) yield /*20.21*/ {_display_(Seq[Any](format.raw/*20.23*/("""

			<div class="panel panel-default">
				<div class="panel-body">


					<div style="float: left; width: 160px">
						<img src="assets/images/tum.png" height="60" width="60">
					</div>
					<div style="float: left">


						<div style="float: left; width: 500px">
							<span class="text-title">Description</span>
							<p>"""),_display_(Seq[Any](/*34.12*/job/*34.15*/.description)),format.raw/*34.27*/("""</p>
						</div>

						<div style="float: left; padding-left: 30px"></div>


					</div>

				</div>
			</div>
			""")))})),format.raw/*44.5*/("""
		</div>


		<div id="menu2" class="tab-pane fade">

			<h3>Search Courses</h3>
			<form style="top: 45px; position: relative; z-index: 1000;"
				action=""""),_display_(Seq[Any](/*52.14*/routes/*52.20*/.Application.compareCourses())),format.raw/*52.49*/("""">
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
					"""),_display_(Seq[Any](/*72.7*/for(course <- courses) yield /*72.29*/ {_display_(Seq[Any](format.raw/*72.31*/("""
					<tr>

						<td><a href=""""),_display_(Seq[Any](/*75.21*/routes/*75.27*/.Application.viewCourse(course.id))),format.raw/*75.61*/("""">"""),_display_(Seq[Any](/*75.64*/course/*75.70*/.name)),format.raw/*75.75*/("""</td>
						<td>"""),_display_(Seq[Any](/*76.12*/course/*76.18*/.professor_name)),format.raw/*76.33*/("""</td>
						<td>"""),_display_(Seq[Any](/*77.12*/course/*77.18*/.chair)),format.raw/*77.24*/("""</td>
						<td>"""),_display_(Seq[Any](/*78.12*/course/*78.18*/.description)),format.raw/*78.30*/("""</td>
					</tr>
					""")))})),format.raw/*80.7*/("""
				</tbody>
			</table>
		</div>

		<div id="menu3" class="tab-pane fade">
			<h3>Jobs</h3>

			"""),_display_(Seq[Any](/*88.5*/for(job <- jobs) yield /*88.21*/ {_display_(Seq[Any](format.raw/*88.23*/("""

			<div class="panel panel-default">
				<div class="panel-body">


					<div style="float: left; width: 160px">
						<img src="""),_display_(Seq[Any](/*95.17*/{"assets/images/" + job.company_name + ".png"})),format.raw/*95.63*/(""">
					</div>
					<div style="float: left">


						<div style="float: left; width: 500px">
							<span class="text-title">Description</span>
							<p>"""),_display_(Seq[Any](/*102.12*/job/*102.15*/.description)),format.raw/*102.27*/("""</p>
						</div>

						<div style="float: left; padding-left: 30px">
							<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*106.55*/job/*106.58*/.company_name)),format.raw/*106.71*/("""</span><br>
							<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*107.55*/job/*107.58*/.salary)),format.raw/*107.65*/("""</span><br>
							<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*108.62*/job/*108.65*/.begin_time)),format.raw/*108.76*/("""</span>
						</div>


					</div>

				</div>
			</div>
			""")))})),format.raw/*116.5*/("""

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
	$(document).ready(function() """),format.raw/*188.31*/("""{"""),format.raw/*188.32*/("""
		$('#courses').dataTable();
	"""),format.raw/*190.2*/("""}"""),format.raw/*190.3*/(""");
</script>
<style>
div.dropdown-menu>ul.dropdown-menu """),format.raw/*193.36*/("""{"""),format.raw/*193.37*/("""
	max-height: 135px !important;
"""),format.raw/*195.1*/("""}"""),format.raw/*195.2*/("""

#courses_wrapper>div.row """),format.raw/*197.26*/("""{"""),format.raw/*197.27*/("""
	width: 1250px;
"""),format.raw/*199.1*/("""}"""),format.raw/*199.2*/("""

#courses_filter>label """),format.raw/*201.23*/("""{"""),format.raw/*201.24*/("""
	float: right;
"""),format.raw/*203.1*/("""}"""),format.raw/*203.2*/("""

#courses_filter>label>input[type="search"] """),format.raw/*205.44*/("""{"""),format.raw/*205.45*/("""
	width: 400px !important;
"""),format.raw/*207.1*/("""}"""),format.raw/*207.2*/("""

.pagination """),format.raw/*209.13*/("""{"""),format.raw/*209.14*/("""
	top: -25px;
	position: relative;
"""),format.raw/*212.1*/("""}"""),format.raw/*212.2*/("""

.panel-body """),format.raw/*214.13*/("""{"""),format.raw/*214.14*/("""
	padding: 5px 15px 0;
"""),format.raw/*216.1*/("""}"""),format.raw/*216.2*/("""

.panel """),format.raw/*218.8*/("""{"""),format.raw/*218.9*/("""
	margin-bottom: 3px;
"""),format.raw/*220.1*/("""}"""),format.raw/*220.2*/("""
</style>

""")))})),format.raw/*223.2*/("""
"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job]): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs)
    
    def f:((Student,List[Course],List[Job]) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs) => apply(student,courses,jobs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 29 14:33:57 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/dashboard.scala.html
                    HASH: 7876ff87b200420b6cad90fb777e895f980766ab
                    MATRIX: 802->1|954->59|991->62|1025->88|1063->89|1637->628|1669->644|1709->646|2090->991|2102->994|2136->1006|2294->1133|2495->1298|2510->1304|2561->1333|3157->1894|3195->1916|3235->1918|3306->1953|3321->1959|3377->1993|3416->1996|3431->2002|3458->2007|3512->2025|3527->2031|3564->2046|3618->2064|3633->2070|3661->2076|3715->2094|3730->2100|3764->2112|3820->2137|3962->2244|3994->2260|4034->2262|4208->2400|4276->2446|4475->2608|4488->2611|4523->2623|4689->2752|4702->2755|4738->2768|4842->2835|4855->2838|4885->2845|4996->2919|5009->2922|5043->2933|5144->3002|7373->5202|7403->5203|7464->5236|7493->5237|7581->5296|7611->5297|7673->5331|7702->5332|7760->5361|7790->5362|7837->5381|7866->5382|7921->5408|7951->5409|7997->5427|8026->5428|8102->5475|8132->5476|8189->5505|8218->5506|8263->5522|8293->5523|8359->5561|8388->5562|8433->5578|8463->5579|8516->5604|8545->5605|8584->5616|8613->5617|8665->5641|8694->5642|8741->5657
                    LINES: 26->1|29->1|30->2|30->2|30->2|48->20|48->20|48->20|62->34|62->34|62->34|72->44|80->52|80->52|80->52|100->72|100->72|100->72|103->75|103->75|103->75|103->75|103->75|103->75|104->76|104->76|104->76|105->77|105->77|105->77|106->78|106->78|106->78|108->80|116->88|116->88|116->88|123->95|123->95|130->102|130->102|130->102|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|144->116|216->188|216->188|218->190|218->190|221->193|221->193|223->195|223->195|225->197|225->197|227->199|227->199|229->201|229->201|231->203|231->203|233->205|233->205|235->207|235->207|237->209|237->209|240->212|240->212|242->214|242->214|244->216|244->216|246->218|246->218|248->220|248->220|251->223
                    -- GENERATED --
                */
            