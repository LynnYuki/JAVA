<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head> 
    <title>request对象取得页面传递参数示例</title>
  </head>
  <%
       String param = request.getParameter("param");
       
   %>
  <body>
      <font size="2">
      <a href="url.jsp?param=Hello">请点击这个链接</a><br>
      你提交的参数为：<%=param%>
      </font>
  </body>
</html>