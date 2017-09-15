import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()","(([]){})" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * */
public class ValidParenthesisP20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParenthesisP20 p20 = new ValidParenthesisP20();
		System.out.println("String is valid? :"+p20.isValid("(([]){)"));

	}
	
	public boolean isValid(String s) {
		
		Stack<Character> stk = new Stack<Character>();
		boolean isValid = false;
		
		int i=0;
		while(i<s.length())
		{
			if(s.charAt(i)==')')
			{
				if(!stk.isEmpty() && stk.peek()=='(')
				{
					stk.pop();
					isValid = true;
				}
				else
				{
					isValid = false;
					break;
				}
			}
			else if(s.charAt(i)=='}')
			{
				if(!stk.isEmpty() && stk.peek()=='{')
				{
					stk.pop();
					isValid = true;
				}
				else
				{
					isValid = false;
					break;
				}
			}
			else if(s.charAt(i)==']')
			{
				if(!stk.isEmpty() && stk.peek()=='[')
				{
					stk.pop();
					isValid = true;
				}
				else
				{
					isValid = false;
					break;
				}
			}
			else
			{
				stk.push(s.charAt(i));
			}
			i++;
		}
		if(stk.isEmpty() && isValid==true)
			return isValid;
		else
			return false;
		
	}
}
