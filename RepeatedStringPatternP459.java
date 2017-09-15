/*
 * Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.

Input: "aba"

Output: False

Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
public class RepeatedStringPatternP459 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean repeatedSubstringPattern(String s) {
		
		StringBuffer pattern = new StringBuffer("");
		
		for(int i=0;i<s.length();i++)
		{
			pattern.append(s.charAt(i));
		}
		
		
		
		return false;
	}
	

}
