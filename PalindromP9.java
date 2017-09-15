import java.util.Scanner;

public class PalindromP9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromP9 p9 = new PalindromP9();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to check palindrom :");
		int num = s.nextInt();
		
		boolean b = p9.isPalindrome(num);
		System.out.println("Is number palindrom :"+ b);
		
	}
	
	
	public boolean isPalindrome(int x) {
		
		long rev= 0;
		
		int temp = x;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                rev = 0;
        }
        if(x==0)
        {
        	return true;
        }
        
        if(temp == rev && temp>0)
        {
        	return true;
        }
        else
        {
        	return false;
        }
        
    }

}
