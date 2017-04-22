package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;


public class AuthorityFilter implements Filter {
	

	public void init(FilterConfig config)throws ServletException{
		 System.out.println("AuthorityFilter init");
	}
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
			throws IOException, ServletException {
		 HttpSession session= ((HttpServletRequest)request).getSession();
		 if(session.getAttribute("user")==null){
			 response.setCharacterEncoding("utf-8");
			 response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			out.print("<script language='javascript'>alert('ÇëÏÈµÇÂ¼!');</script>");
			((HttpServletResponse)response).setHeader("refresh", "2;URL=index.jsp");
			 
			// ((HttpServletResponse)response).sendRedirect("index.jsp");
		 }
		 else{
			 chain.doFilter(request, response);
		 }
	}
	public void destroy(){
		 System.out.println("AuthorityFilter destroy");
	}

}
