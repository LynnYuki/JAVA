//��˫�����ӣ��������Ϳͻ��˿��Ի�����Ϣ
import java.net.*;
import java.io.*;

public class Client
{
	public static void main(String[] args) 
		throws IOException
	{
		Socket socket = new Socket("127.0.0.1" , 30000);
		

		//��Socket��Ӧ���������װ��PrintStream
		PrintStream ps = new PrintStream(socket.getOutputStream());
		//������ͨIO����
		ps.println("���ã����ǿͻ��ˡ�ף������������ף����");
		
		//��Socket��Ӧ����������װ��BufferedReader
		BufferedReader br = new BufferedReader(
			new InputStreamReader(socket.getInputStream()));
		//������ͨIO����
		String line = br.readLine();
		System.out.println("�ͻ����յ����Է����������ݣ�" + line);
		//�ر����������������socket
		ps.close();
		br.close();
		socket.close();
	}
}
