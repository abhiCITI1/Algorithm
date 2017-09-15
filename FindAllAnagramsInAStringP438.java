import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
 * 
 */
public class FindAllAnagramsInAStringP438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAllAnagramsInAStringP438 p =new FindAllAnagramsInAStringP438();
		String s = "cbaebabacd", r = "abc";
		System.out.println(p.findAnagrams(s, r));
	}

public List<Integer> findAnagrams(String s, String p) {
	
		if(p.length()>s.length())
			return new ArrayList<>(0);
		
		List<Integer> l = new ArrayList<>();
		
		for(int i=0;i<s.length()-p.length()+1;i++)
		{
			if(isAnagram(s.substring(i, p.length()+i), p))
			{
				l.add(i);
			}
		}
		
		
	
	
		return l;
    }

public boolean isAnagram(String a, String b) {
	if (a == null || b == null || a.length() != b.length()) return false;
    int[] dict = new int[26];
    for (int i = 0; i < a.length(); i++) {
        char ch = a.charAt(i);
        dict[ch-'a']++;
    }
    for (int i = 0; i < b.length(); i++) {
        char ch = b.charAt(i);
        dict[ch-'a']--;
        if (dict[ch-'a'] < 0) return false;
    }
    return true;
}
}
