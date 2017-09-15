
public class ReverseStringP344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringP344 p = new ReverseStringP344();
		System.out.println(p.reverseString("Let's take LeetCode contest"));
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
