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
@Table(name="student")
public class Student extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    @Constraints.Required
    @Formats.NonEmpty
    public String email;
    
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    public String password;
    
    // -- Queries
    
    public static Model.Finder<String,Student> find = new Model.Finder<String,Student>(String.class, Student.class);
    
    /**
     * Retrieve all users.
     */
    public static List<Student> findAll() {
        return find.all();
    }

    /**
     * Retrieve a User from email.
     */
    public static Student findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
    
    /**
     * Authenticate a User.
     */
    public static Student authenticate(String email, String password) {
        return find.where()
            .eq("email", email)
            .eq("password", password)
            .findUnique();
    }
    
    // --
    
    public String toString() {
        return "Student(" + email + ")";
    }

}

