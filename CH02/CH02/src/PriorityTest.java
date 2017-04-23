//�ı��̵߳����ȼ�
public class PriorityTest extends Thread
{
	public PriorityTest(){}
	//����һ���в����Ĺ����������ڴ����߳�ʱָ��name
	public PriorityTest(String name)
	{
		super(name);
	}
	public void run()
	{
		for (int i = 0 ; i < 10 ; i++ )
		{
			System.out.println(getName() +  ",�����ȼ��ǣ�"
				+ getPriority() + ",ѭ��������ֵΪ:" + i);
		}
	}
	public static void main(String[] args) 
	{
		//�ı����̵߳����ȼ�
		Thread.currentThread().setPriority(6);
		for (int i = 0 ; i < 20 ; i++ )
		{
			if (i == 5)
			{
				PriorityTest low  = new PriorityTest("�ͼ�");
				low.start();
				System.out.println("����֮�������ȼ�:" + low.getPriority());
				//���ø��߳�Ϊ������ȼ�
				low.setPriority(Thread.MIN_PRIORITY);
			}
			if (i == 10)
			{
				PriorityTest high = new PriorityTest("�߼�");
				high.start();
				System.out.println("����֮�������ȼ�:" + high.getPriority());
				//���ø��߳�Ϊ������ȼ�
				high.setPriority(Thread.MAX_PRIORITY);
			}
		}
	}
}