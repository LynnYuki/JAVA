package Ex.Four;

public class TestOddEvent {
	public static void main(String[] args) 
	{
		
		OddAndEven da=new OddAndEven(50);
		Thread t1=new Odd(da);
		Thread t2=new Even(da);
		t2.start();
		t1.start();
	}
}
