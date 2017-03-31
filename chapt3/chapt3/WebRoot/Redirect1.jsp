<%@ page language="java" import="test.*" contentType="text/html;charset=gb2312"%>
<html>
  <head> 
    <title>response对象页面重定向示例</title>
  </head>
  <body>
     <jsp:useBean id="counter" class="com.bean.Counter" scope="session" />
你好!感谢你第<jsp:getProperty name="counter" property="count" />次的光临
  </body>
</html>