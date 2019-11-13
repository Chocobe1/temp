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
		<form action="memberJoin.do" method="POST">
			닉네임 : <input type="text" name="nickName"><br/>
			이메일 : <input type="text" name="email"><br/>
			비밀번호 : <input type="password" name="password"><br/>
			주소 : <input type="text" name="addr"><br/>
			연락처 : <input type="text" name="phone"><br/>
			<input type="submit" value="회원가입">
		</form>
	</body>
</html>