<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Fee</title>
</head>
<body>
	<%
	String course = request.getParameter("course");
	String certificate = request.getParameter("certificate");

	int fee;
	if (course == null)
		fee = 0;
	else
		fee = Integer.parseInt(course);
	%>
	<h2>Course Fee Calculation</h2>
	<form action="course_all_in_one.jsp">
		Course Name 
		<select name="course">
			<option value="8000"  <%=fee == 8000?"SELECTED" : ""%>>Python</option>
			<option value="10000" <%=fee == 10000?"SELECTED" :""%>>Java</option>
			<option value="5000"  <%=fee == 5000?"SELECTED" : ""%>>React</option>
		</select>
		<p></p>
		<input type="checkbox" value="y" 
		       <%= certificate != null ? "checked" : "" %>  name="certificate">
		Certificate
		<p></p>
		<input type="submit" value="Get Course Fee" />
	</form>

	<%
	if (fee == 0)
		return;

	
	if (certificate != null) // checkbox is checked 
		fee += 200;

	out.println("<h3>Course Fee  = " + fee + "</h3>");
	%>

</body>
</html>