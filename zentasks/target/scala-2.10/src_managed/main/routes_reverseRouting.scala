// @SOURCE:C:/Users/mragab/Desktop/project/Coursmatch/Coursmatch/zentasks/conf/routes
// @HASH:af961fe2907a2b327863c098d555c9ad7ed9b9cb
// @DATE:Mon Jun 29 05:09:25 CEST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:24
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def compareCourses(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "compareCourses")
}
                                                

// @LINE:13
def dashboard(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "dashboard")
}
                                                

// @LINE:15
def viewCourse(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "course/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:17
def rateCourse(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "rateCourse/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:20
def saveComment(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:19
def displayCourseRatings(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "displayCourseRatings")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:9
// @LINE:6
def login(): Call = {
   () match {
// @LINE:6
case () if true => Call("GET", _prefix)
                                                        
// @LINE:9
case () if true => Call("GET", _prefix + { _defaultPrefix } + "login")
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:24
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def compareCourses : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.compareCourses",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "compareCourses"})
      }
   """
)
                        

// @LINE:13
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
      }
   """
)
                        

// @LINE:15
def viewCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.viewCourse",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:17
def rateCourse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.rateCourse",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rateCourse/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:20
def saveComment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveComment",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:19
def displayCourseRatings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.displayCourseRatings",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "displayCourseRatings"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:9
// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:24
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /public path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def compareCourses(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.compareCourses(), HandlerDef(this, "controllers.Application", "compareCourses", Seq(), "GET", """""", _prefix + """compareCourses""")
)
                      

// @LINE:13
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.dashboard(), HandlerDef(this, "controllers.Application", "dashboard", Seq(), "GET", """""", _prefix + """dashboard""")
)
                      

// @LINE:15
def viewCourse(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.viewCourse(id), HandlerDef(this, "controllers.Application", "viewCourse", Seq(classOf[Long]), "GET", """""", _prefix + """course/$id<[^/]+>""")
)
                      

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:17
def rateCourse(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.rateCourse(id), HandlerDef(this, "controllers.Application", "rateCourse", Seq(classOf[Long]), "GET", """""", _prefix + """rateCourse/$id<[^/]+>""")
)
                      

// @LINE:20
def saveComment(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveComment(id), HandlerDef(this, "controllers.Application", "saveComment", Seq(classOf[Long]), "GET", """""", _prefix + """course/$id<[^/]+>/""")
)
                      

// @LINE:19
def displayCourseRatings(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.displayCourseRatings(), HandlerDef(this, "controllers.Application", "displayCourseRatings", Seq(), "GET", """""", _prefix + """displayCourseRatings""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ The home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    