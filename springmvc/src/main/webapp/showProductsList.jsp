<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products List</title>
</head>
<body>
	<h2>Products List</h2>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Price</th>
			<th>Discount</th>
			<th>Net Price</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.discount}</td>
				<td>${product.price - product.discount}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>