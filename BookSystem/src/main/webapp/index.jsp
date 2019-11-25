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
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
 table{
  border-collapse:collapse;
 }
 td{
    border:1px solid black;
 }
</style>
<script type="text/javascript" src="<%=basePath%>My97DatePicker/WdatePicker.js"></script>
  </head>
  <body>
<div align="center">
  			<!-- 查询条件表单 -->
	  		<form action="bookController/toBookList.do" method="post">
	  			类型:
	  				<select name="query.qlxid">
	  					<option value="0">--请选择--</option>
	  					<c:forEach items="${lxList}" var="lx">
	  						<option value="${lx.lxid }" <c:if test="${fenYe.query.qlxid==lx.lxid }">selected="selected"</c:if>>${lx.lxname }</option>
	  					</c:forEach>
	  				</select>
	  			书名:<input type="text" name="query.qbookname" value="${fenYe.query.qbookname }">
	  			日期开始:<input type="text" name="query.qStartshijian" class="Wdate" onclick="WdatePicker()" readonly="readonly"  value="<fmt:formatDate value='${fenYe.query.qStartshijian}' pattern='yyyy-MM-dd'/>">
	  			日期结束: <input type="text" name="query.qEndshijian" class="Wdate" onclick="WdatePicker()" readonly="readonly"  value="<fmt:formatDate value='${fenYe.query.qEndshijian}' pattern='yyyy-MM-dd'/>" >
	  			<input type="submit" value="搜索">
	  		</form>
	  		<!-- 用来显示图书列表 -->
	  		<form action="bookController/deleteBook.do" method="post" onsubmit="return confirm('是否确定全部删除？')">
			<table border="1"  >
				<tr align="center">
				    <td>全选<input type="checkbox" id="allBox"></td>
					<td>图书编号</td>
					<td>书名</td>
					<td>类型编号</td>
					<td>作者</td>
					<td>出版社</td>
					<td>时间</td>
					<td>库存</td>
					<td>图片<td>
					<td colspan="2">操作</td>
			
				</tr>
				<c:forEach items="${bookList}" var="b">
					<tr align="center">
				        <td><input type="checkbox"  name="ids" value="${b.bookid}"></td>
						<td>${b.bookid}</td>
						<td>${b.bookname }</td>
						<td>${b.lx.lxname}</td>
						<td>${b.author}</td>
						<td>${b.chubanshe}</td>
						<td><fmt:formatDate value="${b.shijian}" pattern="yyyy-MM-dd"/></td>
						<td>${b.kucun}</td>
						<td><img alt="" src="${b.tupian}"></td>
						<td><a href="bookController/deleteBook.do?ids=${b.bookid}" onclick="return confirm('确定删除？')"><input type="button" class="shanchu" value="删除"/></a></td>
					    <td><a href="bookController/xiuGaiXianshi.do?bookid=${b.bookid}"><input type="button" class="xiugai" value="修改"/></a></td>
					</tr>
				</c:forEach>
			</table>
			 <input type="submit" value="批量删除"/>
  </form>
			<%-- 
				<c:url>:可以动态帮我们拼接一个URL
					<c:param>:可以当成键值对拼在URL后面
					
				效果:toCarListServlet.do?brandId=2&birDateStart=2018-07-12&birDateEnd=2018-09-08
			 --%>
			<c:url var="bookUrl" value="bookController/toBookList.do">
				<c:param name="query.qbookname" value="${fenYe.query.qbookname}"></c:param>		
				<c:param name="query.qlxid" value="${fenYe.query.qlxid}"></c:param>	
				<c:param name="query.qStartshijian" >
					<fmt:formatDate value="${fenYe.query.qStartshijian}" pattern="yyyy-MM-dd"/>
				</c:param>
				<c:param name="query.qEndshijian" >
					<fmt:formatDate value="${fenYe.query.qEndshijian}" pattern="yyyy-MM-dd"/>
				</c:param>
			</c:url>
		<p><a href="bookController/lxXianShi.do">添加图书</a><p>
			<a href="${bookUrl }&page=1">首页</a>
			<c:choose>
				<c:when test="${fenYe.page==1 }">
					上一页
				</c:when>
				<c:otherwise>
					<a href="${bookUrl }&page=${fenYe.page-1}">上一页</a>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${fenYe.page>=fenYe.pageCount }">
					下一页
				</c:when>
				<c:otherwise>
					<a href="${bookUrl }&page=${fenYe.page+1}">下一页</a>
				</c:otherwise>
			</c:choose>
			<a href="${bookUrl }&page=${fenYe.pageCount}">尾页</a>
			第${fenYe.page }页/共${fenYe.pageCount }页
		</div>
		</body>
</html>
<script type="text/javascript" src="jquery-2.1.4/jquery.js"></script>
<script type="text/javascript">
$(function(){
	$("#allBox").on('click',function() {  
	      $("input[name='ids']").prop("checked", this.checked);  
	});  
	    
	$("input[name='ids']").on('click',function() {  
	      var $subs = $("input[name='ids']");  
	      $("#allBox").prop("checked" , $subs.length == $subs.filter(":checked").length ? true :false);  
	});
})
</script>