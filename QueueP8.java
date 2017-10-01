import java.util.LinkedList;
import java.util.Stack;

/*
 * Stack - {4,5,-2,-3,11,10,5,6,20}
 * CHeck whether successive pairs are consecutive or not
 */

public class QueueP8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(4);
		stk.push(5);
		stk.push(-2);
		stk.push(-3);
		stk.push(11);
		stk.push(10);
		stk.push(4);
		stk.push(6);
		stk.push(20);
		QueueP8 p8 = new QueueP8();
		System.out.println(p8.checkConsecutive(stk));
	}
	
	public boolean checkConsecutive(Stack<Integer> stk)
	{
		Stack<Integer> auxStack = new Stack<Integer>();
		
		boolean isConsecutive = false;
		
		while(!stk.isEmpty())
		{
			auxStack.push(stk.pop());
		}
		
		while(!auxStack.isEmpty())
		{
			int x = auxStack.pop();
			if(!auxStack.isEmpty())
			{
				int y = auxStack.pop();
				if(Math.abs(x-y)!=1)
				{
					isConsecutive = false;
					break;
				}
				else
				{
					isConsecutive = true;
				}
			}
		}
		
		
		return isConsecutive;
	}
	
	

}
