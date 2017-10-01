import java.util.Stack;

public class StackPostfixEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackPostfixEvaluation eval = new StackPostfixEvaluation();
		System.out.println(eval.postFixEval("123*+5-"));
	}
	
	public int postFixEval(String s)
	{
		Stack<Integer> stk = new Stack<Integer>();
		
		int i=0,res=0;
		while(i<s.length())
		{
			int result = 0;
			if(s.charAt(i)=='*')
			{
				int k=1,count =0;
				while(!stk.isEmpty())
				{
					if(count==2)
						break;
					k= k* stk.pop();
					count++;
				}
				stk.push(k);
				
			}
			else if(s.charAt(i)=='/')
			{
				int k=1,count =0;
				while(!stk.isEmpty())
				{
					if(count==2)
						break;
					k= k/stk.pop();
					count++;
				}
				stk.push(k);
			}
			else if(s.charAt(i)=='+')
			{
				int k=0,count =0;
				while(!stk.isEmpty())
				{
					if(count==2)
						break;
					k= k+stk.pop();
					count++;
				}
				stk.push(k);
			}
			else if(s.charAt(i)=='-')
			{
				int k=0,count =0;
				while(!stk.isEmpty())
				{
					if(count==2)
						break;
					k= stk.pop()-k;
					count++;
				}
				stk.push(k);
			}
			else
			{
				stk.push(Integer.parseInt(String.valueOf(s.charAt(i))));
			}
			i++;
		}
		return stk.peek();
	}

}
