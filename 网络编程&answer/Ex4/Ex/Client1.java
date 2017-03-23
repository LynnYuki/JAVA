package Ex;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class Client1 {

	public static void main(String[] args) throws IOException{
       Socket socket = new Socket("127.0.0.1" , 30001);
		
		//创建输入流接受来自服务器端的数据
       DataInputStream  fromServer= new DataInputStream(socket.getInputStream());
       DataOutputStream  toServer= new DataOutputStream(socket.getOutputStream());
       //创建字符串接受用户在客户端的输入
       String line = null;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   if((line = br.readLine()) != null)
		{
			//将用户的键盘输入内容写入Socket对应的输出流
			toServer.writeDouble(Double.parseDouble(line));
			
		}
      // toServer.writeDouble(5.0);
       //toServer.flush();
       double area=fromServer.readDouble();
       System.out.println(area);
        System.out.println("我是客户端，收到圆的面积"+area);
       
	}

}
