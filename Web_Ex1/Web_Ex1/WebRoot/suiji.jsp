<%@ page contentType="text/html;charset=GB2312" %>
<HTML>
<BODY>

 <%
       double i=Math.random();
 %>

 <jsp:forward page="redi.jsp">
     <jsp:param  name="n" value="<%=i%>" />
     </jsp:forward>
 
</BODY>
</HTML>
