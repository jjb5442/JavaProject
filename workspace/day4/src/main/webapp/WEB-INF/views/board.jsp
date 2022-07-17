<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<jsp:include page="list.jsp"/>
<!-- 
	directive의 include %@ include
	- 파일을 합쳐서 컴파일. 즉, 변수나 attribute 공유 가능
	
	jsp의 include
	- 컴파일 후 합친다. 즉, 변수나 attribute가 공유되지 않고 별도로 존재
 -->
</body>
</html>