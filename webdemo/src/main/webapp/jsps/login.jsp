<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
 <h2>Login</h2>
 <form method="post">
    Username : <input type="text" name= "uname" required />
    Password : <input type="password" name= "pwd" required />
    <input type="submit" value="Login" />
 </form>
 
 <%
   String uname = request.getParameter("uname");
   if(uname == null)
	   return;
 
   String pwd = request.getParameter("pwd");
   if(pwd.equals("abcd"))
   {
	    session.setAttribute("uname", uname);
	    response.sendRedirect("home.jsp");
   }
   else
   {
	   out.println("<h4>Sorry! Invalid Login. Try again! </h4>");
   }
 %>
</body>
</html>