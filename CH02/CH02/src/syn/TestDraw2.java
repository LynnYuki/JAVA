package syn;
//һ�����������������ߵĲ��Գ���  �̷߳�������
public class TestDraw2
{
	public static void main(String[] args) throws InterruptedException
	{
		//����һ���˻�
		Account1 acct = new Account1("1234567" , 0);
		for(int i=0;i<5;i++){
		  new DrawThread1("ȡǮ��"+i , acct , 800).start();
		  
		}
		new DepositThread1("����߼�" , acct , 800).start();
		
	   Thread.sleep(1000);
		Thread[] threadArray = new Thread[Thread.currentThread()
				.getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);

		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName() + " "
					+ threadArray[i].getState());
		}
	}
}
 