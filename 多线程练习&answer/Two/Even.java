package Ex.Two;

public class Even extends Thread{
  public void run(){
		System.out.println(this.getName());
		//try{
			//sleep(1000);
		//}catch(InterruptedException ex){
			//ex.printStackTrace();
		//}
		for(int i=1;i<=50;i++){
			if((i%2)==0){
			  System.out.println("ż����"+i);
				
			}
		}
	}
}
