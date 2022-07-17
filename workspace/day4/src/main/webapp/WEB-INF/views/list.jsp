<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<c:set var="start" value="${p['start'] }" />
<c:set var="end" value="${p['end'] }" />
<c:set var="pageCount" value="${p['pageCount'] }" />

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
		<c:if test="${start != 1 }">
		<span>
			<a href="${cpath }/board/${dto.idx }?page=${start-1}&&type=${param.type}&&search=${param.search}">
				이전
			</a>
		</span>
		</c:if>
		
		<c:forEach var="i" begin="${start }" end="${end }">
			<span>
				<a href="${cpath}/board/${dto.idx }?page=${i }&&type=${param.type}&&search=${param.search}">
					${i }
				</a>
			</span>
		</c:forEach>
		
		<c:if test="${end != pageCount }">
		<span>
			<a href="${cpath }/board/${dto.idx }?page=${end+1}&&type=${param.type}&&search=${param.search}">
				다음
			</a>
		</span>
		</c:if>
	</div>

</body>
</html>