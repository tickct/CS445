package tests.users;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import users.Customer;
import users.Farmer;
import users.User;


public class UserTest {
	User user=new Farmer("Sean Gray","1231231234","123ABC","123456","user","pass");
	User user2=new Customer("Sean Gray","1231231234","123ABC","123456","user","pass");
	User[] userlist={user,user2};
	@Test
	public void ZipCodeShouldBe6Long(){
		user.setZip("123456");
		assertEquals(user.getZip(),"123456");
	}
	@Test(expected=IllegalArgumentException.class)
	public void ZipCodeShouldBeNullIfNot6(){
		user.setZip("1234");
	}
}
