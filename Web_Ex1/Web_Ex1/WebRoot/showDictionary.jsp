<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>单词分割</title>
  </head>
  
  <body>
  <font size=3>
  <%--声明成员变量和方法 --%>
    <%!
      TreeSet<String> dictionary=new TreeSet<String>();
      public void addWord(String s){
        String word[] =s.split(" ");
        for(int i=0;i<word.length;i++){
         dictionary.add(word[i]);
        } 
      }
     %>
   
     <%
       //取得用户输入的单词
       String str=request.getParameter("word");
       //调用方法对字符串进行分割并加入到TreeSet中
       addWord(str);
       //显示分割之后的所有的单词
       Iterator<String> te=dictionary.iterator();
       while(te.hasNext()){
         String word=te.next();
         out.print(" "+word);
       }
     
      %>
  </body>
</html>
