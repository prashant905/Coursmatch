
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
object viewCourse extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Student,Course,Overallranking,List[Comment],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , course :Course , ranking:Overallranking,comments:List[Comment]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.85*/("""
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
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*45.51*/routes/*45.57*/.Assets.at("images/favicon.png"))),format.raw/*45.89*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*47.9*/routes/*47.15*/.Assets.at("stylesheets/main.css"))),format.raw/*47.49*/("""">
<script type="text/javascript" src=""""),_display_(Seq[Any](/*48.38*/routes/*48.44*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*48.89*/(""""></script>
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*50.9*/routes/*50.15*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*50.56*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*52.9*/routes/*52.15*/.Assets.at("stylesheets/star-rating.min.css"))),format.raw/*52.60*/("""">

<script src=""""),_display_(Seq[Any](/*54.15*/routes/*54.21*/.Assets.at("javascripts/star-rating.js"))),format.raw/*54.61*/(""""></script>
<script src=""""),_display_(Seq[Any](/*55.15*/routes/*55.21*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*55.65*/(""""></script>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>

	<header style="padding-top: 12px">

		<a href="/dashboard" id="logo"> <img src=""""),_display_(Seq[Any](/*68.46*/routes/*68.52*/.Assets.at("images/logo-white.png"))),format.raw/*68.87*/("""" height="26px">
		</a>

		<dl id="user">
			<dt style="padding-top: 10px">
				"""),_display_(Seq[Any](/*73.6*/student/*73.13*/.name)),format.raw/*73.18*/(""" <span>("""),_display_(Seq[Any](/*73.27*/student/*73.34*/.email)),format.raw/*73.40*/(""")</span>
			</dt>
			<dd>
				<a class="glyphicon glyphicon-off logout"
					href=""""),_display_(Seq[Any](/*77.13*/routes/*77.19*/.Application.logout())),format.raw/*77.40*/("""" style="padding: 8px 5px;">
					<b style="font-family: arial; font-size: 14px"> Logout </b>
				</a>
			</dd>
		</dl>
	</header>


	<nav>
		<div style="padding: 10px 0 0 15px">
			<img src=""""),_display_(Seq[Any](/*87.15*/routes/*87.21*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*87.66*/("""" height="60px">
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


	<ul class="breadcrumb" style="margin-top: 52px; margin-left: 218px">
		<li><a href="dashboard">Dashboard</a> <span class="divider">/</span></li>
		<li><a href="compareCourses">CompareCourses</a> <span
			class="divider">/</span></li>
	</ul>




	<div class="well well-lg"
		style="position: relative; width: 66%; left: 260; background-color: #FFFFFF; border: 0px; box-shadow: 0 0 0 rgba(0, 0, 0, 0)">

		<div style="line-height: 30px">
			<p class="coursetitle">"""),_display_(Seq[Any](/*127.28*/course/*127.34*/.name)),format.raw/*127.39*/("""
			<p>
		</div>

		<div>
			<p class="">(Professor: """),_display_(Seq[Any](/*132.29*/course/*132.35*/.professor_name)),format.raw/*132.50*/(""")
			<p>
		</div>

		<div id="description" style="padding: 30px 0 0 0">
			<p class="coursesubtitle">Description
			<p>
			<p>"""),_display_(Seq[Any](/*139.8*/course/*139.14*/.description)),format.raw/*139.26*/("""</p>
		</div>

		<div id="uploads" style="padding: 30px 0 0 0">
			<p class="coursesubtitle">Uploads
			<p>
			<div style="width: 100%; min-height: 250px">

				<a href="google.de" style="float: left; padding-right: 30px">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*150.19*/routes/*150.25*/.Assets.at("images/tum.png"))),format.raw/*150.53*/("""">
						</div>
						<div>TU München</div>
					</div>
				</a> <a href="google.de" class="uploaditem">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*157.19*/routes/*157.25*/.Assets.at("images/unistuff.png"))),format.raw/*157.58*/("""">
						</div>
						<div>Unistuff</div>
					</div>
				</a> <a href="google.de" class="uploaditem">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*164.19*/routes/*164.25*/.Assets.at("images/dropbox.png"))),format.raw/*164.57*/("""">
						</div>
						<div>Dropbox</div>
					</div>
				</a> <a href="google.de" class="uploaditem">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*171.19*/routes/*171.25*/.Assets.at("images/pdf.png"))),format.raw/*171.53*/("""">
						</div>
						<div>Student-Summary.pdf</div>
					</div>
				</a> <a href="google.de" class="uploaditem">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*178.19*/routes/*178.25*/.Assets.at("images/moodle.png"))),format.raw/*178.56*/("""">
						</div>
						<div>Moodle</div>
					</div>
				</a> <a href="google.de" class="uploaditem">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*185.19*/routes/*185.25*/.Assets.at("images/facebook.png"))),format.raw/*185.58*/("""">
						</div>
						<div>Facebook Group</div>
					</div>
				</a> <a href="google.de" class="uploaditem">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*192.19*/routes/*192.25*/.Assets.at("images/pdf.png"))),format.raw/*192.53*/("""">
						</div>
						<div>Student-Summary2.pdf</div>
					</div>
				</a> <a href="google.de" class="uploaditem">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*199.19*/routes/*199.25*/.Assets.at("images/link.png"))),format.raw/*199.54*/("""">
						</div>
						<div>Link</div>
					</div>
				</a> <a href="google.de" class="uploaditem">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*206.19*/routes/*206.25*/.Assets.at("images/piazza.png"))),format.raw/*206.56*/("""">
						</div>
						<div>Piazza</div>
					</div>
				</a> <a href="google.de" class="uploaditem">
					<div>
						<div class="uploaditembox">
							<img src=""""),_display_(Seq[Any](/*213.19*/routes/*213.25*/.Assets.at("images/tumonline.png"))),format.raw/*213.59*/("""">
						</div>
						<div>TumOnline</div>
					</div>
				</a>

			</div>

			<div style="width: 100; min-height: 20px;">
				<button type="button" class="btn btn-sm btn-primary"
					data-toggle="modal" data-target="#myModal"
					style="height: 30px; width: 200px">Upload more...</button>
			</div>

		</div>


		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">Upload new teaching
							material</h4>
					</div>
					<div class="modal-body">

						<div class="input-group">
							<span class="input-group-addon fileinput-button"
								id="basic-addon1"> Document </span> <input type="file"
								name="files[]" multiple="" class="form-control"
								placeholder="Username" aria-describedby="basic-addon1">
						</div>

						<span class="btn fileinput-button"> <i
							class="glyphicon glyphicon-plus"></i> <span>Add file</span> <input
							type="file" multiple="" name="files[]">
						</span>

						<div class="row">
							<div class="col-lg-6">
								<div class="input-group">
									<div class="input-group-btn">
										<button type="button" class="btn btn-default dropdown-toggle"
											data-toggle="dropdown" aria-haspopup="true"
											aria-expanded="false">
											Action <span class="caret"></span>
										</button>
										<ul class="dropdown-menu">
											<li><a href="#">TumOnline</a></li>
											<li><a href="#">Unistuff</a></li>
											<li><a href="#">Dropbox</a></li>
											<li><a href="#">Link</a></li>
											<li><a href="#">Sonstiges</a></li>
										</ul>
									</div>
									<!-- /btn-group -->
									<input type="text" class="form-control" aria-label="...">
								</div>
								<!-- /input-group -->
							</div>
							<!-- /.col-lg-6 -->
						</div>


					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
						<button type="button" class="btn btn-primary">Upload</button>
					</div>
				</div>
			</div>
		</div>

		"""),_display_(Seq[Any](/*291.4*/(course :Course ,ranking :Overallranking))),format.raw/*291.45*/("""
		<form action=""""),_display_(Seq[Any](/*292.18*/routes/*292.24*/.Application.rateCourse(course.id))),format.raw/*292.58*/("""">
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










		<!-- <button type="button" class="btn btn-sm btn-primary">Rate this course</button> -->

	</div>





		<form method="get" action=""""),_display_(Seq[Any](/*384.31*/routes/*384.37*/.Application.saveComment(course.id))),format.raw/*384.72*/("""" id="commentForm">
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
	</div>
		</form>




	</div>
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*413.32*/("""{"""),format.raw/*413.33*/("""
				 $('#commentBtn').on('click', function(e) """),format.raw/*414.47*/("""{"""),format.raw/*414.48*/("""
				        var ul = $("#comments");
				        var li = document.createElement("li");
				        var name =document.createElement("p");
				        var comment = document.createElement("p");
				        name.appendChild(document.createTextNode("("""),_display_(Seq[Any](/*419.57*/student/*419.64*/.name)),format.raw/*419.69*/(""")"));
				        comment.appendChild(document.createTextNode(document.getElementById("comment").value));
						li.appendChild(name);
				        li.appendChild(comment);
				        li.setAttribute("class","list-group-item");
				        ul.append(li).fadeIn(3000);
				        $('#commentForm').submit();
			"""),format.raw/*426.4*/("""}"""),format.raw/*426.5*/(""");
		"""),format.raw/*427.3*/("""}"""),format.raw/*427.4*/(""");
	</script>


</body>
</html>
"""))}
    }
    
    def render(student:Student,course:Course,ranking:Overallranking,comments:List[Comment]): play.api.templates.HtmlFormat.Appendable = apply(student,course,ranking,comments)
    
    def f:((Student,Course,Overallranking,List[Comment]) => play.api.templates.HtmlFormat.Appendable) = (student,course,ranking,comments) => apply(student,course,ranking,comments)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 29 05:16:15 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/viewCourse.scala.html
                    HASH: b410b331ce20187b96cf6d55b91f75a57f2d54dc
                    MATRIX: 816->1|993->84|1057->121|1085->122|1167->178|1194->179|1233->191|1262->192|1351->254|1379->255|1423->271|1452->272|1533->326|1561->327|1597->336|1625->337|1693->378|1721->379|1764->394|1793->395|1841->416|1869->417|1920->440|1949->441|2018->483|2046->484|2102->512|2131->513|2180->535|2208->536|2252->552|2281->553|2327->572|2355->573|2489->671|2504->677|2558->709|2660->776|2675->782|2731->816|2808->857|2823->863|2890->908|3001->984|3016->990|3079->1031|3181->1098|3196->1104|3263->1149|3319->1169|3334->1175|3396->1215|3459->1242|3474->1248|3540->1292|3984->1700|3999->1706|4056->1741|4177->1827|4193->1834|4220->1839|4265->1848|4281->1855|4309->1861|4433->1949|4448->1955|4491->1976|4730->2179|4745->2185|4812->2230|6251->3632|6267->3638|6295->3643|6391->3702|6407->3708|6445->3723|6615->3857|6631->3863|6666->3875|7000->4172|7016->4178|7067->4206|7279->4381|7295->4387|7351->4420|7561->4593|7577->4599|7632->4631|7841->4803|7857->4809|7908->4837|8129->5021|8145->5027|8199->5058|8407->5229|8423->5235|8479->5268|8695->5447|8711->5453|8762->5481|8984->5666|9000->5672|9052->5701|9258->5870|9274->5876|9328->5907|9536->6078|9552->6084|9609->6118|12089->8562|12153->8603|12209->8622|12225->8628|12282->8662|12633->8976|12650->8983|12678->8988|13095->9368|13112->9375|13144->9384|13523->9726|13540->9733|13567->9737|13947->10080|13964->10087|13993->10093|14374->10437|14391->10444|14424->10454|14678->10671|14695->10678|14731->10691|15141->11064|15157->11070|15215->11105|15437->11291|15478->11315|15518->11316|15594->11355|15611->11362|15645->11373|15688->11379|15705->11386|15736->11394|15780->11406|16438->12035|16468->12036|16545->12084|16575->12085|16868->12341|16885->12348|16913->12353|17258->12670|17287->12671|17321->12677|17350->12678
                    LINES: 26->1|29->1|33->5|33->5|37->9|37->9|39->11|39->11|42->14|42->14|44->16|44->16|47->19|47->19|49->21|49->21|52->24|52->24|54->26|54->26|56->28|56->28|58->30|58->30|61->33|61->33|63->35|63->35|65->37|65->37|67->39|67->39|69->41|69->41|73->45|73->45|73->45|75->47|75->47|75->47|76->48|76->48|76->48|78->50|78->50|78->50|80->52|80->52|80->52|82->54|82->54|82->54|83->55|83->55|83->55|96->68|96->68|96->68|101->73|101->73|101->73|101->73|101->73|101->73|105->77|105->77|105->77|115->87|115->87|115->87|155->127|155->127|155->127|160->132|160->132|160->132|167->139|167->139|167->139|178->150|178->150|178->150|185->157|185->157|185->157|192->164|192->164|192->164|199->171|199->171|199->171|206->178|206->178|206->178|213->185|213->185|213->185|220->192|220->192|220->192|227->199|227->199|227->199|234->206|234->206|234->206|241->213|241->213|241->213|319->291|319->291|320->292|320->292|320->292|329->301|329->301|329->301|343->315|343->315|343->315|354->326|354->326|354->326|366->338|366->338|366->338|378->350|378->350|378->350|387->359|387->359|387->359|412->384|412->384|412->384|418->390|418->390|418->390|419->391|419->391|419->391|419->391|419->391|419->391|420->392|441->413|441->413|442->414|442->414|447->419|447->419|447->419|454->426|454->426|455->427|455->427
                    -- GENERATED --
                */
            