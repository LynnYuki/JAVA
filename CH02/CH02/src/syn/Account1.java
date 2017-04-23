package syn;
//�߳�֮���Э������ ��������߶Զ��������
public class Account1
{
	private String accountNo;
	private double balance;
	//��ʶ�˻����Ƿ����д������
	private boolean flag = false;


	public Account1(){}

	public Account1(String accountNo , double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public void setAccountNo(String accountNo)
	{
		this.accountNo = accountNo;
	}
	public String getAccountNo()
	{
		 return this.accountNo;
	}

	public double getBalance()
	{
		 return this.balance;
	}
	
	//ȡǮ�ķ���
	public synchronized void draw(double drawAmount)
	{
		
		try
		{
			//���flagΪ�٣������˻��л�û���˴�Ǯ��ȥ����ȡǮ��������
			while ((!flag)&&(balance<drawAmount))
			{
				System.out.println("draw wait begin");
				wait();
				System.out.println("draw wait end");
			}
				//ִ��ȡǮ
				
				System.out.println(Thread.currentThread().getName() + 
					" ȡǮ:" +  drawAmount);
				balance -= drawAmount;
				System.out.println("�˻����Ϊ��" + balance);
				
				//����ʶ�˻��Ƿ����д��������Ϊfalse��
				flag = false;
				//���������߳�
				notifyAll();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	
	//��Ǯ�ķ���
	public synchronized void deposit(double depositAmount)
	{
		
		try
		{
			//���flagΪ�棬�����˻��������˴�Ǯ��ȥ�����Ǯ��������
			while(flag)
			{
				System.out.println("deposit wait begin");
				wait();
				System.out.println("deposit wait end");
			}
				//ִ�д��
				
				System.out.println(Thread.currentThread().getName() + 
					" ���:" +  depositAmount);
				balance += depositAmount;
				System.out.println("�˻����Ϊ��" + balance);
				//����ʾ�˻��Ƿ����д��������Ϊtrue
				flag = true;
				//���������߳�
				notifyAll();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

	
}