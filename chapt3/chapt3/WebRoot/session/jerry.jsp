<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>

<html>
  <head>
  <body> 
    <p>����Jerryҳ�� 
    <% String s=session.getId();
       String name=(String)request.getAttribute("name"); 
       out.print("<font color=red size=5"+name+"</font>");  
       String content=(String)request.getAttribute("content");
       out.print("<font color=red size=5"+content+"</font>");
      %>
  </p>
  <p>����Jerryҳ���е�session�����ID��:
  <%=s %>
  <p>����session.jspҳ�������������:
  <%=request.getParameter("boy") %>
   <p>session��������ֵ��:
  <%=(String)session.getAttribute("content") %><br/>
  <%=(String)session.getAttribute("name") %><br/>
  <p>����������ӣ����ӵ�Jerry��ҳ�档
  <a href="session.jsp">
  <br>��ӭ��session��
  </a>
  </body>
</html>
