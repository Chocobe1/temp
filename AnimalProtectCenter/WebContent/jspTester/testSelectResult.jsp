<%@ page
	language="java"
	contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>(test)Select Result</title>
	</head>

	<body>
		<h3>Test Select 결과</h3>
		
		<p>${result}</p>
		<p>${vo.id}</p>
		<p>${vo.password}</p>
		
		<%@ include file="testHome.jsp" %>
	</body>
</html>