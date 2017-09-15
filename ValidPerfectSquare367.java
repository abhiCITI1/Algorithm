
public class ValidPerfectSquare367 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidPerfectSquare367 p = new ValidPerfectSquare367();
		p.isPerfectSquare(9);
		

	}
	
	public boolean isPerfectSquare(int num) {
		
		for(int sum=0,i=1;sum<=num;i+=2)
		{
			sum+=i;
			if(sum==num)
			{
				return true;
			}
		}

		
		return false;
	}
}
