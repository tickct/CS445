package Things;

public class Thing {
	
	private String name;
	
	public Thing() {
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		String type=this.getClass().getSimpleName();
		if(type.equals("Thing")){
		return this.getName();
		}
		else{
		return this.getName()+" "+this.getClass().getSimpleName();
		}
	}
	public class NameNotInitialized extends Exception{
		 public NameNotInitialized( String s ) {
		      super(s);
		    }
	}
}
