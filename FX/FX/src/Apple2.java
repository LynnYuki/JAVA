
import java.util.*;

public class Apple2<T extends Number>
{
	T col;
	
	public static void main(String[] args)
	{
		Apple2<Integer> ai = new Apple2<Integer>();
		Apple2<Double> ad = new Apple2<Double>();
		//������뽫��������쳣
		//��ΪString���ʹ���T�βΣ���String����Number�������͡�
		Apple2<String> as = new Apple2<String>();
		
	}
}

