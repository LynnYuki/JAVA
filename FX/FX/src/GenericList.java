
import java.util.*;

public class GenericList
{
	public static void main(String[] args) 
	{
		//����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<String>();
		strList.add("Struts2Ȩ��ָ��");
		strList.add("����J2EE��Ajax����");
		strList.add("������J2EE��ҵӦ��ʵս");
		//������뽫����������
		strList.add(5);
		for (int i = 0; i < strList.size() ; i++ )
		{
			//�����������ǿ������ת��
			String str = strList.get(i);
		}
	}
}