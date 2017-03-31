<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    <title>request处理</title>
  
  </head>
  
  <body>
    <%
      String bal=request.getParameter("balance");
      double money=Double.parseDouble(bal);
      
      List<String> info=(List<String>)request.getAttribute("info");
      for(String tmp:info){
         out.println(tmp+"<br/>");
      }
      out.println("给你"+money+"块");
      out.println("用户减少"+money);
     %>
  </body>
</html>
