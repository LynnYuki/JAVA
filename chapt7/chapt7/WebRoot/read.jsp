<%@ page language="java" contentType="text/html; 
charset=utf-8" pageEncoding="utf-8"  import="listener.*"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>从Session域中读取数据</h1>
	姓名:  ${sessionScope.myBean.name } 
	年龄：${sessionScope.myBean.age }
</body>
</html>
