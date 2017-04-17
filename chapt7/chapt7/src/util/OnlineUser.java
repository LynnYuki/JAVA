package util;
import java.util.*; 
import listener.User;
public class OnlineUser {
	private OnlineUser() {}
	private static OnlineUser instance = new OnlineUser();
	public static OnlineUser getInstance() {
		return instance;
	}
	private Map userMap=new HashMap<String,String>();
	// 将用户添加至列表
	public void addUser(User user) {
		userMap.put(user.getId(), user.getUsername());
	}
	// 将用户移除列表
	public void removeUser(User user) {
		userMap.remove(user.getId());
	}
	// 返回用户列表
	public Map getOnlineUsers() {
		return userMap;
	}
}
