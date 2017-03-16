package Ex.Three;

public class Service {
	private String username;
	private String password;
	public void setUsernamePassword(String username,String password){
		try{
			this.username=username;
			Thread.sleep(3000);
			this.password=password;
			System.out.println("线程名称为:"+Thread.currentThread().getName()+" username= "+this.username+"  ;password = "+this.password);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}

