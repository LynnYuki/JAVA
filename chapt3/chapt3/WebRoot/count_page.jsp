<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>

<html>
  <head>   
    <title>page��Χ</title>    
  </head>  
  <body>
<jsp:useBean id="counter" scope="page" class="com.bean.Counter" />
<br>��ã����ǵ�<b><%out.println(counter.getCount());%></b>λ�ÿ�
  </body>
</html>
