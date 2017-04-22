<%@ page contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@page import="mypack. BookDetails" %>
<%@ page import="java.util.*" %>



<html>
<head><title>BookCatalog</title></head>
 <%@ include file="banner.jsp" %>


<p><h3>
<font color="red">



<p><strong><a href="<%=request.getContextPath()%>/showcart.jsp">查看购物车</a>&nbsp;&nbsp;&nbsp;
<a href="<%=request.getContextPath()%>/cashier.jsp">付账</a></p></strong>


<h3>请选择想购买的书：</h3>

<table>


<tr>
<td bgcolor="#ffffaa">Java2认证考试指南与试题解析</td>
<td bgcolor="#ffffaa" >
<a href="<%=request.getContextPath()%>/CartServelt?type=add&id=0001&title=Java2认证考试指南与试题解析 &price=35.00">&nbsp;加入购物车&nbsp;</a></td></tr>



<tr>
<td bgcolor="#ffffaa">Java面向对象编程</td>
<td bgcolor="#ffffaa">
<a href="<%=request.getContextPath()%>/CartServelt?type=add&id=0002&title=Java面向对象编程&price=65.80">&nbsp;加入购物车&nbsp;</a></td>
</tr>


<tr>
<td bgcolor="#ffffaa">Java网络编程精讲</td>
<td bgcolor="#ffffaa" >
<a href="<%=request.getContextPath()%>/CartServelt?type=add&id=0003&title=Java网络编程精讲&price=48.20">&nbsp;加入购物车&nbsp;</a></td>
</tr>


<tr>
<td bgcolor="#ffffaa">Tomcat与JavaWeb开发技术详解</td>
<td bgcolor="#ffffaa" >
<a href="<%=request.getContextPath()%>/CartServelt?type=add&id=0004&title=Tomcat与JavaWeb开发技术详解&price=79.50">&nbsp;加入购物车&nbsp;</a></td>
</tr>


</table>

</body>
</html>
