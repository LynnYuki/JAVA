<%@ page language="java" import="test.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>
    <title>用户注册页面</title>
  </head>
  <body>
    <jsp:useBean id="user" scope="page" class="test.User"/>
    
    <jsp:setProperty  property="*"  name="user" />
   
  
     恭喜用户<jsp:getProperty property="name" name="user"/>  注册成功！
</body>
</html>  