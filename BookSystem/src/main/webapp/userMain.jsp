<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
	body{
/* 	 background-image:url(mages/9ad31e86gy1fs072b92wnj21hc0zk7wh.jpg); 
	 background-repeat:no-repeat; 
	background-size:100%; */
	/* background-color:#F1EFF0  */
	}
		.top{
		background-color:#F8F8F8;
			position:absolute;
			 top:0px;
			 left:0px;
			 width:100%;
			 height:20%;
			 border: 1px solid;
			}
		.left{
		background-color:#F8F8F8;
			 position:absolute;
			 top:20%;
			 left:0px;
			 width:20%;
			 height:100%;
			 border: 1px solid;
			 }
			
		.right{ 
			 position:absolute;
			 top:20%;
			 left:20%;
			 width:80%;
			 height:100%;
			 /* border: 1px solid; */
		}
		a{text-decoration: none;
		}
		li{
	   list-style:none;
		}
		.top a{
		margin-left: 90%;
		}
	</style>
  </head>
  <body>
  
 	 <div class="par">
  		<div class="top">
  			<div align="center"><h1>欢迎&nbsp;${loginUser.username }&nbsp;${loginUser.role.rname }&nbsp;登录</h1></div>
  			<a href="login.jsp">退出</a>
  		</div>
  		
    	<div class="left">
    		<ul>
    			<c:forEach items="${loginUser.role.powers }" var="power">
    				<li><a target="right" href="${power.qurl }">${power.qname }</a></li>
    				<!-- 
    					_black:新开一个页签
    					_parent:在父页签打开(当前的页签)
    				 -->
    			</c:forEach>
    		</ul>
    	</div>
    	
    	<div class="right">
    		<!-- 定义一个frame框架,在点击超链接的时候可以让超链接的页面显示在该框架下 -->
    		<iframe name="right"  frameborder="0" height="100%" width="100%">
    		
    		</iframe>
    	</div>
    </div>
  </body>
</html>
