

import java.util.*;

public class ListErr
{
	public static void main(String[] args) 
	{
		//����һ��ֻ�뱣���ַ�����List����
		List strList = new ArrayList();
		strList.add("Struts2Ȩ��ָ��");
		strList.add("����J2EE��Ajax����");
		strList.add("������J2EE��ҵӦ��ʵս");
		//����С�ġ���һ��Integer���󡱶���"�˼���
		strList.add(5);
		for (int i = 0; i < strList.size() ; i++ )
		{
			//��ΪList��ȡ����ȫ����Object�����Ա���ǿ������ת��
			//���һ��Ԫ�ؽ�����ClassCastException�쳣
			if(strList.get(i) instanceof String){
			   String str = (String)strList.get(i);
			}
		}
	}
}