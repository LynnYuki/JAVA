package Ex.One;

public class TestOddEvent {
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName()+"线程");
		Thread t1=new Odd();
		t1.setName("奇数线程");
		Thread t2=new Even();
		t2.setName("偶数线程");
		t1.start();
		t2.start();
	}
}
