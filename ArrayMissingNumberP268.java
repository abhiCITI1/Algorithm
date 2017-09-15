import java.awt.List;
import java.util.ArrayList;

/*
 * For example,
   Given nums = [0, 1, 3] return 2.
 */


public class ArrayMissingNumberP268 {
	public static void main(String[] args) {
		ArrayMissingNumberP268 p =new ArrayMissingNumberP268();
		int[] nums = {0,1,3};
		p.missingNumber(nums);
	}
	
	public int missingNumber(int[] nums) {

		int lastNum = nums.length;
		int missingNum = 0;
		java.util.List<Integer> li = new ArrayList<Integer>();
		
		
		for(int i=0;i<nums.length;i++)
		{
			li.add(nums[i]);
		}
		
		for(int i=0;i<=lastNum;i++)
		{
			if(!li.contains(i))
				missingNum = i;
				
		}
		
		return missingNum;
	}

}
