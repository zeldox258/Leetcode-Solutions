class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime=new boolean[n];int count=0;
        for(int i=2;i<n;i++){
            if(!notPrime[i]){count++;for(long j=(long)i*i;j<n;j+=i)notPrime[(int)j]=true;}
        }
        return count;
    }
}