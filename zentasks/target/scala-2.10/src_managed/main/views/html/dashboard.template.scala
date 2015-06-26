
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


<div  id="menu_container" class="container">
  <ul class="nav nav-pills" style="width: 1000px">
     <li class="active"><a data-toggle="pill" href="#home">Dashboard</a></li>
    <li><a data-toggle="pill" href="#menu2">Courses</a></li>
    <li><a data-toggle="pill" href="#menu3">Jobs</a></li>
    <li><a data-toggle="pill" href="#menu4">About us</a></li>
  </ul>
  


<div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>Dashboard... actually we need there the dashboard table with news</h3>
             
	    """),_display_(Seq[Any](/*20.7*/for(job <- jobs) yield /*20.23*/ {_display_(Seq[Any](format.raw/*20.25*/("""
		   
		  <div class="panel panel-default">
		    <div class="panel-body">
		     
		     
		     <div style="float:left; width: 160px">
		       <img src="assets/images/tum.png" height="60" width="60">
		     </div>
		     <div style="float:left">
		     
		     
		       <div style="float:left; width: 500px">
		         <span class="text-title">Description</span>
		         <p>"""),_display_(Seq[Any](/*34.16*/job/*34.19*/.description)),format.raw/*34.31*/("""</p>
		       </div>
		     
		       <div style="float:left; padding-left: 30px">
		        
		       </div>
		     
		     
		     </div>
		      		      
		    </div>
		  </div>
		""")))})),format.raw/*46.4*/("""
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
		      """),_display_(Seq[Any](/*82.10*/for(course <- courses) yield /*82.32*/ {_display_(Seq[Any](format.raw/*82.34*/("""
		      <tr>
		      
		        <td><a href=""""),_display_(Seq[Any](/*85.25*/routes/*85.31*/.Application.viewCourse(course.id))),format.raw/*85.65*/("""">"""),_display_(Seq[Any](/*85.68*/course/*85.74*/.name)),format.raw/*85.79*/("""</td>
		         <td>"""),_display_(Seq[Any](/*86.17*/course/*86.23*/.professor_name)),format.raw/*86.38*/("""</td>
		          <td>"""),_display_(Seq[Any](/*87.18*/course/*87.24*/.chair)),format.raw/*87.30*/("""</td>
		           <td>"""),_display_(Seq[Any](/*88.19*/course/*88.25*/.description)),format.raw/*88.37*/("""</td>
		           <td>"""),_display_(Seq[Any](/*89.19*/course/*89.25*/.rate)),format.raw/*89.30*/("""</td>
		      </tr>
			""")))})),format.raw/*91.5*/("""
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
							         """),_display_(Seq[Any](/*110.18*/for(course <- courses) yield /*110.40*/ {_display_(Seq[Any](format.raw/*110.42*/("""
							      <option >"""),_display_(Seq[Any](/*111.24*/course/*111.30*/.name)),format.raw/*111.35*/("""</option>
							  """)))})),format.raw/*112.11*/("""
							  </select>
						  </td>
						  <td>
						     <select id="course_2" class="selectpicker  form-control" data-live-search="true">
						         """),_display_(Seq[Any](/*117.17*/for(course <- courses) yield /*117.39*/ {_display_(Seq[Any](format.raw/*117.41*/("""
						      <option>"""),_display_(Seq[Any](/*118.22*/course/*118.28*/.name)),format.raw/*118.33*/("""</option>
						  """)))})),format.raw/*119.10*/("""
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
	         
	    """),_display_(Seq[Any](/*138.7*/for(job <- jobs) yield /*138.23*/ {_display_(Seq[Any](format.raw/*138.25*/("""
		   
		  <div class="panel panel-default">
		    <div class="panel-body">
		     
		     
		     <div style="float:left; width: 160px">
		       <img src= """),_display_(Seq[Any](/*145.21*/{"assets/images/" + job.company_name + ".png"})),format.raw/*145.67*/(""">
		     </div>
		     <div style="float:left">
		     
		     
		       <div style="float:left; width: 500px">
		         <span class="text-title">Description</span>
		         <p>"""),_display_(Seq[Any](/*152.16*/job/*152.19*/.description)),format.raw/*152.31*/("""</p>
		       </div>
		     
		       <div style="float:left; padding-left: 30px">
		         <span class="text-title">Company</span>
		         <span>"""),_display_(Seq[Any](/*157.19*/job/*157.22*/.company_name)),format.raw/*157.35*/("""</span><br> 
		         <span class="text-title">Salary </span>
		         <span>"""),_display_(Seq[Any](/*159.19*/job/*159.22*/.salary)),format.raw/*159.29*/("""</span><br>
  			     <span class="text-title">Beginning Time</span>
		         <span>"""),_display_(Seq[Any](/*161.19*/job/*161.22*/.begin_time)),format.raw/*161.33*/("""</span> 
		       </div>
		     
		     
		     </div>
		      		      
		    </div>
		  </div>
		""")))})),format.raw/*169.4*/("""
		
    </div>
    
    
    
    
    <div id="menu4" class="tab-pane fade">
      <h3>About Us</h3>
      <p>CourseMatch is a team project, which was created by students as part of the Web Application Engineering<br>
         course at the Technical University Munich. As a result of the hard time finding university courses and<br>
         jobs the team decided to implement a web application for universities to make life for students easier<br>
         when it comes to choosing courses.</p>
        
      <h3>Imprint</h3>  
      <p>CourseMatch GmbH</br>
         Hauptstrasse 123</br>
         80333 Munich - Germany</p>

      <p>Contact</br>
         + 49 42-123456789</br>
         team[at]coursematch.de</p>

      <p>CourseMatch GmbH</br>
         Headquarters: Munich</br>
         Register Court: Munich HRB 102273</br>
         Ust-Ident-Nr .: DE123456789</p>

      <p>Managing Director: The CourseMatch Team</p>

      <p>Responsible for content according to § 55 II RStV: CourseMatch</br>
         © Copyright 2015-2123</br>
         CourseMatch GmbH</p>

      <p>All rights reserved.</p>

      <p>The information on this website has been carefully compiled and checked to the best of its knowledge and belief.<br>
         No guarantee or liability for the information, particularly regarding its accuracy, completeness, timeliness or<br>
         availability at any time, but can not be accepted. Any liability for damages arising from the use of the <br>
         information, is - to the extent permitted by law - excluded. The website also contains links or references to <br>
         other websites. The CourseMatch GmbH is not responsible for the content of other Web sites, it dissociates <br>
         itself and makes this content as its own. The CourseMatch GmbH reserves the right to amend without notice the<br>
         information provided, to change or remove.</p>

      <p>Privacy: The radio.de GmbH will abide strictly by the data protection regulations and only use particular<br>
         personally identifiable information such as name or e-mail address to answer or to process requests concern.</p>
        
        
        
        
        
        
        
    </div>
  </div>
</div>

<script>

$(document).ready(function() """),format.raw/*228.30*/("""{"""),format.raw/*228.31*/("""
    $('#courses').dataTable();
"""),format.raw/*230.1*/("""}"""),format.raw/*230.2*/(""" );

 
</script>
<style>

div.dropdown-menu > ul.dropdown-menu """),format.raw/*236.38*/("""{"""),format.raw/*236.39*/("""
	max-height:135px !important;
"""),format.raw/*238.1*/("""}"""),format.raw/*238.2*/("""

#courses_wrapper > div.row """),format.raw/*240.28*/("""{"""),format.raw/*240.29*/("""
	width : 1250px;
"""),format.raw/*242.1*/("""}"""),format.raw/*242.2*/("""

#courses_filter > label """),format.raw/*244.25*/("""{"""),format.raw/*244.26*/("""
	float: right;
"""),format.raw/*246.1*/("""}"""),format.raw/*246.2*/("""

#courses_filter > label > input[type="search"]"""),format.raw/*248.47*/("""{"""),format.raw/*248.48*/("""
	width : 400px !important;
"""),format.raw/*250.1*/("""}"""),format.raw/*250.2*/("""

.pagination """),format.raw/*252.13*/("""{"""),format.raw/*252.14*/("""
	top: -25px ;
  position: relative;
"""),format.raw/*255.1*/("""}"""),format.raw/*255.2*/("""

.panel-body """),format.raw/*257.13*/("""{"""),format.raw/*257.14*/("""
    padding: 5px 15px 0;
"""),format.raw/*259.1*/("""}"""),format.raw/*259.2*/("""
.panel """),format.raw/*260.8*/("""{"""),format.raw/*260.9*/("""
    margin-bottom: 3px;
"""),format.raw/*262.1*/("""}"""),format.raw/*262.2*/("""



</style>

""")))})),format.raw/*268.2*/("""

    
"""))}
    }
    
    def render(student:Student,courses:List[Course],jobs:List[Job]): play.api.templates.HtmlFormat.Appendable = apply(student,courses,jobs)
    
    def f:((Student,List[Course],List[Job]) => play.api.templates.HtmlFormat.Appendable) = (student,courses,jobs) => apply(student,courses,jobs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 27 01:00:43 CEST 2015
                    SOURCE: D:/Code/Eclipse-SEBA/Coursmatch/zentasks/app/views/dashboard.scala.html
                    HASH: 03f9b8ac587fe986230435aa0a2d92cfe00427b2
                    MATRIX: 802->1|954->59|993->64|1027->90|1065->91|1667->658|1699->674|1739->676|2173->1074|2185->1077|2219->1089|2446->1285|3489->2292|3527->2314|3567->2316|3653->2366|3668->2372|3724->2406|3763->2409|3778->2415|3805->2420|3864->2443|3879->2449|3916->2464|3976->2488|3991->2494|4019->2500|4080->2525|4095->2531|4129->2543|4190->2568|4205->2574|4232->2579|4289->2605|4938->3217|4977->3239|5018->3241|5080->3266|5096->3272|5124->3277|5178->3298|5376->3459|5415->3481|5456->3483|5516->3506|5532->3512|5560->3517|5613->3537|5929->3817|5962->3833|6003->3835|6205->4000|6274->4046|6500->4235|6513->4238|6548->4250|6742->4407|6755->4410|6791->4423|6912->4507|6925->4510|6955->4517|7081->4606|7094->4609|7128->4620|7267->4727|9633->7064|9663->7065|9725->7099|9754->7100|9852->7169|9882->7170|9943->7203|9972->7204|10032->7235|10062->7236|10110->7256|10139->7257|10196->7285|10226->7286|10272->7304|10301->7305|10379->7354|10409->7355|10467->7385|10496->7386|10541->7402|10571->7403|10639->7443|10668->7444|10713->7460|10743->7461|10799->7489|10828->7490|10865->7499|10894->7500|10949->7527|10978->7528|11030->7548
                    LINES: 26->1|29->1|31->3|31->3|31->3|48->20|48->20|48->20|62->34|62->34|62->34|74->46|110->82|110->82|110->82|113->85|113->85|113->85|113->85|113->85|113->85|114->86|114->86|114->86|115->87|115->87|115->87|116->88|116->88|116->88|117->89|117->89|117->89|119->91|138->110|138->110|138->110|139->111|139->111|139->111|140->112|145->117|145->117|145->117|146->118|146->118|146->118|147->119|166->138|166->138|166->138|173->145|173->145|180->152|180->152|180->152|185->157|185->157|185->157|187->159|187->159|187->159|189->161|189->161|189->161|197->169|256->228|256->228|258->230|258->230|264->236|264->236|266->238|266->238|268->240|268->240|270->242|270->242|272->244|272->244|274->246|274->246|276->248|276->248|278->250|278->250|280->252|280->252|283->255|283->255|285->257|285->257|287->259|287->259|288->260|288->260|290->262|290->262|296->268
                    -- GENERATED --
                */
            