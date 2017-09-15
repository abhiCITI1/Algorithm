
public class ValidPalindromeP125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindromeP125 p = new ValidPalindromeP125();
		String s = "A man, a plan, a canal: Panama";
		p.isPalindrome(s);

	}
	
public boolean isPalindrome(String s) {
	
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		String reverse = new StringBuffer(actual).reverse().toString();
		
		return actual.equals(reverse);
        
    }

}
