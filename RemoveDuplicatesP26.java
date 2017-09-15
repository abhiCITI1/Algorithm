/*
 * Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
        return i + 1;
 * */

public class RemoveDuplicatesP26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesP26 p26 = new RemoveDuplicatesP26();
		System.out.println(p26.removeDuplicates(new int[] {1,2,2}));
	}

	public int removeDuplicates(int[] nums) {
		
		if(nums.length==1)
		{
			return 1;
		}
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					/*if(nums[j]==nums[j+1] && nums[j+1]!=nums[j+2])
					{
						nums[j]= nums[j+2];
					
					}*/
					nums[i]=nums[j];
					if(j+1>nums.length-1)
					{
						break;
					}
					else
					{
						if(nums[j]==nums[j+1])
						{
							if(j+2>nums.length-1)
							{
								break;
							}
							nums[j]=nums[j+2];
						}
						else
						{
							nums[j]=nums[j+1];
						}
					}
				}
			}
		}
		int count = 0;
			
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==nums[i+1])
			{
				count =  i+1;
				break;
			}
			else
				count = nums.length;
		}
			return count;
	}
}
