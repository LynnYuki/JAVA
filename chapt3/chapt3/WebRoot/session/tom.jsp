<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>

<html>
  <head>TOM页面</head>
  <body> 
    <p>我是TOM页面 
    <% String s=session.getId();
       String con=request.getParameter("boy");
       session.setAttribute("content",con); %>
  </p>
  <p>您在TOM页面中的session对象的ID是:
  <%=s %>
  <p>点击超级链接，连接到Jerry的页面。
  <a href="jerry.jsp">
  <br>欢迎到JERRY家
  </a>
  </body>
</html>
