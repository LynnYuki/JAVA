package Ex.Four;

public class OddAndEven {
	
	private int n;
	//标识奇数程序是否运行
	private boolean flag=false;
	
	public OddAndEven(int i){
		this.n=i;
	}
	public  synchronized void Odd()
	{
		//System.out.println("进入Odd方法");
		try
		{
			
			while (flag)
			{
				wait();
			}
				for(int i=1;i<=n;i++){
					if((i%2)!=0)
					 System.out.println("奇数: "+i);
			  } 
				
				flag = true;
				//唤醒其他线程
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
						System.out.println("偶数: "+i);
				}
			 } 
				flag = false;
				//唤醒其他线程
				notifyAll();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
   }
}
