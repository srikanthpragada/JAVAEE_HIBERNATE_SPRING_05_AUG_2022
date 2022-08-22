package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeBean {
	private int id, salary;
	private String message, fullname, job;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getMessage() {
		return message;
	}

	public void update() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load JDBC Driver 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "mysql");
			PreparedStatement ps = con.prepareStatement("update employees set salary = ? where id = ?");
			ps.setInt(1, this.salary); // salary
			ps.setInt(2, this.id); // id

			int count = ps.executeUpdate();
			if (count == 1)
				this.message = "Updated Successfully!";
			else
				this.message = "Sorry! Employee id not found!";
		} catch (Exception ex) {
			System.out.println(ex);
			this.message = "Could not update due to error!";
		}
	}

	public void insert() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load JDBC Driver 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "mysql");
			PreparedStatement ps = con.prepareStatement
					("insert into employees(fullname,job,salary) values(?,?,?)");
			ps.setString(1, this.fullname); 
			ps.setString(2, this.job);  
			ps.setInt(3, this.salary); 

			int count = ps.executeUpdate();
			if (count == 1)
				this.message = "Inserted Successfully!";
			else
				this.message = "Sorry! Employee could not be added!";
		} catch (Exception ex) {
			System.out.println(ex);
			this.message = "Could not insert due to error!";
		}

	}
	
	
}
