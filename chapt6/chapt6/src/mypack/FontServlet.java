package mypack;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FontServlet extends HttpServlet {
  /** 响应客户请求*/
  public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
	 //request.setCharacterEncoding("GBK");
    //获得word请求参数 
    String word=request.getParameter("word");
    if(word==null)word="Hello";
    
    //读取初始化参数
    String color=getInitParameter("color");
    String size=getInitParameter("size");

    //设置HTTP响应的正文的MIME类型及字符编码
    response.setContentType("text/html;charset=GBK");
   
    /*输出HTML文档*/
    PrintWriter out = response.getWriter();
    out.println("<html><head><title>FontServlet</TITLE></head>");
    out.println("<body>");
    out.println("<font size='"+size+"' color='"+color+"'>"+word+"</font>");
    out.println("</body></html>");
     
    out.close(); //关闭PrintWriter
  }
}

