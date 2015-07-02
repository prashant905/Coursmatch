
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

.nav>li """),format.raw/*12.9*/("""{"""),format.raw/*12.10*/("""
	width: 220px !important;
	text-align: center !important;
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

.text-title """),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""
	font-style: italic;
	text-decoration: underline;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""
</style>




<head>
<title>CourseMatch</title>
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*28.51*/routes/*28.57*/.Assets.at("images/favicon.png"))),format.raw/*28.89*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*30.9*/routes/*30.15*/.Assets.at("stylesheets/main.css"))),format.raw/*30.49*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*32.9*/routes/*32.15*/.Assets.at("stylesheets/tags.css"))),format.raw/*32.49*/("""">


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

<script type="text/javascript" src=""""),_display_(Seq[Any](/*50.38*/routes/*50.44*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*50.89*/(""""></script>
<script type="text/javascript" src=""""),_display_(Seq[Any](/*51.38*/routes/*51.44*/.Assets.at("javascripts/jquery.dataTables.js"))),format.raw/*51.90*/(""""></script>
<script type="text/javascript" src=""""),_display_(Seq[Any](/*52.38*/routes/*52.44*/.Assets.at("javascripts/jquery.dataTables.min.js"))),format.raw/*52.94*/(""""></script>

<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*55.9*/routes/*55.15*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*55.56*/("""">
<link rel="stylesheet" type="text/css" media="screen"
	href=""""),_display_(Seq[Any](/*57.9*/routes/*57.15*/.Assets.at("stylesheets/star-rating.min.css"))),format.raw/*57.60*/("""">
<script src=""""),_display_(Seq[Any](/*58.15*/routes/*58.21*/.Assets.at("javascripts/tags.js"))),format.raw/*58.54*/(""""></script>
<script src=""""),_display_(Seq[Any](/*59.15*/routes/*59.21*/.Assets.at("javascripts/star-rating.js"))),format.raw/*59.61*/(""""></script>
<script src=""""),_display_(Seq[Any](/*60.15*/routes/*60.21*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*60.65*/(""""></script>

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



		<a href=""""),_display_(Seq[Any](/*83.13*/routes/*83.19*/.CompanyOperationController.dashboard())),format.raw/*83.58*/("""" id="logo"> <img
			src=""""),_display_(Seq[Any](/*84.10*/routes/*84.16*/.Assets.at(" images/logo-white.png"))),format.raw/*84.52*/("""" height="26px">
		</a>

		<dl id="user">
			<dt style="padding-top: 10px">
				"""),_display_(Seq[Any](/*89.6*/company/*89.13*/.name)),format.raw/*89.18*/(""" <span>("""),_display_(Seq[Any](/*89.27*/company/*89.34*/.email)),format.raw/*89.40*/(""")</span>
			</dt>
			<dd>
				<a class="glyphicon glyphicon-off logout"
					href=""""),_display_(Seq[Any](/*93.13*/routes/*93.19*/.CompanyController.logout())),format.raw/*93.46*/("""" style="padding: 8px 5px;">
					<b style="font-family: arial; font-size: 14px"> Logout </b>
				</a>
			</dd>
		</dl>
	</header>


	<nav style="position:fixed">

		<div style="padding: 10px 0 0 0px">
			<h4 class="dashboard">Jobs</h4>
			<ul class="navlist">
				<li><a href="#">Job .</a></li>
			</ul>
		</div>
	</nav>
	<div id="menu_container" class="container">
		<div style="margin-top: 20px" class="panel panel-default">
			<header class="panel-heading">
				<h3 class="panel-title">Create A Job</h3>
			</header>
			<div class="panel-body">

				<form class="form-horizontal" method="post"
					action=""""),_display_(Seq[Any](/*118.15*/routes/*118.21*/.CompanyOperationController.editJob(job.id))),format.raw/*118.64*/("""">
					<div class="form-group ">
						<label class="col-xs-2 control-label">Company Name</label>
						<div class="col-xs-10">
							<input type="text" value=""""),_display_(Seq[Any](/*122.35*/company/*122.42*/.name)),format.raw/*122.47*/("""" name="company_name"
								class="form-control" readonly="readonly" placeholder="" >
						</div>
					</div>
					<div class="form-group">
						<label class="col-xs-2 control-label">Title</label>
						<div class="col-xs-10">
							<input type="text" name="job_title" value=""""),_display_(Seq[Any](/*129.52*/job/*129.55*/.title)),format.raw/*129.61*/(""""class="form-control"
								placeholder="enter job title ..">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Salary</label>
						<div class="col-xs-10">
							<input type="text" name="job_salary" class="form-control"
								placeholder="enter salary .." value=""""),_display_(Seq[Any](/*137.47*/job/*137.50*/.title)),format.raw/*137.56*/("""">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Begin Date</label>
						<div class="col-xs-10">
							<input type="text" name="begin_date" class="form-control"
								placeholder="enter starting date .."value=""""),_display_(Seq[Any](/*144.53*/job/*144.56*/.begin_date)),format.raw/*144.67*/("""">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Description</label>
						<div class="col-xs-10">
							<input type="text" name="job_description" class="form-control"
								placeholder="enter job description .."value=""""),_display_(Seq[Any](/*151.55*/job/*151.58*/.description)),format.raw/*151.70*/("""">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Contact</label>
						<div class="col-xs-10">
							<input type="text" name="job_contact" class="form-control"
								placeholder="enter job contact .."value=""""),_display_(Seq[Any](/*158.51*/job/*158.54*/.contact)),format.raw/*158.62*/("""">
						</div>
					</div>
					<div class="form-group ">
						<label class="col-xs-2 control-label">Link</label>
						<div class="col-xs-10">
							<input type="text" name="job_link" class="form-control"
								placeholder="enter job link at company home page  .."value=""""),_display_(Seq[Any](/*165.70*/job/*165.73*/.link)),format.raw/*165.78*/("""">
						</div>
					</div>
					<div class="well">
						<p>Jobs Tags :</p>
						<input name="job_tags" type="text" class="form-control"
							id="jobTag" value=""""),_display_(Seq[Any](/*171.28*/job/*171.31*/.tags)),format.raw/*171.36*/("""" />
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
                    DATE: Thu Jul 02 14:54:05 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/editJob.scala.html
                    HASH: f6f2e8b646403b337d546c8468e523c8dc41cea8
                    MATRIX: 781->1|901->27|967->66|995->67|1089->134|1117->135|1156->147|1185->148|1274->210|1302->211|1346->227|1375->228|1456->282|1484->283|1626->389|1641->395|1695->427|1797->494|1812->500|1868->534|1970->601|1985->607|2041->641|2997->1561|3012->1567|3079->1612|3165->1662|3180->1668|3248->1714|3334->1764|3349->1770|3421->1820|3534->1898|3549->1904|3612->1945|3714->2012|3729->2018|3796->2063|3850->2081|3865->2087|3920->2120|3983->2147|3998->2153|4060->2193|4123->2220|4138->2226|4204->2270|5090->3120|5105->3126|5166->3165|5230->3193|5245->3199|5303->3235|5424->3321|5440->3328|5467->3333|5512->3342|5528->3349|5556->3355|5680->3443|5695->3449|5744->3476|6418->4113|6434->4119|6500->4162|6704->4329|6721->4336|6749->4341|7075->4630|7088->4633|7117->4639|7482->4967|7495->4970|7524->4976|7837->5252|7850->5255|7884->5266|8205->5550|8218->5553|8253->5565|8562->5837|8575->5840|8606->5848|8928->6133|8941->6136|8969->6141|9178->6313|9191->6316|9219->6321
                    LINES: 26->1|29->1|34->6|34->6|38->10|38->10|40->12|40->12|43->15|43->15|45->17|45->17|48->20|48->20|56->28|56->28|56->28|58->30|58->30|58->30|60->32|60->32|60->32|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|83->55|83->55|83->55|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|111->83|111->83|111->83|112->84|112->84|112->84|117->89|117->89|117->89|117->89|117->89|117->89|121->93|121->93|121->93|146->118|146->118|146->118|150->122|150->122|150->122|157->129|157->129|157->129|165->137|165->137|165->137|172->144|172->144|172->144|179->151|179->151|179->151|186->158|186->158|186->158|193->165|193->165|193->165|199->171|199->171|199->171
                    -- GENERATED --
                */
            