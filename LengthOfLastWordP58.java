
public class LengthOfLastWordP58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfLastWordP58 p = new LengthOfLastWordP58();
		p.lengthOfLastWord("Hello World");
	}

	
public int lengthOfLastWord(String s) {
		
		if(s.length()==0 || s==null)
	        return 0;	
		
		if(s.trim().length()==0)
			return 0;
	
		int start=0,end=0;
		
		
		
		for(int i=0;i<s.trim().length();i++)
		{
			if(s.trim().charAt(i)==' ')
			{
				start = i+1;
				end = i+1;
			}
			else
				end++;
		}
        
		String lastW = s.trim().substring(start, end);
		
		return lastW.length();
    }
}
