
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

Seq[Any](format.raw/*1.1*/("""<html>
<head>
<title>Course Match Login</title>
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*4.51*/routes/*4.57*/.Assets.at(" images/favicon.png"))),format.raw/*4.90*/(""""/>
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*6.9*/routes/*6.15*/.Assets.at("stylesheets/login.css"))),format.raw/*6.50*/("""">
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.6.3.min.js"></script>
<script type="text/javascript"
	src="http://malsup.github.io/jquery.cycle.all.js"></script>

<script>
	$(document).ready(function() """),format.raw/*13.31*/("""{"""),format.raw/*13.32*/("""
		$('#slideshow').cycle("""),format.raw/*14.25*/("""{"""),format.raw/*14.26*/("""
			fx : 'fade',
			pager : '#smallnav',
			pause : 1,
			speed : 2800,
			timeout : 4500
		"""),format.raw/*20.3*/("""}"""),format.raw/*20.4*/(""");
	"""),format.raw/*21.2*/("""}"""),format.raw/*21.3*/(""");
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
		<a href="" id="logo"> <img src=""""),_display_(Seq[Any](/*34.36*/routes/*34.42*/.Assets.at("images/logo-white.png"))),format.raw/*34.77*/("""" height="30px">
		</a>
	</header>
	<form>
		<h1 style="height: 50px">
			<img src=""""),_display_(Seq[Any](/*39.15*/routes/*39.21*/.Assets.at("images/logo.png"))),format.raw/*39.50*/("""" height="30px">
		</h1>
		<p>
			<a href=""""),_display_(Seq[Any](/*42.14*/routes/*42.20*/.StudentController.login())),format.raw/*42.46*/("""">Student Login</a>
		</p>
		<p>
			<a href=""""),_display_(Seq[Any](/*45.14*/routes/*45.20*/.CompanyController.login())),format.raw/*45.46*/("""">Company Login</a>
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
                    DATE: Thu Jul 02 05:45:55 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/chooseLogin.scala.html
                    HASH: bb1a824398b2b302cc8de0b671935552b88a6941
                    MATRIX: 861->0|997->101|1011->107|1065->140|1167->208|1181->214|1237->249|1498->482|1527->483|1581->509|1610->510|1735->608|1763->609|1795->614|1823->615|2195->951|2210->957|2267->992|2393->1082|2408->1088|2459->1117|2542->1164|2557->1170|2605->1196|2690->1245|2705->1251|2753->1277
                    LINES: 29->1|32->4|32->4|32->4|34->6|34->6|34->6|41->13|41->13|42->14|42->14|48->20|48->20|49->21|49->21|62->34|62->34|62->34|67->39|67->39|67->39|70->42|70->42|70->42|73->45|73->45|73->45
                    -- GENERATED --
                */
            