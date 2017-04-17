package response;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import util.ImageUtil;

public class WaterMarkResponseWrapper extends HttpServletResponseWrapper {

	// 水印图片位置
	private String waterMarkFile;

	// 原response
	private HttpServletResponse response;

	// 自定义servletOutputStream，用于缓冲图像数据
	private WaterMarkOutputStream waterMarkOutputStream;

	public WaterMarkResponseWrapper(HttpServletResponse response,
			String waterMarkFile) throws IOException {
		super(response);
		this.response = response;
		this.waterMarkFile = waterMarkFile;
		this.waterMarkOutputStream = new WaterMarkOutputStream();
	}

	
	public ServletOutputStream getOutputStream() throws IOException {
		return waterMarkOutputStream;
	}

	public void flushBuffer() throws IOException {
		waterMarkOutputStream.flush();
	}

	// 覆盖getOutputStream()，返回自定义的waterMarkOutputStream
	public void finishResponse() throws IOException {

		// 将图像数据打水印，并输出到客户端浏览器
		byte[] imageData = waterMarkOutputStream.getByteArrayOutputStream()
				.toByteArray();

		// 打水印后的图片数据
		byte[] image = ImageUtil.waterMark(imageData, waterMarkFile);

		// 将图像输出到浏览器
		response.setContentLength(image.length);
		response.getOutputStream().write(image);

		waterMarkOutputStream.close();
	}
}
