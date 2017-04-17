package Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
public class CharacterServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse 
			response)throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println(request.getParameter("name"));
		out.println(request.getParameter("password"));
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("password"));
	}
	public void doPost(HttpServletRequest request, HttpServletResponse 
			response)throws ServletException, IOException {
		doGet(request, response);
	}
}
