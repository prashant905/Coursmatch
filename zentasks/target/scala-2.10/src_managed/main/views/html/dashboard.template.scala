
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
			<form style="top: 45px; position: relative;z-index:1000;"
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
	</div>
</div>

<div id="menu3" class="tab-pane fade">
	<h3>Jobs</h3>

	"""),_display_(Seq[Any](/*90.3*/for(job <- jobs) yield /*90.19*/ {_display_(Seq[Any](format.raw/*90.21*/("""

	<div class="panel panel-default">
		<div class="panel-body">


			<div style="float: left; width: 160px">
				<img src="""),_display_(Seq[Any](/*97.15*/{"assets/images/" + job.company_name + ".png"})),format.raw/*97.61*/(""">
			</div>
			<div style="float: left">


				<div style="float: left; width: 500px">
					<span class="text-title">Description</span>
					<p>"""),_display_(Seq[Any](/*104.10*/job/*104.13*/.description)),format.raw/*104.25*/("""</p>
				</div>

				<div style="float: left; padding-left: 30px">
					<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*108.53*/job/*108.56*/.company_name)),format.raw/*108.69*/("""</span><br>
					<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*109.53*/job/*109.56*/.salary)),format.raw/*109.63*/("""</span><br>
					<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*110.60*/job/*110.63*/.begin_time)),format.raw/*110.74*/("""</span>
				</div>


			</div>

		</div>
	</div>
	""")))})),format.raw/*118.3*/("""

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
		checked to the best of its knowledge and belief.<br> No guarantee
		or liability for the information, particularly regarding its accuracy,
		completeness, timeliness or<br> availability at any time, but can
		not be accepted. Any liability for damages arising from the use of the
		<br> information, is - to the extent permitted by law - excluded.
		The website also contains links or references to <br> other
		websites. The CourseMatch GmbH is not responsible for the content of
		other Web sites, it dissociates <br> itself and makes this
		content as its own. The CourseMatch GmbH reserves the right to amend
		without notice the<br> information provided, to change or remove.
	</p>

	<p>
		Privacy: The radio.de GmbH will abide strictly by the data protection
		regulations and only use particular<br> personally identifiable
		information such as name or e-mail address to answer or to process
		requests concern.
	</p>







</div>
</div>
</div>

<script>
	$(document).ready(function() """),format.raw/*191.31*/("""{"""),format.raw/*191.32*/("""
		$('#courses').dataTable();
	"""),format.raw/*193.2*/("""}"""),format.raw/*193.3*/(""");
</script>
<style>
div.dropdown-menu>ul.dropdown-menu """),format.raw/*196.36*/("""{"""),format.raw/*196.37*/("""
	max-height: 135px !important;
"""),format.raw/*198.1*/("""}"""),format.raw/*198.2*/("""

#courses_wrapper>div.row """),format.raw/*200.26*/("""{"""),format.raw/*200.27*/("""
	width: 1250px;
"""),format.raw/*202.1*/("""}"""),format.raw/*202.2*/("""

#courses_filter>label """),format.raw/*204.23*/("""{"""),format.raw/*204.24*/("""
	float: right;
"""),format.raw/*206.1*/("""}"""),format.raw/*206.2*/("""

#courses_filter>label>input[type="search"] """),format.raw/*208.44*/("""{"""),format.raw/*208.45*/("""
	width: 400px !important;
"""),format.raw/*210.1*/("""}"""),format.raw/*210.2*/("""

.pagination """),format.raw/*212.13*/("""{"""),format.raw/*212.14*/("""
	top: -25px;
	position: relative;
"""),format.raw/*215.1*/("""}"""),format.raw/*215.2*/("""

.panel-body """),format.raw/*217.13*/("""{"""),format.raw/*217.14*/("""
	padding: 5px 15px 0;
"""),format.raw/*219.1*/("""}"""),format.raw/*219.2*/("""

.panel """),format.raw/*221.8*/("""{"""),format.raw/*221.9*/("""
	margin-bottom: 3px;
"""),format.raw/*223.1*/("""}"""),format.raw/*223.2*/("""
</style>

""")))})),format.raw/*226.2*/("""
"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job]): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs)
    
    def f:((Student,List[Course],List[Job]) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs) => apply(student,courses,jobs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 29 04:56:33 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/dashboard.scala.html
                    HASH: 4f9b47a53dcc77423afa1ccab9e2f33865b07051
                    MATRIX: 802->1|954->59|991->62|1025->88|1063->89|1637->628|1669->644|1709->646|2090->991|2102->994|2136->1006|2294->1133|2493->1296|2508->1302|2559->1331|3155->1892|3193->1914|3233->1916|3304->1951|3319->1957|3375->1991|3414->1994|3429->2000|3456->2005|3510->2023|3525->2029|3562->2044|3616->2062|3631->2068|3659->2074|3713->2092|3728->2098|3762->2110|3818->2135|3971->2253|4003->2269|4043->2271|4209->2401|4277->2447|4466->2599|4479->2602|4514->2614|4674->2737|4687->2740|4723->2753|4825->2818|4838->2821|4868->2828|4977->2900|4990->2903|5024->2914|5115->2973|7246->5075|7276->5076|7337->5109|7366->5110|7454->5169|7484->5170|7546->5204|7575->5205|7633->5234|7663->5235|7710->5254|7739->5255|7794->5281|7824->5282|7870->5300|7899->5301|7975->5348|8005->5349|8062->5378|8091->5379|8136->5395|8166->5396|8232->5434|8261->5435|8306->5451|8336->5452|8389->5477|8418->5478|8457->5489|8486->5490|8538->5514|8567->5515|8614->5530
                    LINES: 26->1|29->1|30->2|30->2|30->2|48->20|48->20|48->20|62->34|62->34|62->34|72->44|80->52|80->52|80->52|100->72|100->72|100->72|103->75|103->75|103->75|103->75|103->75|103->75|104->76|104->76|104->76|105->77|105->77|105->77|106->78|106->78|106->78|108->80|118->90|118->90|118->90|125->97|125->97|132->104|132->104|132->104|136->108|136->108|136->108|137->109|137->109|137->109|138->110|138->110|138->110|146->118|219->191|219->191|221->193|221->193|224->196|224->196|226->198|226->198|228->200|228->200|230->202|230->202|232->204|232->204|234->206|234->206|236->208|236->208|238->210|238->210|240->212|240->212|243->215|243->215|245->217|245->217|247->219|247->219|249->221|249->221|251->223|251->223|254->226
                    -- GENERATED --
                */
            