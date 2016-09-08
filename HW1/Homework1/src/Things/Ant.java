package Things;

public class Ant extends Creature{

	public Ant(String name){
		super();
		this.setName(name);
	}
	@Override
	public void move() {
		System.out.println(this.toString()+" is crawling around"); 		
	}

}
