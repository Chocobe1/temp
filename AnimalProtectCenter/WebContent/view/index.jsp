<%@ page
	language="java"
	contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"
	session="true"
	buffer="8kb"
	autoFlush="true"
	
	info="테스트용 index페이지"
%>


<!-- 테스트 페이지 선택시, -->
<!-- NullPointerException이 발생한다면,  -->
<!-- 원인_1 : TestContextListener 설정이 안된 상태 -->
<!-- 원인_2 : welcome-file 설정이 안된 상태 -->

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	
	<body>
		<div class="wrap">
			<p><a href="../testFilter">Test EncodingFilter 테스트</a></p>
			<p><a href="../testServletError">Test ErrorCatcherCode500</a></p>
			
			<hr/>
			
			<p><a href="../jspTester/testInsert.jsp">테스트_Insert</a></p>
			<p><a href="../jspTester/testSelect.jsp">테스트_Select</a></p>
			<p><a href="../jspTester/testUpdate.jsp">테스트_Update</a></p>
			<p><a href="../jspTester/testDelete.jsp">테스트_Delete</a></p>
		</div>
	</body>
</html>