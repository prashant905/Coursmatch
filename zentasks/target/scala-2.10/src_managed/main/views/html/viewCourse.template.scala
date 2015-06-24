
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
        <title>CourseMatch</title>
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
        
        <header style="padding-top: 12px">
            
            <a href="/dashboard" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*62.25*/routes/*62.31*/.Assets.at("images/logo-white.png"))),format.raw/*62.66*/("""" height="26px">
            </a>
            
            <dl id="user" >
                <dt style="padding-top: 10px">
                 """),_display_(Seq[Any](/*67.19*/student/*67.26*/.name)),format.raw/*67.31*/(""" <span>("""),_display_(Seq[Any](/*67.40*/student/*67.47*/.email)),format.raw/*67.53*/(""")</span></dt>
                <dd>
                  <a class="glyphicon glyphicon-off logout" href=""""),_display_(Seq[Any](/*69.68*/routes/*69.74*/.Application.logout())),format.raw/*69.95*/("""" style="padding: 8px 5px;"> 
                   <b style="font-family:arial; font-size: 14px"> Logout </b>
                  </a>    
                </dd>
            </dl>
        </header>
       
        
	  	<nav>
		    <div style="padding: 10px 0 0 15px">
		     <img src=""""),_display_(Seq[Any](/*79.19*/routes/*79.25*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*79.70*/("""" height="60px">
		    </div>
		
		    <div style="padding: 10px 0 0 0px">
             <h4 class="dashboard">
                Courses
             </h4>
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
             <h4 class="dashboard">
                Favorites
             </h4>
             <ul class="navlist">
              <li><a href="../course/1">Introduction to software Eng.</a></li>
              <li><a href="../course/1">Introduction to software Eng.</a></li>
              <li><a href="../course/1">Introduction to software Eng.</a></li>
             </ul> 
            </div>
  
        </nav>
        
        
        
        
        
       
   		<div class="well well-lg" style="position: relative; top: 100px; width: 66%; left: 260;
   		 background-color: #FFFFFF; border: 0px; box-shadow: 0 0 0 rgba(0, 0, 0, 0)">
   		
		  <div style="line-height: 30px">
			<p class="coursetitle">"""),_display_(Seq[Any](/*118.28*/course/*118.34*/.name)),format.raw/*118.39*/("""<p>			
		  </div>
		
		  <div>
		   <p class="">(Professor: """),_display_(Seq[Any](/*122.31*/course/*122.37*/.professor_name)),format.raw/*122.52*/(""")<p>
		  </div>	
		
		  <div id="description" style="padding: 30px 0 0 0">  
		   <p class="coursesubtitle">Description<p>
		   <p>"""),_display_(Seq[Any](/*127.10*/course/*127.16*/.description)),format.raw/*127.28*/("""</p>
		  </div>	
			 
		  <div id="uploads" style="padding: 30px 0 0 0">  
			<p class="coursesubtitle">Uploads<p>
			
			<div style="width:100%; min-height: 250px">
			
    		 <a href="google.de" style="float:left; padding-right:30px">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*138.21*/routes/*138.27*/.Assets.at("images/tum.png"))),format.raw/*138.55*/("""">
			   </div>
			   <div> TU München </div>
			  </div>
			 </a>

             <a href="google.de" class="uploaditem">
		 	  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*147.21*/routes/*147.27*/.Assets.at("images/unistuff.png"))),format.raw/*147.60*/("""">
			   </div>
			   <div> Unistuff </div>
			  </div>
			 </a>
			
		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*156.21*/routes/*156.27*/.Assets.at("images/dropbox.png"))),format.raw/*156.59*/("""">
			   </div>
			   <div> Dropbox </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*165.21*/routes/*165.27*/.Assets.at("images/pdf.png"))),format.raw/*165.55*/("""">
			   </div>
			   <div> Student-Summary.pdf </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*174.21*/routes/*174.27*/.Assets.at("images/moodle.png"))),format.raw/*174.58*/("""">
			   </div>
			   <div> Moodle </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*183.21*/routes/*183.27*/.Assets.at("images/facebook.png"))),format.raw/*183.60*/("""">
			   </div>
			   <div> Facebook Group </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*192.21*/routes/*192.27*/.Assets.at("images/pdf.png"))),format.raw/*192.55*/("""">
			   </div>
			   <div> Student-Summary2.pdf </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*201.21*/routes/*201.27*/.Assets.at("images/link.png"))),format.raw/*201.56*/("""">
			   </div>
			   <div> Link </div>
			  </div>
			 </a>	
			
		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*210.21*/routes/*210.27*/.Assets.at("images/piazza.png"))),format.raw/*210.58*/("""">
			   </div>
			   <div> Piazza </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*219.21*/routes/*219.27*/.Assets.at("images/tumonline.png"))),format.raw/*219.61*/("""">
			   </div>
			   <div> TumOnline </div>
			  </div>
			 </a>	

			</div>
						
			<div style="width:100; min-height: 20px;">			
			 <button type="button" class="btn btn-sm btn-primary" data-toggle="modal" data-target="#myModal"
			 style="height: 30px; width: 200px"> Upload more... </button>
			</div>
		
		</div>
		
		
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Upload new teaching material</h4>
              </div>
              <div class="modal-body">
                
                <div class="input-group">
                  <span class="input-group-addon fileinput-button" id="basic-addon1"> Document </span>
                  <input type="file" name="files[]" multiple="" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
                </div>
                
                <span class="btn fileinput-button">
                  <i class="glyphicon glyphicon-plus"></i>
                  <span>Add file</span>
                  <input type="file" multiple="" name="files[]">
                </span>
                
                <div class="row">
                  <div class="col-lg-6">
                    <div class="input-group">
                      <div class="input-group-btn">
                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Action <span class="caret"></span></button>
                        <ul class="dropdown-menu">
                          <li><a href="#">TumOnline</a></li>
                          <li><a href="#">Unistuff</a></li>
                          <li><a href="#">Dropbox</a></li>
                          <li><a href="#">Link</a></li>
                          <li><a href="#">Sonstiges</a></li>
                        </ul>
                      </div><!-- /btn-group -->
                      <input type="text" class="form-control" aria-label="...">
                    </div><!-- /input-group -->
                  </div><!-- /.col-lg-6 -->
                </div>
                
                
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary"> Upload </button>
              </div>
            </div>
          </div>
        </div>		
		
		
		
	
		
		
		
		
         <div id="rating" style="padding: 50px 0 0 0">  
		   <p class="coursesubtitle">Rating<p>
		 
			
			<div style="width:100%; height:30px">
			<div style="float:left; width:300px">Fairness und Unterstützung:</div>			
			<div class="acidjs-rating-stars" style="float:left">
              <form>
                <input type="radio" name="group-1" id="group-1-0" value="5" /><label for="group-1-0"></label>
                <input type="radio" name="group-1" id="group-1-1" value="4" /><label for="group-1-1"></label>
                <input type="radio" name="group-1" id="group-1-2" value="3" /><label for="group-1-2"></label>
                <input type="radio" name="group-1" id="group-1-3" value="2" /><label for="group-1-3"></label>
                <input type="radio" name="group-1" id="group-1-4" value="1" /><label for="group-1-4"></label>
              </form>
            </div>
            </div>
            
            <div style="width:100%; height:30px">
            <div style="float:left; width:300px">Material und Verständlichkeit:</div>            
            <div class="acidjs-rating-stars" style="float:left">
              <form>
                <input type="radio" name="group-2" id="group-2-0" value="5" /><label for="group-2-0"></label>
                <input type="radio" name="group-2" id="group-2-1" value="4" /><label for="group-2-1"></label>
                <input type="radio" name="group-2" id="group-2-2" value="3" /><label for="group-2-2"></label>
                <input type="radio" name="group-2" id="group-2-3" value="2" /><label for="group-2-3"></label>
                <input type="radio" name="group-2" id="group-2-4" value="1" /><label for="group-2-4"></label>
              </form>
            </div>
            </div>
            
            <div style="width:100%; height:30px">
            <div style="float:left; width:300px">Spaß und Interesse:</div>
            <div class="acidjs-rating-stars" style="float:left">
              <form>
                <input type="radio" name="group-3" id="group-3-0" value="5" /><label for="group-3-0"></label>
                <input type="radio" name="group-3" id="group-3-1" value="4" /><label for="group-3-1"></label>
                <input type="radio" name="group-3" id="group-3-2" value="3" /><label for="group-3-2"></label>
                <input type="radio" name="group-3" id="group-3-3" value="2" /><label for="group-3-3"></label>
                <input type="radio" name="group-3" id="group-3-4" value="1" /><label for="group-3-4"></label>
              </form>
            </div>
            </div>
            
            <div style="width:100%; height:30px">
            <div style="float:left; width:300px">Note/Aufwand:</div>
            <div class="acidjs-rating-stars" style="float:left">
              <form>
                <input type="radio" name="group-4" id="group-4-0" value="5" /><label for="group-4-0"></label>
                <input type="radio" name="group-4" id="group-4-1" value="4" /><label for="group-4-1"></label>
                <input type="radio" name="group-4" id="group-4-2" value="3" /><label for="group-4-2"></label>
                <input type="radio" name="group-4" id="group-4-3" value="2" /><label for="group-4-3"></label>
                <input type="radio" name="group-4" id="group-4-4" value="1" /><label for="group-4-4"></label>
              </form>
            </div>
            </div>

            <div style="width:100%; height:30px">
            <div style="float:left; width:300px">Empfehlung:</div>
            <div class="acidjs-rating-stars" style="float:left">
              <form>
                <input type="radio" name="group-5" id="group-5-0" value="5" /><label for="group-5-0"></label>
                <input type="radio" name="group-5" id="group-5-1" value="4" /><label for="group-5-1"></label>
                <input type="radio" name="group-5" id="group-5-2" value="3" /><label for="group-5-2"></label>
                <input type="radio" name="group-5" id="group-5-3" value="2" /><label for="group-5-3"></label>
                <input type="radio" name="group-5" id="group-5-4" value="1" /><label for="group-5-4"></label>
              </form>
            </div>
            </div>
            
			
            
	    	<div style="width:100%; height:30px">
	    		<p class="text-title">Overall Rate: """),_display_(Seq[Any](/*362.45*/course/*362.51*/.rate)),format.raw/*362.56*/(""" </p>
			</div>
			
			<div style="width:100; min-height: 20px;">			
			 <button type="button" class="btn btn-sm btn-primary" style="height: 30px; width: 200px"> 
			 Rate the course </button>
			</div>
			
			
			<!-- <button type="button" class="btn btn-sm btn-primary">Rate this course</button> -->
	
		 </div>
		
		
		
		
		
		
          <div id="comments" style="padding: 50px 0 0 0">  
		    <p class="coursesubtitle">Comments<p>
		    <div class="panel panel-default">
		      <ul class="list-group">
		       <li class="list-group-item"> I took this course last year. It was great!! I learned a lot. :)</li>
		       <li class="list-group-item"> You just need to learn the slides for the exam.</li> 
		   	   <li class="list-group-item"> This professor is so awesome. Its easy to get a good grade.</li>
		      </ul>   
		   	   <textarea type="text" id="comment" class="form-control" style="height: 70px" 
		   	    placeholder="Type in your comment here..." cols="40" rows="5"></textarea>		   	   	
		      </div>
		      
		       <!--<button type="button" class="btn btn- btn-primary" style="float:right">Comment</button>-->
		   	   	<div style="width:100; min-height: 20px; padding-top:0px">			
			     <button type="button" class="btn btn-sm btn-primary" style="height: 30px; width: 200px"> 
			     Comment this course </button>
			   </div>
		      
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
                    DATE: Tue Jun 23 23:53:33 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/viewCourse.scala.html
                    HASH: 9bd173baeffc1a57b0d865333b98498b2d5f0dee
                    MATRIX: 787->1|916->36|983->76|1011->77|1092->131|1120->132|1162->146|1191->147|1283->212|1311->213|1354->228|1383->229|1463->282|1491->283|1530->294|1559->295|1638->347|1666->348|1708->362|1737->363|1795->394|1823->395|1876->420|1905->421|1980->469|2008->470|2063->497|2092->498|2144->523|2172->524|2215->539|2244->540|2294->563|2322->564|2478->684|2493->690|2547->722|2656->795|2671->801|2728->835|2813->884|2828->890|2891->931|2985->989|3000->995|3068->1041|3162->1099|3177->1105|3242->1148|3336->1206|3351->1212|3414->1253|3508->1311|3523->1317|3578->1350|3672->1408|3687->1414|3749->1454|4273->1942|4288->1948|4345->1983|4526->2128|4542->2135|4569->2140|4614->2149|4630->2156|4658->2162|4798->2266|4813->2272|4856->2293|5183->2584|5198->2590|5265->2635|6810->4143|6826->4149|6854->4154|6956->4219|6972->4225|7010->4240|7184->4377|7200->4383|7235->4395|7587->4710|7603->4716|7654->4744|7889->4942|7905->4948|7961->4981|8190->5173|8206->5179|8261->5211|8489->5402|8505->5408|8556->5436|8796->5639|8812->5645|8866->5676|9093->5866|9109->5872|9165->5905|9400->6103|9416->6109|9467->6137|9708->6341|9724->6347|9776->6376|10002->6565|10018->6571|10072->6602|10299->6792|10315->6798|10372->6832|17735->14158|17751->14164|17779->14169
                    LINES: 26->1|29->1|35->7|35->7|39->11|39->11|41->13|41->13|44->16|44->16|46->18|46->18|49->21|49->21|50->22|50->22|53->25|53->25|54->26|54->26|56->28|56->28|58->30|58->30|61->33|61->33|62->34|62->34|64->36|64->36|65->37|65->37|67->39|67->39|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|90->62|90->62|90->62|95->67|95->67|95->67|95->67|95->67|95->67|97->69|97->69|97->69|107->79|107->79|107->79|146->118|146->118|146->118|150->122|150->122|150->122|155->127|155->127|155->127|166->138|166->138|166->138|175->147|175->147|175->147|184->156|184->156|184->156|193->165|193->165|193->165|202->174|202->174|202->174|211->183|211->183|211->183|220->192|220->192|220->192|229->201|229->201|229->201|238->210|238->210|238->210|247->219|247->219|247->219|390->362|390->362|390->362
                    -- GENERATED --
                */
            