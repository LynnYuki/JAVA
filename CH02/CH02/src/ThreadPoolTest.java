
import java.util.concurrent.*;

//ʵ��Runnable�ӿ�������һ���򵥵�
class TestThread implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 10 ; i++ )
		{
			System.out.println(Thread.currentThread().getName()
				+ "��iֵΪ:" + i);
		}
	}
}

public class ThreadPoolTest
{
	public static void main(String[] args) 
	{
		//����һ�����й̶��߳�����6�����̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//���̳߳����ύ3���߳�
		pool.execute(new TestThread());
		Future f1=pool.submit(new TestThread());
		Future f2=pool.submit(new TestThread());
		
	    Future<Integer> f3=pool.submit(new  RtnThread());
		
		try
		{
			if(f1.get()==null&&f2.get()==null&&f3.get()!=null){
				System.out.println("ִ����ϣ�");
				System.out.println(f3.get());
				
			}
			//��ȡ�̷߳���ֵ
								
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		//�ر��̳߳�
		pool.shutdown();
	}
}
