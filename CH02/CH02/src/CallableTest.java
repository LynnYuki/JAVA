
import java.util.concurrent.*;

class RtnThread implements Callable<Integer>
{
	//ʵ��call��������Ϊ�߳�ִ����
	public Integer call()
	{
		int sum = 0;
		int i=0;
		for ( ; i < 10 ; i++ )
		{
			System.out.println(Thread.currentThread().getName()
				+ " ��ѭ������i��ֵ��" + i);	
			sum+=i;
		}
		//call()���������з���ֵ
	
		return sum;
	}
} 

public class CallableTest
{
	public static void main(String[] args) 
	{
		//����Callable����
		RtnThread rt = new RtnThread();
		//ʹ��FutureTask����װCallable����
		FutureTask<Integer> task = new FutureTask<Integer>(rt);
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println(Thread.currentThread().getName()
				+ " ��ѭ������i��ֵ��" + i);
			if (i == 5)
			{
				//ʵ�ʻ�����Callable�������������������߳�
				new Thread(task , "�з���ֵ���߳�").start();
			}
		}
		try
		{
			//��ȡ�̷߳���ֵ
			System.out.println("���̵߳ķ���ֵ��" + task.get());					
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
