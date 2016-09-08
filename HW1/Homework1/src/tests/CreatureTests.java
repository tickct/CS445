package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Things.Bat;
import Things.Creature.IllegalFood;
import Things.Fly;
import Things.Thing;
import Things.Tiger;

public class CreatureTests {
	Tiger tiger=new Tiger("Tony");
	Fly fly=new Fly("Philip");
	Thing thing=new Thing();
	Bat bat=new Bat("Betty");
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void BellyStartsEmpty() {
		assertNull(tiger.getInBelly());
	}
	@Test
	public void eatingStores() {
		tiger.eat(fly);
		assertEquals(fly,tiger.getInBelly());
	}
	@Test
	public void toStringIncludesClass(){
		assertEquals("Tony Tiger",tiger.toString());
	}
	@Test
	public void FlyCantEatCreatures() {
		thrown.expect(IllegalFood.class);
	    fly.eat(tiger);
	}
	@Test
	public void BatCantEatThings() {
		thrown.expect(IllegalFood.class);
		thing.setName("pencil");
	    bat.eat(thing);
	}

}
