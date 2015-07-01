// @SOURCE:C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/conf/routes
// @HASH:1160768a5f84d5c26f5395410598bebe128f39ef
// @DATE:Wed Jul 01 05:29:11 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:48
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:7
// @LINE:6
class ReverseChooseUser {
    

// @LINE:7
// @LINE:6
def login(): Call = {
   () match {
// @LINE:6
case () if true => Call("GET", _prefix)
                                                        
// @LINE:7
case () if true => Call("GET", _prefix + { _defaultPrefix } + "coursematch")
                                                        
   }
}
                                                
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:9
class ReverseCompanyController {
    

// @LINE:24
def saveJob(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/company/dashboard/saveJob")
}
                                                

// @LINE:23
def dashboard(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/dashboard")
}
                                                

// @LINE:26
def editJob(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/company/dashboard/editJob/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:25
def deleteJob(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/dashboard/deleteJob/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:27
def viewToEditJob(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/dashboard/viewToEditJob/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:21
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/logout")
}
                                                

// @LINE:20
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/company/login")
}
                                                

// @LINE:19
// @LINE:9
def login(): Call = {
   () match {
// @LINE:9
case () if true => Call("GET", _prefix + { _defaultPrefix } + "coursematch/company")
                                                        
// @LINE:19
case () if true => Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/login")
                                                        
   }
}
                                                
    
}
                          

// @LINE:48
class ReverseAssets {
    

// @LINE:48
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:8
class ReverseApplication {
    

// @LINE:39
def uploadMaterial(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/student/course/")
}
                                                

// @LINE:38
def saveCourseTags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/course/")
}
                                                

// @LINE:33
def compareCourses(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/compareCourses")
}
                                                

// @LINE:17
def dashboard(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/dashboard")
}
                                                

// @LINE:30
def viewCourse(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/course/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:37
def saveStudentTags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/dashboard/")
}
                                                

// @LINE:15
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/logout")
}
                                                

// @LINE:32
def rateCourse(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/rateCourse/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:35
def saveComment(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:34
def displayCourseRatings(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/displayCourseRatings")
}
                                                

// @LINE:14
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/student/login")
}
                                                

// @LINE:13
// @LINE:8
def login(): Call = {
   () match {
// @LINE:8
case () if true => Call("GET", _prefix + { _defaultPrefix } + "coursematch/student")
                                                        
// @LINE:13
case () if true => Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/login")
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:48
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:7
// @LINE:6
class ReverseChooseUser {
    

// @LINE:7
// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChooseUser.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch"})
      }
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:9
class ReverseCompanyController {
    

// @LINE:24
def saveJob : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.saveJob",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard/saveJob"})
      }
   """
)
                        

// @LINE:23
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard"})
      }
   """
)
                        

// @LINE:26
def editJob : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.editJob",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard/editJob/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:25
def deleteJob : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.deleteJob",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard/deleteJob/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:27
def viewToEditJob : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.viewToEditJob",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard/viewToEditJob/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/logout"})
      }
   """
)
                        

// @LINE:20
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/login"})
      }
   """
)
                        

// @LINE:19
// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/login"})
      }
      }
   """
)
                        
    
}
              

// @LINE:48
class ReverseAssets {
    

// @LINE:48
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:8
class ReverseApplication {
    

// @LINE:39
def uploadMaterial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.uploadMaterial",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/course/"})
      }
   """
)
                        

// @LINE:38
def saveCourseTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveCourseTags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/course/"})
      }
   """
)
                        

// @LINE:33
def compareCourses : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.compareCourses",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/compareCourses"})
      }
   """
)
                        

// @LINE:17
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/dashboard"})
      }
   """
)
                        

// @LINE:30
def viewCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.viewCourse",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:37
def saveStudentTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveStudentTags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/dashboard/"})
      }
   """
)
                        

// @LINE:15
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/logout"})
      }
   """
)
                        

// @LINE:32
def rateCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.rateCourse",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/rateCourse/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:35
def saveComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveComment",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:34
def displayCourseRatings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.displayCourseRatings",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/displayCourseRatings"})
      }
   """
)
                        

// @LINE:14
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/login"})
      }
   """
)
                        

// @LINE:13
// @LINE:8
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/login"})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:48
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:7
// @LINE:6
class ReverseChooseUser {
    

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChooseUser.login(), HandlerDef(this, "controllers.ChooseUser", "login", Seq(), "GET", """ The home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:9
class ReverseCompanyController {
    

// @LINE:24
def saveJob(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.saveJob(), HandlerDef(this, "controllers.CompanyController", "saveJob", Seq(), "POST", """""", _prefix + """coursematch/company/dashboard/saveJob""")
)
                      

// @LINE:23
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.dashboard(), HandlerDef(this, "controllers.CompanyController", "dashboard", Seq(), "GET", """""", _prefix + """coursematch/company/dashboard""")
)
                      

// @LINE:26
def editJob(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.editJob(id), HandlerDef(this, "controllers.CompanyController", "editJob", Seq(classOf[Long]), "POST", """""", _prefix + """coursematch/company/dashboard/editJob/$id<[^/]+>""")
)
                      

// @LINE:25
def deleteJob(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.deleteJob(id), HandlerDef(this, "controllers.CompanyController", "deleteJob", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/company/dashboard/deleteJob/$id<[^/]+>""")
)
                      

// @LINE:27
def viewToEditJob(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.viewToEditJob(id), HandlerDef(this, "controllers.CompanyController", "viewToEditJob", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/company/dashboard/viewToEditJob/$id<[^/]+>""")
)
                      

// @LINE:21
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.logout(), HandlerDef(this, "controllers.CompanyController", "logout", Seq(), "GET", """""", _prefix + """coursematch/company/logout""")
)
                      

// @LINE:20
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.authenticate(), HandlerDef(this, "controllers.CompanyController", "authenticate", Seq(), "POST", """""", _prefix + """coursematch/company/login""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.login(), HandlerDef(this, "controllers.CompanyController", "login", Seq(), "GET", """""", _prefix + """coursematch/company""")
)
                      
    
}
                          

// @LINE:48
class ReverseAssets {
    

// @LINE:48
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /public path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:8
class ReverseApplication {
    

// @LINE:39
def uploadMaterial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.uploadMaterial(), HandlerDef(this, "controllers.Application", "uploadMaterial", Seq(), "POST", """""", _prefix + """coursematch/student/course/""")
)
                      

// @LINE:38
def saveCourseTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveCourseTags(), HandlerDef(this, "controllers.Application", "saveCourseTags", Seq(), "GET", """""", _prefix + """coursematch/student/course/""")
)
                      

// @LINE:33
def compareCourses(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.compareCourses(), HandlerDef(this, "controllers.Application", "compareCourses", Seq(), "GET", """""", _prefix + """coursematch/student/compareCourses""")
)
                      

// @LINE:17
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.dashboard(), HandlerDef(this, "controllers.Application", "dashboard", Seq(), "GET", """""", _prefix + """coursematch/student/dashboard""")
)
                      

// @LINE:30
def viewCourse(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.viewCourse(id), HandlerDef(this, "controllers.Application", "viewCourse", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/student/course/$id<[^/]+>""")
)
                      

// @LINE:37
def saveStudentTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveStudentTags(), HandlerDef(this, "controllers.Application", "saveStudentTags", Seq(), "GET", """""", _prefix + """coursematch/student/dashboard/""")
)
                      

// @LINE:15
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """coursematch/student/logout""")
)
                      

// @LINE:32
def rateCourse(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.rateCourse(id), HandlerDef(this, "controllers.Application", "rateCourse", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/student/rateCourse/$id<[^/]+>""")
)
                      

// @LINE:35
def saveComment(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveComment(id), HandlerDef(this, "controllers.Application", "saveComment", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/student/course/$id<[^/]+>/""")
)
                      

// @LINE:34
def displayCourseRatings(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.displayCourseRatings(), HandlerDef(this, "controllers.Application", "displayCourseRatings", Seq(), "GET", """""", _prefix + """coursematch/student/displayCourseRatings""")
)
                      

// @LINE:14
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """coursematch/student/login""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """coursematch/student""")
)
                      
    
}
                          
}
        
    