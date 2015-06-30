package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;
@Entity
public class Uploads extends Model {

	    private static final long serialVersionUID = 1L;

		@Id
	    public Long id;
	    
		  public String content;
		@ManyToOne  
		  public Course course;
		    
		  public String author;
		    
		  public String source;
		    
		  public String name;  
		    public Uploads(String content, Course course, String author, String source,String name) {
		        this.content = content;
		        this.course = course;
		        this.author = author;
		        this.source = source;
		        this.name = name;
		        save();
		    }
	    
	    // -- Queries
	    
	    public static Model.Finder<Long,Uploads> find = new Model.Finder<Long,Uploads>(Long.class, Uploads.class);
	    
	    
	    /**
	     * Retrieve all courses.
	     */
	    public static List<Uploads> findAll() {
	        return find.all();
	    }
	    public static List<Uploads> findById(Long id) {
	    	 return find.where().eq("course_id", id).findList();
	    }
	    
	    /**
	     * Retrieve project for user
	     */
	    /**
	    public static List<Course> findInvolving(String student) {
	        return find.where()
	            .eq("members.email", student)
	            .findList();
	    }
	    
	    public static String renameFolder(String folder, String newName) {
	        Ebean.createSqlUpdate(
	            "update project set folder = :newName where folder = :folder"
	        ).setParameter("folder", folder).setParameter("newName", newName).execute();
	        return newName;
	    }
	    
	     * Add a member to this project
	    public static void addMember(Long project, String student) {
	        Course p = Course.find.setId(project).fetch("members", "email").findUnique();
	        p.members.add(
	            User.find.ref(user)
	        );
	        p.saveManyToManyAssociations("members");
	    }
	     */
	    
	    /**
	     * Remove a member from this project
	    public static void removeMember(Long project, String user) {
	        Project p = Project.find.setId(project).fetch("members", "email").findUnique();
	        p.members.remove(
	            User.find.ref(user)
	        );
	        p.saveManyToManyAssociations("members");
	    }
	     */
	    
	    /**
	     * Check if a user is a member of this project
	    public static boolean isMember(Long project, String user) {
	        return find.where()
	            .eq("members.email", user)
	            .eq("id", project)
	            .findRowCount() > 0;
	    } 
	    
	     */
	    // --
	    
	    public String toString() {
	        return "Uploads(" + id + ") with " ;
	    }

	
}
