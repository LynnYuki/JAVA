
//ͨ���̳�Thread���������߳���
public class FirstThread extends Thread
{
	private int i =10 ;
	//��дrun������run�����ķ���������߳�ִ����
	public void run()
	{
		while(i>0)
		{
			super.run(); 
			i--;
			//���߳���̳�Thread��ʱ������ֱ�ӵ���getName()���������ص�ǰ�̵߳�����
			//������ȡ��ǰ�̣߳�ֱ��ʹ��this����
			//Thread�����getName���ص�ǰ���̵߳�����
			System.out.println(getName() +  " " + i);
		}
	}
	
    public static void main(String[] args) 
    {
        for (int i = 0; i < 50;  i++)
        {
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() +  " " + i);
			if (i == 20)
			{ 
			   
				//��������������һ���߳�
				new FirstThread().start();
				//new FirstThread().run();
				//�������������ڶ����߳�
				new FirstThread().start();
			   
			}
        }
    }
}