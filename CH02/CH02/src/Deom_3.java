//���дһ�����򣬸ó�����Խ���һ������n��
///�������̣߳�һ���̼߳����1+........+n��������
//��һ���߳�ÿ��һ���ٿ���̨���������һ���̣߳����������**��hello,world��������������Ҫͬʱ���С�


public class Deom_3 {
	public static void main(String[] args){
		FThread t1=new FThread(10);
		SThread t2=new SThread(10);
		new Thread(t1).start();
		new Thread(t2).start();
	}

}

class FThread implements Runnable{
	private int n=0;
	private int result=0;
	private int times=0;
	public FThread(int n){
		this.n=n;
	}
	public void run(){
	   while(true){
		 try{
			Thread.sleep(1000);
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	   result+=(++times);
	   System.out.println("��ǰ�����: "+result);
	   if(times==n){
		 System.out.println("�������: "+result);   
		 break;
	   }
	}
   }	
}
class SThread implements Runnable{
	private int n=0;
	private int times=0;
	public SThread(int n){
		this.n=n;
	}
	public void run(){
	   while(true){
		 try{
			Thread.sleep(1000);
		 }catch(Exception e){
			 e.printStackTrace();
		 }	
		 times++;
		 System.out.println("����һ���̣߳��������"+times+"�� Hello World��");
		 if(times==n) break;
   }	
  }
}