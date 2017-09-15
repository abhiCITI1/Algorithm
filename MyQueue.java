import java.util.Stack;

public class MyQueue {

	private Stack<Integer> mainStack;
	private Stack<Integer> auxStack;
	
	/** Initialize your data structure here. */
    public MyQueue() {
    	mainStack = new Stack<Integer>();
    	auxStack = new Stack<Integer>();
    	
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	mainStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	int data = 0;
    	if(auxStack.isEmpty())
    	{
    		while(!mainStack.isEmpty())
        	{
        		auxStack.push(mainStack.pop());
        	}
        	data = auxStack.pop();
    	}
    	else
    	{
    		data = auxStack.pop();
    	}
    	
    	return data;
    }
    
    /** Get the front element. */
    public int peek() {
    	
    	if(auxStack.isEmpty())
    	{
    		while(!mainStack.isEmpty())
        	{
        		auxStack.push(mainStack.pop());
        	}
    	}
    	
        return auxStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (mainStack.isEmpty() && auxStack.isEmpty());
    }

    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
