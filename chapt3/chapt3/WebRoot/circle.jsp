<%@ page contentType="text/html;charset=GB2312" %>
<html>
 <body><font size=4 color="blue">
  <p align="center"> 
  <b>������Բ�İ뾶:</b>
  <br>
  <form action="" method=get name=form>
      <input type="text" name="cat">
      <input type="submit" value="����" name=submit> 
  </form>
  <%!
     public class Circle
     {
        double r;
        Circle(double r)
       {
         this.r=r;
       }
        double area()
       {
         return Math.PI*r*r;
       }
        double zhou()
       {
         return Math.PI*2*r;
       }
     }
   %>
  
   <%
      String str=request.getParameter("cat");
      double r;
      if(str!=null)
       {
         r=Double.parseDouble(str);
       }
      else
       {
          r=1;
       }
      Circle circle=new Circle(r);  //��������
   %>
  <% if(request.getParameter("submit")!=null){ %>
  <p align="center"> Բ�İ뾶Ϊ: <%=circle.r%>
  <p align="center"> Բ�����Ϊ: <%=circle.area()%>
  <p align="center"> Բ���ܳ�Ϊ: <%=circle.zhou()%>
  <%} %>
  </font> 
 </body>
</html>
