<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>request处理</title>
  </head>
  
  <body>
    <%
    //获取请求的钱数
    String bal=request.getParameter("balance");
    //将钱数转换为双精度浮点数
    double money=Double.parseDouble(bal);
    //对取出的钱数进行判断
    if(money<500){
       out.println("给你"+money+"块");
       out.println("用户减少"+money);
    }else{
     //创建一个List对象
     List<String> info=new ArrayList<String>();
     info.add("111111");
     info.add("222222");
     info.add("333333");
     //将info对象放入request范围内
     request.setAttribute("info",info);
     %>
     <jsp:forward page="second.jsp"></jsp:forward>
     <%} %>
     
  </body>
</html>
