package tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import Things.Creature.IllegalFood;
import Things.Fly;
import Things.Thing;
import Things.Tiger;

public class FlyTests {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	Fly fly=new Fly("Philip");
	Thing thing=new Thing();
	Tiger tiger=new Tiger("Tony");
	
	@Before
	public void setUp(){
	thing.setName("pencil");
	System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void eatingStores() {
		fly.eat(thing);
		assertEquals(thing,fly.getInBelly());
	}
	@Test
	public void FlyCantEatCreatures() {
	    fly.eat(tiger);
	    assertEquals(fly.toString()+ " can not eat "+tiger.toString()+"\n",outContent.toString());
	}
	
	@Test
	public void toStringIncludesClass(){
		assertEquals("Philip Fly",fly.toString());
	}
	@Test
	public void FlyFlyies(){
		fly.move();
		assertEquals(fly.toString()+" is buzzing around in flight.\n", outContent.toString());
	}

}
