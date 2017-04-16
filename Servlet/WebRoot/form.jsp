<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>   
    <title>Servlet接收表单示例</title>
  </head> 
  <body>
     <font size="2">
        <form action="AcceptForm" method="post">
            姓名：<input type="text" name="name"/><br>
            省份：<input type="text" name="province"><br>
           <input type="submit" value="提交">
        </form>
     </font>
  </body>
</html>
