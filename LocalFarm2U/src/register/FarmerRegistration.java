package register;

import java.util.ArrayList;

import users.Farmer;

public class FarmerRegistration {
	ArrayList<Farmer> farmerList;
	public FarmerRegistration(){
		farmerList = new ArrayList();
	}
	public int getSize(){
		return farmerList.size();
	}
	public void addFarmer(Farmer farmer){
		farmerList.add(farmer);
	}
	public void removeFarmer(Farmer farmer){
		if(farmerList.contains(farmer)){
			farmerList.remove(farmer);
		}
		else{
			throw new IllegalArgumentException();
		}
	}
}
