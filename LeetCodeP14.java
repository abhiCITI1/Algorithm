import java.util.ArrayList;
import java.util.HashMap;

public class LeetCodeP14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCodeP14 p14 = new LeetCodeP14();
		
		String[] sArr = {};
		
		System.out.println(p14.longestCommonPrefix(sArr));

	}
	
	public String longestCommonPrefix(String[] strs) {
		
		if(strs.length==0)
		{
			return "";
		}
		String firstELe = strs[0];

		
		for(int i=1;i<strs.length;i++)
		{
			while(strs[i].indexOf(firstELe)!=0)
			{
				firstELe = firstELe.substring(0, firstELe.length()-1);
			}
		}
		
		
		
		return firstELe;
	}

}
