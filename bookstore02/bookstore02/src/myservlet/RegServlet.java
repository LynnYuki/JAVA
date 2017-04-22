package myservlet;

import java.io.IOException;
import java.util.Enumeration;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypack.UserInf;
/**
 * 用户注册Servlet

 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置response的编码
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		// 提交的 name 参数
		String username = request.getParameter("name");
		// 提交的 password 参数
		String password = request.getParameter("password");
		
		boolean flag=false;
	  
        //获取提交数据
	    Enumeration params = this.getInitParameterNames();
		while(params.hasMoreElements()){
			String usernameParam = (String)params.nextElement();
			//System.out.println(usernameParam);
			// 取参数值
			String passnameParam = this.getInitParameter(usernameParam);
			//System.out.println( passnameParam);
			// 如果 username 匹配且 password 匹配. username 大小写不敏感，password大小写敏感
			if(usernameParam.equalsIgnoreCase(username)
					&& passnameParam.equals(password)){
				
				UserInf  user=new UserInf();
				user.setName(username);
				user.setPassword(password);
				HttpSession session=request.getSession();
				session.setAttribute("user", user);
				flag=true;
				response.sendRedirect("../bookstore.jsp");
				//return;
				
			}
		}
		if(!flag){  
				 response.sendRedirect("../index.jsp");
				//return;
				
			}
		}

	}

