package syn;

public class DepositThread1 extends Thread
{
	//ģ���û��˻�
	private Account1 account;
	//��ǰȡǮ�߳���ϣ������Ǯ��
	private double depositAmount;

	public DepositThread1(String name , Account1 account , double depositAmount)
	{
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}

	public void run()
	{
			account.deposit(depositAmount);	
	}
}