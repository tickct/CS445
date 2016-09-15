package tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import Things.Bat;
import Things.Creature.IllegalFood;
import Things.Thing;
import Things.Tiger;

public class BatTests {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	Bat bat=new Bat("Beth");
	Thing thing=new Thing();
	Tiger tiger=new Tiger("Tony");
	
	@Before
	public void setUp(){
	thing.setName("pencil");
	System.setOut(new PrintStream(outContent));
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
	
	@Test
	public void BatCantEatThings() {
	    bat.eat(thing);
	    assertEquals(bat.toString()+ " can not eat "+thing.toString()+"\n",outContent.toString());
	}
	@Test
	public void BatCanEatCreatures(){
		bat.eat(tiger);
	}
	@Test
	public void BatFlyies(){
		bat.move();
		assertEquals(bat.toString()+" is swooping through the dark.\n", outContent.toString());
	}
}


