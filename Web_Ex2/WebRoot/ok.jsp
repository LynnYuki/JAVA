<%@ page contentType="text/html;charset=GB2312" %>
<html>
<head>
<title>猜数游戏-答对了</title>
<head>
<body>
<p><font color="blue">恭喜你，答对了！你总共猜了<%=session.getAttribute("count") %>次.</font>
<%session.invalidate(); %>
<p><a href="guess.jsp">再来一次？</a>
 </body>
</html>