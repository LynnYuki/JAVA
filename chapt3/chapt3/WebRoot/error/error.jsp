<%@ page language="java" import="java.util.*" pageEncoding="GBK" isErrorPage="true"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>异常处理页面</title>
  </head>
  
  <body>
    异常类型是：<%=exception.getClass() %><br/>
    异常信息是：<%=exception.getMessage() %><br/>
  </body>
</html>
