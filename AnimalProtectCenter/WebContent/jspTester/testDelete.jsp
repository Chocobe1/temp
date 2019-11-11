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
		<h1>📑 testDelete.jsp View</h1>
		
		<p>${result}</p>
		
		<form action="testSelect.testDo" method="POST">
			ID : <input type="text" name="id"/><br/>
			PW : <input type="password" name="password"/><br/>
			<input type="hidden" name="job" value="delete"/>
			<input type="submit" value="검색"/>
		</form>
		
		<%
		TestVO vo = (TestVO)request.getAttribute("vo");
		if(vo != null) { %>
			<form action="testDelete.testDo" method="POST">
				ID : <input type="text" name="id" value="${vo.id}"/>
				PW : <input type="password" name="password" value="${vo.password}"/>
				<input type="submit" value="삭제"/>
			</form>
		<% } %>
	</body>
</html>