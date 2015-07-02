package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;
@Entity
public class Course extends Model {

	    private static final long serialVersionUID = 1L;

		@Id
	    public Long id;
	    
		public String professor_name;
	
		public String chair;
	    
		public String name;
	    
	    public String description;
	    
	    public String tags;
	    
	    // -- Queries
	    
	    public static Model.Finder<Long,Course> find = new Model.Finder<Long,Course>(Long.class, Course.class);
	    
	    
	    /**
	     * Retrieve all courses.
	     */
	    public static List<Course> findAll() {
	        return find.all();
	    }
	    public static Course findById(Long id) {
	        return find.where().eq("id", id).findUnique();
	    }
	    public String toString() {
	        return "Course(" + id + ") with " ;
	    }

	
}
