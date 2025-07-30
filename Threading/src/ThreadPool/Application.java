package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
 
public class Application {
	public static void main(String[] args) {
		ExecutorService e=Executors.newFixedThreadPool(2);
		MessageProcessor p1=new MessageProcessor(1);
		e.execute(p1);
		MessageProcessor p2=new MessageProcessor(2);
		e.execute(p2);
		MessageProcessor p3=new MessageProcessor(5);
		e.execute(p3);
		e.shutdown();
		
		try {
			e.awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Ended");
		
	}
}
