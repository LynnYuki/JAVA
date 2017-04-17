<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8" import="listener.*"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>向Session域中存入数据</h1>
	<%
		//MyBean2 myBean = new MyBean2();
		MyBean2_ myBean = new MyBean2_();
		myBean.setName("Tom");
		myBean.setAge(20);
		session.setAttribute("myBean", myBean);
	%>
</body>
</html>
