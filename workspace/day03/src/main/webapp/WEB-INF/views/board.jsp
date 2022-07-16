<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<div class="table-column">
		<table>
		<tr>		
			<th>Index</th>
			<th>Title</th>
			<th>Writer</th>
			<th>Write Day</th>
			<th>View</th>
		</tr>
		<c:forEach var="dto" items="${list }">
		<tr>
			<td>${dto.idx}</td>
			<td class="context__title">
				<a href="${cpath }/board/${dto.idx}">${dto.title}</a>
			</td>
			<td>${dto.writer}</td>
			<td>${dto.writeDate}</td>
			<td>${dto.viewCount}</td>
		</tr>		
		</c:forEach>
		</table>
	</div>
	
	<div class="search-column">
		<a href="${cpath }/write"><button>Write</button></a>
		<form>
			<select name="type">
				<option value="title">Title</option>
				<option value="writer">Writer</option>
				<option value="contents">Contents</option>
			</select>
			<input name="search" type="search">
			<input type="submit" value="Search">
		</form>
	</div>
	
	<div class="page">
		<span>이전</span>
		
		<c:forEach var="i" begin="1" end="10">
			<span>${i }</span>
		</c:forEach>

		<span>다음</span>
	</div>

</body>
</html>