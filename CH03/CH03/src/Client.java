//半双工例子：服务器和客户端可以互发信息
import java.net.*;
import java.io.*;

public class Client
{
	public static void main(String[] args) 
		throws IOException
	{
		Socket socket = new Socket("127.0.0.1" , 30000);
		

		//将Socket对应的输出流包装成PrintStream
		PrintStream ps = new PrintStream(socket.getOutputStream());
		//进行普通IO操作
		ps.println("您好，我是客户端。祝服务器的新年祝福！");
		
		//将Socket对应的输入流包装成BufferedReader
		BufferedReader br = new BufferedReader(
			new InputStreamReader(socket.getInputStream()));
		//进行普通IO操作
		String line = br.readLine();
		System.out.println("客户端收到来自服务器的数据：" + line);
		//关闭输入流、输出流、socket
		ps.close();
		br.close();
		socket.close();
	}
}
