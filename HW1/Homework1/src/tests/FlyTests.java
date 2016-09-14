package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Things.Creature.IllegalFood;
import Things.Fly;
import Things.Thing;
import Things.Tiger;

public class FlyTests {
	
	Fly fly=new Fly("Philip");
	Thing thing=new Thing();
	Tiger tiger=new Tiger("Tony");
	
	@Before
	public void setUp(){
	thing.setName("pencil");
	}
	
	@Test
	public void eatingStores() {
		fly.eat(thing);
		assertEquals(thing,fly.getInBelly());
	}
	@Test(expected=IllegalFood.class)
	public void FlyCantEatCreatures() {
	    fly.eat(tiger);
	}
	
	@Test
	public void toStringIncludesClass(){
		assertEquals("Philip Fly",fly.toString());
	}
	

}
