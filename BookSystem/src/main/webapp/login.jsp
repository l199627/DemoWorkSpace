<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
	body{
	background-color:skyblue;
	}
	div{
	width:15%;
	height:20%;
	margin-left:38%;
	
	border: 1px solid;
	background-color:#EFEEDC;
	}
	h1{
	margin-left:40%;
	padding-top:10%;
	}
	button{
	margin-left:70px;
	width:100px; 
	background:red;
	}
	</style>
  </head>
  <body>
  <h1>图书管理系统</h1>
  <div>
  <font color="red" size="1" id="error"></font><p>
  	姓名:<input type="text" id="username"><p>
  	密码:<input type="password" id="userpwd"><p>
  	<button id="sub">登录</button>
  	</div>
  </body>
</html>
<script type="text/javascript" src="jquery-2.1.4/jquery.js"></script>
<script type="text/javascript">
$(function(){
	$("#sub").click(function(){
		$.ajax({
			url:"userController/login.do",
			dataType:"json",
			type:"post",
			data:{"username":$("#username").val(),"userpwd":$("#userpwd").val()},
			success:function(data){
				if(data.flag){
					location.href="userMain.jsp";
				}else{
					$("#error").html("用户名或者密码错误....");
				}
			}
		});
	});
})
</script>