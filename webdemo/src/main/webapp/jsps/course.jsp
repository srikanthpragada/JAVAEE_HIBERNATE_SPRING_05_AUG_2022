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
	// find out course fee
	int fee = 0;
	switch (course) {
	case "j":
		fee = 10000;
		break;
	case "p":
		fee = 8000;
		break;
	default:
		fee = 5000;
	}
	
	if (certificate != null)  // checkbox is checked 
		 fee += 200;
	
	out.println("Course Fee  = " + fee);
	
	%>

</body>
</html>