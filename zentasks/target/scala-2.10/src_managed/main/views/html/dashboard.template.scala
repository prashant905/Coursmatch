
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
													<a href=""""),_display_(Seq[Any](/*64.24*/job/*64.27*/.link)),format.raw/*64.32*/("""">"""),_display_(Seq[Any](/*64.35*/job/*64.38*/.title)),format.raw/*64.44*/("""</a>
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
									<b style="font-family: arial; color: red; font-size: 14px">
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
													<a href=""""),_display_(Seq[Any](/*184.24*/job/*184.27*/.link)),format.raw/*184.32*/("""">"""),_display_(Seq[Any](/*184.35*/job/*184.38*/.title)),format.raw/*184.44*/("""</a>
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
													<b style="font-family: arial; color: red; font-size: 14px">
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
													<a href=""""),_display_(Seq[Any](/*232.24*/job/*232.27*/.job.link)),format.raw/*232.36*/("""">"""),_display_(Seq[Any](/*232.39*/job/*232.42*/.job.title)),format.raw/*232.52*/("""</a>
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
													<b style="font-family: arial; color: red; font-size: 14px">
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
                    DATE: Thu Jul 02 12:39:33 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/dashboard.scala.html
                    HASH: dc52cdd337ddb6185b4fc56d4fa2a4140ef90561
                    MATRIX: 880->1|1183->209|1220->212|1299->283|1337->284|2241->1153|2286->1182|2326->1184|2408->1230|2423->1236|2494->1285|2533->1288|2548->1294|2575->1299|2630->1318|2645->1324|2682->1339|2737->1358|2752->1364|2780->1370|2835->1389|2850->1395|2884->1407|2942->1434|3235->1692|3272->1713|3312->1715|3550->1917|3618->1963|3857->2166|3869->2169|3896->2174|3935->2177|3947->2180|3975->2186|4108->2283|4120->2286|4154->2298|4334->2442|4346->2445|4381->2458|4489->2530|4501->2533|4530->2540|4645->2619|4657->2622|4690->2633|4850->2757|4862->2760|4892->2768|5036->2881|5383->3192|5398->3198|5464->3242|6013->3755|6052->3777|6093->3779|6176->3825|6192->3831|6264->3880|6304->3883|6320->3889|6348->3894|6404->3913|6420->3919|6458->3934|6514->3953|6530->3959|6559->3965|6615->3984|6631->3990|6666->4002|6725->4029|7225->4493|7267->4518|7308->4520|7391->4566|7407->4572|7486->4628|7526->4631|7542->4637|7577->4649|7633->4668|7649->4674|7694->4696|7750->4715|7766->4721|7802->4734|7858->4753|7874->4759|7916->4778|8021->4846|8037->4852|8118->4910|8371->5131|8754->5478|8787->5494|8828->5496|9067->5698|9136->5744|9376->5947|9389->5950|9417->5955|9457->5958|9470->5961|9499->5967|9633->6064|9646->6067|9681->6079|9862->6223|9875->6226|9911->6239|10020->6311|10033->6314|10063->6321|10179->6400|10192->6403|10226->6414|10387->6538|10400->6541|10431->6549|10540->6621|10556->6627|10632->6680|10977->6993|11307->7287|11348->7311|11389->7313|11603->7490|11676->7540|11916->7743|11929->7746|11961->7755|12001->7758|12014->7761|12047->7771|12181->7868|12194->7871|12233->7887|12414->8031|12427->8034|12467->8051|12576->8123|12589->8126|12623->8137|12739->8216|12752->8219|12790->8234|12951->8358|12964->8361|12999->8373|13108->8445|13124->8451|13205->8509|13555->8827|15818->11061|15848->11062|16050->11236|16079->11237|16186->11315|16216->11316|16266->11338|16295->11339|16363->11378|16393->11379|16455->11413|16484->11414|16606->11507|16636->11508|16761->11605|16790->11606|16975->11762|17005->11763|17062->11792|17091->11793|17136->11809|17166->11810|17232->11848|17261->11849|17306->11865|17336->11866|17389->11891|17418->11892|17457->11903|17486->11904|17538->11928|17567->11929|17614->11944
                    LINES: 26->1|31->3|32->4|32->4|32->4|61->33|61->33|61->33|65->37|65->37|65->37|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|70->42|79->51|79->51|79->51|85->57|85->57|92->64|92->64|92->64|92->64|92->64|92->64|95->67|95->67|95->67|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|104->76|104->76|104->76|111->83|123->95|123->95|123->95|140->112|140->112|140->112|144->116|144->116|144->116|144->116|144->116|144->116|145->117|145->117|145->117|146->118|146->118|146->118|147->119|147->119|147->119|149->121|169->141|169->141|169->141|173->145|173->145|173->145|173->145|173->145|173->145|174->146|174->146|174->146|175->147|175->147|175->147|176->148|176->148|176->148|178->150|178->150|178->150|184->156|199->171|199->171|199->171|205->177|205->177|212->184|212->184|212->184|212->184|212->184|212->184|215->187|215->187|215->187|219->191|219->191|219->191|220->192|220->192|220->192|221->193|221->193|221->193|224->196|224->196|224->196|226->198|226->198|226->198|237->209|247->219|247->219|247->219|253->225|253->225|260->232|260->232|260->232|260->232|260->232|260->232|263->235|263->235|263->235|267->239|267->239|267->239|268->240|268->240|268->240|269->241|269->241|269->241|272->244|272->244|272->244|274->246|274->246|274->246|285->257|357->329|357->329|363->335|363->335|366->338|366->338|368->340|368->340|370->342|370->342|372->344|372->344|375->347|375->347|381->353|381->353|384->356|384->356|386->358|386->358|388->360|388->360|391->363|391->363|393->365|393->365|395->367|395->367|397->369|397->369|399->371|399->371|402->374
                    -- GENERATED --
                */
            