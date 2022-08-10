<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加用户页面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/addCustomer" method="post">
		姓名<input type="text" name="username" /><br />
		工作<input type="text" name="jobs" /><br />
		电话<input type="text" name="phone"/><br />
		<input type="submit" value="添加"/>
		<input type="reset" value="重置"/>
	</form>
</body>
</html>