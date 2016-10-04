package users;

public abstract class User {
	private String name;
	private String phoneNumber;
	private String adress;
	private String zipCode;
	private static int nextIdNum=0;
	private int idNum;
	public User(String nm,String pN,String ad,String zipCode){
		name=nm;
		phoneNumber=pN;
		adress=ad;
		this.setZip(zipCode);
		idNum=nextIdNum;
		nextIdNum++;
	}
	public void setZip(String zip) throws IllegalArgumentException{
		if(zip.length()!=6){
			throw new IllegalArgumentException("Zip Code is not 6 long");
		}
		zipCode=zip;
	}
	public String getZip() {
		// TODO Auto-generated method stub
		return zipCode;
	}
	public int getID() {
		// TODO Auto-generated method stub
		return idNum;
	}
}
