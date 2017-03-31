<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>
    <title>include动作指令使用示例程序</title>
 </head> 
  <body>
  <font size="2">
   <jsp:include flush="true" page="header.txt"></jsp:include>
   这是一个JSP动作标签include的使用示例程序。<br>
   <jsp:include flush="true" page="footer.jsp"></jsp:include>
   </font>
  </body>
</html>