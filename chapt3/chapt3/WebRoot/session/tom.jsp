<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>

<html>
  <head>TOMҳ��</head>
  <body> 
    <p>����TOMҳ�� 
    <% String s=session.getId();
       String con=request.getParameter("boy");
       session.setAttribute("content",con); %>
  </p>
  <p>����TOMҳ���е�session�����ID��:
  <%=s %>
  <p>����������ӣ����ӵ�Jerry��ҳ�档
  <a href="jerry.jsp">
  <br>��ӭ��JERRY��
  </a>
  </body>
</html>
