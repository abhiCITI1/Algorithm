import java.util.HashMap;

public class LongestPalindromicSubstrinP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestPalindromicSubstrinP5 p5 = new LongestPalindromicSubstrinP5();
		p5.longestPalindrome("aaaababab");//babad

	}
	
	public String longestPalindrome(String s) {
        
		char[] cArr = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0;i<cArr.length;i++)
		{
			sb.append(cArr[i]);
			if(sb.reverse().equals(sb))
			{
				hm.put(sb.toString(), sb.length());
			}
			else
			{
				
			}
		}
		
		return null;
    }

}
