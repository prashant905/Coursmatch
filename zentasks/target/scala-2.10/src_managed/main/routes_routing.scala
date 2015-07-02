// @SOURCE:C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/conf/routes
// @HASH:95048c8fbca93b0aeaef408464286f7e05bbf1ee
// @DATE:Thu Jul 02 05:45:55 CEST 2015


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
private[this] lazy val controllers_ChooseUser_login0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch"))))
        

// @LINE:10
private[this] lazy val controllers_StudentController_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/login"))))
        

// @LINE:11
private[this] lazy val controllers_StudentController_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/login"))))
        

// @LINE:12
private[this] lazy val controllers_StudentController_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/logout"))))
        

// @LINE:15
private[this] lazy val controllers_CompanyController_login4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/login"))))
        

// @LINE:16
private[this] lazy val controllers_CompanyController_authenticate5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/login"))))
        

// @LINE:17
private[this] lazy val controllers_CompanyController_logout6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/logout"))))
        

// @LINE:19
private[this] lazy val controllers_CompanyOperationController_dashboard7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard"))))
        

// @LINE:20
private[this] lazy val controllers_CompanyOperationController_saveJob8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard/saveJob"))))
        

// @LINE:21
private[this] lazy val controllers_CompanyOperationController_deleteJob9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard/deleteJob/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_CompanyOperationController_editJob10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard/editJob/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_CompanyOperationController_viewToEditJob11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/company/dashboard/viewToEditJob/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_StudentOperationController_dashboard12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/dashboard"))))
        

// @LINE:27
private[this] lazy val controllers_StudentOperationController_viewCourse13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/course/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_StudentOperationController_rateCourse14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/rateCourse/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_StudentOperationController_compareCourses15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/compareCourses"))))
        

// @LINE:30
private[this] lazy val controllers_StudentOperationController_displayCourseRatings16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/displayCourseRatings"))))
        

// @LINE:31
private[this] lazy val controllers_StudentOperationController_saveComment17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/course/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"))))
        

// @LINE:33
private[this] lazy val controllers_StudentOperationController_saveStudentTags18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/dashboard/"))))
        

// @LINE:34
private[this] lazy val controllers_StudentOperationController_saveCourseTags19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/course/"))))
        

// @LINE:35
private[this] lazy val controllers_StudentOperationController_uploadMaterial20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/course/"))))
        

// @LINE:36
private[this] lazy val controllers_StudentOperationController_addToFavorites21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/dashboard/addToFavorites/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:37
private[this] lazy val controllers_StudentOperationController_removeFromFavorites22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("coursematch/student/dashboard/removeFromFavorites/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:44
private[this] lazy val controllers_Assets_at23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch""","""controllers.ChooseUser.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/login""","""controllers.StudentController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/login""","""controllers.StudentController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/logout""","""controllers.StudentController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/login""","""controllers.CompanyController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/login""","""controllers.CompanyController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/logout""","""controllers.CompanyController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard""","""controllers.CompanyOperationController.dashboard()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard/saveJob""","""controllers.CompanyOperationController.saveJob()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard/deleteJob/$id<[^/]+>""","""controllers.CompanyOperationController.deleteJob(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard/editJob/$id<[^/]+>""","""controllers.CompanyOperationController.editJob(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/company/dashboard/viewToEditJob/$id<[^/]+>""","""controllers.CompanyOperationController.viewToEditJob(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/dashboard""","""controllers.StudentOperationController.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/course/$id<[^/]+>""","""controllers.StudentOperationController.viewCourse(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/rateCourse/$id<[^/]+>""","""controllers.StudentOperationController.rateCourse(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/compareCourses""","""controllers.StudentOperationController.compareCourses()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/displayCourseRatings""","""controllers.StudentOperationController.displayCourseRatings()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/course/$id<[^/]+>/""","""controllers.StudentOperationController.saveComment(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/dashboard/""","""controllers.StudentOperationController.saveStudentTags()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/course/""","""controllers.StudentOperationController.saveCourseTags()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/course/""","""controllers.StudentOperationController.uploadMaterial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/dashboard/addToFavorites/$id<[^/]+>""","""controllers.StudentOperationController.addToFavorites(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """coursematch/student/dashboard/removeFromFavorites/$id<[^/]+>""","""controllers.StudentOperationController.removeFromFavorites(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_ChooseUser_login0(params) => {
   call { 
        invokeHandler(controllers.ChooseUser.login(), HandlerDef(this, "controllers.ChooseUser", "login", Nil,"GET", """ The home page""", Routes.prefix + """coursematch"""))
   }
}
        

// @LINE:10
case controllers_StudentController_login1(params) => {
   call { 
        invokeHandler(controllers.StudentController.login(), HandlerDef(this, "controllers.StudentController", "login", Nil,"GET", """ Authentication""", Routes.prefix + """coursematch/student/login"""))
   }
}
        

// @LINE:11
case controllers_StudentController_authenticate2(params) => {
   call { 
        invokeHandler(controllers.StudentController.authenticate(), HandlerDef(this, "controllers.StudentController", "authenticate", Nil,"POST", """""", Routes.prefix + """coursematch/student/login"""))
   }
}
        

// @LINE:12
case controllers_StudentController_logout3(params) => {
   call { 
        invokeHandler(controllers.StudentController.logout(), HandlerDef(this, "controllers.StudentController", "logout", Nil,"GET", """""", Routes.prefix + """coursematch/student/logout"""))
   }
}
        

// @LINE:15
case controllers_CompanyController_login4(params) => {
   call { 
        invokeHandler(controllers.CompanyController.login(), HandlerDef(this, "controllers.CompanyController", "login", Nil,"GET", """""", Routes.prefix + """coursematch/company/login"""))
   }
}
        

// @LINE:16
case controllers_CompanyController_authenticate5(params) => {
   call { 
        invokeHandler(controllers.CompanyController.authenticate(), HandlerDef(this, "controllers.CompanyController", "authenticate", Nil,"POST", """""", Routes.prefix + """coursematch/company/login"""))
   }
}
        

// @LINE:17
case controllers_CompanyController_logout6(params) => {
   call { 
        invokeHandler(controllers.CompanyController.logout(), HandlerDef(this, "controllers.CompanyController", "logout", Nil,"GET", """""", Routes.prefix + """coursematch/company/logout"""))
   }
}
        

// @LINE:19
case controllers_CompanyOperationController_dashboard7(params) => {
   call { 
        invokeHandler(controllers.CompanyOperationController.dashboard(), HandlerDef(this, "controllers.CompanyOperationController", "dashboard", Nil,"GET", """""", Routes.prefix + """coursematch/company/dashboard"""))
   }
}
        

// @LINE:20
case controllers_CompanyOperationController_saveJob8(params) => {
   call { 
        invokeHandler(controllers.CompanyOperationController.saveJob(), HandlerDef(this, "controllers.CompanyOperationController", "saveJob", Nil,"POST", """""", Routes.prefix + """coursematch/company/dashboard/saveJob"""))
   }
}
        

// @LINE:21
case controllers_CompanyOperationController_deleteJob9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CompanyOperationController.deleteJob(id), HandlerDef(this, "controllers.CompanyOperationController", "deleteJob", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/company/dashboard/deleteJob/$id<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_CompanyOperationController_editJob10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CompanyOperationController.editJob(id), HandlerDef(this, "controllers.CompanyOperationController", "editJob", Seq(classOf[Long]),"POST", """""", Routes.prefix + """coursematch/company/dashboard/editJob/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_CompanyOperationController_viewToEditJob11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CompanyOperationController.viewToEditJob(id), HandlerDef(this, "controllers.CompanyOperationController", "viewToEditJob", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/company/dashboard/viewToEditJob/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_StudentOperationController_dashboard12(params) => {
   call { 
        invokeHandler(controllers.StudentOperationController.dashboard(), HandlerDef(this, "controllers.StudentOperationController", "dashboard", Nil,"GET", """""", Routes.prefix + """coursematch/student/dashboard"""))
   }
}
        

// @LINE:27
case controllers_StudentOperationController_viewCourse13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentOperationController.viewCourse(id), HandlerDef(this, "controllers.StudentOperationController", "viewCourse", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/student/course/$id<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_StudentOperationController_rateCourse14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentOperationController.rateCourse(id), HandlerDef(this, "controllers.StudentOperationController", "rateCourse", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/student/rateCourse/$id<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_StudentOperationController_compareCourses15(params) => {
   call { 
        invokeHandler(controllers.StudentOperationController.compareCourses(), HandlerDef(this, "controllers.StudentOperationController", "compareCourses", Nil,"GET", """""", Routes.prefix + """coursematch/student/compareCourses"""))
   }
}
        

// @LINE:30
case controllers_StudentOperationController_displayCourseRatings16(params) => {
   call { 
        invokeHandler(controllers.StudentOperationController.displayCourseRatings(), HandlerDef(this, "controllers.StudentOperationController", "displayCourseRatings", Nil,"GET", """""", Routes.prefix + """coursematch/student/displayCourseRatings"""))
   }
}
        

// @LINE:31
case controllers_StudentOperationController_saveComment17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentOperationController.saveComment(id), HandlerDef(this, "controllers.StudentOperationController", "saveComment", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/student/course/$id<[^/]+>/"""))
   }
}
        

// @LINE:33
case controllers_StudentOperationController_saveStudentTags18(params) => {
   call { 
        invokeHandler(controllers.StudentOperationController.saveStudentTags(), HandlerDef(this, "controllers.StudentOperationController", "saveStudentTags", Nil,"GET", """""", Routes.prefix + """coursematch/student/dashboard/"""))
   }
}
        

// @LINE:34
case controllers_StudentOperationController_saveCourseTags19(params) => {
   call { 
        invokeHandler(controllers.StudentOperationController.saveCourseTags(), HandlerDef(this, "controllers.StudentOperationController", "saveCourseTags", Nil,"GET", """""", Routes.prefix + """coursematch/student/course/"""))
   }
}
        

// @LINE:35
case controllers_StudentOperationController_uploadMaterial20(params) => {
   call { 
        invokeHandler(controllers.StudentOperationController.uploadMaterial(), HandlerDef(this, "controllers.StudentOperationController", "uploadMaterial", Nil,"POST", """""", Routes.prefix + """coursematch/student/course/"""))
   }
}
        

// @LINE:36
case controllers_StudentOperationController_addToFavorites21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentOperationController.addToFavorites(id), HandlerDef(this, "controllers.StudentOperationController", "addToFavorites", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/student/dashboard/addToFavorites/$id<[^/]+>"""))
   }
}
        

// @LINE:37
case controllers_StudentOperationController_removeFromFavorites22(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentOperationController.removeFromFavorites(id), HandlerDef(this, "controllers.StudentOperationController", "removeFromFavorites", Seq(classOf[Long]),"GET", """""", Routes.prefix + """coursematch/student/dashboard/removeFromFavorites/$id<[^/]+>"""))
   }
}
        

// @LINE:44
case controllers_Assets_at23(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /public path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     