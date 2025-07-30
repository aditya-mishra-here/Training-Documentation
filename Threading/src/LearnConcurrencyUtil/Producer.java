package LearnConcurrencyUtil;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
 
public class Producer implements Runnable{
	int n;
	
	BlockingQueue<Integer> ques=new ArrayBlockingQueue<Integer>(5);
	public Producer(BlockingQueue<Integer> ques) {
		super();
		this.ques = ques;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				synchronized (this) {
//					int nn=n++;
					System.out.println("New question: "+n++);
					ques.put(n);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
 
}