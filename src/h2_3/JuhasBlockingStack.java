package h2_3;

import java.util.ArrayList;

public class JuhasBlockingStack<T> implements BlockingStack<T>{

	private ArrayList<T> stack;
	private int maxSize;
	
	public JuhasBlockingStack(int stackSize) {
		this.stack = new ArrayList<T>();
		this.maxSize = stackSize;
	}
	
	/**
	 * Add a new object to the top of the stack. If there is no free space, the
	 * call will block until space becomes available.
	 * @param object
	 */
	@Override
	public void push(T object) {
		this.stack.add(object);		
	}

	/**
	 * Remove the topmost object from the stack. If the stack is empty, the
	 * call will block until objects are pushed onto the stack.
	 * @return
	 */
	@Override
	public T pop() {
		return null;
	}

	/**
	 * Return the number of items in the stack: 0 <= size <= capacity
	 * @return
	 */
	@Override
	public int size() {
		return stack.size();
	}

}
