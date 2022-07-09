<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ex01 - Result</h1>
	<hr>
	
	<h4>Result is ${sum}입니다</h4>
	<h4>Result is <%= request.getAttribute("sum") %></h4>
</body>
</html>