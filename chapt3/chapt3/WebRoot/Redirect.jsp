<%@ page language="java" import="test.*" contentType="text/html;charset=gb2312"%>
<html>
  <head> 
    <title>response对象页面重定向示例</title>
  </head>
  <body>
      <%
        String s=request.getParameter("username");
        String p=request.getParameter("pwd1");
        User user=(User)session.getAttribute("u_key");
        String a_user=(String)application.getAttribute("a_user");
      %>
      
 Welcome reponse.jsp：<br>  
 request_name:<%=s %> <br>  
 request_password:<%=p %> <br>  
 <br>  <br>  <br>  
 session_name:<%=user.getName() %> <br>  
 session_password:<%=user.getPassword() %> <br>  
 
 <br>  <br>  <br>  
 application_user:<%=a_user %>
  </body>
</html>