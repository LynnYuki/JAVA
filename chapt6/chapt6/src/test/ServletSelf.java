package test;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletSelf extends HttpServlet {
      public void init(ServletConfig config)throws ServletException{
		super.init(config);
          }
	
     public void service(HttpServletRequest request,HttpServletResponse 
                                       response)throws IOException
       {
		response.setContentType("text/html;charset=GB2312");
		PrintWriter out=response.getWriter();
		out.println("<HTML><BODY>");
		out.println("<font size=6 color=red>将本字符串用红色字体输出客户端</font>");
		out.println("</BODY></HTML>");
		
	}

}
