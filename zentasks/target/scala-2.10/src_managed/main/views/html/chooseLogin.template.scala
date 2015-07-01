
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
object chooseLogin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<html>
<head>
<title>Course Match Login</title>
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*5.51*/routes/*5.57*/.Assets.at(" images/favicon.png"))),format.raw/*5.90*/(""""/>
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*7.9*/routes/*7.15*/.Assets.at("stylesheets/login.css"))),format.raw/*7.50*/("""">
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.6.3.min.js"></script>
<script type="text/javascript"
	src="http://malsup.github.io/jquery.cycle.all.js"></script>

<script>
	$(document).ready(function() """),format.raw/*14.31*/("""{"""),format.raw/*14.32*/("""
		$('#slideshow').cycle("""),format.raw/*15.25*/("""{"""),format.raw/*15.26*/("""
			fx : 'fade',
			pager : '#smallnav',
			pause : 1,
			speed : 2800,
			timeout : 4500
		"""),format.raw/*21.3*/("""}"""),format.raw/*21.4*/(""");
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/(""");
</script>

</head>
<body>

	<div id="slideshow">
		<img src="http://www.in.tum.de/typo3temp/pics/d0b40b3dab.jpg"
			class="bgM" /> <img
			src="https://upload.wikimedia.org/wikipedia/commons/4/40/TUM.-.Parabelrutsche1.jpg"
			class="bgM" />
	</div>
	<header style="padding-top: 10px">
		<a href="" id="logo"> <img src=""""),_display_(Seq[Any](/*35.36*/routes/*35.42*/.Assets.at("images/logo-white.png"))),format.raw/*35.77*/("""" height="30px">
		</a>
	</header>
	<form>
		<h1 style="height: 50px">
			<img src=""""),_display_(Seq[Any](/*40.15*/routes/*40.21*/.Assets.at("images/logo.png"))),format.raw/*40.50*/("""" height="30px">
		</h1>
		<p>
			<a href=""""),_display_(Seq[Any](/*43.14*/routes/*43.20*/.Application.login())),format.raw/*43.40*/("""">Student Login</a>
		</p>
		<p>
			<a href=""""),_display_(Seq[Any](/*46.14*/routes/*46.20*/.CompanyController.login())),format.raw/*46.46*/("""">Company Login</a>
		</p>

	</form>
</body>
</html>



"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 01 05:31:22 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/chooseLogin.scala.html
                    HASH: 6c79a95813ec9fb690ffc3b229028ca825d2cce9
                    MATRIX: 861->2|997->103|1011->109|1065->142|1167->210|1181->216|1237->251|1498->484|1527->485|1581->511|1610->512|1735->610|1763->611|1795->616|1823->617|2195->953|2210->959|2267->994|2393->1084|2408->1090|2459->1119|2542->1166|2557->1172|2599->1192|2684->1241|2699->1247|2747->1273
                    LINES: 29->2|32->5|32->5|32->5|34->7|34->7|34->7|41->14|41->14|42->15|42->15|48->21|48->21|49->22|49->22|62->35|62->35|62->35|67->40|67->40|67->40|70->43|70->43|70->43|73->46|73->46|73->46
                    -- GENERATED --
                */
            