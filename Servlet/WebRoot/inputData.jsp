<%@ page language="java" contentType="text/html; charset=GB2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <font size=2>
    <form action="lookAverage" Method="post">
      <p>计算两个正数的代数平均值:
      <br>输入正数:<input type=text name="firstNumber" size=4>
           输入正数:<input type=text name="secondNumber" size=4>
      <input type=submit value="提交">     
    </form>  
    <form action="lookAverage" Method="get">
      <p>计算两个正数的几何平均值:
      <br>输入正数:<input type=text name="firstNumber" size=4>
           输入正数:<input type=text name="secondNumber" size=4>
      <input type=submit value="提交">     
    </form>
   
  </font>
</body>
</html>