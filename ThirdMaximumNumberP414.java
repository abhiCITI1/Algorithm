import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdMaximumNumberP414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,2};
		ThirdMaximumNumberP414 p = new ThirdMaximumNumberP414();
		p.thirdMax(nums);

	}
	
	 public int thirdMax(int[] nums) {
		 
		 Arrays.sort(nums);
		 
		 if(nums.length<3)
			 return nums[1];
		 
		 List<Integer> l = new ArrayList<>();
		 
		 for(int i=0;i<nums.length;i++)
		 {
			 l.add(nums[i]);
		 }
		 
		 Collections.reverse(l);
		 
		 int count=0, finalNum = Integer.MAX_VALUE;
		 
		 int i=0;
		 while(i<l.size())
		 {
			 int val = l.get(i);
			 if(val<finalNum)
			 {
				 count++;
				 finalNum=val;
			 }
			 if(count==3)
				 return finalNum;
			 i++;
			 
		 }
		 if(count<3)
			 return l.get(2);
		 
		 return 0;
		 
	 }

}
