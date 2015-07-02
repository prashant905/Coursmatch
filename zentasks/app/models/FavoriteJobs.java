package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class FavoriteJobs extends Model{
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@ManyToOne
	public Job job;
	
	public String email;
	

	  public static Model.Finder<Long,FavoriteJobs> find = new Model.Finder<Long,FavoriteJobs>(Long.class, FavoriteJobs.class);
	
	  public static List<FavoriteJobs> findAll() {
	        return find.all();
	    }
	    
	    
	    public static FavoriteJobs findById(Long job_id, String email) {
	    	 return find.where().eq("email", email).eq("course_id", job_id).findUnique();
	    }
	    
	    public static Boolean isExist(FavoriteJobs job) {
	    	return new ArrayList<FavoriteJobs>(find.where().eq("email", job.email).eq("job_id", job.job.id).findList()).isEmpty();
	    }
	    
	    public static List<FavoriteJobs> findAllByStudent(String email){
	    	return find.where().eq("email", email).findList();
	    }
	    
	    public static void deleteByJob(Long id) {
	    	List<FavoriteJobs> fj = find.where().eq("job_id",id).findList();
	    	for(FavoriteJobs favj : fj){
	    		favj.delete();
	    	}
	    }
	    
	    public String toString() {
	        return "FavoriteJobs(" + id + ")";
	    }


}
