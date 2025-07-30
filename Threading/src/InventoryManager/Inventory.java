package InventoryManager;

import java.util.ArrayList;
import java.util.List;
 
public class Inventory {
	List<Product> sp=new ArrayList<>();
	List<Product> pp=new ArrayList<Product>();
	public void populatesoldProduct() {
		for(int i=0;i<1000;i++) {
			Product p = new Product(i, "Product_id_"+i);
			sp.add(p);
			System.out.println("Added "+ p);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void dispproduct() {
		for(Product p: sp) {
			System.out.println("Sold: "+p);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}