<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>   
    <title>request获取表单数据示例</title>
  </head> 
  <body>
  <font size="2">
  下面是表单内容：
  <form action="Form.jsp" method="post">
       用户名：<input type="text" name="userName" size="10"/>
       密  码：<input type="password" name="password" size="10"/>
      <input type="submit" value="提交" name="submit">
   </form>  
   下面是表单提交以后用request取到的表单数据：<br></br>
   <% 
    
      out.println("表单输入userName的值:"+request.getParameter("userName")+"<br>");
      out.println("表单输入password的值:"+request.getParameter("password")+"<br>"); 
    
    %>
   </font>
  </body>
</html>
