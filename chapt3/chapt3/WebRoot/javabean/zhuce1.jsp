<%@ page language="java" import="test.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>
    <title>�û�ע��ҳ��</title>
  </head>
  <body>
    <jsp:useBean id="user" scope="page" class="test.User"/>
    
    <jsp:setProperty  property="*"  name="user" />
   
  
     ��ϲ�û�<jsp:getProperty property="name" name="user"/>  ע��ɹ���
</body>
</html>  