<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>   
    <title>request��ȡ������ʾ��</title>
  </head> 
  <body>
  <font size="2">
  �����Ǳ����ݣ�
  <form action="Form.jsp" method="post">
       �û�����<input type="text" name="userName" size="10"/>
       ��  �룺<input type="password" name="password" size="10"/>
      <input type="submit" value="�ύ" name="submit">
   </form>  
   �����Ǳ��ύ�Ժ���requestȡ���ı����ݣ�<br></br>
   <% 
    
      out.println("������userName��ֵ:"+request.getParameter("userName")+"<br>");
      out.println("������password��ֵ:"+request.getParameter("password")+"<br>"); 
    
    %>
   </font>
  </body>
</html>
