package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
 
public class Consumer implements Runnable {
	
	List<Integer> ql=new ArrayList<>();
 
	public Consumer(List<Integer> ql) {
		this.ql=ql;
	}
	
	
	public void ansq() throws InterruptedException {
		synchronized (ql) {
			while(ql.isEmpty()) {
				System.out.println("No questions");
				ql.wait();
			}
		}
		synchronized (ql) {
			Thread.sleep(5000);
			System.out.println("Answer: "+ql.remove(0));
			ql.notify();	
		}
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				ansq();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}