
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	public static String isPrime(int num)
	{
		if (num < 0) 
		{ return "not valid"; }
		if (num == 0 || num == 1) 
		{ return "not prime"; } 
		if (num == 2 || num == 3) 
		{ return "prime number"; }
		if ((num * num - 1) % 24 == 0)
		{ return "prime"; } 
		else
		{ return "not prime"; }


		
	}
	

}
