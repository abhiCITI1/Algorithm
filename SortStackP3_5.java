import java.util.Stack;

public class SortStackP3_5 {

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
		stk.push(2);
		SortStackP3_5 sortStackP3_5 = new SortStackP3_5();
		System.out.println(sortStackP3_5.sortStack(stk));
	}
	
	public Stack<Integer> sortStack(Stack<Integer> s1)
	{
		Stack<Integer> s2 = new Stack<Integer>();
		
		while(!s1.isEmpty())
		{
			if(s2.isEmpty())
			{
				s2.push(s1.pop());
			}
			else if(s1.peek()>=s2.peek())
			{
				s2.push(s1.pop());
			}
			else
			{
				int temp = s1.pop();
				if(!s2.isEmpty())
				{
					while(temp<s2.peek())
					{
						s1.push(s2.pop());
						if(!s2.isEmpty())
						{
							if(temp<s2.peek())
							{
								continue;
							}
							else
							{
								s2.push(temp);
							}
						}
						else
						{
							s2.push(temp);
							break;
						}
					}
				}
				
			}
		}
		
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		
		
		return s1;
	}

}
