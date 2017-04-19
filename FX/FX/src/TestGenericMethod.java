
import java.util.*;


public class TestGenericMethod
{
	//����һ�����ͷ������÷��ͷ����д�һ��T�βΣ�
	static <T> void fromArrayToCollection(T[] a, Collection<T> c)
	{
		for (T o : a)
		{
			c.add(o);
		}
	}
	
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
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<Object>();
		//���������T����Object����
		fromArrayToCollection(oa, co);
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<String>();
		//���������T����String����
		fromArrayToCollection(sa, cs);
		//���������T����Object����
		fromArrayToCollection(sa, co);
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList<Number>(); 
		//���������T����Number����
		fromArrayToCollection(ia, cn);
		//���������T����Number����
		fromArrayToCollection(fa, cn); 
		//���������T����Number����
		fromArrayToCollection(na, cn);
		//���������T����String����
		fromArrayToCollection(na, co);
		//���������T����String���ͣ���na��һ��Number���飬
		//��ΪNumber�Ȳ���String���ͣ�Ҳ�����������࣬���Գ��ֱ������
		fromArrayToCollection(na, cs);
		
		List<Object> ao = new ArrayList<Object>();
		List<String> as = new ArrayList<String>();
		//������뽫�����������
		test(as , ao);
	}
}
