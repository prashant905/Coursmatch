package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.ebean.Model;
import play.data.validation.Constraints;

import org.joda.time.*;     
@Entity
public class Schedule extends Model{
	
	private static final long serialVersionUID = 1L;

	@Id
    @Constraints.Required
    public Long id;
    
    public DateTime start_date;
    
    public DateTime end_date;
    
	public String room;
	
	@ManyToOne
	public Course course;

	
	
	  public static Model.Finder<String,Schedule> find = new Model.Finder<String,Schedule>(String.class, Schedule.class);
	
	  public static List<Schedule> findAll() {
	        return find.all();
	    }
	    
	    
	    public static List<Schedule> findById(Long id) {
	    	 return find.where().eq("course_id", id).findList();
	    }
	    
	    
	    
	    public String toString() {
	        return "Scedule(" + id + ")";
	    }

}
