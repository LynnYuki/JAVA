<%@ page language="java" import="test.*" contentType="text/html;charset=gb2312"%>
<html>
  <head> 
    <title>response����ҳ���ض���ʾ��</title>
  </head>
  <body>
     <jsp:useBean id="counter" class="com.bean.Counter" scope="session" />
���!��л���<jsp:getProperty name="counter" property="count" />�εĹ���
  </body>
</html>