<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<h1>회원로그인</h1>
<form:form method="post" action="${cp }/login">
	아이디<br>
	<input type="text" name="username"><br>
	비밀번호<br>
	<input type="password" name="password"><br>
	<input type="submit" value="로그인">
</form:form>
</body>
</html>