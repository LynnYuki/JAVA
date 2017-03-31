<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>

<html>
  <head>   
    <title>page范围</title>    
  </head>  
  <body>
<jsp:useBean id="counter" scope="page" class="com.bean.Counter" />
<br>你好！你是第<b><%out.println(counter.getCount());%></b>位访客
  </body>
</html>
