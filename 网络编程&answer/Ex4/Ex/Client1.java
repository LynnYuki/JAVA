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
		
		//�����������������Է������˵�����
       DataInputStream  fromServer= new DataInputStream(socket.getInputStream());
       DataOutputStream  toServer= new DataOutputStream(socket.getOutputStream());
       //�����ַ��������û��ڿͻ��˵�����
       String line = null;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   if((line = br.readLine()) != null)
		{
			//���û��ļ�����������д��Socket��Ӧ�������
			toServer.writeDouble(Double.parseDouble(line));
			
		}
      // toServer.writeDouble(5.0);
       //toServer.flush();
       double area=fromServer.readDouble();
       System.out.println(area);
        System.out.println("���ǿͻ��ˣ��յ�Բ�����"+area);
       
	}

}
