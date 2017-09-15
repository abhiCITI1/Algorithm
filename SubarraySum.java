import java.util.HashMap;

/*
 * Input:nums = [1,1,1], k = 2
Output: 2
 */

public class SubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-1,1};
		SubarraySum s = new SubarraySum();
		s.subarraySum(nums, 0);
		
		
	}
	
	public int subarraySum(int[] nums, int k) {

		int count = 0;

		int sum = 0;
		
		HashMap<Integer, Integer> preSum = new HashMap<>();
		
		preSum.put(0, 1);

		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
			
			if(preSum.containsKey(sum-k))
			{
				count += preSum.get(sum-k);
			}
			
			preSum.put(sum, preSum.getOrDefault(sum, 0)+1);
		}
		
		return count;
	} 

}
