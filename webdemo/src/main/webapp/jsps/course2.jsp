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
	int fee = Integer.parseInt(request.getParameter("course"));
	String certificate = request.getParameter("certificate");

	if (certificate != null)  // checkbox is checked 
		 fee += 200;
	
	out.println("Course Fee  = " + fee);
	
	%>

</body>
</html>