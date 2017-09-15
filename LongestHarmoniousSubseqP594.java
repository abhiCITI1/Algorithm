import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LongestHarmoniousSubseqP594 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {
				1,3,2,2,5,2,3,7};
		LongestHarmoniousSubseqP594 p = new LongestHarmoniousSubseqP594();
		
		p.findLHS(nums);
	}
	
	public int findLHS(int[] nums) {
		
		HashMap<Long, Integer> hm = new HashMap<>();
		
		for(long num : nums)
		{
			hm.put(num, hm.getOrDefault(num, 0)+1);
		}
		
		int res = 0;
		
		for(long key : hm.keySet())
		{
			int sum = 0;
			if(hm.containsKey(key) && hm.containsKey(key+1))
			{
				sum = hm.get(key) + hm.get(key+1);
			}
			res = Math.max(res, sum);
		}
		return res;
		
	}

}
