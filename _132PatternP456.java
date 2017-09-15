import java.util.Stack;


/*
 * Input: [1, 2, 3, 4]

Output: False

Input: [3, 1, 4, 2]

Output: True

Input: [-1, 3, 2, 0]

Output: True

 * 
 * Incomplete
 */


public class _132PatternP456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
public boolean find132pattern(int[] nums) {
        
		Stack<Integer> s = new Stack<>();
		
		for(int i:nums)
		{
			s.push(i);
			if(!s.isEmpty())
			{
				if(i<s.peek())
				{
					s.pop();
					s.push(i);
				}
				if(i>s.peek())
				{
					s.push(i);
				}
				
			}
			
			
		}
		
	
	
		return true;
    }

}
