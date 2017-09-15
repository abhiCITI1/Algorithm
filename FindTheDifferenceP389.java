import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindTheDifferenceP389 {
	
	public static void main(String[] args) {
		FindTheDifferenceP389 p =new FindTheDifferenceP389();
		String s = "a";
		String t = "aa";
		p.findTheDifference(s, t);
	}
	public char findTheDifference(String s, String t) {
			
			char c = 0;
			for (int i = 0; i < s.length(); ++i) {
				c ^= s.charAt(i);
			}
			for (int i = 0; i < t.length(); ++i) {
				c ^= t.charAt(i);
			}
			return c;
		
	}
}
