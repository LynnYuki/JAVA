<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>
    <title>JSP����Ӧ�ð���</title>
  </head>
  <body>
    <center>
      <%="<font size=5 color=blue>������Ӧ��</font>"%>
    </center><hr>
    <%! int num=0; %>
    <%! String str1,str2; %>
    <% str1="��ã����ǵ� ";str2=" λ���ʵĿ���"; %>
    <% num++; %>
    <%!Date myDate=new Date(); %>
    <div align="center">
       <font size="4" color="blue"><b>
         <%=str1%><%=num%><%=str2%></font><p>
       <font color="green">
         ��һλ���˷��ʵ�ʱ���ǣ�<%=myDate.toLocaleString()%>
       </font></div>   
  </body>
</html>
