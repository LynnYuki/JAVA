//��˫�����ӣ��������Ϳͻ��˿��Ի�����Ϣ

import java.net.*;
import java.io.*;


public class Server
{
	public static void main(String[] args) 
		throws IOException
	{
		//����һ��ServerSocket�����ڼ����ͻ���Socket����������
		ServerSocket ss = new ServerSocket(30000);
		System.out.println("���Ƿ�����������30000�˿ڼ���.....");
		//����ѭ�����Ͻ������Կͻ��˵�����
		while (true)
		{
			//ÿ�����ܵ��ͻ���Socket�����󣬷�������Ҳ��Ӧ����һ��Socket
			Socket s = ss.accept();
			
			
			//��Socket��Ӧ����������װ��BufferedReader
			BufferedReader br = new BufferedReader(
				new InputStreamReader(s.getInputStream()));
			//������ͨIO����
			String line = br.readLine();
			System.out.println("���Կͻ��˵����ݣ�" + line);
			
			
			//��Socket��Ӧ���������װ��PrintStream
			PrintStream ps = new PrintStream(s.getOutputStream());
			//������ͨIO����
			ps.println("���ã����Ƿ������ˡ����յ��˷�����������ף����");
			
			//�ر�����������������ر�Socket
			br.close();
			ps.close();
			s.close();
		}
	}
}
