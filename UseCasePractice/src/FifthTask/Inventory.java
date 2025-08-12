package FifthTask;

import java.util.ArrayList;

public class Inventory<T extends Product> {
	ArrayList<T> list = new ArrayList<T>();
	
	public void addProduct(T product){
		list.add(product);
	}
	
	public void listAllProducts() {
		for(T p: list) {
			System.out.println(p.toString());
		}
	}

	@Override
	public String toString() {
		return "Inventory [list=" + list + "]";
	}
}
