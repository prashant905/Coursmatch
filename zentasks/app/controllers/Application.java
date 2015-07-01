package controllers;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.Arrays;

import models.Comment;
import models.Course;
import models.Job;
import models.Overallranking;
import models.Ranking;
import models.Student;
import models.Uploads;
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
	
	private static ArrayList<Course> matchedCourses = new ArrayList<Course>();
	private  static ArrayList<Job> matchedJobs =  new ArrayList<Job>();
	
	public static void recommendationSystem(Student student){
		String student_course_tags = student.course_tags;
		String student_job_tags = student.job_tags;
		ArrayList<String> favCourseTags = new ArrayList<String>(Arrays.asList(student_course_tags.split(",")));
		ArrayList<String> favJobTags = new ArrayList<String>(Arrays.asList(student_job_tags.split(",")));
		ArrayList<Course> courses = new ArrayList<Course>(Course.findAll());
		matchedCourses = new ArrayList<Course>();
		
		ArrayList<Job> jobs = new ArrayList<Job>(Job.findAll());
		matchedJobs = new ArrayList<Job>();
		if(!student_course_tags.isEmpty()){
			for(Course course : courses){
				ArrayList<String> ct = new ArrayList<String>(Arrays.asList(course.tags.split(",")));
					for(String tag : ct){
						if(!tag.isEmpty()){
							for(String favTag:favCourseTags){
								if((favTag.toLowerCase().contains(tag.replaceAll("\\s+","").toLowerCase()))){
									if(!matchedCourses.contains(course))
										matchedCourses.add(course);
								}
							}
						}
					}
			}
		}
		if(!student_job_tags.isEmpty()){
			for(Job job : jobs){
				ArrayList<String> jt = new ArrayList<String>(Arrays.asList(job.tags.split(",")));
				for(String tag : jt){
					if(!tag.isEmpty()){
						for(String favTag:favJobTags){
							if((favTag.toLowerCase().contains(tag.replaceAll("\\s+","").toLowerCase()))){
								if(!matchedJobs.contains(job))
									matchedJobs.add(job);
							}
						}
					}
				}
			}
		}
	}
	
	//----------------------------------save tags----------------------------//
	public static Result saveStudentTags(){
		DynamicForm form = form().bindFromRequest();
		Student student = Student.findByEmail(request().username());
		student.course_tags = form.get("course_tags");
		student.job_tags = form.get("job_tags");
		student.update();
		return redirect(routes.Application.dashboard());
	}
	
	public static Result saveCourseTags(){
		DynamicForm form = form().bindFromRequest();
		long courseId = (long) Double.parseDouble(form.get("course_id"));
		Course course = Course.findById(courseId);
		course.tags = form.get("course_tags");
		course.update();
		return redirect(routes.Application.viewCourse(courseId));
	}
//-------------------------------------------------------------------------------//
//------------------------------save comments------------------------------------//
	public static Result saveComment(Long id){
		DynamicForm form = form().bindFromRequest();
		 new Comment(Course.findById(id),request().username(),form.get("commentPlace"));
		 return viewCourse(id);
	}
//------------------------------------------------------------------------------//	
	public static Result viewCourse(Long id) {
		Course course = Course.findById(id);
		Student student = Student.find.byId(request().username());
		recommendationSystem(student);
		return ok(viewCourse.render(student,
				course, Overallranking.findByCourseId(id),Comment.findByCourseId(id),course.tags,Uploads.findById(id)));
	}

	public static Result dashboard() {
		Student student = Student.find.byId(request().username());
		recommendationSystem(student);
		return ok(dashboard.render(matchedCourses,matchedJobs,student,
				Course.findAll(), Job.findAll(),student.course_tags,student.job_tags));
	}

	// ------------------------------Compare
	// Courses----------------------------------//
	public static Result compareCourses() {
		ArrayList<Course> courses = new ArrayList<Course>(Course.findAll());
		Student student = Student.find.byId(request().username());
		return ok(compare.render(student,
				courses, Job.findAll(),student.course_tags,student.job_tags,fiveStarRate.render(
						Overallranking.findByCourseId(courses.get(0).id),
						Overallranking.findByCourseId(courses.get(0).id))));
	}

	public static Result displayCourseRatings(){
		DynamicForm form = form().bindFromRequest();
		Student student = Student.find.byId(request().username());
		Overallranking ranking1 = Overallranking.findByCourseId((long) Double.parseDouble(form.get("course_1")));
		Overallranking ranking2 = Overallranking.findByCourseId((long) Double.parseDouble(form.get("course_2")));
		return ok(compare.render(Student.find.byId(request().username()),
				Course.findAll(), Job.findAll(),student.course_tags,student.job_tags,
				fiveStarRate.render(ranking1,
				ranking2)));
	}

	// -------------------------------------------------------------------------------//

	// ------------------------------ Rate
	// Course-------------------------------------//
	@Transactional
	public static Result rateCourse(Long id) {
		DynamicForm form = form().bindFromRequest();
		Ranking ranking = new Ranking();
		ranking.course = Course.findById(id);
		ranking.fair = (int) Double.parseDouble(form.get("fair"));
		ranking.material = (int) Double.parseDouble(form.get("material"));
		ranking.fun = (int) Double.parseDouble(form.get("fun"));
		ranking.grade = (int) Double.parseDouble(form.get("grade").toString());
		ranking.recommend = (int) Double.parseDouble(form.get("recommend"));
		ranking.overall_rate = ranking.calculateCurrentOverallRate();
		ranking.save();
		Ranking.findOverallRate(id);
		return viewCourse(id);
	}

	// -------------------------------------------------------------------------------//
	//--------------------------------upload files------------------------------------//
	@Transactional
	public static Result uploadMaterial() {
		
		DynamicForm form = form().bindFromRequest();
		Course course = Course.findById((long) Double.parseDouble(form.get("course_id")));
		String source = form.get("uploadSource");
		String content = form.get("uploadContent");
	    String author = request().username();
	    String name = form.get("uploadName");
	    Logger.info(source);
	    Logger.info(content);
		 new Uploads(content,course,author,source,name);
		return redirect(routes.Application.viewCourse(course.id));
	}
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

			return redirect(routes.Application.dashboard());
		}
	}

	/**
	 * Logout and clean the session.
	 */
	public static Result logout() {
		flash("success", "You've been logged out");
		return redirect(routes.ChooseUser.login());
	}

	// -----------------------------------------------------------------------//
}
