
import java.util.*;

public class TestErasure2
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(6);
		li.add(9);
		List list = li;
		//�����������δ������ת�����ľ��棬���롢����ʱ��ȫ����
		List<String> ls = list;
		//��ֻҪ����ls���Ԫ�أ���������뽫��������ʱ�쳣��
		System.out.println(ls.get(0));
	}
}