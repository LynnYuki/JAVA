//�����Լ��ķ�����

//����Apple��ʱʹ���˷�������
public class Apple<T>
{
	//ʹ��T�����βζ�������
	private T info;

	public Apple(){}
	//���淽����ʹ��T�����β������巽��
	public Apple(T info)
	{
		this.info = info;
	}
	public void setInfo(T info)
	{
		this.info = info;
	}
	public T getInfo()
	{
		 return this.info;
	}
	public static void main(String[] args)
	{
		//��Ϊ����T�βε���Stringʵ�����ͣ����Թ������Ĳ���ֻ����String
		Apple<String> a1 = new Apple<String>("ƻ��");
		System.out.println(a1.getInfo());
		//��Ϊ����T�βε���Doubleʵ�����ͣ����Թ������Ĳ���ֻ����Double����double
		Apple<Double> a2 = new Apple<Double>(5.67);
		System.out.println(a2.getInfo());
	}
}

//class sub extends Apple<T>{  }