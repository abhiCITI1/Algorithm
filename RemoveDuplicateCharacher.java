import java.util.HashMap;

public class RemoveDuplicateCharacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateCharacher r = new RemoveDuplicateCharacher();
		char[] cArr = {'a','b','b','c','c','f','e'};
		System.out.println(r.removeDuplicateChar(cArr));
		
		
	}
	
	public char[] removeDuplicateChar(char[] cArr)
	{
		
		int n = cArr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;)
			{
				if(cArr[i]==cArr[j])
				{
					cArr[j]=cArr[--n];
				}
				else
					j++;
			}
			
		}
		
		//cArr[n] = '\0';
		
		return cArr;
	}

}
