<%@ page language="java" import="test.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>
    <title>�û�ע��ҳ��</title>
  </head>
  <body>
    
    <% 
       String s=request.getParameter("username");
       String p=request.getParameter("pwd1");
       
       User user=new User();
       user.setName(s);
       user.setPassword(p);
     %>
     ��ϲ�û�<%=user.getName()%>ע��ɹ���
</body>
</html>  