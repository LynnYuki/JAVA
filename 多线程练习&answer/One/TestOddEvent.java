package Ex.One;

public class TestOddEvent {
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName()+"�߳�");
		Thread t1=new Odd();
		t1.setName("�����߳�");
		Thread t2=new Even();
		t2.setName("ż���߳�");
		t1.start();
		t2.start();
	}
}
