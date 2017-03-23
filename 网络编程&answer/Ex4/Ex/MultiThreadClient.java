package Ex;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;



public class MultiThreadClient {

	public static void main(String[] args) throws IOException{
       Socket socket = new Socket("127.0.0.1" , 30001);
		
     //客户端启动ClientThread线程不断读取来自服务器的数据
     new Thread(new ClientThread(socket)).start();
     //获取该socket对应的输出流  
     DataOutputStream  toServer= new DataOutputStream(socket.getOutputStream());
     
   //创建字符串接受用户在客户端的输入
	    String line = null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    while((line = br.readLine()) != null)
		{ //将用户的键盘输入内容写入Socket对应的输出流
	    	System.out.println(Double.parseDouble(line));
			toServer.writeDouble(Double.parseDouble(line));
	    }
    }	
}
	class ClientThread implements Runnable{
		private Socket s;
		private DataInputStream fromServer;
		public ClientThread(Socket s){
			this.s=s;
			
		}
		public void run(){
		  try{	
			//创建字符串接受用户在客户端的输入
		   fromServer= new DataInputStream(s.getInputStream());
		   System.out.println("fromServer");
		    while(true)
			{
				//将用户的键盘输入内容写入Socket对应的输出流
		    	//fromServer= new DataInputStream(s.getInputStream());
				double area=fromServer.readDouble();
			    System.out.println(area);
			    System.out.println("我是客户端，收到圆的面积"+area);
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	}
