<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<h4>Ver : ${ver}</h4>
	
	<div class="table-column">
		<table>
			<tr>
				<th>Name</th>
				<th>Author</th>
				<th>Price</th>
				<th>PublishDate</th>
			</tr>
			
			<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.name }</td>
				<td>${dto.publisher}</td>
				<td>${dto.price }</td>
				<td>${dto.publishDate }</td>
			</tr>
			</c:forEach>
		</table>
		
		<form>
			<input name="search" type="search">
			<button>Search</button>
		</form>
	</div>
</body>
</html>