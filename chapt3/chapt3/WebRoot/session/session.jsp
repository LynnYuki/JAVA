<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>

<html>
  <head>
    <title>session实例</title>
  </head>
  
  <body>
    <p>
     <% String s=session.getId();
        String ss="Hello world";
        session.setAttribute("name",ss);
      %>
     <p>您的session对象的ID是:
       <br>
       <%=s %>
     <p>输入您的姓名连接到tom.jsp
       <Form action="tom.jsp" method=post name=form>
           <input type="text" name="boy">
           <input type="submit" value="送出" name=submit>
       </Form>   
  </body>
</html>
