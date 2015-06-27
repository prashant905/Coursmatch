
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
object viewCourse extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Student,Course,Ranking,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , course :Course ,ranking :Ranking):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.55*/("""

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
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*46.46*/routes/*46.52*/.Assets.at("javascripts/jquery-2.1.4.min.js"))),format.raw/*46.97*/(""""></script>
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*47.78*/routes/*47.84*/.Assets.at("stylesheets/star-rating.css"))),format.raw/*47.125*/("""">
                <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*48.78*/routes/*48.84*/.Assets.at("stylesheets/star-rating.min.css"))),format.raw/*48.129*/("""">
        <script src=""""),_display_(Seq[Any](/*49.23*/routes/*49.29*/.Assets.at("javascripts/star-rating.js"))),format.raw/*49.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*50.23*/routes/*50.29*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*50.73*/(""""></script>
        
          <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    </head>
    <body>
        
        <header style="padding-top: 12px">
            
            <a href="/dashboard" id="logo"> 
             <img src=""""),_display_(Seq[Any](/*61.25*/routes/*61.31*/.Assets.at("images/logo-white.png"))),format.raw/*61.66*/("""" height="26px">
            </a>
            
            <dl id="user" >
                <dt style="padding-top: 10px">
                 """),_display_(Seq[Any](/*66.19*/student/*66.26*/.name)),format.raw/*66.31*/(""" <span>("""),_display_(Seq[Any](/*66.40*/student/*66.47*/.email)),format.raw/*66.53*/(""")</span></dt>
                <dd>
                  <a class="glyphicon glyphicon-off logout" href=""""),_display_(Seq[Any](/*68.68*/routes/*68.74*/.Application.logout())),format.raw/*68.95*/("""" style="padding: 8px 5px;"> 
                   <b style="font-family:arial; font-size: 14px"> Logout </b>
                  </a>    
                </dd>
            </dl>
        </header>
       
        
	  	<nav>
		    <div style="padding: 10px 0 0 15px">
		     <img src=""""),_display_(Seq[Any](/*78.19*/routes/*78.25*/.Assets.at("images/TU_Muenchen_Logo.svg.png"))),format.raw/*78.70*/("""" height="60px">
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
			<p class="coursetitle">"""),_display_(Seq[Any](/*117.28*/course/*117.34*/.name)),format.raw/*117.39*/("""<p>			
		  </div>
		
		  <div>
		   <p class="">(Professor: """),_display_(Seq[Any](/*121.31*/course/*121.37*/.professor_name)),format.raw/*121.52*/(""")<p>
		  </div>	
		
		  <div id="description" style="padding: 30px 0 0 0">  
		   <p class="coursesubtitle">Description<p>
		   <p>"""),_display_(Seq[Any](/*126.10*/course/*126.16*/.description)),format.raw/*126.28*/("""</p>
		  </div>	
			 
		  <div id="uploads" style="padding: 30px 0 0 0">  
			<p class="coursesubtitle">Uploads<p>
			
			<div style="width:100%; min-height: 250px">
			
    		 <a href="google.de" style="float:left; padding-right:30px">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*137.21*/routes/*137.27*/.Assets.at("images/tum.png"))),format.raw/*137.55*/("""">
			   </div>
			   <div> TU München </div>
			  </div>
			 </a>

             <a href="google.de" class="uploaditem">
		 	  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*146.21*/routes/*146.27*/.Assets.at("images/unistuff.png"))),format.raw/*146.60*/("""">
			   </div>
			   <div> Unistuff </div>
			  </div>
			 </a>
			
		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*155.21*/routes/*155.27*/.Assets.at("images/dropbox.png"))),format.raw/*155.59*/("""">
			   </div>
			   <div> Dropbox </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*164.21*/routes/*164.27*/.Assets.at("images/pdf.png"))),format.raw/*164.55*/("""">
			   </div>
			   <div> Student-Summary.pdf </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*173.21*/routes/*173.27*/.Assets.at("images/moodle.png"))),format.raw/*173.58*/("""">
			   </div>
			   <div> Moodle </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*182.21*/routes/*182.27*/.Assets.at("images/facebook.png"))),format.raw/*182.60*/("""">
			   </div>
			   <div> Facebook Group </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*191.21*/routes/*191.27*/.Assets.at("images/pdf.png"))),format.raw/*191.55*/("""">
			   </div>
			   <div> Student-Summary2.pdf </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*200.21*/routes/*200.27*/.Assets.at("images/link.png"))),format.raw/*200.56*/("""">
			   </div>
			   <div> Link </div>
			  </div>
			 </a>	
			
		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*209.21*/routes/*209.27*/.Assets.at("images/piazza.png"))),format.raw/*209.58*/("""">
			   </div>
			   <div> Piazza </div>
			  </div>
			 </a>			

		   	 <a href="google.de" class="uploaditem">
			  <div> 
			   <div class="uploaditembox"> 
			      <img src=""""),_display_(Seq[Any](/*218.21*/routes/*218.27*/.Assets.at("images/tumonline.png"))),format.raw/*218.61*/("""">
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
			<table>
				<tr>
					<td><div style="float:left; width:300px">Fairness and help:</div></td>		
					<td><input id="input-1" value=""""),_display_(Seq[Any](/*297.38*/ranking/*297.45*/.fair)),format.raw/*297.50*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"></td>
            	</tr>
            </table>
            </div>
            </div>
            
            <div style="width:100%; height:30px">
			<table>
				<tr>            
            		<td><div style="float:left; width:300px">Material und understanding:</div></td>            
          			 <td><input id="input-2" value=""""),_display_(Seq[Any](/*307.47*/ranking/*307.54*/.material)),format.raw/*307.63*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"></td>
            	</tr>
            </table>
            </div>
            
            <div style="width:100%; height:30px">
			<table>
				<tr>               
            		<td><div style="float:left; width:300px">fun and level of interest:</div></td>
            		<td><input id="input-2" value=""""),_display_(Seq[Any](/*316.47*/ranking/*316.54*/.fun)),format.raw/*316.58*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"></td>
            	</tr>
            </table>
            </div>
            
            <div style="width:100%; height:30px">
			<table>
				<tr>               
          			  <td><div style="float:left; width:300px">grade and effort:</div></td>
          			  <td><input id="input-2" value=""""),_display_(Seq[Any](/*325.48*/ranking/*325.55*/.grade)),format.raw/*325.61*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"></td>
            	</tr>
            </table>
            </div>

            <div style="width:100%; height:30px">
			<table>
				<tr>                  
		            <td><div style="float:left; width:300px">recommendation:</div></td>
		   			<td><input id="input-2" value=""""),_display_(Seq[Any](/*334.41*/ranking/*334.48*/.recommend)),format.raw/*334.58*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"></td>
            	</tr>
            </table>
            </div>
            
			
            
	    	<div style="width:100%; height:30px">
	    		<p class="text-title">Overall Rate: """),_display_(Seq[Any](/*342.45*/course/*342.51*/.rate)),format.raw/*342.56*/(""" </p>
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
    
    def render(student:Student,course:Course,ranking:Ranking): play.api.templates.HtmlFormat.Appendable = apply(student,course,ranking)
    
    def f:((Student,Course,Ranking) => play.api.templates.HtmlFormat.Appendable) = (student,course,ranking) => apply(student,course,ranking)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jun 27 21:23:55 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/viewCourse.scala.html
                    HASH: 34d9708e33753478b13871847c676b43ea746587
                    MATRIX: 795->1|942->54|1009->94|1037->95|1118->149|1146->150|1188->164|1217->165|1309->230|1337->231|1380->246|1409->247|1489->300|1517->301|1556->312|1585->313|1664->365|1692->366|1734->380|1763->381|1821->412|1849->413|1902->438|1931->439|2006->487|2034->488|2089->515|2118->516|2170->541|2198->542|2241->557|2270->558|2320->581|2348->582|2504->702|2519->708|2573->740|2682->813|2697->819|2754->853|2839->902|2854->908|2921->953|3047->1043|3062->1049|3126->1090|3243->1171|3258->1177|3326->1222|3388->1248|3403->1254|3465->1294|3536->1329|3551->1335|3617->1379|4141->1867|4156->1873|4213->1908|4394->2053|4410->2060|4437->2065|4482->2074|4498->2081|4526->2087|4666->2191|4681->2197|4724->2218|5051->2509|5066->2515|5133->2560|6678->4068|6694->4074|6722->4079|6824->4144|6840->4150|6878->4165|7052->4302|7068->4308|7103->4320|7455->4635|7471->4641|7522->4669|7757->4867|7773->4873|7829->4906|8058->5098|8074->5104|8129->5136|8357->5327|8373->5333|8424->5361|8664->5564|8680->5570|8734->5601|8961->5791|8977->5797|9033->5830|9268->6028|9284->6034|9335->6062|9576->6266|9592->6272|9644->6301|9870->6490|9886->6496|9940->6527|10167->6717|10183->6723|10240->6757|13459->9939|13476->9946|13504->9951|13956->10366|13973->10373|14005->10382|14427->10767|14444->10774|14471->10778|14886->11156|14903->11163|14932->11169|15328->11528|15345->11535|15378->11545|15680->11810|15696->11816|15724->11821
                    LINES: 26->1|29->1|35->7|35->7|39->11|39->11|41->13|41->13|44->16|44->16|46->18|46->18|49->21|49->21|50->22|50->22|53->25|53->25|54->26|54->26|56->28|56->28|58->30|58->30|61->33|61->33|62->34|62->34|64->36|64->36|65->37|65->37|67->39|67->39|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|89->61|89->61|89->61|94->66|94->66|94->66|94->66|94->66|94->66|96->68|96->68|96->68|106->78|106->78|106->78|145->117|145->117|145->117|149->121|149->121|149->121|154->126|154->126|154->126|165->137|165->137|165->137|174->146|174->146|174->146|183->155|183->155|183->155|192->164|192->164|192->164|201->173|201->173|201->173|210->182|210->182|210->182|219->191|219->191|219->191|228->200|228->200|228->200|237->209|237->209|237->209|246->218|246->218|246->218|325->297|325->297|325->297|335->307|335->307|335->307|344->316|344->316|344->316|353->325|353->325|353->325|362->334|362->334|362->334|370->342|370->342|370->342
                    -- GENERATED --
                */
            