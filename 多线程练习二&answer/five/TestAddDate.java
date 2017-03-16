package Ex.five;


public class TestAddDate {
	public static void main(String[] args) 
	{
	
		Datebuf da = new Datebuf();
		Send s1=new Send(da);
		Add  a1=new Add(da);
	
		a1.start();	s1.start();
	}
}
