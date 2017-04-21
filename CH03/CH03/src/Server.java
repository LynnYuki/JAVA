//半双工例子：服务器和客户端可以互发信息

import java.net.*;
import java.io.*;


public class Server
{
	public static void main(String[] args) 
		throws IOException
	{
		//创建一个ServerSocket，用于监听客户端Socket的连接请求
		ServerSocket ss = new ServerSocket(30000);
		System.out.println("我是服务器，正在30000端口监听.....");
		//采用循环不断接受来自客户端的请求
		while (true)
		{
			//每当接受到客户端Socket的请求，服务器端也对应产生一个Socket
			Socket s = ss.accept();
			
			
			//将Socket对应的输入流包装成BufferedReader
			BufferedReader br = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
			//进行普通IO操作
			String line = br.readLine();
			System.out.println("来自客户端的数据：" + line);
			
			
			//将Socket对应的输出流包装成PrintStream
			PrintStream ps = new PrintStream(s.getOutputStream());
			//进行普通IO操作
			ps.println("您好，我是服务器端。您收到了服务器的新年祝福！");
			
			//关闭输入流、输出流，关闭Socket
			br.close();
			ps.close();
			s.close();
		}
	}
}
