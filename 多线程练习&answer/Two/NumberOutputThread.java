package Ex.Two;

public class NumberOutputThread extends Thread {

	private int begin;

	private Thread prereq;

	public NumberOutputThread(int begin, Thread prereq) {
          this.begin = begin;
          this.prereq = prereq;
    }

	 @Override
      public void run() {
      try {
          if(prereq != null) {prereq.join(); }
       
          for (int i = begin; i <= 50; i += 2) {

	                System.out.println("当前线程 : "+Thread.currentThread().getName()+": "+i);

	                Thread.sleep(100);

	         }

	        } catch(InterruptedException e) {

	            

	        }

	    }

	}

