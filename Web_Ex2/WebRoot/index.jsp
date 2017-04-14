<%@ page contentType="text/html;charset=gb2312" %>
<html>
<head>
<title>猜数游戏</title>
<head>
<body>
 <p><font color="#0000FF" size="4">猜数游戏</font>
 <%  
     int num=(int)(Math.random()*100)+1;  
     session.setAttribute("count",new Integer(0));
     session.setAttribute("num",new Integer(num));
  %>
  <p ><font size="3" color="#0000FF">系统随机生成一个1到100之间的数</font> 
<P><font size="3" color="#0000FF">请在下面的文本框中输入你猜的数</font>
<form action="process.jsp" method="post" name="form1">
  <input type="text" name="number" >
  <input type="submit" value="提交">
</form>
</body>
</html>
