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
		<sf:input path="username"  required="true" 
		            title="Username to be used to login" />
		<sf:errors path="username"/>
		<p></p>
     Email <br />
		<sf:input path="email" required="true" 
		           title="Email associated with account" />
		<sf:errors path="email"/>
		<p></p>
		<input type="submit" value="Register" />
	</sf:form>
</body>
</html>