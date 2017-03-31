<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<html>
  <head><title>request范围</title> </head>  
  <body>
<jsp:useBean id="counter" scope="request" class="com.bean.Counter" />
<br>你好！你是第<b><%out.println(counter.getCount());%></b>位访客
<p>欢迎再次访问：</p>
 <jsp:include page="request1.jsp" flush="true"/>
  </body>
</html>
