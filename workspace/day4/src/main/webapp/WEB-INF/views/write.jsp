<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h4>Writing Page</h4>
	
	<form method="POST">
		<div  class="table-column">
			<table>
				<tr>
					<th>Title</th>
					<td class="table-column__write">
						<input name="title" required value="${dto.title}">
					</td>
				</tr>
				<tr>
					<th>Author</th>
					<td class="table-column__write">
						<input name="writer" required value="${dto.writer}">
					</td>
				</tr>
				<tr id="view">
	                <td colspan="2">
						<textarea name="contents" required>${dto.contents}</textarea>
	                </td>
	            </tr>
			</table>
	        <button class="write">Write</button>
		</div>
	</form>
	
</body>
</html>