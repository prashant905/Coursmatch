package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;
@Entity
public class Job extends Model {

	    private static final long serialVersionUID = 1L;

		@Id
	    public Long id;
	    
	    public String title;
	    
	    public String company_name;
	    
	    public String description;
	    
	    public String salary;
	    
	    public String begin_date;
	    
	    public String tags;
	    
	    public String contact;
	    
	    public String link;
	    
	    
	    // -- Queries
	    
	    public static Model.Finder<Long,Job> find = new Model.Finder<Long,Job>(Long.class, Job.class);
	    
	    
	    /**
	     * Retrieve all courses.
	     */
	    public static List<Job> findAll() {
	        return find.all();
	    }
	    
	    public static List<Job> findByCompany(String company_name){
	    	return find.where().eq("company_name",company_name).findList();
	    }
	    
	    public String toString() {
	        return "Job(" + id + ") with " ;
	    }

	
}
