<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Registration</h1>

	<sf:form method="post" modelAttribute="user">
     Username <br />
		<sf:input path="username" />
		<p></p>
     Email <br />
		<sf:input path="email" />
		<p></p>
		<input type="submit" value="Register" />
	</sf:form>
</body>
</html>