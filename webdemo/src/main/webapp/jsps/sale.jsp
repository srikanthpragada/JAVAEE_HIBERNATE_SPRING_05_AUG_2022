<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Sale</h2>
	<form action="sale.jsp">
		Qty : <input type="number" name="qty"  value="${param.qty}" />
		Price : <input type="number" name="price"   value="${param.price}"/> 
    	<input type="submit" value="Get Amount" />
	</form>
	<%
	   if (request.getParameter("qty") == null)
		   return;
	%>
	
	<jsp:useBean id="saleBean" class="beans.SaleBean" scope="page"></jsp:useBean>
	<jsp:setProperty property="*" name="saleBean"/>
	<h3>Sales Amount = <jsp:getProperty name="saleBean" property="amount" /></h3>

</body>
</html> 