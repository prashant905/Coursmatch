// @SOURCE:C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/conf/routes
// @HASH:95048c8fbca93b0aeaef408464286f7e05bbf1ee
// @DATE:Thu Jul 02 05:45:55 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:44
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers {

// @LINE:44
class ReverseAssets {
    

// @LINE:44
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseStudentController {
    

// @LINE:12
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/logout")
}
                                                

// @LINE:11
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/student/login")
}
                                                

// @LINE:10
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/login")
}
                                                
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseCompanyController {
    

// @LINE:17
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/logout")
}
                                                

// @LINE:16
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/company/login")
}
                                                

// @LINE:15
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/login")
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseCompanyOperationController {
    

// @LINE:20
def saveJob(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/company/dashboard/saveJob")
}
                                                

// @LINE:19
def dashboard(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/dashboard")
}
                                                

// @LINE:22
def editJob(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/company/dashboard/editJob/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:21
def deleteJob(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/dashboard/deleteJob/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:23
def viewToEditJob(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/company/dashboard/viewToEditJob/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:6
class ReverseChooseUser {
    

// @LINE:6
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch")
}
                                                
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseStudentOperationController {
    

// @LINE:35
def uploadMaterial(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "coursematch/student/course/")
}
                                                

// @LINE:34
def saveCourseTags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/course/")
}
                                                

// @LINE:29
def compareCourses(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/compareCourses")
}
                                                

// @LINE:26
def dashboard(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/dashboard")
}
                                                

// @LINE:27
def viewCourse(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/course/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:33
def saveStudentTags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/dashboard/")
}
                                                

// @LINE:28
def rateCourse(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/rateCourse/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:36
def addToFavorites(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/dashboard/addToFavorites/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:31
def saveComment(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:30
def displayCourseRatings(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/displayCourseRatings")
}
                                                

// @LINE:37
def removeFromFavorites(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "coursematch/student/dashboard/removeFromFavorites/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          
}
                  


// @LINE:44
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.javascript {

// @LINE:44
class ReverseAssets {
    

// @LINE:44
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseStudentController {
    

// @LINE:12
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/logout"})
      }
   """
)
                        

// @LINE:11
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentController.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/login"})
      }
   """
)
                        

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentController.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/login"})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseCompanyController {
    

// @LINE:17
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/logout"})
      }
   """
)
                        

// @LINE:16
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/login"})
      }
   """
)
                        

// @LINE:15
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyController.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/login"})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseCompanyOperationController {
    

// @LINE:20
def saveJob : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyOperationController.saveJob",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard/saveJob"})
      }
   """
)
                        

// @LINE:19
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyOperationController.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard"})
      }
   """
)
                        

// @LINE:22
def editJob : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyOperationController.editJob",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard/editJob/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def deleteJob : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyOperationController.deleteJob",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard/deleteJob/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def viewToEditJob : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CompanyOperationController.viewToEditJob",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/company/dashboard/viewToEditJob/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseChooseUser {
    

// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ChooseUser.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch"})
      }
   """
)
                        
    
}
              

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseStudentOperationController {
    

// @LINE:35
def uploadMaterial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.uploadMaterial",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/course/"})
      }
   """
)
                        

// @LINE:34
def saveCourseTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.saveCourseTags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/course/"})
      }
   """
)
                        

// @LINE:29
def compareCourses : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.compareCourses",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/compareCourses"})
      }
   """
)
                        

// @LINE:26
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/dashboard"})
      }
   """
)
                        

// @LINE:27
def viewCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.viewCourse",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:33
def saveStudentTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.saveStudentTags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/dashboard/"})
      }
   """
)
                        

// @LINE:28
def rateCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.rateCourse",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/rateCourse/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:36
def addToFavorites : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.addToFavorites",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/dashboard/addToFavorites/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:31
def saveComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.saveComment",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:30
def displayCourseRatings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.displayCourseRatings",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/displayCourseRatings"})
      }
   """
)
                        

// @LINE:37
def removeFromFavorites : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentOperationController.removeFromFavorites",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "coursematch/student/dashboard/removeFromFavorites/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:44
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:44
class ReverseAssets {
    

// @LINE:44
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /public path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
class ReverseStudentController {
    

// @LINE:12
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentController.logout(), HandlerDef(this, "controllers.StudentController", "logout", Seq(), "GET", """""", _prefix + """coursematch/student/logout""")
)
                      

// @LINE:11
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentController.authenticate(), HandlerDef(this, "controllers.StudentController", "authenticate", Seq(), "POST", """""", _prefix + """coursematch/student/login""")
)
                      

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentController.login(), HandlerDef(this, "controllers.StudentController", "login", Seq(), "GET", """ Authentication""", _prefix + """coursematch/student/login""")
)
                      
    
}
                          

// @LINE:17
// @LINE:16
// @LINE:15
class ReverseCompanyController {
    

// @LINE:17
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.logout(), HandlerDef(this, "controllers.CompanyController", "logout", Seq(), "GET", """""", _prefix + """coursematch/company/logout""")
)
                      

// @LINE:16
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.authenticate(), HandlerDef(this, "controllers.CompanyController", "authenticate", Seq(), "POST", """""", _prefix + """coursematch/company/login""")
)
                      

// @LINE:15
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyController.login(), HandlerDef(this, "controllers.CompanyController", "login", Seq(), "GET", """""", _prefix + """coursematch/company/login""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseCompanyOperationController {
    

// @LINE:20
def saveJob(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyOperationController.saveJob(), HandlerDef(this, "controllers.CompanyOperationController", "saveJob", Seq(), "POST", """""", _prefix + """coursematch/company/dashboard/saveJob""")
)
                      

// @LINE:19
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyOperationController.dashboard(), HandlerDef(this, "controllers.CompanyOperationController", "dashboard", Seq(), "GET", """""", _prefix + """coursematch/company/dashboard""")
)
                      

// @LINE:22
def editJob(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyOperationController.editJob(id), HandlerDef(this, "controllers.CompanyOperationController", "editJob", Seq(classOf[Long]), "POST", """""", _prefix + """coursematch/company/dashboard/editJob/$id<[^/]+>""")
)
                      

// @LINE:21
def deleteJob(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyOperationController.deleteJob(id), HandlerDef(this, "controllers.CompanyOperationController", "deleteJob", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/company/dashboard/deleteJob/$id<[^/]+>""")
)
                      

// @LINE:23
def viewToEditJob(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CompanyOperationController.viewToEditJob(id), HandlerDef(this, "controllers.CompanyOperationController", "viewToEditJob", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/company/dashboard/viewToEditJob/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseChooseUser {
    

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ChooseUser.login(), HandlerDef(this, "controllers.ChooseUser", "login", Seq(), "GET", """ The home page""", _prefix + """coursematch""")
)
                      
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
class ReverseStudentOperationController {
    

// @LINE:35
def uploadMaterial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.uploadMaterial(), HandlerDef(this, "controllers.StudentOperationController", "uploadMaterial", Seq(), "POST", """""", _prefix + """coursematch/student/course/""")
)
                      

// @LINE:34
def saveCourseTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.saveCourseTags(), HandlerDef(this, "controllers.StudentOperationController", "saveCourseTags", Seq(), "GET", """""", _prefix + """coursematch/student/course/""")
)
                      

// @LINE:29
def compareCourses(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.compareCourses(), HandlerDef(this, "controllers.StudentOperationController", "compareCourses", Seq(), "GET", """""", _prefix + """coursematch/student/compareCourses""")
)
                      

// @LINE:26
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.dashboard(), HandlerDef(this, "controllers.StudentOperationController", "dashboard", Seq(), "GET", """""", _prefix + """coursematch/student/dashboard""")
)
                      

// @LINE:27
def viewCourse(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.viewCourse(id), HandlerDef(this, "controllers.StudentOperationController", "viewCourse", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/student/course/$id<[^/]+>""")
)
                      

// @LINE:33
def saveStudentTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.saveStudentTags(), HandlerDef(this, "controllers.StudentOperationController", "saveStudentTags", Seq(), "GET", """""", _prefix + """coursematch/student/dashboard/""")
)
                      

// @LINE:28
def rateCourse(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.rateCourse(id), HandlerDef(this, "controllers.StudentOperationController", "rateCourse", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/student/rateCourse/$id<[^/]+>""")
)
                      

// @LINE:36
def addToFavorites(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.addToFavorites(id), HandlerDef(this, "controllers.StudentOperationController", "addToFavorites", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/student/dashboard/addToFavorites/$id<[^/]+>""")
)
                      

// @LINE:31
def saveComment(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.saveComment(id), HandlerDef(this, "controllers.StudentOperationController", "saveComment", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/student/course/$id<[^/]+>/""")
)
                      

// @LINE:30
def displayCourseRatings(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.displayCourseRatings(), HandlerDef(this, "controllers.StudentOperationController", "displayCourseRatings", Seq(), "GET", """""", _prefix + """coursematch/student/displayCourseRatings""")
)
                      

// @LINE:37
def removeFromFavorites(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentOperationController.removeFromFavorites(id), HandlerDef(this, "controllers.StudentOperationController", "removeFromFavorites", Seq(classOf[Long]), "GET", """""", _prefix + """coursematch/student/dashboard/removeFromFavorites/$id<[^/]+>""")
)
                      
    
}
                          
}
        
    