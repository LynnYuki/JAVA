package Ex.Four;

//ÆæÊıÏß³Ì
public class Odd extends Thread{

	private OddAndEven da;
	Odd(OddAndEven d){
		this.da=d;
	}
	public void run(){
		da.Odd();
}
}