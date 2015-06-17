
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

"""),_display_(Seq[Any](/*3.2*/main(student,courses,jobs)/*3.28*/{_display_(Seq[Any](format.raw/*3.29*/("""


<div  id="menu_container"class="container">
  <ul class="nav nav-pills">
     <li class="active"><a data-toggle="pill" href="#home">Dashboard</a></li>
    <li><a data-toggle="pill" href="#menu2">Courses</a></li>
    <li><a data-toggle="pill" href="#menu3">Jobs</a></li>
    <li><a data-toggle="pill" href="#menu4">About us</a></li>
  </ul>
  


<div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>Dashboard</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
    </div>
    <div id="menu2" class="tab-pane fade">
      <h3>Courses</h3>
		  <table class="table">
		    <thead>
		      <tr>
		        <th>Name</th>
		        <th>Professor</th>
		        <th>Chair</th>
		        <th>Description</th>
		        <th>Overall Rate</th>
		      </tr>
		    </thead>
		    <tbody>
		      """),_display_(Seq[Any](/*34.10*/for(course <- courses) yield /*34.32*/ {_display_(Seq[Any](format.raw/*34.34*/("""
		      <tr>
		      
		        <td><a href=""""),_display_(Seq[Any](/*37.25*/routes/*37.31*/.Application.viewCourse(course.id))),format.raw/*37.65*/("""">"""),_display_(Seq[Any](/*37.68*/course/*37.74*/.name)),format.raw/*37.79*/("""</td>
		         <td>"""),_display_(Seq[Any](/*38.17*/course/*38.23*/.professor_name)),format.raw/*38.38*/(""" <span>"""),_display_(Seq[Any](/*38.46*/student/*38.53*/.email)),format.raw/*38.59*/("""</span></td>
		          <td>"""),_display_(Seq[Any](/*39.18*/course/*39.24*/.chair)),format.raw/*39.30*/("""</td>
		           <td>"""),_display_(Seq[Any](/*40.19*/course/*40.25*/.description)),format.raw/*40.37*/("""</td>
		           <td>"""),_display_(Seq[Any](/*41.19*/course/*41.25*/.rate)),format.raw/*41.30*/("""</td>
		      </tr>
			""")))})),format.raw/*43.5*/("""
		    </tbody>
  </table>
  </div>  
    <div id="menu3" class="tab-pane fade">
      <h3>Jobs</h3>
		       """),_display_(Seq[Any](/*49.11*/for(job <- jobs) yield /*49.27*/ {_display_(Seq[Any](format.raw/*49.29*/("""
		        <div class="panel panel-default">
		   <div class="panel-heading">"""),_display_(Seq[Any](/*51.34*/job/*51.37*/.title)),format.raw/*51.43*/("""</div>
		      <div class="panel-body">
		         <p class="text-title">Description </p>
		         <p>"""),_display_(Seq[Any](/*54.16*/job/*54.19*/.description)),format.raw/*54.31*/("""</p>
		   </div>
		   <ul class="list-group">
		      <li class="list-group-item">
			         <p class="text-title">Company </p>
		         <p>"""),_display_(Seq[Any](/*59.16*/job/*59.19*/.company_name)),format.raw/*59.32*/("""</p>
				</li>
		      <li class="list-group-item">
				<p class="text-title">Salary </p>
		         <p>"""),_display_(Seq[Any](/*63.16*/job/*63.19*/.salary)),format.raw/*63.26*/("""</p>
			</li>
		      <li class="list-group-item">
		         <p class="text-title">Beginning Time</p>
		         <p>"""),_display_(Seq[Any](/*67.16*/job/*67.19*/.begin_time)),format.raw/*67.30*/("""</p>
		      </li>
		   </ul>
		</div>
		""")))})),format.raw/*71.4*/("""
    </div>
    <div id="menu4" class="tab-pane fade">
      <h3>About Us</h3>
      <p>Course match is a group effort. It was created by students as a result of the hard time they found finding university courses and jobs.
        The team decided to implement a web application for universities to make life for students better when it comes to choosing courses.  </p>
    </div>
  </div>
</div>
    """)))})),format.raw/*80.6*/("""

    
"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job]): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs)
    
    def f:((Student,List[Course],List[Job]) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs) => apply(student,courses,jobs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 17 23:07:14 CEST 2015
                    SOURCE: C:/Users/PRASHANT/workspace/zentasks/app/views/dashboard.scala.html
                    HASH: a61373e5fea266bf12890cff042fd476a06d099d
                    MATRIX: 802->1|954->59|993->64|1027->90|1065->91|2044->1034|2082->1056|2122->1058|2208->1108|2223->1114|2279->1148|2318->1151|2333->1157|2360->1162|2419->1185|2434->1191|2471->1206|2515->1214|2531->1221|2559->1227|2626->1258|2641->1264|2669->1270|2730->1295|2745->1301|2779->1313|2840->1338|2855->1344|2882->1349|2939->1375|3092->1492|3124->1508|3164->1510|3280->1590|3292->1593|3320->1599|3464->1707|3476->1710|3510->1722|3696->1872|3708->1875|3743->1888|3888->1997|3900->2000|3929->2007|4087->2129|4099->2132|4132->2143|4209->2189|4652->2601
                    LINES: 26->1|29->1|31->3|31->3|31->3|62->34|62->34|62->34|65->37|65->37|65->37|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|71->43|77->49|77->49|77->49|79->51|79->51|79->51|82->54|82->54|82->54|87->59|87->59|87->59|91->63|91->63|91->63|95->67|95->67|95->67|99->71|108->80
                    -- GENERATED --
                */
            