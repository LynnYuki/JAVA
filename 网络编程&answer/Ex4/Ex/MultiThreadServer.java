package Ex;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import MultiThread.sever.ServerThread;


public class MultiThreadServer {
	public static void main(String[] args) throws IOException{
		//创建一个ServerSocket，用于监听客户端Socket的连接请求
		ServerSocket ss = new ServerSocket(30001);
		System.out.println("我是服务器，正在30001端口监听,等待用户输入圆的半径.....");
		while(true){
			Socket s=ss.accept();
			//每当客户端连接后启动一条ServerThread线程为该客户端服务
			new Thread(new HandleAClient(s)).start();
			
			
		}
	}
}
	class HandleAClient implements Runnable{
		private Socket socket;
		
		public HandleAClient(Socket socket){
			this.socket=socket;
		}
		@Override
		public void run(){
			try{
				DataInputStream inputFormCilent=new DataInputStream(socket.getInputStream());
				DataOutputStream outputToCilent=new DataOutputStream(socket.getOutputStream());
				while(true){
				   double radius=inputFormCilent.readDouble();
				   System.out.println("收到客户端发送的圆的半径"+radius);
				   double area=radius*radius*Math.PI;
				   outputToCilent.writeDouble(area);
			   }
			}catch (IOException e)
				{e.printStackTrace();}
			}
		}


