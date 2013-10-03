package h2;
import java.lang.Thread;

public class ExampleThread extends Thread {
	
	public synchronized void run() {				
		for(int i=0; i<100; i++)
			System.out.println(this.getName() + ": " + i);
		System.out.println("After executingn for loop of " + this.getName() + ".");
		notify();
	}
	
}