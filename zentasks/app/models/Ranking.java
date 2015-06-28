package models;

import java.util.*;

import javax.persistence.*;

import models.Course;
import play.Logger;
import play.db.ebean.*;

@Entity
public class Ranking extends Model {

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
	    
	    
	    public Ranking(Course course){
	    	this.course = course ;
	    	this.overall_rate= 0;
	    }
	    
	    public Ranking(){
	    	
	    }
	    
	    // -- Queries
	    
	    public static Model.Finder<Long,Ranking> find = new Model.Finder<Long,Ranking>(Long.class, Ranking.class);
	    
	    
	    /**
	     * Retrieve all courses.
	     */
	    public static List<Ranking> findAll() {
	        return find.all();
	    }
	    public static Ranking findById(Long id) {
	        return find.where().eq("id", id).findUnique();
	    }
	    
	    public static List<Ranking> findByCourseId(Long courseId){
	    	return find.where().eq("course_id", courseId).findList();
	    }
	    
	    public static void findOverallRate(Long courseId){
	    	Overallranking courseAcutalRanking = Overallranking.findById(courseId);
	    	if(courseAcutalRanking == null){
	    		courseAcutalRanking = new Overallranking();
	    		courseAcutalRanking.course = Course.findById(courseId);
	    		}
	    	List<Ranking> rankings = findByCourseId(courseId);
	    	int sum_fair = 0 ;
	    	int sum_material = 0 ;
	    	int sum_fun = 0;
	    	int sum_grade = 0;
	    	int sum_recommend = 0;
	    	int sum_overall_rate = 0;
	    	int numberOfRankingRecords = rankings.size()-1;
	    	for(Ranking ranking : rankings){
	    		sum_fair+= ranking.fair;
	    		sum_material += ranking.material;
	    		sum_fun += ranking.fun;
	    		sum_grade += ranking.grade;
	    		sum_recommend += ranking.recommend;
	    		sum_overall_rate += ranking.overall_rate;
	    		}
	    	courseAcutalRanking.fair = sum_fair/numberOfRankingRecords;
	    	courseAcutalRanking.material = sum_material/numberOfRankingRecords;
	    	courseAcutalRanking.fun = sum_fun/numberOfRankingRecords;
	    	courseAcutalRanking.grade = sum_grade/numberOfRankingRecords;
	    	courseAcutalRanking.recommend = sum_recommend/numberOfRankingRecords;
	    	courseAcutalRanking.overall_rate = sum_overall_rate/numberOfRankingRecords;
	    	courseAcutalRanking.update();
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
		public int calculateCurrentOverallRate() {
			
			return (fair+material+fun+grade+recommend)/5;
		}

	
}
