<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>
    <title>�û���¼ҳ��</title>
  </head>
  <script type="text/javascript"> 
  function checkpwd(){ 
   var p1=document.loginForm.pwd1.value;//��ȡ������ֵ  
   var p2=document.loginForm.pwd2.value;//��ȡ�������������ֵ  
   if(p1==""){  
    alert("���������룡");//��⵽����Ϊ�գ��������� 
    document.form1.pwd1.focus();//����ŵ������   
    return false;//�˳���⺯�� 
   }    
  if(p1!=p2){
      alert("������������벻һ��"); 
   }
   }
  </script>
  <body>
    <form name="loginForm" method="POST" action="zhuce1.jsp">
    <table>
      <tr>
        <td><div align="right">�û���:</div></td>
       <td><input type="text" name="name"></td>
      </tr>
      <tr>
        <td><div align="right">����:</div></td>
      <td><input type="password" name="password"></td>
      </tr>
      <tr>
        <td><div align="right">ȷ������:</div></td>
        <td><input type="password" name="pwd2" onchange="checkpwd()"></td>
      </tr>
      <tr>
        <td><input type="submit" name="submit" value="submit"></td>
        <td><input type="reset" name="reset" value="reset"></td>
      </tr>
    </table>
     <div id="msg" style="color:red;"></div>
  </form>
  


</body>
</html>  