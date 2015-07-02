
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



		<a href=""""),_display_(Seq[Any](/*88.13*/routes/*88.19*/.CompanyOperationController.dashboard())),format.raw/*88.58*/("""" id="logo"> 
		<img src=""""),_display_(Seq[Any](/*89.14*/routes/*89.20*/.Assets.at("images/logo-white.png"))),format.raw/*89.55*/("""" height="26px">
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
							"""),_display_(Seq[Any](/*131.9*/for(job <- jobs) yield /*131.25*/ {_display_(Seq[Any](format.raw/*131.27*/("""
							<tr>
								<td>
									<div class="panel panel-default">
										<div class="panel-body">
											<div style="float: left; width: 160px">
												<img src="""),_display_(Seq[Any](/*137.23*/{"assets/images/" + job.company_name + ".png"})),format.raw/*137.69*/(""">
											</div>
											<div style="float: left">

												<div style="float: left; width: 500px">
													<span class="text-title">Title</span>
													<p>
														<a href="""),_display_(Seq[Any](/*144.24*/job/*144.27*/.link)),format.raw/*144.32*/(""" target="_blank">"""),_display_(Seq[Any](/*144.50*/job/*144.53*/.title)),format.raw/*144.59*/("""</a>
													</p>
													<span class="text-title">Description</span>
													<p>"""),_display_(Seq[Any](/*147.18*/job/*147.21*/.description)),format.raw/*147.33*/("""</p>
												</div>

												<div style="float: left; padding-left: 30px">
													<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*151.61*/job/*151.64*/.company_name)),format.raw/*151.77*/("""</span><br>
													<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*152.61*/job/*152.64*/.salary)),format.raw/*152.71*/("""</span><br>
													<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*153.68*/job/*153.71*/.begin_date)),format.raw/*153.82*/("""</span><br>

													<span class="text-title"><b>Contact:</b></span> <span
														style="padding-right: 15px">"""),_display_(Seq[Any](/*156.44*/job/*156.47*/.contact)),format.raw/*156.55*/("""</span> <a
														class="glyphicon  logout"
														href=""""),_display_(Seq[Any](/*158.22*/routes/*158.28*/.CompanyOperationController.deleteJob(job.id))),format.raw/*158.73*/(""""
														style="background: none; box-shadow: none; padding: 8px 5px;">
														<b style="font-family: arial; color: #C9302C; font-size: 14px">
															Delete </b>
													</a> <a class="glyphicon  logout"
														href=""""),_display_(Seq[Any](/*163.22*/routes/*163.28*/.CompanyOperationController.viewToEditJob(job.id))),format.raw/*163.77*/(""""
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
							""")))})),format.raw/*174.9*/("""
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
							action=""""),_display_(Seq[Any](/*187.17*/routes/*187.23*/.CompanyOperationController.saveJob())),format.raw/*187.60*/("""">
							<div class="form-group ">
								<label class="col-xs-2 control-label">Company Name</label>
								<div class="col-xs-10">
									<input type="text" value=""""),_display_(Seq[Any](/*191.37*/company/*191.44*/.name)),format.raw/*191.49*/("""" name="company_name"
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
									<input required="required" type="text" name="job_contact" class="form-control"
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
                    DATE: Thu Jul 02 17:27:06 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/companyDashboard.scala.html
                    HASH: 6d2c06b177f4bc154f6c5e8be8ac0fa9aaeaf6b4
                    MATRIX: 796->1|923->34|989->73|1017->74|1111->141|1139->142|1180->155|1209->156|1275->195|1303->196|1342->208|1371->209|1460->271|1488->272|1532->288|1561->289|1642->343|1670->344|1812->450|1827->456|1881->488|1983->555|1998->561|2054->595|2156->662|2171->668|2227->702|3183->1622|3198->1628|3265->1673|3351->1723|3366->1729|3434->1775|3520->1825|3535->1831|3607->1881|3720->1959|3735->1965|3798->2006|3900->2073|3915->2079|3982->2124|4036->2142|4051->2148|4106->2181|4169->2208|4184->2214|4246->2254|4309->2281|4324->2287|4390->2331|5276->3181|5291->3187|5352->3226|5416->3254|5431->3260|5488->3295|5609->3381|5625->3388|5652->3393|5697->3402|5713->3409|5741->3415|5865->3503|5880->3509|5929->3536|6900->4471|6933->4487|6974->4489|7194->4672|7263->4718|7508->4926|7521->4929|7549->4934|7604->4952|7617->4955|7646->4961|7783->5061|7796->5064|7831->5076|8015->5223|8028->5226|8064->5239|8174->5312|8187->5315|8217->5322|8334->5402|8347->5405|8381->5416|8544->5542|8557->5545|8588->5553|8699->5627|8715->5633|8783->5678|9077->5935|9093->5941|9165->5990|9513->6306|9883->6639|9899->6645|9959->6682|10171->6857|10188->6864|10216->6869
                    LINES: 26->1|29->1|34->6|34->6|38->10|38->10|40->12|40->12|43->15|43->15|45->17|45->17|48->20|48->20|50->22|50->22|53->25|53->25|61->33|61->33|61->33|63->35|63->35|63->35|65->37|65->37|65->37|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|88->60|88->60|88->60|90->62|90->62|90->62|91->63|91->63|91->63|92->64|92->64|92->64|93->65|93->65|93->65|116->88|116->88|116->88|117->89|117->89|117->89|122->94|122->94|122->94|122->94|122->94|122->94|126->98|126->98|126->98|159->131|159->131|159->131|165->137|165->137|172->144|172->144|172->144|172->144|172->144|172->144|175->147|175->147|175->147|179->151|179->151|179->151|180->152|180->152|180->152|181->153|181->153|181->153|184->156|184->156|184->156|186->158|186->158|186->158|191->163|191->163|191->163|202->174|215->187|215->187|215->187|219->191|219->191|219->191
                    -- GENERATED --
                */
            