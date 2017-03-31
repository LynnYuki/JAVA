<%@ page language="java"   pageEncoding="UTF-8" isErrorPage="true"%>
<%
  request.setCharacterEncoding("utf-8");
  response.setCharacterEncoding("utf-8");
  if("POST".equals(request.getMethod())){
     Cookie usernameCookie=new Cookie("username",request.getParameter("username"));
     Cookie visittimesCookie=new Cookie("visitTime","0");
     response.addCookie(usernameCookie);
     response.addCookie(visittimesCookie);
     response.sendRedirect(request.getContextPath()+"/cookie/cookie.jsp");
  }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>请先登录</title>
  </head>
  
  <body>
    <div align="center" style="margin:10px;">
      <fieldset>
         <legend>登录</legend>
         <form action="cookie.jsp" method="post">
           <table> 
             <tr>
                <td></td>
                <td><%=exception.getMessage() %></td>
              </tr>
              <tr>
                <td>帐号:</td>
                <td><input type="text" name="username" style="width:200px"></td>
              </tr>
              <tr>
                <td>密码:</td>
                <td><input type="password" name="password" style="width:200px"></td>
              </tr>
              <tr>
                <td></td>
                <td><input type="submit" value="登 录" style="width:200px"></td>
              </tr>
           
           </table>
         
         </form>
         
   
      </fieldset>
    
    </div>
  </body>
</html>
