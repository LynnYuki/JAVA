<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<html>
  <head>  
    <title>request��Χ</title>    
  </head>  
  <body>
<jsp:useBean id="counter" scope="session" class="com.bean.Counter" />
<br>��ã����ǵ�<b><%out.println(counter.getCount());%></b>λ�ÿ�
<a href=" Redirect1.jsp">count</a>
  </body>
</html>
