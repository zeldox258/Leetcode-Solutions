
class Solution {
    public int numPrimeArrangements(int n) {
        int MOD=1000000007;
        int pc=countPrimes(n);
        long res=1;
        for(int i=1;i<=pc;i++) res=res*i%MOD;
        for(int i=1;i<=n-pc;i++) res=res*i%MOD;
        return (int)res;
    }
    int countPrimes(int n){
        boolean[] sieve=new boolean[n+1];
        Arrays.fill(sieve,true);
        sieve[0]=sieve[1]=false;
        for(int i=2;i*i<=n;i++) if(sieve[i]) for(int j=i*i;j<=n;j+=i) sieve[j]=false;
        int cnt=0; for(boolean b:sieve) if(b) cnt++;
        return cnt;
    }
}
