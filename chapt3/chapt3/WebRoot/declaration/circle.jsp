
<%@ page language="java" import="java.util.*" contentType="text/html;charset=gb2312"%>
<html>
	
	<body bgcolor="yellow">
	 <font size="4" color="blue">
	 <p align="center">
	   <b>������Բ�İ뾶:</b>
	   <br></br>
	   <form action="" method="get" name="form">
	     <input type="text" name="cat" value="1"></input>
	     <input type="submit" value="����" name="submit"></input>
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
     
	 <p align="center">Բ���ܳ��ǣ�<%=circle.zhou()%></p>
	 <p align="center">Բ������ǣ�<%=circle.area()%></p>
	 </font>
	</body>
</html>
