package InventoryManager;

public class Product {
	int id;
	String name;
	
	public Product(int i, String name) {
		super();
		this.id=i;
		this.name=name;
	}

	public String toString() {
		return "id: "+id+"| name: "+name;
	}
}
