package Ex;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import MultiThread.sever.ServerThread;


public class MultiThreadServer {
	public static void main(String[] args) throws IOException{
		//����һ��ServerSocket�����ڼ����ͻ���Socket����������
		ServerSocket ss = new ServerSocket(30001);
		System.out.println("���Ƿ�����������30001�˿ڼ���,�ȴ��û�����Բ�İ뾶.....");
		while(true){
			Socket s=ss.accept();
			//ÿ���ͻ������Ӻ�����һ��ServerThread�߳�Ϊ�ÿͻ��˷���
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
				   System.out.println("�յ��ͻ��˷��͵�Բ�İ뾶"+radius);
				   double area=radius*radius*Math.PI;
				   outputToCilent.writeDouble(area);
			   }
			}catch (IOException e)
				{e.printStackTrace();}
			}
		}


