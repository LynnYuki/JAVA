package condition;
public class TestDraw
{
    public static void main(String[] args) 
    {
		//����һ���˻�
		Account acct = new Account("1234567" , 0);
		new DrawThread("ȡǮ��" , acct , 800).start();
		new DepositThread("��Ǯ�߼�" , acct , 800).start();
		//new DepositThread("��Ǯ����" , acct , 800).start();
		//new DepositThread("��Ǯ�߱�" , acct , 800).start();
    }
}
 