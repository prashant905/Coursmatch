package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;
import scala.Array;

@Entity
public class FavoriteCourses extends Model{

	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@ManyToOne
	public Course course;
	
	public String email;
	

	  public static Model.Finder<Long,FavoriteCourses> find = new Model.Finder<Long,FavoriteCourses>(Long.class, FavoriteCourses.class);
	
	  public static List<FavoriteCourses> findAll() {
	        return find.all();
	    }
	    
	    
	    public static FavoriteCourses findById(Long course_id, String email) {
	    	 return find.where().eq("email", email).eq("course_id", course_id).findUnique();
	    }
	    
	    public static Boolean isExist(FavoriteCourses course) {
	    	return new ArrayList<FavoriteCourses>(find.where().eq("email", course.email).eq("course_id", course.course.id).findList()).isEmpty();
	    }
	    
	    public static List<FavoriteCourses> findAllByStudent(String email){
	    	return find.where().eq("email", email).findList();
	    }
	    
	    
	    public String toString() {
	        return "FavoriteCourses(" + id + ")";
	    }
	
}
