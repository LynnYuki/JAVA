package Ex.Two;

public class TestRun {
	 public static void main(String[] args) {
	        Thread t1 = new NumberOutputThread(1, null);
	        Thread t2 = new NumberOutputThread(2, t1);
	        t1.setName("�����߳�");
	        t2.setName("ż���߳�");
	        t2.start();  
	        t1.start();

	    }
}
