package Class;

public class GetClassTest {
	public static void main(String[] args) {
	 GetClassTest test = new GetClassTest();
	    if(test.ClassCheck())
	     System.out.println("OK");

	}

	public boolean ClassCheck() {
	    try {
	     System.out.println("ͨ���౾���ö���");
	     Class userClass = this.getClass() ;
	     System.out.println(userClass.getName());
	     System.out.println("===========");
	    
	     System.out.println("ͨ�������ʵ����ø������");
	     UseInfo useInfo = new UseInfo();
	     userClass = useInfo.getClass();
	     System.out.println(userClass.getName());
	     Class subUserClass = userClass.getSuperclass() ;
	     System.out.println(subUserClass.getName());
	     System.out.println("===========");
	    
	     System.out.println("ͨ������.class��ȡ����");
	     Class forClass = UseInfo.class ;
	     System.out.println(forClass.getName());
	     System.out.println("===========");
	    
	     System.out.println("ͨ���������ַ�����ȡ����");
	     Class forName = Class.forName("Class.UseInfo") ;
	     System.out.println(forName.getName());
	     System.out.println("=============");
	    
	    } catch (Exception e) {
	     e.printStackTrace();
	     return false;
	    }
	    return true;
	 }
	 }
