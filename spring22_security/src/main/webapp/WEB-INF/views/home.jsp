<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
</head>
<body>
	<h1>home</h1>
	<!-- 로그아웃 기능까지 완성해보세요. -->
	<ul>
		<sec:authorize access="isAnonymous()">
			<li><a href="${cp }/join">회원가입 </a></li>
			<li><a href="${cp }/login">로그인 </a></li>
		</sec:authorize>
		<sec:authorize access="isAuthenticated()">
			<li>
				<form:form method="post" action="${cp }/logout">
						<input type="submit" value="로그아웃">
				</form:form>
			</li>
		</sec:authorize>
		<li><a href="${cp }/member/main">main(member)</a></li>
		<li><a href="${cp }/admin/main">main(admin)</a></li>
	</ul>
</body>
</html>