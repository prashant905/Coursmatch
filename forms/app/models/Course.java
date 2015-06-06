package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

/**
 * User entity managed by Ebean
 */
@Entity 
@Table(name="courses")
public class Course extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    @Constraints.Required
    @Formats.NonEmpty
    public int id;
    
	@Formats.NonEmpty
    public String title;
    
    public String desc;
    
    public String tag;
    
    public int chair_id;
    
    

    // -- Queries
    public static Model.Finder<String, Course> find = new Model.Finder<String,Course>(String.class, Course.class);
    // not sure whether String is right above
    
    
    //Retrieve all courses 
    public static List<Course> findAll() {
        return find.all();
    }

    //Retrieve a Course from id 
    public static Course findById(int id) {
        return find.where().eq("id", id).findUnique();
    }
    
    public String toString() {
        return "Course( " + id + ", " + title + ", " + desc + ", " + tag + ", " + chair_id + ")";
    }

}

