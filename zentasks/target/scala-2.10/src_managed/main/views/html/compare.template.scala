
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
object compare extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template8[Student,List[Course],List[Job],String,String,List[FavoriteCourses],List[FavoriteJobs],Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student ,
courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses],favoriteJobs:List[FavoriteJobs])(content:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.151*/("""
"""),_display_(Seq[Any](/*3.2*/main(student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs)/*3.73*/{_display_(Seq[Any](format.raw/*3.74*/("""
<html>
<div id="menu_container" class="container">

	<div class="panel panel-primary"
		style="margin-bottom: 60px; width: 1250px">
		<div class="panel-heading">Compare Courses</div>
		<div class="panel panel-default">
			<div class="panel-body">
				<form method="GET"
					action=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.StudentOperationController.displayCourseRatings())),format.raw/*13.71*/("""">
					<div class="panel panel-default">
						<div class="panel-body">
							<table class="table" style="margin: auto;">
								<header>
									<th>First Course</th>
									<th>Second Course</th>
								</header>
								<tr>
									<td><select id="firstCourse" name="course_1"
										class="selectpicker  form-control" name="course1"
										data-live-search="true"> """),_display_(Seq[Any](/*24.37*/for(course <- courses) yield /*24.59*/ {_display_(Seq[Any](format.raw/*24.61*/("""
											<option value=""""),_display_(Seq[Any](/*25.28*/course/*25.34*/.id)),format.raw/*25.37*/("""">"""),_display_(Seq[Any](/*25.40*/course/*25.46*/.name)),format.raw/*25.51*/("""</option> """)))})),format.raw/*25.62*/("""
									</select></td>
									<td><select id="secondCourse" name="course_2"
										class="selectpicker  form-control" data-live-search="true">
											"""),_display_(Seq[Any](/*29.13*/for(course <- courses) yield /*29.35*/ {_display_(Seq[Any](format.raw/*29.37*/("""
											<option value=""""),_display_(Seq[Any](/*30.28*/course/*30.34*/.id)),format.raw/*30.37*/("""">"""),_display_(Seq[Any](/*30.40*/course/*30.46*/.name)),format.raw/*30.51*/("""</option> """)))})),format.raw/*30.62*/("""
									</select></td>
							</table>
							<div
								style="width: 100; min-height: 20px; margin: auto; padding-bottom: 15px;">
								<button id="compareCoursesButton" type="submit"
									class="btn btn-sm btn-primary"
									style="height: 30px; width: 200px">Compare</button>

							</div>
						</div>
					</div>
				</form>
				<section>"""),_display_(Seq[Any](/*43.15*/content)),format.raw/*43.22*/("""</section>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	function getUrlParameter(sParam) """),format.raw/*49.35*/("""{"""),format.raw/*49.36*/("""
		var sPageURL = window.location.search.substring(1);
		var sURLVariables = sPageURL.split('&');
		for (var i = 0; i < sURLVariables.length; i++) """),format.raw/*52.50*/("""{"""),format.raw/*52.51*/("""
			var sParameterName = sURLVariables[i].split('=');
			if (sParameterName[0] == sParam) """),format.raw/*54.37*/("""{"""),format.raw/*54.38*/("""
				return sParameterName[1];
			"""),format.raw/*56.4*/("""}"""),format.raw/*56.5*/("""
		"""),format.raw/*57.3*/("""}"""),format.raw/*57.4*/("""
	"""),format.raw/*58.2*/("""}"""),format.raw/*58.3*/("""

	$(document).ready(function() """),format.raw/*60.31*/("""{"""),format.raw/*60.32*/("""
		var course1 = getUrlParameter('course_1');
		var course2 = getUrlParameter('course_2');
		$("#firstCourse").val(course1);
		$("#secondCourse").val(course2);
	"""),format.raw/*65.2*/("""}"""),format.raw/*65.3*/(""");
</script>
</html>



""")))})),format.raw/*71.2*/("""
"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses],favoriteJobs:List[FavoriteJobs],content:Html): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs)(content)
    
    def f:((Student,List[Course],List[Job],String,String,List[FavoriteCourses],List[FavoriteJobs]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs) => (content) => apply(student,courses,jobs,course_tags,job_tags,favCourses,favoriteJobs)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 12:37:26 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/compare.scala.html
                    HASH: e16d6a6fd51ec44749b16dc77b35c0718d92e0f2
                    MATRIX: 860->1|1126->172|1163->175|1242->246|1280->247|1611->542|1626->548|1698->598|2130->994|2168->1016|2208->1018|2273->1047|2288->1053|2313->1056|2352->1059|2367->1065|2394->1070|2437->1081|2639->1247|2677->1269|2717->1271|2782->1300|2797->1306|2822->1309|2861->1312|2876->1318|2903->1323|2946->1334|3354->1706|3383->1713|3528->1830|3557->1831|3735->1981|3764->1982|3884->2074|3913->2075|3976->2111|4004->2112|4035->2116|4063->2117|4093->2120|4121->2121|4183->2155|4212->2156|4405->2322|4433->2323|4495->2354
                    LINES: 26->1|30->2|31->3|31->3|31->3|41->13|41->13|41->13|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|53->25|57->29|57->29|57->29|58->30|58->30|58->30|58->30|58->30|58->30|58->30|71->43|71->43|77->49|77->49|80->52|80->52|82->54|82->54|84->56|84->56|85->57|85->57|86->58|86->58|88->60|88->60|93->65|93->65|99->71
                    -- GENERATED --
                */
            