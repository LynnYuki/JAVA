

import java.util.*;
public class ErrorGMethod {
	//����һ�����ͷ������÷��ͷ����д�һ��T�β�
   static <T> void test(Collection<T> a, Collection<T> c)
	//static <T> void test(Collection<? extends T> a, Collection<T> c)

	{
		for (T o : a)
		{
			c.add(o);
		}
	}
	public static void main(String[] args) 
	{
		List<Object> ao = new ArrayList<Object>();
		List<String> as = new ArrayList<String>();
		//������뽫�����������
		test(as , ao);
	}
}

