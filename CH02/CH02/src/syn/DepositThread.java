package syn;

public class DepositThread extends Thread
{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ������Ǯ��
	private double depositAmount;

	public DepositThread(String name , Account account , 
		double depositAmount)
	{
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}

	//�ظ�10��ִ�д�����
	public void run()
	{
		//for (int i = 0 ; i < 10 ; i++ )
		//{
			account.deposit(depositAmount);
		//}		
	}
}