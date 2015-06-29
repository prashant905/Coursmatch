package controllers;

import static play.data.Form.form;

import java.util.ArrayList;

import models.Comment;
import models.Course;
import models.Job;
import models.Overallranking;
import models.Ranking;
import models.Student;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.compare;
import views.html.dashboard;
import views.html.fiveStarRate;
import views.html.login;
import views.html.viewCourse;

@Security.Authenticated(Secured.class)
public class Application extends Controller {
	final static Form<Overallranking> rankingForm = form(Overallranking.class);

	
	public static Result saveComment(Long id){
		
		 new Comment(Course.findById(id),request().username(),request().getQueryString("commentPlace"));
		 return ok(viewCourse.render(Student.find.byId(request().username()),
					Course.findById(id), Overallranking.findByCourseId(id),Comment.findByCourseId(id)));
	}
	
	public static Result viewCourse(Long id) {
		return ok(viewCourse.render(Student.find.byId(request().username()),
				Course.findById(id), Overallranking.findByCourseId(id),Comment.findByCourseId(id)));
	}

	public static Result dashboard() {
		return ok(dashboard.render(Student.find.byId(request().username()),
				Course.findAll(), Job.findAll()));
	}

	// ------------------------------Compare
	// Courses----------------------------------//
	public static Result compareCourses() {
		ArrayList<Course> courses = new ArrayList<Course>(Course.findAll());
		return ok(compare.render(Student.find.byId(request().username()),
				courses, Job.findAll(), fiveStarRate.render(
						Overallranking.findByCourseId(courses.get(0).id),
						Overallranking.findByCourseId(courses.get(0).id))));
	}

	public static Result displayCourseRatings(){
		Overallranking ranking1 = Overallranking.findByCourseId((long) Double.parseDouble(request()
				.getQueryString("course_1")));
		Overallranking ranking2 = Overallranking.findByCourseId((long) Double.parseDouble(request()
				.getQueryString("course_2")));
		return ok(compare.render(Student.find.byId(request().username()),
				Course.findAll(), Job.findAll(),
				fiveStarRate.render(ranking1,
				ranking2)));
	}

	// -------------------------------------------------------------------------------//

	// ------------------------------ Rate
	// Course-------------------------------------//
	@Transactional
	public static Result rateCourse(Long id) {
		Ranking ranking = new Ranking();
		ranking.course = Course.findById(id);
		ranking.fair = (int) Double.parseDouble(request()
				.getQueryString("fair"));
		ranking.material = (int) Double.parseDouble(request().getQueryString(
				"material"));
		ranking.fun = (int) Double.parseDouble(request().getQueryString("fun"));
		ranking.grade = (int) Double.parseDouble(request().getQueryString(
				"grade").toString());
		ranking.recommend = (int) Double.parseDouble(request().getQueryString(
				"recommend"));
		ranking.overall_rate = ranking.calculateCurrentOverallRate();
		ranking.save();
		Ranking.findOverallRate(id);
		return viewCourse(id);
	}

	// -------------------------------------------------------------------------------//

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

			return redirect(routes.Application.dashboard());
		}
	}

	/**
	 * Logout and clean the session.
	 */
	public static Result logout() {
		flash("success", "You've been logged out");
		return redirect(routes.Application.login());
	}

	// -----------------------------------------------------------------------//
}
