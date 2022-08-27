<%@page import="java.time.LocalDateTime"
	import="javax.sql.rowset.*"  contentType="text/plain" %>
<%
String id = request.getParameter("id");

Class.forName("com.mysql.jdbc.Driver"); // Load JDBC Driver 
CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
rowSet.setUrl("jdbc:mysql://localhost:3306/hr");
rowSet.setUsername("root");
rowSet.setPassword("mysql");
rowSet.setCommand("select fullname from employees where id = ?");
rowSet.setString(1,id);
rowSet.execute();

String name = "none";
if (rowSet.next())
	name = rowSet.getString(1);

out.println(name);	

%>
