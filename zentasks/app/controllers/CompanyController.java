package controllers;

import static play.data.Form.form;
import java.util.List;

import models.Company;
import models.Job;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.companyLogin;
import views.html.companyDashboard;
import views.html.editJob;
import controllers.CompanyOperationController;


public class CompanyController extends Controller {
	
	// athentication------------------//
	public static class Login {

		public String email;
		public String password;

		public String validate() {
			if (Company.authenticate(email, password) == null) {
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
		companyLogin.render((form(Login.class))));
	}

	/**
	 * Handle login form submission.
	 */
	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();
		if (loginForm.hasErrors()) {
			return badRequest(companyLogin.render(loginForm));
		} else {
			session("email", loginForm.get().email);

			return redirect(routes.CompanyOperationController.dashboard());
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
