package syn;

public class Test1 {

	public static void main(String[] args) {
		try{
			//����wait����û�г����ʵ��������׳��쳣
			String newString=new String("test");
			newString.wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}

}
