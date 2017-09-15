
public class SQRTP69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int mySqrt(int x) {

		int count = 0; 
		for(int sum=0,i=1;sum<=x;i+=2)
		{
			sum+=i;
			count++;
			if(sum==x)
			{
				return count;
			}
		}  
		
		return count;

	}

}
