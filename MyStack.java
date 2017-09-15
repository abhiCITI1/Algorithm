import java.util.LinkedList;
import java.util.Queue;

/*
 * LeetCode P255
 * Stack with queue implementation
 * 
 */


public class MyStack {

	private Queue<Integer> q1;
	private Queue<Integer> q2;
	private int size = 0;
	
	
	/** Initialize your data structure here. */
    public MyStack() {
    	q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	if(q1.isEmpty())
    		q2.offer(x);
    	else 
    		q1.offer(x);
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int i = 0;
    	if(q1.isEmpty())
    	{
    		size = q2.size();
    		while(i<size-1)
    		{
    			q1.offer(q2.poll());
    		}
    		return q2.poll();
    	}
    	else
    	{
    		size = q1.size();
    		while(i<size-1)
    		{
    			q2.offer(q1.poll());
    		}
    		return q1.poll();
    	}
    }
    
    /** Get the top element. */
    public int top() {
    	
    	int i = 0;
    	int topELe = 0;
    	if(q1.isEmpty())
    	{
    		size = q2.size();
    		while(i<size)
    		{
    			if(i==size-1)
    			{
    				topELe = q2.peek();
    				q1.offer(q2.poll());
    			}
    			else
    			{
    				q1.offer(q2.poll());
    			}
    			
    		}
    		return topELe;
    	}
    	else
    	{
    		size = q1.size();
    		while(i<size)
    		{
    			if(i==size-1)
    			{
    				topELe = q1.peek();
    				q2.offer(q1.poll());
    			}
    			else
    			{
    				q2.offer(q1.poll());
    			}
    			
    		}
    		return topELe;
    	}
    	
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return (q1.isEmpty() && q2.isEmpty());
    }

    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
