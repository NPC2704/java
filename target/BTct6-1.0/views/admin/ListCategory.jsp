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
			<td>ID</td>
			<td>CategoryName</td>
			<td>Images</td>
			<td>Status</td>
			<td>Thao tac</td>
		</tr>
		<core:forEach items="${listCategory}" var="kq">
			<tr>
				<td>${kq.cateId }</td>
				<td>${kq.cateName}</td>
				<core:url value="/image?fname=${kq.images}" var="imgUrl"></core:url>
				<td><img height="150" width="200" src="${imgUrl}" /></td>
				<td><core:if test="${ kq.status==1}">
					<span>Hoat dong</span>
				</core:if>
				<core:if test="${ kq.status==0}">
					<span>Khoa</span>
				</core:if>
				</td>
				<td>
				<a href="<core:url value='/admin/category/edit?id=${kq.cateId}' />" class="center">Sua</a>
				<a href="<core:url value='/admin/category/delete?id=${kq.cateId}' />" class="center">Xoa</a>
				</td>
			</tr>
		</core:forEach>
	</table>
</body>
</html>