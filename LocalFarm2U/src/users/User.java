package users;

public abstract class User {
	private String name;
	private String phoneNumber;
	private String adress;
	private String zipCode;
	private String username;
	private String password;
	public User(String nm,String pN,String ad,String zipCode,String user, String pass){
		name=nm;
		phoneNumber=pN;
		adress=ad;
		this.setZip(zipCode);
		username=user;
		password=pass;
	}
	public void setZip(String zip) throws IllegalArgumentException{
		if(zip.length()!=6){
			throw new IllegalArgumentException("Zip Code is not 6 long");
		}
		zipCode=zip;
	}
	public String getZip() {
		return zipCode;
	}
	public String getUsername() {
		return username;
	}
}
