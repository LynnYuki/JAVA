package filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
//字符编码过滤器
public class CharactorFilter implements Filter {
	// 字符编码
	String encoding = null;

	public void init(FilterConfig filterConfig) throws ServletException {
		// 获取初始化参数
		System.out.println("CharactorFilter: init()");
		encoding = filterConfig.getInitParameter("encoding");
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("CharactorFilter: doFilter()"); 
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		// 判断字符编码是否为空
		if(encoding == null)  encoding="utf-8";
			
			request.setCharacterEncoding(encoding);
		
     		response.setContentType("text/html; charset="+encoding);
     	   CharacterRequest characterRequest = new CharacterRequest(request);
     	   chain.doFilter(characterRequest, response);
	}
  
	 public void destroy() {
	    encoding = null;
	  }
}
// 针对 request 对象进行包装
// 继承 默认包装类HttpServletRequestWrapper
	class CharacterRequest extends HttpServletRequestWrapper {
		public CharacterRequest(HttpServletRequest request) {
			super(request);
		}
		
		public String getParameter(String name) {
			
			// 子类继承父类一定会覆写一些方法，此处用于重写getParamter()方法
			String value = super.getParameter(name);
			if (value == null)
				return null;
			// 调用 被包装对象的getParameter()方法 获得请求参数
			String method = super.getMethod();
			if ("get".equalsIgnoreCase(method)) {
				try {
				     value = new String(value.getBytes("iso-8859-1"), "utf-8");
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			}
			return value;
		}
	}

