<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户信息</title>
</head>
<body>
<h4>单个用户信息页面</h4>
	<table border="1" cellspacing="0">
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>职业</td>
			<td>电话</td>
		</tr>
		<tr>
			<td>${customer.id}</td>
			<td>${customer.username}</td>
			<td>${customer.jobs}</td>
			<td>${customer.phone}</td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/tofindCustomerById">返回查询页面</a>
</body>
</html>