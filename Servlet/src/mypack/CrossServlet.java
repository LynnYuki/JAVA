package mypack;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class CrossServlet extends GenericServlet {

   /** ��Ӧ�ͻ�����*/
  public void service(ServletRequest request,ServletResponse response)
    throws ServletException, IOException {

    //��ȡ�û���
    String username = request.getParameter("username");
    String message=null;
    if(username==null){
      message="Please input username.";
    }else{
      message="Hello,"+username;
    }
    //��request���������msg����
    request.setAttribute("msg", message);
 
    /*������ת����helloapp1Ӧ���е�OutputServlet */
    ServletContext context = getServletContext();
    ServletContext crossContext = context.getContext("/chapt6");
    RequestDispatcher dispatcher =crossContext.getRequestDispatcher("/output");  //ok
    
 
    PrintWriter out=response.getWriter();
    dispatcher.forward(request, response);
  }
}

