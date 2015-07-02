package controllers;

import static play.data.Form.form;

import java.util.List;

import models.Company;
import models.FavoriteCourses;
import models.FavoriteJobs;
import models.Job;
import play.data.DynamicForm;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.companyDashboard;
import views.html.editJob;

@Security.Authenticated(CompanySecured.class)
public class CompanyOperationController extends Controller{

	public static Result dashboard() {
		Company company = Company.find.byId(request().username());
		List<Job> jobs = Job.findByCompany(company.name);
		return ok(companyDashboard.render(company,jobs));
	}
	
	@Transactional
	public static Result saveJob(){
		DynamicForm form = form().bindFromRequest();
		Job job = new Job();
		Company company = Company.find.byId(request().username());
		job.company_name = company.name;
		
		job.title = form.get("job_title");
		job.tags = form.get("job_tags");
		job.link= form.get("job_link");
		job.contact = form.get("job_contact");
		job.description = form.get("job_description");
		job.salary = form.get("job_salary");
		job.begin_date = form.get("begin_date");
		job.save();
		return dashboard();
	}
	@Transactional
	public static Result deleteJob(Long id){
		FavoriteJobs.deleteByJob(id);
		Job job = Job.find.byId(id);
		job.delete();
		return redirect(routes.CompanyOperationController.dashboard());
	}
	
	public static Result viewToEditJob(Long id){
		Job job = Job.find.byId(id);
		Company company = Company.find.byId(request().username());
		return ok(editJob.render(company,job));
	}
	
	@Transactional
	public static Result editJob(Long id){
		DynamicForm form = form().bindFromRequest();
		Job job = Job.find.byId(id);
		Company company = Company.find.byId(request().username());
		job.company_name = company.name;
		job.title = form.get("job_title");
		job.tags = form.get("job_tags");
		job.link= form.get("job_link");
		job.contact = form.get("job_contact");
		job.description = form.get("job_description");
		job.salary = form.get("job_salary");
		job.begin_date = form.get("begin_date");
		job.update();
		return redirect(routes.CompanyOperationController.dashboard());
	}
	
}
