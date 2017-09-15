import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack m = new MinStack();
		/*
		 * ["MinStack","push","push","push","push","pop","getMin","pop","getMin","pop","getMin"]
			[[],[512],[-1024],[-1024],[512],[],[],[],[],[],[]]
		 */
		
		m.push(512);
		m.push(-1024);
		m.push(-1024);
		m.push(512);
		m.pop();
		int d = m.getMin();
		m.pop();
		int d1 = m.getMin();
		m.pop();
		int d2 = m.getMin();
	}
	
	private Stack<Integer> mainStack;
	private Stack<Integer> minStack;
	
	 /** initialize your data structure here. */
    public MinStack() {
        
    	mainStack = new Stack<Integer>();
    	minStack = new Stack<Integer>();
    	
    }
    
    public void push(int x) {
    	mainStack.push(x);
    	if(minStack.isEmpty())
    	{
    		minStack.push(x);
    	}
    	else
    	{
    		if(x<=minStack.peek())
    		{
    			minStack.push(x);
    		}
    	}
        
    }
    
    public void pop() {
    	if(Math.abs(mainStack.peek())==Math.abs(minStack.peek()))
    	{
    		minStack.pop();
    		mainStack.pop();
    	}
    	else
    	{
    		mainStack.pop();
    	}
    	
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }

}
