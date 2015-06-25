package controllers;


import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import models.*;
import views.html.*;

@Security.Authenticated(Secured.class)
public class Application extends Controller {
  
	private static String loginStudent = "";
    // -- Authentication
	

	public static Result viewAllCourses(){
		 return ok(
		            viewAllCourses.render()
		     );
	}
	
	public static Result viewCourse(Long id ){
		return ok(viewCourse.render(Student.find.byId(request().username()),Course.findById(id)));
	}
	
    public static Result dashboard() {
        return ok(
            dashboard.render(Student.find.byId(request().username()),Course.findAll(),Job.findAll()));
    }
    
    public static class Login {
        
        public String email;
        public String password;
        
        public String validate() {
            if(Student.authenticate(email, password) == null) {
                return "Invalid user or password";
            }
            return null;
        }
        
    }

    /**
     * Login page.
     */
    public static Result login() {
        return ok(
            login.render(form(Login.class))
        );
    }
    
    /**
     * Handle login form submission.
     */
    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session("email", loginForm.get().email);
            
            loginStudent = loginForm.get().email;
            return redirect(
                routes.Application.dashboard()
            );
        }
    }

    /**
     * Logout and clean the session.
     */
    public static Result logout() {
        flash("success", "You've been logged out");
        return redirect(
            routes.Application.login()
        );
    }
  
 
}
