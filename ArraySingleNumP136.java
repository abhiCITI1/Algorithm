import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArraySingleNumP136 {
	
	
	public static void main(String[] args) {
		ArraySingleNumP136 p =new ArraySingleNumP136();
		int[] nums = {-1,-1,-2};
		p.singleNumber(nums);
	}

	public int singleNumber(int[] nums) {
		
		HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
		
		if(nums.length==1)
			return nums[0];
		
		
		for(int i=0;i<nums.length;i++)
		{
			if(!hm.containsKey(nums[i]))
			{
				hm.put(nums[i], true);
			}
			else
			{
				hm.put(nums[i], false);
			}
		}
		
		Set<Entry<Integer,Boolean>>  set= hm.entrySet();
		Iterator<Entry<Integer,Boolean>>  itr = set.iterator();
		
		while(itr.hasNext())
		{
			int keydata = itr.next().getKey();
			boolean keyTwice = hm.get(new Integer(keydata));
			if(keyTwice)
				return keydata;
		}
		
		return 0;
	}

}
