package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
@Table(name="company")
public class Company extends Model {

	private static final long serialVersionUID = 1L;

	@Id
	@Constraints.Required
	@Formats.NonEmpty
	public String email;

	@Constraints.Required
	public String name;

	@Constraints.Required
	public String password;

	public String description;

	public static Model.Finder<String, Company> find = new Model.Finder<String, Company>(
			String.class, Company.class);

	public static List<Company> findAll() {
		return find.all();
	}

	public static Company authenticate(String email, String password) {
		return find.where().eq("email", email).eq("password", password)
				.findUnique();
	}

	// --

	public String toString() {
		return "Company(" + email + ")";
	}
}
