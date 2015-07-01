// @SOURCE:C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/conf/routes
// @HASH:1160768a5f84d5c26f5395410598bebe128f39ef
// @DATE:Wed Jul 01 05:29:11 CEST 2015


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
private[this] lazy val controllers_ChooseUser_login0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_ChooseUser_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch"))))
        

// @LINE:8
private[this] lazy val controllers_Application_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student"))))
        

// @LINE:9
private[this] lazy val controllers_CompanyController_login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company"))))
        

// @LINE:13
private[this] lazy val controllers_Application_login4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/login"))))
        

// @LINE:14
private[this] lazy val controllers_Application_authenticate5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/login"))))
        

// @LINE:15
private[this] lazy val controllers_Application_logout6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/logout"))))
        

// @LINE:17
private[this] lazy val controllers_Application_dashboard7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/dashboard"))))
        

// @LINE:19
private[this] lazy val controllers_CompanyController_login8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/login"))))
        

// @LINE:20
private[this] lazy val controllers_CompanyController_authenticate9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/login"))))
        

// @LINE:21
private[this] lazy val controllers_CompanyController_logout10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/logout"))))
        

// @LINE:23
private[this] lazy val controllers_CompanyController_dashboard11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard"))))
        

// @LINE:24
private[this] lazy val controllers_CompanyController_saveJob12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard/saveJob"))))
        

// @LINE:25
private[this] lazy val controllers_CompanyController_deleteJob13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard/deleteJob/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_CompanyController_editJob14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard/editJob/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:27
private[this] lazy val controllers_CompanyController_viewToEditJob15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard/viewToEditJob/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:30
private[this] lazy val controllers_Application_viewCourse16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/course/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Application_rateCourse17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/rateCourse/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:33
private[this] lazy val controllers_Application_compareCourses18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/compareCourses"))))
        

// @LINE:34
private[this] lazy val controllers_Application_displayCourseRatings19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/displayCourseRatings"))))
        

// @LINE:35
private[this] lazy val controllers_Application_saveComment20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/course/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:37
private[this] lazy val controllers_Application_saveStudentTags21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/dashboard/"))))
        

// @LINE:38
private[this] lazy val controllers_Application_saveCourseTags22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/course/"))))
        

// @LINE:39
private[this] lazy val controllers_Application_uploadMaterial23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/course/"))))
        

// @LINE:48
private[this] lazy val controllers_Assets_at24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.ChooseUser.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch""","""controllers.ChooseUser.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company""","""controllers.CompanyController.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/dashboard""","""controllers.Application.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/login""","""controllers.CompanyController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/login""","""controllers.CompanyController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/logout""","""controllers.CompanyController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard""","""controllers.CompanyController.dashboard()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard/saveJob""","""controllers.CompanyController.saveJob()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard/deleteJob/$id<[^/]+>""","""controllers.CompanyController.deleteJob(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard/editJob/$id<[^/]+>""","""controllers.CompanyController.editJob(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard/viewToEditJob/$id<[^/]+>""","""controllers.CompanyController.viewToEditJob(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/course/$id<[^/]+>""","""controllers.Application.viewCourse(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/rateCourse/$id<[^/]+>""","""controllers.Application.rateCourse(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/compareCourses""","""controllers.Application.compareCourses()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/displayCourseRatings""","""controllers.Application.displayCourseRatings()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/course/$id<[^/]+>/""","""controllers.Application.saveComment(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/dashboard/""","""controllers.Application.saveStudentTags()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/course/""","""controllers.Application.saveCourseTags()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/course/""","""controllers.Application.uploadMaterial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ChooseUser_login0(params) => {
   call { 
        invokeHandler(controllers.ChooseUser.login(), HandlerDef(this, "controllers.ChooseUser", "login", Nil,"GET", """ The home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_ChooseUser_login1(params) => {
   call { 
        invokeHandler(controllers.ChooseUser.login(), HandlerDef(this, "controllers.ChooseUser", "login", Nil,"GET", """""", Routes.prefix + """coursematch"""))
   }
}
        

// @LINE:8
case controllers_Application_login2(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """coursematch/student"""))
   }
}
        

// @LINE:9
case controllers_CompanyController_login3(params) => {
   call { 
        invokeHandler(controllers.CompanyController.login(), HandlerDef(this, "controllers.CompanyController", "login", Nil,"GET", """""", Routes.prefix + """coursematch/company"""))
   }
}
        

// @LINE:13
case controllers_Application_login4(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ Authentication""", Routes.prefix + """coursematch/student/login"""))
   }
}
        

// @LINE:14
case controllers_Application_authenticate5(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """coursematch/student/login"""))
   }
}
        

// @LINE:15
case controllers_Application_logout6(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """coursematch/student/logout"""))
   }
}
        

// @LINE:17
case controllers_Application_dashboard7(params) => {
   call { 
        invokeHandler(controllers.Application.dashboard(), HandlerDef(this, "controllers.Application", "dashboard", Nil,"GET", """""", Routes.prefix + """coursematch/student/dashboard"""))
   }
}
        

// @LINE:19
case controllers_CompanyController_login8(params) => {
   call { 
        invokeHandler(controllers.CompanyController.login(), HandlerDef(this, "controllers.CompanyController", "login", Nil,"GET", """""", Routes.prefix + """coursematch/company/login"""))
   }
}
        

// @LINE:20
case controllers_CompanyController_authenticate9(params) => {
   call { 
        invokeHandler(controllers.CompanyController.authenticate(), HandlerDef(this, "controllers.CompanyController", "authenticate", Nil,"POST", """""", Routes.prefix + """coursematch/company/login"""))
   }
}
        

// @LINE:21
case controllers_CompanyController_logout10(params) => {
   call { 
        invokeHandler(controllers.CompanyController.logout(), HandlerDef(this, "controllers.CompanyController", "logout", Nil,"GET", """""", Routes.prefix + """coursematch/company/logout"""))
   }
}
        

// @LINE:23
case controllers_CompanyController_dashboard11(params) => {
   call { 
        invokeHandler(controllers.CompanyController.dashboard(), HandlerDef(this, "controllers.CompanyController", "dashboard", Nil,"GET", """""", Routes.prefix + """coursematch/company/dashboard"""))
   }
}
        

// @LINE:24
case controllers_CompanyController_saveJob12(params) => {
   call { 
        invokeHandler(controllers.CompanyController.saveJob(), HandlerDef(this, "controllers.CompanyController", "saveJob", Nil,"POST", """""", Routes.prefix + """coursematch/company/dashboard/saveJob"""))
   }
}
        

// @LINE:25
case controllers_CompanyController_deleteJob13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CompanyController.deleteJob(id), HandlerDef(this, "controllers.CompanyController", "deleteJob", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/company/dashboard/deleteJob/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_CompanyController_editJob14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CompanyController.editJob(id), HandlerDef(this, "controllers.CompanyController", "editJob", Seq(classOf[Long]),"POST", """""", Routes.prefix + """coursematch/company/dashboard/editJob/$id<[^/]+>"""))
   }
}
        

// @LINE:27
case controllers_CompanyController_viewToEditJob15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CompanyController.viewToEditJob(id), HandlerDef(this, "controllers.CompanyController", "viewToEditJob", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/company/dashboard/viewToEditJob/$id<[^/]+>"""))
   }
}
        

// @LINE:30
case controllers_Application_viewCourse16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.viewCourse(id), HandlerDef(this, "controllers.Application", "viewCourse", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/student/course/$id<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Application_rateCourse17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.rateCourse(id), HandlerDef(this, "controllers.Application", "rateCourse", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/student/rateCourse/$id<[^/]+>"""))
   }
}
        

// @LINE:33
case controllers_Application_compareCourses18(params) => {
   call { 
        invokeHandler(controllers.Application.compareCourses(), HandlerDef(this, "controllers.Application", "compareCourses", Nil,"GET", """""", Routes.prefix + """coursematch/student/compareCourses"""))
   }
}
        

// @LINE:34
case controllers_Application_displayCourseRatings19(params) => {
   call { 
        invokeHandler(controllers.Application.displayCourseRatings(), HandlerDef(this, "controllers.Application", "displayCourseRatings", Nil,"GET", """""", Routes.prefix + """coursematch/student/displayCourseRatings"""))
   }
}
        

// @LINE:35
case controllers_Application_saveComment20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.saveComment(id), HandlerDef(this, "controllers.Application", "saveComment", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/student/course/$id<[^/]+>/"""))
   }
}
        

// @LINE:37
case controllers_Application_saveStudentTags21(params) => {
   call { 
        invokeHandler(controllers.Application.saveStudentTags(), HandlerDef(this, "controllers.Application", "saveStudentTags", Nil,"GET", """""", Routes.prefix + """coursematch/student/dashboard/"""))
   }
}
        

// @LINE:38
case controllers_Application_saveCourseTags22(params) => {
   call { 
        invokeHandler(controllers.Application.saveCourseTags(), HandlerDef(this, "controllers.Application", "saveCourseTags", Nil,"GET", """""", Routes.prefix + """coursematch/student/course/"""))
   }
}
        

// @LINE:39
case controllers_Application_uploadMaterial23(params) => {
   call { 
        invokeHandler(controllers.Application.uploadMaterial(), HandlerDef(this, "controllers.Application", "uploadMaterial", Nil,"POST", """""", Routes.prefix + """coursematch/student/course/"""))
   }
}
        

// @LINE:48
case controllers_Assets_at24(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /public path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     