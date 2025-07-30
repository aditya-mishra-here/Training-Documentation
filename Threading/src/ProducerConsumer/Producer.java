package ProducerConsumer;

import java.util.List;

import java.util.ArrayList;
import java.util.List;
 
public class Producer implements Runnable {
	
	List<Integer> ql=new ArrayList<>();
	final int limit=5;
	private int qn=1;
	public Producer(List<Integer> ql) {
		this.ql=ql;
	}
	
	
	public void readq(int n) throws InterruptedException {
		synchronized (ql) {
			while(ql.size()==limit) {
				System.out.println("Limit reached");
				ql.wait();
			}
		}
		synchronized (ql) {
			System.out.println("New Question: "+n);
			ql.add(n);
			Thread.sleep(100);
			ql.notify();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				readq(qn++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}