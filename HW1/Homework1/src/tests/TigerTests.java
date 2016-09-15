package tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import Things.Ant;
import Things.Thing;
import Things.Tiger;

public class TigerTests {
	Ant ant=new Ant("Anthony");
	Thing thing=new Thing();
	Tiger tiger=new Tiger("Tony");
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
	thing.setName("pencil");
	System.setOut(new PrintStream(outContent));
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
	
	@Test
	public void movePrintsCorrect(){
		tiger.move();
		assertEquals(tiger.toString()+" has just pounced\n",outContent.toString());
	}
}

