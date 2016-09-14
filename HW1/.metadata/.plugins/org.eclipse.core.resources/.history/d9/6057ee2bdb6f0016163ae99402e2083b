package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Things.Creature;
import Things.Thing;
import Things.Tiger;

public class CreatureTests {

	@Test
	public void BellyStartsEmpty() {
		Tiger tiger=new Tiger("test");
		assertNull(tiger.getInBelly());
	}
	@Test
	public void eatingStores() {
		Tiger tiger=new Tiger("test");
		Tiger eaten=new Tiger("Eaten ");
		tiger.eat(eaten);
		assertNotNull(tiger.getInBelly());
	}

}
