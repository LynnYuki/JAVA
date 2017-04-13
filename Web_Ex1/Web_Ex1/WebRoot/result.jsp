<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Beer Recommendations JSP</title>
  </head>
  <body>
  <h1 align="center" >Beer Recommendations</h1>
  <%   List styles=(List)request.getAttribute("styles"); 
          Iterator it=styles.iterator();
          while(it.hasNext()){
            out.print("<br>try: "+it.next());
          }  
  %>
  </body>
</html>
