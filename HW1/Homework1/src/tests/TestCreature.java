package tests;

import Things.Ant;
import Things.Bat;
import Things.Creature;
import Things.Fly;
import Things.Thing;
import Things.Tiger;


public class TestCreature {

public static final int THING_COUNT=5;
public static final int CREATURE_COUNT=4;

	public static void main(String[]args){
		Thing[] thing_array=new Thing[THING_COUNT];
		Creature[] creature_array=new Creature[CREATURE_COUNT];
		for(int i=0;i<THING_COUNT;i++){
			thing_array[i]=new Thing();
			thing_array[i].setName("Thing "+i);
		}
		creature_array[0]=new Tiger("Tom");
		creature_array[1]=new Ant("Alice");
		creature_array[2]=new Bat("Ben");
		creature_array[3]=new Fly("Fiona");
		System.out.println("Things:");
		for(int i=0;i<THING_COUNT;i++){
			System.out.println(thing_array[i]);
		}
		System.out.println("\nCreatures");
		for(int i=0;i<CREATURE_COUNT;i++){
			System.out.println(creature_array[i]);
		}
		System.out.println("\nMovement:");
		for(int i=0;i<CREATURE_COUNT;i++){
			creature_array[i].move();
		}
		System.out.println("\nEatThing:");
		for(int i=0;i<CREATURE_COUNT;i++){
			creature_array[i].eat(thing_array[0]);
		}
		System.out.println("\nWhatDidYouEat:");
		for(int i=0;i<CREATURE_COUNT;i++){
			creature_array[i].whatDidYouEat();
		}
		System.out.println("\nEatCreature:");
		for(int i=0;i<CREATURE_COUNT;i++){
			creature_array[i].eat(creature_array[0]);
		}
		System.out.println("\nWhatDidYouEat:");
		for(int i=0;i<CREATURE_COUNT;i++){
			creature_array[i].whatDidYouEat();
		}
		
	}
 
}
