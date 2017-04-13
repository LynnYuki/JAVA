<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<BODY bgcolor=cyan>
    <FONT size=3>
    <%
       String str=request.getParameter("n");
       if(str==null) str="0";
       double n=Double.parseDouble(str);
    %>
 
    <P>您传过来的数值是:<%=n%>
    </FONT>

</BODY>
</HTML>
