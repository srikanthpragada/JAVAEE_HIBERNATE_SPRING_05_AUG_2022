<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="javax.sql.rowset.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>
<h1>Employees</h1>

	<table border="1" cellpadding="5pt">
		<tr style="background-color:blue;color:white;font-weight:bold"> 
			<th>Fullname</th>
			<th>Salary</th>
			<th>Job </th>
			<th> </th>
		</tr>
		
		<%
		Class.forName("com.mysql.jdbc.Driver"); // Load JDBC Driver 
		CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
		rowSet.setUrl("jdbc:mysql://localhost:3306/hr");
		rowSet.setUsername("root");
		rowSet.setPassword("mysql");
		rowSet.setCommand("select * from employees");
		rowSet.execute();

		while (rowSet.next()) {
			out.println(String.format("<tr><td>%s</td><td style='text-align:right'>%d</td> <td>%s</td><td><a href='delete.jsp?id=%d'>Delete</td></tr>", 
					   rowSet.getString("fullname"), 
					   rowSet.getInt("salary"), 
					   rowSet.getString("job"),
					   rowSet.getInt("id")
					   ));
		}
		%>
   </table>
</body>
</html>