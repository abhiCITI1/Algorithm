import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthLargestElementP215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,1,5,6,4};
		KthLargestElementP215 p =new KthLargestElementP215();
		p.findKthLargest(nums, 2);
	}
	
	 public int findKthLargest(int[] nums, int k) {
	        
		List<Integer> list = new ArrayList<>();
		for(int num: nums)
		{
			list.add(num);
		}
		 
		Collections.sort(list);
		
		for(int i=0;i<list.size()-k+1;i++)
		{
			if(i==list.size()-k)
			{
				return list.get(i);
			}
		}
		
		
		
		 return 0;
	}

}
