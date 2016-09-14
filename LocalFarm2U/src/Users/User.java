package Users;

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
	public void setZip(String zip){
		if(zip.length()==6){
			zipCode=zip;
		}
		else{
			zipCode=null;
		}
	}
	public String getZip() {
		// TODO Auto-generated method stub
		return zipCode;
	}
}
