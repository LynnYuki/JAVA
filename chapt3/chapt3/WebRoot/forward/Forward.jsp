<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312" %>
<html>
  <head>
     <title>forward动作指令使用示例</title>
  </head> 
  <body>
    文件将定向到hello.htm
    这两句话被执行了，但是看不见，因为页面重定向了
   <jsp:forward page="hello.htm"></jsp:forward>
   重定向语句后面的内容将不会执行
  </body>
</html>
