//��Ʊϵͳ

public class Demo_4 {

	public static void main(String[] args) {
/*
		TicketWindow2 t1=new TicketWindow2();
		TicketWindow2 t2=new TicketWindow2();
		TicketWindow2 t3=new TicketWindow2();
		t1.start();
		t2.start();
		t3.start();*/
	
	/*
	    TicketWindow t1=new TicketWindow();
	  
	    TicketWindow t2=new TicketWindow();

	    TicketWindow t3=new TicketWindow();
	    
	    new Thread(t1).start();
	    new Thread(t2).start();
	    new Thread(t3).start();
      */
	 
	 	TicketWindow t1=new TicketWindow();
		  
	 
	    
	    new Thread(t1).start();
	    new Thread(t1).start();
	    new Thread(t1).start();
		
	}

}

class TicketWindow implements  Runnable{
	
	private int num=50;
	public void run(){
		
		while(true){
	    //��Ʊ���ٶ���һ���һ��
		 try{
			 Thread.sleep(1000);
		 }catch(Exception e){
			e.printStackTrace(); 
		 }
		//���ж��Ƿ���Ʊ
	synchronized(this){
		if(num>0){
			System.out.println(Thread.currentThread().getName()
					+"���ڳ��۵�"+num+"��Ʊ��");
			num--;
		}else{
			System.out.println("Ʊ�Ѿ�������");
			break;
		}
	}	
	}
   }
}
/*
class TicketWindow2 extends  Thread{
	
	private int num=50;
	public void run(){
		
		while(true){
	    //��Ʊ���ٶ���һ���һ��
		 try{
			 Thread.sleep(1000);
		 }catch(Exception e){
			e.printStackTrace(); 
		 }
		//���ж��Ƿ���Ʊ
		
		if(num>0){
			System.out.println(Thread.currentThread().getName()
					+"���ڳ��۵�"+num+"��Ʊ��");
			num--;
		}else{
			System.out.println("Ʊ�Ѿ�������");
			break;
		}
		
	}
   }
}*/