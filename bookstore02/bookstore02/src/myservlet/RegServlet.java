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
 * �û�ע��Servlet

 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ����response�ı���
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		// �ύ�� name ����
		String username = request.getParameter("name");
		// �ύ�� password ����
		String password = request.getParameter("password");
		
		boolean flag=false;
	  
        //��ȡ�ύ����
	    Enumeration params = this.getInitParameterNames();
		while(params.hasMoreElements()){
			String usernameParam = (String)params.nextElement();
			//System.out.println(usernameParam);
			// ȡ����ֵ
			String passnameParam = this.getInitParameter(usernameParam);
			//System.out.println( passnameParam);
			// ��� username ƥ���� password ƥ��. username ��Сд�����У�password��Сд����
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

