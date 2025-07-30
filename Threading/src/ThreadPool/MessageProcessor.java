package ThreadPool;

public class MessageProcessor implements Runnable {
	
	private int message;
	
	public MessageProcessor(int message) {
		this.message = message;
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+"[Recieved] Message = "+ message);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"(Done) Processing Message = "+ message);
		
	}
	
}
