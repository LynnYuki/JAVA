<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>request����</title>
  </head>
  
  <body>
    <%
    //��ȡ�����Ǯ��
    String bal=request.getParameter("balance");
    //��Ǯ��ת��Ϊ˫���ȸ�����
    double money=Double.parseDouble(bal);
    //��ȡ����Ǯ�������ж�
    if(money<500){
       out.println("����"+money+"��");
       out.println("�û�����"+money);
    }else{
     //����һ��List����
     List<String> info=new ArrayList<String>();
     info.add("111111");
     info.add("222222");
     info.add("333333");
     //��info�������request��Χ��
     request.setAttribute("info",info);
     %>
     <jsp:forward page="second.jsp"></jsp:forward>
     <%} %>
     
  </body>
</html>
