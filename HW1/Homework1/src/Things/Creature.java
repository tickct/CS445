package Things;


public abstract class Creature extends Thing{
	
	private Thing inBelly;
	public Creature(){
		super();
		inBelly=null;
	}
	public void eat(Thing aThing){
		System.out.println(this.toString()+" has just eaten a "+aThing.toString());
		setInBelly(aThing);
	}
	public abstract void move();
	
	public void whatDidYouEat(){
		Thing ate=getInBelly();
		System.out.print(this.toString()+" has ");
		if(ate==null){
			System.out.println("had nothing to eat!");
		}
		else{
			System.out.println("eaten a "+ate);
		}
	}
	public void setInBelly(Thing aThing){
		inBelly=aThing;
	}
	public Thing getInBelly(){
		return inBelly;
	}
	
	public class IllegalFood extends Exception{
		public IllegalFood(String e){
			super(e);
		}
	}
}
