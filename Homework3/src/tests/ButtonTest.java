package tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import lamp.Lamp;

import org.junit.Before;
import org.junit.Test;

import button.Button;
import button.PushButton;

public class ButtonTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp(){
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void ButtonOn() {
		Lamp lamp=new Lamp();
		Button button=new Button(lamp);
		button.switchOn();
		assertEquals("Button switched to ON\nLightbulb on\n",outContent.toString());
	}
	@Test
	public void ButtonOff() {
		Lamp lamp=new Lamp();
		Button button=new Button(lamp);
		button.switchOff();
		assertEquals("Button switched to OFF\nLightbulb off\n",outContent.toString());
	}
	@Test
	public void pushbuttonOnOff(){
		Lamp lamp=new Lamp();
		PushButton button=new PushButton(lamp);
		button.pushButton();
		assertEquals("Lightbulb on\n",outContent.toString());
		outContent.reset();
		button.pushButton();
		assertEquals("Lightbulb off\n",outContent.toString());
	}

}
