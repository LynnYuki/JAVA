package syn;
//�߳�֮���Э������ һ�������߶�һ��������
public class Account
{
	private String accountNo;
	private double balance;
	//��ʶ�˻����Ƿ����д������
	private boolean flag = false;


	public Account(){}

	public Account(String accountNo , double balance)
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
			if ((!flag))
			{
				System.out.println("draw wait begin");
				wait();
				System.out.println("draw wait end");
			}
			else
			{
				//ִ��ȡǮ
				
				System.out.println(Thread.currentThread().getName() + 
					" ȡǮ:" +  drawAmount);
				balance -= drawAmount;
				System.out.println("�˻����Ϊ��" + balance);
				
				//����ʶ�˻��Ƿ����д��������Ϊfalse��
				flag = false;
				//���������߳�
				notify();
			}
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
			if(flag)
			{
				System.out.println("deposit wait begin");
				wait();
				System.out.println("deposit wait end");
			}
			else
			{
				//ִ�д��
				
				System.out.println(Thread.currentThread().getName() + 
					" ���:" +  depositAmount);
				balance += depositAmount;
				System.out.println("�˻����Ϊ��" + balance);
				//����ʾ�˻��Ƿ����д��������Ϊtrue
				flag = true;
				//���������߳�
				notify();
			}
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

	
}