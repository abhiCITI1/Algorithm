import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInStringP151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsInStringP151  p = new ReverseWordsInStringP151();
		String s = "Let's take LeetCode contest";
		
		
		System.out.println(p.reverseWords(p.reverseString(s)));

	}
	
	public String reverseWords(String s) {
		
		String[] words = s.trim().split(" +");
	    Collections.reverse(Arrays.asList(words));
	    return String.join(" ", words);
		
		/*String reverseStr = reverseString(s);
		
		StringBuffer sb = new StringBuffer();
		
		int start=0,end=0;
		for(int i=0;i<reverseStr.length();i++)
		{
			if(reverseStr.charAt(i)!=' ')
			{
				end++;
				if(end==reverseStr.length()-1)
					sb.append(reverseString(reverseStr.substring(start, end+1)));
			}
				
			if(reverseStr.charAt(i)==' ')
			{
				
				sb.append(reverseString(reverseStr.substring(start, end))+" ");
				start = i+1;
				end = i+1;
			}
			
		}
		*/
		
		
		
		//return new String(sb.toString());
	}
	
	public String reverseString(String s) {
		
		int start=0,end=s.length()-1;
		char[] sArr = s.toCharArray();
		
		for(int i=0;i<=s.length()/2;i++)
		{
			if(start>end)
				break;
			
			char temp = sArr[start];
			sArr[start] = sArr[end];
			sArr[end] = temp;
			start++;
			end--;
		}
		
		return new String(sArr);
	}

}
