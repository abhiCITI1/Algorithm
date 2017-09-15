/*
 * using Sieve of Eratosthenes
 */
public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPrimes p =new CountPrimes();
		p.countPrimes(5);
	}
	public int countPrimes(int n) {
	
	int count = 0;
    
    boolean[] prime = new boolean[n+1];
    
    
    if(n==3)
    {
        return 1;
    }
    if(n<=2)
        return 0;
    
    for(int i =0;i<n;i++)
    {
        prime[i] = true;
    }
    
    for(int p=2;p*p<=n;p++)
    {
        if(prime[p]==true)
        {
            //all even numbers are marked false non prime
          for(int j=2*p;j<=n;j+=p)
          {
            prime[j] = false;
          }  
        }
        
    }
    
    for(int i=2;i<n;i++)
    {
        if(prime[i]==true)
            count++;
    }
    
    
    
    
    return count;
    
}

}
