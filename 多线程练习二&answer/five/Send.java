package Ex.five;

public class Send extends Thread {
	Datebuf da;
	public Send(Datebuf d){
		da=d;
	}
	public void run(){
		for(int i=0;i<5;i++){
		  try{
			  sleep(1000);
		  }catch(InterruptedException ex)
			{ex.printStackTrace();}
		da.sendDate();
		System.out.println("date is:"+da.getValue());	
		}
	}
}
