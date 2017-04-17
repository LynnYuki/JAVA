package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterTest implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("FilterTest init  !!");
	}



	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		System.out.println("FilterTest doFileter");
		PrintWriter  out=arg1.getWriter();
		out.write("Hello  myFilter before ");

		//arg2.doFilter(arg0, arg1);
		
		//out.write("Hello  myFilter after ");

		
	}
	
	@Override
	public void destroy() {
		 System.out.println("FilterTest destroy!!");

	}

	
}
