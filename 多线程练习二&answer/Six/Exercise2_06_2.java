package Ex.Six;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise2_06_2 {

	 private Set hashSet = Collections.synchronizedSet(new HashSet());

	  class Task1 implements Runnable {
	    public void run() {
	      for (int i = 0; i < 10000; i++) {
	        System.out.println("Thread 1");
	        hashSet.add(new Integer(i));
	        try { Thread.sleep(1000); } catch (Exception ex) {
	          ex.printStackTrace();
	        }
	      }
	    }
	  }

	  class Task2 implements Runnable {
	    public void run() {
	      while (true) {
	        System.out.println("Thread 2");
	        try { Thread.sleep(1000); } catch (Exception ex) {
	          ex.printStackTrace();
	        }

	        synchronized (hashSet) { // Must synchronize it
	          Iterator iterator = hashSet.iterator();

	          while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	          }
	        }
	      }
	    }
	  }

	  public static void main(String[] args) {
	    new Exercise2_06_2();
	  }

	  Exercise2_06_2() {
	    Thread thread1 = new Thread(new Task1());
	    Thread thread2 = new Thread(new Task2());
	    thread1.start();
	    thread2.start();
	  }
	}
