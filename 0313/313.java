
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n], idx = new int[primes.length];
        dp[0] = 1;
        for (int i=1;i<n;i++) {
            int min = Integer.MAX_VALUE;
            for (int p : idx) min = Math.min(min, dp[idx[0]]);
            int[] mins = new int[primes.length];
            for (int j=0;j<primes.length;j++) mins[j]=dp[idx[j]]*primes[j];
            min = Integer.MAX_VALUE;
            for (int v : mins) min = Math.min(min, v);
            dp[i] = min;
            for (int j=0;j<primes.length;j++) if (mins[j]==min) idx[j]++;
        }
        return dp[n-1];
    }
}
