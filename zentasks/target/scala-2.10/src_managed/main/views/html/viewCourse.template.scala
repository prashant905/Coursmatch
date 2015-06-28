
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
object viewCourse extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Student,Course,Overallranking,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(student: Student , course :Course , ranking:Overallranking):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

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
                
        <script src=""""),_display_(Seq[Any](/*50.23*/routes/*50.29*/.Assets.at("javascripts/star-rating.js"))),format.raw/*50.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*51.23*/routes/*51.29*/.Assets.at("javascripts/star-rating.min.js"))),format.raw/*51.73*/(""""></script>
        
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
		
	"""),_display_(Seq[Any](/*283.3*/(course :Course ,ranking :Overallranking))),format.raw/*283.44*/("""
<form action=""""),_display_(Seq[Any](/*284.16*/routes/*284.22*/.Application.rateCourse(course.id))),format.raw/*284.56*/("""">
         <div id="rating" style="padding: 50px 0 0 0">  
		   <p class="coursesubtitle">Rating<p>
		 
			
			<div style="width:100%; height:30px">
			<table>
				<tr>
					<td><div style="float:left; width:300px">Fairness and help:</div></td>		
					<td><input id="input-1" name ="fair" value=""""),_display_(Seq[Any](/*293.51*/ranking/*293.58*/.fair)),format.raw/*293.63*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs">
					</td>
            	</tr>
            </table>
            </div>
            </div>
            
            <div style="width:100%; height:30px">
			<table>
				<tr>            
            		<td><div style="float:left; width:300px">Material und understanding:</div></td>            
          			 <td><input id="input-3" name="material" value=""""),_display_(Seq[Any](/*304.63*/ranking/*304.70*/.material)),format.raw/*304.79*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"></td>
            	</tr>
            </table>
            </div>
            
            <div style="width:100%; height:30px">
			<table>
				<tr>               
            		<td><div style="float:left; width:300px">fun and level of interest:</div></td>
            		<td><input id="input-4" name="fun" value=""""),_display_(Seq[Any](/*313.58*/ranking/*313.65*/.fun)),format.raw/*313.69*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"></td>
            	</tr>
            </table>
            </div>
            
            <div style="width:100%; height:30px">
			<table>
				<tr>               
          			  <td><div style="float:left; width:300px">grade and effort:</div></td>
          			  <td><input id="input-2" name="grade" value=""""),_display_(Seq[Any](/*322.61*/ranking/*322.68*/.grade)),format.raw/*322.74*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"></td>
            	</tr>
            </table>
            </div>

            <div style="width:100%; height:30px">
			<table>
				<tr>                  
		            <td><div style="float:left; width:300px">recommendation:</div></td>
		   			<td><input id="input-2" name="recommend" value=""""),_display_(Seq[Any](/*331.58*/ranking/*331.65*/.recommend)),format.raw/*331.75*/("""" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"></td>
            	</tr>
            </table>
            </div>
            
			
            
	    	<div style="width:100%; height:30px">
	    		<p class="text-title">Overall Rate: """),_display_(Seq[Any](/*339.45*/ranking/*339.52*/.overall_rate)),format.raw/*339.65*/(""" </p>
			</div>
			<div style="width:100; min-height: 20px;">			
			 <button type="submit" class="btn btn-sm btn-primary" style="height: 30px; width: 200px"> 
			 Rate the course </button>
			</div>
			</form>
			

		
	
		
		
		
		
			
				
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
    
    def render(student:Student,course:Course,ranking:Overallranking): play.api.templates.HtmlFormat.Appendable = apply(student,course,ranking)
    
    def f:((Student,Course,Overallranking) => play.api.templates.HtmlFormat.Appendable) = (student,course,ranking) => apply(student,course,ranking)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 28 21:57:28 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/viewCourse.scala.html
                    HASH: 38a3fcee55a42e655bd2d4d6b585c819e2521f34
                    MATRIX: 802->1|956->61|1023->101|1051->102|1132->156|1160->157|1202->171|1231->172|1323->237|1351->238|1394->253|1423->254|1503->307|1531->308|1570->319|1599->320|1678->372|1706->373|1748->387|1777->388|1835->419|1863->420|1916->445|1945->446|2020->494|2048->495|2103->522|2132->523|2184->548|2212->549|2255->564|2284->565|2334->588|2362->589|2518->709|2533->715|2587->747|2696->820|2711->826|2768->860|2853->909|2868->915|2935->960|3061->1050|3076->1056|3140->1097|3257->1178|3272->1184|3340->1229|3420->1273|3435->1279|3497->1319|3568->1354|3583->1360|3649->1404|4173->1892|4188->1898|4245->1933|4426->2078|4442->2085|4469->2090|4514->2099|4530->2106|4558->2112|4698->2216|4713->2222|4756->2243|5083->2534|5098->2540|5165->2585|6710->4093|6726->4099|6754->4104|6856->4169|6872->4175|6910->4190|7084->4327|7100->4333|7135->4345|7487->4660|7503->4666|7554->4694|7789->4892|7805->4898|7861->4931|8090->5123|8106->5129|8161->5161|8389->5352|8405->5358|8456->5386|8696->5589|8712->5595|8766->5626|8993->5816|9009->5822|9065->5855|9300->6053|9316->6059|9367->6087|9608->6291|9624->6297|9676->6326|9902->6515|9918->6521|9972->6552|10199->6742|10215->6748|10272->6782|13175->9649|13239->9690|13293->9707|13309->9713|13366->9747|13710->10054|13727->10061|13755->10066|14230->10504|14247->10511|14279->10520|14712->10916|14729->10923|14756->10927|15184->11318|15201->11325|15230->11331|15643->11707|15660->11714|15693->11724|15995->11989|16012->11996|16048->12009
                    LINES: 26->1|29->1|35->7|35->7|39->11|39->11|41->13|41->13|44->16|44->16|46->18|46->18|49->21|49->21|50->22|50->22|53->25|53->25|54->26|54->26|56->28|56->28|58->30|58->30|61->33|61->33|62->34|62->34|64->36|64->36|65->37|65->37|67->39|67->39|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|78->50|78->50|78->50|79->51|79->51|79->51|90->62|90->62|90->62|95->67|95->67|95->67|95->67|95->67|95->67|97->69|97->69|97->69|107->79|107->79|107->79|146->118|146->118|146->118|150->122|150->122|150->122|155->127|155->127|155->127|166->138|166->138|166->138|175->147|175->147|175->147|184->156|184->156|184->156|193->165|193->165|193->165|202->174|202->174|202->174|211->183|211->183|211->183|220->192|220->192|220->192|229->201|229->201|229->201|238->210|238->210|238->210|247->219|247->219|247->219|311->283|311->283|312->284|312->284|312->284|321->293|321->293|321->293|332->304|332->304|332->304|341->313|341->313|341->313|350->322|350->322|350->322|359->331|359->331|359->331|367->339|367->339|367->339
                    -- GENERATED --
                */
            