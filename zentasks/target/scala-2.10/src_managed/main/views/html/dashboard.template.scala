
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
object dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template8[List[Course],List[Job],Student,List[Course],List[Job],String,String,List[FavoriteCourses],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(matchedCourses:List[Course],matchJobs:List[Job],student: Student ,
courses: List[Course],
jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*3.84*/("""
"""),_display_(Seq[Any](/*4.2*/main(student,courses,jobs,course_tags,job_tags,favCourses)/*4.60*/{_display_(Seq[Any](format.raw/*4.61*/("""


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

							<td><a href=""""),_display_(Seq[Any](/*36.22*/routes/*36.28*/.StudentOperationController.viewCourse(course.id))),format.raw/*36.77*/("""">"""),_display_(Seq[Any](/*36.80*/course/*36.86*/.name)),format.raw/*36.91*/("""</td>
							<td>"""),_display_(Seq[Any](/*37.13*/course/*37.19*/.professor_name)),format.raw/*37.34*/("""</td>
							<td>"""),_display_(Seq[Any](/*38.13*/course/*38.19*/.chair)),format.raw/*38.25*/("""</td>
							<td>"""),_display_(Seq[Any](/*39.13*/course/*39.19*/.description)),format.raw/*39.31*/("""</td>
						</tr>
						""")))})),format.raw/*41.8*/("""
					</tbody>
				</table>
			</div>
			<div class="panel panel-primary">
				<div class="panel-heading">Recommended Jobs</div>
				<table id="jobs" class="table table-striped" cellspacing="0">
					<th></th>
					<tbody class="searchable">
						"""),_display_(Seq[Any](/*50.8*/for(job <- jobs) yield /*50.24*/ {_display_(Seq[Any](format.raw/*50.26*/("""
						<tr>
							<td>
								<div class="panel panel-default" style="margin-top: 10px">
									<div class="panel-body">
										<div style="float: left; width: 160px">
											<img src="""),_display_(Seq[Any](/*56.22*/{"assets/images/" + job.company_name + ".png"})),format.raw/*56.68*/(""">
										</div>
										<div style="float: left">

											<div style="float: left; width: 500px">
												<span class="text-title">Title</span>
												<p>
													<a href=""""),_display_(Seq[Any](/*63.24*/job/*63.27*/.link)),format.raw/*63.32*/("""">"""),_display_(Seq[Any](/*63.35*/job/*63.38*/.title)),format.raw/*63.44*/("""</a>
												</p>
												<span class="text-title">Description</span>
												<p>"""),_display_(Seq[Any](/*66.17*/job/*66.20*/.description)),format.raw/*66.32*/("""</p>
											</div>

											<div style="float: left; padding-left: 30px">
												<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*70.60*/job/*70.63*/.company_name)),format.raw/*70.76*/("""</span><br>
												<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*71.60*/job/*71.63*/.salary)),format.raw/*71.70*/("""</span><br>
												<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*72.67*/job/*72.70*/.begin_date)),format.raw/*72.81*/("""</span><br>

												<span class="text-title"><b>Contact:</b></span> <span
													style="padding-right: 15px">"""),_display_(Seq[Any](/*75.43*/job/*75.46*/.contact)),format.raw/*75.54*/("""</span>
											</div>
										</div>
									</div>
								</div>
							</td>
						</tr>
						""")))})),format.raw/*82.8*/("""
					</tbody>
				</table>
			</div>
		</div>

		<div id="menu2" class="tab-pane fade">

			<h3></h3>
			<div class="panel panel-primary" style="margin-bottom: 60px;">
				<div class="panel-heading">Search Courses</div>
				<form style="top: -36px; position: relative; left: -345px;"
					action=""""),_display_(Seq[Any](/*94.15*/routes/*94.21*/.StudentOperationController.compareCourses())),format.raw/*94.65*/("""">
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
						"""),_display_(Seq[Any](/*111.8*/for(course <- courses) yield /*111.30*/ {_display_(Seq[Any](format.raw/*111.32*/("""
						<tr>

							<td><a href=""""),_display_(Seq[Any](/*114.22*/routes/*114.28*/.StudentOperationController.viewCourse(course.id))),format.raw/*114.77*/("""">"""),_display_(Seq[Any](/*114.80*/course/*114.86*/.name)),format.raw/*114.91*/("""</td>
							<td>"""),_display_(Seq[Any](/*115.13*/course/*115.19*/.professor_name)),format.raw/*115.34*/("""</td>
							<td>"""),_display_(Seq[Any](/*116.13*/course/*116.19*/.chair)),format.raw/*116.25*/("""</td>
							<td>"""),_display_(Seq[Any](/*117.13*/course/*117.19*/.description)),format.raw/*117.31*/("""</td>
						</tr>
						""")))})),format.raw/*119.8*/("""
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
						"""),_display_(Seq[Any](/*139.8*/for(course <- favCourses) yield /*139.33*/ {_display_(Seq[Any](format.raw/*139.35*/("""
						<tr>

							<td><a href=""""),_display_(Seq[Any](/*142.22*/routes/*142.28*/.StudentOperationController.viewCourse(course.course.id))),format.raw/*142.84*/("""">"""),_display_(Seq[Any](/*142.87*/course/*142.93*/.course.name)),format.raw/*142.105*/("""</td>
							<td>"""),_display_(Seq[Any](/*143.13*/course/*143.19*/.course.professor_name)),format.raw/*143.41*/("""</td>
							<td>"""),_display_(Seq[Any](/*144.13*/course/*144.19*/.course.chair)),format.raw/*144.32*/("""</td>
							<td>"""),_display_(Seq[Any](/*145.13*/course/*145.19*/.course.description)),format.raw/*145.38*/("""</td>
							<td></a> <a class="glyphicon  logout"
														href=""""),_display_(Seq[Any](/*147.22*/routes/*147.28*/.StudentOperationController.removeFromFavorites(course.id))),format.raw/*147.86*/(""""
														style="background: none; box-shadow: none; padding: 8px 5px;">
														<b style="font-family: arial; color: red; font-size: 14px">
															Remove from Favorites </b>
													</a></td>
						</tr>
						""")))})),format.raw/*153.8*/("""
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
						"""),_display_(Seq[Any](/*168.8*/for(job <- jobs) yield /*168.24*/ {_display_(Seq[Any](format.raw/*168.26*/("""
						<tr>
							<td>
								<div class="panel panel-default" style="margin-top: 10px">
									<div class="panel-body">
										<div style="float: left; width: 160px">
											<img src="""),_display_(Seq[Any](/*174.22*/{"assets/images/" + job.company_name + ".png"})),format.raw/*174.68*/(""">
										</div>
										<div style="float: left">

											<div style="float: left; width: 500px">
												<span class="text-title">Title</span>
												<p>
													<a href=""""),_display_(Seq[Any](/*181.24*/job/*181.27*/.link)),format.raw/*181.32*/("""">"""),_display_(Seq[Any](/*181.35*/job/*181.38*/.title)),format.raw/*181.44*/("""</a>
												</p>
												<span class="text-title">Description</span>
												<p>"""),_display_(Seq[Any](/*184.17*/job/*184.20*/.description)),format.raw/*184.32*/("""</p>
											</div>

											<div style="float: left; padding-left: 30px">
												<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*188.60*/job/*188.63*/.company_name)),format.raw/*188.76*/("""</span><br>
												<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*189.60*/job/*189.63*/.salary)),format.raw/*189.70*/("""</span><br>
												<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*190.67*/job/*190.70*/.begin_date)),format.raw/*190.81*/("""</span><br>

												<span class="text-title"><b>Contact:</b></span> <span
													style="padding-right: 15px">"""),_display_(Seq[Any](/*193.43*/job/*193.46*/.contact)),format.raw/*193.54*/("""</span>
											</div>
										</div>
									</div>
								</div>
							</td>
						</tr>
						""")))})),format.raw/*200.8*/("""
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
	$(document).ready(function() """),format.raw/*273.31*/("""{"""),format.raw/*273.32*/("""
		$('#favoriteCourses').dataTable();
		$('#courses').dataTable();
		$('#recommendedCourses').dataTable();
		$('#jobs').dataTable();
	"""),format.raw/*278.2*/("""}"""),format.raw/*278.3*/(""");
</script>
<style>
#recommendedCourses_wrapper,#favoriteCourses_wrapper """),format.raw/*281.54*/("""{"""),format.raw/*281.55*/("""
	margin-top: 30px;
"""),format.raw/*283.1*/("""}"""),format.raw/*283.2*/("""

div.dropdown-menu>ul.dropdown-menu """),format.raw/*285.36*/("""{"""),format.raw/*285.37*/("""
	max-height: 135px !important;
"""),format.raw/*287.1*/("""}"""),format.raw/*287.2*/("""


#recommendedCourses_filter>label , #courses_filter>label , #favoriteCourses_filter>label"""),format.raw/*290.89*/("""{"""),format.raw/*290.90*/("""
	float: right;
	position: relative;
	top: -66px;
	margin-right: 5px;
	color: transparent;
"""),format.raw/*296.1*/("""}"""),format.raw/*296.2*/("""

#courses_filter>label>input[type="search"], #recommendedCourses_filter>label>input[type="search"], #favoriteCourses_filter>label>input[type="search"] """),format.raw/*298.151*/("""{"""),format.raw/*298.152*/("""
	width: 400px !important;
"""),format.raw/*300.1*/("""}"""),format.raw/*300.2*/("""

.pagination """),format.raw/*302.13*/("""{"""),format.raw/*302.14*/("""
	top: -25px;
	position: relative;
"""),format.raw/*305.1*/("""}"""),format.raw/*305.2*/("""

.panel-body """),format.raw/*307.13*/("""{"""),format.raw/*307.14*/("""
	padding: 5px 15px 0;
"""),format.raw/*309.1*/("""}"""),format.raw/*309.2*/("""

.panel """),format.raw/*311.8*/("""{"""),format.raw/*311.9*/("""
	margin-bottom: 3px;
"""),format.raw/*313.1*/("""}"""),format.raw/*313.2*/("""
</style>

""")))})),format.raw/*316.2*/("""
"""))}
    }
    
    def render(matchedCourses:List[Course],matchJobs:List[Job],student:Student,courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses]): play.api.templates.HtmlFormat.Appendable = apply(matchedCourses,matchJobs,student,courses,jobs,course_tags,job_tags,favCourses)
    
    def f:((List[Course],List[Job],Student,List[Course],List[Job],String,String,List[FavoriteCourses]) => play.api.templates.HtmlFormat.Appendable) = (matchedCourses,matchJobs,student,courses,jobs,course_tags,job_tags,favCourses) => apply(matchedCourses,matchJobs,student,courses,jobs,course_tags,job_tags,favCourses)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 05:45:56 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/dashboard.scala.html
                    HASH: f1d2cb5125eb5b287d7a41b9ae9361b5ea767838
                    MATRIX: 861->1|1131->177|1168->180|1234->238|1272->239|2176->1108|2221->1137|2261->1139|2334->1176|2349->1182|2420->1231|2459->1234|2474->1240|2501->1245|2556->1264|2571->1270|2608->1285|2663->1304|2678->1310|2706->1316|2761->1335|2776->1341|2810->1353|2868->1380|3161->1638|3193->1654|3233->1656|3471->1858|3539->1904|3778->2107|3790->2110|3817->2115|3856->2118|3868->2121|3896->2127|4029->2224|4041->2227|4075->2239|4255->2383|4267->2386|4302->2399|4410->2471|4422->2474|4451->2481|4566->2560|4578->2563|4611->2574|4771->2698|4783->2701|4813->2709|4957->2822|5304->3133|5319->3139|5385->3183|5934->3696|5973->3718|6014->3720|6088->3757|6104->3763|6176->3812|6216->3815|6232->3821|6260->3826|6316->3845|6332->3851|6370->3866|6426->3885|6442->3891|6471->3897|6527->3916|6543->3922|6578->3934|6637->3961|7143->4431|7185->4456|7226->4458|7300->4495|7316->4501|7395->4557|7435->4560|7451->4566|7487->4578|7543->4597|7559->4603|7604->4625|7660->4644|7676->4650|7712->4663|7768->4682|7784->4688|7826->4707|7937->4781|7953->4787|8034->4845|8309->5088|8698->5441|8731->5457|8772->5459|9011->5661|9080->5707|9320->5910|9333->5913|9361->5918|9401->5921|9414->5924|9443->5930|9577->6027|9590->6030|9625->6042|9806->6186|9819->6189|9855->6202|9964->6274|9977->6277|10007->6284|10123->6363|10136->6366|10170->6377|10331->6501|10344->6504|10375->6512|10520->6625|12785->8861|12815->8862|12982->9001|13011->9002|13117->9079|13147->9080|13197->9102|13226->9103|13294->9142|13324->9143|13386->9177|13415->9178|13538->9272|13568->9273|13693->9370|13722->9371|13906->9525|13937->9526|13994->9555|14023->9556|14068->9572|14098->9573|14164->9611|14193->9612|14238->9628|14268->9629|14321->9654|14350->9655|14389->9666|14418->9667|14470->9691|14499->9692|14546->9707
                    LINES: 26->1|31->3|32->4|32->4|32->4|61->33|61->33|61->33|64->36|64->36|64->36|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|69->41|78->50|78->50|78->50|84->56|84->56|91->63|91->63|91->63|91->63|91->63|91->63|94->66|94->66|94->66|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|103->75|103->75|103->75|110->82|122->94|122->94|122->94|139->111|139->111|139->111|142->114|142->114|142->114|142->114|142->114|142->114|143->115|143->115|143->115|144->116|144->116|144->116|145->117|145->117|145->117|147->119|167->139|167->139|167->139|170->142|170->142|170->142|170->142|170->142|170->142|171->143|171->143|171->143|172->144|172->144|172->144|173->145|173->145|173->145|175->147|175->147|175->147|181->153|196->168|196->168|196->168|202->174|202->174|209->181|209->181|209->181|209->181|209->181|209->181|212->184|212->184|212->184|216->188|216->188|216->188|217->189|217->189|217->189|218->190|218->190|218->190|221->193|221->193|221->193|228->200|301->273|301->273|306->278|306->278|309->281|309->281|311->283|311->283|313->285|313->285|315->287|315->287|318->290|318->290|324->296|324->296|326->298|326->298|328->300|328->300|330->302|330->302|333->305|333->305|335->307|335->307|337->309|337->309|339->311|339->311|341->313|341->313|344->316
                    -- GENERATED --
                */
            