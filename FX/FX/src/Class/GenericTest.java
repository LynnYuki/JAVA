package Class;
import java.lang.reflect.*;
import java.util.*;


public class GenericTest
{
	private Map<String , Integer> score;
	public static void main(String[] args)
		throws Exception
	{
		Class<GenericTest> clazz = GenericTest.class;
		Field f = clazz.getDeclaredField("score");
		//ֱ��ʹ��getType()ȡ��Field����ֻ����ͨ���͵�Field��Ч
		Class<?> a = f.getType();
		System.out.println("score��������:" + a);
		//���Fieldʵ��f�ķ�������
		Type gType = f.getGenericType();
		//���gType������ParameterizedType����
		if(gType instanceof ParameterizedType)
		{
			//ǿ������ת��
			ParameterizedType pType = (ParameterizedType)gType;
			//��ȡԭ������
			Type rType = pType.getRawType();
			System.out.println("ԭʼ�����ǣ�" + rType);
			//ȡ�÷������͵ķ��Ͳ���
			Type[] tArgs = pType.getActualTypeArguments();
			System.out.println("����������:");
			for (int i = 0; i < tArgs.length; i++) 
			{
				System.out.println("��" + i + "�����������ǣ�" + tArgs[i]);
			}
		}
		else
		{
			System.out.println("��ȡ�������ͳ���");
		}
	}
}
