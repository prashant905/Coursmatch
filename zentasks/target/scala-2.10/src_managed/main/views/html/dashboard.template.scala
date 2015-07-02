
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
object dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template9[List[Course],List[Job],Student,List[Course],List[Job],String,String,List[FavoriteCourses],List[FavoriteJobs],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(matchedCourses:List[Course],matchJobs:List[Job],student: Student ,
courses: List[Course],
jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses],favoriteJobs:List[FavoriteJobs]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*3.116*/("""
"""),_display_(Seq[Any](/*4.2*/main(student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs)/*4.73*/{_display_(Seq[Any](format.raw/*4.74*/("""


<div id="menu_container" class="container">
	<ul class="nav nav-pills" style="width: 1000px">
		<li class="active"><a data-toggle="pill" href="#home">Dashboard</a></li>
		<li><a data-toggle="pill" href="#menu2">Courses</a></li>
		<li><a data-toggle="pill" href="#menu3">Jobs</a></li>
		<li><a data-toggle="pill" href="#menu4">About us</a></li>
	</ul>



	<div class="tab-content">
		<div id="home" class="tab-pane fade in active">
			<h3></h3>
			<div class="panel panel-primary" style="margin-bottom: 60px">
				<div class="panel-heading">Recommended Courses</div>
				<table id="recommendedCourses" class="table table-striped"
					cellspacing="0">
					<thead>
						<tr>
							<th>Name</th>
							<th>Professor</th>
							<th>Chair</th>
							<th>Description</th>
						</tr>
					</thead>
					<tbody class="searchable">
						"""),_display_(Seq[Any](/*33.8*/for(course <- matchedCourses) yield /*33.37*/ {_display_(Seq[Any](format.raw/*33.39*/("""
						<tr>

							<td><a
								href=""""),_display_(Seq[Any](/*37.16*/routes/*37.22*/.StudentOperationController.viewCourse(course.id))),format.raw/*37.71*/("""">"""),_display_(Seq[Any](/*37.74*/course/*37.80*/.name)),format.raw/*37.85*/("""</td>
							<td>"""),_display_(Seq[Any](/*38.13*/course/*38.19*/.professor_name)),format.raw/*38.34*/("""</td>
							<td>"""),_display_(Seq[Any](/*39.13*/course/*39.19*/.chair)),format.raw/*39.25*/("""</td>
							<td>"""),_display_(Seq[Any](/*40.13*/course/*40.19*/.description)),format.raw/*40.31*/("""</td>
						</tr>
						""")))})),format.raw/*42.8*/("""
					</tbody>
				</table>
			</div>
			<div class="panel panel-primary">
				<div class="panel-heading">Recommended Jobs</div>
				<table id="jobs" class="table table-striped" cellspacing="0">
					<th></th>
					<tbody class="searchable">
						"""),_display_(Seq[Any](/*51.8*/for(job <- matchJobs) yield /*51.29*/ {_display_(Seq[Any](format.raw/*51.31*/("""
						<tr>
							<td>
								<div class="panel panel-default" style="margin-top: 10px">
									<div class="panel-body">
										<div style="float: left; width: 160px">
											<img src="""),_display_(Seq[Any](/*57.22*/{"assets/images/" + job.company_name + ".png"})),format.raw/*57.68*/(""">
										</div>
										<div style="float: left">

											<div style="float: left; width: 500px">
												<span class="text-title">Title</span>
												<p>
													<a href="""),_display_(Seq[Any](/*64.23*/job/*64.26*/.link)),format.raw/*64.31*/(""" target="_blank" >"""),_display_(Seq[Any](/*64.50*/job/*64.53*/.title)),format.raw/*64.59*/("""</a>
												</p>
												<span class="text-title">Description</span>
												<p>"""),_display_(Seq[Any](/*67.17*/job/*67.20*/.description)),format.raw/*67.32*/("""</p>
											</div>

											<div style="float: left; padding-left: 30px">
												<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*71.60*/job/*71.63*/.company_name)),format.raw/*71.76*/("""</span><br>
												<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*72.60*/job/*72.63*/.salary)),format.raw/*72.70*/("""</span><br>
												<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*73.67*/job/*73.70*/.begin_date)),format.raw/*73.81*/("""</span><br>

												<span class="text-title"><b>Contact:</b></span> <span
													style="padding-right: 15px">"""),_display_(Seq[Any](/*76.43*/job/*76.46*/.contact)),format.raw/*76.54*/("""</span>
											</div>
										</div>
									</div>
								</div>
							</td>
						</tr>
						""")))})),format.raw/*83.8*/("""
					</tbody>
				</table>
			</div>
		</div>

		<div id="menu2" class="tab-pane fade">

			<h3></h3>
			<div class="panel panel-primary" style="margin-bottom: 60px;">
				<div class="panel-heading">Search Courses</div>
				<form style="top: -36px; position: relative; left: -345px;"
					action=""""),_display_(Seq[Any](/*95.15*/routes/*95.21*/.StudentOperationController.compareCourses())),format.raw/*95.65*/("""">
					<div style="width: 100; min-height: 20px; margin: auto;">
						<button id="compareCoursesButton" type="submit"
							class="btn btn-danger" style="height: 30px; width: 200px">Compare
							Courses</button>
					</div>
				</form>
				<table id="courses" class="table table-striped" cellspacing="0">
					<thead>
						<tr>
							<th>Name</th>
							<th>Professor</th>
							<th>Chair</th>
							<th>Description</th>
						</tr>
					</thead>
					<tbody class="searchable">
						"""),_display_(Seq[Any](/*112.8*/for(course <- courses) yield /*112.30*/ {_display_(Seq[Any](format.raw/*112.32*/("""
						<tr>

							<td><a
								href=""""),_display_(Seq[Any](/*116.16*/routes/*116.22*/.StudentOperationController.viewCourse(course.id))),format.raw/*116.71*/("""">"""),_display_(Seq[Any](/*116.74*/course/*116.80*/.name)),format.raw/*116.85*/("""</td>
							<td>"""),_display_(Seq[Any](/*117.13*/course/*117.19*/.professor_name)),format.raw/*117.34*/("""</td>
							<td>"""),_display_(Seq[Any](/*118.13*/course/*118.19*/.chair)),format.raw/*118.25*/("""</td>
							<td>"""),_display_(Seq[Any](/*119.13*/course/*119.19*/.description)),format.raw/*119.31*/("""</td>
						</tr>
						""")))})),format.raw/*121.8*/("""
					</tbody>
				</table>
			</div>


			<div class="panel panel-primary" style="margin-bottom: 60px">
				<div class="panel-heading">Favorite Courses</div>
				<table id="favoriteCourses" class="table table-striped"
					cellspacing="0">
					<thead>
						<tr>
							<th>Name</th>
							<th>Professor</th>
							<th>Chair</th>
							<th>Description</th>
							<th></th>
						</tr>
					</thead>
					<tbody class="searchable">
						"""),_display_(Seq[Any](/*141.8*/for(course <- favCourses) yield /*141.33*/ {_display_(Seq[Any](format.raw/*141.35*/("""
						<tr>

							<td><a
								href=""""),_display_(Seq[Any](/*145.16*/routes/*145.22*/.StudentOperationController.viewCourse(course.course.id))),format.raw/*145.78*/("""">"""),_display_(Seq[Any](/*145.81*/course/*145.87*/.course.name)),format.raw/*145.99*/("""</td>
							<td>"""),_display_(Seq[Any](/*146.13*/course/*146.19*/.course.professor_name)),format.raw/*146.41*/("""</td>
							<td>"""),_display_(Seq[Any](/*147.13*/course/*147.19*/.course.chair)),format.raw/*147.32*/("""</td>
							<td>"""),_display_(Seq[Any](/*148.13*/course/*148.19*/.course.description)),format.raw/*148.38*/("""</td>
							<td></a> <a class="glyphicon  logout"
								href=""""),_display_(Seq[Any](/*150.16*/routes/*150.22*/.StudentOperationController.removeFromFavorites(course.id))),format.raw/*150.80*/(""""
								style="background: none; box-shadow: none; padding: 8px 5px;">
									<b style="font-family: arial; color: #C9302C; font-size: 14px">
										Remove from Favorites </b>
							</a></td>
						</tr>
						""")))})),format.raw/*156.8*/("""
					</tbody>
				</table>
			</div>


		</div>
		<div id="menu3" class="tab-pane fade">
			<h3></h3>

			<div class="panel panel-primary" style="margin-bottom: 60px;">
				<div class="panel-heading">Jobs</div>
				<table id="jobs" class="table table-striped" cellspacing="0">
					<th></th>
					<tbody class="searchable">
						"""),_display_(Seq[Any](/*171.8*/for(job <- jobs) yield /*171.24*/ {_display_(Seq[Any](format.raw/*171.26*/("""
						<tr>
							<td>
								<div class="panel panel-default" style="margin-top: 10px">
									<div class="panel-body">
										<div style="float: left; width: 160px">
											<img src="""),_display_(Seq[Any](/*177.22*/{"assets/images/" + job.company_name + ".png"})),format.raw/*177.68*/(""">
										</div>
										<div style="float: left">

											<div style="float: left; width: 500px">
												<span class="text-title">Title</span>
												<p>
													<a href="""),_display_(Seq[Any](/*184.23*/job/*184.26*/.link)),format.raw/*184.31*/(""" target="_blank">"""),_display_(Seq[Any](/*184.49*/job/*184.52*/.title)),format.raw/*184.58*/("""</a>
												</p>
												<span class="text-title">Description</span>
												<p>"""),_display_(Seq[Any](/*187.17*/job/*187.20*/.description)),format.raw/*187.32*/("""</p>
											</div>

											<div style="float: left; padding-left: 30px">
												<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*191.60*/job/*191.63*/.company_name)),format.raw/*191.76*/("""</span><br>
												<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*192.60*/job/*192.63*/.salary)),format.raw/*192.70*/("""</span><br>
												<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*193.67*/job/*193.70*/.begin_date)),format.raw/*193.81*/("""</span><br>

												<span class="text-title"><b>Contact:</b></span> <span
													style="padding-right: 15px">"""),_display_(Seq[Any](/*196.43*/job/*196.46*/.contact)),format.raw/*196.54*/("""</span> <a
													class="glyphicon  logout"
													href=""""),_display_(Seq[Any](/*198.21*/routes/*198.27*/.StudentOperationController.addJobToFavorites(job.id))),format.raw/*198.80*/(""""
													style="background: none; box-shadow: none; padding: 8px 5px;">
													<b style="font-family: arial; color: #C9302C; font-size: 14px">
														Add To Favorites </b>
												</a>
											</div>
										</div>
									</div>
								</div>
							</td>
						</tr>
						""")))})),format.raw/*209.8*/("""
					</tbody>
				</table>
			</div>

			<div class="panel panel-primary" style="margin-bottom: 60px;">
				<div class="panel-heading">Favorite Jobs</div>
				<table id="favoriteJobs" class="table table-striped" cellspacing="0">
					<th></th>
					<tbody class="searchable">
						"""),_display_(Seq[Any](/*219.8*/for(job <- favoriteJobs) yield /*219.32*/ {_display_(Seq[Any](format.raw/*219.34*/("""
						<tr>
							<td>
								<div class="panel panel-default">
									<div class="panel-body">
										<div style="float: left; width: 160px">
											<img src="""),_display_(Seq[Any](/*225.22*/{"assets/images/" + job.job.company_name + ".png"})),format.raw/*225.72*/(""">
										</div>
										<div style="float: left">

											<div style="float: left; width: 500px">
												<span class="text-title">Title</span>
												<p>
													<a href="""),_display_(Seq[Any](/*232.23*/job/*232.26*/.job.link)),format.raw/*232.35*/(""" target="_blank">"""),_display_(Seq[Any](/*232.53*/job/*232.56*/.job.title)),format.raw/*232.66*/("""</a>
												</p>
												<span class="text-title">Description</span>
												<p>"""),_display_(Seq[Any](/*235.17*/job/*235.20*/.job.description)),format.raw/*235.36*/("""</p>
											</div>

											<div style="float: left; padding-left: 30px">
												<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*239.60*/job/*239.63*/.job.company_name)),format.raw/*239.80*/("""</span><br>
												<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*240.60*/job/*240.63*/.job.salary)),format.raw/*240.74*/("""</span><br>
												<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*241.67*/job/*241.70*/.job.begin_date)),format.raw/*241.85*/("""</span><br>

												<span class="text-title"><b>Contact:</b></span> <span
													style="padding-right: 15px">"""),_display_(Seq[Any](/*244.43*/job/*244.46*/.job.contact)),format.raw/*244.58*/("""</span> <a
													class="glyphicon  logout"
													href=""""),_display_(Seq[Any](/*246.21*/routes/*246.27*/.StudentOperationController.removeJobFromFavorites(job.id))),format.raw/*246.85*/(""""
													style="background: none; box-shadow: none; padding: 8px 5px;">
													<b style="font-family: arial; color: #C9302C; font-size: 14px">
														Remove From Favorites </b>
												</a>
											</div>
										</div>
									</div>
								</div>
							</td>
						</tr>
						""")))})),format.raw/*257.8*/("""
					</tbody>
				</table>
			</div>
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
	$(document).ready(function() """),format.raw/*329.31*/("""{"""),format.raw/*329.32*/("""
		$('#favoriteCourses').dataTable();
		$('#courses').dataTable();
		$('#recommendedCourses').dataTable();
		$('#jobs').dataTable();
		$('#favoriteJobs').dataTable();
	"""),format.raw/*335.2*/("""}"""),format.raw/*335.3*/(""");
</script>
<style>
#recommendedCourses_wrapper, #favoriteCourses_wrapper """),format.raw/*338.55*/("""{"""),format.raw/*338.56*/("""
	margin-top: 30px;
"""),format.raw/*340.1*/("""}"""),format.raw/*340.2*/("""

div.dropdown-menu>ul.dropdown-menu """),format.raw/*342.36*/("""{"""),format.raw/*342.37*/("""
	max-height: 135px !important;
"""),format.raw/*344.1*/("""}"""),format.raw/*344.2*/("""

#recommendedCourses_filter>label, #courses_filter>label,
	#favoriteCourses_filter>label """),format.raw/*347.32*/("""{"""),format.raw/*347.33*/("""
	float: right;
	position: relative;
	top: -66px;
	margin-right: 5px;
	color: transparent;
"""),format.raw/*353.1*/("""}"""),format.raw/*353.2*/("""

#courses_filter>label>input[type="search"], #recommendedCourses_filter>label>input[type="search"],
	#favoriteCourses_filter>label>input[type="search"] """),format.raw/*356.53*/("""{"""),format.raw/*356.54*/("""
	width: 400px !important;
"""),format.raw/*358.1*/("""}"""),format.raw/*358.2*/("""

.pagination """),format.raw/*360.13*/("""{"""),format.raw/*360.14*/("""
	top: -25px;
	position: relative;
"""),format.raw/*363.1*/("""}"""),format.raw/*363.2*/("""

.panel-body """),format.raw/*365.13*/("""{"""),format.raw/*365.14*/("""
	padding: 5px 15px 0;
"""),format.raw/*367.1*/("""}"""),format.raw/*367.2*/("""

.panel """),format.raw/*369.8*/("""{"""),format.raw/*369.9*/("""
	margin-bottom: 3px;
"""),format.raw/*371.1*/("""}"""),format.raw/*371.2*/("""
</style>

""")))})),format.raw/*374.2*/("""
"""))}
    }
    
    def render(matchedCourses:List[Course],matchJobs:List[Job],student:Student,courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses],favoriteJobs:List[FavoriteJobs]): play.api.templates.HtmlFormat.Appendable = apply(matchedCourses,matchJobs,student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs)
    
    def f:((List[Course],List[Job],Student,List[Course],List[Job],String,String,List[FavoriteCourses],List[FavoriteJobs]) => play.api.templates.HtmlFormat.Appendable) = (matchedCourses,matchJobs,student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs) => apply(matchedCourses,matchJobs,student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 15:19:38 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/dashboard.scala.html
                    HASH: 3159660b40a571b03b8d562b2375f395e5f8d95e
                    MATRIX: 880->1|1183->209|1220->212|1299->283|1337->284|2241->1153|2286->1182|2326->1184|2408->1230|2423->1236|2494->1285|2533->1288|2548->1294|2575->1299|2630->1318|2645->1324|2682->1339|2737->1358|2752->1364|2780->1370|2835->1389|2850->1395|2884->1407|2942->1434|3235->1692|3272->1713|3312->1715|3550->1917|3618->1963|3856->2165|3868->2168|3895->2173|3950->2192|3962->2195|3990->2201|4123->2298|4135->2301|4169->2313|4349->2457|4361->2460|4396->2473|4504->2545|4516->2548|4545->2555|4660->2634|4672->2637|4705->2648|4865->2772|4877->2775|4907->2783|5051->2896|5398->3207|5413->3213|5479->3257|6028->3770|6067->3792|6108->3794|6191->3840|6207->3846|6279->3895|6319->3898|6335->3904|6363->3909|6419->3928|6435->3934|6473->3949|6529->3968|6545->3974|6574->3980|6630->3999|6646->4005|6681->4017|6740->4044|7240->4508|7282->4533|7323->4535|7406->4581|7422->4587|7501->4643|7541->4646|7557->4652|7592->4664|7648->4683|7664->4689|7709->4711|7765->4730|7781->4736|7817->4749|7873->4768|7889->4774|7931->4793|8036->4861|8052->4867|8133->4925|8390->5150|8773->5497|8806->5513|8847->5515|9086->5717|9155->5763|9394->5965|9407->5968|9435->5973|9490->5991|9503->5994|9532->6000|9666->6097|9679->6100|9714->6112|9895->6256|9908->6259|9944->6272|10053->6344|10066->6347|10096->6354|10212->6433|10225->6436|10259->6447|10420->6571|10433->6574|10464->6582|10573->6654|10589->6660|10665->6713|11014->7030|11344->7324|11385->7348|11426->7350|11640->7527|11713->7577|11952->7779|11965->7782|11997->7791|12052->7809|12065->7812|12098->7822|12232->7919|12245->7922|12284->7938|12465->8082|12478->8085|12518->8102|12627->8174|12640->8177|12674->8188|12790->8267|12803->8270|12841->8285|13002->8409|13015->8412|13050->8424|13159->8496|13175->8502|13256->8560|13610->8882|15873->11116|15903->11117|16105->11291|16134->11292|16241->11370|16271->11371|16321->11393|16350->11394|16418->11433|16448->11434|16510->11468|16539->11469|16661->11562|16691->11563|16816->11660|16845->11661|17030->11817|17060->11818|17117->11847|17146->11848|17191->11864|17221->11865|17287->11903|17316->11904|17361->11920|17391->11921|17444->11946|17473->11947|17512->11958|17541->11959|17593->11983|17622->11984|17669->11999
                    LINES: 26->1|31->3|32->4|32->4|32->4|61->33|61->33|61->33|65->37|65->37|65->37|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|70->42|79->51|79->51|79->51|85->57|85->57|92->64|92->64|92->64|92->64|92->64|92->64|95->67|95->67|95->67|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|104->76|104->76|104->76|111->83|123->95|123->95|123->95|140->112|140->112|140->112|144->116|144->116|144->116|144->116|144->116|144->116|145->117|145->117|145->117|146->118|146->118|146->118|147->119|147->119|147->119|149->121|169->141|169->141|169->141|173->145|173->145|173->145|173->145|173->145|173->145|174->146|174->146|174->146|175->147|175->147|175->147|176->148|176->148|176->148|178->150|178->150|178->150|184->156|199->171|199->171|199->171|205->177|205->177|212->184|212->184|212->184|212->184|212->184|212->184|215->187|215->187|215->187|219->191|219->191|219->191|220->192|220->192|220->192|221->193|221->193|221->193|224->196|224->196|224->196|226->198|226->198|226->198|237->209|247->219|247->219|247->219|253->225|253->225|260->232|260->232|260->232|260->232|260->232|260->232|263->235|263->235|263->235|267->239|267->239|267->239|268->240|268->240|268->240|269->241|269->241|269->241|272->244|272->244|272->244|274->246|274->246|274->246|285->257|357->329|357->329|363->335|363->335|366->338|366->338|368->340|368->340|370->342|370->342|372->344|372->344|375->347|375->347|381->353|381->353|384->356|384->356|386->358|386->358|388->360|388->360|391->363|391->363|393->365|393->365|395->367|395->367|397->369|397->369|399->371|399->371|402->374
                    -- GENERATED --
                */
            