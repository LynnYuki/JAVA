package servlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class AcceptForm extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		//���÷�������Ӧ�����ݸ�ʽΪHTML�ĵ���ʽ
		response.setContentType("text/html");
		
		//���÷�������Ӧ���ݵ��ַ�����GB2312
		response.setCharacterEncoding("gb2312");
		
		//ȡ���������������ҳ�������Ҫ��ʾ������
		PrintWriter out = response.getWriter();
		
		//�������������ַ�����GB2312
		request.setCharacterEncoding("gb2312");
		
		//ȡ�����е��������
		String name = request.getParameter("name");
		String province = request.getParameter("province");

		out.println("<font size='2'>");
		out.print("�ύ�ı�����Ϊ:<br>");
		out.print("����:" + name + "<br>");
		out.print("ʡ��:" + province + "<br>");
		out.print("</font>");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		doGet(request, response);
	}
}

