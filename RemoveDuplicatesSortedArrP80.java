import java.util.TreeMap;


/*
 * Incomplete
 */

public class RemoveDuplicatesSortedArrP80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesSortedArrP80 p =new RemoveDuplicatesSortedArrP80();
		int[] nums = {1,1,1,2,2,3};
		p.removeDuplicates(nums);

	}

	public int removeDuplicates(int[] nums) {
        
		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		
		int count = 1;
		
		for(int i=0;i<nums.length;i++)
		{
			if(tm.containsKey(nums[i]))
			{
				if(tm.get(nums[i])<=1)
					tm.put(nums[i], tm.get(nums[i])+1);
				else
					continue;
			}
			else
			{
				tm.put(nums[i], count);
			}
		}
		
		
		
		return 0;
		
    }

}
