package Class;
import java.lang.reflect.*;


public class ClassTest
{
	
	static {  

        System.out.println("static block");

    }

  {
    System.out.println("dynamic block");
  }

	//Ϊ���ඨ��һ��˽�еĹ�����
	private ClassTest()
	{
		System.out.println("ִ���޲����Ĺ�����"); 
	}
	//����һ���в����Ĺ�����
	public ClassTest(String name)
	{
		System.out.println("ִ���в����Ĺ�����");
	}
	//����һ���޲�����info����
	public void info()
	{
		System.out.println("ִ���޲�����info����");
	}
	//����һ���в�����info����
	public void info(String str)
	{
		System.out.println("ִ���в�����info����"
			+ "����ʵstr����ֵ��" + str);
	}
	
	public static void main(String[] args) 
		throws Exception
	{
		
		//����class���Ի�ȡClass����
		Class<ClassTest> clazz1 = ClassTest.class;
	
		//����Class���forName()������ȡClass����,���׳�NoClassDefFoundError����
		Class<?> clazz2 = Class.forName("Class.ClassTest");
		
		//���ö����getClass��������ȡClass����
		//ClassTest c=new ClassTest();
		//Class<?> clazz3=c.getClass();
	
		
	
		
		/**
		//��ȡ��Class��������Ӧ���ȫ��������
		Constructor[] ctors = clazz.getDeclaredConstructors();
		System.out.println("ClassTest��ȫ�����������£�");
		for (Constructor c : ctors)
		{
			System.out.println(c);
		}
		System.out.println("************************************************");
		//��ȡ��Class��������Ӧ���ȫ��public������
		Constructor[] publicCtors = clazz.getConstructors();
		System.out.println("ClassTest��ȫ��public���������£�");
		for (Constructor c : publicCtors)
		{
			System.out.println(c);
		}
		System.out.println("**************************************************");
		//��ȡ��Class��������Ӧ���ȫ��public����
		Method[] mtds = clazz.getMethods();
		System.out.println("ClassTest��ȫ��public�������£�");
		for (Method md : mtds)
		{
			System.out.println(md);
		}
		//��ȡ��Class��������Ӧ���ָ������
		System.out.println("ClassTest���һ���ַ���������info����Ϊ��"
			+ clazz.getMethod("info" , String.class));
		System.out.println("**************************************************");
		//��ȡ��Class��������Ӧ���ȫ���ڲ���
		Class<?>[] inners = clazz.getDeclaredClasses();
		System.out.println("ClassTest��ȫ���ڲ������£�");
		for (Class c : inners)
		{
			System.out.println(c);
		}
		
		System.out.println("ClassTest�İ�Ϊ��" + clazz.getPackage());
		System.out.println("ClassTest�ĸ���Ϊ��" + clazz.getSuperclass());*/
	}
}
