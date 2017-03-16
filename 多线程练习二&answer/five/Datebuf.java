package Ex.five;

public class Datebuf {
	private int value, sum;
	//���������־��Ϊ�棬����Ϊ��
	private boolean flag=false;
	
	//�������һ�����ֵ�ͬ������
	synchronized void sendDate(){
	 try{
	//���flagΪz������������ͣ�������ɵ����ַ�������
	   while(flag){
		 wait(); 
	   }	 
		 //�����������  
		 value=(int)(Math.random()*100);
		//���Խ���������У����ܲ���һ����
		flag=true;
		//���������߳�
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
	      //���Խ���������У����ܲ���һ����
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
