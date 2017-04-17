package response;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class HttpCharacterResponseWrapper extends HttpServletResponseWrapper {

	private CharArrayWriter charArrayWriter = new CharArrayWriter();

	public HttpCharacterResponseWrapper(HttpServletResponse response) {
		super(response);
	}

	@Override
	//覆盖此方法，当Servlet中使用该response对象调用getWriter()来输出内容时，
	//内容将被输出到CharArrayWriter对象中，达到缓存的效果
	//如果response输出的内容为字符类型内容，则会调用getWriter()方法;如果
	//为二进制内容，比如图像等，则会调用getOutputStream()
	public PrintWriter getWriter() throws IOException {
		//System.out.println(" HttpCharacterResponseWrapper  getWrite");
		return new PrintWriter(charArrayWriter);
	}

	public CharArrayWriter getCharArrayWriter() {
		//System.out.println(" HttpCharacterResponseWrapper  getCharArrayWriter()");
		return charArrayWriter;
	}
}
