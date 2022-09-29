<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Info</title>
</head>
<body>
<h2>Name : ${product.name}</h2>
<h3>Price : ${product.price}</h3>
<h3>Discount : ${product.discount}</h3>
<h3>Net Price : ${product.price - product.discount}</h3>

</body>
</html>