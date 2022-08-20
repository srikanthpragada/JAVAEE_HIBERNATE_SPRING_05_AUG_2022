<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Salary</title>
</head>
<body>
<h2>Update Salary</h2>
	<form action="updateSalary.jsp">
		Employee Id : <input type="number" name="id"  value="${param.id}" />
		New Salary : <input type="number" name="salary"   value="${param.salary}"/> 
    	<input type="submit" value="Update" />
	</form>
	<%
	   if (request.getParameter("id") == null)
		   return;
	%>
	
	<jsp:useBean id="employeeBean" class="beans.EmployeeBean" scope="page"></jsp:useBean>
	<jsp:setProperty property="*" name="employeeBean"/>
	
	<%
	    employeeBean.update();
	%>
	
	<h3>${employeeBean.message}</h3>

</body>
</html> 