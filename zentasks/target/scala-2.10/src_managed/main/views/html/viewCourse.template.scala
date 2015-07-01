
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
object viewCourse extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[Student,Course,Overallranking,List[Comment],String,List[Uploads],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , course :Course , ranking:Overallranking,comments:List[Comment],course_tags:String,uploads: List[Uploads]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.127*/("""
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

		<a href=""""),_display_(Seq[Any](/*80.13*/routes/*80.19*/.Application.dashboard())),format.raw/*80.43*/("""" id="logo"> <img src=""""),_display_(Seq[Any](/*80.67*/routes/*80.73*/.Assets.at("images/logo-white.png"))),format.raw/*80.108*/("""" height="26px">
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
					href=""""),_display_(Seq[Any](/*93.13*/routes/*93.19*/.Application.logout())),format.raw/*93.40*/("""" style="padding: 8px 5px;">
					<b style="font-family: arial; font-size: 14px"> Logout </b>
				</a>
			</dd>
		</dl>
	</header>


	<nav>
		<div style="padding: 10px 0 0 15px">
			<img src=""""),_display_(Seq[Any](/*103.15*/routes/*103.21*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*103.66*/("""" height="60px">
		</div>

		<div style="padding: 10px 0 0 0px">
			<h4 class="dashboard">Courses</h4>
			<ul class="navlist">
				<li><a href="../course/1">Introduction to software Eng.</a></li>
				<li><a href="../course/1">Introduction to software Eng.</a></li>
				<li><a href="../course/1">Introduction to software Eng.</a></li>
				<li><a href="../course/1">Introduction to software Eng.</a></li>
				<li><a href="../course/1">Introduction to software Eng.</a></li>
				<li><a href="../course/1">Introduction to software Eng.</a></li>
			</ul>
		</div>

		<div style="padding: 10px 0 0 0px">
			<h4 class="dashboard">Favorites</h4>
			<ul class="navlist">
				<li><a href="../course/1">Introduction to software Eng.</a></li>
				<li><a href="../course/1">Introduction to software Eng.</a></li>
				<li><a href="../course/1">Introduction to software Eng.</a></li>
			</ul>
		</div>

	</nav>

	        <div class="collapse" id="collapseExample" style="   position: fixed;
													  right: 0;
													  z-index: 100;
													  top: 50px;
													  width: 540px;">
			  <div class="well">
			  <form action=""""),_display_(Seq[Any](/*135.21*/routes/*135.27*/.Application.saveCourseTags())),format.raw/*135.56*/("""">
				 <div class="well">
				 <p> """),_display_(Seq[Any](/*137.11*/course/*137.17*/.name)),format.raw/*137.22*/(""" Tags:<p>
				 <input name ="course_id" value=""""),_display_(Seq[Any](/*138.39*/course/*138.45*/.id)),format.raw/*138.48*/("""" type="hidden"> 
				 <input name="course_tags" type="text" class="form-control" id="ct" value=""""),_display_(Seq[Any](/*139.81*/course_tags)),format.raw/*139.92*/("""" />
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
		<li><a href=""""),_display_(Seq[Any](/*152.17*/routes/*152.23*/.Application.dashboard())),format.raw/*152.47*/("""">Dashboard</a> <span class="divider">/</span></li>
		<li><a href=""""),_display_(Seq[Any](/*153.17*/routes/*153.23*/.Application.compareCourses())),format.raw/*153.52*/("""">CompareCourses</a> <span
			class="divider"></span></li>
	</ul>




	<div class="well well-lg"
		style="position: relative; width: 66%; left: 260; background-color: #FFFFFF; border: 0px; box-shadow: 0 0 0 rgba(0, 0, 0, 0)">

		<div style="line-height: 30px">
			<p class="coursetitle">"""),_display_(Seq[Any](/*164.28*/course/*164.34*/.name)),format.raw/*164.39*/("""
			<p>
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

		  
   		  <form method="post" action=""""),_display_(Seq[Any](/*180.37*/routes/*180.43*/.Application.uploadMaterial())),format.raw/*180.72*/("""">	 
			 
		  <div id="uploads" style="padding: 30px 0 0 0">  
		    <p class="coursesubtitle">Uploads <div style="width:100; min-height: 20px;">			
			 <button type="button" class="btn btn-sm btn-primary" data-toggle="modal" data-target="#myModal"
			 style="height: 30px; width: 200px"> Upload more... </button>
			</div><p>
			
			<div style="width:100%; min-height: 250px">
               """),_display_(Seq[Any](/*189.17*/for(upload <- uploads) yield /*189.39*/ {_display_(Seq[Any](format.raw/*189.41*/("""
                 <a href="""),_display_(Seq[Any](/*190.27*/upload/*190.33*/.content)),format.raw/*190.41*/(""" class="uploaditem">
			       <div> 
			         <div class="uploaditembox"> 
			           <img src="""),_display_(Seq[Any](/*193.25*/{"../../assets/images/" + upload.source + ".png"})),format.raw/*193.74*/(""">
			         </div>
			         <div> <span>"""),_display_(Seq[Any](/*195.26*/upload/*195.32*/.source)),format.raw/*195.39*/("""</span><span>("""),_display_(Seq[Any](/*195.54*/upload/*195.60*/.name)),format.raw/*195.65*/(""")</span> </div>
			       </div>
			     </a>
               """)))})),format.raw/*198.17*/("""               
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
                 <input type="hidden" id="course" name="course_id" value=""""),_display_(Seq[Any](/*238.76*/course/*238.82*/.id)),format.raw/*238.85*/("""" > 
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

		<form action=""""),_display_(Seq[Any](/*265.18*/routes/*265.24*/.Application.rateCourse(course.id))),format.raw/*265.58*/("""">
			<div id="rating" style="padding: 50px 0 0 0">
				<p class="coursesubtitle">Rating
				<p>
				<div style="width: 100%; height: 30px">
					<table>
						<tr>
							<td><div style="float: left; width: 300px">Fairness
									and help:</div></td>
							<td><input id="input-1" name="fair" value=""""),_display_(Seq[Any](/*274.52*/ranking/*274.59*/.fair)),format.raw/*274.64*/(""""
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
							value=""""),_display_(Seq[Any](/*288.16*/ranking/*288.23*/.material)),format.raw/*288.32*/("""" class="rating" data-min="0"
							data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">fun and
								level of interest:</div></td>
						<td><input id="input-4" name="fun" value=""""),_display_(Seq[Any](/*299.50*/ranking/*299.57*/.fun)),format.raw/*299.61*/(""""
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
						<td><input id="input-2" name="grade" value=""""),_display_(Seq[Any](/*311.52*/ranking/*311.59*/.grade)),format.raw/*311.65*/(""""
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
							value=""""),_display_(Seq[Any](/*323.16*/ranking/*323.23*/.recommend)),format.raw/*323.33*/("""" class="rating" data-min="0"
							data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>



			<div style="width: 100%; height: 30px">
				<p class="text-title">Overall Rate: """),_display_(Seq[Any](/*332.42*/ranking/*332.49*/.overall_rate)),format.raw/*332.62*/("""</p>
			</div>
			<div style="width: 100; min-height: 20px;">
				<button type="submit" class="btn btn-sm btn-primary"
					style="height: 30px; width: 200px">Rate the course</button>
			</div>
		</form>










		<!-- <button type="button" class="btn btn-sm btn-primary">Rate this course</button> -->

	</div>





		<form method="get" action=""""),_display_(Seq[Any](/*357.31*/routes/*357.37*/.Application.saveComment(course.id))),format.raw/*357.72*/("""" id="commentForm">
	<div  style="padding: 50px 0 0 0">
		<p class="coursesubtitle">Comments
		<p>
		<div class="panel panel-default">
			<ul class="list-group" id="comments">
			"""),_display_(Seq[Any](/*363.5*/for(comment <- comments) yield /*363.29*/{_display_(Seq[Any](format.raw/*363.30*/("""
				<li class="list-group-item"><p>("""),_display_(Seq[Any](/*364.38*/comment/*364.45*/.student_id)),format.raw/*364.56*/(""")</p>"""),_display_(Seq[Any](/*364.62*/comment/*364.69*/.comment)),format.raw/*364.77*/(""" </li>
			""")))})),format.raw/*365.5*/("""
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
	</div>
		</form>




	</div>
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*386.32*/("""{"""),format.raw/*386.33*/("""
				 $('#commentBtn').on('click', function(e) """),format.raw/*387.47*/("""{"""),format.raw/*387.48*/("""
				        var ul = $("#comments");
				        var li = document.createElement("li");
				        var name =document.createElement("p");
				        var comment = document.createElement("p");
				        name.appendChild(document.createTextNode("("""),_display_(Seq[Any](/*392.57*/student/*392.64*/.name)),format.raw/*392.69*/(""")"));
				        comment.appendChild(document.createTextNode(document.getElementById("comment").value));
						li.appendChild(name);
				        li.appendChild(comment);
				        li.setAttribute("class","list-group-item");
				        ul.append(li).fadeIn(3000);
				        $('#commentForm').submit();
			"""),format.raw/*399.4*/("""}"""),format.raw/*399.5*/(""");
		"""),format.raw/*400.3*/("""}"""),format.raw/*400.4*/(""");
	</script>


</body>
</html>
"""))}
    }
    
    def render(student:Student,course:Course,ranking:Overallranking,comments:List[Comment],course_tags:String,uploads:List[Uploads]): play.api.templates.HtmlFormat.Appendable = apply(student,course,ranking,comments,course_tags,uploads)
    
    def f:((Student,Course,Overallranking,List[Comment],String,List[Uploads]) => play.api.templates.HtmlFormat.Appendable) = (student,course,ranking,comments,course_tags,uploads) => apply(student,course,ranking,comments,course_tags,uploads)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 01 05:29:12 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/viewCourse.scala.html
                    HASH: e9fc5104cf48ba0142bc88030689b7b7fb0384e0
                    MATRIX: 837->1|1057->126|1121->163|1149->164|1231->220|1258->221|1297->233|1326->234|1415->296|1443->297|1487->313|1516->314|1597->368|1625->369|1661->378|1689->379|1757->420|1785->421|1828->436|1857->437|1905->458|1933->459|1984->482|2013->483|2082->525|2110->526|2166->554|2195->555|2244->577|2272->578|2316->594|2345->595|2391->614|2419->615|2554->714|2569->720|2623->752|2732->825|2747->831|2804->865|2913->938|2928->944|2985->978|4018->1975|4033->1981|4101->2026|4202->2091|4217->2097|4286->2143|4387->2208|4402->2214|4475->2264|4618->2371|4633->2377|4697->2418|4814->2499|4829->2505|4897->2550|4960->2577|4975->2583|5030->2616|5101->2651|5116->2657|5178->2697|5249->2732|5264->2738|5330->2782|6237->3653|6252->3659|6298->3683|6358->3707|6373->3713|6431->3748|6830->4112|6846->4119|6873->4124|6918->4133|6934->4140|6962->4146|7086->4234|7101->4240|7144->4261|7384->4464|7400->4470|7468->4515|8668->5678|8684->5684|8736->5713|8812->5752|8828->5758|8856->5763|8942->5812|8958->5818|8984->5821|9120->5920|9154->5931|9529->6269|9545->6275|9592->6299|9698->6368|9714->6374|9766->6403|10102->6702|10118->6708|10146->6713|10242->6772|10258->6778|10296->6793|10466->6927|10482->6933|10517->6945|10614->7005|10630->7011|10682->7040|11122->7443|11161->7465|11202->7467|11267->7495|11283->7501|11314->7509|11457->7615|11529->7664|11614->7712|11630->7718|11660->7725|11712->7740|11728->7746|11756->7751|11854->7816|14112->10037|14128->10043|14154->10046|15136->10991|15152->10997|15209->11031|15560->11345|15577->11352|15605->11357|16022->11737|16039->11744|16071->11753|16450->12095|16467->12102|16494->12106|16874->12449|16891->12456|16920->12462|17301->12806|17318->12813|17351->12823|17605->13040|17622->13047|17658->13060|18068->13433|18084->13439|18142->13474|18364->13660|18405->13684|18445->13685|18521->13724|18538->13731|18572->13742|18615->13748|18632->13755|18663->13763|18707->13775|19365->14404|19395->14405|19472->14453|19502->14454|19795->14710|19812->14717|19840->14722|20185->15039|20214->15040|20248->15046|20277->15047
                    LINES: 26->1|29->1|33->5|33->5|37->9|37->9|39->11|39->11|42->14|42->14|44->16|44->16|47->19|47->19|49->21|49->21|52->24|52->24|54->26|54->26|56->28|56->28|58->30|58->30|61->33|61->33|63->35|63->35|65->37|65->37|67->39|67->39|69->41|69->41|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|108->80|108->80|108->80|108->80|108->80|108->80|117->89|117->89|117->89|117->89|117->89|117->89|121->93|121->93|121->93|131->103|131->103|131->103|163->135|163->135|163->135|165->137|165->137|165->137|166->138|166->138|166->138|167->139|167->139|180->152|180->152|180->152|181->153|181->153|181->153|192->164|192->164|192->164|197->169|197->169|197->169|204->176|204->176|204->176|208->180|208->180|208->180|217->189|217->189|217->189|218->190|218->190|218->190|221->193|221->193|223->195|223->195|223->195|223->195|223->195|223->195|226->198|266->238|266->238|266->238|293->265|293->265|293->265|302->274|302->274|302->274|316->288|316->288|316->288|327->299|327->299|327->299|339->311|339->311|339->311|351->323|351->323|351->323|360->332|360->332|360->332|385->357|385->357|385->357|391->363|391->363|391->363|392->364|392->364|392->364|392->364|392->364|392->364|393->365|414->386|414->386|415->387|415->387|420->392|420->392|420->392|427->399|427->399|428->400|428->400
                    -- GENERATED --
                */
            