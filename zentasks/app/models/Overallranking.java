package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;
@Entity
public class Overallranking extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@ManyToOne
	public Course course;
	
	public int fair;
	public int material;
	public int fun;
	public int grade;
	public int recommend;
	public int overall_rate;
	
	
    public static Model.Finder<Long,Overallranking> find = new Model.Finder<Long,Overallranking>(Long.class, Overallranking.class);
    
    
    /**
     * Retrieve all courses.
     */
    public static List<Overallranking> findAll() {
        return find.all();
    }
    public static Overallranking findById(Long id) {
        return find.where().eq("id", id).findUnique();
    }
    
    public static Overallranking findByCourseId(Long courseId){
    	return find.where().eq("course_id", courseId).findUnique();
    }
}
