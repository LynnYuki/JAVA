<%@ page language="java" import="java.util.*" contentType="text/html;charset=GB2312"%>
<%@ page import="mypack.SaveNumber" %>
<jsp:useBean id="aver" type="mypack.SaveNumber" scope="request"></jsp:useBean>
<html>
 
  
  <body > 
   <jsp:getProperty name="aver" property="firstNumber"/>��
   <jsp:getProperty name="aver" property="secondNumber"/>��
   <p>����ƽ��ֵ=<jsp:getProperty name="aver" property="resultA"/>
   <p>����ƽ��ֵ=<jsp:getProperty name="aver" property="resultB"/>
  </body>
</html>
