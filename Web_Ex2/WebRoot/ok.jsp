<%@ page contentType="text/html;charset=GB2312" %>
<html>
<head>
<title>������Ϸ-�����</title>
<head>
<body>
<p><font color="blue">��ϲ�㣬����ˣ����ܹ�����<%=session.getAttribute("count") %>��.</font>
<%session.invalidate(); %>
<p><a href="guess.jsp">����һ�Σ�</a>
 </body>
</html>