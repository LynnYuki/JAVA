//����

class Apple3<T extends Number>
{
	T size;

	public Apple3()
	{
	}

	public Apple3(T size)
	{
		this.size = size;
	}

	public void setA(T size)
	{
		this.size = size;
	}
	public T getSize()
	{
		 return this.size;
	}
}
public class TestErasure
{
	public static void main(String[] args)
	{
		Apple3<Integer> a = new Apple3<Integer>(6);
		//a��getSize��������Integer����
		Integer as = a.getSize();
		//��a���󸳸�Apple�������ᶪʧ���������������Ϣ
		Apple3 b = a;
		//bֻ֪��size��������Number
		Number size1 = b.getSize();
		//�����������������
		//Integer size2 = b.getSize();
	}
}