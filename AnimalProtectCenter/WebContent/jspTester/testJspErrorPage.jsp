<%@ page
	language="java"
	contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"
	session="false"
	
	errorPage="jspError/jspErrorCatcher.jsp"
	
	info="Test jspErrorCatcher.jsp"
%>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		<%
		String nullValue = (String)request.getAttribute("nullValue");
		nullValue.length();
		%>
	</body>
</html>