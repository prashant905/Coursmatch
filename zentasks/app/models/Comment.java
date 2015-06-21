package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;
@Entity
public class Comment extends Model {

	    private static final long serialVersionUID = 1L;

		@Id
	    public Long id;
	    
	    public String name;
	    
	    public String data;
	    
	    
	    
	    public Comment(String name, String data) {
	        this.name = name;
	        this.data = data;
	    }
	    
	    // -- Queries
	    
	    public static Model.Finder<Long,Comment> find = new Model.Finder<Long,Comment>(Long.class, Comment.class);
	    
	    
	    /**
	     * Retrieve all courses.
	     */
	    public static List<Comment> findAll() {
	        return find.all();
	    }
	    public static Comment findById(Long id) {
	        return find.where().eq("id", id).findUnique();
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
	        return "Comment(" + id + ") with " ;
	    }

	
}
