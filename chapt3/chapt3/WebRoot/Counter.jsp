<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head> 
    <title>����Application����ʵ�ֵļ�����ʾ��</title>
  </head>
  <body>
      <font size="2">
          <%
              int count=0;
              if(application.getAttribute("count")==null)
              {
                  count = count +1;
                  application.setAttribute("count",count);
              }else
               {
                  count = Integer.parseInt(application.getAttribute("count").toString());
                  count = count + 1;
                   application.setAttribute("count",count);
               }
               
               out.println("���Ǳ�ϵͳ�ĵ�"+count+"�����ߣ�");
           %>
      </font>
  </body>
</html>