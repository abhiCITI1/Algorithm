import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeyboardRowP500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] s = {"Hello", "Alaska", "Dad", "Peace"};
	}
	 public String[] findWords(String[] words) {
		 
		 String s1 = "qwertyuiop";
		 String s2 = "asdfghjkl";
		 String s3 = "zxcvbnm";
		 
		 String[] s = {"qwertyuiop","asdfghjkl","zxcvbnm"};
		 
		 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		 
		 for(int i =0;i<s.length;i++)
		 {
			 for(char c : s[i].toUpperCase().toCharArray())
			 {
				 hm.put(c, i);
			 }
		 }
		 List<String> res = new ArrayList<String>();
		 
		 for(String str : words)
		 {
			int index = hm.get(str.toUpperCase().charAt(0));
			
			for(char c: str.toUpperCase().toCharArray())
			{
				if(hm.get(c)!=index)
				{
					index=-1;
					break;
				}
			}
			
			if(index!=-1)
			{
				res.add(str);
			}
		 }
		 
		 return res.toArray(new String[0]);
	 }
}
