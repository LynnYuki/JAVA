package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 4400760543502956525L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>��ʾ��¼��Ϣ</title></head>");
		out.println("<body>");
		out.println("<h2>��Cookie�л���ϴε�¼ʱ����û���</h2>");

		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		for (int i = 0; i < cookies.length; i++) {
			cookie = cookies[i];
			if (cookie.getName().equals("username")) {
				out.println("�û�����" + cookie.getValue());
				out.println("<br>");
			}
			if (cookie.getName().equals("lastTime")) {
				out.println("�ϴε�¼ʱ�䣺" + cookie.getValue());
				out.println("<br>");
			}
		}
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}
}
