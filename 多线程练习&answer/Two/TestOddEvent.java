package Ex.Two;

public class TestOddEvent {
	public static void main(String[] args) throws Exception
	{
		System.out.println(Thread.currentThread().getName()+"�߳�");
		Thread t1=new Odd();
		t1.setName("�����߳�");
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2=new Even();
		t2.setName("ż���߳�");
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}
