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
       session.setAttribute("u_key",user);
       application.setAttribute("a_user",s);
     %>
     恭喜用户<%=s %>注册成功！
     
     <br/>
     <br/>
    <% response.sendRedirect("Redirect.jsp"); %>
    
  <br>欢迎到JSP家
</body>
</html>  