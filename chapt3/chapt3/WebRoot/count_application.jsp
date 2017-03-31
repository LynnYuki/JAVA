<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>Application_count.jsp</head>  
  <body>
<jsp:useBean id="counter" scope="application" class="com.bean.Counter" />
<br>你好！你是第<b><%out.println(counter.getCount());%></b>位访客
  </body>
</html>
