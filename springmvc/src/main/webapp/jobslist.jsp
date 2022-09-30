<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jobs List</title>
</head>
<body>
	<h2>Jobs</h2>
	Available Job Titles.
	<p></p>
	<c:forEach var="job" items="${jobs}">
		${job.title} <br /> 
		<a href="employees?id=${job.id}">Employees</a>
		<p></p>
	</c:forEach>

</body>
</html>