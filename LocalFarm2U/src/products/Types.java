package products;

import java.util.ArrayList;

public class Types {
	private ArrayList<String> types;
	public Types(){
		types=new ArrayList<String>();
	}
	public void addType(String in){
		if(!(types.contains(in))){
			types.add(in);
		}
	}
	public ArrayList<String> getTypes(){
		return types;
	}
	public int size(){
		return types.size();
	}
}
