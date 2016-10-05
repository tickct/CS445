package register;

import java.util.ArrayList;

import users.User;

public class UserRegistration {
	ArrayList<User> userList;
	public UserRegistration(){
		userList = new ArrayList<User>();
	}
	public int getSize(){
		return userList.size();
	}
	public void addUser(User user){
		userList.add(user);
	}
	public void removeUser(User user){
		if(userList.contains(user)){
			userList.remove(user);
		}
		else{
			throw new IllegalArgumentException();
		}
	}
}