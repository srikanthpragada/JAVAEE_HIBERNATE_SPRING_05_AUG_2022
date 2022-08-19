<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Age Calculator</title>
</head>
<body>
	<h1>Age Calculator</h1>
	<form action="agecalculator.jsp">
		Year of birth : <input type="number" name="year" value="${param.year}" required />
		<p></p>
		<input type="submit" value="Get Age" />
	</form>
	<p></p>
	<h3>
	<%
	  String input = request.getParameter("year");
	  if(input == null) // first request 
	     return;
	  
	 // calculate age
	 int year = Integer.parseInt(input);
	 LocalDate cd = LocalDate.now();
	 int age = cd.getYear() - year;
	 out.println("Age = " + age); 
	
	%>
	</h3>

</body>
</html>