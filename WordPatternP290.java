import java.util.HashMap;

public class WordPatternP290 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordPatternP290 p = new WordPatternP290();
		p.wordPattern("abc", "b c a");

	}

	public boolean wordPattern(String pattern, String str) {
        boolean isMatch = false;
        
        HashMap<Character,String> hm = new HashMap<Character,String>();
        char[] cArr = pattern.toCharArray();
        String[] s = str.split(" ");
        
        if(cArr.length==s.length)
        {
            for(int i=0;i<cArr.length;i++)
            {
                if(!hm.containsKey(cArr[i]))
                {
                	if(!hm.containsValue(s[i]))
                	{
                		hm.put(cArr[i],s[i]);
                		isMatch = true;
                	}
                		
                	else
                	{
                		isMatch = false;
                		break;
                	}
                }
                else
                {
                    if(!hm.get(cArr[i]).equalsIgnoreCase(s[i]))
                    {
                        isMatch = false;
                        break;
                    }
                    else
                    {
                        isMatch = true;
                        //continue;
                    }
                        
                }
                
            }
        }
        
        return isMatch;
      }
}
