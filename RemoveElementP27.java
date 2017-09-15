import java.util.Stack;

public class RemoveElementP27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElementP27 p27 = new RemoveElementP27();
		System.out.println("New Array :"+ p27.removeElement(new int[] {3,2,2,3},3));
	}
	
	public int removeElement(int[] nums, int val) {
        
		if(nums.length==1)
		{
			if(nums[0]==val)
			{
				nums = new int[] {};
				return nums.length;
			}
			else
			{
				return nums.length;
			}
		}
		if(nums.length==0)
		{
			return 0;
		}
		if(!nums.toString().contains(String.valueOf(val)))
		{
			return nums.length;
		}
		
		else
		{
			int j=0;
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i]!=val)
				{
					nums[j]=nums[i];
					j++;
				}
			}
			return j;
		}
		
        
    }

}
