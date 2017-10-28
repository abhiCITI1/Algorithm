import java.util.Arrays;

public class LengthOfLIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfLIS p = new LengthOfLIS();
		int[] nums = {10,9,2,5,3,7,101};
		
		p.lengthOfLIS(nums);
	}
	
	public int lengthOfLIS(int[] nums) {            
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }

        return len;
    }

}
