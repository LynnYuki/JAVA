//yield����
public class TestYield extends Thread
{
	public TestYield()
	{
	}
	public TestYield(String name)
	{
		super(name);
	}
	//����run������Ϊ�߳�ִ����
	public void run()
	{
		for (int i = 0; i < 50 ; i++ )
		{
			System.out.println(getName() + "  " + i);
			//��i����20ʱ��ʹ��yield�����õ�ǰ�߳��ò�
			if (i == 20)
			{
				Thread.yield();
			}
		}
	}
    public static void main(String[] args) throws Exception
    {
		//�������������߳�
    
		TestYield ty1 = new TestYield("�߼�1");
		//��ty1�߳����ó�������ȼ�
		ty1.setPriority(Thread.MAX_PRIORITY);
		ty1.start();
		
		TestYield ty2 = new TestYield("�ͼ�1");
		//��ty1�߳����ó�������ȼ�
		ty2.setPriority(Thread.MIN_PRIORITY);
		ty2.start();
		
		
    }
}