<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
 <BODY>
  <%
     String str=request.getParameter("computer"); //获取值
     int n=Integer.parseInt(str);
     int sum=0;
     for(int i=1;i<=n;i++)
        {
          sum=sum+i;
        }
  %>
  <P>从1到<%=n%>的连续和是: <%=sum%>
 </BODY>
</HTML>
