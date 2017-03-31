
<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
	
	<body bgcolor="yellow">
	 <font size="4" color="blue">
	 <p align="center">
	   <b>请输入圆的半径:</b>
	   <br></br>
	   <form action="" method="get" name="form">
	     <input type="text" name="cat" value="1"></input>
	     <input type="submit" value="计算" name="submit"></input>
	   </form>
	
	   <%!
            public class Circle{
                  double r;
                  Circle(double r){
                     this.r=r;
                  }
       
                  double area(){
                      return Math.PI*r*r;
                 }
                  
                   double zhou(){
                      return Math.PI*2*r;
                  }
           }       

       %>
       <%
           String str=request.getParameter("cat");
           double r;
           if(str!=null){
                r=Double.parseDouble(str);
           }
           else{
                r=1;
           }
        
          Circle circle=new Circle(r);
        %>
     
	 <p align="center">圆的周长是：<%=circle.zhou()%></p>
	 <p align="center">圆的面积是：<%=circle.area()%></p>
	 </font>
	</body>
</html>
