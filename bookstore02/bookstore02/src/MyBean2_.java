
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;
public class MyBean2_ implements HttpSessionActivationListener,
Serializable{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("MyBean2_的对象活化了...");
	}
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("MyBean2_的对象钝化了...");
	}
}
