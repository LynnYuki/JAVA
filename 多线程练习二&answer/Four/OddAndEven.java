package Ex.Four;

public class OddAndEven {
	
	private int n;
	//��ʶ���������Ƿ�����
	private boolean flag=false;
	
	public OddAndEven(int i){
		this.n=i;
	}
	public  synchronized void Odd()
	{
		//System.out.println("����Odd����");
		try
		{
			
			while (flag)
			{
				wait();
			}
				for(int i=1;i<=n;i++){
					if((i%2)!=0)
					 System.out.println("����: "+i);
			  } 
				
				flag = true;
				//���������߳�
				notifyAll();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	public synchronized void Even()
	{
		try
		{
			
			while (!flag)
			{
				wait();
			}
            for(int i=1;i<=n;i++){
				if((i%2)==0){
						System.out.println("ż��: "+i);
				}
			 } 
				flag = false;
				//���������߳�
				notifyAll();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
   }
}
