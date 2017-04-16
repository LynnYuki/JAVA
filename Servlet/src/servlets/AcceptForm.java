package servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class AcceptForm extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		//设置服务器响应的内容格式为HTML文档格式
		response.setContentType("text/html");
		
		//设置服务器响应内容的字符编码GB2312
		response.setCharacterEncoding("gb2312");
		
		//取出输出对象，用来在页面上输出要显示的内容
		PrintWriter out = response.getWriter();
		
		//设置请求对象的字符编码GB2312
		request.setCharacterEncoding("gb2312");
		
		//取出表单中的输出内容
		String name = request.getParameter("name");
		String province = request.getParameter("province");

		out.println("<font size='2'>");
		out.print("提交的表单内容为:<br>");
		out.print("姓名:" + name + "<br>");
		out.print("省份:" + province + "<br>");
		out.print("</font>");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doGet(request, response);
	}
}

