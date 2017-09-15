import java.util.HashMap;

public class IsomorphicStringsP205 {

public boolean isIsomorphic(String s, String t) {
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        boolean isIsomorphic = false;
        
        HashMap<Character,Character> hm = new HashMap<Character,Character>();
        
        if(s.length()==0 && t.length()==0)
            return true;
        
        if(s.length()==t.length())
        {
            for(int i=0;i<sArr.length;i++)
            {
                if(!hm.containsKey(sArr[i]))
                {
                    if(!hm.containsValue(tArr[i]))
                    {
                        hm.put(sArr[i],tArr[i]);
                    	isIsomorphic = true;
                	}
                		
                	else
                	{
                		isIsomorphic = false;
                		break;
                	}
                }
                else
                {
                    if(hm.get(sArr[i])!=tArr[i])
                    {
                        isIsomorphic = false;
                        break;
                    }
                    else
                    {
                        isIsomorphic = true;
                        //continue;
                    }
                        
                }
            }
        }
        return isIsomorphic;
        
        
        
    }
}
