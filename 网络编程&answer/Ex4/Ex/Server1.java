package Ex;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server1 {
	public static void main(String[] args) throws IOException{
		//创建一个ServerSocket，用于监听客户端Socket的连接请求
		ServerSocket ss = new ServerSocket(30001);
		System.out.println("我是服务器，正在30001端口监听,等待用户输入圆的半径.....");
		while(true){
			Socket s=ss.accept();
			DataInputStream inputFormCilent=new DataInputStream(s.getInputStream());
			DataOutputStream outputToCilent=new DataOutputStream(s.getOutputStream());
			
			double radius=inputFormCilent.readDouble();
			System.out.println("收到客户端发送的圆的半径"+radius);
			double area=radius*radius*Math.PI;
			outputToCilent.writeDouble(area);
		}
	}

}
