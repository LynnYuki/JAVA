package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AcceptLink extends HttpServlet {

	

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("gb2312");
        PrintWriter out = response.getWriter();
        
        //request.setCharacterEncoding("gb2312");
        //String name = new String((request.getParameter("name")).getBytes("ISO-8859-1"),"GB2312");
        String name=request.getParameter("name");
        out.println("<font size='2'>");
        out.println("链接传递过来的参数为：<br>");
        out.println("参数名称：name<br>");
        out.println("参数值：" + name + "<br>");
        out.print("</font>");		
}

public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
      doGet(request, response);
}

}
