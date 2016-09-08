package Things;


public class Bat extends Creature implements Flyer {

	public Bat(String name){
		super();
		this.setName(name);
	}
	public void eat(Thing aThing){
		try{
			if(aThing instanceof Creature){
				System.out.println(this.toString()+" has just eaten a "+aThing.toString());
				setInBelly(aThing);
			}
			else{
				throw new IllegalFood(this.getName());
			}
		}
		catch(IllegalFood e){
			System.out.println(this.toString()+ " can not eat "+aThing.toString());
		}
	}
	public void Flys() {
		// TODO Auto-generated method stub
		System.out.println(this.toString()+" is swooping through the dark.");
	}
	

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.Flys();
	}

}
