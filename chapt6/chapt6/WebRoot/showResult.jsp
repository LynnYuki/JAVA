<%@ page language="java" import="java.util.*" contentType="text/html;charset=GB2312"%>
<%@ page import="mypack.SaveNumber" %>
<jsp:useBean id="aver" type="mypack.SaveNumber" scope="request"></jsp:useBean>
<html>
 
  
  <body > 
   <jsp:getProperty name="aver" property="firstNumber"/>与
   <jsp:getProperty name="aver" property="secondNumber"/>的
   <p>代数平均值=<jsp:getProperty name="aver" property="resultA"/>
   <p>几何平均值=<jsp:getProperty name="aver" property="resultB"/>
  </body>
</html>
