package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import Things.Fly;
import Things.Tiger;


public class CreatureTests {
	Tiger tiger=new Tiger("Tony");
	Fly fly=new Fly("Philip");
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void BellyStartsEmpty() {
		assertNull(tiger.getInBelly());
	}
	@Test
	public void WhatDidYouEatDiffWhenEmpty(){
		tiger.whatDidYouEat();
		assertEquals(tiger.toString()+" has had nothing to eat!\n",outContent.toString());
	}
	@Test
	public void WhatDidYouEatReturnsStored(){
		tiger.eat(fly);
		//needed to not capture the eat confirmation
		outContent.reset();
		tiger.whatDidYouEat();
		assertEquals(tiger.toString()+" has eaten a "+fly.toString()+"\n",outContent.toString());
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
	
}
