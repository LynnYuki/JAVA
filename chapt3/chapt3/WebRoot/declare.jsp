<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>����ʾ��</title>
  </head>
  <!-- ������JSP�������� -->
  <%!
    //����һ�����α���
    public int count;
    //����һ������
    public String info(){
      return "hello";
    }
   %>
  <body> 
   <%
     //int count=0;
     //��count��ֵ������ټ�1
     out.println(count++);
    %>
    <br/>
    <%
     //���info()�����ķ���ֵ
     out.println(info());
    %>
  </body>
</html>
