import java.util.Stack;

public class NextGreaterElementP496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterElementP496 n = new NextGreaterElementP496();
		System.out.println(n.nextGreaterElement(new int[]{4,1,2}, new int[]{1,0,4,2}));
		
	}
	
	 public int[] nextGreaterElement(int[] findNums, int[] nums) {
		 
		 int[] finalArr = new int[findNums.length];
		 
		 Stack<Integer> s = new Stack<Integer>();
		 
		 for(int i=0;i<findNums.length;i++)
		 {
			 for(int j = 0;j<nums.length;j++)
			 {
				 if(findNums[i]==nums[j])
				 {
					 boolean greaterFound = false;
					 
					 if(j==nums.length-1)
					 {
						 greaterFound=false;
					 }
					 
					 for(int k=j+1; k<nums.length;k++)
					 {
						 if(nums[k]>findNums[i])
						 {
							 s.push(nums[k]);
							 greaterFound=true;
							 break;
						 }
					 }
					 if(!greaterFound)
					 {
						 s.push(-1);
					 }
					
				 }
			 }
		 }
		 
		 Stack<Integer> auxStack = new Stack<Integer>();
		 
		 while(!s.isEmpty())
		 {
			 auxStack.push(s.pop());
		 }
		 
		 int k = 0;
		 while(!auxStack.isEmpty())
		 {
			 finalArr[k] = auxStack.pop();
			 k=k+1;
		 }
		 
		 return finalArr;
	        
	    }

}
