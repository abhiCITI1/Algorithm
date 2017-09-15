import java.util.Arrays;
import java.util.Scanner;

public class TwoSumSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] nums = {2,7,11,15};
		
		int[] nums = {};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int arrlen = sc.nextInt();
		
		nums = new int[arrlen];
		
		
		for(int i=0; i<arrlen;i++)
		{
			System.out.println("\nEnter array index value[" + i + "]");
			int indexVal = sc.nextInt();
			nums[i] = indexVal;
			continue;
		}

		System.out.println("\nEnter sum target: ");
		int target = sc.nextInt();
		
		TwoSumSolution ts = new TwoSumSolution();
		int[] indexArr = ts.twoSum(nums, target);
		System.out.println("The index array for target is : " + Arrays.toString(indexArr));

	}
	
	
	public int[] twoSum(int[] nums, int target) {
        
		int[] indexArr =  {};
		
        for(int i=0; i<nums.length;i++)
        {
            int a1 = nums[i];
            
            
            
            for(int j=0; j<nums.length;j++)
            {
            	
            	if(a1==nums[j] && j!=i)
            	{
            		int targetSum = a1 + nums[j];
            		if(targetSum==target)
            		{
            			indexArr = new int[2];
            			indexArr[0] = i;
            			indexArr[1] = j;
            			break;
            		}
            	}
            	else if(a1!=nums[j])
            	{
            		int targetSum = a1 + nums[j];
            		if(targetSum==target)
            		{
            			indexArr = new int[2];
            			indexArr[0] = i;
            			indexArr[1] = j;
            			break;
            		}
            	}
            	else
            		continue;
            }
            if(indexArr.length!=0)
            	break;
        }
		return indexArr;
        
    }

}


