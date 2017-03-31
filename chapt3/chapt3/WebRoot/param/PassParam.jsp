<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head> 
    <title>页面跳转并且传递参数示例</title>
  </head>
  <body>
      从这个页面传递参数：
      <jsp:forward page="hello.jsp">
          <jsp:param name="hello" value="Hello"/>
      </jsp:forward>
  </body>
</html>
