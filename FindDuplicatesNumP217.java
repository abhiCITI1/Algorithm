import java.util.HashMap;

public class FindDuplicatesNumP217 {
	
public boolean containsDuplicate(int[] nums) {
        
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		boolean containDuplicate = false;
		
		for(int i = 0;i<nums.length;i++)
		{
			if(hm.get(nums[i])!=null)
			{
				containDuplicate = true;
				break;
			}
			else
			{
				hm.put(nums[i],true);
			}
		}
		
	
	
	
		return containDuplicate;
    }

}
