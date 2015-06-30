// @SOURCE:C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/conf/routes
// @HASH:81886b1ccee44bfbd9833ff858c09cb36da17467
// @DATE:Tue Jun 30 05:16:09 CEST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_login0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:13
private[this] lazy val controllers_Application_dashboard4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
        

// @LINE:15
private[this] lazy val controllers_Application_viewCourse5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_Application_rateCourse6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rateCourse/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:18
private[this] lazy val controllers_Application_compareCourses7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("compareCourses"))))
        

// @LINE:19
private[this] lazy val controllers_Application_displayCourseRatings8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("displayCourseRatings"))))
        

// @LINE:20
private[this] lazy val controllers_Application_saveComment9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:22
private[this] lazy val controllers_Application_saveStudentTags10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard/"))))
        

// @LINE:23
private[this] lazy val controllers_Application_saveCourseTags11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/"))))
        

// @LINE:24
private[this] lazy val controllers_Application_uploadMaterial12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/"))))
        

// @LINE:28
private[this] lazy val controllers_Assets_at13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.Application.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/$id<[^/]+>""","""controllers.Application.viewCourse(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rateCourse/$id<[^/]+>""","""controllers.Application.rateCourse(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """compareCourses""","""controllers.Application.compareCourses()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """displayCourseRatings""","""controllers.Application.displayCourseRatings()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/$id<[^/]+>/""","""controllers.Application.saveComment(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard/""","""controllers.Application.saveStudentTags()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/""","""controllers.Application.saveCourseTags()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/""","""controllers.Application.uploadMaterial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_login0(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ The home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:13
case controllers_Application_dashboard4(params) => {
   call { 
        invokeHandler(controllers.Application.dashboard(), HandlerDef(this, "controllers.Application", "dashboard", Nil,"GET", """""", Routes.prefix + """dashboard"""))
   }
}
        

// @LINE:15
case controllers_Application_viewCourse5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.viewCourse(id), HandlerDef(this, "controllers.Application", "viewCourse", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_Application_rateCourse6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.rateCourse(id), HandlerDef(this, "controllers.Application", "rateCourse", Seq(classOf[Long]),"GET", """""", Routes.prefix + """rateCourse/$id<[^/]+>"""))
   }
}
        

// @LINE:18
case controllers_Application_compareCourses7(params) => {
   call { 
        invokeHandler(controllers.Application.compareCourses(), HandlerDef(this, "controllers.Application", "compareCourses", Nil,"GET", """""", Routes.prefix + """compareCourses"""))
   }
}
        

// @LINE:19
case controllers_Application_displayCourseRatings8(params) => {
   call { 
        invokeHandler(controllers.Application.displayCourseRatings(), HandlerDef(this, "controllers.Application", "displayCourseRatings", Nil,"GET", """""", Routes.prefix + """displayCourseRatings"""))
   }
}
        

// @LINE:20
case controllers_Application_saveComment9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.saveComment(id), HandlerDef(this, "controllers.Application", "saveComment", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/$id<[^/]+>/"""))
   }
}
        

// @LINE:22
case controllers_Application_saveStudentTags10(params) => {
   call { 
        invokeHandler(controllers.Application.saveStudentTags(), HandlerDef(this, "controllers.Application", "saveStudentTags", Nil,"GET", """""", Routes.prefix + """dashboard/"""))
   }
}
        

// @LINE:23
case controllers_Application_saveCourseTags11(params) => {
   call { 
        invokeHandler(controllers.Application.saveCourseTags(), HandlerDef(this, "controllers.Application", "saveCourseTags", Nil,"GET", """""", Routes.prefix + """course/"""))
   }
}
        

// @LINE:24
case controllers_Application_uploadMaterial12(params) => {
   call { 
        invokeHandler(controllers.Application.uploadMaterial(), HandlerDef(this, "controllers.Application", "uploadMaterial", Nil,"POST", """""", Routes.prefix + """course/"""))
   }
}
        

// @LINE:28
case controllers_Assets_at13(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /public path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     