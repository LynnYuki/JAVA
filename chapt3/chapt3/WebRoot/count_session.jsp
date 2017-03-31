<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<html>
  <head>  
    <title>request范围</title>    
  </head>  
  <body>
<jsp:useBean id="counter" scope="session" class="com.bean.Counter" />
<br>你好！你是第<b><%out.println(counter.getCount());%></b>位访客
<a href=" Redirect1.jsp">count</a>
  </body>
</html>
