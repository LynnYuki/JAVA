
public class InterruptTest {
	
	public static void main(String[] args){
		try{
			InThread thread= new InThread();
			thread.start();
			Thread.sleep(100);
			//Thread.currentThread().interrupt();
			thread.interrupt();
		    //System.out.println("�Ƿ�ֹͣ1��="+Thread.interrupted());
		   //System.out.println("�Ƿ�ֹͣ2��="+Thread.interrupted());
		  // System.out.println("end!");
		    
		}catch(InterruptedException e){
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}

class InThread extends Thread{
	public void run(){
		super.run();
		for(int i=0;i<5000;i++){
			
			if(this.interrupted()){
				//Thread.currentThread().interrupt();
			    //System.out.println("�Ƿ�ֹͣ1��="+Thread.interrupted());
			    //System.out.println("�Ƿ�ֹͣ2��="+Thread.interrupted());
				System.out.println("�Ѿ���ֹͣ״̬�ˣ���Ҫ�˳��ˣ�");
				break;
			}
			System.out.println("i="+(i+1));
		}
		
	}
}
