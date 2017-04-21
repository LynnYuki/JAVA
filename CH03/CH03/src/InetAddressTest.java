//IP��ַ
import java.net.*;

public class InetAddressTest
{
	public static void main(String[] args)
		throws Exception
	{
		//��������������ȡ��Ӧ��InetAddressʵ��
		InetAddress ip = InetAddress.getByName("www.sina.com.cn");
		//�ж��Ƿ�ɴ�
		System.out.println("sina�Ƿ�ɴ" + ip.isReachable(2000)); 
		//��ȡ��InetAddressʵ����IP�ַ���
		System.out.println(ip.getHostAddress());
		//����ԭʼIP��ַ����ȡ��Ӧ��InetAddressʵ��
		InetAddress local = InetAddress.getByAddress(new byte[]
		{127,0,0,1});
		System.out.println("�����Ƿ�ɴ" + local.isReachable(5000)); 
		//��ȡ��InetAddressʵ����Ӧ��ȫ�޶�����
		System.out.println(local.getCanonicalHostName());		
	}
}
