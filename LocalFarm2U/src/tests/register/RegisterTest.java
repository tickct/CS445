package tests.register;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import register.UserRegistration;
import users.Farmer;

public class RegisterTest {
		UserRegistration list=new UserRegistration();
		Farmer farmer=new Farmer("Sean Gray","1231231234","123ABC","123456");
		Farmer farmer2=new Farmer("Sean Gray","1231231234","123ABC","123456");
		
	@Test
	public void AddFarmerAddstoList(){
		list.addUser(farmer);
		assertEquals(list.getSize(),1);
		list.addUser(farmer2);
		assertEquals(list.getSize(),2);
	}
	@Test
	public void RevoveFarmerRemoves(){
		list.addUser(farmer);
		list.removeUser(farmer);
		assertEquals(list.getSize(),0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void ThrowErrorWhenFramerDosntExist(){
		list.removeUser(farmer2);
	}
}
