<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script>
// 判断是登录账号和密码是否为空
function checkform(){
    var username =document.getElementById("username").value;// $("#username").val();
    var password = document.getElementById("password").value;//$("#password").val();
    var phone =document.getElementById("phone").value; //$("#phone").val();
    if(username=="" || password==""||phone==""){
    	//$("#message").text("账号、密码或电话不能为空！");
    	alert("账号、密码或电话不能为空！");
        return false;
    }  
    return true;
}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/register" >
		账号:<input id="username" type="text" name="username"/><br />
		密码:<input id="password" type="password" name="password"/><br />
		电话:<input id="phone" type="text" name="phone"/><br /> <input
			type="submit" value="注册" onclick="return checkform();"/><input type="reset" value="重置" />
	</form>
	 <span id="message">${msg}</span>
</body>
</html>