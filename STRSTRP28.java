
public class STRSTRP28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STRSTRP28 p28 = new STRSTRP28();
		System.out.println(p28.strStr("", "a")+"  "+String.valueOf(Integer.MAX_VALUE).length());
				

	}
	
public int strStr(String haystack, String needle) {
        
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        else
            return -1;
        
        
        
        
    }

}
