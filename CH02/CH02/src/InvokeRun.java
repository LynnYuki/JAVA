public class InvokeRun extends Thread
{
	private int i ;
	
	public InvokeRun(){
		System.out.println("���췽���Ĵ�ӡ: "+Thread.currentThread().getName());
	}
	//��дrun������run�����ķ���������߳�ִ����
	public void run()
	{
		for ( ; i < 10 ; i++ )
		{
			//ֱ�ӵ���run����ʱ��Thread��this.getName���ص��Ǹö������֣�
			//�����ǵ�ǰ�̵߳����֡�
			//ʹ��Thread.currentThread().getName()���ǻ�ȡ��ǰ�߳�����
			System.out.println(Thread.currentThread().getName() +  " " + i);
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
				//ֱ�ӵ����̶߳����run������
				//ϵͳ����̶߳��󵱳���ͨ����run����������ͨ������
				//�����������д��벢��������2���̣߳���������ִ��2��run����
				InvokeRun run=new InvokeRun();
				run.start();
				//run.run();
				//run.start();
				
			}
        }
    }
}