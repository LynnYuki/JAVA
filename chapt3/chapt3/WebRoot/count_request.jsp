<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<html>
  <head><title>request��Χ</title> </head>  
  <body>
<jsp:useBean id="counter" scope="request" class="com.bean.Counter" />
<br>��ã����ǵ�<b><%out.println(counter.getCount());%></b>λ�ÿ�
<p>��ӭ�ٴη��ʣ�</p>
 <jsp:include page="request1.jsp" flush="true"/>
  </body>
</html>
