<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>productId</td>
			<td>productName</td>
			<td>productCode</td>
			<td>categoryId</td>
			<td>description</td>
		</tr>
		<core:forEach items="${listProduct}" var="kq">
			<tr>
				<td>${kq.productId}</td>
				<td>${kq.productName}</td>
				<td>${kq.productCode}</td>
				<td>${kq.categoryId}</td>
				<td>${kq.description}</td>
			</tr>
		</core:forEach>
	</table>
</body>
</html>