
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
object compare extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[Student,List[Course],List[Job],String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String)(content:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.107*/("""
"""),_display_(Seq[Any](/*2.2*/main(student,courses,jobs,course_tags,job_tags)/*2.49*/{_display_(Seq[Any](format.raw/*2.50*/("""
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
    
    def render(student:Student,courses:List[Course],jobs:List[Job],course_tags:String,job_tags:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs,course_tags,job_tags)(content)
    
    def f:((Student,List[Course],List[Job],String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs,course_tags,job_tags) => (content) => apply(student,courses,jobs,course_tags,job_tags)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 01 05:29:12 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/compare.scala.html
                    HASH: 748c8a4b7a89e6b3453a84c18976e3042ad6bfd4
                    MATRIX: 819->1|1019->106|1056->109|1111->156|1149->157|1339->312|1353->318|1409->353|1846->754|1884->776|1924->778|1988->806|2003->812|2028->815|2067->818|2082->824|2109->829|2152->840|2350->1002|2388->1024|2428->1026|2492->1054|2507->1060|2532->1063|2571->1066|2586->1072|2613->1077|2656->1088|3052->1448|3081->1455|3216->1563|3244->1564|3433->1726|3461->1727|3600->1839|3629->1840|3705->1889|3734->1890|3767->1896|3795->1897|3824->1899|3852->1900|3913->1933|3942->1934|4130->2095|4158->2096|4220->2127
                    LINES: 26->1|29->1|30->2|30->2|30->2|36->8|36->8|36->8|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|48->20|48->20|52->24|52->24|52->24|53->25|53->25|53->25|53->25|53->25|53->25|53->25|66->38|66->38|73->45|73->45|77->49|77->49|80->52|80->52|82->54|82->54|83->55|83->55|84->56|84->56|86->58|86->58|91->63|91->63|97->69
                    -- GENERATED --
                */
            