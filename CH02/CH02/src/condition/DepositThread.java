package condition;

public class DepositThread extends Thread
{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double depositAmount;

	public DepositThread(String name , Account account , 
		double depositAmount)
	{
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}

	//�������߳��޸�ͬһ����������ʱ�����漰�����ݰ�ȫ���⡣
	public void run()
	{
		
			account.deposit(depositAmount);		
	}
}