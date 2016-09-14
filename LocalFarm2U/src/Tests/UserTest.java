package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Users.Farmer;
import Users.User;

public class UserTest {
	User user=new Farmer("Sean Gray","1231231234","123ABC","123456");
	
	@Test
	public void ZipCodeShouldBe6Long(){
		user.setZip("123456");
		assertEquals(user.getZip(),"123456");
	}
	@Test
	public void ZipCodeShouldBeNullIfNot6(){
		user.setZip("1234");
		assertNull(user.getZip());
	}
}
