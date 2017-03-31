<%@ page contentType="text/html;charset=GB2312" %>
<html>
 <body><font size=4 color="blue">
  <p align="center"> 
  <b>请输入圆的半径:</b>
  <br>
  <form action="" method=get name=form>
      <input type="text" name="cat">
      <input type="submit" value="计算" name=submit> 
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
      Circle circle=new Circle(r);  //创建对象
   %>
  <% if(request.getParameter("submit")!=null){ %>
  <p align="center"> 圆的半径为: <%=circle.r%>
  <p align="center"> 圆的面积为: <%=circle.area()%>
  <p align="center"> 圆的周长为: <%=circle.zhou()%>
  <%} %>
  </font> 
 </body>
</html>
