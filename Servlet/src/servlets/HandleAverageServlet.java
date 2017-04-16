package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javaBean.SaveNumber;

public class HandleAverageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SaveNumber bean=new SaveNumber();
		request.setAttribute("aver",bean);
		double a=Double.parseDouble(request.getParameter("firstNumber"));
		double b=Double.parseDouble(request.getParameter("secondNumber"));
		bean.setFirstNumber(a);
		bean.setSecondNumber(b);
		bean.setType("代数平均值");
		double aver=(a+b)/2;
		bean.setResult(aver);
		RequestDispatcher dispatcher=request.getRequestDispatcher("showResult.jsp");
		dispatcher.forward(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SaveNumber bean=new SaveNumber();
		request.setAttribute("aver",bean);
		double a=Double.parseDouble(request.getParameter("firstNumber"));
		double b=Double.parseDouble(request.getParameter("secondNumber"));
		bean.setFirstNumber(a);
		bean.setSecondNumber(b);
		bean.setType("几何平均值");
		double aver=Math.sqrt(a*b);
		bean.setResult(aver);
		RequestDispatcher dispatcher=request.getRequestDispatcher("showResult.jsp");
		dispatcher.forward(request,response);
	}

}
