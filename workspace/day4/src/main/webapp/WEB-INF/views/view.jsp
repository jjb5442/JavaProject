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
			<tr id="view">
                <td colspan="6">
					<pre>${dto.contents }</pre>
                </td>
            </tr>
		</table>
	</div>
	<div class="button-menu">
		<a href="${cpath }/board"><button>Menu</button></a>
		<div>
			<button onclick="location.href = '${cpath }/modify/${dto.idx }'">Modify</button>
			<button onclick="location.href = '${cpath }/delete/${dto.idx }'">Delete1</button>
			<button id="delBtn" data-idx="${idx }">Delete2</button>
		</div>
	</div>
	
	<jsp:include page="list.jsp" />
	
	<script>
		function deleteBoard(event) {
			const idx = event.target.dataset.idx;
			const flag = confirm(idx + '번 글을 삭제하겠습니까?');
			
			if (flag) {
				location.href = '${cpath}/delete/' + idx;
			}
		}
		
		document.getElementById('delBtn').onclick = deleteBoard;
	</script>


</body>
</html>