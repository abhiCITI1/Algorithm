
public class TwoSumP167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumP167 p =new TwoSumP167();
		int[] a = {2,7,11,15};
		int t = 26;
		p.twoSum(a, t);
	}

	
public int[] twoSum(int[] numbers, int target) {
	
		int[] result = new int[2];
		boolean found = false;
	
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]+numbers[j] == target)
				{
					result[0] = i+1;
					result[1] = j+1;
					found = true;
					break;
				}
			}
			if(found)
				break;
		}
		
        return result;
    }
}
