package Ex.Four;

//�����߳�
public class Odd extends Thread{

	private OddAndEven da;
	Odd(OddAndEven d){
		this.da=d;
	}
	public void run(){
		da.Odd();
}
}