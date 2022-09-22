<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*,dao.*,entities.*" pageEncoding="ISO-8859-1"%>
<html> 
<body>  
	<h2>Jobs</h2>
	<ul>

		<%
		List<Job> jobs = JobsDAO.getJobs();
		for (Job j : jobs) {
			out.println("<li>" + j.getTitle() + " - " + j.getMinSal() + "</li>");

		}
		%>
	</ul>

</body>
</html>
