<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="hnbemc" uri="http://hnbemc.com/common/" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息页面</title>
</head>

<body>
	<center>
		<h1>用户信息页面</h1>
		<a href="${pageContext.request.contextPath}/toLoginOut">退出</a>
		<a href="${pageContext.request.contextPath}/toaddCustomer">添加</a>
		<a href="${pageContext.request.contextPath}/tofindCustomerById">查询</a>
	</center>
	
	<table border="1" cellspacing="0" align="center" width="50%">
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>工作</td>
			<td>电话</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.rows}" var="A">
			<tr>
				<td>${A.id}</td>
				<td>${A.username}</td>
				<td>${A.jobs}</td>
				<td>${A.phone}</td>
				<td>
				<a href="${pageContext.request.contextPath}/deleteCustomer?id=${A.id}">删除</a> 
				<a href="${pageContext.request.contextPath}/toupdateCustomer?id=${A.id}" >修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
		<center>
			<hnbemc:page url="${pageContext.request.contextPath}/findCustomerAll"></hnbemc:page>
		</center>
</body>
</html>