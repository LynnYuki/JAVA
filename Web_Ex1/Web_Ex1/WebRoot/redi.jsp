<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<BODY bgcolor=cyan>
    <FONT size=3>
    <%
       String str=request.getParameter("n");
       if(str==null) str="0";
       double n=Double.parseDouble(str);
    %>
 
    <P>������������ֵ��:<%=n%>
    </FONT>

</BODY>
</HTML>
