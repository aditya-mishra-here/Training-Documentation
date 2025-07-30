package Demo;

public class application {

	public static void main(String[] args) {
		
//		System.out.println("Starting Thread 1");
//		Task taskRunner = new Task("Task-A");
//		taskRunner.start();
//		
//		System.out.println("Starting Thread 2");
//		Task taskRunner2 = new Task("Task-B");
//		taskRunner2.start();
		
		Sequence sequence = new Sequence();
		
		Worker worker1 = new Worker(sequence);
		worker1.start();
		
		Worker worker2 = new Worker(sequence);
		worker2.start();
		
	}
}

class Worker extends Thread {
	
	Sequence sequence = null;
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}

	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+" got value: "+ sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
//	String name;
//		
//	public Task(String name) {
//		this.name = name;
//	}
//	
//	public void run() {
//		Thread.currentThread().setName(this.name);
//		for(int i=0;i<1000;i++) {
//			System.out.println("number :" + i + " " + Thread.currentThread().getName());
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
}
