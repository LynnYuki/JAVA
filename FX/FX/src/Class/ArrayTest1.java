package Class;
import java.lang.reflect.*;

public class ArrayTest1 
{
	public static void main(String args[])
	{
		try
		{
			//����һ��Ԫ������ΪString ������Ϊ10������
			Object arr = Array.newInstance(String.class, 10);
			//����Ϊarr������indexΪ5��6��Ԫ�ظ�ֵ
			Array.set(arr, 5, "Struts2Ȩ��ָ��");
			Array.set(arr, 6, "ROR���ݿ������ʵ��");
			//����ȡ��arr������indexΪ5��6��Ԫ�ص�ֵ
			Object book1 = Array.get(arr , 5);
			Object book2 = Array.get(arr , 6);
			//���arr������indexΪ5��6��Ԫ��
			System.out.println(book1);
			System.out.println(book2);
		}
		catch (Throwable e)
		{
			System.err.println(e);
		}
	}
}