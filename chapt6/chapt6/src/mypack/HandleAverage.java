package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandleAverage extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SaveNumber bean=new SaveNumber();
		request.setAttribute("aver",bean);
		try{
		   double a=Double.parseDouble(request.getParameter("firstNumber"));
		   double b=Double.parseDouble(request.getParameter("secondNumber"));	
		   bean.setFirstNumber(a);
		   bean.setSecondNumber(b);
		   //计算代数平均值
		   bean.getResultA();
		  //计算几何平均值
		  bean.getResultB();
		  RequestDispatcher dipatcher=request.getRequestDispatcher("showResult.jsp");
		   dipatcher.forward(request,response);
		}catch(Exception e){
			response.sendRedirect("inputDate.jsp");
		}
		
	}

}
