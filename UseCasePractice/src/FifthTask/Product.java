package FifthTask;

public abstract class Product {
	String productid;
	String name;
	
	public Product(String productid, String name) {
		super();
		this.productid = productid;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Product ID: " + productid + ", Name: " + name;
	}

}




