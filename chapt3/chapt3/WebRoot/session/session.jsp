<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>

<html>
  <head>
    <title>sessionʵ��</title>
  </head>
  
  <body>
    <p>
     <% String s=session.getId();
        String ss="Hello world";
        session.setAttribute("name",ss);
      %>
     <p>����session�����ID��:
       <br>
       <%=s %>
     <p>���������������ӵ�tom.jsp
       <Form action="tom.jsp" method=post name=form>
           <input type="text" name="boy">
           <input type="submit" value="�ͳ�" name=submit>
       </Form>   
  </body>
</html>
