package myservlet;

import java.io.IOException;
import java.util.Enumeration;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户注册Servlet

 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置response的编码
		response.setCharacterEncoding("GB18030");
		// 提交的 name 参数
		String username = request.getParameter("name");
		// 提交的 password 参数
		String password = request.getParameter("password");
	    request.setCharacterEncoding("GB18030");
        //获取提交数据
	     String  passnameParam = this.getInitParameter("admin");
			// 如果 username 匹配且 password 匹配. username 大小写不敏感，password大小写敏感
			if(username.equalsIgnoreCase("admin")&& passnameParam.equals(password)){
				
				request.getRequestDispatcher("/loginsucess").forward(request, response);
				return;
				
			}else{  
				request.getRequestDispatcher("/loginfail").forward(request, response); 
				return;
				
			}
		}
}
