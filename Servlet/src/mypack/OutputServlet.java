package mypack;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class OutputServlet extends GenericServlet {

   /** 响应客户请求*/
  public void service(ServletRequest request,ServletResponse response)
    throws ServletException, IOException {

    //读取CheckServlet存放在请求范围内的消息
    String message = (String)request.getAttribute("msg");
    PrintWriter out=response.getWriter();
    out.println(message); 
    out.close();
  }
}

