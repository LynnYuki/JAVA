package Ex;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server1 {
	public static void main(String[] args) throws IOException{
		//����һ��ServerSocket�����ڼ����ͻ���Socket����������
		ServerSocket ss = new ServerSocket(30001);
		System.out.println("���Ƿ�����������30001�˿ڼ���,�ȴ��û�����Բ�İ뾶.....");
		while(true){
			Socket s=ss.accept();
			DataInputStream inputFormCilent=new DataInputStream(s.getInputStream());
			DataOutputStream outputToCilent=new DataOutputStream(s.getOutputStream());
			
			double radius=inputFormCilent.readDouble();
			System.out.println("�յ��ͻ��˷��͵�Բ�İ뾶"+radius);
			double area=radius*radius*Math.PI;
			outputToCilent.writeDouble(area);
		}
	}

}
