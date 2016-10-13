package tests.products;

import static org.junit.Assert.*;

import org.junit.Test;

import products.Types;

public class TypeTest {
	Types type=new Types();
	@Test
	public void addAdds() {
		type.addType("test");
		assertEquals(1,type.size());
	}
	@Test
	public void addDosntAddDuplcates() {
		type.addType("test");
		type.addType("test");
		assertEquals(1,type.size());
	}
	@Test
	public void sizeCallsArrayListSize(){
		assertEquals(type.size(),type.getTypes().size());
		
	}

}
