package Things;

public class Fly extends Creature implements Flyer {
	
	public Fly(String name){
		super();
		this.setName(name);
	}
	
	public void eat(Thing aThing){
		try{
			if(aThing instanceof Creature){
				throw new IllegalFood(this.getName());
			}
			System.out.println(this.toString()+" has just eaten a "+aThing.toString());
			setInBelly(aThing);
		}
		catch(IllegalFood e){
			System.out.println(this.toString()+ " can not eat "+aThing.toString());
		}
	}
	public void Flys() {
		// TODO Auto-generated method stub
		System.out.println(this.toString()+" is buzzing around in flight.");
	}
	

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.Flys();
	}

	
}
