<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
 <BODY>
  <%
     String str=request.getParameter("computer"); //��ȡֵ
     int n=Integer.parseInt(str);
     int sum=0;
     for(int i=1;i<=n;i++)
        {
          sum=sum+i;
        }
  %>
  <P>��1��<%=n%>����������: <%=sum%>
 </BODY>
</HTML>
