//ʵ��Runnalbe�ӿڵ��߳�
//��дһ�����򣬸ó���ÿ��һ���ڿ���̨�����Hello  World!��.������ʮ�κ��Զ��˳���

public class Deom_2 implements Runnable{
	private int time;
	public void run(){
		while(true){
			try{
			  Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("Hello World��");
			time++;
			if(time==10) break;
		}
	}
	
	public static void main(String[] args){
		Deom_2  demo_2=new Deom_2();
		Thread t1=new  Thread(demo_2);
		t1.start();
	}

}
