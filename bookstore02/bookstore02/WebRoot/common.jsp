<%@ page import="java.util.Properties" %>
<%@ page errorPage="errorpage.jsp" %>


<%!
   public String convert(String s){
    try{
     	return new String(s.getBytes("ISO-8859-1"),"utf-8");
    }catch(Exception e){return null;}
   }
%>
