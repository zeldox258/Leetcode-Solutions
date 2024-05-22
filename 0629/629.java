
class Solution {
    public int kInversePairs(int n, int k) {
        int MOD = 1_000_000_007;
        int[] dp = new int[k+1];
        dp[0] = 1;
        for (int i = 2; i <= n; i++) {
            int[] ndp = new int[k+1];
            long sum = 0;
            for (int j = 0; j <= k; j++) {
                sum += dp[j];
                if (j >= i) sum -= dp[j-i];
                ndp[j] = (int)(sum % MOD);
            }
            dp = ndp;
        }
        return dp[k];
    }
}
