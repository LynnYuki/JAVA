package MultiThread.client;
import java.net.*;
import java.io.*;

public class MyClient
{
    public static void main(String[] args)
		throws IOException 
    {
		Socket  s = new Socket("127.0.0.1" , 30001);
		//客户端启动ClientThread线程不断读取来自服务器的数据
		new Thread(new ClientThread(s)).start();
		//获取该Socket对应的输出流
		PrintWriter ps = new PrintWriter(s.getOutputStream(),true);
		//PrintStream ps = new PrintStream(s.getOutputStream());
		String line = null;
		//不断读取键盘输入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((line = br.readLine()) != null)
		{
			//将用户的键盘输入内容写入Socket对应的输出流
			ps.println(line);
			
		}
    }
}
