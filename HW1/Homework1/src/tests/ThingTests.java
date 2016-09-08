package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Things.Thing;

public class ThingTests {
	
	@Test
	public void NameGetSetWorks() {
		Thing thing=new Thing();
		thing.setName("test");
		assertEquals("setNameWorks","test",thing.getName());
	}
	@Test
	public void toStringReturnsOnlyName() {
		Thing thing=new Thing();
		thing.setName("test");
		assertEquals("toString returns name",thing.getName(),thing.toString());
	}
	

}
