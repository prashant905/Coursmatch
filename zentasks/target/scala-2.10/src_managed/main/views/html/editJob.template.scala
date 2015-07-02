
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
object editJob extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Company,Job,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(company: Company,job:Job):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.28*/("""

<html>

<style>
#menu_container """),format.raw/*6.17*/("""{"""),format.raw/*6.18*/("""
	position: relative;
	margin-left: 360px;
	padding-top: 50px;
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""

.posFixed"""),format.raw/*12.10*/("""{"""),format.raw/*12.11*/("""
  position:fixed;
  z-index: 1000;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

.nav>li """),format.raw/*17.9*/("""{"""),format.raw/*17.10*/("""
	width: 220px !important;
	text-align: center !important;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

.text-title """),format.raw/*22.13*/("""{"""),format.raw/*22.14*/("""
	font-style: italic;
	text-decoration: underline;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""
</style>




<head>
<title>CourseMatch</title>
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*33.51*/routes/*33.57*/.Assets.at("images/favicon.png"))),format.raw/*33.89*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*35.9*/routes/*35.15*/.Assets.at("stylesheets/main.css"))),format.raw/*35.49*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*37.9*/routes/*37.15*/.Assets.at("stylesheets/tags.css"))),format.raw/*37.49*/("""">


<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/css/bootstrap-select.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/bootstrap-tokenfield.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/css/tokenfield-typeahead.css">

<script type="text/javascript" src=""""),_display_(Seq[Any](/*55.38*/routes/*55.44*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*55.89*/(""""></script>
<script type="text/javascript" src=""""),_display_(Seq[Any](/*56.38*/routes/*56.44*/.Assets.at("javascripts/jquery.dataTables.js"))),format.raw/*56.90*/(""""></script>
<script type="text/javascript" src=""""),_display_(Seq[Any](/*57.38*/routes/*57.44*/.Assets.at("javascripts/jquery.dataTables.min.js"))),format.raw/*57.94*/(""""></script>

<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*60.9*/routes/*60.15*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*60.56*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*62.9*/routes/*62.15*/.Assets.at("stylesheets/star-rating.min.css"))),format.raw/*62.60*/("""">
<script src=""""),_display_(Seq[Any](/*63.15*/routes/*63.21*/.Assets.at("javascripts/tags.js"))),format.raw/*63.54*/(""""></script>
<script src=""""),_display_(Seq[Any](/*64.15*/routes/*64.21*/.Assets.at("javascripts/star-rating.js"))),format.raw/*64.61*/(""""></script>
<script src=""""),_display_(Seq[Any](/*65.15*/routes/*65.21*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*65.65*/(""""></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/bootstrap-tokenfield.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tokenfield/0.12.0/bootstrap-tokenfield.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script
	src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.min.js"></script>
<script
	src="http://cdn.datatables.net/plug-ins/1.10.7/integration/bootstrap/3/dataTables.bootstrap.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.7.2/js/bootstrap-select.js"></script>
</head>
<body>

	<header style="padding-top: 12px; position: fixed">



		<a href=""""),_display_(Seq[Any](/*88.13*/routes/*88.19*/.CompanyOperationController.dashboard())),format.raw/*88.58*/("""" id="logo"> <img
			src=""""),_display_(Seq[Any](/*89.10*/routes/*89.16*/.Assets.at(" images/logo-white.png"))),format.raw/*89.52*/("""" height="26px">
		</a>

		<dl id="user">
			<dt style="padding-top: 10px">
				"""),_display_(Seq[Any](/*94.6*/company/*94.13*/.name)),format.raw/*94.18*/(""" <span>("""),_display_(Seq[Any](/*94.27*/company/*94.34*/.email)),format.raw/*94.40*/(""")</span>
			</dt>
			<dd>
				<a class="glyphicon glyphicon-off logout"
					href=""""),_display_(Seq[Any](/*98.13*/routes/*98.19*/.CompanyController.logout())),format.raw/*98.46*/("""" style="padding: 8px 5px;">
					<b style="font-family: arial; font-size: 14px"> Logout </b>
				</a>
			</dd>
		</dl>
	</header>


	<nav class="posFixed">

		<div style="padding: 10px 0 0 0px">
			<h4 class="dashboard">Jobs</h4>
			<ul class="navlist">
				<li><a href="#">Job .</a></li>
			</ul>
		</div>
	</nav>
	<div id="menu_container" class="container">
		<div style="margin-top: 20px" class="panel panel-primary">
			<header class="panel-heading">
				<h3 class="panel-title">Create A Job</h3>
			</header>
			<div class="panel-body">

				<form class="form-horizontal" method="post"
					action=""""),_display_(Seq[Any](/*123.15*/routes/*123.21*/.CompanyOperationController.editJob(job.id))),format.raw/*123.64*/("""">
					<div class="form-group ">
						<label class="col-xs-2 control-label">Company Name</label>
						<div class="col-xs-10">
							<input type="text" value=""""),_display_(Seq[Any](/*127.35*/company/*127.42*/.name)),format.raw/*127.47*/("""" name="company_name"
								class="form-control" readonly="readonly" placeholder="" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-xs-2 control-label">Title</label>
						<div class="col-xs-10">
							<input type="text" name="job_title" value=""""),_display_(Seq[Any](/*134.52*/job/*134.55*/.title)),format.raw/*134.61*/(""""class="form-control"
								placeholder="enter job title ..">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Salary</label>
						<div class="col-xs-10">
							<input type="text" name="job_salary" class="form-control"
								placeholder="enter salary .." value=""""),_display_(Seq[Any](/*142.47*/job/*142.50*/.title)),format.raw/*142.56*/("""">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Begin Date</label>
						<div class="col-xs-10">
							<input type="text" name="begin_date" class="form-control"
								placeholder="enter starting date .."value=""""),_display_(Seq[Any](/*149.53*/job/*149.56*/.begin_date)),format.raw/*149.67*/("""">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Description</label>
						<div class="col-xs-10">
							<input type="text" name="job_description" class="form-control"
								placeholder="enter job description .."value=""""),_display_(Seq[Any](/*156.55*/job/*156.58*/.description)),format.raw/*156.70*/("""">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Contact</label>
						<div class="col-xs-10">
							<input type="text" name="job_contact" class="form-control"
								placeholder="enter job contact .."value=""""),_display_(Seq[Any](/*163.51*/job/*163.54*/.contact)),format.raw/*163.62*/("""">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Link</label>
						<div class="col-xs-10">
							<input type="text" name="job_link" class="form-control"
								placeholder="enter job link at company home page  .."value=""""),_display_(Seq[Any](/*170.70*/job/*170.73*/.link)),format.raw/*170.78*/("""">
						</div>
					</div>
					<div class="well">
						<p>Jobs Tags :</p>
						<input name="job_tags" type="text" class="form-control"
							id="jobTag" value=""""),_display_(Seq[Any](/*176.28*/job/*176.31*/.tags)),format.raw/*176.36*/("""" />
					</div>
					<button type="submit" style="width: 100%;" class="btn btn-danger">Submit</button>
				</form>
			</div>
		</div>
	</div>
</body>
<script>
	$('#jobTag').tokenfield();
	$('#jobs').DataTable();
</script>
</html>

"""))}
    }
    
    def render(company:Company,job:Job): play.api.templates.HtmlFormat.Appendable = apply(company,job)
    
    def f:((Company,Job) => play.api.templates.HtmlFormat.Appendable) = (company,job) => apply(company,job)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 17:23:13 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/editJob.scala.html
                    HASH: 7b22c4b3df4e650d8fc0ac53e65c08ea50039ca6
                    MATRIX: 781->1|901->27|967->66|995->67|1089->134|1117->135|1158->148|1187->149|1253->188|1281->189|1320->201|1349->202|1438->264|1466->265|1510->281|1539->282|1620->336|1648->337|1790->443|1805->449|1859->481|1961->548|1976->554|2032->588|2134->655|2149->661|2205->695|3161->1615|3176->1621|3243->1666|3329->1716|3344->1722|3412->1768|3498->1818|3513->1824|3585->1874|3698->1952|3713->1958|3776->1999|3878->2066|3893->2072|3960->2117|4014->2135|4029->2141|4084->2174|4147->2201|4162->2207|4224->2247|4287->2274|4302->2280|4368->2324|5254->3174|5269->3180|5330->3219|5394->3247|5409->3253|5467->3289|5588->3375|5604->3382|5631->3387|5676->3396|5692->3403|5720->3409|5844->3497|5859->3503|5908->3530|6576->4161|6592->4167|6658->4210|6862->4377|6879->4384|6907->4389|7233->4678|7246->4681|7275->4687|7640->5015|7653->5018|7682->5024|7995->5300|8008->5303|8042->5314|8363->5598|8376->5601|8411->5613|8720->5885|8733->5888|8764->5896|9086->6181|9099->6184|9127->6189|9336->6361|9349->6364|9377->6369
                    LINES: 26->1|29->1|34->6|34->6|38->10|38->10|40->12|40->12|43->15|43->15|45->17|45->17|48->20|48->20|50->22|50->22|53->25|53->25|61->33|61->33|61->33|63->35|63->35|63->35|65->37|65->37|65->37|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|88->60|88->60|88->60|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|116->88|116->88|116->88|117->89|117->89|117->89|122->94|122->94|122->94|122->94|122->94|122->94|126->98|126->98|126->98|151->123|151->123|151->123|155->127|155->127|155->127|162->134|162->134|162->134|170->142|170->142|170->142|177->149|177->149|177->149|184->156|184->156|184->156|191->163|191->163|191->163|198->170|198->170|198->170|204->176|204->176|204->176
                    -- GENERATED --
                */
            