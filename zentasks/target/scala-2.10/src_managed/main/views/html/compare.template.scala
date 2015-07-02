
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
object compare extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[Student,List[Course],List[Job],String,String,List[FavoriteCourses],Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student ,
courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses])(content:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.119*/("""
"""),_display_(Seq[Any](/*3.2*/main(student,courses,jobs,course_tags,job_tags,favCourses)/*3.60*/{_display_(Seq[Any](format.raw/*3.61*/("""
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
    
    def render(student:Student,courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String,favCourses:List[FavoriteCourses],content:Html): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs,course_tags,job_tags,favCourses)(content)
    
    def f:((Student,List[Course],List[Job],String,String,List[FavoriteCourses]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs,course_tags,job_tags,favCourses) => (content) => apply(student,courses,jobs,course_tags,job_tags,favCourses)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 05:45:55 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/compare.scala.html
                    HASH: 01b69043e7a6a5e1e8f8481af98ec4b61829e35a
                    MATRIX: 841->1|1075->140|1112->143|1178->201|1216->202|1547->497|1562->503|1634->553|2066->949|2104->971|2144->973|2209->1002|2224->1008|2249->1011|2288->1014|2303->1020|2330->1025|2373->1036|2575->1202|2613->1224|2653->1226|2718->1255|2733->1261|2758->1264|2797->1267|2812->1273|2839->1278|2882->1289|3290->1661|3319->1668|3464->1785|3493->1786|3671->1936|3700->1937|3820->2029|3849->2030|3912->2066|3940->2067|3971->2071|3999->2072|4029->2075|4057->2076|4119->2110|4148->2111|4341->2277|4369->2278|4431->2309
                    LINES: 26->1|30->2|31->3|31->3|31->3|41->13|41->13|41->13|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|53->25|57->29|57->29|57->29|58->30|58->30|58->30|58->30|58->30|58->30|58->30|71->43|71->43|77->49|77->49|80->52|80->52|82->54|82->54|84->56|84->56|85->57|85->57|86->58|86->58|88->60|88->60|93->65|93->65|99->71
                    -- GENERATED --
                */
            