<%@ page language="java" import="test.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>
    <title>用户注册页面</title>
  </head>
  <body>
    
    <% 
       String s=request.getParameter("username");
       String p=request.getParameter("pwd1");
       
       User user=new User();
       user.setName(s);
       user.setPassword(p);
     %>
     恭喜用户<%=user.getName()%>注册成功！
</body>
</html>  