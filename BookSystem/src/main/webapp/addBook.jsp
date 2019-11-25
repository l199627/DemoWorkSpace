<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
  </head>
<body>
<form action="bookController/addBook.do" method="post" enctype="multipart/form-data">
	    书名：<input type="text" name="bookname"/><br/>
	    类型：<select name="lx.lxid">
	    <option value="0">--请选择--</option>
   <c:forEach items="${lxList1}" var="lx">
				<option value="${lx.lxid}">${lx.lxname}</option>
				</c:forEach>
			</select>
			
	    作者：<input type="text" name="author" value="${loginUser.username}"/><br/>
	       出版社：<input type="text" name="chubanshe"/><br/>
	          出版日期：<input type="text" name="shijian"  class="Wdate" onclick="WdatePicker()"/><br/>
	             库存：<input type="text" name="kucun"/><br/>
	             <img id="imghead" alt="" src="" ><p>
	             图片:<input type="file" name="fimg" id="file" onchange="imgChange(this)"><p>
	         <input type="submit" value="确定"/>
    </form>
</body>
</html>
<script type="text/javascript">
function imgChange(obj) {
var file =document.getElementById("file");
var imgUrl =window.URL.createObjectURL(file.files[0]);
var img =document.getElementById('imghead');
img.setAttribute('src',imgUrl); 
};
</script>
