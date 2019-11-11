<%@ page
	language="java"
	contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>test Update</title>
	</head>

	<body>
		<h3>Update 완료</h3>
		<p>${vo.id}</p>
		<p>${vo.password}</p>
		<%@ include file="testHome.jsp" %>
	</body>
</html>