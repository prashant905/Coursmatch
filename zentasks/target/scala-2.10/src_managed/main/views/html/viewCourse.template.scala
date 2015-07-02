
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
    
    def render(student:Student,course:Course,ranking:Overallranking,comments:List[Comment],course_tags:String,uploads:List[Uploads],schedules:List[Schedule],favCourses:List[FavoriteCourses],favoriteJobs:List[FavoriteJobs]): play.api.templates.HtmlFormat.Appendable = apply(student,course,ranking,comments,course_tags,uploads,schedules,favCourses,favoriteJobs)
    
    def f:((Student,Course,Overallranking,List[Comment],String,List[Uploads],List[Schedule],List[FavoriteCourses],List[FavoriteJobs]) => play.api.templates.HtmlFormat.Appendable) = (student,course,ranking,comments,course_tags,uploads,schedules,favCourses,favoriteJobs) => apply(student,course,ranking,comments,course_tags,uploads,schedules,favCourses,favoriteJobs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 12:51:10 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/viewCourse.scala.html
                    HASH: af80bf9e223b1447c218338a5f4f5e4a989e23b7
                    MATRIX: 893->1|1204->217|1268->254|1296->255|1378->311|1405->312|1444->324|1473->325|1562->387|1590->388|1634->404|1663->405|1744->459|1772->460|1808->469|1836->470|1904->511|1932->512|1975->527|2004->528|2052->549|2080->550|2131->573|2160->574|2229->616|2257->617|2313->645|2342->646|2391->668|2419->669|2463->685|2492->686|2538->705|2566->706|2701->805|2716->811|2770->843|2879->916|2894->922|2951->956|3060->1029|3075->1035|3132->1069|4165->2066|4180->2072|4248->2117|4349->2182|4364->2188|4433->2234|4534->2299|4549->2305|4622->2355|4765->2462|4780->2468|4844->2509|4961->2590|4976->2596|5044->2641|5107->2668|5122->2674|5177->2707|5248->2742|5263->2748|5325->2788|5396->2823|5411->2829|5477->2873|6384->3744|6399->3750|6460->3789|6520->3813|6535->3819|6593->3854|6992->4218|7008->4225|7035->4230|7080->4239|7096->4246|7124->4252|7248->4340|7263->4346|7312->4373|7575->4599|7591->4605|7659->4650|7832->4787|7874->4812|7915->4814|8002->4864|8055->4894|8127->4929|8143->4935|8178->4947|8283->5019|8595->5294|8611->5300|8678->5344|8754->5383|8770->5389|8798->5394|8884->5443|8900->5449|8926->5452|9062->5551|9096->5562|9471->5900|9487->5906|9549->5945|9655->6014|9671->6020|9738->6064|10074->6363|10090->6369|10118->6374|10232->6451|10248->6457|10324->6510|10660->6809|10676->6815|10714->6830|10884->6964|10900->6970|10935->6982|11431->7441|11503->7496|11544->7498|11617->7534|11645->7539|11706->7563|11724->7571|11758->7582|11819->7606|11837->7614|11869->7623|11930->7647|11948->7655|11976->7660|12046->7697|12185->7799|12201->7805|12268->7849|12708->8252|12747->8274|12788->8276|12853->8304|12869->8310|12900->8318|13043->8424|13115->8473|13200->8521|13216->8527|13246->8534|13298->8549|13314->8555|13342->8560|13440->8625|15698->10846|15714->10852|15740->10855|16722->11800|16738->11806|16810->11855|17161->12169|17178->12176|17206->12181|17623->12561|17640->12568|17672->12577|18051->12919|18068->12926|18095->12930|18475->13273|18492->13280|18521->13286|18902->13630|18919->13637|18952->13647|19206->13864|19223->13871|19259->13884|19539->14127|19555->14133|19628->14183|19850->14369|19891->14393|19931->14394|20007->14433|20024->14440|20058->14451|20101->14457|20118->14464|20149->14472|20193->14484|20842->15104|20872->15105|20949->15153|20979->15154|21272->15410|21289->15417|21317->15422|21662->15739|21691->15740|21725->15746|21754->15747
                    LINES: 26->1|29->1|33->5|33->5|37->9|37->9|39->11|39->11|42->14|42->14|44->16|44->16|47->19|47->19|49->21|49->21|52->24|52->24|54->26|54->26|56->28|56->28|58->30|58->30|61->33|61->33|63->35|63->35|65->37|65->37|67->39|67->39|69->41|69->41|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|108->80|108->80|108->80|108->80|108->80|108->80|117->89|117->89|117->89|117->89|117->89|117->89|121->93|121->93|121->93|131->103|131->103|131->103|137->109|137->109|137->109|139->111|139->111|141->113|141->113|141->113|144->116|156->128|156->128|156->128|158->130|158->130|158->130|159->131|159->131|159->131|160->132|160->132|173->145|173->145|173->145|174->146|174->146|174->146|185->157|185->157|185->157|187->159|187->159|187->159|197->169|197->169|197->169|204->176|204->176|204->176|222->194|222->194|222->194|224->196|224->196|225->197|225->197|225->197|226->198|226->198|226->198|227->199|227->199|227->199|229->201|235->207|235->207|235->207|244->216|244->216|244->216|245->217|245->217|245->217|248->220|248->220|250->222|250->222|250->222|250->222|250->222|250->222|253->225|293->265|293->265|293->265|320->292|320->292|320->292|329->301|329->301|329->301|343->315|343->315|343->315|354->326|354->326|354->326|366->338|366->338|366->338|378->350|378->350|378->350|387->359|387->359|387->359|395->367|395->367|395->367|401->373|401->373|401->373|402->374|402->374|402->374|402->374|402->374|402->374|403->375|423->395|423->395|424->396|424->396|429->401|429->401|429->401|436->408|436->408|437->409|437->409
                    -- GENERATED --
                */
            