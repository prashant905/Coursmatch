
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
  <ul class="nav nav-pills" style="width: 1000px">
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
      
   <div  class="container">
  <ul class="nav nav-tabs" style="width: 1250px;
  								  position: relative;
  								  margin-left: -130px;
  								  margin-top: 30px">
     <li class="active"><a data-toggle="pill" href="#view_all_courses">View All Courses</a></li>
    <li><a data-toggle="pill" href="#compare_courses">Compare Courses</a></li>
  </ul>
      
      <div class="tab-content">
   		 <div id="view_all_courses" class="tab-pane fade in active" style="  position: relative;
  			left: -134px;">
      <h3>Search Courses</h3>

		  <table id = "courses" class="table table-striped"  cellspacing="0" style="width:1250px">
		    <thead>
		      <tr>
		        <th>Name</th>
		        <th>Professor</th>
		        <th>Chair</th>
		        <th>Description</th>
		        <th>Overall Rate</th>
		      </tr>
		    </thead>
		    <tbody class="searchable">
		      """),_display_(Seq[Any](/*48.10*/for(course <- courses) yield /*48.32*/ {_display_(Seq[Any](format.raw/*48.34*/("""
		      <tr>
		      
		        <td><a href=""""),_display_(Seq[Any](/*51.25*/routes/*51.31*/.Application.viewCourse(course.id))),format.raw/*51.65*/("""">"""),_display_(Seq[Any](/*51.68*/course/*51.74*/.name)),format.raw/*51.79*/("""</td>
		         <td>"""),_display_(Seq[Any](/*52.17*/course/*52.23*/.professor_name)),format.raw/*52.38*/("""</td>
		          <td>"""),_display_(Seq[Any](/*53.18*/course/*53.24*/.chair)),format.raw/*53.30*/("""</td>
		           <td>"""),_display_(Seq[Any](/*54.19*/course/*54.25*/.description)),format.raw/*54.37*/("""</td>
		           <td>"""),_display_(Seq[Any](/*55.19*/course/*55.25*/.rate)),format.raw/*55.30*/("""</td>
		      </tr>
			""")))})),format.raw/*57.5*/("""
		    </tbody>
  </table>
  </div>
  
   <div id="compare_courses" class="tab-pane fade" style="  position: relative;
  			left: -134px;">
  			<h3>Compare Courses</h3>
  		 <div class="tab-content" style="width:1250px">
  			<div class="panel panel-default">
		      		<div class="panel-body">
		      			<table  class="table" style="display:block; margin:auto;" >
						<header>
							<th>First Course</th>
							<th>Second Course</th>
						</header>
						  <tr>
							<td>
							     <select id="course_1" class="selectpicker  form-control" data-live-search="true">
							         """),_display_(Seq[Any](/*76.18*/for(course <- courses) yield /*76.40*/ {_display_(Seq[Any](format.raw/*76.42*/("""
							      <option >"""),_display_(Seq[Any](/*77.24*/course/*77.30*/.name)),format.raw/*77.35*/("""</option>
							  """)))})),format.raw/*78.11*/("""
							  </select>
						  </td>
						  <td>
						     <select id="course_2" class="selectpicker  form-control" data-live-search="true">
						         """),_display_(Seq[Any](/*83.17*/for(course <- courses) yield /*83.39*/ {_display_(Seq[Any](format.raw/*83.41*/("""
						      <option>"""),_display_(Seq[Any](/*84.22*/course/*84.28*/.name)),format.raw/*84.33*/("""</option>
						  """)))})),format.raw/*85.10*/("""
						  	</select>
						   </td>
						  </tr>
						</table>	
						  					  
		      			</div>
  		 		</div>
  		 	</div>
  		</div>
  </div>
  </div>
  </div>  
    <div id="menu3" class="tab-pane fade">
      <h3>Jobs</h3>
		       """),_display_(Seq[Any](/*100.11*/for(job <- jobs) yield /*100.27*/ {_display_(Seq[Any](format.raw/*100.29*/("""
		        <div class="panel panel-default">
		   <div class="panel-heading">"""),_display_(Seq[Any](/*102.34*/job/*102.37*/.title)),format.raw/*102.43*/("""</div>
		      <div class="panel-body">
		         <p class="text-title">Description </p>
		         <p>"""),_display_(Seq[Any](/*105.16*/job/*105.19*/.description)),format.raw/*105.31*/("""</p>
		   </div>
		   <ul class="list-group">
		      <li class="list-group-item">
			         <p class="text-title">Company </p>
		         <p>"""),_display_(Seq[Any](/*110.16*/job/*110.19*/.company_name)),format.raw/*110.32*/("""</p>
				</li>
		      <li class="list-group-item">
				<p class="text-title">Salary </p>
		         <p>"""),_display_(Seq[Any](/*114.16*/job/*114.19*/.salary)),format.raw/*114.26*/("""</p>
			</li>
		      <li class="list-group-item">
		         <p class="text-title">Beginning Time</p>
		         <p>"""),_display_(Seq[Any](/*118.16*/job/*118.19*/.begin_time)),format.raw/*118.30*/("""</p>
		      </li>
		   </ul>
		</div>
		""")))})),format.raw/*122.4*/("""
    </div>
    <div id="menu4" class="tab-pane fade">
      <h3>About Us</h3>
      <p>Course match is a group effort. It was created by students as a result of the hard time they found finding university courses and jobs.
        The team decided to implement a web application for universities to make life for students better when it comes to choosing courses.  </p>
    </div>
  </div>
</div>

<script>

$(document).ready(function() """),format.raw/*134.30*/("""{"""),format.raw/*134.31*/("""
    $('#courses').dataTable();
"""),format.raw/*136.1*/("""}"""),format.raw/*136.2*/(""" );

 
</script>
<style>

div.dropdown-menu > ul.dropdown-menu """),format.raw/*142.38*/("""{"""),format.raw/*142.39*/("""
	max-height:135px !important;
"""),format.raw/*144.1*/("""}"""),format.raw/*144.2*/("""

#courses_wrapper > div.row """),format.raw/*146.28*/("""{"""),format.raw/*146.29*/("""
	width : 1250px;
"""),format.raw/*148.1*/("""}"""),format.raw/*148.2*/("""

#courses_filter > label """),format.raw/*150.25*/("""{"""),format.raw/*150.26*/("""
	float: right;
"""),format.raw/*152.1*/("""}"""),format.raw/*152.2*/("""

#courses_filter > label > input[type="search"]"""),format.raw/*154.47*/("""{"""),format.raw/*154.48*/("""
	width : 400px !important;
"""),format.raw/*156.1*/("""}"""),format.raw/*156.2*/("""

.pagination """),format.raw/*158.13*/("""{"""),format.raw/*158.14*/("""
	top: -25px ;
  position: relative;
"""),format.raw/*161.1*/("""}"""),format.raw/*161.2*/("""

</style>

    """)))})),format.raw/*165.6*/("""

    
"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job]): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs)
    
    def f:((Student,List[Course],List[Job]) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs) => apply(student,courses,jobs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 25 13:25:11 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/dashboard.scala.html
                    HASH: 435b5ac34a9840d23659df9528e5f559da6bbf68
                    MATRIX: 802->1|954->59|993->64|1027->90|1065->91|2692->1682|2730->1704|2770->1706|2856->1756|2871->1762|2927->1796|2966->1799|2981->1805|3008->1810|3067->1833|3082->1839|3119->1854|3179->1878|3194->1884|3222->1890|3283->1915|3298->1921|3332->1933|3393->1958|3408->1964|3435->1969|3492->1995|4140->2607|4178->2629|4218->2631|4279->2656|4294->2662|4321->2667|4374->2688|4571->2849|4609->2871|4649->2873|4708->2896|4723->2902|4750->2907|4802->2927|5093->3181|5126->3197|5167->3199|5284->3279|5297->3282|5326->3288|5471->3396|5484->3399|5519->3411|5706->3561|5719->3564|5755->3577|5901->3686|5914->3689|5944->3696|6103->3818|6116->3821|6150->3832|6228->3878|6707->4328|6737->4329|6799->4363|6828->4364|6926->4433|6956->4434|7017->4467|7046->4468|7106->4499|7136->4500|7184->4520|7213->4521|7270->4549|7300->4550|7346->4568|7375->4569|7453->4618|7483->4619|7541->4649|7570->4650|7615->4666|7645->4667|7713->4707|7742->4708|7794->4728
                    LINES: 26->1|29->1|31->3|31->3|31->3|76->48|76->48|76->48|79->51|79->51|79->51|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|83->55|83->55|83->55|85->57|104->76|104->76|104->76|105->77|105->77|105->77|106->78|111->83|111->83|111->83|112->84|112->84|112->84|113->85|128->100|128->100|128->100|130->102|130->102|130->102|133->105|133->105|133->105|138->110|138->110|138->110|142->114|142->114|142->114|146->118|146->118|146->118|150->122|162->134|162->134|164->136|164->136|170->142|170->142|172->144|172->144|174->146|174->146|176->148|176->148|178->150|178->150|180->152|180->152|182->154|182->154|184->156|184->156|186->158|186->158|189->161|189->161|193->165
                    -- GENERATED --
                */
            