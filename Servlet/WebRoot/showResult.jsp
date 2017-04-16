<%@ page language="java" contentType="text/html; charset=GB2312"%>
<%@page import="javaBean.SaveNumber"%>
<jsp:useBean id="aver" type="javaBean.SaveNumber" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShowResult</title>
</head>
<body>
  <jsp:getProperty name="aver" property="firstNumber"/>Óë
  <jsp:getProperty name="aver" property="secondNumber"/>µÄ
  <jsp:getProperty name="aver" property="type"/>=
  <jsp:getProperty name="aver" property="result"/>
</body>
</html>