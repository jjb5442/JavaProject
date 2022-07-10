<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>스프링 DB 테스트</h1>
	<hr>
	
	<h4>DB version : ${ver} </h4>
	
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>Name</th>
			<th>Publisher</th>
			<th>Price</th>
			<th>Publish Date</th>
		</tr>
		
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.name }</td>
				<td>${dto.publisher }</td>
				<td>${dto.price }</td>
				<td>${dto.publishDate }</td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	
	<form method="post">
		<input name="search" type="search">
		<input type="submit" value="Search">
	</form>
	
</body>
</html>