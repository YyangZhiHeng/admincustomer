<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入页面</title>
</head>
<body>
	<font color="red"> 
		<%-- 提示信息--%> <span id="message">${msg}</span>
	</font>
	<form action="${pageContext.request.contextPath}/toLogin" method="post"
		onsubmit="return check()">
		账号:<input id="username" type="text" name="username"><br />
		密码:<input id="password" type="password" name="password"><br />
		<input type="submit" value="登入"><input type="reset" value="重置"/>
	</form>
	<a href="${pageContext.request.contextPath}/toRegister">注册</a>
</body>
</html>