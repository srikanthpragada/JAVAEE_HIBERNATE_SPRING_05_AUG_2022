<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show DateTime</title>
</head>
<body>
<h1>Date Time</h1>
<h2 style="color:red">
<%
   Date cd = new Date();
   out.println(cd.toString());
%>
</h2>

</body>
</html>