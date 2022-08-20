package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeBean {
	private int id, salary;
	private String message;

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
}
