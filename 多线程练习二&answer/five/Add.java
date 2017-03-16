//求和的线程
package Ex.five;

public class Add extends Thread {
	Datebuf da;
	public Add(Datebuf d){
		da=d;
	}
	public void run(){
		 try{
			  sleep(1000);
		  }catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		for(int i=0;i<5;i++){
			da.addDate();
		}
	System.out.println("Sum is:"+da.getSum());
	}
}
