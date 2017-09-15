import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SetMismatchP645 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,4};
		SetMismatchP645 p =new SetMismatchP645();
		p.findErrorNums(nums);
	}
	
	
public int[] findErrorNums(int[] nums) {
        
		int n = nums.length;
		List<Integer> numList = new ArrayList<Integer>();
		List<Integer> result =  new ArrayList<Integer>();
		
		HashMap<Integer, Boolean> hm = new HashMap<Integer,Boolean>();
		
		for(int i=1;i<=n;i++)
		{
			numList.add(i);
		}
		for(int j=0;j<nums.length;j++)
		{
			if(!hm.containsKey(nums[j]))
			{
				hm.put(nums[j], false);
			}
			else
			{
				hm.put(nums[j], true);
			}
		}
		int duplicateNum = 0;
		for(int key:hm.keySet())
		{
			if(hm.get(key)==true)
			{
				duplicateNum = key;
				result.add(key);
			}
		}
		int misNum = 0;
		
		
		
		for(int k=0;k<numList.size();k++)
		{
			int num = numList.get(k);
			if(!hm.containsKey(num))
			{
				misNum= num;
				result.add(misNum);
			}
		}
	
		int[] finalArr = new int[result.size()];
		for(int i=0;i<result.size();i++)
		{
			finalArr[i] = result.get(i);
		}
		
	
		return new int[0];
    }

}
