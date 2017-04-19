package Class;
import java.util.*;
import javax.swing.*;

public class YeekuObjectFactory
{
	public static Object getInstance(String clsName)
	{
		try
		{
			//����ָ�����Ӧ��Class����
			Class cls = Class.forName(clsName);
			//����ʹ�ø�Class������������ʵ��
			return cls.newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args)
	{
		//��ȡʵ������Ҫǿ������ת��
		Date d = (Date)YeekuObjectFactory.getInstance("java.util.Date");
		JFrame f = (JFrame)YeekuObjectFactory.getInstance("java.util.Date");
	}
}
