
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



		<a href=""""),_display_(Seq[Any](/*83.13*/routes/*83.19*/.CompanyController.dashboard())),format.raw/*83.49*/("""" id="logo"> <img
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


	<nav>

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
				<h3>Jobs</h3>

				<table id="jobs" class="table table-striped" cellspacing="0">
					<th></th>
					<tbody class="searchable">
						"""),_display_(Seq[Any](/*124.8*/for(job <- jobs) yield /*124.24*/ {_display_(Seq[Any](format.raw/*124.26*/("""
						<tr>
									<div class="panel panel-default">
										<div class="panel-body">
											<div style="float: left; width: 160px">
												<img src="""),_display_(Seq[Any](/*129.23*/{"assets/images/" + job.company_name + ".png"})),format.raw/*129.69*/(""">
											</div>
											<div style="float: left">

												<div style="float: left; width: 500px">
													<span class="text-title">Title</span>
													<p><a href=""""),_display_(Seq[Any](/*135.27*/job/*135.30*/.link)),format.raw/*135.35*/("""">"""),_display_(Seq[Any](/*135.38*/job/*135.41*/.title)),format.raw/*135.47*/("""</a></p>
													<span class="text-title">Description</span>
													<p>"""),_display_(Seq[Any](/*137.18*/job/*137.21*/.description)),format.raw/*137.33*/("""</p>
												</div>

												<div style="float: left; padding-left: 30px">
													<span class="text-title">Company</span> <span>"""),_display_(Seq[Any](/*141.61*/job/*141.64*/.company_name)),format.raw/*141.77*/("""</span><br>
													<span class="text-title">Salary </span> <span>"""),_display_(Seq[Any](/*142.61*/job/*142.64*/.salary)),format.raw/*142.71*/("""</span><br>
													<span class="text-title">Beginning Time</span> <span>"""),_display_(Seq[Any](/*143.68*/job/*143.71*/.begin_date)),format.raw/*143.82*/("""</span><br>
													
													<span class="text-title" ><b>Contact:</b></span> <span style="padding-right:15px">"""),_display_(Seq[Any](/*145.97*/job/*145.100*/.contact)),format.raw/*145.108*/("""</span>
													<a class="glyphicon  logout"
														href=""""),_display_(Seq[Any](/*147.22*/routes/*147.28*/.CompanyController.deleteJob(job.id))),format.raw/*147.64*/(""""
														style="background:none;box-shadow:none;padding: 8px 5px;"> <b
														style="font-family: arial;color:red; font-size: 14px"> Delete </b>
													</a> <a class="glyphicon  logout"
														href=""""),_display_(Seq[Any](/*151.22*/routes/*151.28*/.CompanyController.viewToEditJob(job.id))),format.raw/*151.68*/(""""
														style="background:none;box-shadow:none;padding: 8px 5px;"> <b
														style="font-family: arial;color:red; font-size: 14px"> Edit </b>
													</a>
												</div>
											</div>
										</div>
									</div>
							</td>
						</tr>
						""")))})),format.raw/*161.8*/("""
					</tbody>
				</table>
			</div>

			<div id="menu1" class="tab-pane fade">
				<div style="margin-top: 20px" class="panel panel-default">
					<header class="panel-heading">
						<h3 class="panel-title">Create A Job</h3>
					</header>
					<div class="panel-body">

						<form class="form-horizontal" method="post"
							action=""""),_display_(Seq[Any](/*174.17*/routes/*174.23*/.CompanyController.saveJob())),format.raw/*174.51*/("""">
							<div class="form-group ">
								<label class="col-xs-2 control-label">Company Name</label>
								<div class="col-xs-10">
									<input type="text" value=""""),_display_(Seq[Any](/*178.37*/company/*178.44*/.name)),format.raw/*178.49*/("""" name="company_name"
										class="form-control" readonly="readonly" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label class="col-xs-2 control-label">Title</label>
								<div class="col-xs-10">
									<input type="text" name="job_title" class="form-control"
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
									<input type="text" name="job_link" class="form-control"
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
                    DATE: Wed Jul 01 05:29:12 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/companyDashboard.scala.html
                    HASH: 528d368ccbd111881e4e0b53c0054b6ab084abff
                    MATRIX: 796->1|923->34|989->73|1017->74|1111->141|1139->142|1178->154|1207->155|1296->217|1324->218|1368->234|1397->235|1478->289|1506->290|1648->396|1663->402|1717->434|1819->501|1834->507|1890->541|1992->608|2007->614|2063->648|3019->1568|3034->1574|3101->1619|3187->1669|3202->1675|3270->1721|3356->1771|3371->1777|3443->1827|3556->1905|3571->1911|3634->1952|3736->2019|3751->2025|3818->2070|3872->2088|3887->2094|3942->2127|4005->2154|4020->2160|4082->2200|4145->2227|4160->2233|4226->2277|5112->3127|5127->3133|5179->3163|5243->3191|5258->3197|5316->3233|5437->3319|5453->3326|5480->3331|5525->3340|5541->3347|5569->3353|5693->3441|5708->3447|5757->3474|6599->4280|6632->4296|6673->4298|6878->4466|6947->4512|7177->4705|7190->4708|7218->4713|7258->4716|7271->4719|7300->4725|7422->4810|7435->4813|7470->4825|7654->4972|7667->4975|7703->4988|7813->5061|7826->5064|7856->5071|7973->5151|7986->5154|8020->5165|8181->5289|8195->5292|8227->5300|8337->5373|8353->5379|8412->5415|8680->5646|8696->5652|8759->5692|9078->5979|9468->6332|9484->6338|9535->6366|9747->6541|9764->6548|9792->6553
                    LINES: 26->1|29->1|34->6|34->6|38->10|38->10|40->12|40->12|43->15|43->15|45->17|45->17|48->20|48->20|56->28|56->28|56->28|58->30|58->30|58->30|60->32|60->32|60->32|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|83->55|83->55|83->55|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|111->83|111->83|111->83|112->84|112->84|112->84|117->89|117->89|117->89|117->89|117->89|117->89|121->93|121->93|121->93|152->124|152->124|152->124|157->129|157->129|163->135|163->135|163->135|163->135|163->135|163->135|165->137|165->137|165->137|169->141|169->141|169->141|170->142|170->142|170->142|171->143|171->143|171->143|173->145|173->145|173->145|175->147|175->147|175->147|179->151|179->151|179->151|189->161|202->174|202->174|202->174|206->178|206->178|206->178
                    -- GENERATED --
                */
            