import java.util.HashMap;
/*
 * For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.	
 * 
 */
public class ValidAnagramP242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        if(s.length()==0&& t.length()==0)
        	return true;
        
        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
        
        int count = 1;
        
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
        	if(!hm.containsKey(c[i]))
        	{
        		hm.put(c[i], count);
        	}
        	else
        	{
        		hm.put(c[i], hm.get(c[i])+1);
        	}
        }
        char[] tArr = t.toCharArray();
        
        for(int j=0;j<tArr.length;j++)
        {
        	if(hm.containsKey(tArr[j]))
        	{
        		hm.put(tArr[j], hm.get(tArr[j])-1);
        	}
        	else
        		hm.put(tArr[j], count);
        	
        }
        	
        boolean isAnagram = false;
        for(char ch : hm.keySet())
        {
        	if(hm.get(ch)==0)
        		isAnagram = true;
        	else
        	{
        		isAnagram = false;
        		break;
        	}
        }
        
        
        
        return isAnagram;
        
    }

}
