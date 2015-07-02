
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
object viewCourse extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template9[Student,Course,Overallranking,List[Comment],String,List[Uploads],List[Schedule],List[FavoriteCourses],List[FavoriteJobs],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , course :Course , ranking:Overallranking,comments:List[Comment],course_tags:String,uploads: List[Uploads], schedules:List[Schedule],favCourses:List[FavoriteCourses],favoriteJobs:List[FavoriteJobs]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.218*/("""
<html>

<style>
#menu_container """),format.raw/*5.17*/("""{"""),format.raw/*5.18*/("""
	position: relative;
	margin-top: 4%;
	width: 50%;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""

.posFixed"""),format.raw/*11.10*/("""{"""),format.raw/*11.11*/("""
  position:fixed;
  z-index: 1000;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""

.nav>li """),format.raw/*16.9*/("""{"""),format.raw/*16.10*/("""
	width: 220px !important;
	text-align: center !important;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

.text-title """),format.raw/*21.13*/("""{"""),format.raw/*21.14*/("""
	font-style: italic;
	text-decoration: underline;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""

.row """),format.raw/*26.6*/("""{"""),format.raw/*26.7*/("""
	margin-top: 40px;
	padding: 0 10px;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""

.clickable """),format.raw/*31.12*/("""{"""),format.raw/*31.13*/("""
	cursor: pointer;
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""

.panel-heading div """),format.raw/*35.20*/("""{"""),format.raw/*35.21*/("""
	margin-top: -18px;
	font-size: 15px;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

.panel-heading div span """),format.raw/*40.25*/("""{"""),format.raw/*40.26*/("""
	margin-left: 5px;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

.panel-body """),format.raw/*44.13*/("""{"""),format.raw/*44.14*/("""
	display: none;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""
</style>
<head>
<title>CourseMatch</title>
 <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*50.52*/routes/*50.58*/.Assets.at("images/favicon.png"))),format.raw/*50.90*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*51.70*/routes/*51.76*/.Assets.at("stylesheets/main.css"))),format.raw/*51.110*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*52.70*/routes/*52.76*/.Assets.at("stylesheets/tags.css"))),format.raw/*52.110*/("""">

        
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.min.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">
          
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*63.53*/routes/*63.59*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*63.104*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*64.53*/routes/*64.59*/.Assets.at("javascripts/jquery.dataTables.js"))),format.raw/*64.105*/(""""></script>
               <script type="text/javascript" src=""""),_display_(Seq[Any](/*65.53*/routes/*65.59*/.Assets.at("javascripts/jquery.dataTables.min.js"))),format.raw/*65.109*/(""""></script>
               
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*67.78*/routes/*67.84*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*67.125*/("""">
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*68.78*/routes/*68.84*/.Assets.at("stylesheets/star-rating.min.css"))),format.raw/*68.129*/("""">
        <script  src=""""),_display_(Seq[Any](/*69.24*/routes/*69.30*/.Assets.at("javascripts/tags.js"))),format.raw/*69.63*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*70.23*/routes/*70.29*/.Assets.at("javascripts/star-rating.js"))),format.raw/*70.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*71.23*/routes/*71.29*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*71.73*/(""""></script>
  		
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

		<a href=""""),_display_(Seq[Any](/*85.13*/routes/*85.19*/.StudentOperationController.dashboard())),format.raw/*85.58*/("""" id="logo"> <img src=""""),_display_(Seq[Any](/*85.82*/routes/*85.88*/.Assets.at("images/logo-white.png"))),format.raw/*85.123*/("""" height="26px">
		</a>
				<button class="btn btn-danger" style="float: right;
  											  left: -355px;
  											   position: relative;" type="button" 
  		data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
			 Course Tags</button>
		<dl id="user">
			<dt style="padding-top: 10px">
				"""),_display_(Seq[Any](/*94.6*/student/*94.13*/.name)),format.raw/*94.18*/(""" <span>("""),_display_(Seq[Any](/*94.27*/student/*94.34*/.email)),format.raw/*94.40*/(""")</span>
			</dt>
			<dd>
				<a class="glyphicon glyphicon-off logout"
					href=""""),_display_(Seq[Any](/*98.13*/routes/*98.19*/.StudentController.logout())),format.raw/*98.46*/("""" style="padding: 8px 5px;">
					<b style="font-family: arial; font-size: 14px"> Logout </b>
				</a>
			</dd>
		</dl>
	</header>


	<nav class="posFixed">
		<div style="padding: 10px 0 0 15px">
			<img src=""""),_display_(Seq[Any](/*108.15*/routes/*108.21*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*108.66*/("""" height="60px">
		</div>

		<div style="padding: 10px 0 0 0px">
			<h4 class="dashboard">Courses</h4>
			<ul class="navlist">
		 """),_display_(Seq[Any](/*114.5*/for(course <- favCourses) yield /*114.30*/ {_display_(Seq[Any](format.raw/*114.32*/("""
                <li>
                 <a href="""),_display_(Seq[Any](/*116.27*/{"course/" + course.course.id})),format.raw/*116.57*/(""">
                  
				<nobr> """),_display_(Seq[Any](/*118.13*/course/*118.19*/.course.name)),format.raw/*118.31*/(""" </nobr> 
                 </a>
                </li>
              """)))})),format.raw/*121.16*/("""
			</ul>
		</div>
	  <div style="padding: 10px 0 0 0px">
             <h4 class="dashboard">
                Jobs
             </h4>
             <ul class="navlist">
              """),_display_(Seq[Any](/*129.16*/for(job <- favoriteJobs) yield /*129.40*/ {_display_(Seq[Any](format.raw/*129.42*/("""
                <li>
                 <a href="""),_display_(Seq[Any](/*131.27*/job/*131.30*/.job.link)),format.raw/*131.39*/(""" target="_blank">
				<nobr> """),_display_(Seq[Any](/*132.13*/job/*132.16*/.job.title)),format.raw/*132.26*/(""" </nobr> 
                 </a>
                </li>
                </ul>
              """)))})),format.raw/*136.16*/("""
            </div>
	</nav>

	        <div class="collapse" id="collapseExample" style="   position: fixed;
													  right: 0;
													  z-index: 100;
													  top: 50px;
													  width: 540px;">
			  <div class="well">
			  <form action=""""),_display_(Seq[Any](/*146.21*/routes/*146.27*/.StudentOperationController.saveCourseTags())),format.raw/*146.71*/("""">
				 <div class="well">
				 <p> """),_display_(Seq[Any](/*148.11*/course/*148.17*/.name)),format.raw/*148.22*/(""" Tags:<p>
				 <input name ="course_id" value=""""),_display_(Seq[Any](/*149.39*/course/*149.45*/.id)),format.raw/*149.48*/("""" type="hidden"> 
				 <input name="course_tags" type="text" class="form-control" id="ct" value=""""),_display_(Seq[Any](/*150.81*/course_tags)),format.raw/*150.92*/("""" />
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
		<li><a href=""""),_display_(Seq[Any](/*163.17*/routes/*163.23*/.StudentOperationController.dashboard())),format.raw/*163.62*/("""">Dashboard</a> <span class="divider">/</span></li>
		<li><a href=""""),_display_(Seq[Any](/*164.17*/routes/*164.23*/.StudentOperationController.compareCourses())),format.raw/*164.67*/("""">CompareCourses</a> <span
			class="divider"></span></li>
	</ul>




	<div class="well well-lg"
		style="position: relative; width: 66%; left: 260; background-color: #FFFFFF; border: 0px; box-shadow: 0 0 0 rgba(0, 0, 0, 0)">

		<div style="line-height: 30px">
			<p class="coursetitle">"""),_display_(Seq[Any](/*175.28*/course/*175.34*/.name)),format.raw/*175.39*/("""</p>
				<p><form style=" position: relative; left: -373px;"
					action=""""),_display_(Seq[Any](/*177.15*/routes/*177.21*/.StudentOperationController.addToFavorites(course.id))),format.raw/*177.74*/("""">
					<div style="width: 100; min-height: 20px; margin: auto;">
						<button id="compareCoursesButton" type="submit"
							class="btn btn-danger" style="height: 30px; width: 200px">Add to Favorites</button>
					</div>
				</form>
			</p>
		</div>

		<div>
			<p class="">(Professor: """),_display_(Seq[Any](/*187.29*/course/*187.35*/.professor_name)),format.raw/*187.50*/(""")
			<p>
		</div>

		<div id="description" style="padding: 30px 0 0 0">
			<p class="coursesubtitle">Description
			<p>
			<p>"""),_display_(Seq[Any](/*194.8*/course/*194.14*/.description)),format.raw/*194.26*/("""</p>
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
           
           """),_display_(Seq[Any](/*212.13*/for((schedule, count) <- schedules zip (Stream from 1)) yield /*212.68*/ {_display_(Seq[Any](format.raw/*212.70*/("""
           <tr>
            <td>"""),_display_(Seq[Any](/*214.18*/count)),format.raw/*214.23*/("""</td>
            <td>"""),_display_(Seq[Any](/*215.18*/schedule/*215.26*/.start_date)),format.raw/*215.37*/("""</td>
            <td>"""),_display_(Seq[Any](/*216.18*/schedule/*216.26*/.end_date)),format.raw/*216.35*/("""</td>
            <td>"""),_display_(Seq[Any](/*217.18*/schedule/*217.26*/.room)),format.raw/*217.31*/("""</td>
           </tr>
           """)))})),format.raw/*219.13*/("""
           </tbody>
          </table>			
		
		</div>
		  
   		  <form method="post" action=""""),_display_(Seq[Any](/*225.37*/routes/*225.43*/.StudentOperationController.uploadMaterial())),format.raw/*225.87*/("""">	 
			 
		  <div id="uploads" style="padding: 30px 0 0 0">  
		    <p class="coursesubtitle">Uploads <div style="width:100; min-height: 20px;">			
			 <button type="button" class="btn btn-sm btn-primary" data-toggle="modal" data-target="#myModal"
			 style="height: 30px; width: 200px"> Upload more... </button>
			</div><p>
			
			<div style="width:100%; min-height: 250px">
               """),_display_(Seq[Any](/*234.17*/for(upload <- uploads) yield /*234.39*/ {_display_(Seq[Any](format.raw/*234.41*/("""
                 <a href="""),_display_(Seq[Any](/*235.27*/upload/*235.33*/.content)),format.raw/*235.41*/(""" class="uploaditem">
			       <div> 
			         <div class="uploaditembox"> 
			           <img src="""),_display_(Seq[Any](/*238.25*/{"../../assets/images/" + upload.source + ".png"})),format.raw/*238.74*/(""">
			         </div>
			         <div> <span>"""),_display_(Seq[Any](/*240.26*/upload/*240.32*/.source)),format.raw/*240.39*/("""</span><span>("""),_display_(Seq[Any](/*240.54*/upload/*240.60*/.name)),format.raw/*240.65*/(""")</span> </div>
			       </div>
			     </a>
               """)))})),format.raw/*243.17*/("""               
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
                 <input type="hidden" id="course" name="course_id" value=""""),_display_(Seq[Any](/*282.76*/course/*282.82*/.id)),format.raw/*282.85*/("""" > 
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

		<form action=""""),_display_(Seq[Any](/*309.18*/routes/*309.24*/.StudentOperationController.rateCourse(course.id))),format.raw/*309.73*/("""">
			<div id="rating" style="padding: 50px 0 0 0">
				<p class="coursesubtitle">Rating
				<p>
				<div style="width: 100%; height: 30px">
					<table>
						<tr>
							<td><div style="float: left; width: 300px">Fairness
									and help:</div></td>
							<td><input id="input-1" name="fair" value=""""),_display_(Seq[Any](/*318.52*/ranking/*318.59*/.fair)),format.raw/*318.64*/(""""
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
							value=""""),_display_(Seq[Any](/*332.16*/ranking/*332.23*/.material)),format.raw/*332.32*/("""" class="rating" data-min="0"
							data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">fun and
								level of interest:</div></td>
						<td><input id="input-4" name="fun" value=""""),_display_(Seq[Any](/*343.50*/ranking/*343.57*/.fun)),format.raw/*343.61*/(""""
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
						<td><input id="input-2" name="grade" value=""""),_display_(Seq[Any](/*355.52*/ranking/*355.59*/.grade)),format.raw/*355.65*/(""""
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
							value=""""),_display_(Seq[Any](/*367.16*/ranking/*367.23*/.recommend)),format.raw/*367.33*/("""" class="rating" data-min="0"
							data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>



			<div style="width: 100%; height: 30px">
				<p class="text-title">Overall Rate: """),_display_(Seq[Any](/*376.42*/ranking/*376.49*/.overall_rate)),format.raw/*376.62*/("""</p>
			</div>
			<div style="width: 100; min-height: 20px;">
				<button type="submit" class="btn btn-sm btn-primary"
					style="height: 30px; width: 200px">Rate the course</button>
			</div>
		</form>

		<form method="get" action=""""),_display_(Seq[Any](/*384.31*/routes/*384.37*/.StudentOperationController.saveComment(course.id))),format.raw/*384.87*/("""" id="commentForm">
	<div  style="padding: 50px 0 0 0">
		<p class="coursesubtitle">Comments
		<p>
		<div class="panel panel-default">
			<ul class="list-group" id="comments">
			"""),_display_(Seq[Any](/*390.5*/for(comment <- comments) yield /*390.29*/{_display_(Seq[Any](format.raw/*390.30*/("""
				<li class="list-group-item"><p>("""),_display_(Seq[Any](/*391.38*/comment/*391.45*/.student_id)),format.raw/*391.56*/(""")</p>"""),_display_(Seq[Any](/*391.62*/comment/*391.69*/.comment)),format.raw/*391.77*/(""" </li>
			""")))})),format.raw/*392.5*/("""
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
		$(document).ready(function() """),format.raw/*412.32*/("""{"""),format.raw/*412.33*/("""
				 $('#commentBtn').on('click', function(e) """),format.raw/*413.47*/("""{"""),format.raw/*413.48*/("""
				        var ul = $("#comments");
				        var li = document.createElement("li");
				        var name =document.createElement("p");
				        var comment = document.createElement("p");
				        name.appendChild(document.createTextNode("("""),_display_(Seq[Any](/*418.57*/student/*418.64*/.name)),format.raw/*418.69*/(""")"));
				        comment.appendChild(document.createTextNode(document.getElementById("comment").value));
						li.appendChild(name);
				        li.appendChild(comment);
				        li.setAttribute("class","list-group-item");
				        ul.append(li).fadeIn(3000);
				        $('#commentForm').submit();
			"""),format.raw/*425.4*/("""}"""),format.raw/*425.5*/(""");
		"""),format.raw/*426.3*/("""}"""),format.raw/*426.4*/(""");
	</script>


</body>
</html>
"""))}
    }
    
    def render(student:Student,course:Course,ranking:Overallranking,comments:List[Comment],course_tags:String,uploads:List[Uploads],schedules:List[Schedule],favCourses:List[FavoriteCourses],favoriteJobs:List[FavoriteJobs]): play.api.templates.HtmlFormat.Appendable = apply(student,course,ranking,comments,course_tags,uploads,schedules,favCourses,favoriteJobs)
    
    def f:((Student,Course,Overallranking,List[Comment],String,List[Uploads],List[Schedule],List[FavoriteCourses],List[FavoriteJobs]) => play.api.templates.HtmlFormat.Appendable) = (student,course,ranking,comments,course_tags,uploads,schedules,favCourses,favoriteJobs) => apply(student,course,ranking,comments,course_tags,uploads,schedules,favCourses,favoriteJobs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 23:04:26 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/viewCourse.scala.html
                    HASH: c7a37797fc7b963ea810e34eee6bfa6210d6e7bd
                    MATRIX: 893->1|1204->217|1268->254|1296->255|1378->311|1405->312|1446->325|1475->326|1541->365|1569->366|1608->378|1637->379|1726->441|1754->442|1798->458|1827->459|1908->513|1936->514|1972->523|2000->524|2068->565|2096->566|2139->581|2168->582|2216->603|2244->604|2295->627|2324->628|2393->670|2421->671|2477->699|2506->700|2555->722|2583->723|2627->739|2656->740|2702->759|2730->760|2865->859|2880->865|2934->897|3043->970|3058->976|3115->1010|3224->1083|3239->1089|3296->1123|4329->2120|4344->2126|4412->2171|4513->2236|4528->2242|4597->2288|4698->2353|4713->2359|4786->2409|4929->2516|4944->2522|5008->2563|5125->2644|5140->2650|5208->2695|5271->2722|5286->2728|5341->2761|5412->2796|5427->2802|5489->2842|5560->2877|5575->2883|5641->2927|6548->3798|6563->3804|6624->3843|6684->3867|6699->3873|6757->3908|7156->4272|7172->4279|7199->4284|7244->4293|7260->4300|7288->4306|7412->4394|7427->4400|7476->4427|7733->4647|7749->4653|7817->4698|7990->4835|8032->4860|8073->4862|8160->4912|8213->4942|8285->4977|8301->4983|8336->4995|8441->5067|8669->5258|8710->5282|8751->5284|8838->5334|8851->5337|8883->5346|8951->5377|8964->5380|8997->5390|9125->5485|9435->5758|9451->5764|9518->5808|9594->5847|9610->5853|9638->5858|9724->5907|9740->5913|9766->5916|9902->6015|9936->6026|10311->6364|10327->6370|10389->6409|10495->6478|10511->6484|10578->6528|10914->6827|10930->6833|10958->6838|11072->6915|11088->6921|11164->6974|11500->7273|11516->7279|11554->7294|11724->7428|11740->7434|11775->7446|12271->7905|12343->7960|12384->7962|12457->7998|12485->8003|12546->8027|12564->8035|12598->8046|12659->8070|12677->8078|12709->8087|12770->8111|12788->8119|12816->8124|12886->8161|13025->8263|13041->8269|13108->8313|13548->8716|13587->8738|13628->8740|13693->8768|13709->8774|13740->8782|13883->8888|13955->8937|14040->8985|14056->8991|14086->8998|14138->9013|14154->9019|14182->9024|14280->9089|16487->11259|16503->11265|16529->11268|17511->12213|17527->12219|17599->12268|17950->12582|17967->12589|17995->12594|18412->12974|18429->12981|18461->12990|18840->13332|18857->13339|18884->13343|19264->13686|19281->13693|19310->13699|19691->14043|19708->14050|19741->14060|19995->14277|20012->14284|20048->14297|20328->14540|20344->14546|20417->14596|20639->14782|20680->14806|20720->14807|20796->14846|20813->14853|20847->14864|20890->14870|20907->14877|20938->14885|20982->14897|21631->15517|21661->15518|21738->15566|21768->15567|22061->15823|22078->15830|22106->15835|22451->16152|22480->16153|22514->16159|22543->16160
                    LINES: 26->1|29->1|33->5|33->5|37->9|37->9|39->11|39->11|42->14|42->14|44->16|44->16|47->19|47->19|49->21|49->21|52->24|52->24|54->26|54->26|57->29|57->29|59->31|59->31|61->33|61->33|63->35|63->35|66->38|66->38|68->40|68->40|70->42|70->42|72->44|72->44|74->46|74->46|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|113->85|113->85|113->85|113->85|113->85|113->85|122->94|122->94|122->94|122->94|122->94|122->94|126->98|126->98|126->98|136->108|136->108|136->108|142->114|142->114|142->114|144->116|144->116|146->118|146->118|146->118|149->121|157->129|157->129|157->129|159->131|159->131|159->131|160->132|160->132|160->132|164->136|174->146|174->146|174->146|176->148|176->148|176->148|177->149|177->149|177->149|178->150|178->150|191->163|191->163|191->163|192->164|192->164|192->164|203->175|203->175|203->175|205->177|205->177|205->177|215->187|215->187|215->187|222->194|222->194|222->194|240->212|240->212|240->212|242->214|242->214|243->215|243->215|243->215|244->216|244->216|244->216|245->217|245->217|245->217|247->219|253->225|253->225|253->225|262->234|262->234|262->234|263->235|263->235|263->235|266->238|266->238|268->240|268->240|268->240|268->240|268->240|268->240|271->243|310->282|310->282|310->282|337->309|337->309|337->309|346->318|346->318|346->318|360->332|360->332|360->332|371->343|371->343|371->343|383->355|383->355|383->355|395->367|395->367|395->367|404->376|404->376|404->376|412->384|412->384|412->384|418->390|418->390|418->390|419->391|419->391|419->391|419->391|419->391|419->391|420->392|440->412|440->412|441->413|441->413|446->418|446->418|446->418|453->425|453->425|454->426|454->426
                    -- GENERATED --
                */
            