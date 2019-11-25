<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<form action="bookController/updateBook.do?lx.lxid=${bb.lx.lxid}" method="post" enctype="multipart/form-data">
<%-- <input type="hidden" name="lx.lxid" value="${bb.lx.lxid}"> --%>
编号：<input type="text" name="bookid" value="${bb.bookid}" readonly="readonly"/></br>
书名：<input type="text" name="bookname" value="${bb.bookname}"/></br>
类型：<input type="text" name="lx.lxname" value="${bb.lx.lxname}" readonly="readonly"/></br>
作者：<input type="text" name="author" value="${bb.author}"/></br>
出版社：<input type="text" name="chubanshe" value="${bb.chubanshe}"/></br>
出版时间：<input type="text" name="shijian" value="<fmt:formatDate value='${bb.shijian}' pattern='yyyy-MM-dd'/>" class="Wdate" onclick="WdatePicker()"/></br>
库存：<input type="text" name="kucun" value="${bb.kucun}" readonly="readonly"/></br>
	<img id="imghead" alt="" src="${bb.tupian}" ><p>
			图片:<input name="fimg" id="file" type="file" onchange="imgChange(this)"><p>
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