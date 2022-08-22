<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Demo</title>
</head>
<body>
	<jsp:useBean id="employeeBean" class="beans.EmployeeBean" scope="page" />
	<%
	request.setAttribute("name", "Srikanth");
	%>
	Attribute name : ${name}
	<p></p>
	Bean's id : ${employeeBean.id}
	<p></p>
	Param name : ${param.name}
	<p />
	Header User Agent : ${header["User-Agent"]}
	<p />
	Adding Params : ${param.n1 + param.n2}
	<p />
	Comparing Params : ${param.n1 > param.n2 ? "First" : "Second"}

</body>
</html>