<%@include file="connect.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<sql:query var="jobs" dataSource="${mysql}">
      select upper(id) as id, title, minsal from jobs 
      order by id
</sql:query>
 
<h1>Jobs</h1>
<ul>
	<c:forEach var="job" items="${jobs.rows}">
		<li>${job.id},${job.title},${job.minsal} </li>
	</c:forEach>
</ul>
