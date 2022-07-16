<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<div class="view table-column">
		<table>
			<tr>
				<th>Title</th>
				<td colspan="5">${dto.title }</td> 
			</tr>
			<tr>
				<th>Writer</th>
				<td>${dto.writer }</td>
				<th>View Count</th>
				<td>${dto.viewCount }</td>
				<th>Date</th>
				<td>${dto.writeDate }</td>
			</tr>
			<tr id="contents">
                <td colspan="6">
					<pre>${dto.contents }</pre>
                </td>
            </tr>
		</table>
	</div>

</body>
</html>