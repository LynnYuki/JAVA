package Ex.Two;

public class TestRun {
	 public static void main(String[] args) {
	        Thread t1 = new NumberOutputThread(1, null);
	        Thread t2 = new NumberOutputThread(2, t1);
	        t1.setName("奇数线程");
	        t2.setName("偶数线程");
	        t2.start();  
	        t1.start();

	    }
}
