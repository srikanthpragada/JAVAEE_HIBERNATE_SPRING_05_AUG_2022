package assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ListEmployeesByJob {

	public static void main(String[] args) throws Exception {
		try(Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/hr", "root", "mysql"))
		{
			Scanner s = new Scanner(System.in);
			// Take input from user
			System.out.print("Enter Job    :");
			String job = s.nextLine(); 
		
    		PreparedStatement ps = con.prepareStatement
				    ("select * from employees where job = ?");
		    ps.setString(1,job); 
		    
    		ResultSet rs = ps.executeQuery();  
		    while(rs.next()) {
		    	System.out.println(rs.getString("fullname"));
		    }
		    ps.close();
	     }// try
	}
}
