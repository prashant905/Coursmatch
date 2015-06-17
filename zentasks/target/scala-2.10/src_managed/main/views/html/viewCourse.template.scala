
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
object viewCourse extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Student,Course,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , course :Course):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

<html>

<style>

#menu_container"""),format.raw/*7.16*/("""{"""),format.raw/*7.17*/("""
	position: relative;
	margin-top:4%;
	width:50%;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""

.nav > li """),format.raw/*13.11*/("""{"""),format.raw/*13.12*/("""
   width: 220px !important;
  text-align: center !important;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""

.text-title"""),format.raw/*18.12*/("""{"""),format.raw/*18.13*/("""
	font-style:italic;
	text-decoration: underline;
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""
    	.row"""),format.raw/*22.10*/("""{"""),format.raw/*22.11*/("""
		    margin-top:40px;
		    padding: 0 10px;
		"""),format.raw/*25.3*/("""}"""),format.raw/*25.4*/("""
		.clickable"""),format.raw/*26.13*/("""{"""),format.raw/*26.14*/("""
		    cursor: pointer;   
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/("""

		.panel-heading div """),format.raw/*30.22*/("""{"""),format.raw/*30.23*/("""
			margin-top: -18px;
			font-size: 15px;
		"""),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""
		.panel-heading div span"""),format.raw/*34.26*/("""{"""),format.raw/*34.27*/("""
			margin-left:5px;
		"""),format.raw/*36.3*/("""}"""),format.raw/*36.4*/("""
		.panel-body"""),format.raw/*37.14*/("""{"""),format.raw/*37.15*/("""
			display: none;
		"""),format.raw/*39.3*/("""}"""),format.raw/*39.4*/("""

</style>
    <head>
        <title>TUM</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*44.59*/routes/*44.65*/.Assets.at("images/favicon.png"))),format.raw/*44.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*45.70*/routes/*45.76*/.Assets.at("stylesheets/main.css"))),format.raw/*45.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*46.46*/routes/*46.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*46.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*47.46*/routes/*47.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*47.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*48.46*/routes/*48.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*48.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*49.46*/routes/*49.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*49.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*50.46*/routes/*50.52*/.Assets.at("javascripts/main.js"))),format.raw/*50.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*51.46*/routes/*51.52*/.Assets.at("javascripts/tablefilter.js"))),format.raw/*51.92*/(""""></script>
        
          <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    </head>
    <body>
        <header>
            <a href="" id="logo">TUM</a>
            <dl id="user">
                <dt>"""),_display_(Seq[Any](/*61.22*/student/*61.29*/.name)),format.raw/*61.34*/(""" <span>("""),_display_(Seq[Any](/*61.43*/student/*61.50*/.email)),format.raw/*61.56*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq[Any](/*63.31*/routes/*63.37*/.Application.logout())),format.raw/*63.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>
		            <nav>
            <h4 class="dashboard"><a href="#/">Courses</a></h4>
            
        </nav>
        
   		<div style="position: relative;
			top: 100px;
			width: 63%;
			left: 20%;" class="well well-lg">
			<div style="text-align:center;"class="container">
			<p class="text-title">Title<p>
			<p>"""),_display_(Seq[Any](/*78.8*/course/*78.14*/.name)),format.raw/*78.19*/("""</p>
			<p class="text-title">Professor<p>
			<p>"""),_display_(Seq[Any](/*80.8*/course/*80.14*/.professor_name)),format.raw/*80.29*/("""</p>
			<p style="float:right;top:-130px;position:relative" class ="text-title">Overall Rate:</p>
			<p style="float:right;top:-100px;left:35px;position:relative">"""),_display_(Seq[Any](/*82.67*/course/*82.73*/.rate)),format.raw/*82.78*/("""</p>
			</div>
			<button style="float:right;position:relative;top:-15px" type="button" class="btn-link">Rate Me</button>
		
		</div>
		
		 <div style="position: relative;
			top: 145px;
			width: 63%;
			left: 20%;" class="well well-lg">
		
		<div class="container" style="height:180px">
			<p class="text-title">Description<p>
			<p>"""),_display_(Seq[Any](/*95.8*/course/*95.14*/.description)),format.raw/*95.26*/("""</p>
		</div>
		
		<div class="container" style="height:180px">
			<p class="text-title">Uploads<p>
			<a href="#">file1.pdf</a>
			<a href="#">file2.pdf</a>
			<a href="#">file3.pdf</a>
			<button type="button" class="btn btn-sm btn-primary">upload</button>
		</div>
		
		<div "class="container" style="width:44%">
       <div class="panel panel-default">
		   <div class="panel-heading"><p class="text-title">Comments<p></div>
		      <div class="panel-body">
		   </div>
		   <ul class="list-group">
		      <li class="list-group-item"> comment1</li>
		      <li class="list-group-item"> comment2</li> 
		   	  <li class="list-group-item"> comment3</li>
		   </ul>   
		   	   <input type="text" class="form-control" id="comment"></input>
		   	   	<button type="button" class="btn btn- btn-primary" style="float:right">Comment</button>
		      </div>
		</div>
		
		</div>
		
		</body>
		</html>
        """))}
    }
    
    def render(student:Student,course:Course): play.api.templates.HtmlFormat.Appendable = apply(student,course)
    
    def f:((Student,Course) => play.api.templates.HtmlFormat.Appendable) = (student,course) => apply(student,course)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 17 23:07:14 CEST 2015
                    SOURCE: C:/Users/PRASHANT/workspace/zentasks/app/views/viewCourse.scala.html
                    HASH: f4b78350ce2f0ab00f07b9f4352054f6601feddb
                    MATRIX: 787->1|916->36|983->76|1011->77|1092->131|1120->132|1162->146|1191->147|1283->212|1311->213|1354->228|1383->229|1463->282|1491->283|1530->294|1559->295|1638->347|1666->348|1708->362|1737->363|1795->394|1823->395|1876->420|1905->421|1980->469|2008->470|2063->497|2092->498|2144->523|2172->524|2215->539|2244->540|2294->563|2322->564|2470->676|2485->682|2539->714|2648->787|2663->793|2720->827|2805->876|2820->882|2883->923|2977->981|2992->987|3060->1033|3154->1091|3169->1097|3234->1140|3328->1198|3343->1204|3406->1245|3500->1303|3515->1309|3570->1342|3664->1400|3679->1406|3741->1446|4236->1905|4252->1912|4279->1917|4324->1926|4340->1933|4368->1939|4471->2006|4486->2012|4529->2033|4969->2438|4984->2444|5011->2449|5098->2501|5113->2507|5150->2522|5352->2688|5367->2694|5394->2699|5778->3048|5793->3054|5827->3066
                    LINES: 26->1|29->1|35->7|35->7|39->11|39->11|41->13|41->13|44->16|44->16|46->18|46->18|49->21|49->21|50->22|50->22|53->25|53->25|54->26|54->26|56->28|56->28|58->30|58->30|61->33|61->33|62->34|62->34|64->36|64->36|65->37|65->37|67->39|67->39|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|89->61|89->61|89->61|89->61|89->61|89->61|91->63|91->63|91->63|106->78|106->78|106->78|108->80|108->80|108->80|110->82|110->82|110->82|123->95|123->95|123->95
                    -- GENERATED --
                */
            