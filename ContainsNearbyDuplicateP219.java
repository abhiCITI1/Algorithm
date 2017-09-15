import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicateP219 {
	
public boolean containsNearbyDuplicate(int[] nums, int k) {
	
	HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
	for(int i=0;i<nums.length;i++)
	{
		if(hm.containsKey(nums[i]))
		{
			int presentAtIndex = hm.get(nums[i]);
			if(Math.abs(presentAtIndex-i)==k)
			{
				return true;
			}
				
		}
		else
		{
			hm.put(nums[i], i);
		}
	}
	
     
	return false;
	
	
	
	
	/*Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i])) {
            if (i - map.get(nums[i]) <= k) return true;
        }
        map.put(nums[i], i);
    }
    return false;*/
    }

}
