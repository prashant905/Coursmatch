
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
object viewCourse extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template8[Student,Course,Overallranking,List[Comment],String,List[Uploads],List[Schedule],List[FavoriteCourses],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , course :Course , ranking:Overallranking,comments:List[Comment],course_tags:String,uploads: List[Uploads], schedules:List[Schedule],favCourses:List[FavoriteCourses]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.186*/("""
<html>

<style>
#menu_container """),format.raw/*5.17*/("""{"""),format.raw/*5.18*/("""
	position: relative;
	margin-top: 4%;
	width: 50%;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""

.nav>li """),format.raw/*11.9*/("""{"""),format.raw/*11.10*/("""
	width: 220px !important;
	text-align: center !important;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""

.text-title """),format.raw/*16.13*/("""{"""),format.raw/*16.14*/("""
	font-style: italic;
	text-decoration: underline;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

.row """),format.raw/*21.6*/("""{"""),format.raw/*21.7*/("""
	margin-top: 40px;
	padding: 0 10px;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""

.clickable """),format.raw/*26.12*/("""{"""),format.raw/*26.13*/("""
	cursor: pointer;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""

.panel-heading div """),format.raw/*30.20*/("""{"""),format.raw/*30.21*/("""
	margin-top: -18px;
	font-size: 15px;
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""

.panel-heading div span """),format.raw/*35.25*/("""{"""),format.raw/*35.26*/("""
	margin-left: 5px;
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""

.panel-body """),format.raw/*39.13*/("""{"""),format.raw/*39.14*/("""
	display: none;
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""
</style>
<head>
<title>CourseMatch</title>
 <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*45.52*/routes/*45.58*/.Assets.at("images/favicon.png"))),format.raw/*45.90*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*46.70*/routes/*46.76*/.Assets.at("stylesheets/main.css"))),format.raw/*46.110*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*47.70*/routes/*47.76*/.Assets.at("stylesheets/tags.css"))),format.raw/*47.110*/("""">

        
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.min.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">
          
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*58.53*/routes/*58.59*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*58.104*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*59.53*/routes/*59.59*/.Assets.at("javascripts/jquery.dataTables.js"))),format.raw/*59.105*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*60.53*/routes/*60.59*/.Assets.at("javascripts/jquery.dataTables.min.js"))),format.raw/*60.109*/(""""></script>
               
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*62.78*/routes/*62.84*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*62.125*/("""">
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*63.78*/routes/*63.84*/.Assets.at("stylesheets/star-rating.min.css"))),format.raw/*63.129*/("""">
        <script  src=""""),_display_(Seq[Any](/*64.24*/routes/*64.30*/.Assets.at("javascripts/tags.js"))),format.raw/*64.63*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*65.23*/routes/*65.29*/.Assets.at("javascripts/star-rating.js"))),format.raw/*65.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*66.23*/routes/*66.29*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*66.73*/(""""></script>
  		
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/bootstrap-tokenfield.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/bootstrap-tokenfield.min.js"></script>
  		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  		<script src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
  		<script src="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/js/bootstrap-select.js"></script>
</head>
<body>

	<header style="padding-top: 12px; position:fixed">

		<a href=""""),_display_(Seq[Any](/*80.13*/routes/*80.19*/.StudentOperationController.dashboard())),format.raw/*80.58*/("""" id="logo"> <img src=""""),_display_(Seq[Any](/*80.82*/routes/*80.88*/.Assets.at("images/logo-white.png"))),format.raw/*80.123*/("""" height="26px">
		</a>
				<button class="btn btn-danger" style="float: right;
  											  left: -355px;
  											   position: relative;" type="button" 
  		data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
			 Course Tags</button>
		<dl id="user">
			<dt style="padding-top: 10px">
				"""),_display_(Seq[Any](/*89.6*/student/*89.13*/.name)),format.raw/*89.18*/(""" <span>("""),_display_(Seq[Any](/*89.27*/student/*89.34*/.email)),format.raw/*89.40*/(""")</span>
			</dt>
			<dd>
				<a class="glyphicon glyphicon-off logout"
					href=""""),_display_(Seq[Any](/*93.13*/routes/*93.19*/.StudentController.logout())),format.raw/*93.46*/("""" style="padding: 8px 5px;">
					<b style="font-family: arial; font-size: 14px"> Logout </b>
				</a>
			</dd>
		</dl>
	</header>


	<nav style="position:fixed">
		<div style="padding: 10px 0 0 15px">
			<img src=""""),_display_(Seq[Any](/*103.15*/routes/*103.21*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*103.66*/("""" height="60px">
		</div>

		<div style="padding: 10px 0 0 0px">
			<h4 class="dashboard">Courses</h4>
			<ul class="navlist">
		 """),_display_(Seq[Any](/*109.5*/for(course <- favCourses) yield /*109.30*/ {_display_(Seq[Any](format.raw/*109.32*/("""
                <li>
                 <a href="""),_display_(Seq[Any](/*111.27*/{"course/" + course.course.id})),format.raw/*111.57*/(""">
                  
				<nobr> """),_display_(Seq[Any](/*113.13*/course/*113.19*/.course.name)),format.raw/*113.31*/(""" </nobr> 
                 </a>
                </li>
              """)))})),format.raw/*116.16*/("""
			</ul>
		</div>

	</nav>

	        <div class="collapse" id="collapseExample" style="   position: fixed;
													  right: 0;
													  z-index: 100;
													  top: 50px;
													  width: 540px;">
			  <div class="well">
			  <form action=""""),_display_(Seq[Any](/*128.21*/routes/*128.27*/.StudentOperationController.saveCourseTags())),format.raw/*128.71*/("""">
				 <div class="well">
				 <p> """),_display_(Seq[Any](/*130.11*/course/*130.17*/.name)),format.raw/*130.22*/(""" Tags:<p>
				 <input name ="course_id" value=""""),_display_(Seq[Any](/*131.39*/course/*131.45*/.id)),format.raw/*131.48*/("""" type="hidden"> 
				 <input name="course_tags" type="text" class="form-control" id="ct" value=""""),_display_(Seq[Any](/*132.81*/course_tags)),format.raw/*132.92*/("""" />
	 			 </div>
	 			 <button type="submit" style="  width: 100%;
  					"class="btn btn-danger">Submit</button>
 			 </form>
	 			 </div>
 			</div>
 			<script type="text/javascript">
 			$('#ct').tokenfield();
 			</script>
 			
 			
	<ul class="breadcrumb" style="margin-top: 52px; margin-left: 218px">
		<li><a href=""""),_display_(Seq[Any](/*145.17*/routes/*145.23*/.StudentOperationController.dashboard())),format.raw/*145.62*/("""">Dashboard</a> <span class="divider">/</span></li>
		<li><a href=""""),_display_(Seq[Any](/*146.17*/routes/*146.23*/.StudentOperationController.compareCourses())),format.raw/*146.67*/("""">CompareCourses</a> <span
			class="divider"></span></li>
	</ul>




	<div class="well well-lg"
		style="position: relative; width: 66%; left: 260; background-color: #FFFFFF; border: 0px; box-shadow: 0 0 0 rgba(0, 0, 0, 0)">

		<div style="line-height: 30px">
			<p class="coursetitle">"""),_display_(Seq[Any](/*157.28*/course/*157.34*/.name)),format.raw/*157.39*/("""</p>
				<p><form style=" position: relative; left: -556px;"
					action=""""),_display_(Seq[Any](/*159.15*/routes/*159.21*/.StudentOperationController.addToFavorites(course.id))),format.raw/*159.74*/("""">
					<div style="width: 100; min-height: 20px; margin: auto;">
						<button id="compareCoursesButton" type="submit"
							class="btn btn-danger" style="height: 30px; width: 200px">Add to Favorites</button>
					</div>
				</form>
			</p>
		</div>

		<div>
			<p class="">(Professor: """),_display_(Seq[Any](/*169.29*/course/*169.35*/.professor_name)),format.raw/*169.50*/(""")
			<p>
		</div>

		<div id="description" style="padding: 30px 0 0 0">
			<p class="coursesubtitle">Description
			<p>
			<p>"""),_display_(Seq[Any](/*176.8*/course/*176.14*/.description)),format.raw/*176.26*/("""</p>
		</div>
	<div id="scedule" style="padding: 30px 0 0 0">
			<p class="coursesubtitle">schedules<p>
			
			
			
          <table class="table table-striped">
           <thead>
            <tr>
             <th scope="col">Nr.</th>
             <th scope="col">Beginning</th>
             <th scope="col">Ending</th>
             <th scope="col">Room</th>
            </tr>
           </thead>
           <tbody>
           
           """),_display_(Seq[Any](/*194.13*/for((schedule, count) <- schedules zip (Stream from 1)) yield /*194.68*/ {_display_(Seq[Any](format.raw/*194.70*/("""
           <tr>
            <td>"""),_display_(Seq[Any](/*196.18*/count)),format.raw/*196.23*/("""</td>
            <td>"""),_display_(Seq[Any](/*197.18*/schedule/*197.26*/.start_date)),format.raw/*197.37*/("""</td>
            <td>"""),_display_(Seq[Any](/*198.18*/schedule/*198.26*/.end_date)),format.raw/*198.35*/("""</td>
            <td>"""),_display_(Seq[Any](/*199.18*/schedule/*199.26*/.room)),format.raw/*199.31*/("""</td>
           </tr>
           """)))})),format.raw/*201.13*/("""
           </tbody>
          </table>			
		
		</div>
		  
   		  <form method="post" action=""""),_display_(Seq[Any](/*207.37*/routes/*207.43*/.StudentOperationController.uploadMaterial())),format.raw/*207.87*/("""">	 
			 
		  <div id="uploads" style="padding: 30px 0 0 0">  
		    <p class="coursesubtitle">Uploads <div style="width:100; min-height: 20px;">			
			 <button type="button" class="btn btn-sm btn-primary" data-toggle="modal" data-target="#myModal"
			 style="height: 30px; width: 200px"> Upload more... </button>
			</div><p>
			
			<div style="width:100%; min-height: 250px">
               """),_display_(Seq[Any](/*216.17*/for(upload <- uploads) yield /*216.39*/ {_display_(Seq[Any](format.raw/*216.41*/("""
                 <a href="""),_display_(Seq[Any](/*217.27*/upload/*217.33*/.content)),format.raw/*217.41*/(""" class="uploaditem">
			       <div> 
			         <div class="uploaditembox"> 
			           <img src="""),_display_(Seq[Any](/*220.25*/{"../../assets/images/" + upload.source + ".png"})),format.raw/*220.74*/(""">
			         </div>
			         <div> <span>"""),_display_(Seq[Any](/*222.26*/upload/*222.32*/.source)),format.raw/*222.39*/("""</span><span>("""),_display_(Seq[Any](/*222.54*/upload/*222.60*/.name)),format.raw/*222.65*/(""")</span> </div>
			       </div>
			     </a>
               """)))})),format.raw/*225.17*/("""               
			</div>
						
		   </div>
		
		
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Upload new teaching material</h4>
              </div>
              <div class="modal-body">
                
               <div class="input-group" sytle="padding-top:40px">
               <span class="input-group-addon fileinput-button" id="basic-addon1"> Document </span> 
                <select class="form-control" id="source" name="uploadSource">
                 <option value="Tum">Tum</option>
                 <option value="Facebook2">Facebook</option>
                 <option value="Dropbox">Dropbox</option>
                 <option value="Google">Google</option>
                 <option value="Unistuff">Unistuff</option>
                 <option value="Pdf">Pdf</option>
                 <option value="Piazza">Moodle</option>
                 <option value="Link">Link</option>
                 <option value="Piazza">Piazza</option>
                 <option value="Tumonline">Tumonline</option>
                 <option value="Coursera">Coursera</option>
                 <option value="Github">Github</option>
                 <option value="Bitbucket">Bitbucket</option>
                </select>
               </div>
               
               <p> </p>
               
               <div class="input-group">
                 <span class="input-group-addon fileinput-button" id="basic-addon1"> Document </span>
                 <input type="text" id="content" name="uploadContent" class="form-control" placeholder="Type in the link here e.g. http://www.google.de" >
                 <input type="text" id="name" name="uploadName" class="form-control" placeholder="Type in brief name" >
                 <input type="hidden" id="course" name="course_id" value=""""),_display_(Seq[Any](/*265.76*/course/*265.82*/.id)),format.raw/*265.85*/("""" > 
                  <!--
                  <input type="file" name="files[]" multiple="" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
                  -->
               </div>
               
               
               
               
                <!--
                <span class="btn fileinput-button">
                  <i class="glyphicon glyphicon-plus"></i>
                  <span>Add file</span>
                  <input type="file" multiple="" name="files[]">
                </span> -->
               
                
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                <button type="submit" class="btn btn-primary"> Upload </button>
              </div>
            </div>
          </div>
        </div>		
		</form>

		<form action=""""),_display_(Seq[Any](/*292.18*/routes/*292.24*/.StudentOperationController.rateCourse(course.id))),format.raw/*292.73*/("""">
			<div id="rating" style="padding: 50px 0 0 0">
				<p class="coursesubtitle">Rating
				<p>
				<div style="width: 100%; height: 30px">
					<table>
						<tr>
							<td><div style="float: left; width: 300px">Fairness
									and help:</div></td>
							<td><input id="input-1" name="fair" value=""""),_display_(Seq[Any](/*301.52*/ranking/*301.59*/.fair)),format.raw/*301.64*/(""""
								class="rating" data-min="0" data-max="5" data-step="0.5"
								data-size="xs"></td>
						</tr>
					</table>
				</div>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">Material und
								understanding:</div></td>
						<td><input id="input-3" name="material"
							value=""""),_display_(Seq[Any](/*315.16*/ranking/*315.23*/.material)),format.raw/*315.32*/("""" class="rating" data-min="0"
							data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">fun and
								level of interest:</div></td>
						<td><input id="input-4" name="fun" value=""""),_display_(Seq[Any](/*326.50*/ranking/*326.57*/.fun)),format.raw/*326.61*/(""""
							class="rating" data-min="0" data-max="5" data-step="0.5"
							data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">grade and
								effort:</div></td>
						<td><input id="input-2" name="grade" value=""""),_display_(Seq[Any](/*338.52*/ranking/*338.59*/.grade)),format.raw/*338.65*/(""""
							class="rating" data-min="0" data-max="5" data-step="0.5"
							data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">recommendation:</div></td>
						<td><input id="input-2" name="recommend"
							value=""""),_display_(Seq[Any](/*350.16*/ranking/*350.23*/.recommend)),format.raw/*350.33*/("""" class="rating" data-min="0"
							data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>



			<div style="width: 100%; height: 30px">
				<p class="text-title">Overall Rate: """),_display_(Seq[Any](/*359.42*/ranking/*359.49*/.overall_rate)),format.raw/*359.62*/("""</p>
			</div>
			<div style="width: 100; min-height: 20px;">
				<button type="submit" class="btn btn-sm btn-primary"
					style="height: 30px; width: 200px">Rate the course</button>
			</div>
		</form>

		<form method="get" action=""""),_display_(Seq[Any](/*367.31*/routes/*367.37*/.StudentOperationController.saveComment(course.id))),format.raw/*367.87*/("""" id="commentForm">
	<div  style="padding: 50px 0 0 0">
		<p class="coursesubtitle">Comments
		<p>
		<div class="panel panel-default">
			<ul class="list-group" id="comments">
			"""),_display_(Seq[Any](/*373.5*/for(comment <- comments) yield /*373.29*/{_display_(Seq[Any](format.raw/*373.30*/("""
				<li class="list-group-item"><p>("""),_display_(Seq[Any](/*374.38*/comment/*374.45*/.student_id)),format.raw/*374.56*/(""")</p>"""),_display_(Seq[Any](/*374.62*/comment/*374.69*/.comment)),format.raw/*374.77*/(""" </li>
			""")))})),format.raw/*375.5*/("""
			</ul>
			<input type="text" id="comment" class="form-control"
				style="height: 70px" name="commentPlace" placeholder="Type in your comment here..."
				cols="40" rows="5" ></input>
		</div>

		<!--<button type="button" class="btn btn- btn-primary" style="float:right">Comment</button>-->
		<div style="width: 100; min-height: 20px; padding-top: 0px">
			<button type="button" id="commentBtn" class="btn btn-sm btn-primary"
				style="height: 30px; width: 200px">Comment this course</button>
		</div>
	</div>
		</form>

	</div>



	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*395.32*/("""{"""),format.raw/*395.33*/("""
				 $('#commentBtn').on('click', function(e) """),format.raw/*396.47*/("""{"""),format.raw/*396.48*/("""
				        var ul = $("#comments");
				        var li = document.createElement("li");
				        var name =document.createElement("p");
				        var comment = document.createElement("p");
				        name.appendChild(document.createTextNode("("""),_display_(Seq[Any](/*401.57*/student/*401.64*/.name)),format.raw/*401.69*/(""")"));
				        comment.appendChild(document.createTextNode(document.getElementById("comment").value));
						li.appendChild(name);
				        li.appendChild(comment);
				        li.setAttribute("class","list-group-item");
				        ul.append(li).fadeIn(3000);
				        $('#commentForm').submit();
			"""),format.raw/*408.4*/("""}"""),format.raw/*408.5*/(""");
		"""),format.raw/*409.3*/("""}"""),format.raw/*409.4*/(""");
	</script>


</body>
</html>
"""))}
    }
    
    def render(student:Student,course:Course,ranking:Overallranking,comments:List[Comment],course_tags:String,uploads:List[Uploads],schedules:List[Schedule],favCourses:List[FavoriteCourses]): play.api.templates.HtmlFormat.Appendable = apply(student,course,ranking,comments,course_tags,uploads,schedules,favCourses)
    
    def f:((Student,Course,Overallranking,List[Comment],String,List[Uploads],List[Schedule],List[FavoriteCourses]) => play.api.templates.HtmlFormat.Appendable) = (student,course,ranking,comments,course_tags,uploads,schedules,favCourses) => apply(student,course,ranking,comments,course_tags,uploads,schedules,favCourses)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 05:54:18 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/viewCourse.scala.html
                    HASH: 73be3fc6cfb50d2ba3ee9ab63c1d026eef617c1a
                    MATRIX: 874->1|1153->185|1217->222|1245->223|1327->279|1354->280|1393->292|1422->293|1511->355|1539->356|1583->372|1612->373|1693->427|1721->428|1757->437|1785->438|1853->479|1881->480|1924->495|1953->496|2001->517|2029->518|2080->541|2109->542|2178->584|2206->585|2262->613|2291->614|2340->636|2368->637|2412->653|2441->654|2487->673|2515->674|2650->773|2665->779|2719->811|2828->884|2843->890|2900->924|3009->997|3024->1003|3081->1037|4114->2034|4129->2040|4197->2085|4298->2150|4313->2156|4382->2202|4483->2267|4498->2273|4571->2323|4714->2430|4729->2436|4793->2477|4910->2558|4925->2564|4993->2609|5056->2636|5071->2642|5126->2675|5197->2710|5212->2716|5274->2756|5345->2791|5360->2797|5426->2841|6333->3712|6348->3718|6409->3757|6469->3781|6484->3787|6542->3822|6941->4186|6957->4193|6984->4198|7029->4207|7045->4214|7073->4220|7197->4308|7212->4314|7261->4341|7524->4567|7540->4573|7608->4618|7781->4755|7823->4780|7864->4782|7951->4832|8004->4862|8076->4897|8092->4903|8127->4915|8232->4987|8544->5262|8560->5268|8627->5312|8703->5351|8719->5357|8747->5362|8833->5411|8849->5417|8875->5420|9011->5519|9045->5530|9420->5868|9436->5874|9498->5913|9604->5982|9620->5988|9687->6032|10023->6331|10039->6337|10067->6342|10181->6419|10197->6425|10273->6478|10609->6777|10625->6783|10663->6798|10833->6932|10849->6938|10884->6950|11380->7409|11452->7464|11493->7466|11566->7502|11594->7507|11655->7531|11673->7539|11707->7550|11768->7574|11786->7582|11818->7591|11879->7615|11897->7623|11925->7628|11995->7665|12134->7767|12150->7773|12217->7817|12657->8220|12696->8242|12737->8244|12802->8272|12818->8278|12849->8286|12992->8392|13064->8441|13149->8489|13165->8495|13195->8502|13247->8517|13263->8523|13291->8528|13389->8593|15647->10814|15663->10820|15689->10823|16671->11768|16687->11774|16759->11823|17110->12137|17127->12144|17155->12149|17572->12529|17589->12536|17621->12545|18000->12887|18017->12894|18044->12898|18424->13241|18441->13248|18470->13254|18851->13598|18868->13605|18901->13615|19155->13832|19172->13839|19208->13852|19488->14095|19504->14101|19577->14151|19799->14337|19840->14361|19880->14362|19956->14401|19973->14408|20007->14419|20050->14425|20067->14432|20098->14440|20142->14452|20791->15072|20821->15073|20898->15121|20928->15122|21221->15378|21238->15385|21266->15390|21611->15707|21640->15708|21674->15714|21703->15715
                    LINES: 26->1|29->1|33->5|33->5|37->9|37->9|39->11|39->11|42->14|42->14|44->16|44->16|47->19|47->19|49->21|49->21|52->24|52->24|54->26|54->26|56->28|56->28|58->30|58->30|61->33|61->33|63->35|63->35|65->37|65->37|67->39|67->39|69->41|69->41|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|108->80|108->80|108->80|108->80|108->80|108->80|117->89|117->89|117->89|117->89|117->89|117->89|121->93|121->93|121->93|131->103|131->103|131->103|137->109|137->109|137->109|139->111|139->111|141->113|141->113|141->113|144->116|156->128|156->128|156->128|158->130|158->130|158->130|159->131|159->131|159->131|160->132|160->132|173->145|173->145|173->145|174->146|174->146|174->146|185->157|185->157|185->157|187->159|187->159|187->159|197->169|197->169|197->169|204->176|204->176|204->176|222->194|222->194|222->194|224->196|224->196|225->197|225->197|225->197|226->198|226->198|226->198|227->199|227->199|227->199|229->201|235->207|235->207|235->207|244->216|244->216|244->216|245->217|245->217|245->217|248->220|248->220|250->222|250->222|250->222|250->222|250->222|250->222|253->225|293->265|293->265|293->265|320->292|320->292|320->292|329->301|329->301|329->301|343->315|343->315|343->315|354->326|354->326|354->326|366->338|366->338|366->338|378->350|378->350|378->350|387->359|387->359|387->359|395->367|395->367|395->367|401->373|401->373|401->373|402->374|402->374|402->374|402->374|402->374|402->374|403->375|423->395|423->395|424->396|424->396|429->401|429->401|429->401|436->408|436->408|437->409|437->409
                    -- GENERATED --
                */
            