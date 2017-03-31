<%@ page language="java" import="java.util.*" contentType="text/html" pageEncoding="utf-8"%>
<%
 Locale locale=request.getLocale();
 Calendar calendar=Calendar.getInstance(locale);
 int hour=calendar.get(Calendar.HOUR_OF_DAY);
 String greeting="";
 if(hour<6){
   greeting="凌晨好，您该睡觉了。良好的睡眠是美好一天的开始。";
 }else if(hour<=9){
   greeting="早上好，早餐应该注意营养。";
 }else if(hour<=12){
   greeting="上午好，工作时注意保护眼睛。";
 }else if(hour<=18){
   greeting="下午好，小心工作中打瞌睡。";
 }else if(hour<=24){
   greeting="晚上好。放松一下自己，好好休息。睡觉不要太晚啊~~~";
 }

 %>
<html>
<head>
  <title>欢迎页面</title>
</head>
<body>
<table>
  <tr><td><%=greeting %></td></tr>
</table>
</body>
</html>
