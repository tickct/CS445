package tests.register;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import register.FarmerRegistration;
import users.Farmer;

public class RegisterTest {
		FarmerRegistration list=new FarmerRegistration();
		Farmer farmer=new Farmer("Sean Gray","1231231234","123ABC","123456");
		Farmer farmer2=new Farmer("Sean Gray","1231231234","123ABC","123456");
		
	@Test
	public void AddFarmerAddstoList(){
		list.addFarmer(farmer);
		assertEquals(list.getSize(),1);
		list.addFarmer(farmer2);
		assertEquals(list.getSize(),2);
	}
	@Test
	public void RevoveFarmerRemoves(){
		list.addFarmer(farmer);
		list.removeFarmer(farmer);
		assertEquals(list.getSize(),0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void ThrowErrorWhenFramerDosntExist(){
		list.removeFarmer(farmer2);
	}
}
