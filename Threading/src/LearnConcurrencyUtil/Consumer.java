package LearnConcurrencyUtil;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
 
public class Consumer implements Runnable{
 
	BlockingQueue<Integer> ques=new ArrayBlockingQueue<Integer>(5);
	public Consumer(BlockingQueue<Integer> ques) {
		super();
		this.ques = ques;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (this) {
				try {
					Thread.sleep(1000);
					System.out.println("Question ans: "+ques.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
 
}