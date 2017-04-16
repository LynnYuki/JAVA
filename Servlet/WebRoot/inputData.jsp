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
      <p>¼ÆËãÁ½¸öÕýÊýµÄ´úÊýÆ½¾ùÖµ:
      <br>ÊäÈëÕýÊý:<input type=text name="firstNumber" size=4>
           ÊäÈëÕýÊý:<input type=text name="secondNumber" size=4>
      <input type=submit value="Ìá½»">     
    </form>  
    <form action="lookAverage" Method="get">
      <p>¼ÆËãÁ½¸öÕýÊýµÄ¼¸ºÎÆ½¾ùÖµ:
      <br>ÊäÈëÕýÊý:<input type=text name="firstNumber" size=4>
           ÊäÈëÕýÊý:<input type=text name="secondNumber" size=4>
      <input type=submit value="Ìá½»">     
    </form>
   
  </font>
</body>
</html>