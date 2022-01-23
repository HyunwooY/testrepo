<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- spring form태그라이브러리를 사용하면 자동으로 토큰값이 전송됨 -->
<form:form method="post" action="${cp }/join">
	회원아이디<br>
	<input type="text" name="userid"><br>
	회원이름<br>
	<input type="text" name="username"><br>
	비밀번호<br>
	<input type="password" name="password"><br>
	<input type="submit" value="가입">
</form:form>
</body>
</html>