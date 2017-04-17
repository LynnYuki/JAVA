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
			// 拦截所有的请求 解决全站中文乱码
			// 指定 request 和 response 的编码
			// 设置request的编码格式
			request.setCharacterEncoding(encoding);
			// 设置response字符编码
     		response.setContentType("text/html; charset="+encoding);
			
     	// 在放行时 应该给目标资源一个request对象 让目标资源调用getParameter时调到我们写的getParameter
   		// 对request进行包装
   		//   CharacterRequest characterRequest = new CharacterRequest(request);
		// 传递给下一过滤器
		   chain.doFilter(request, response);
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
		// 子类继承父类一定会覆写一些方法，此处用于重写getParamter()方法
		public String getParameter(String name) {
			
			// 调用 被包装对象的getParameter()方法 获得请求参数
			String value = super.getParameter(name);
			if (value == null)
				return null;
			// 判断请求方式
			String method = super.getMethod();
			if ("get".equalsIgnoreCase(method)) {
				try {
				     value = new String(value.getBytes("iso-8859-1"), "utf-8");
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			}
			// 解决乱码后返回结果
			return value;
		}
	}

