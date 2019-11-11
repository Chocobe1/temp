<%@ page
	language="java"
	contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<h3>test Insert Result</h3>
		
		<p>${result}</p>
		<p>"${id}"님, 회원가입을 축하드립니다</p>
		
		<%@ include file="testHome.jsp" %>
	</body>
</html>