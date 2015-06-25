
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
    <head>
  
        <title>CourseMatch</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css"))),format.raw/*7.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png"))),format.raw/*10.97*/("""">
  
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-2.1.4.js"))),format.raw/*12.70*/(""""></script>
           <script src=""""),_display_(Seq[Any](/*13.26*/routes/*13.32*/.Assets.at("javascripts/app.js"))),format.raw/*13.64*/(""""></script>
     
        
    <script src="http://code.angularjs.org/1.2.13/angular.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.8/angular-ui-router.min.js"></script>
    
    <script type="text/javascript">
	var routerApp = angular.module('course_match', ['ui.router']);

	routerApp.config(function($stateProvider, $urlRouterProvider) """),format.raw/*22.64*/("""{"""),format.raw/*22.65*/("""
	    
	    $urlRouterProvider.otherwise('/');
	    
	    $stateProvider
	        
	        // HOME STATES AND NESTED VIEWS ========================================
	        .state('signIn', """),format.raw/*29.27*/("""{"""),format.raw/*29.28*/("""
	            url: '/signIn',
	            templateUrl: 'assets/templates/signIn.html'
	        """),format.raw/*32.10*/("""}"""),format.raw/*32.11*/(""")
	       
	        
	"""),format.raw/*35.2*/("""}"""),format.raw/*35.3*/(""");
    
    </script>
    
    
    </head>

    <body ng-app='course_match'>
     <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#page-top">TUM</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li class="page-scroll">
                        <a  ui-sref="signIn">Sign in</a>
                    </li>
                    <li class="page-scroll">
                        <a href="#about">About</a>
                    </li>
                    <li class="page-scroll">
                        <a href="#contact">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    
		    <div >
      <div class="container">

    <!-- THIS IS WHERE WE WILL INJECT OUR CONTENT ============================== -->
    <div ui-view></div>
		</div>
		
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
                    DATE: Fri Jun 05 19:02:03 CEST 2015
                    SOURCE: C:/Users/PRASHANT/workspace/forms/app/views/main.scala.html
                    HASH: ddca121d38c1aa355346456e80431520b86fe89d
                    MATRIX: 854->0|1015->126|1029->132|1084->166|1175->222|1189->228|1249->267|1340->323|1354->329|1419->372|1516->433|1531->439|1585->471|1649->499|1664->505|1727->546|1800->583|1815->589|1869->621|2275->999|2304->1000|2523->1191|2552->1192|2676->1288|2705->1289|2754->1311|2782->1312
                    LINES: 29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|50->22|50->22|57->29|57->29|60->32|60->32|63->35|63->35
                    -- GENERATED --
                */
            