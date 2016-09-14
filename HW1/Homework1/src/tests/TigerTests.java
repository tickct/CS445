package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Things.Ant;
import Things.Thing;
import Things.Tiger;

public class TigerTests {
	Ant ant=new Ant("Anthony");
	Thing thing=new Thing();
	Tiger tiger=new Tiger("Tony");
	
	@Before
	public void setUp(){
	thing.setName("pencil");
	}
	
	@Test
	public void eatingStores() {
		tiger.eat(thing);
		assertEquals(thing,tiger.getInBelly());
	}
	
	@Test
	public void toStringIncludesClass(){
		assertEquals("Tony Tiger",tiger.toString());
	}
	

}

