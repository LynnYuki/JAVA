package Ex.five;

public class Datebuf {
	private int value, sum;
	//产生数组标志符为真，否则为假
	private boolean flag=false;
	
	//随机生成一个数字的同步方法
	synchronized void sendDate(){
	 try{
	//如果flag为z，表明正在求和，随机生成的数字方法阻塞
	   while(flag){
		 wait(); 
	   }	 
		 //随机生成数字  
		 value=(int)(Math.random()*100);
		//可以进行求和运行，不能产生一个数
		flag=true;
		//唤醒其他线程
		notifyAll(); 	
	  }catch (InterruptedException ex)
		{ex.printStackTrace();}
	}
	synchronized int addDate(){
		
	 while(!flag)
		try{
			wait();
		 }catch (InterruptedException ex)
		  {
			  System.out.println(ex);
		  }
	
	      sum=sum+value;
	      //可以进行求和运行，不能产生一个数
	      flag=false;
	      notifyAll();
	      return sum;
	}
	
	
	public int getValue(){
		return this.value;
	}
    
	public int getSum(){
		return this.sum;
	}
}
