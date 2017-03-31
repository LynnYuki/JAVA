<%@ page language="java" import="test.*" pageEncoding="utf-8"%>  
<%  
Student stu=(Student)session.getAttribute("stu_key");  
 %>  
output information：<br>  
 name:<%=stu.getName() %> <br>  
 age:<%=stu.getAge() %> <br>  
 address:<%=stu.getAddress() %> <br>