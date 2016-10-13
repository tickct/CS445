package products;

public class Product {
	private String name;
	private String type;
	private double cost;
	private static Types types=new Types();
	public Product(String nm,String tp,double cst){
		name=nm;
		setType(tp);
		setCost(cst);
	}

	public void setCost(double cst) {
		//if neative set to zero
		if(cst<0){
			throw new IllegalArgumentException("Cost can not be zero");
		}
		cost=cst;
		
	}

	public void setType(String tp) {
		//TODO: create array of allowed types and check
		type=tp;
		
	}

	public double getCost() {
		// TODO Auto-generated method stub
		return cost;
	}
}
