<%@ page import="mypack.CounterBean" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<html>
<head><title>named varivable</title></head><body>

<jsp:useBean id="myPageBean1" scope="page" class="mypack.CounterBean" />
<jsp:useBean id="myPageBean2" scope="session" class="mypack.CounterBean" />
<jsp:useBean id="myPageBean3" scope="application" class="mypack.CounterBean" />

<%-- 把myPageBean的count属性的值加1 --%>
<jsp:setProperty name="myPageBean1" property="count"
	value="${myPageBean1.count+1}" />

<jsp:setProperty name="myPageBean2" property="count"
	value="${myPageBean2.count+1}" />
	
	<jsp:setProperty name="myPageBean3" property="count"
	value="${myPageBean3.count+1}" />
	
<%-- 打印myPageBean的count属性 --%>
Current page_count value is :${myPageBean1.count} <p>
Current session_count value is :${myPageBean2.count} <p>
Current application_count value is :${myPageBean3.count} <p>


<% 
application.setAttribute("driver","com.mysql.jdbc.Driver");
%>
Current driver is :${applicationScope.driver} <p>

</body>
</html>
