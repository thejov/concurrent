package h2_1;

import org.junit.Test;

public class ExampleThreadTest {

	@Test
	public void test() {
		Thread threadA = this.startThread("threadA");
		Thread threadB = this.startThread("threadB");
		
		this.waitToFinish(threadA);
		this.waitToFinish(threadB);
		
		System.out.println("After executing both threads.");		
	}
	
	private Thread startThread(String threadName) {
		Thread thread = new ExampleThread();	
		thread.setName(threadName);
		System.out.println("Starting thread: " + threadName);
		thread.start();
		return thread;
	}
	
	private void waitToFinish(Thread thread) {
		synchronized (thread) {
			try {				
				String threadName = thread.getName();				
				if(thread.isAlive()) {
					thread.wait();
					System.out.println("Finished waiting for thread: " + threadName);
				} else
					System.out.println("Waiting skipped, since " + threadName + " already finished.");					
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}