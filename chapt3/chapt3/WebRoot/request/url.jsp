<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head> 
    <title>request����ȡ��ҳ�洫�ݲ���ʾ��</title>
  </head>
  <%
       String param = request.getParameter("param");
       
   %>
  <body>
      <font size="2">
      <a href="url.jsp?param=Hello">�����������</a><br>
      ���ύ�Ĳ���Ϊ��<%=param%>
      </font>
  </body>
</html>