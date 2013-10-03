package h2_3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class BlockingStackTest {

	private JuhasBlockingStack<String> blockingStack;
	
	@Before
    public void setUp() {
    	int stackSize = 10;
		this.blockingStack = new JuhasBlockingStack<String>(stackSize);	
	}
	
	@Test
	public void testSizeAfterInit() {		
		assertEquals(this.blockingStack.size(), 0);
	}
	
}
