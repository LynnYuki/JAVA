package MultiThread.client;
import java.net.*;
import java.io.*;

public class MyClient
{
    public static void main(String[] args)
		throws IOException 
    {
		Socket  s = new Socket("127.0.0.1" , 30001);
		//�ͻ�������ClientThread�̲߳��϶�ȡ���Է�����������
		new Thread(new ClientThread(s)).start();
		//��ȡ��Socket��Ӧ�������
		PrintWriter ps = new PrintWriter(s.getOutputStream(),true);
		//PrintStream ps = new PrintStream(s.getOutputStream());
		String line = null;
		//���϶�ȡ��������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((line = br.readLine()) != null)
		{
			//���û��ļ�����������д��Socket��Ӧ�������
			ps.println(line);
			
		}
    }
}
