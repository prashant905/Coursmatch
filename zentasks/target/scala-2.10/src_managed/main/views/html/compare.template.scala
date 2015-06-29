
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
object compare extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Student,List[Course],List[Job],Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , courses:List[Course],jobs:List[Job])(content:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.72*/("""
"""),_display_(Seq[Any](/*2.2*/main(student,courses,jobs)/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""
<html>
<div id="menu_container" class="container">
	<div class="panel panel-default">
		<div class="panel-body">
			<form method="GET"
				action=""""),_display_(Seq[Any](/*8.14*/routes/*8.20*/.Application.displayCourseRatings())),format.raw/*8.55*/("""">
				<div class="panel panel-default">
					<div class="panel-body">
						<table class="table" style="display: block; margin: auto;">
							<header>
								<th>First Course</th>
								<th>Second Course</th>
							</header>
							<tr>
								<td><select id="firstCourse" name="course_1"
									class="selectpicker  form-control" name="course1"
									data-live-search="true"> """),_display_(Seq[Any](/*19.36*/for(course <- courses) yield /*19.58*/ {_display_(Seq[Any](format.raw/*19.60*/("""
										<option value=""""),_display_(Seq[Any](/*20.27*/course/*20.33*/.id)),format.raw/*20.36*/("""">"""),_display_(Seq[Any](/*20.39*/course/*20.45*/.name)),format.raw/*20.50*/("""</option> """)))})),format.raw/*20.61*/("""
								</select></td>
								<td><select id="secondCourse" name="course_2"
									class="selectpicker  form-control" data-live-search="true">
										"""),_display_(Seq[Any](/*24.12*/for(course <- courses) yield /*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/("""
										<option value=""""),_display_(Seq[Any](/*25.27*/course/*25.33*/.id)),format.raw/*25.36*/("""">"""),_display_(Seq[Any](/*25.39*/course/*25.45*/.name)),format.raw/*25.50*/("""</option> """)))})),format.raw/*25.61*/("""
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
			<section>"""),_display_(Seq[Any](/*38.14*/content)),format.raw/*38.21*/("""</section>
		</div>
	</div>
</div>
<script type="text/javascript">

function getUrlParameter(sParam)
"""),format.raw/*45.1*/("""{"""),format.raw/*45.2*/("""
    var sPageURL = window.location.search.substring(1);
    var sURLVariables = sPageURL.split('&');
    for (var i = 0; i < sURLVariables.length; i++) 
    """),format.raw/*49.5*/("""{"""),format.raw/*49.6*/("""
        var sParameterName = sURLVariables[i].split('=');
        if (sParameterName[0] == sParam) 
        """),format.raw/*52.9*/("""{"""),format.raw/*52.10*/("""
            return sParameterName[1];
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/("""
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/("""

$(document).ready(function() """),format.raw/*58.30*/("""{"""),format.raw/*58.31*/("""
	var course1 = getUrlParameter('course_1');
	var course2 = getUrlParameter('course_2');
	$("#firstCourse").val(course1);
	$("#secondCourse").val(course2);
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/(""");
</script>
</html>



""")))})),format.raw/*69.2*/("""
"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job],content:Html): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs)(content)
    
    def f:((Student,List[Course],List[Job]) => (Html) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs) => (content) => apply(student,courses,jobs)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 29 04:56:33 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/compare.scala.html
                    HASH: bde74c9b83782cf1aa1a72c566ee9c304b81ca5c
                    MATRIX: 805->1|969->71|1006->74|1040->100|1078->101|1268->256|1282->262|1338->297|1775->698|1813->720|1853->722|1917->750|1932->756|1957->759|1996->762|2011->768|2038->773|2081->784|2279->946|2317->968|2357->970|2421->998|2436->1004|2461->1007|2500->1010|2515->1016|2542->1021|2585->1032|2981->1392|3010->1399|3145->1507|3173->1508|3362->1670|3390->1671|3529->1783|3558->1784|3634->1833|3663->1834|3696->1840|3724->1841|3753->1843|3781->1844|3842->1877|3871->1878|4059->2039|4087->2040|4149->2071
                    LINES: 26->1|29->1|30->2|30->2|30->2|36->8|36->8|36->8|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|48->20|48->20|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|53->25|66->38|66->38|73->45|73->45|77->49|77->49|80->52|80->52|82->54|82->54|83->55|83->55|84->56|84->56|86->58|86->58|91->63|91->63|97->69
                    -- GENERATED --
                */
            