package syn;
public class DrawThread1 extends Thread
{
	//ģ���û��˻�
	private Account1 account;
	//��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;

	public DrawThread1(String name , Account1 account , double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	public void run()
	{	
			account.draw(drawAmount);
	}
}