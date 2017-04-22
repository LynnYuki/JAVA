package mypack;

public class UserInf {
	private String name;
	private String password;
	private String sex;
	private String qq;
	private String email;
	
	public UserInf(){
		
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public void setQq(String qq){
		this.qq=qq;
	}
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getQq(){
		return qq;
	}
	public String getEmail(){
		return email;
	}
	public String getName(){
		return this.name;
	}
	public String getPassword(){
		return this.password;
	}
	public String getSex(){
		return this.sex;
	}
	

	

}
