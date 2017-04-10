<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@page import="servlet.CountFileHandler;"%>
<html>
<head>
<title>统计访问量-无缺陷</title>
</head>
<body>
<%!
public String transform(long count){
	String countNumber=count+"";
	String newNumber="";
	for(int i=0;i<countNumber.length();i++){
		newNumber=newNumber+"<img src=\"images\\"+countNumber.charAt(i)+".gif\">";
	}
	return newNumber;
}
%>
<% 
long count=CountFileHandler.readFile(request.getRealPath("/")+"count.txt");
if(session.getAttribute("visited")==null){
	session.setAttribute("visited","y");
	session.setMaxInactiveInterval(60*60*24);
	count=count+1;
	CountFileHandler.writeFile(request.getRealPath("/")+"count.txt",count);
}
%>
<h2>
欢迎您访问，本页面已经被访问过
<%=transform(count) %>次了。 
</h2>
</body>
</html>