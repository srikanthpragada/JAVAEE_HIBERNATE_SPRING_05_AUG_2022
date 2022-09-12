package manytomany;

import java.util.HashSet;
import java.util.Set;

public class Job {
	private int id;
	private String title;
	private Set<Employee> employees = new HashSet<Employee>();
	
	
	
	public Job() {
		super();
	}

	public Job(String title) {
		super();
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
