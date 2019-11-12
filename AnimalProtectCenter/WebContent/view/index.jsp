<%@ page
	language="java"
	contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"
	session="true"
	buffer="8kb"
	autoFlush="true"
	
	info="테스트용 index페이지"
%>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		<h3>Animal Bridge</h3>
		
		<%
		if(session.getAttribute("memberLogIn") == null) {
		%>
			<a href="memberJoin.jsp">회원가입</a><br/>
			<a href="memberLogIn.jsp">로그인</a>
			
		<% } else { %>
			<a href="memberLogOut.do">로그아웃</a>
		<% } %>
	</body>
</html>