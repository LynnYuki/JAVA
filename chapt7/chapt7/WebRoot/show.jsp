<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
</head>
  <%!
     public String conver(String str){
         try{
           String temp_p=str;
           byte[] temp_t=temp_p.getBytes("ISO8859-1");
           String temp=new String(temp_t,"utf-8");
           return temp;
     }catch(Exception e){
        return null;
    }
  }
   %>
<body>
   <table border=1>
     <tr>
       <td>电脑品牌</td>
       <td>电脑型号</td>
     </tr>
     <tr>
       <td><%= request.getParameter("pinpai") %></td>
       <td><%= request.getParameter("xinghao") %></td>
     </tr>
   </table>

</body>
</html>