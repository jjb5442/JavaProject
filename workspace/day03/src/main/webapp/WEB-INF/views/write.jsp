<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h4>Writing Page</h4>
	
	<div  class="table-column">
		<table>
			<tr>
				<th>Title</th>
				<td class="table-column__write">
					<input name="title">
				</td>
			</tr>
			<tr>
				<th>Author</th>
				<td class="table-column__write">
					<input name="writer">
				</td>
			</tr>
			<tr id="contents">
                <td colspan="2">
					<textarea></textarea>
                </td>
            </tr>
		</table>
        <button>Write</button>
	</div>
	
</body>
</html>