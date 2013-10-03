package h2;
import java.lang.Thread;

public class ExampleThread extends Thread {
	
	public synchronized void run() {				
		int a = 0;
		for(int i=0; i<100; i++)
			System.out.println(this.getName() + ": " + i);
		System.out.println(this.getName() + ": After executing for loop, before notify.");
		this.notify();
	}
	
}