package myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypack.BookDetails;
import mypack.ShoppingCart;

public class CartServelt extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		  String type=request.getParameter("type");
		  HttpSession session=request.getSession();
		  ShoppingCart  cart=(ShoppingCart)session.getAttribute("cart");
		  if(cart==null){
			   cart=new ShoppingCart();
			   session.setAttribute("cart",cart);
		  }
		  if(type.equals("add")){
			  String bookId = request.getParameter("id");
			  String title = request.getParameter("title");
              String price = request.getParameter("price");
			  BookDetails  book= new BookDetails( bookId,title,Double.parseDouble(price));
			  cart.add(bookId, book);
			  System.out.println(bookId +title+price);
			  String retUrl = request.getHeader("Referer");   
	           if(retUrl != null){   
			      response.sendRedirect(retUrl);   
			  } 
          }
		  
		  if(type.equals("clear")){
			  System.out.println("clear");
			  cart.clear();
			  String retUrl = request.getHeader("Referer");   
			  if(retUrl != null){   
			      response.sendRedirect(retUrl);   
			  } 
		  }
		  
		  if(type.equals("remove")){
			  System.out.println("remove");
			  String id=request.getParameter("id");
			  System.out.println(request.getParameter("booktitle"));
			  cart.remove(id);
			  ServletContext context=this.getServletContext();
			  context.getRequestDispatcher("/showcart.jsp").forward(request, response);
		  }
        
		  if(type.equals("update")){
			  System.out.println("update");
			  String id=request.getParameter("id");
			  System.out.println(request.getParameter("booktitle"));
			  cart.update(id);
			  ServletContext context=this.getServletContext();
			  context.getRequestDispatcher("/showcart.jsp").forward(request, response);
		  }
		 
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

		doGet(request,response);
	}

}
