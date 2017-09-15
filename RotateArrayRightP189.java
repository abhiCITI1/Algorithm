
public class RotateArrayRightP189 {
	
	public static void main(String[] args) {
		RotateArrayRightP189 p = new RotateArrayRightP189();
		int[] nums = {1,2,3,4,5,6,7};
		p.rotate(nums,2);
	}

	public void rotate(int[] nums, int k) {
		
		while(k-->0)
		{
			rotateByOne(nums);
		}
		
	}
	
	public void rotateByOne(int[] nums)
	{
		
		int len = nums.length;
		int temp = nums[len-1];
		
		for(int i=0;i<len-1;i++)
		{
			nums[i+1] = nums[i];
		}
		nums[0] = temp;
		
		
	}

}
