<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
  <head>
    <title>用户登录页面</title>
  </head>
  <script type="text/javascript"> 
  function checkpwd(){ 
   var p1=document.loginForm.pwd1.value;//获取密码框的值  
   var p2=document.loginForm.pwd2.value;//获取重新输入的密码值  
   if(p1==""){  
    alert("请输入密码！");//检测到密码为空，提醒输入 
    document.form1.pwd1.focus();//焦点放到密码框   
    return false;//退出检测函数 
   }    
  if(p1!=p2){
      alert("两次输入的密码不一致"); 
   }
   }
  </script>
  <body>
    <form name="loginForm" method="POST" action="zhuce.jsp">
    <table>
      <tr>
        <td><div align="right">用户名:</div></td>
        <td><input type="text" name="username"></td>
      </tr>
      <tr>
        <td><div align="right">密码:</div></td>
        <td><input type="password" name="pwd1"></td>
      </tr>
      <tr>
        <td><div align="right">确认密码:</div></td>
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