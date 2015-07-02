package controllers;

import static play.data.Form.form;
import models.Student;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;
import controllers.StudentOperationController;

public class StudentController extends Controller {
	
//------------------------------------------------------------------------------------------//
	// ------------------------------ login page and
	// athentication------------------//
	
	public static class Login {

		public String email;
		public String password;

		public String validate() {
			if (Student.authenticate(email, password) == null) {
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
		login.render(form(Login.class)));
	}

	/**
	 * Handle login form submission.
	 */
	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();
		if (loginForm.hasErrors()) {
			return badRequest(login.render(loginForm));
		} else {
			session("email", loginForm.get().email);

			return redirect(routes.StudentOperationController.dashboard());
		}
	}

	/**
	 * Logout and clean the session.
	 */
	public static Result logout() {
		session().clear();
		flash("success", "You've been logged out");
		return redirect(routes.ChooseUser.login());
	}

	// -----------------------------------------------------------------------//
}
