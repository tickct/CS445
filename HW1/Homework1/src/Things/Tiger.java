package Things;

public class Tiger extends Creature{

	public Tiger(String name){
		super();
		this.setName(name);
	}


	@Override
	public void move() {
		System.out.println(this.toString()+" has just pounced");
	}

}
