package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Things.Ant;
import Things.Bat;
import Things.Creature.IllegalFood;
import Things.Thing;
import Things.Tiger;

public class BatTests {

	Bat bat=new Bat("Beth");
	Thing thing=new Thing();
	Tiger tiger=new Tiger("Tony");
	
	@Before
	public void setUp(){
	thing.setName("pencil");
	}
	
	@Test
	public void eatingStores() {
		bat.eat(tiger);
		assertEquals(tiger,bat.getInBelly());
	}
	
	@Test
	public void toStringIncludesClass(){
		assertEquals("Beth Bat",bat.toString());
	}
	
	@Test(expected=IllegalFood.class)
	public void BatCantEatThings() {
	    bat.eat(thing);
	}
	@Test
	public void BatCanEatCreatures(){
		bat.eat(tiger);
	}
}


