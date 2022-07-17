<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${cpath }/resources/css/style.css" type="text/css">
<title>Insert title here</title>

</head>
<body>
	<h1>"${cpath }"</h1>
	
	<div id="menu">
		<ul>
			<li><a href="${cpath }">Book Table</a></li>
			<li><a href="${cpath }/board">Content</a></li>
		</ul>
	</div>
	
	<hr>