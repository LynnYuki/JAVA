package syn;
//һ����������һ�������ߵĲ��Գ���
public class TestDraw
{
	public static void main(String[] args) 
	{
		//����һ���˻�
		Account acct = new Account("1234567" , 0);
		
		new DepositThread("����߼�" , acct , 800).start();
		new DrawThread("ȡǮ��" , acct , 900).start();
		
	}
}
 