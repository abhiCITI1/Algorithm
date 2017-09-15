import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LeetCodeP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeetCodeP3 p3 = new LeetCodeP3();
		int subStrLen = p3.lengthOfLongestSubstring("pwwkew");//abcabcbb,pwwkew
		System.out.println("Longest substring length :"+ subStrLen);

	}
	
	 public int lengthOfLongestSubstring(String s) {
	        
		 char[] cArr = s.toCharArray();
	        
	        int min = 0;
	        int maxLength = 0;
	        
	        HashMap<Character,Integer> hMap = new HashMap<Character,Integer>();
	        
	        for(int i=0;i<cArr.length;i++)
	        {
	            if(hMap.containsKey(cArr[i]))
	            {
	                min = Math.max(min,hMap.get(cArr[i])+1);
	                maxLength = Math.max(maxLength,i-min+1);
	                hMap.put(cArr[i],i);
	            }
	            else
	            {
	                hMap.put(cArr[i],i);
	                maxLength = Math.max(maxLength,i-min+1);
	                
	            }
	        }
	        
	        
	        return maxLength;
	        
	    } 
	 
	

}
