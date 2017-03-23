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
		
     //�ͻ�������ClientThread�̲߳��϶�ȡ���Է�����������
     new Thread(new ClientThread(socket)).start();
     //��ȡ��socket��Ӧ�������  
     DataOutputStream  toServer= new DataOutputStream(socket.getOutputStream());
     
   //�����ַ��������û��ڿͻ��˵�����
	    String line = null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    while((line = br.readLine()) != null)
		{ //���û��ļ�����������д��Socket��Ӧ�������
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
			//�����ַ��������û��ڿͻ��˵�����
		   fromServer= new DataInputStream(s.getInputStream());
		   System.out.println("fromServer");
		    while(true)
			{
				//���û��ļ�����������д��Socket��Ӧ�������
		    	//fromServer= new DataInputStream(s.getInputStream());
				double area=fromServer.readDouble();
			    System.out.println(area);
			    System.out.println("���ǿͻ��ˣ��յ�Բ�����"+area);
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	}
