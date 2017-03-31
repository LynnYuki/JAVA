<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>声明示例</title>
  </head>
  <!-- 下面是JSP声明部分 -->
  <%!
    //声明一个整形变量
    public int count;
    //声明一个方法
    public String info(){
      return "hello";
    }
   %>
  <body> 
   <%
     //int count=0;
     //将count的值输出后再加1
     out.println(count++);
    %>
    <br/>
    <%
     //输出info()方法的返回值
     out.println(info());
    %>
  </body>
</html>
