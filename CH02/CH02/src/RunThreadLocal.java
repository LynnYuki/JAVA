
public class RunThreadLocal {
	
	public static ThreadLocal<String> t1=new ThreadLocal<String>();
	
	public static void main(String[] args){
		if(t1.get()==null){
			System.out.println("��δ�Ź�ֵ");
			t1.set("�ҵ�ֵ");
		}
	System.out.println(t1.get());
	}
}
