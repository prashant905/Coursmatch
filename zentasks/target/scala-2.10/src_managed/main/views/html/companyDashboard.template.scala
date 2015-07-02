
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
object companyDashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Company,List[Job],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(company: Company,jobs:List[Job]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""

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


	<nav style="position: fixed">

		<div style="padding: 10px 0 0 0px">
			<h4 class="dashboard">Jobs</h4>
			<ul class="navlist">
				<li><a href="#">Job .</a></li>
			</ul>
		</div>
	</nav>
	<div id="menu_container" class="container">

		<ul class="nav nav-pills" style="width: 1000px; margin-top: 50px">
			<li class="active"><a data-toggle="pill" href="#home">Jobs</a></li>
			<li><a data-toggle="pill" href="#menu1">Create Job</a></li>
		</ul>

		<div class="tab-content">
			<div id="home" class="tab-pane fade active in">
				<h3></h3>

				<div class="panel panel-primary" style="margin-bottom: 60px;">
					<div class="panel-heading">Jobs</div>
					<table id="jobs" class="table table-striped" cellspacing="0">
						<th></th>
						<tbody class="searchable">
							"""),_display_(Seq[Any](/*126.9*/for(job <- jobs) yield /*126.25*/ {_display_(Seq[Any](format.raw/*126.27*/("""
							<tr>
								<td>
									<div class="panel panel-default">
										<div class="panel-body">
											<div style="float: left; width: 160px">
												<img src="""),_display_(Seq[Any](/*132.23*/{"assets/images/" + job.company_name + ".png"})),format.raw/*132.69*/(""">
											</div>
											<div style="float: left">

												<div style="float: left; width: 500px">
													<span class="text-title">Title</span>
													<p>
														<a href="""),_display_(Seq[Any](/*139.24*/job/*139.27*/.link)),format.raw/*139.32*/(""" target="_blank">"""),_display_(Seq[Any](/*139.50*/job/*139.53*/.title)),format.raw/*139.59*/("""</a>
													</p>
													<span class="text-title">Description</span>
													<p>"""),_display_(Seq[Any](/*142.18*/job/*142.21*/.description)),format.raw/*142.33*/("""</p>
												</div>

												<div style="float: left; padding-left: 30px">
													<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*146.61*/job/*146.64*/.company_name)),format.raw/*146.77*/("""</span><br>
													<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*147.61*/job/*147.64*/.salary)),format.raw/*147.71*/("""</span><br>
													<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*148.68*/job/*148.71*/.begin_date)),format.raw/*148.82*/("""</span><br>

													<span class="text-title"><b>Contact:</b></span> <span
														style="padding-right: 15px">"""),_display_(Seq[Any](/*151.44*/job/*151.47*/.contact)),format.raw/*151.55*/("""</span> <a
														class="glyphicon  logout"
														href=""""),_display_(Seq[Any](/*153.22*/routes/*153.28*/.CompanyOperationController.deleteJob(job.id))),format.raw/*153.73*/(""""
														style="background: none; box-shadow: none; padding: 8px 5px;">
														<b style="font-family: arial; color: #C9302C; font-size: 14px">
															Delete </b>
													</a> <a class="glyphicon  logout"
														href=""""),_display_(Seq[Any](/*158.22*/routes/*158.28*/.CompanyOperationController.viewToEditJob(job.id))),format.raw/*158.77*/(""""
														style="background: none; box-shadow: none; padding: 8px 5px;">
														<b style="font-family: arial; color: #C9302C; font-size: 14px">
															Edit </b>
													</a>
												</div>
											</div>
										</div>
									</div>
								</td>
							</tr>
							""")))})),format.raw/*169.9*/("""
						</tbody>
					</table>
				</div>
			</div>

			<div id="menu1" class="tab-pane fade">
			<h3></h3>
				<div class="panel panel-primary" style="margin-bottom: 60px;">
					<div class="panel-heading">Create Job</div>
					<div class="panel-body">

						<form class="form-horizontal" method="post"
							action=""""),_display_(Seq[Any](/*182.17*/routes/*182.23*/.CompanyOperationController.saveJob())),format.raw/*182.60*/("""">
							<div class="form-group ">
								<label class="col-xs-2 control-label">Company Name</label>
								<div class="col-xs-10">
									<input type="text" value=""""),_display_(Seq[Any](/*186.37*/company/*186.44*/.name)),format.raw/*186.49*/("""" name="company_name"
										class="form-control" readonly="readonly" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label class="col-xs-2 control-label">Title</label>
								<div class="col-xs-10">
									<input required="required" type="text" name="job_title" class="form-control"
										placeholder="enter job title ..">
								</div>
							</div>
							<div class="form-group ">
								<label class="col-xs-2 control-label">Salary</label>
								<div class="col-xs-10">
									<input type="text" name="job_salary" class="form-control"
										placeholder="enter salary ..">
								</div>
							</div>
							<div class="form-group ">
								<label class="col-xs-2 control-label">Begin Date</label>
								<div class="col-xs-10">
									<input type="text" name="begin_date" class="form-control"
										placeholder="enter starting date ..">
								</div>
							</div>
							<div class="form-group ">
								<label class="col-xs-2 control-label">Description</label>
								<div class="col-xs-10">
									<input type="text" name="job_description" class="form-control"
										placeholder="enter job description ..">
								</div>
							</div>
							<div class="form-group ">
								<label class="col-xs-2 control-label">Contact</label>
								<div class="col-xs-10">
									<input type="text" name="job_contact" class="form-control"
										placeholder="enter job contact ..">
								</div>
							</div>
							<div class="form-group ">
								<label class="col-xs-2 control-label">Link</label>
								<div class="col-xs-10">
									<input required="required" type="text" name="job_link" class="form-control"
										placeholder="enter job link at company home page  ..">
								</div>
							</div>
							<div class="well">
								<p>Jobs Tags :</p>
								<input name="job_tags" type="text" class="form-control"
									id="jobTag" value="" />
							</div>
							<button type="submit" style="width: 100%;" class="btn btn-danger">Submit</button>
						</form>
					</div>
				</div>
			</div>


			<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true"></button>
					<h3 id="myModalLabel">Delete</h3>
				</div>
				<div class="modal-body">
					<p></p>
				</div>
				<div class="modal-footer">
					<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
					<button data-dismiss="modal" class="btn red" id="btnYes">Confirm</button>
				</div>

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
    
    def render(company:Company,jobs:List[Job]): play.api.templates.HtmlFormat.Appendable = apply(company,jobs)
    
    def f:((Company,List[Job]) => play.api.templates.HtmlFormat.Appendable) = (company,jobs) => apply(company,jobs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 15:19:09 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/companyDashboard.scala.html
                    HASH: cb69282ecbbf6b623a99455e205b0a802553b1fd
                    MATRIX: 796->1|923->34|989->73|1017->74|1111->141|1139->142|1178->154|1207->155|1296->217|1324->218|1368->234|1397->235|1478->289|1506->290|1648->396|1663->402|1717->434|1819->501|1834->507|1890->541|1992->608|2007->614|2063->648|3019->1568|3034->1574|3101->1619|3187->1669|3202->1675|3270->1721|3356->1771|3371->1777|3443->1827|3556->1905|3571->1911|3634->1952|3736->2019|3751->2025|3818->2070|3872->2088|3887->2094|3942->2127|4005->2154|4020->2160|4082->2200|4145->2227|4160->2233|4226->2277|5112->3127|5127->3133|5188->3172|5252->3200|5267->3206|5325->3242|5446->3328|5462->3335|5489->3340|5534->3349|5550->3356|5578->3362|5702->3450|5717->3456|5766->3483|6744->4425|6777->4441|6818->4443|7038->4626|7107->4672|7352->4880|7365->4883|7393->4888|7448->4906|7461->4909|7490->4915|7627->5015|7640->5018|7675->5030|7859->5177|7872->5180|7908->5193|8018->5266|8031->5269|8061->5276|8178->5356|8191->5359|8225->5370|8388->5496|8401->5499|8432->5507|8543->5581|8559->5587|8627->5632|8921->5889|8937->5895|9009->5944|9357->6260|9727->6593|9743->6599|9803->6636|10015->6811|10032->6818|10060->6823
                    LINES: 26->1|29->1|34->6|34->6|38->10|38->10|40->12|40->12|43->15|43->15|45->17|45->17|48->20|48->20|56->28|56->28|56->28|58->30|58->30|58->30|60->32|60->32|60->32|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|83->55|83->55|83->55|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|111->83|111->83|111->83|112->84|112->84|112->84|117->89|117->89|117->89|117->89|117->89|117->89|121->93|121->93|121->93|154->126|154->126|154->126|160->132|160->132|167->139|167->139|167->139|167->139|167->139|167->139|170->142|170->142|170->142|174->146|174->146|174->146|175->147|175->147|175->147|176->148|176->148|176->148|179->151|179->151|179->151|181->153|181->153|181->153|186->158|186->158|186->158|197->169|210->182|210->182|210->182|214->186|214->186|214->186
                    -- GENERATED --
                */
            