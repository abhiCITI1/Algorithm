import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsP345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseVowelsP345 p =new ReverseVowelsP345();
		p.reverseVowels("aA");
	}
	
	public String reverseVowels(String s) {
        
		
		List<Character> l = new ArrayList<Character>();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='A' || 
					s.charAt(i)=='e' || s.charAt(i)=='E' || 
					s.charAt(i)=='i' || s.charAt(i)=='I' ||
					 s.charAt(i)=='o' || s.charAt(i)=='O' ||
					  s.charAt(i)=='u' || s.charAt(i)=='U')
			{
				sb.append(s.charAt(i));
			}
		}
		
		int start=0,end=sb.length()-1;
		
		char[] c = sb.toString().toCharArray();
		for(int j=0;j<sb.length();j++)
		{
			if(start>end)
				break;
			char temp = c[end];
			c[end] = c[start];
			c[start] = temp;
			start++;
			end--;
		}
		
		int index = 0;
		char[] sArr = s.toCharArray();
		
		for(int k=0;k<s.length();k++)
		{
			if(s.charAt(k)=='a' || s.charAt(k)=='A' || 
					s.charAt(k)=='e' || s.charAt(k)=='E' || 
					s.charAt(k)=='i' || s.charAt(k)=='I' ||
					 s.charAt(k)=='o' || s.charAt(k)=='O' ||
					  s.charAt(k)=='u' || s.charAt(k)=='U')
			{
				sArr[k] = c[index];
				index++;
			}
		}
		
		
		return new String(sArr);
        
    
        }

}
