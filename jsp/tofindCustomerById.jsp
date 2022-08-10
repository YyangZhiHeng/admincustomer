<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>单个信息查询</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/findCustomerById">
		id:<input type="text" name="id"/>
		<input type="submit" value="查询">
	</form>
	<a href="${pageContext.request.contextPath}/findCustomerAll">返回</a>
</body>
</html>