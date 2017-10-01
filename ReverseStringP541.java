
public class ReverseStringP541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefg";
		ReverseStringP541 p = new ReverseStringP541();
		p.reverseStr(s,3);

	}
	
public String reverseStr(String s, int k) {
        
		int n = s.length();
		
        if(n<k)
        {
            return reverse(s,0,s.length());
        }
        else
        {
            //int j = 2k;
            int i = 0;
            while(i<n)
            {
            	if(n-i<k)
                {
                	s = reverse(s,i,n-i);
                }
                else
                {
                	s= reverse(s, i, s.substring(i, i+k).length());
                }
                //s= reverse(s, i, s.substring(i, k).length());
                i+=k+k;
            }
            
            
        }
		return s;
        
        
        
    }
    public String reverse(String s, int i, int k)
    {
        int start = i,end=i+k-1;
        char[] sArr = s.toCharArray();
        
        for(int j=0;j<=k/2;j++)
        {
            if(start>=end)
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
