

class AccountVar
{
	/*����һ��ThreadLocal���͵ı������ñ�������һ���ֲ߳̾�����
	  ÿ���̶߳��ᱣ���ñ�����һ������*/
	private ThreadLocal<String> name = 
		new ThreadLocal<String>();
	//����һ����ʼ��name���ԵĹ�����
	public AccountVar(String name)
	{
		this.name.set(name);
	}
	//������name���Ե�setter��getter����
	public String getName()
	{
		return name.get();
	}
	public void setName(String str)
	{
		this.name.set(str);
	}
}
class MyTest extends Thread
{
	//����һ��Account����
	private AccountVar account;
	public MyTest(AccountVar account, String name)
	{
		super(name);
		this.account = account;
	}
	public void run()
	{
		//ѭ��10��
		for (int i = 0 ; i < 10 ; i++)
		{
			//��i == 6ʱ������˻����滻�ɵ�ǰ�߳���
			if (i == 6)
			{
				account.setName(getName());
			}
			//���ͬһ���˻����˻�����ѭ������
			System.out.println(Thread.currentThread().getName()+" "+account.getName()
				+ " �˻���iֵ��" + i);
		}
	}
}
public class ThreadLocalTest
{
	public static void main(String[] args) 
	{
		//���������̣߳������̹߳���ͬһ��Account
		AccountVar at = new AccountVar("��ʼ��");
		System.out.println(Thread.currentThread().getName()+"  "+at.getName());
		at.setName("main�߳�");
		System.out.println(Thread.currentThread().getName()+"  "+at.getName());
		/*
		��Ȼ�����̹߳���ͬһ���˻�����ֻ��һ���˻���
		�������˻�����ThreadLocal���͵ģ����������߳̽�
		������ͬһ��Account�����������˻����ĸ�����ÿ���߳�
		����ȫӵ�и��Ե��˻������������Դ�i == 6֮�󣬽���������
		�̷߳���ͬһ���˻�ʱ������ͬ���˻�����
		*/
		new MyTest(at , "�̼߳�").start();
		new MyTest(at , "�߳���").start();
	}
}
