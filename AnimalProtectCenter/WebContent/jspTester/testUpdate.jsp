<%@page import="com.animal.tester.vo.TestVO"%>
<%@ page
	language="java"
	contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		<h1>📑 testUpdate.jsp View</h1>
		
		${result}
		
		<form action="testSelect.testDo" method="POST">
			ID : <input type="text" name="id"/><br/>
			PW : <input type="password" name="password"/><br/>
			<input type="hidden" name="job" value="update"/>
			<input type="submit" value="검색"/>
		</form>
		
		<%
		TestVO vo = (TestVO)request.getAttribute("vo");
		if(vo != null) { %>
			<form action="testUpdate.testDo" method="POST">
				ID : <input type="text" value="${vo.id}" disabled/><br/>
				PW : <input type="password" name="password" value="${vo.password}"/><br/>
				<input type="hidden" name="id" value="${vo.id}"/>
				<input type="submit" value="갱신"/>
			</form>
		<% } %>
	</body>
</html>