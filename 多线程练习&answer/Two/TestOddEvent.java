package Ex.Two;

public class TestOddEvent {
	public static void main(String[] args) throws Exception
	{
		System.out.println(Thread.currentThread().getName()+"线程");
		Thread t1=new Odd();
		t1.setName("奇数线程");
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2=new Even();
		t2.setName("偶数线程");
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}
