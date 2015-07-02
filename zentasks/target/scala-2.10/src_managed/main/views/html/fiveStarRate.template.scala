
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
object fiveStarRate extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Overallranking,Overallranking,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(ranking1:Overallranking,ranking2:Overallranking):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""
<table>
	<tr>
		<td>
			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">Fairness and
								help:</div></td>
						<td><input id="input-1" name="fair" value=""""),_display_(Seq[Any](/*10.51*/ranking1/*10.59*/.fair)),format.raw/*10.64*/(""""
							class="rating" data-readonly="true" data-min="0" data-max="5"
							data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">Material und
								understanding:</div></td>
						<td><input id="input-3" name="material"
							value=""""),_display_(Seq[Any](/*23.16*/ranking1/*23.24*/.material)),format.raw/*23.33*/("""" class="rating" data-min="0"
							data-readonly="true" data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">fun and
								level of interest:</div></td>
						<td><input id="input-4" name="fun" value=""""),_display_(Seq[Any](/*34.50*/ranking1/*34.58*/.fun)),format.raw/*34.62*/(""""
							class="rating" data-min="0" data-readonly="true" data-max="5"
							data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">grade and
								effort:</div></td>
						<td><input id="input-2" name="grade" value=""""),_display_(Seq[Any](/*46.52*/ranking1/*46.60*/.grade)),format.raw/*46.66*/(""""
							class="rating" data-min="0" data-readonly="true" data-max="5"
							data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">recommendation:</div></td>
						<td><input id="input-2" name="recommend"
							value=""""),_display_(Seq[Any](/*58.16*/ranking1/*58.24*/.recommend)),format.raw/*58.34*/("""" class="rating" data-min="0"
							data-readonly="true" data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<p class="text-title">Overall Rate: """),_display_(Seq[Any](/*65.42*/ranking1/*65.50*/.overall_rate)),format.raw/*65.63*/("""</p>
				<a style="float:right;" href=""""),_display_(Seq[Any](/*66.36*/routes/*66.42*/.StudentOperationController.viewCourse(ranking1.course.id))),format.raw/*66.100*/("""">More Details</a>
			</div>
		</td>
		<td>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">Fairness and
								help:</div></td>
						<td><input id="input-1" name="fair" value=""""),_display_(Seq[Any](/*76.51*/ranking2/*76.59*/.fair)),format.raw/*76.64*/(""""
							class="rating" data-min="0" data-readonly="true" data-max="5"
							data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">Material und
								understanding:</div></td>
						<td><input id="input-3" name="material"
							value="""),_display_(Seq[Any](/*89.15*/ranking2/*89.23*/.material)),format.raw/*89.32*/(""" class="rating" data-min="0"
							data-readonly="true" data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">fun and
								level of interest:</div></td>
						<td><input id="input-4" name="fun" value=""""),_display_(Seq[Any](/*100.50*/ranking2/*100.58*/.fun)),format.raw/*100.62*/(""""
							class="rating" data-min="0" data-readonly="true" data-max="5"
							data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">grade and
								effort:</div></td>
						<td><input id="input-2" name="grade" value=""""),_display_(Seq[Any](/*112.52*/ranking2/*112.60*/.grade)),format.raw/*112.66*/(""""
							class="rating" data-min="0" data-readonly="true" data-max="5"
							data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>

			<div style="width: 100%; height: 30px">
				<table>
					<tr>
						<td><div style="float: left; width: 300px">recommendation:</div></td>
						<td><input id="input-2" name="recommend"
							value=""""),_display_(Seq[Any](/*124.16*/ranking2/*124.24*/.recommend)),format.raw/*124.34*/("""" class="rating" data-min="0"
							data-readonly="true" data-max="5" data-step="0.5" data-size="xs"></td>
					</tr>
				</table>
			</div>



			<div style="width: 100%; height: 30px">
				<p class="text-title">Overall Rate: """),_display_(Seq[Any](/*133.42*/ranking2/*133.50*/.overall_rate)),format.raw/*133.63*/("""</p>
				<a style="float:right;" href=""""),_display_(Seq[Any](/*134.36*/routes/*134.42*/.StudentOperationController.viewCourse(ranking2.course.id))),format.raw/*134.100*/("""">More Details</a>
			</div>
		</td>
	<tr>
</table>
"""))}
    }
    
    def render(ranking1:Overallranking,ranking2:Overallranking): play.api.templates.HtmlFormat.Appendable = apply(ranking1,ranking2)
    
    def f:((Overallranking,Overallranking) => play.api.templates.HtmlFormat.Appendable) = (ranking1,ranking2) => apply(ranking1,ranking2)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jul 02 14:54:05 CEST 2015
                    SOURCE: C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/app/views/fiveStarRate.scala.html
                    HASH: b9901971713109b66dc1c4660788adf964291dd9
                    MATRIX: 804->1|947->50|1216->283|1233->291|1260->296|1681->681|1698->689|1729->698|2128->1061|2145->1069|2171->1073|2571->1437|2588->1445|2616->1451|3017->1816|3034->1824|3066->1834|3336->2068|3353->2076|3388->2089|3465->2130|3480->2136|3561->2194|3854->2451|3871->2459|3898->2464|4318->2848|4335->2856|4366->2865|4765->3227|4783->3235|4810->3239|5211->3603|5229->3611|5258->3617|5660->3982|5678->3990|5711->4000|5986->4238|6004->4246|6040->4259|6118->4300|6134->4306|6216->4364
                    LINES: 26->1|29->1|38->10|38->10|38->10|51->23|51->23|51->23|62->34|62->34|62->34|74->46|74->46|74->46|86->58|86->58|86->58|93->65|93->65|93->65|94->66|94->66|94->66|104->76|104->76|104->76|117->89|117->89|117->89|128->100|128->100|128->100|140->112|140->112|140->112|152->124|152->124|152->124|161->133|161->133|161->133|162->134|162->134|162->134
                    -- GENERATED --
                */
            