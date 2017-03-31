<%@ page language="java" import="test.*" pageEncoding="utf-8" %>  
<html>  
<body>  
<%  
Student stu=new Student();  
stu.setName("Christy");  
stu.setAge(22);  
stu.setAddress("US");  
session.setAttribute("stu_key",stu);  
 %>  
 <a href="result.jsp">verify information</a>  
</body>  
</html>  
