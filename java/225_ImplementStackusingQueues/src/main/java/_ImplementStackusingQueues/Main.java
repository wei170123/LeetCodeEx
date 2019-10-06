package _ImplementStackusingQueues;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		/*
		 * Queue FIFO Stack FILO
		 */
		int x = 1;
		MyStack obj = new MyStack();
		obj.push(x);
		obj.push(2);
		obj.push(3);
		
	}

	static class MyStack {

		/** Initialize your data structure here. */
	    private int size;
	    private LinkedList<Integer> stack;
	    
		// we define the 'top' as the last element in the list
		// this way, we can pop and push in O(1) time by simply add/removing the last element
		
	    public MyStack() 
	    {
	        stack = new LinkedList<>();
	        size = stack.size();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) 
	    {
	        stack.add(x);
	        size++;
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
		// since top is the last element in list, just remove the last element
	    public int pop() 
	    {
	        int res = stack.remove(size - 1);
	        size--;
	        return res;
	    }
	    
	    /** Get the top element. */
		// return last element
	    public int top() 
	    {
	        return stack.get(size - 1);
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() 
	    {
	        return size == 0;
	    }
	}
}
