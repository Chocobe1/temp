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
		<h1>📑 testInsert.jsp View</h1>
		
		<form action="testInsert.testDo" method="POST">
			ID : <input type="text" name="id"/><br/>
			PW : <input type="password" name="password"/><br/>
			<input type="submit" value="회원가입"/>
		</form>
	</body>
</html>