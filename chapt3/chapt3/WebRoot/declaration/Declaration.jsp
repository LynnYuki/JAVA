<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>
    <title>JSP声明应用案例</title>
  </head>
  <body>
    <center>
      <%="<font size=5 color=blue>声明的应用</font>"%>
    </center><hr>
    <%! int num=0; %>
    <%! String str1,str2; %>
    <% str1="你好！你是第 ";str2=" 位访问的客人"; %>
    <% num++; %>
    <%!Date myDate=new Date(); %>
    <div align="center">
       <font size="4" color="blue"><b>
         <%=str1%><%=num%><%=str2%></font><p>
       <font color="green">
         第一位客人访问的时间是：<%=myDate.toLocaleString()%>
       </font></div>   
  </body>
</html>
