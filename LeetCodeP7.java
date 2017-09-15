import java.util.Scanner;

public class LeetCodeP7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-2,147,483,648 to 2,147,483,647 , -1000000003
		LeetCodeP7 p7 = new LeetCodeP7();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value to reverse..");
		int input = sc.nextInt();
		int result = p7.reverse(input);
		System.out.println("result : "+result);
	}
	
	
	public int reverse(int x) {
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		String intStr = "";
		char[] cArr = {};
		
		if(x>0)
		{
			intStr = String.valueOf(x);
			cArr = intStr.toCharArray();
		}
		else if(x<0)
		{
			intStr = String.valueOf(x).substring(1);
			cArr = intStr.toCharArray();
		}
		else
		{
			return 0;
		}
		String reverseStr = "";
		
		if(x <= max && x >= min)
		{
			int minRange = 0;
			int maxRange = cArr.length-1;
			int indexTracker = 0;
			for(int k=0; k<cArr.length; k++)
			{
				if(k>0)
				{
					minRange = indexTracker;
					maxRange = cArr.length - indexTracker -1;
				}
				if(minRange<maxRange)
				{
					int temp;
					temp = cArr[minRange];
					cArr[minRange] = cArr[maxRange];
					cArr[maxRange] = (char) temp;
				}
				else
				{
					break;
				}
				
				indexTracker+=1;
			}
			if(x<0)
			{
				reverseStr = "-"+String.valueOf(cArr);
			}
			else
			{
				reverseStr = String.valueOf(cArr);
			}
		}
		
		if(Long.parseLong(reverseStr)>max || Long.parseLong(reverseStr)<min)
		{
			return 0;
		}
		else
		{
			return Integer.parseInt(reverseStr);
		}
    }
}
