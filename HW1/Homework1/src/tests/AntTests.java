package tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import Things.Ant;
import Things.Thing;
import Things.Tiger;

public class AntTests {
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
		ant.eat(thing);
		assertEquals(thing,ant.getInBelly());
	}
	
	@Test
	public void toStringIncludesClass(){
		assertEquals("Anthony Ant",ant.toString());
	}
	@Test
	public void movePrintsCorrect(){
		ant.move();
		assertEquals(ant.toString()+" is crawling around\n",outContent.toString());
	}

}
