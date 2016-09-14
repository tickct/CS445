package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Things.Ant;
import Things.Thing;
import Things.Tiger;

public class AntTests {
	Ant ant=new Ant("Anthony");
	Thing thing=new Thing();
	Tiger tiger=new Tiger("Tony");
	
	@Before
	public void setUp(){
	thing.setName("pencil");
	}
	
	@Test
	public void eatingStores() {
		ant.eat(thing);
		assertEquals(thing,ant.getInBelly());
	}
	
	@Test
	public void toStringIncludesClass(){
		assertEquals("Anthony Ant",ant.toString());
	}
	

}
