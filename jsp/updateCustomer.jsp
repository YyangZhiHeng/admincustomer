<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改页面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/updateCustomer" method="post">
		<!-- id -->
		id:<input type="text" name="id" value="${customer.id}" readonly="ture"/><br />
		<!-- 姓名 -->
		username:<input type="text" name="username" value="${customer.username}"/><br />
		<!-- 工作 -->
		jobs:<input type="text" name="jobs" value="${customer.jobs}"/><br />
		<!-- 电话 -->
		phone:<input type="text" name="phone" value="${customer.phone}"/><br />
		
		<input type="submit" value="修改"><input type="reset" value="重置"/>
	</form>
</body>
</html>