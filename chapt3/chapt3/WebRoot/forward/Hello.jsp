<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<html>
  <head>
    <title>Hello.jsp</title>
  </head>
  <body>
    Welcome to our page! 
    <%if (request.getParameter("userName")==null){%>
        <jsp:forward page="HandleIt.jsp"/>
  <%} %>  
  Hello <%=request.getParameter("userName") %>
  </body>
</html>
