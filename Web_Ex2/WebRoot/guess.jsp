<%@ page contentType="text/html;charset=gb2312" %>
<html>
<head>
<title>������Ϸ</title>
<head>
<body>
 <p><font color="#0000FF" size="4">������Ϸ</font>
 <%  
  if(session.isNew()){
     int num=(int)(Math.random()*100)+1;  
     System.out.println(num);
     session.setAttribute("count",new Integer(0));
     session.setAttribute("num",new Integer(num));
     }
  %>
  <p ><font size="3" color="#0000FF">ϵͳ�������һ��1��100֮�����</font> 
<P><font size="3" color="#0000FF">����������ı�����������µ���</font>
<form action="process.jsp" method="post" name="form1">
  <input type="text" name="number" >
  <input type="submit" value="�ύ">
</form>
</body>
</html>
