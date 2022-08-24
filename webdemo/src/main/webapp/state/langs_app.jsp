<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages in Application</title>
</head>
<body>
	<%
    String name = request.getParameter("lang");
	Object value = application.getAttribute("langs");
	 
	ArrayList<String> langs = null;
	if (value == null) // if attribute lang is not found 
		langs = new ArrayList<String>();
	else
		langs = (ArrayList<String>) value;

	langs.add(name);
	application.setAttribute("langs", langs);
	
	String title = application.getInitParameter("title");
	%>

	<h2>Languages</h2>
	<%
		// List langs 
	   for (String lang : langs)
		out.println(lang + "<br/>");
	%>
</body>
</html>