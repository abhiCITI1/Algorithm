
public class CountPalindromicSubstrP647 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPalindromicSubstrP647 p = new CountPalindromicSubstrP647();
		p.countSubstrings("babab");
	}
	
public int countSubstrings(String s) {
	
		int n = s.length();
		
		int count = 0;
		boolean tab[][] = new boolean[n][n];
		
		for(int i=n-1;i>=0;i--)
		{
			for(int j=i;j<=n-1;j++)
			{
				if(s.charAt(i)==s.charAt(j) && (j-i<3 || tab[i+1][j-1]))
				{	
					count++;
					tab[i][j] = true;
				}
			}
		}
        
		
		return count;
    }

}
