import java.util.Stack;

public class MyQueueP3_4 {
	
	private Stack<Integer> stk1 = new Stack<Integer>();
	private Stack<Integer> stk2 = new Stack<Integer>();
	
	
	
	public void enQueue(int data)
	{
		stk1.push(data);
	}
	
	public int deQueue()
	{
		while(!stk1.isEmpty())
		{
			stk2.push(stk1.pop());
		}
		
		int data = stk2.pop();
		
		return data;
	}
	
}
