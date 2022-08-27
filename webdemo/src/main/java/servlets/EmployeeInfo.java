package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class EmployeeInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	class Employee  {
		private String name, job;
		private int salary;
		
		public Employee(String name, String job, int salary) {
			super();
			this.name = name;
			this.job = job;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
	}

	public EmployeeInfo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		try {
			Class.forName("com.mysql.jdbc.Driver"); // Load JDBC Driver
			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
			rowSet.setUrl("jdbc:mysql://localhost:3306/hr");
			rowSet.setUsername("root");
			rowSet.setPassword("mysql");
			rowSet.setCommand("select fullname, job, salary from employees where id = ?");
			rowSet.setString(1, id);
			rowSet.execute();
			
			Employee e = new Employee(rowSet.getString(1), rowSet.getString(2), rowSet.getInt(3));
            Gson gson = new Gson();
            String json = gson.toJson(e);
			
            //response.setContentType("application/json");
            PrintWriter pw = response.getWriter();
            pw.println(json);
		} catch (Exception ex) {

		}
	}

}
