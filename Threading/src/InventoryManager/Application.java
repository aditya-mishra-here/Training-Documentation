package InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		Inventory mng = new Inventory();
		
		Thread inventoryTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				mng.populatesoldProduct();
			}
		});
		
		Thread displayTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				mng.dispproduct();
			}
		});
		
		inventoryTask.start();
		Thread.sleep(2000);
		displayTask.start();
	}

}
