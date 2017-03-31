<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>application≤‚ ‘</title>
  </head>
  
  <body>
    <%! int i; %>
    <%
      application.setAttribute("counter",String.valueOf(++i));
     %>
     <%=i %>
  </body>
</html>
