package MultiThread.client;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientThread implements Runnable
{
	//���̸߳������Socket
	private Socket s;
	//���ֳ��������Socket����Ӧ��������
	BufferedReader br = null;
	public ClientThread(Socket s)
		throws IOException
	{
		this.s = s;
		br = new BufferedReader(
			new InputStreamReader(s.getInputStream()));
	}
	public void run()
	{
		try
		{
			String content = null;
			//���϶�ȡSocket�������е����ݣ�������Щ���ݴ�ӡ���
			while ((content = br.readLine()) != null)
			{
				System.out.println(content);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}