package Ex.Four;


//ż���߳�
public class Even extends Thread{
	private OddAndEven da;
	Even(OddAndEven d){
			this.da=d;
	}
	public void run(){
		da.Even();
	}
}
