package syn;

public class Test2 {

	public static void main(String[] args) {
		try{
			
			String newString=new String("test");
			System.out.println("syn����");
			synchronized(newString){
				System.out.println("syn��һ��");
				newString.wait();
				//�߳�û�б�������Զ���ڵȴ�״̬
				System.out.println("wait����Ĵ���");
			}
			System.out.println("syn����Ĵ���");
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}

}
