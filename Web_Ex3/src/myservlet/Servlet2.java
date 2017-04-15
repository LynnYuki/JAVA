package myservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Servlet2 extends GenericServlet {

   /** 响应客户请求*/
  public void service(ServletRequest request,ServletResponse response)
    throws ServletException, IOException {

    //读取存放在请求范围内的num1和num2
    Integer num1 =(Integer)request.getAttribute("num1");
    Integer num2 =(Integer)request.getAttribute("num2");
    Integer sum=num1+num2;
    //在请求范围内存放sum
    request.setAttribute("sum",sum);

    /*把请求转发给Servlet3 */
    ServletContext context = getServletContext();
    RequestDispatcher dispatcher =context.getRequestDispatcher("/servlet3");  
    dispatcher.forward(request, response);

  }
}




