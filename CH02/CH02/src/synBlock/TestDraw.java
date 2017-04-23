package synBlock;
public class TestDraw
{
    public static void main(String[] args) 
    {
		//����һ���˻�
		Account acct = new Account("1234567" , 1000);
		//ģ�������̶߳�ͬһ���˻�ȡǮ
		new DrawThread("��" , acct , 800).start();
		new DrawThread("��" , acct , 800).start();
    }
}
 
class Account
{
	private String accountNo;
	private double balance;


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

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		 return this.balance;
	}

	public int hashCode()
	{
		return accountNo.hashCode();
	}
	public boolean equals(Object obj)
	{
		if (obj != null && obj.getClass() == Account.class)
		{
			Account target = (Account)obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
}

 class DrawThread extends Thread
{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;

	public DrawThread(String name , Account account , 
		double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	//�������߳��޸�ͬһ����������ʱ�����漰�����ݰ�ȫ���⡣
	public void run()
	{
		//ʹ��account��Ϊͬ�����������κ��߳̽�������ͬ�������֮ǰ��
		//�����Ȼ�ö�account�˻����������������߳��޷��������Ҳ���޷��޸���
		//�����������ϣ�����-��>�޸����-->�ͷ��� �߼�
		synchronized (account)
		{
			//�˻�������ȡǮ��Ŀ
			if (account.getBalance() >= drawAmount)
			{
				//�³���Ʊ
				System.out.println(getName() + 
					"ȡǮ�ɹ����³���Ʊ:" + drawAmount);
				try
				{
					Thread.sleep(1);			
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
				//�޸����
				account.setBalance(account.getBalance() - drawAmount);
				System.out.println("\t���Ϊ: " + account.getBalance());
			}
			else
			{
				System.out.println(getName() + "ȡǮʧ�ܣ����㣡");
			}
		}
	}
}