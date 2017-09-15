
public class LongestPalindromicSubstrP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

    public String longestPalindrome(String s) {
    	
    	
    	int max = 1, n = s.length(), i ,k;
        
        String maxStr = "";
        
        int[][] tab = new int[n][n];
        
        for(i=0;i<=n-1;i++)
        {
            tab[i][i] = 1;
        }
        
        //for substring of length 2
        for(i=1; i<=n-1;i++)
        {
            tab[i][i] = 1;
            
            if(i+1==n)
                break;
            if(s.charAt(i)==s.charAt(i+1))
            {
                tab[i][i+1]=1;
                max = 2;
                maxStr = s.substring(i, i+1);
            }
            else
                 tab[i][i+1]=0;
        }
        
        //for substring of length 3
        for(k=3;k<=n;k++)
        {
            for(i=0;i<n-k+1;i++)
            {
                int j = i+k-1;
                
                if(j>n)
                    break;
                
                if(tab[i+1][j-1]==1 && s.charAt(i)==s.charAt(j))
                {
                    tab[i][j] = 1;
                    max = k;
                    maxStr = s.substring(i, j);
                }
                else
                    tab[i][j] = 0;
            }
            
        }
        return maxStr;
        
       
    	
    	
    }

}
