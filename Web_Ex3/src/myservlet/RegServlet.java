package myservlet;

import java.io.IOException;
import java.util.Enumeration;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �û�ע��Servlet

 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����response�ı���
		response.setCharacterEncoding("GB18030");
		// �ύ�� name ����
		String username = request.getParameter("name");
		// �ύ�� password ����
		String password = request.getParameter("password");
	    request.setCharacterEncoding("GB18030");
        //��ȡ�ύ����
	     String  passnameParam = this.getInitParameter("admin");
			// ��� username ƥ���� password ƥ��. username ��Сд�����У�password��Сд����
			if(username.equalsIgnoreCase("admin")&& passnameParam.equals(password)){
				
				request.getRequestDispatcher("/loginsucess").forward(request, response);
				return;
				
			}else{  
				request.getRequestDispatcher("/loginfail").forward(request, response); 
				return;
				
			}
		}
}
