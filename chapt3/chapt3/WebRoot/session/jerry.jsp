<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>

<html>
  <head>
  <body> 
    <p>我是Jerry页面 
    <% String s=session.getId();
       String name=(String)request.getAttribute("name"); 
       out.print("<font color=red size=5"+name+"</font>");  
       String content=(String)request.getAttribute("content");
       out.print("<font color=red size=5"+content+"</font>");
      %>
  </p>
  <p>您在Jerry页面中的session对象的ID是:
  <%=s %>
  <p>您在session.jsp页面输入的名字是:
  <%=request.getParameter("boy") %>
   <p>session对象属性值有:
  <%=(String)session.getAttribute("content") %><br/>
  <%=(String)session.getAttribute("name") %><br/>
  <p>点击超级链接，连接到Jerry的页面。
  <a href="session.jsp">
  <br>欢迎到session家
  </a>
  </body>
</html>
